package Day2;

import org.testng.annotations.Test;

public class Login {
  @Test
  public void ValidData() {
	  System.out.println("Login with valid data");
  }
  
  @Test
  public void BlankData() {
	  System.out.println("Login with blank data");
  }
  
  @Test
  public void InvalidData() {
	  System.out.println("Login with invalid data");
  }
}
