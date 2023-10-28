    abstract class Parent {
    abstract void message();
}
        class First extends Parent{
            void message(){
                System.out.println("This is first sub class");
            }
        class Second extends Parent{
            void message(){
                System.out.println("This is second sub class");
            }

        class Answer{
        public void main(String[] args) {
            First obj1= new First();
            obj1.message();
            Second obj2= new Second();
            obj2.message();
}
        }
    }
}