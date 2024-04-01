import java.io.*;
import java.util.List;

public class FileProcessing {

    UserInteraction uI = new UserInteraction();
    public int code;
    public List<Integer> inputList= convertToList(uI.getInputFilePath());
    public  List<Integer> convertToList(String path){
        try (InputStream inputStream = new FileInputStream(path);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (bufferedReader.ready()){
                inputList.add(bufferedReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputList;

    }
    public void recordingChangedText(FileChangeFactory factory, int number){
        String changedFilePath = uI.getChangedFilePath();
        try {
            FileWriter writer = new FileWriter(changedFilePath);
            StringBuilder sb = new StringBuilder();
            for (Character character : factory.getFileChangeFactory(number).changedList) {
                sb.append(character.toString());
            }
            String str = sb.toString();
            writer.write(str);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
