package book.chapter14lambda_expressions_and_method_references;

public class Ch14p491LambdaArgumentDemo {

    static String changeStr(Ch14p491StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // 1. Lambda to reverse the string
        Ch14p491StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };


        outStr = changeStr(reverse, inStr);
        System.out.println("The string reversed: " + outStr);

        // 2. Lambda to replace all spaces to hyphens embedded directly
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced by hyphens :" + outStr);

        // 3. Lambda block to invert letters case embedded directly
        outStr = changeStr((str) -> {
                                       String result = "";
                                       char ch;

                                       for (int i = 0; i < str.length(); i++) {
                                           ch = str.charAt(i);
                                           if (Character.isUpperCase(ch))
                                               result += Character.toLowerCase(ch);
                                           else
                                               result += Character.toUpperCase(ch);
                                       }
                                       return result;
                                    }, inStr);
        System.out.println("The string in reversed case: " + outStr);
    }
}
