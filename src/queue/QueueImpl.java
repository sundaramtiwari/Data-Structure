/**
 * 
 */
package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sundaramtiwari
 *
 */
public class QueueImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<String> queueA = new LinkedList<String>();

		queueA.add("element 0");
		queueA.add("element 1");
		queueA.add("element 2");

		//access via Iterator
		Iterator<String> iterator = queueA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		}

		//access via new for-loop
		for(Object object : queueA) {
		    String element = (String) object;
		}
		
		System.out.println(queueA.toString());

	}

}
