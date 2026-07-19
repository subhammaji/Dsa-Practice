class Solution {
    public String reverseWords(String str) {
        
        /*if(str.isEmpty())  return "";
        
        if(str.indexOf(".") < 0) {
            return str;
        }
        
        str = str.replaceAll("^\\.+|\\.+$", "").replaceAll("\\.+", ".");
        
        String subham = "";
        int index = str.length();
        
        int lastIndexOfDot = str.lastIndexOf(".");

        subham += str.substring(lastIndexOfDot+1, index);
        index = lastIndexOfDot;
        
        for(int i= lastIndexOfDot-1; i>=0; i--) {
            if(str.charAt(i) == '.') {
                subham += str.substring(i, index);
                index = i;
            }
        }
        subham += "." + str.substring(0, str.indexOf("."));
        String res = subham.replaceAll("\\.+$", "");
        return res;*/
        
        String[] words = str.split("\\.+", -1);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(words[i]);
            }
        }
        
        return sb.toString();
    }
}
