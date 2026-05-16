public class ZipFile extends File{
  boolean compressed;

  void unZip() throws Exception {
    System.out.println(fileName + " 압축 해제 시작");

    for(int i = 0; i <= 100; i += 20) {
      System.out.println(fileName + " " + i + "% 압축 해제 진행 됨");
      Thread.sleep(200);
    }
  }

}
