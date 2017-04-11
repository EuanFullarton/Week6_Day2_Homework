import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    photographer = new Photographer();
    camera = new Camera();
  }

  @Test
  public void camerasStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }


}