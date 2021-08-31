abstract class Animal{
    abstract int getLegs();
    abstract String getColor();
    String getKingdom(){
        return "Animalia Kingdom";
    }
}


class Tiger extends Animal{
    public int getLegs(){
        return 4;
    }
    public String getColor(){
        return "Brown";
    }
}


interface Vehicle{
    int getNoOfWheels();
    void setMaxSpeed(int speed);
    int getMaxSpeed();
}

class Car implements Vehicle{
    int maxSpeed;
    public int getNoOfWheels(){
        return 4;
    }

    public void setMaxSpeed(int speed){
        this.maxSpeed = speed;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }
}

class Q1{
    public static void main(String args[]){
        Tiger t = new Tiger();
        System.out.println("Tiger");
        System.out.println("Kingdom: "+t.getKingdom() );
        System.out.println("no of legs: "+t.getLegs());
        System.out.println("Skin Color: "+t.getColor());

        Car c = new Car();
        System.out.println("Car");
        System.out.println("No of Wheels: "+c.getNoOfWheels());
        c.setMaxSpeed(220);
        System.out.println("Max Speed: "+c.getMaxSpeed());

    }    
}