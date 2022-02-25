public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int task) {
        for (int i = 1; i <= 100; i++) {
            if (task == i) {
                errorCallback.onError("Task " + i + " is not done");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

}
