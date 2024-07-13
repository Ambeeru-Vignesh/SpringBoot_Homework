package SpringBoot.Homework1;

import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {

    public String getFrostingType(){
        return "Strawberry Frosting";
    }
}
