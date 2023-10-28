import java.util.Scanner;
import java.util.HashMap;

class Encrypt{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=in.next();
        System.out.println("Enter x: ");
        int x=in.nextInt();
        int num;
        StringBuilder ans=new StringBuilder();
        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                num=hm.get(s.charAt(i));
                hm.replace(s.charAt(i),num+1);
            }
            else
                hm.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            num=hm.get(s.charAt(i));
            if(num%2==0)
                ans.append((char)(s.charAt(i)+x));
            else{
                if(s.charAt(i)-x>='a')
                    ans.append((char)(s.charAt(i)-x));
                else{

                    ans.append((char)(123-(3-((s.charAt(i))-'a'))));
                }
            }
        }
        System.out.println(ans);
    }
}