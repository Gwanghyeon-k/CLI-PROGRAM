public class Main {

  public static void main(String[] args) {
    ImageFile image = new ImageFile();

    image.fileName = "dog.png";
    image.fileSize = 100.0;

    image.download();
    image.printInfo();
    image.showImage();
    image.convertType("jpg");
  }
}