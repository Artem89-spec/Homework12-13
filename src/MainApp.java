public class MainApp {
    public static void main(String[] args) {

        Author hugh = new Author("Hugh", "Howie");
        Author james = new Author("James", "Corey");

        Book shelter = new Book("Shelter", hugh,2010);
        Book leviathanWakes = new Book("Leviathan wakes", james, 2011);



        System.out.println(shelter.getTitle() + "; " + shelter.getAuthor() + "; " + shelter.getPublicationYear());
        System.out.println(leviathanWakes.getTitle() + "; " + leviathanWakes.getAuthor() + "; "
                + leviathanWakes.getPublicationYear());

        shelter.setPublicationYear(2011);
        System.out.println(shelter.getTitle() + "; " + shelter.getAuthor() + "; " + shelter.getPublicationYear());
    }
}