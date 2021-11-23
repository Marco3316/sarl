define([], function() {
	var keywords = "AFTER|BEFORE|ELSE|ELSEIF|ENDFOR|ENDIF|FOR|IF|SEPARATOR|abstract|agent|annotation|artifact|as|assert|assume|behavior|break|capacity|case|catch|class|continue|create|def|default|dispatch|do|else|enum|event|extends|extension|false|final|finally|fires|for|if|implements|import|instanceof|interface|native|new|null|on|override|package|private|protected|public|requires|return|skill|space|static|strictfp|super|switch|synchronized|throw|throws|transient|true|try|typeof|uses|val|var|volatile|while|with";
	return {
		id: "xtext.sarl",
		contentTypes: ["xtext/sarl"],
		patterns: [
			{include: "orion.c-like#comment_singleLine"},
			{include: "orion.c-like#comment_block"},
			{include: "orion.lib#string_doubleQuote"},
			{include: "orion.lib#string_singleQuote"},
			{include: "orion.lib#number_decimal"},
			{include: "orion.lib#number_hex"},
			{include: "orion.lib#brace_open"},
			{include: "orion.lib#brace_close"},
			{include: "orion.lib#bracket_open"},
			{include: "orion.lib#bracket_close"},
			{include: "orion.lib#parenthesis_open"},
			{include: "orion.lib#parenthesis_close"},
			{name: "keyword.sarl", match: "\\b(?:" + keywords + ")\\b"}
		]
	};
});
