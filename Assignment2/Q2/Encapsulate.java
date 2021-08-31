class Encapsulate{
    //Data is encapsulated inside class
    //Data is private so its hidden from the user
    private int intData = 7;
    private String stringData = "Dummy";

    //Data is private so users will have to use getters and setters
    //public methods for users to get access to data
    public int getintData(){
        return this.intData;
    }


    public String getstringData(){
        return this.stringData;
    }

    //public methods for users to set data to data variables
    public void setintData( int data){
        this.intData = data;
    }


    public void setstringData(String data){
        this.stringData = data;
    }
}