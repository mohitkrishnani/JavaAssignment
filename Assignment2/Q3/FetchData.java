class FetchData extends Thread{

    public void run(){
        try{
            System.out.println("Inside FetchData.");
            System.out.println("This process should take 5 seconds but if a response is not received in 10 seconds this thread would be stopped and further execution would be cancelled.");
            Thread.sleep(5000);
            System.out.println("Done FetchData");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}