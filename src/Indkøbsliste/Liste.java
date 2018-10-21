package Indkøbsliste;

public class Liste<T> {
private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Liste<String> string = new Liste<String>();

        string.add(new String(""));


    }
}