package demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    /**
     * Format of Test case name ?
     *    + ClassABCTest.CaseABCTest
     *    + Case001Test
     *    + Case name  + input + expected result
     *    + Method + input + expected result
     *    + Method + expected result
     */

    @Test
    public void ค้นหาหนังสือรหัส_1000_ต้องได้ข้อมูลหนังสือ_Potter_part_1_ราคา_8_บาท() {
        // Arrange
        Book book = new Book();
        // Act
        Book foundBook = book.findById(1000);
        // Assert
        assertEquals("Potter part 1", book.getName());
        assertEquals(8, foundBook.getPrice(), 0.0001);
    }

    @Test
    public void ค้นหาหนังสือรหัส_1000_ต้องได้ข้อมูลหนังสือ_Potter_part_1_ราคา_2_บาท() {}

    @Test
    public void ค้นหาหนังสือรหัส_1000_ต้องได้ข้อมูลหนังสือ_Potter_part_1_ราคา_3_บาท() {}
}