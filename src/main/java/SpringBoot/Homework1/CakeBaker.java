package SpringBoot.Homework1;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    final Frosting Fr;
    final Syrup Sy;

    public CakeBaker(Frosting Fr, Syrup Sy){
        this.Fr = Fr;
        this.Sy = Sy;
    }

    public void bakeCake(){
        System.out.println("Bake with " + Fr.getFrostingType() + " and " + Sy.getSyrupType());
    }
}
