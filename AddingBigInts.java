import java.util.Scanner;
import java.util.ArrayList;
class AddingBigInts{
   
    
    
    
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        ArrayList<Integer> nums1 =new ArrayList<Integer>();
        ArrayList<Integer> nums2 =new ArrayList<Integer>();
        ArrayList<Integer> nums3 =new ArrayList<Integer>();
        ArrayList<Integer> nums4 =new ArrayList<Integer>();
        ArrayList<Integer> nums5 =new ArrayList<Integer>();
         ArrayList<Integer> nums6 =new ArrayList<Integer>();
   

        int Size1= sc.nextInt();
        int Size2= sc.nextInt();
        int digit=0;
    
        while( Size1 > 0){
       
   nums1.add(Size1%10);
   Size1=Size1/10;
            
        }
        
        while( Size2 > 0){
       
   nums2.add(Size2%10);
   Size2=Size2/10;
            
        }
        
          while( nums2.size() > nums1.size()){
       
   nums1.add(0);
            
        }
        
          while( nums1.size() > nums2.size()){
       
   nums2.add(0);
  
            
        }
        
           System.out.println(nums1);
     System.out.println(nums2);
        
        for(int i=nums1.size()-1; i >= 0; i--){
           nums4.add(nums1.get(i));
        }
        
        for(int i=nums2.size() -1; i >= 0; i--){
           nums5.add(nums2.get(i));
        }
        
        
        int add=0;
        int remainder=0;
        
     System.out.println(nums4);
     System.out.println(nums5);
      
        for(int i=nums5.size()-1; i >= 0; i--){
           
         add=0;
       add=nums4.get(i)+nums5.get(i)+remainder;
        remainder=0;
        System.out.println(nums4.get(i)+nums5.get(i)+remainder+"i"+i);
        if(add > 9){
        add=add-10;
        remainder=1;
        
    }
        nums3.add(add);
        
        if(i==0 && remainder > 0){
          System.out.println("lol"+remainder);
           
        nums3.add(remainder);
    }
        add=0;
    
}
    System.out.println(nums3);
  for(int i=nums3.size()-1; i >= 0; i--){
           nums6.add(nums3.get(i));
        }
        

    
    System.out.println(nums6);
    }
    
    
    
      
    }
    
    

    
    
    
    
    
    
    
    
