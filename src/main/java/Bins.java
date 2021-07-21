import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class Bins {
    private int min;
    private int max;
    Integer[] sumOfRolls;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        this.sumOfRolls = sumOfRolls;
        this.sumOfRolls = new Integer[(max - min)+1];
        Arrays.fill(sumOfRolls,0);

    }
    public Integer getBin(int sum){
        int indexOfSum = sum - min;
        return sumOfRolls[indexOfSum];
    }
    public void incrementBin(int binIndex){
        int index = binIndex - min;
        sumOfRolls[index]++;
    }
}
