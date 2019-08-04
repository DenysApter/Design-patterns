package iterator.list;

import iterator.MyIterator;

public class MyList<T> {

    private int size;
    private Node<T> root;

    public void addLast(T data) {
       Node<T> tmp =  new Node<>(null, null, data);
        if (root == null) {
            root = tmp;
            size++;
            return;
        } else {
            Node last = getLast();
            tmp.setLast(last);
            last.setNext(tmp);
            size++;
        }
    }

    public void addStart(T data) {
        Node<T> tmp = new Node<>(null, null, data);
        tmp.setNext(root);
        root = tmp;
        size++;
    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (root == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(root.getValue());
        Node tmp = root;
        while (tmp.getNext() != null) {
            stringBuilder.append(tmp.getValue());
            stringBuilder.append(", ");
            tmp = tmp.getNext();
        }
        stringBuilder.append(tmp.getValue());
        System.out.println(stringBuilder.toString());
    }

    private Node getLast() {
        Node tmp = root;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    public MyIterator<Node> getIterator() {
       return new  MyListIterator(root);
    }


    private class MyListIterator implements MyIterator<Node> {

        private Node<T> tmp;
        private StringBuilder stringBuilder;


        private MyListIterator(Node<T> tmp) {
            this.tmp = tmp;
            stringBuilder = new StringBuilder();
        }

        @Override
        public boolean hasNext() {
            return tmp.getNext() != null;
        }

        @Override
        public Node next() {
            tmp = tmp.getNext();
            return tmp;
        }

        @Override
        public void printAll() {
            if (tmp == null) {
                return;
            }
            stringBuilder.append(tmp.getValue());
            while (hasNext()) {
                stringBuilder.append(", ");
                stringBuilder.append(next().getValue());
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
