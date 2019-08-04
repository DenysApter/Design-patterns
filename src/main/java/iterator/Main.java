package iterator;

import iterator.list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.addStart("1111");
        myList.addLast("2222");
        myList.addStart("3333");
        myList.addLast("4444");
        myList.addLast("5555");


        MyIterator myIterator = myList.getIterator();
        myIterator.printAll();
    }
}
