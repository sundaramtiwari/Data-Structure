package array;

import java.util.Iterator;
import java.util.TreeSet;


public class DictionarySort {

    public static void main(String[] args) {
        String[] words = {"apple", "zebra", "Ape", "box", "card", "yak" };
        TreeSet<Node> set = new TreeSet<Node>();

        for (int i=0; i < words.length; i++) {
            Node node = new Node(words[i]);
            set.add(node);
        }

        Iterator<Node> itr = set.iterator();
        
        while (itr.hasNext()) {
            Node next = itr.next();
            System.out.println(next + " ");
        }
    }
}

class Node implements Comparable<Node> {
    private String word;
    private boolean caseSensitive;

    public Node() {
        super();
    }

    public Node(String word) {
        this.word = word;
    }

    public Node(String word, boolean caseSensitive) {
        this.word = word;
        this.caseSensitive = caseSensitive;
    }

    @Override
    public int compareTo(Node o) {
        String word1, word2;
        
        if (this.caseSensitive) {
            word1 = this.word.toLowerCase();
            word2 = o.word.toLowerCase();
        } else {
            word1 = this.word;
            word2 = o.word;
        }
        
        int result = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        int numOfComparisons = len1 < len2 ? len1 : len2;
        
        for (int i=0; i<numOfComparisons; i++) {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            if (ch1 != ch2) {
                if (ch1 > ch2) {
                    result = 1;
                    break;
                } else { 
                    result = -1;
                    break;
                }
            } else if (i == numOfComparisons-1) {
                if (len1 == len2) {
                    result = 0;
                    break;
                } else {
                    result = len1 == numOfComparisons ? -1 : 1;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return word;
    }

}