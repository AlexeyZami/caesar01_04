import java.util.Scanner;

public class UserInteraction {
    FileChangeFactory factory = new FileChangeFactory();
    FileProcessing fileProcessing;

    public void interaction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию необходимо выполнить?");
        System.out.println("1 - зашифровать текст\n2 - расшифровать текст\n3 - взломать шифр (пока недоступно)");
        int input = scanner.nextInt();
        switch (input){
            case 1 -> {
                askTheUser();
                factory.getFileChangeFactory(1);
                fileProcessing.recordingChangedText(factory, input);
                resultPath();
            }
            case 2 -> {
                askTheUser();
                factory.getFileChangeFactory(2);
                fileProcessing.recordingChangedText(factory, input);
                resultPath();
            }
            default -> factory.getFileChangeFactory(3);
        }
    }

    private void resultPath() {
        System.out.println("Обработанный файл расположен по пути:\n" + getChangedFilePath());
    }

    private void askTheUser() {
        System.out.println("Введите путь к исходному файлу:");
        getInputFilePath();
        System.out.println("Введите числовой код:");
        getCode();
        System.out.println("Введите путь, где сохранить обработанный файл:");
        getChangedFilePath();
    }

    public String getInputFilePath(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String getChangedFilePath(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public int getCode(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
