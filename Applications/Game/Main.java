import java.util.Scanner;

class Main{
    static int life=5;
    static int bricks=6;
    static String[][] arr= {{"w","w","w","w","w","w","w"},
            {"w"," "," "," "," "," ","w"},
            {"w"," ","1","1","1"," ","w"},
            {"w"," ","1","1","1"," ","w"},
            {"w"," "," "," "," "," ","w"},
            {"w"," "," "," "," "," ","w"},
            {"w","g","g","o","g","g","w"}};

    public static void print(){
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void lt() {
        boolean ltcheck = true;
        int row;
        int column;
        for (int i = 0; i < 7; i++) {
            if (arr[6][i].equals("o")) {
                row = 6;
                column = i;
                while (ltcheck) {
                    if (arr[row][column] == "w") {
                        life--;
                        for (int k = 1; k < 6; k++) {
                            if (arr[row][k] == "1") {
                                arr[row][k] = " ";	
				ltcheck=false;		
				break;
				
                            }
                        }
                    }
                    row--;
                    column--;
                }
                arr[6][i - 1] = "o";
                arr[6][i] = "g";
                break;
            }
        }

    }
        public static void rt () {
            for (int i = 0; i < 7; i++) {
                if (arr[6][i].equals("o")) {
                    arr[6][i + 1] = "o";
                    arr[6][i] = "g";
                    break;
                }
            }
        }
    
        public static void st() {
            boolean stcheck = false;
            for (int i = 0; i < 7; i++) {
                if (arr[6][i] == "o") {
                    for (int j = 5; j > 1; j--) {
                        if (arr[j][i] == "1") {
                            arr[j][i] = " ";
                            stcheck = true;
                            break;
                        }
                    }
                }
            }
            if (!stcheck)
                life--;
        }

        public static void main(String[] args){
            Scanner in= new Scanner(System.in);
            boolean check=true;
            while(check){
                print();
                if(life>0){
                    System.out.println("Life remaining: "+life);
                    System.out.println("Enter st/lt/rt/stop");
                    String option=in.next();
                    switch(option){
                        case "lt" -> lt();
                        case "rt" -> rt();
                        case "st" -> st();
                        case "stop" -> System.exit(0);
                        default -> System.out.println("Enter a valid option");
                    }
                }
                else{
                    System.out.println("You are out of lives!");
                    check=false;
                }
            }
        }
    }