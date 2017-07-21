package com.lrs;

/**
 * Hello world.
 */
public final class App {

    /**
     * 私有构造器.
     */
    private App() {
    }

    /**
     * 获取实例.
     *
     * @return
     *      app
     */
    public static App getInstance() {
        return new App();
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * 覆盖率测试方法.
     *
     * @param arg 状态参数
     */
    public void coverageTestMethod(final String arg) {
        System.out.println("Welcome to Java's World!");
        if ("ok".equals(arg)) {
            System.out.println("ok!");
        } else {
            System.out.println("arg is not ok!");
        }
    }
}
