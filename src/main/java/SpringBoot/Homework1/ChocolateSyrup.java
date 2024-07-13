package SpringBoot.Homework1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ChocolateSyrup implements Syrup{

    public String getSyrupType(){
        return "Chocolate Syrup";
    }

}
