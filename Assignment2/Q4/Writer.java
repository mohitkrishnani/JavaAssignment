class Writer implements Runnable{
    private Message message;

    Writer(Message message){
        this.message = message;
    }

    public void run(){
        String msg = "Hello World";

        try{
            message.write(msg);
            Thread.sleep(2000);
            System.out.println("Written "+this.message.text);
        }
        catch(Exception e){

            System.out.println(e);
        }
        System.out.println("Writing is done");
    }
}