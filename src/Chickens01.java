public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chikenCount = 8;
        int eggsPerChicken = 4;
        int totalEggs ;
        
         totalEggs = chikenCount *  eggsPerChicken; // segunda feira 
         chikenCount ++ ;  // Adicionamos uma galinha 
         totalEggs += chikenCount *  eggsPerChicken;
         chikenCount /= 2; // animal come metade 
         totalEggs += chikenCount *  eggsPerChicken; //  total dos ovos 
         
        
        System.out.println(totalEggs);
        System.out.println(chikenCount);
    }   
}
