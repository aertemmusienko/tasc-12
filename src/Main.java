
public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);

        library.addBook(new Book("Майстер і Маргарита", "Михайло Булгаков", 1967));
        library.addBook(new Book("1984", "Джордж Орвелл", 1949));
        library.addBook(new Book("Тарас Бульба", "Микола Гоголь", 1835));
        ffff();

        System.out.println("Усі книги в бібліотеці:");
        library.displayBooks();
        ffff();

        System.out.println("Пошук за автором 'Джордж Орвелл':");
        library.searchByAuthor("Джордж Орвелл");
        ffff();

        System.out.println("Кількість книг у бібліотеці: " + library.getBookCount());
        ffff();

        library.removeBook("1984");
        System.out.println("Кількість книг після видалення: " + library.getBookCount());
        ffff();

    }
    public static void ffff(){
        System.out.println("==========================================");
    }

//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/aertemmusienko/tasc-12.git
//    git push -u origin main

}