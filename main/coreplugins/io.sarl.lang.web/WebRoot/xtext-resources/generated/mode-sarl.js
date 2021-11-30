define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "AFTER|BEFORE|ELSE|ELSEIF|ENDFOR|ENDIF|FOR|IF|SEPARATOR|abstract|agent|annotation|artifact|as|assert|assume|behavior|break|capacity|case|catch|class|continue|create|def|default|dispatch|do|else|enum|event|extends|extension|false|final|finally|fires|for|if|implements|import|instanceof|interface|native|new|null|on|override|package|private|protected|public|requires|return|skill|space|static|strictfp|super|switch|synchronized|throw|throws|transient|true|try|typeof|uses|val|var|volatile|while|with";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "constant.numeric", regex: "0[xX][0-9a-fA-F]+\\b"},
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/sarl";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
