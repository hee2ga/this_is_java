package verify.Exam04;

public class Util {
	public static <P extends Pair<K, V>,K,V> V getValue(P p,K k) {
		if(p.getKey()==k) {
			return p.getValue();
		}
		return null;
	}
}
