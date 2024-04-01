public class FileChangeFactory {
    public ProcessingObject getFileChangeFactory(int number){
        return switch (number){
            case 1 -> new Encoder();
            case 2 -> new Decoder();
            default -> throw new IllegalArgumentException("Неверное число");
        };
    }
}
