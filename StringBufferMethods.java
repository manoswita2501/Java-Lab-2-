public class StringBufferMethods 
{

    public static void main(String[] args)
    {

        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello, everyone!");

        // append() - concatenates the new argument with the given string
        stringBuffer.append(" This is Manoswita.");
        System.out.println("append(): " + stringBuffer);

        // insert() - inserts the new string in the given string at the specified position
        stringBuffer.insert(7, "Welcome ");
        System.out.println("insert(7, \"Java \"): " + stringBuffer);

        // replace() - replaces the given string from the specified beginIndex and endIndex
        stringBuffer.replace(0, 6, "Hi,");
        System.out.println("replace(0, 6, \"Hi\"): " + stringBuffer);

        // delete() - reverses the current string
        stringBuffer.delete(3, 6);
        System.out.println("delete(3, 6): " + stringBuffer);

        // charAt() - returns the character at the specified position
        char charAtIndex = stringBuffer.charAt(10);
        System.out.println("charAt(10): " + charAtIndex);

        // setCharAt() - 
        stringBuffer.setCharAt(5, 'X');
        System.out.println("setCharAt(2, 'X'): " + stringBuffer);

        // length() - 
        int length = stringBuffer.length();
        System.out.println("length(): " + length);

        // capacity() - returns the current capacity of the buffer
        int capacity = stringBuffer.capacity();
        System.out.println("capacity(): " + capacity);

        // ensureCapacity() - ensures that the given capacity is the minimum to the current capacity
        stringBuffer.ensureCapacity(30);
        System.out.println("ensureCapacity(30)");

        // toString() - returns the String representation of an object
        String stringRepresentation = stringBuffer.toString();
        System.out.println("toString(): " + stringRepresentation);

        // substring(int start) - returns the substring from the specified beginIndex
        String substringStart = stringBuffer.substring(19);
        System.out.println("substring(3): " + substringStart);

        // substring(int start, int end) - returns the substring from the specified beginIndex and endIndex
        String substringStartEnd = stringBuffer.substring(3, 7);
        System.out.println("substring(2, 7): " + substringStartEnd);
    }
}
