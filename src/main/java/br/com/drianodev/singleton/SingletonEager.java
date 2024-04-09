package br.com.drianodev.singleton;

/**
 * Singleton "apressado"
 *
 * @author drianodev
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
