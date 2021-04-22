package com.dogsong.architecture.basic_di.bean.b_scope;

/**
 * @author domisong.
 * @description: TODO
 * @date 2021/4/20.
 */
public class ScopeReviewDemo {

    // 类级别成员
    private static String classVariable = "";

    // 对象级别成员
    private String objectVariable = "";

    public static void main(String[] args) throws Exception {
        // 方法级别成员
        String methodVariable = "";
        for (int i = 0; i < args.length; i++) {
            // 循环体局部成员
            String partVariable = args[i];

            // 此处能访问哪些变量？
            // 类级别成员 classVariable
            // 方法级别成员 methodVariable
            // 循环体局部成员 partVariable
        }

        // 此处能访问哪些变量？
        // 类级别成员 classVariable
        // 方法级别成员 methodVariable
    }

    public void test() {
        // 此处能访问哪些变量？
        // 类级别成员 classVariable
        // 对象级别成员 objectVariable
    }

    public static void staticTest() {
        // 此处能访问哪些变量？
        // 类级别成员 classVariable

    }
}
