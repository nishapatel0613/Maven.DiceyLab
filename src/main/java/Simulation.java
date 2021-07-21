import java.util.Random;

public class Simulation {

    int numberOfDice;
    int numberOfRolls;

    public Simulation(int numberOfDice, int numberOfRolls) {
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
    }


    public Integer[] runSimulation(){
        Dice testDice = new Dice(numberOfDice);
        Bins testBins = new Bins(numberOfDice,numberOfDice + 6);

        for (int i = 0; i < numberOfRolls; i++) {
            int toss = testDice.tossAndSum();
            testBins.incrementBin(toss);
        }
        return testBins.sumOfRolls;
    }

    private void printResults(){
        Integer[] results = runSimulation();
        System.out.println("Simulation of two dice tossed for 1000000");

        for (int i = 0; i < results.length; i++) {
            int index = i + 2;
            int frequency = results[i];
            float percent = results[i]/this.numberOfRolls;
            int starValue = (int) (percent * 100);
            System.out.printf("%2d : %8d : 2f", index, frequency, percent);
            for (int j = 0; j < starValue; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}


