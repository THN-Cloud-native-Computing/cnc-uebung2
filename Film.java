public class Film {

	private String figur;
	private String titel;
	private int jahr;
	private static int anzahlFilme = 0;
	

	public String getFigur() {
		return figur;
	}

	public void setFigur(String figur) {
		this.figur = figur;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}

	public static int getAnzahlFilme() {
		return anzahlFilme;
	}

	public static void setAnzahlFilme(int anzahlFilme) {
		Film.anzahlFilme = anzahlFilme;
	}


	public Film(String titel, String figur, int jahr){
		
		this.figur = figur;
		this.titel = titel;
		this.jahr = jahr;
		anzahlFilme++;
	}
	

	public Film(){
		this("kein Titel", "keine Figur", 0);
	}


	public void print(){
		System.out.println("Titel: "+titel);
		System.out.println("Figur: "+figur);
		System.out.println("Jahr: "+jahr);
	}
	
	
}
