import java.io.File;
import java.util.*;
public class InsSortInt {
    public static void main(String[] args){
        File input= new File("CreekCS/insertionsortwithintegers-esunker/randInts.txt");
        ArrayList<Integer> numbs= new ArrayList<>();
        int temp;
        int i=1;
        Scanner scan= null;
        scan=new Scanner (input);
        while(scan.hasNextLine()){
            numbs.add(scan.nextLine());
        }
    while(i< numbs.getLength()){
        if(numbs.get(i)<numbs.get(i-1)){
            temp=numbs.get(i);
            numbs.set(i,numbs.get(i-1));
            numbs.set(i-1,temp);
            if(i!=0){
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
