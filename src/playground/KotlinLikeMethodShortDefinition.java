package playground;

public class KotlinLikeMethodShortDefinition {
    private String name;
    private boolean isMan;
    private int age;
    private int height;

    // cant do like this
//    static defaultWeight(boolean isM, int h) = isM ? h - 100 : h - 110;

    // only this way
    static int defaultWeight(boolean isM, int h) {
        int result = isM ? h - 100 : h - 110;
        return result;
    }
}
