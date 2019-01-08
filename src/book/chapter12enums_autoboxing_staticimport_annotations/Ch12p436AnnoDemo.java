package book.chapter12enums_autoboxing_staticimport_annotations;

import book.Ch12p436SuperMyClass;

public class Ch12p436AnnoDemo {
    public static void main(String[] args) {
        Ch12p436MyClass myObj = new Ch12p436MyClass("test");
        System.out.println(myObj.getMsg());

        System.out.println(myObj.superMethod(2));

        Ch12p436SuperMyClass mySuperObj = new Ch12p436SuperMyClass();
        System.out.println(mySuperObj.superMethod(2));
    }
}
