//package Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class GraphImpl {
//
//    public static class Node {
//        String name;
//        List<Node> children = new ArrayList<Node>();
//
//        public Node(String name) {
//            this.name = name;
//        }
//
//        public List<String> depthFirstSearch(List<String> array) {
//            array.add(this.name);
//            for (int i=0; i<children.size(); i++) {
//                children.get(i).depthFirstSearch(array);
//            }
//            return array;
//        }
//
//        public void addChildToParent(String parent,String child) {
//            for (int i=0; i<children.size(); i++) {
//                if (children.get(i).name.equals(parent)){
//                    children.get(i).addChild(child);
//                    return;
//                }
//                children.get(i).addChildToParent(parent,child);
//            }
//
//        }
//
//        public Node addChild(String name) {
//            Node child = new Node(name);
//            children.add(child);
//            return this;
//        }
//    }
//}


