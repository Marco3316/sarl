// Use command "node .\api.js" to launch this API.
// CTRL+C or any other way to close the command line application closes this API.

const http = require('http');
const https = require("https")
const connection = require('./connection');

const server = http.createServer((request, response) => {

    const urlTemp = request.url.split('?');
    const url = urlTemp[0];

    if (request.method === 'POST') {

        if(url === '/compiler/compile' || url ==='/compiler/compile/') {
		let data = []
		var result = ""

            request
                .on('data', d => {
                	data.push(d)
                })
                .on('end', async () => {

                    data = Buffer.concat(data).toString()
				
					var options = {
					  host: "localhost",
					  port: 8082,
					  path: '/compiler/compile/',
					  method: 'POST',
					  headers: {
					  	'Content-Type': 'application/json',
					    'Content-Length': data.length
					  }
					};
					
					await http.request(options, function(res) {
					  console.log('STATUS: ' + res.statusCode)
					  console.log('HEADERS: ' + JSON.stringify(res.headers))
					  
					  res.on('data', d => {
					    result += d
					    
					  })
					  res.on('end', function () {
					    response.statusCode = 200;
	                    response.setHeader('Access-Control-Allow-Origin','*');
	                    response.setHeader('Access-Control-Allow-Methods','POST');
	                    response.setHeader('Access-Control-Allow-Headers','X-Requested-With, Access-Control-Allow-Origin, Accept');
	                    response.write(result);
	                    response.end();
					  });					  
					}).end(data);

                })
        }
    }

server.listen(connection.port, connection.host)
console.log(`Listening at http://${connection.host}:${connection.port}`)