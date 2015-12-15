package mj.ocjp;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by user on 2015-11-27.
 */
public class Hello {

    public static void main(String args[]) {

        int i = -10;
        i = +i;
        System.out.println(i); //-10
        i = -10;
        System.out.println(i); //-10
        i = -i;
        System.out.println(i); //10

    }
}
