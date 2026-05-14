public class Main {

  public static void main(String[] args) throws Exception {
    ExeFile exeFile = new ExeFile();

    exeFile.fileName = "KakaoTalk.exe";
    exeFile.fileSize = 100.0;
    exeFile.osType = "Windows";

    exeFile.printInfo();
    exeFile.download();

    System.out.println(exeFile.fileName + " 다운로드 완료");
    System.out.println();

    exeFile.run();
    System.out.println(exeFile.fileName + " 실행 성공");
  }
}