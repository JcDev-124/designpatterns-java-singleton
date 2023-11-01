package org.example;

public class Logger {

    //Construtor vazio
    private Logger(){}

    private static Logger instance;

    public static Logger getInstance(){
        if(instance==null)
            instance = new Logger();
        return instance;
    }
    public void println(String msg){
        System.out.println(msg);
    }

}

class Main{
    void m1(){
        Logger log = Logger.getInstance();
        log.println("Executando m1: " + log);
    }
    void m2(){
        Logger log = Logger.getInstance();
        log.println("Executando m2: " + log);
    }
    public static void main(String args[]){
        Main m = new Main();
        m.m1();
        m.m2();
    }
}
