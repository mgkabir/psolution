package io.kabir.mockito;

import java.util.Arrays;
import java.util.List;

public class Repository {
    public List<String> getAllNames(){
        List<String> names = Arrays.asList("ShayK","Mohammd Kabir","Iftear Zahid","Ahmed","Ferdous","Monsur Ahmed","Ziaur Rahman");
        System.out.println(names);
        return names;
    }
}
