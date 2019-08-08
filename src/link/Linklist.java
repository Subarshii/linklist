package link;

public class Linklist {
    private Node root;

    private Node getRoot() {
        return root;
    }

    private void setRoot(Node root) {
        this.root = root;
    }

    public static void main(String[] args) {
        Linklist linklist = new Linklist();
        linklist.add("A");
        linklist.add("B");
        linklist.add("C");
        linklist.add("D");
//        linklist.remove("A");
//        linklist.addFirst("0");
        linklist.remove(1);
        linklist.print();

    }

    private void add(String value) {
        Node node = new Node(value);
        if (getRoot() == null) {
            setRoot(node);
        } else {
            Node last = getRoot();
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    private void remove(int index) {
            if (getRoot() != null) {
                Node node = getRoot();
                if (index == 0) {
                    setRoot(node.getNext());
                }
                for (int i = 0;  i < index ; i++) {
                    node = node.getNext();
                }
                if (node != null && node.getNext() != null) {
                    Node next = node.getNext().getNext();
                    node.setNext(next);
                }
            }
    }

    private void remove(String value) {
        Node node = getRoot();
        Node n = node;
        if (node.getValue().equals(value)) {
            node = null;
            setRoot(n.getNext());
        }
        while (node != null) {
            if (node.getNext() != null) {
                if (node.getNext().getValue().equals(value)) {
                    node.setNext(node.getNext().getNext());
                }
            }
            node = node.getNext();
        }
    }

    private void print() {
        if (getRoot() != null) {
            System.out.println(getRoot().getValue());
            while (getRoot().getNext() != null) {
                System.out.println(getRoot().getNext().getValue());
                setRoot(getRoot().getNext());
            }
        }
    }

    public void addFirst(String value) {
        Node node = new Node(value);
        Node temp = getRoot();
        if (getRoot() != null) {
            setRoot(node);
            node.setNext(temp);
        }
    }


}
