/**
 * 
 */
package array;

/**
 * @author sundaramtiwari
 *
 */
public class IsoMorphic_Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "asdfssd";
		String str2 = "efdseed";

		System.out.println(isIsomorphic(str1, str2));
	}

	private static boolean isIsomorphic(String s, String t) {
		if (s == null || t == null) {
			return false;
		}
		if (s.length() != t.length()) {
			return false;
		}
		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();
		
		for(int i=0; i<sarr.length; i++) {
			int j=i;
			while (j<sarr.length-1 && sarr[j] == sarr[j+1]) {
				if (tarr[j] == tarr[j+1]) {
					j = j+1;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
