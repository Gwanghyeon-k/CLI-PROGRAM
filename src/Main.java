import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    // 샘플 파일 목록
    ExeFile exeFile = new ExeFile();
    exeFile.fileName = "KakaoTalk.exe";
    exeFile.fileSize = 100.0;
    exeFile.osType = "Windows";

    ImageFile imageFile = new ImageFile();
    imageFile.fileName = "풍경.png";
    imageFile.fileSize = 2.5;
    imageFile.width = 1920;
    imageFile.height = 1080;
    imageFile.imageType = "png";

    ZipFile zipFile = new ZipFile();
    zipFile.fileName = "cli-program.zip";
    zipFile.fileSize = 25.5;
    zipFile.compressed = true;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("=== 다운로드 가능 파일 목록 ===");
    System.out.println("1. " + exeFile.fileName);
    System.out.println("2. " + imageFile.fileName);
    System.out.println("3. " + zipFile.fileName);
    System.out.print("다운로드할 파일 번호를 1개 입력하세요 (예: 1): ");

    int choice = Integer.parseInt(bufferedReader.readLine());

    File file;
    if (choice == 1) {
      file = exeFile;
    } else if (choice == 2) {
      file = imageFile;
    } else {
      file = zipFile;
    }
    file.download();

    System.out.println();
    System.out.println("다운로드 받은 파일 정보:");
    file.printInfo();

    processDownloadedFile(file, bufferedReader);
  }

  private static void processDownloadedFile(File file, BufferedReader bufferedReader) throws Exception {
    if (file instanceof ImageFile imageFile) {
      imageFile.showImage();
      System.out.print("변경할 이미지 포맷을 입력하세요 (예: jpg): ");
      imageFile.convertType(bufferedReader.readLine());
      return;
    }

    if (file instanceof ExeFile) {
      ((ExeFile) file).run();
      return;
    }

    if (file instanceof ZipFile) {
      ((ZipFile) file).unZip();
    }
  }
}