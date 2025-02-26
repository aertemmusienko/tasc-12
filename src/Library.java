class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Книга додана: " + book.getTitle());
        } else {
            System.out.println("Бібліотека переповнена!");
        }
    }

    public void removeBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Книга видалена: " + title);
                return;
            }
        }
        System.out.println("Книгу не знайдено.");
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книгу не знайдено.");
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Книг цього автора немає.");
        }
    }

    public int getBookCount() {
        return count;
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("Бібліотека порожня.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }
}