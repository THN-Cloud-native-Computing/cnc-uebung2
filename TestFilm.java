public class TestFilm {

	public static void main(String[] args) {
		
		Film f1 = new Film("Herr der Ringe", "Gandalf", 2001);
		Film f2 = new Film("Star Trek", "Mr. Spock", 1966);
		Film f3 = new Film();
		
		
		f1.print();
		f2.print();
		f3.print();
		
		
		System.out.println("Anzahl Filme: " +Film.getAnzahlFilme());

	}

}