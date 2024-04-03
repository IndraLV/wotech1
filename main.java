// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    // winter, spring, summer, autumn
    // warm jacket, t-shirt, swimming siute, rain coat

    double temperature = 5;
   
    if (temperature < 5) {
      System.out.println("wear very warm");
    }
    else if (temperature >= 5 && temperature < 15) {
      System.out.println("wear warm");
    }
    else if (temperature >= 15 && temperature < 30) {
      System.out.println("wear normal");
    }
    else if (temperature >30) {
      System.out.println("go naked");
    }
    else {System.out.println("I don't recognize this seasom");
    }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
