package workbook2.NeighborhoodLibrary;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedoutTo;


    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedoutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedoutTo = checkedoutTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedoutTo() {
        return checkedoutTo;
    }

    public void setCheckedoutTo(String checkedoutTo) {
        this.checkedoutTo = checkedoutTo;
    }
/* Next --
   -- Must make checkOut and CheckIn methods
   -- Make Array for 20 books at minimum
*/

    public String displayAvailableBooks() {

        return "Book ID: " + id +
                ", ISBN: " + isbn +
                ", Book Title: " + title;
    }
    public String displayCheckedOutBooks(){
        return "Book ID: " + id +
                ", ISBN: " + isbn +
                ", Book Title: " + title +
                ", Checked Out To: " + checkedoutTo;
    }
}
