import java.util.*;

public class App {
    
    List<String> display()
    {
        List<String> list=new ArrayList<String>();  
         list.add("Java");  
         list.add("C++");  
         list.add("Python");  
        return list;
    }

    public static void main(String[] args){
        App e = new App();
        System.out.println(e.display());
    }
}

