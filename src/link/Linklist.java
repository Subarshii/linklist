package link;

public class Linklist {
    private Node root;


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void addnode(String value) {
        Node node = new Node(value);
        if (getRoot() == null) {
            this.setRoot(node);
        } else if (node.getNext() == null) {
            Node nextnode = getRoot();
            while (nextnode.getNext() != null) {
                nextnode = nextnode.getNext();
            }
            nextnode.setNext(node);

        }
    }

    public void printlist() {
        while (getRoot() != null) {
            System.out.println(getRoot().getValue());
            setRoot(getRoot().getNext());
        }
    }


    public static void main(String[] args) {
        Linklist linklist = new Linklist();
        linklist.addnode("B");
        linklist.addnode("C");
        linklist.addnode("D");
        linklist.addnode("E");
        linklist.printlist();
    }
}
