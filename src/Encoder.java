import java.util.List;

public class Encoder extends ProcessingObject {

//    private List<Character> changedList;

    public Encoder() {
        changedList = encryption(inputList);
    }

    public List<Character> encryption(List<Integer> inputList) {
        UserInteraction uI = new UserInteraction();
        Alphabet alphabet = new Alphabet();
        FileProcessing fileProcessing = new FileProcessing();
        for (Integer integer : inputList) {
            if (alphabet.alphaList.contains(integer)) {
                changedList.add((char) (((int) integer) + fileProcessing.code));
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
