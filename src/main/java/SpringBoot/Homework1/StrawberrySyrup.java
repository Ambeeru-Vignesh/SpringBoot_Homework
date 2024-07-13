package SpringBoot.Homework1;

import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup {

    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}
