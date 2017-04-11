import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameraList;

  public Photographer() {
    this.cameraList = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return cameraList.size();
  }

  public void addCamera(Printable camera) {
    cameraList.add(camera);
  }

  public void removeCamera(Printable camera) {
    cameraList.remove(camera);
  }

  public String printCameraList() {

    String cameras = "";

    for(Printable camera : this.cameraList) {
      cameras += camera.printDetails();
    } 
    return cameras;
  }

 

}