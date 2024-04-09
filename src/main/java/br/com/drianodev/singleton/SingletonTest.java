package br.com.drianodev.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);
    }
}
