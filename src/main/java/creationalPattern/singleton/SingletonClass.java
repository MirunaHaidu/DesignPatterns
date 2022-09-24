package creationalPattern.singleton;

public class SingletonClass {
    private static SingletonClass instance; //orice instanta voi cere, va avea mereu aceeasi valoare
    private int a;

    private SingletonClass(){
        // pasul 1 - NU ii mai oferim acceesul la constructor, ca sa nu il mai putem instantia cu new
    }
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }

    // e folosit in dif frameworks - ex. spring


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
