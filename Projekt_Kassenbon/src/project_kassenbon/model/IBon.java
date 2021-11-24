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
		System.out.println("removeEintrag Default Method called");
	}
	public default void resetEintraege() {
		System.out.println("resetEintraege Default Method called");
	}
	public Collection<T> getEintraege();
	public String verkaueferToString();
	public String ladenToString();
	public String bonToString();
}
