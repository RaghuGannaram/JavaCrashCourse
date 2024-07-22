package primitives;

import java.util.Locale;

public class StringCheatSheet {
    public static void main(String[] args) {
        String str1 = "A quick brown fox jumps over the lazy dog";
        System.out.println("str1: " + str1);

        // Manipulation Methods

        /*
         * toUpperCase
         * signature:
         * -- toUpperCase()
         * return:
         * -- a new string that is all upper case
         */
        System.out.println("\nstr1.toUpperCase(): " + str1.toUpperCase());

        /*
         * toLowerCase
         * signature:
         * -- toLowerCase()
         * return:
         * -- a new string that is all lower case
         */
        System.out.println("\nstr1.toLowerCase(): " + str1.toLowerCase());

        /*
         * trim
         * signature:
         * -- trim()
         * return:
         * -- a new string with leading and trailing whitespace removed
         */
        String str2 = "   Hello World!   ";
        System.out.println("\nstr2.trim(): '" + str2.trim() + "'");

        /*
         * substring
         * signature:
         * -- substring(int beginIndex)
         * -- substring(int beginIndex, int endIndex)
         * -- beginIndex: inclusive
         * -- endIndex: exclusive
         * return:
         * -- a new string that is a substring of this string
         * throw:
         * -- IndexOutOfBoundsException if the beginIndex is negative, or endIndex is
         * larger than the length of this String object, or beginIndex is larger than
         * endIndex
         */
        System.out.println("\nstr1.substring(2): " + str1.substring(2));
        System.out.println("str1.substring(2, 6): " + str1.substring(2, 6));

        /*
         * subSequence
         * signature:
         * -- subSequence(int beginIndex, int endIndex)
         * -- beginIndex: inclusive
         * -- endIndex: exclusive
         * return:
         * -- a new character sequence that is a subsequence of this sequence
         * throw:
         * -- IndexOutOfBoundsException if the beginIndex is negative, or endIndex is
         * larger than the length of this sequence, or beginIndex is larger than
         * endIndex
         */
        System.out.println("\nstr1.subSequence(2, 6): " + str1.subSequence(2, 6));

        /*
         * concat
         * signature:
         * -- concat(String str)
         * return:
         * -- a new string that is a concatenation of this string and the specified
         * string
         */
        String str3 = "Hello";
        String str4 = "World";
        System.out.println("\nstr3.concat(str4): " + str3.concat(str4));

        /*
         * replace
         * signature:
         * -- replace(char oldChar, char newChar)
         * return:
         * -- a new string resulting from replacing all occurrences of oldChar in this
         * string with newChar
         */
        System.out.println("\nstr1.replace('o', 'a'): " + str1.replace('o', 'a'));

        /*
         * replaceFirst
         * signature:
         * -- replaceFirst(String regex, String replacement)
         * return:
         * -- a new string resulting from replacing the first substring of this string
         * that matches the given regular expression with the given replacement
         */
        System.out.println("\nstr1.replaceFirst('quick', 'slow'): " + str1.replaceFirst("quick", "slow"));

        /*
         * replaceAll
         * signature:
         * -- replaceAll(String regex, String replacement)
         * return:
         * -- a new string resulting from replacing each substring of this string that
         * matches the given regular expression with the given replacement
         */
        System.out.println("\nstr1.replaceAll('o', 'a'): " + str1.replaceAll("o", "a"));

        // Searching Methods

        /*
         * indexOf
         * signature:
         * -- indexOf(int ch)
         * -- indexOf(int ch, int fromIndex)
         * -- indexOf(String str)
         * -- indexOf(String str, int fromIndex)
         * return:
         * -- the index within this string of the first occurrence of the specified
         * character or substring, or -1 if the character does not occur
         */
        System.out.println("\nstr1.indexOf('q'): " + str1.indexOf('q'));
        System.out.println("str1.indexOf('q', 5): " + str1.indexOf('q', 5));
        System.out.println("str1.indexOf('quick'): " + str1.indexOf("quick"));
        System.out.println("str1.indexOf('quick', 5): " + str1.indexOf("quick", 5));

        /*
         * lastIndexOf
         * signature:
         * -- lastIndexOf(int ch)
         * -- lastIndexOf(int ch, int fromIndex)
         * -- lastIndexOf(String str)
         * -- lastIndexOf(String str, int fromIndex)
         * return:
         * -- the index within this string of the last occurrence of the specified
         * character or substring, or -1 if the character does not occur
         */
        System.out.println("\nstr1.lastIndexOf('o'): " + str1.lastIndexOf('o'));
        System.out.println("str1.lastIndexOf('o', 25): " + str1.lastIndexOf('o', 25));
        System.out.println("str1.lastIndexOf('the'): " + str1.lastIndexOf("the"));
        System.out.println("str1.lastIndexOf('the', 25): " + str1.lastIndexOf("the", 25));

        /*
         * contains
         * signature:
         * -- contains(CharSequence s)
         * return:
         * -- true if this string contains the specified sequence of char values
         */
        System.out.println("\nstr1.contains('quick'): " + str1.contains("quick"));

        /*
         * startsWith
         * signature:
         * -- startsWith(String prefix)
         * -- startsWith(String prefix, int toffset)
         * return:
         * -- true if the character sequence represented by the argument is a prefix of
         * the character sequence represented by this string
         */
        System.out.println("\nstr1.startsWith('A quick'): " + str1.startsWith("A quick"));
        System.out.println("str1.startsWith('quick', 2): " + str1.startsWith("quick", 2));

        /*
         * endsWith
         * signature:
         * -- endsWith(String suffix)
         * return:
         * -- true if the character sequence represented by the argument is a suffix of
         * the character sequence represented by this string
         */
        System.out.println("\nstr1.endsWith('dog'): " + str1.endsWith("dog"));

        /*
         * matches
         * signature:
         * -- matches(String regex)
         * return:
         * -- true if this string matches the given regular expression
         */
        System.out.println("\nstr1.matches('.*quick.*'): " + str1.matches(".*quick.*"));

        /*
         * equals
         * signature:
         * -- equals(Object anObject)
         * return:
         * -- true if this string is equal to the specified object
         */
        System.out.println("\nstr1.equals('A quick brown fox jumps over the lazy dog'): "
                + str1.equals("A quick brown fox jumps over the lazy dog"));

        /*
         * equalsIgnoreCase
         * signature:
         * -- equalsIgnoreCase(String anotherString)
         * return:
         * -- true if this string is equal to the specified string, ignoring case
         * considerations
         */
        System.out.println("\nstr1.equalsIgnoreCase('a quick brown fox jumps over the lazy dog'): "
                + str1.equalsIgnoreCase("a quick brown fox jumps over the lazy dog"));

        /*
         * compareTo
         * signature:
         * -- compareTo(String anotherString)
         * return:
         * -- a negative integer, zero, or a positive integer as this string is less
         * than, equal to, or greater than the specified string
         */
        System.out.println("\nstr1.compareTo('A quick brown fox jumps over the lazy dog'): "
                + str1.compareTo("A quick brown fox jumps over the lazy dog"));
        System.out.println("str1.compareTo('B quick brown fox jumps over the lazy dog'): "
                + str1.compareTo("B quick brown fox jumps over the lazy dog"));

        /*
         * compareToIgnoreCase
         * signature:
         * -- compareToIgnoreCase(String str)
         * return:
         * -- a negative integer, zero, or a positive integer as this string is less
         * than, equal to, or greater than the specified string, ignoring case
         * considerations
         */
        System.out.println("\nstr1.compareToIgnoreCase('a quick brown fox jumps over the lazy dog'): "
                + str1.compareToIgnoreCase("a quick brown fox jumps over the lazy dog"));
        System.out.println("str1.compareToIgnoreCase('b quick brown fox jumps over the lazy dog'): "
                + str1.compareToIgnoreCase("b quick brown fox jumps over the lazy dog"));

        /*
         * regionMatches
         * signature:
         * -- regionMatches(int toffset, String other, int ooffset, int len)
         * -- regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,
         * int len)
         * return:
         * -- true if the specified subregion of this string matches the specified
         * subregion of the string argument
         */
        System.out.println("\nstr1.regionMatches(2, 'quick', 0, 3): " + str1.regionMatches(2, "quick", 0, 3));
        System.out.println("str1.regionMatches(true, 2, 'QUICK', 0, 3): " + str1.regionMatches(true, 2, "QUICK", 0, 3));

        // Other Methods

        /*
         * hashCode
         * signature:
         * -- hashCode()
         * return:
         * -- a hash code for this string
         */
        System.out.println("\nstr1.hashCode(): " + str1.hashCode());

        /*
         * format
         * signature:
         * -- format(String format, Object... args)
         * -- format(Locale l, String format, Object... args)
         * return:
         * -- a formatted string using the specified format string and arguments
         */
        System.out.println("\nString.format('Hello, %s!', 'World'): " + String.format("Hello, %s!", "World"));
        System.out.println("String.format(Locale.US, 'Amount: $%,.2f', 12345.678): "
                + String.format(Locale.US, "Amount: $%,.2f", 12345.678));

        /*
         * valueOf
         * signature:
         * -- valueOf(boolean b)
         * -- valueOf(char c)
         * -- valueOf(char[] data)
         * -- valueOf(char[] data, int offset, int count)
         * -- valueOf(double d)
         * -- valueOf(float f)
         * -- valueOf(int i)
         * -- valueOf(long l)
         * -- valueOf(Object obj)
         * return:
         * -- a string representation of the argument
         */
        System.out.println("\nString.valueOf(true): " + String.valueOf(true));
        System.out.println("String.valueOf('a'): " + String.valueOf('a'));
        System.out.println("String.valueOf(new char[] {'a', 'b', 'c'}): " + String.valueOf(new char[] { 'a', 'b', 'c' }));
        System.out.println("String.valueOf(123.45): " + String.valueOf(123.45));
        System.out.println("String.valueOf(123.45f): " + String.valueOf(123.45f));
        System.out.println("String.valueOf(123): " + String.valueOf(123));
        System.out.println("String.valueOf(123L): " + String.valueOf(123L));
        System.out.println("String.valueOf(new Object()): " + String.valueOf(new Object()));

        /*
         * join
         * signature:
         * -- join(CharSequence delimiter, CharSequence... elements)
         * -- join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
         * return:
         * -- a new string composed of copies of the CharSequence elements joined
         * together with a copy of the specified delimiter
         */
        System.out.println("\nString.join('-', 'a', 'b', 'c'): " + String.join("-", "a", "b", "c"));
    }
}
