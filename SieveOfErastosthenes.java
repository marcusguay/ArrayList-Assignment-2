import java.util.ArrayList;
import java.util.Scanner;
    
class SieveOfErastosthenes{
    

public static void main(String[] args){
    
     Scanner sc=new Scanner(System.in);
     
    ArrayList<Integer> nums = new ArrayList<Integer>();
        int Size= sc.nextInt();
    
   
  for(int i=0; i <= Size; i++)
  nums.add(i);
 System.out.println(nums);
 
 for(int i=2; i < nums.size(); i++){
  for(int p=2; p < nums.size(); p++){
  
      if(nums.get(p) % i == 0 && nums.get(p) > i)
      nums.remove(p);
     
 
    
   
   
}
}
  System.out.println(nums);
}
  
  

}


      

  
    


