public abstract class Marks {
    abstract double getPercentage();
}
    abstract class A extends Marks{
        static double getPercentage(double a, double b, double c){
            return (a+b+c)/3;
        }
    }
    abstract class B extends Marks{
        static double getPercentage(double a, double b, double c, double d){
            return (a+b+c+d)/4;
        }
    }
    class Score{
        public static void main(String[] args) {
            System.out.println(A.getPercentage(65,75,85));
            System.out.println(B.getPercentage(60,70,80,90));
        }
    }
