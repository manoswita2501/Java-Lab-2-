public class StringMethods {

    public static void main(String[] args)
    {
        // Given text
        String text = "''We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative.'' The alternative mentioned here is the Tata Nano, which soon after came as the world’s cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";

        // String charAt() - returns a char value at the given index number
        char firstChar = text.charAt(0);
        System.out.println("charAt(0): " + firstChar);

        // String compareTo() - compares the given string with the current string lexicographically and returns a positive number, negative number, or 0
        String anotherText = "Hello, World!";
        int compareToResult = text.compareTo(anotherText);
        System.out.println("compareTo(anotherText): " + compareToResult);

        // String concat() -  combines specified string at the end of a string and returns a combined string
        String concatenatedText = text.concat("\n- Manoswita Bose");
        System.out.println("concat(\"- Manoswita Bose\"): " + concatenatedText);

        // String contains() - searches the sequence of characters in the string and returns true if the sequence of char values is found in the string, otherwise returns false
        boolean containsResult = text.contains("thriving");
        System.out.println("contains(\"thriving\"): " + containsResult);

        // String endsWith() - checks if the string ends with a given suffix and returns true if the string ends with the given suffix, else returns false
        boolean endsWithResult = text.endsWith("suffering.");
        System.out.println("endsWith(\"suffering.\"): " + endsWithResult);

        // String equals() - compares the two given strings based on the content of the string and returns false if any character is not matched, else returns true
        boolean equalsResult = text.equals(anotherText);
        System.out.println("equals(anotherText): " + equalsResult);

        // String equalsIgnoreCase() - compares two strings on the basis of the content of the string irrespective of the case (lower and upper) of the string
        boolean equalsIgnoreCaseResult = text.equalsIgnoreCase("we realizes that while our workers were thriving, the surrounding villages were still suffering.");
        System.out.println("equalsIgnoreCase(\"we realizes that while our workers were thriving, the surrounding villages were still suffering.\"): " + equalsIgnoreCaseResult);

        // String format() - returns the formatted string by given locale, format and arguments
        String formattedText = String.format("Formatted Text: %s, Length: %d", text, text.length());
        System.out.println("format(): " + formattedText);

        // String getBytes() - does the encoding of string into the sequence of bytes and keeps it in an array of bytes
        byte[] bytes = text.getBytes();
        System.out.println("getBytes(): " + new String(bytes));

        // String getChars() - copies the content of this string into a specified char array
        char[] charArray = new char[10];
        text.getChars(0, 10, charArray, 0);
        System.out.println("getChars(0, 10, charArray, 0): " + new String(charArray));

        // String indexOf() - returns the position of the first occurrence of the specified character or string in a specified string
        int indexOfResult = text.indexOf("workers");
        System.out.println("indexOf(\"workers\"): " + indexOfResult);

        // String intern() - returns the interned string, i.e., the canonical representation of string
        String internedString = text.intern();
        System.out.println("intern(): " + internedString);

        // String isEmpty() - checks if the input string is empty or not
        boolean isEmptyResult = text.isEmpty();
        System.out.println("isEmpty(): " + isEmptyResult);

        // String join() - returns a string joined with a given delimiter
        String joinedString = String.join(" - ", "Java", "String", "Methods");
        System.out.println("join(): " + joinedString);

        // String lastIndexOf() - returns the last index of the given character value or substring
        int lastIndexOfResult = text.lastIndexOf("were");
        System.out.println("lastIndexOf(\"were\"): " + lastIndexOfResult);

        // String length() - finds the length of a string
        int length = text.length();
        System.out.println("length(): " + length);

        // String replace() - returns a string replacing all the old char or CharSequence to new char or CharSequence
        String replacedText = text.replace("thriving", "prospering");
        System.out.println("replace(\"thriving\", \"prospering\"): " + replacedText);

        // String replaceAll() - returns a string replacing all the sequence of characters matching regex and replacement string
        String replacedAllText = text.replaceAll("\\b(\\w+)\\b", "[$1]");
        System.out.println("replaceAll(\"\\b(\\w+)\\b\", \"[$1]\"): " + replacedAllText);

        // String split() - splits this string against given regular expression and returns a char array
        String[] parts = text.split(" ");
        System.out.println("Splitting the text into parts:");
        for (String part : parts)
        {
            System.out.println(part);
        }

        // String startsWith() - checks if the string starts with the given prefix
        boolean startsWithResult = text.startsWith("We");
        System.out.println("startsWith(\"We\"): " + startsWithResult);

        // String substring() - returns a part of the string
        String substringResult = text.substring(20, 35);
        System.out.println("substring(20, 35): " + substringResult);

        // String toCharArray() - converts a string into character array
        char[] charArrayResult = text.toCharArray();
        System.out.println("toCharArray(): " + new String(charArrayResult));

        // String toLowerCase() - returns the string in lowercase letter
        String lowerCaseText = text.toLowerCase();
        System.out.println("toLowerCase(): " + lowerCaseText);

        // String toUpperCase() - returns the string in uppercase letter
        String upperCaseText = text.toUpperCase();
        System.out.println("toUpperCase(): " + upperCaseText);

        // String trim() - eliminates leading and trailing spaces
        String trimmedText = "   Trimmed Text   ".trim();
        System.out.println("trim(): " + trimmedText);

        // String valueOf() - converts different types of values into string
        String valueOfString = String.valueOf(12345);
        System.out.println("valueOf(12345): " + valueOfString);
    }
}
