package POO.Exception.test;

public class StackOverflowTest01 {

    // O erro 'StackOverflow' é quando acaba a memoria da JVM.
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
