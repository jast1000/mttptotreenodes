package com.servehttp.janiserver.mttptotreenodes.generators;

import com.servehttp.janiserver.mttptotreenodes.model.MTTPModel;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class MTTPModelGenerator {
    
    /**
     *             1 A 16
     *     2 B 7                8 E 15
     *3 C 4     5  D 6     9 F 10        11 G 14
     *                                 12 H 13
     * @return List of MTTPModel
     */
    public static List<MTTPModel> generate() {
        return Arrays.asList(
                new MTTPModel("A" + new Date().getTime(), "A", 1, 16),
                new MTTPModel("B" + new Date().getTime(), "B", 2, 7),
                new MTTPModel("C" + new Date().getTime(), "C", 3, 4),
                new MTTPModel("D" + new Date().getTime(), "D", 5, 6),
                new MTTPModel("E" + new Date().getTime(), "E", 8, 15),
                new MTTPModel("F" + new Date().getTime(), "F", 9, 10),
                new MTTPModel("G" + new Date().getTime(), "G", 11, 14),
                new MTTPModel("H" + new Date().getTime(), "H", 12, 13)
        );
    }
    
}
