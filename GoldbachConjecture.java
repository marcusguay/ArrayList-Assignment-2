

import java.util.ArrayList;
import java.util.Scanner;
    
class GoldbachConjecture{
    

public static void main(String[] args){
    
     Scanner sc=new Scanner(System.in);
     
    ArrayList<Integer> nums = new ArrayList<Integer>();
        int Size= sc.nextInt();
    
   
  for(int i=0; i <= Size; i++)
  nums.add(i);

 
 for(int i=2; i < nums.size(); i++){
  for(int p=2; p < nums.size(); p++){
  
      if(nums.get(p) % i == 0 && nums.get(p) > i)
      nums.remove(p);
     
 
    
   
   
}
}

 System.out.println(nums);
int num1=0;
int num2=0;
int rnum1=0;
int rnum2=0;
for(int j = 0; j != Size; j=num2+num1){

 rnum1=(int)(Math.random()*nums.size());
  rnum2=(int)(Math.random()*nums.size());
num1=nums.get(rnum1);
num2=nums.get(rnum2);
  




}
System.out.println(+num1+"and"+num2);

 
  
  
  
  
  
  
  
  
  
  
  

  
  

}

}


      

  
    


