import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameraList;
  private HashMap journal;

  public Photographer() {
    this.cameraList = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
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

  public int numberOfPhotos() {

    int number = 0;

    for(Hashmap photos : this.journal) {
      number += photos.values();
    } 
    return number;
  }
  
    
  }