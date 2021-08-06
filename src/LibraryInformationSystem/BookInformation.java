/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryInformationSystem;

/**
 *
 * @author shyam
 */
public class BookInformation {
    int bookId;
    String bookName;
    int numberOfBook;
    int avaliableBook;
    int priceOfBook;
    int studentId;
    String gender;
    String CategoryOfbook;
    String issueDate;
    String returnDate;

    public BookInformation(int bookId, String bookName, int numberOfBook,int avaliableBook, int priceOfBook, int studentId, String gender, String CategoryOfbook, String issueDate, String returnDate) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.numberOfBook = numberOfBook;
        this.avaliableBook=avaliableBook;
        this.priceOfBook = priceOfBook;
        this.studentId = studentId;
        this.gender = gender;
        this.CategoryOfbook = CategoryOfbook;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }
    
    
}
