import java.util.*;

public class ListsOfExceptions{
    public void workTest(){
        ArrayList<Object> workList = new ArrayList<Object>();
        workList.add("13");
        workList.add("hello world");
        workList.add(48);
        workList.add("Goodbye world");
        workList.add(77);
    
        try {
            for(int i = 0; i < workList.size(); i++){
                Integer castedValue = (Integer) workList.get(i);
            } 
        } catch(ClassCastException e) {
            System.out.println("boo");
        }
    
   }
}