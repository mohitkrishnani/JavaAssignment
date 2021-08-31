class Message{
    String text;
    boolean isEmpty = true;

    synchronized String read(){
        while(!this.isEmpty){
            System.out.println("Inside Message file read function "+this.text);
            this.isEmpty = true;
        }
        return this.text;
    }

    synchronized void write( String message ){
        while(this.isEmpty){
            System.out.println("Inside Message file write function "+message);
            this.isEmpty = false;
        }
        this.text = message;
    }
}