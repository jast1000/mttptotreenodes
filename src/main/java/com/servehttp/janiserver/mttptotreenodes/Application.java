package com.servehttp.janiserver.mttptotreenodes;

import com.servehttp.janiserver.mttptotreenodes.generators.MTTPModelGenerator;
import com.servehttp.janiserver.mttptotreenodes.model.MTTPModel;
import com.servehttp.janiserver.mttptotreenodes.model.TreeNodeModel;
import com.servehttp.janiserver.mttptotreenodes.transformers.MTTPTransformer;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class Application {
    
    public static void main(String[] args) {
        List<MTTPModel> tree = MTTPModelGenerator.generate();
        TreeNodeModel treeNodes = MTTPTransformer.transform(tree);
        show(treeNodes);
    }
    
    private static void show(TreeNodeModel x) {
        System.out.println(String.format("%s -> %s", x.getParent() == null ? "-" : x.getParent().getValue(),  x.getValue()));
        for(TreeNodeModel y : x.getChilds()) {
            show(y);
        }
    }
    
}
