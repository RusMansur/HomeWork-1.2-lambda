public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listener);
        Worker laborer = new Worker(errorListener);
        worker.start(listener, errorListener, 33);
    }
}
