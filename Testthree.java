public class Testthree {
    public static void main(String[] args) {
        int[] eids={101,102,103,104};
        //index      0    1   2   3
        System.out.println(eids[0]); //101
        System.out.println(eids[1]); //102
        try {
            System.out.println(eids[10]); //AIOBSEeception

        }catch (Exception e){
            //system.out.println(e.getMessage());
            System.out.println("Test case123");
        }
        System.out.println(eids[3]); //104
    }
    
}
