import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class InsSortInt {
    public static void main(String[] args){
        File file= new File("/workspaces/insertionsortwithintegers-esunker/randInts.txt");
        ArrayList<Integer> numbs= new ArrayList<>();
        try{
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()){
            int a= scan.nextInt();
            numbs.add(a);
        }
   

    }catch (FileNotFoundException ex)  
    {
        // insert code to run when exception occurs
        System.out.print("no");
    }
    sort(numbs);
    System.out.println(numbs.get(0));
    System.out.println(numbs.get(numbs.size()-1));
    }
    public static void sort(ArrayList<Integer> numbs){
        int i=1;
        int temp;
         while(i<numbs.size()){
        if(numbs.get(i)<numbs.get(i-1)){
            temp=numbs.get(i);
            numbs.set(i,numbs.get(i-1));
            numbs.set(i-1,temp);
            if(i!=1){
                i--;
            }
            else{
                i++;
            }
        }
        else{
            i++;
        }
        }
    }
}
