import java.util.List;

public class Decoder extends ProcessingObject {

//    private List<Character> changedList;

    public Decoder() {
        changedList = decryption(inputList);
    }

    public List<Character> decryption(List<Integer> inputList) {
        UserInteraction uI = new UserInteraction();
        Alphabet alphabet = new Alphabet();
        FileProcessing fileProcessing = new FileProcessing();

        for (Integer integer : inputList) {
            if (alphabet.alphaList.contains((int) integer - fileProcessing.code)) {
                changedList.add((char) (((int) integer) - fileProcessing.code));
            } else {
                changedList.add((char) ((int) integer));
            }
        }
        return changedList;
    }

//    public List<Character> getChangedList() {
//        return changedList;
//    }
}
