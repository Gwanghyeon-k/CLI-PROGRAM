public class ExeFile extends File{
  String osType;
  boolean executable;

  void run() throws Exception {
    System.out.println(fileName + " 프로그램 실행 중");

    // 1%씩 전부 다운로드 현황을 추가하면 너무 길어질 거 같아서 10 단위로 설정
    for(int i = 0; i <=100; i += 10) {
      System.out.println(fileName + " " + i + "% 응용 프로그램 실행 중...");
      Thread.sleep(300);
    }
  }
}
