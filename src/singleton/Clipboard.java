package singleton;

public class Clipboard {

    private String value;
    private static Clipboard instance=null;

    private Clipboard(){}

    public static Clipboard getInstance(){
        if(instance == null){
            instance = new Clipboard();
        }
        return instance;
    }

    public void copy(String data){
        this.value = data;
    }

    public void paste(){
        System.out.println(this.value);
    }

}
