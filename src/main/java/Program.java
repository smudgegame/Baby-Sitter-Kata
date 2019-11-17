
public class Program {

    public static void main(String[] args){
        String[] s = {"8:00PM", "8:29PM", "7:26PM", "2:30AM"};

            for(int i = 0; i < s.length; i++ ) {
                String[] parts = s[i].split(":") ;
                System.out.println(parts[0]);
                System.out.println(parts[1]);
/*                int x = Integer.parseInt(s[i]);
                System.out.println(x);*/
            }

    }
}
