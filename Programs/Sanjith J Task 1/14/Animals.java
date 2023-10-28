abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
    class Cats extends Animals{
        void cats(){
            System.out.println("Cat meow");
        }
        void dogs(){}
    }

    class Dogs extends Animals{
        void dogs(){
            System.out.println("Dogs bark");
        }
        void cats(){}
    }
    class print{
        public static void main(String[] args) {
            Dogs dog = new Dogs();
            dog.dogs();
            Cats cat= new Cats();
            cat.cats();
        }
    }
