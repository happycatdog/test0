package Ex.Algo;

class Tree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    public void makeTree(int[] array){
        root = makeTreeR(array, 0, array.length - 1);
    }

    public Node makeTreeR(int[] array, int start, int end){
        if(start> end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(array[mid]);
        node.left = makeTreeR(array, start, mid - 1);
        node.right = makeTreeR(array, mid + 1, end);
        return node;
    }
    public void searchBTree(Node n, int find){
        if(find < n.data){
            System.out.println("Data is smaller than " + n.data);
            searchBTree(n.left, find);
        }else if (find > n.data){
            System.out.println("Data is bigger than " + n.data);
            searchBTree(n.right, find);
        }else{
            System.out.println("Data Found");
        }
    }
}

public class BinaryTreeEx {
    public static void main(String[] args){
        int[] array = new int[10];
        for(int i=0; i< array.length; i++){
            array[i] = i;
        }
        Tree t =new Tree();
        t.makeTree(array);
        t.searchBTree(t.root, 5);
    }
}
