import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameraList;

  public Photographer() {
    this.cameraList = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return cameraList.size();
  }

}