public class Camera implements Printable {

private String details;

public Camera(String details) {
  this.details = details;
}

public String printDetails() {
  return this.details;
}

}