public class File {
  String fileName;
  Double fileSize;

  void download() {
    System.out.println("파일 다운로드 중...");
  }

  void printInfo() {
    System.out.println("파일명: " + fileName);
    System.out.println("파일 크기: " + fileSize);
  }
}
