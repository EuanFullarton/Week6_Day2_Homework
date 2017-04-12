import java.util.*;

public class Photographer {

  private ArrayList<Printable> cameraList;
  private HashMap<String, Integer> journal;

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

  public void addToJournal(String day, Integer numberOfPhotos) {
    journal.put(day, numberOfPhotos);
  }

  public Integer numberOfPhotos(String day) {
    return journal.get(day);
  }
  
    
  }