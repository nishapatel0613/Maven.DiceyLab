public class SimulationMain {
    public static void main(String[] args) {
        Simulation sm = new Simulation(2,1000000);
        sm.runSimulation();
    }
    int numberOfDice;
    int numberOfRolls;
    Integer[] results;

    public SimulationMain(int numberOfDice, int numberOfRolls) {
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
}
