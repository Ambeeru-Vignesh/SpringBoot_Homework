package SpringBoot.Homework1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.env.syrup", havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

    public String getSyrupType(){
        return "Chocolate Syrup";
    }

}
