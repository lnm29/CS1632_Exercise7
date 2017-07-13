import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MonkeySimTest {
  
  @Test
  public void testSingleMonkeyGenerateId() {
    Monkey m = new Monkey();
    for (int n = 0; n < 100; n++) {
      assertEquals("Test Single Monkey generateID() Result", m.generateId(n), m.generateIdOld(n));
    }
  }
  
  @Test
  public void testMultipleMonkeysGenerateId() {
    for (int i = 0; i < 10; i++) {
      Monkey m = new Monkey();
      for (int n = 0; n < 10; n++) {
        assertEquals("Test Multiple Monkeys generateID() Result", m.generateId(n), m.generateIdOld(n));
      }
    }
  }
  
  @Test
  public void testSingleMonkeyGetFirstMonkey() {
    List<Monkey> ml = new ArrayList<Monkey>();
    ml.add(new Monkey());
    assertEquals("Test Single Monkey getFirstMonkey() Result", MonkeySim.getFirstMonkey(ml), MonkeySim.getFirstMonkeyOld(ml));
  }
  
  @Test
  public void testMultipleMonkeysGetFirstMonkey() {
    List<Monkey> ml = new ArrayList<Monkey>();
    for (int i = 0; i < 100; i++) {
      ml.add(new Monkey());
    }
    assertEquals("Test Multiple Monkeys getFirstMonkey() Result", MonkeySim.getFirstMonkey(ml), MonkeySim.getFirstMonkeyOld(ml));
  }
  
  
}