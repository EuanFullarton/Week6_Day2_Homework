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

  @Test
  public void canAddCamera() {
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(camera);
    photographer.addCamera(camera);
    photographer.removeCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void cameraCanPrintDetails() {
    camera.printDetails(camera);
    assertEquals("Nikon", camera.printDetails("Nikon"));
  }


}