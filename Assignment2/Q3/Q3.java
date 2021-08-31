import java.util.concurrent.*;
class Q3{
    public static void main(String args[]){

        ExecutorService executor = Executors.newSingleThreadExecutor();
        FetchData fd = new FetchData();
        Future future = executor.submit(fd);

        try{
            future.get(10,TimeUnit.SECONDS);
            ProcessData pd = new ProcessData();
            pd.start();
            pd.join();
        }
        catch(TimeoutException te){
            future.cancel(true);
            System.out.println("Fetch Data exceeds the timeout limit");
            System.out.println("Fetch Data is cancelled ProcessData will not be started");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            executor.shutdownNow();
        }
        
    }
}