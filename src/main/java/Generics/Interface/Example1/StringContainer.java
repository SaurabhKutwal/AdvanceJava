package Generics.Interface.Example1;

public class StringContainer implements Container<String>{
    String name;
    @Override
    public void add(String item) {
        name = item;
    }

    @Override
    public String get() {
        return name;
    }
}

class AnyContainer<T> implements Container<T>{
    T value;

    @Override
    public void add(T item) {
        value = item;
    }

    @Override
    public T get() {
        return value;
    }
}

class Test{
    public static void main(String[] args) {
        StringContainer container = new StringContainer();
        container.add("Saurabh");
        System.out.println(container.get());

        AnyContainer<Integer> intContainer = new AnyContainer<>();
        intContainer.add(1000);
        System.out.println(intContainer.get());

        AnyContainer<String> stringContainer = new AnyContainer<>();
        stringContainer.add("Hello");
        System.out.println(stringContainer.get());
    }
}
