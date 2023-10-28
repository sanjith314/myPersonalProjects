    public class Bank {
        void getBalance(){}
    }
    class  BankA extends Bank{
        void getBalance(){
            System.out.println("Balance = $100");
        }
}
    class  BankB extends Bank {
        void getBalance() {
            System.out.println("Balance = $150");
        }
    }
    class  BankC extends Bank{
        void getBalance(){
            System.out.println("Balance = $200");
        }
    }
    class Output{
        public static void main(String[] args) {
            BankA obj1= new BankA();
            BankB obj2= new BankB();
            BankC obj3= new BankC();

            obj1.getBalance();
            obj2.getBalance();
            obj3.getBalance();
        }
    }
