<%@attribute name="input" required="true" %>
<%!
    private String encodeHtmlTag(String tag){
        if (tag == null){
            return null;
        }
        StringBuilder encodingTag = new StringBuilder(tag.length()*2);
        for (int i = 0; i < tag.length(); i++) {
            char c = tag.charAt(i);
            if (c == '<'){
                encodingTag.append("&lt");
            }else if (c == '>'){
                encodingTag.append("&gt");
            }else {
                encodingTag.append(c);
            }
        }
        return encodingTag.toString();
    }

%>
<%=encodeHtmlTag(input)%>