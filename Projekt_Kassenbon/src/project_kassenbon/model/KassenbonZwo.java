package project_kassenbon.model;

import java.util.Collection;

public class KassenbonZwo implements IBon<Artikel, String, String[]>{
	
	private Artikelliste art_liste;
	private String verkaeufer;
	private String[] laden;
	
	public KassenbonZwo(Artikelliste art_liste, String verkaeufer, String[] laden) {
		super();
		this.art_liste = art_liste;
		this.verkaeufer = verkaeufer;
		this.laden = laden;
	}

	@Override
	public void setVerkaeufer(String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLaden(String[] element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEintrag(Artikel element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection<Artikel> getEintraege() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verkaueferToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ladenToString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bonToString() {
		// TODO Auto-generated method stub
		return null;
	}

}
