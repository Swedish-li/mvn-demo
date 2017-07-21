package com.lrs;

/**
 * Hello world!
 */
public final class App {

    private App() {
    }

    public static App getInstance(){
    	return new App();
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public void coverageTestMethod(String arg){
    	System.out.println("Welcome to Java's World!");
    	if ("ok".equals(arg)) {
    		System.out.println("ok!");
    	} else {
    		System.out.println("arg is not ok!");
    	}
    }
}
