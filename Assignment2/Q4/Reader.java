class Reader implements Runnable{
    private Message message;

    Reader(Message message){
        this.message = message;
    }

    public void run(){
       try{
            this.message.text = message.read();
            Thread.sleep(2000);
            System.out.println("Read "+this.message.text);
        }
        catch(Exception e){

            System.out.println(e);
        }
        System.out.println("Reading is done");
    }
}