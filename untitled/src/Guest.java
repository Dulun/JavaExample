//package cc.openhome;
//
//import java.util.InputMismatchException;
//import java.util.Objects;
//
//public  class SimpleLinkList{
//    private class Node{
////        public Object elem;
//
//        Node(Object o){
//            this.o = o;
//        }
//        Object o;
//        Node next;
//    }
//
//    private Node first;
//
//    private void add(Objects elem){
//
//        Node node = new Node(elem);
//        if(first == null){
//            first = node;
//        }
//        else{
//            append(node);
//        }
//    }
//
//    private void append(Node node) {
//        Node last = first;
//        while(last.next != null){
//            last = last.next;
//        }
//        last.next = node;
//    }
//
//    public int size(){
//        int count = 0;
//        Node last = first;
//        while(last != null){
//            last = last.next;
//            count++;
//        }
//        return count;
//    }
//
//    public Object get(int index){
//        checkSize(index);
//        return findElemOf(index);
//
//    }
//
//    private Object findElemOf(int index) {
//
//        int count = 0;
//        Node last = first;
//        while(count < index){
//            last = last.next;
//            count ++;
//        }
//        return last.o;
//    }
//
//    private void checkSize(int index) {
//
//        int size = size();
//        if(index >= size){
//            throw new IndexOutOfBoundsException(
//                    String.format("Index:%d, size: %d", index, size));
//        }
//    }
//
//}
