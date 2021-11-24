package project_kassenbon.model;

import java.util.Collection;

/**
 * 
 * @author CC_Dozent
 *
 * @param <T> Boneinträge
 * @param <U> Verkäufer
 * @param <V> Laden
 */
public interface IBon<T, U, V> {
	public void setVerkaeufer(U element);
	public void setLaden(V element);
	public void addEintrag(T element);
	public default void removeEintrag(T element) {
		
	}
	public default void resetEintraege() {
		
	}
	public Collection<T> getEintraege();
	public String verkaueferToString();
	public String ladenToString();
	public String bonToString();
}
