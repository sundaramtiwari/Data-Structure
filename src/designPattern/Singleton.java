/**
 * 
 */
package designPattern;

/**
 * @author sundaramtiwari
 *
 */
public class Singleton {

	private static final Singleton instance = new Singleton();

	private Singleton() {
		throw new IllegalStateException();
	}
}

