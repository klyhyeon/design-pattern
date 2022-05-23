package com.baekho.design.pattern.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Book {

    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "(" +  author + ", " + title + ")";
    }
}

class BookShelf implements Cloneable { //함부로 외부에서 변경해선 안되는 객체, mark 인터페이스 Cloneable를 사용해줍니다.

    private List<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<>();
    }

    public void add(Book book) {
        if (book == null) {
            throw new NullPointerException("Book is null!");
        }
        shelf.add(book);
    }

    public List<Book> getShelf() {
        return shelf;
    }

    public void setShelf(List<Book> shelf) {
        this.shelf = shelf;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        //얕은 복사
//        return super.clone();
        //깊은 복사
        BookShelf another = new BookShelf();
        this.getShelf().forEach(b -> another.add(new Book(b.getAuthor(), b.getTitle())));

        return another;
    }

    public String toString() {
        return shelf.toString();
    }
}


public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShelf bookShelf = new BookShelf();

        bookShelf.add(new Book("김승호","돈의속성"));
        bookShelf.add(new Book("무라카미 하루키","해변의 카프카"));
        bookShelf.add(new Book("장 폴 사르트르","존재와 무1"));

        System.out.println(bookShelf);

        BookShelf anotherBookShelf = (BookShelf) bookShelf.clone();
        System.out.println("anotherBookShelf:: " +  anotherBookShelf);

        bookShelf.getShelf().get(0).setAuthor("한강");
        bookShelf.getShelf().get(0).setTitle("채식주의자");

        //주소를 복제해주는 얕은복사였기 때문에 같은 주소를 가리키고 있습니다.
        System.out.println(bookShelf);
        System.out.println("anotherBookShelf:: " +  anotherBookShelf);

        int[] original = {1,2,3,4,5};

        int[] clone = Arrays.copyOf(original, 3);

//        original[0] = -1;
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(clone));

        int[] systemClone = new int[5];
        System.arraycopy(original, 0, systemClone, 0, 3);
        System.out.println(Arrays.toString(systemClone));
    }
}
