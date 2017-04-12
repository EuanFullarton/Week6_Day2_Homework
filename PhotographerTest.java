import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;
  Printable printable;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera("Panasonic, £175");
    analogCamera = new AnalogCamera("Sony, £150");
    HashMap<String, Integer> journal = new HashMap<String, Integer>();

    journal.put("Monday", 1);
    journal.put("Tuesday", 1);
    journal.put("Wednesday", 1);
    journal.put("Thursday", 1);
    journal.put("Friday", 1);
    journal.put("Saturday", 1);
    journal.put("Sunday", 1);

  }

  @Test
  public void camerasStartsEmpty() {
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canAddCamera() {
    photographer.addCamera(printable);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    photographer.removeCamera(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void cameraCanPrintDetails() {
    assertEquals("Panasonic, £175", digitalCamera.printDetails());
  }

  @Test
  public void photographerCanPrintDetailsOfAllCamerasOwned() {
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    assertEquals("Panasonic, £175Sony, £150", photographer.printCameraList());
  }


}