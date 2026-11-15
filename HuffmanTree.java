import java.util.PriorityQueue;

//huffman tree class is just for building tree????
// no, also collects/stores the freq of instances

public class HuffmanTree {

    private TreeNode root;
    private int freq;

    public HuffmanTree(TreeNode root) {
        this.root = root;
        // when new node is made, there is freq of one 
        this.freq = 1;
    }

    public TreeNode getRoot() {
        return root;
    }

    public int getFreq(){
        return freq;
    }

    public void buildTree() {

    }

    public void reBuildTree(String flatTree){

    }


    public String flattenTree(){
        StringBuilder flattenedTree = new StringBuilder();
        flattenTreeHelp(root, flattenedTree);
        return flattenedTree.toString();
    }
    private void flattenTreeHelp(TreeNode node, StringBuilder flatTree){
        while (node != null){
            flattenTreeHelp(node.getLeft(), flatTree.append("0"));
            flattenTreeHelp(node.getRight(), flatTree.append("1"));
            
        }
    }

    

}
