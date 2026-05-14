public class ImageFile extends File {
  int width;
  int height;
  String imageType;

  void showImage() {
    System.out.println("이미지 파일 출력");
  }

  void convertType(String type) {
    imageType = type;
    System.out.println("파일 형식 변환 완료");
  }
}
