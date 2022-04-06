import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class hello {

    public float commission(int x,int y){
        if(x>8&&y>5)
        {
            x=x+y;
            if(x>16||y>8) return x=x+y;
        }else
        {
            if(x>0||y>0)
                x=x+y;
            else
                x=x+1;
        }
        return x;
    }

    @Test   //条件覆盖

    public void Commosion_con() {

        assertEquals(9.8,commission(1, 1), 0.01);

        assertEquals(1830.0,commission(100, 150), 0.01);

    }

}
