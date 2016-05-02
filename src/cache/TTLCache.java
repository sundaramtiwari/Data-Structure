/**
 * 
 */
package cache;

import java.sql.Connection;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author sundaramtiwari
 *
 */
public class TTLCache {

	public static void main (String args[]) {
		Map<String, Connection> map = ExpiringMap.builder()
				  .expiration(30, TimeUnit.SECONDS)
				  .build();
	}
}
