package SpringBoot.Homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.env.frosting", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

    public String getFrostingType(){
        return "Chocolate Frosting";
    }

}
