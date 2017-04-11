public class Camera implements Printable {

private String name;

public Camera(String name) {
  this.name = name;
}

public String printDetails() {
  return this.name;
}

}