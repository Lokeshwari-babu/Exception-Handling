public class Testtwo {
    public static void main(String[] args) {
        int[] eids = {101,102,103,104};
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[2]);
        try {
            System.out.println(eids[10]); //AIOBSEXCEPTION
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}
