public class StringSplosionTask {
    public String stringSplosion(String str) {
        String splosionString;
        String result = "";
        // append substrings to result as long as i < str.length
        for (int i = 0; i < str.length(); i++) {
            // get a substring from user's input string starting from first character to i + 1
            splosionString = str.substring(0, i + 1);
            // append the substring to a string that will serve as the result
            result = result.concat(splosionString);
        }
        return result;
    }
}

