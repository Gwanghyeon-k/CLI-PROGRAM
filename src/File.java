public class File {
  String fileName;
  Double fileSize;

  void download() throws Exception {
    System.out.println(fileName + " 다운로드 시작");

    for(int i = 0; i <= 100; i += 10) {
      System.out.println(fileName + " " + i + "% 다운로드 중...");
      // 한 번의 다운로드 %가 출력되면 다운로드 느낌이 안나기 때문에 0.5초씩 기다리게 구현
      Thread.sleep(500);
    }

    System.out.println(fileName + " 다운로드 완료");
  }

  void printInfo() {
    System.out.println("파일명: " + fileName);
    System.out.println("파일 크기: " + fileSize);
  }
}
