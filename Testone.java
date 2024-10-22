public class Testone {
    public static void main (String[]args) {
        System.out.println("GM");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("cant Devide By Zero");
        }
        System.out.println("GA");
    }
    
}
