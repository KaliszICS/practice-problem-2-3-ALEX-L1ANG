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

}
