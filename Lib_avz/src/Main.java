//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Иванов Иван Иванович", "567687",
        "Математический факультет", "03-03-2005","8-909-678-23-12", 5);
        reader.status();

        reader.takeBook(3);
        reader.returnBook(2);
        reader.status();

        Reader reader1 = new Reader("Михайлов Михаил Михайлович", "789643",  "Физический факультет", "16-03-2007","8-904-874-76-32", 0);
        reader1.takeBook(3);
        reader1.returnBook(2);
        reader1.status();
    }

}