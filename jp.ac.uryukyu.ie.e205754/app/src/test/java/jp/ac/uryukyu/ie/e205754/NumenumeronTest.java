
package jp.ac.uryukyu.ie.e205754;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumenumeronTest {
    @Test
    void numberTest(){
        int[] answer = new int[3];
        answer[0] = 1;
        answer[1] = 2;
        answer[2] = 3;

        int[] input = new int[3];
        input[0] = 1;
        input[1] = 3;
        input[2] = 2;

        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < input.length; j++){
                if(i == j && answer[i] == input[j]){
                    Numenumeron.strike++;
                }else if(answer[i] == input[j]){
                    Numenumeron.ball++;
                }
            }
        }
        assertEquals(1, Numenumeron.strike);
        assertEquals(2, Numenumeron.ball);
    }
}