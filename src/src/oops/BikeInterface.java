package oops;

public class BikeInterface 
{
    //Using an interface to abstract the bikes

    public static void main(String[] args) {
        MyBike bike1 = new MyBike();
        bike1.bugati();
        bike1.toyota();
        bike1.honda();
    }

    //our interface
    interface IBike{
        void toyota();
        void bugati();
        void honda();
    }

    //our class
    public static class MyBike implements IBike{

        @Override
        public void toyota() {
            System.out.println("I am a toyota bike");
        }

        @Override
        public void bugati() {
            System.out.println("I am a bugati bike");
        }

        @Override
        public void honda() {
            System.out.println("I am a honda bike");
        }
    }


}
