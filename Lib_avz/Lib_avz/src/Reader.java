
public class Reader {
    private final String fio;
    private final String libraryCardNumber;
    private final String faculty;
    private final String birthDate;
    private final String phoneNumber;
    private int booksCount;

    public Reader(String fio, String  libraryCardNumber, String faculty, String birthDate, String phoneNumber, int booksCount) {
        this.fio = fio;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.booksCount = booksCount;
    }

    public String getFio() {
        return fio;
    }

    public String getlibraryCardNumber() {
        return libraryCardNumber;
    }

    public String getfaculty() {
        return faculty;
    }

    public String getbirthDate() {
        return birthDate;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

    public int getbooksCount() {
        return booksCount;
    }

    public void takeBook(int count) {
        if (count > 0) {
            booksCount += count;
            System.out.println("Количество книг у читателя: " + this.booksCount);
        }
        else {
            System.out.println("Количество книг должно быть положительным.");
        }

    }

    public void returnBook(int count) {
        if (count > 0 && count <= booksCount) {
            booksCount -= count;
            System.out.println("Количество книг у читателя: " + this.booksCount);
        }
        else {
            System.out.println("Количество книг должно быть положительным.");
        }
    }

    public void status() {
        System.out.println("Читатель: " + this.fio);
        System.out.println("Номер читательского билета: " + this.libraryCardNumber);
        System.out.println("Факультет: " + this.faculty);
        System.out.println("Дата рождения: " + this.birthDate);
        System.out.println("Номер телефона: " + this.phoneNumber);
        System.out.println("Количество книг у читателя: " + this.booksCount);
    }
}