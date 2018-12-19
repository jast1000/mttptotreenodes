package com.servehttp.janiserver.mttptotreenodes.transformers;

import com.servehttp.janiserver.mttptotreenodes.model.MTTPModel;
import com.servehttp.janiserver.mttptotreenodes.model.TreeNodeModel;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jesus Sanchez
 */
public class MTTPTransformer {

    public static TreeNodeModel transform(List<MTTPModel> tree) {
        Map<String, TreeNodeModel> nodesMap = new LinkedHashMap<>();
        Deque<TreeNodeModel> stack = new ArrayDeque<>();
        
        tree.stream().forEach(n -> {
            TreeNodeModel newNode = new TreeNodeModel(n.getId(), n.getValue(), n);
            nodesMap.put(n.getId(), newNode);

            n.setDifference(n.getRight() - n.getLeft());

            TreeNodeModel lastNode = stack.isEmpty() ? null : stack.getLast();
            if(lastNode != null) {
                while(n.getDifference() >= lastNode.getMttpModel().getDifference()) {
                    lastNode = stack.removeLast();
                }
                lastNode.getChilds().add(newNode);
                newNode.setParent(lastNode);
            }
            stack.add(newNode);
        });

        return nodesMap.get(tree.get(0).getId());
    }

}
