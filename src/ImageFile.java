public class ImageFile extends File {
  int width;
  int height;
  String imageType;

  void showImage() {
    System.out.println("이미지 파일 출력");
  }

  void convertType(String type) {
    imageType = type;
    System.out.println("파일 형식이 " + type + "로 변환되었습니다.");
  }
}
