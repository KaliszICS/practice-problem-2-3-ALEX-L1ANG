/*
Author: Alex Liang
Lesson: 2.3 - Creating Test Cases
Date Created: March 12, 2026
Date Last Modified: March 12, 2026
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void circleAreaTest1() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
   @Test
   void circleAreaTest2(){
      assertEquals(3.14, Math.PI,PracticeProblem.circleArea(1));
   }
   @Test 
   void circleAreaTest3(){
      assertEquals(Math.PI * 100 * 100, PracticeProblem.circleArea(100));
   }
   @Test
   void circleAreaTest4(){
      assertEquals(Math.PI * 2.5 * 2.5, PracticeProblem.circleArea(2.5));
   }
   @Test
   void circleAreaTest5(){
      assertEquals(Math.PI * 2 * 2, PracticeProblem.circleArea(2));
   }
   // End of Test Cases - Question 1

   @Test
   void minutesConversionTest1(){
      assertEquals(0 + " hours and " + 1 + " minutes", PracticeProblem.minutesToHours(1));
   }
   @Test
   void minutesConversionTest2(){
      assertEquals(7 + " hours and " + 30 + " minutes", PracticeProblem.minutesToHours(450));
   }
   @Test
   void minutesConversionTest3(){
      assertEquals(3 + " hours and " + 22 + " minutes", PracticeProblem.minutesToHours(202));
   }
   @Test
   void minutesConversionTest4(){
      assertEquals(0 + " hours and " + 39 + " minutes", PracticeProblem.minutesToHours(39));
   }
   @Test
   void minutesConversionTest5(){
      assertEquals(2 + " hours and " + 0 + " minutes", PracticeProblem.minutesToHours(120));
   }
   // End of Test Cases - Question 2

   @Test 
   void simpleInterestTest1(){
      assertEquals(50, PracticeProblem.simpleInterest(20, 25, 10));
   }
   @Test
   void simpleInterestTest2(){
      assertEquals(10000, PracticeProblem.simpleInterest(1000, 100, 10));
   }
   @Test
   void simpleInterestTest3(){
      assertEquals(4371.25, PracticeProblem.simpleInterest(672.5, 65, 10));
   }
   @Test
   void simpleInterestTest4(){
      assertEquals(1710.368, PracticeProblem.simpleInterest(248.6, 172, 4));
   }
   @Test
   void simpleInterestTest5(){
      assertEquals(0, PracticeProblem.simpleInterest(0, 1000, 1000));
   }
   // End of Test Cases - Question 3

   
}
