package sort;

import list.linked.Node;


public class MergeSort {

    public static void main(String[] args) {
        Node node1 = new Node(4, null);
        Node node2 = new Node(5, node1);
        Node node3 = new Node(8, node2);
        Node node4 = new Node(2, node3);
        Node node5 = new Node(6, node4);

        System.out.println(node5);
        
        Comparable[] array = {node5, node4, node3, node2, node1};

        Comparable[] mergeSort = mergeSort(array);
        for (int i=0; i<mergeSort.length; i++){
            System.out.print(mergeSort[i] + " ");
        }
    }

    /** mergeSort method splits the given collection into two equal halves and recursively calls mergeSort till its splitted to size 1. Post that
     * it calls the merge method to merge those collection.
     * 
     * @param collection
     * @return <T> Comparable<Collection<T>>[] collection sorted by merge-sort.
     */
    @SuppressWarnings("unchecked")
    public static Comparable[] mergeSort(Comparable[] collection) {
        
        if (collection.length <= 1)
            return collection;

        Comparable[] first = new Comparable[collection.length / 2];
        Comparable[] second = new Comparable[collection.length - first.length];
        System.arraycopy(collection, 0, first, 0, first.length);
        System.arraycopy(collection, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, collection);
        
        return collection;
    }

    /**
     * merge method merges the provided two comparable types into given result. It starts by comparing the elements one by one in the two collections
     * and stores them in the result.
     * @param first
     * @param second
     * @param result
     */
    @SuppressWarnings("unchecked")
    public static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        int i = 0, j = 0, k = 0;
        
        while (i < first.length && j < second.length) {
            if (first[i].compareTo(second [j]) <= 0) {
                result [k++] = first[i++];
            } else {
                result [k++] = first[j++];
            }
        }
        System.arraycopy(first, i, result, k, first.length - i);
        System.arraycopy(second, j, result, k, second.length - j);
    }
}
