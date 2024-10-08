package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.Map;

public class CheckoutSolution {

    private static final Map<Character, Integer> price_table = Map.of(
            'A', 50, 'B', 30, 'C', 20, 'D', 15
    );

    public Integer checkout(String skus) {

        Integer itemCounterA = 0;
        Integer itemCounterB = 0;
        Integer itemCounterC = 0;
        Integer itemCounterD = 0;

        for(char sku : skus.toCharArray()){
            if(sku == price_table.get(0)){
                itemCounterA++;
            }else if(sku == price_table.get(1)){
                itemCounterB++;
            }else if(sku == price_table.get(2)){
                itemCounterC++;
            }else if(sku == price_table.get(3)){
                itemCounterD++;
            }
        }

        

        Integer totalPrice = 0;


    }
}



