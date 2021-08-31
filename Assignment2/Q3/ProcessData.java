class ProcessData extends Thread{

    public void run(){
        try{
            System.out.println("Inside ProcessData.");
            System.out.println("This process would take about 2 seconds.");
            Thread.sleep(2000);
            System.out.println("Done ProcessData");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}