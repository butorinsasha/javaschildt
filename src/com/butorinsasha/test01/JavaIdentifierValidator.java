package com.butorinsasha.test01;

import java.util.Arrays;
import java.util.List;

public class JavaIdentifierValidator {

    static final String[] keywords = { "abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "interface", "long", "native",
            "new", "null", "package", "private", "protected", "public",
            "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while" };

    static final String canStartWithDigit = "^[0-9]";

    public static void main(String[] args) {

        List<String> keywordsList = Arrays.asList(keywords);

        for (String a : args) {
            if ( (!keywordsList.contains(a)) && (!a.matches(canStartWithDigit)) ) {
                System.out.print(a + " ");
            }
        }
        System.out.println();
    }
}
