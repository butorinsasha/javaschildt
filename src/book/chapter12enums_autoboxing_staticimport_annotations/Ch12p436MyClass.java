package book.chapter12enums_autoboxing_staticimport_annotations;

import book.Ch12p436SuperMyClass;

@Deprecated
class Ch12p436MyClass extends Ch12p436SuperMyClass {

    private String msg;

    Ch12p436MyClass(String m) {
        msg = m;
    }

    @Deprecated
    String getMsg() {
        return msg;
    }

    @Override
    public int superMethod(int x) {
        return 4 - x;
    }

}
