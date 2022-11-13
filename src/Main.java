public class Main {
    public static void main(String[] args) {
        System.out.println("Билет №5:");
        System.out.println("Дан массив пар названий книг и авторов, необходимо привести каждую пару " +
                "в строку вида: «Название книги» И.О.Автора.");

        String[] library = new String[]{"Shuggie Bain", "Doug lasStuart", "The Mirror and the Light", "Hilary Mantel",
                "Transcendent Kingdom", "Yaa Gyasi", "The Glass Hotel", "Emily St. John Mandel"};
        System.out.println();

        for (int i = 0; i < library.length; i++) {
            if (i % 2 != 0) {
                System.out.println(library[i] + ".");
            } else {
                System.out.print("\"" + library[i] + "\" ");
            }
        }
    }
}