import java.util.Random;

// Step 1: Create the abstract parent class
abstract class Animal {
    // You can add shared attributes or methods here if needed
    // An abstract method for toString() can be helpful for visualization
    public abstract String toString();
}

// Step 2: Create the concrete animal classes
class Bear extends Animal {
    @Override
    public String toString() {
        return "B";
    }
}

class Fish extends Animal {
    @Override
    public String toString() {
        return "F";
    }
}

// Main class to run the simulation
public class Ecosystem {
    private Animal[] river;
    private Random random;

    public Ecosystem(int riverSize) {
        this.river = new Animal[riverSize];
        this.random = new Random();
        for(int i = 0; i < riverSize; i++){
            if(random.nextInt() % 50 > 24){
                Bear b = new Bear();
                this.river[i] = b;
            }
            else{
                Fish f = new Fish();
                this.river[i] = f;
            }
        }
        // You can add logic here to initially populate the river
    }

    public void runStep() {
        // This is the core logic for a single time step.
        // 1. Create a new array for the next state.
        // 2. Iterate through the current river array.
        // 3. For each animal, decide its next move.
        // 4. Handle collisions and place animals in the new array.
        // 5. Replace the old river with the new one.
        Animal[] nextStep = new Animal[river.length];

        for(int i = 0; i < river.length; i++){
            Animal cur = river[i];
            if(cur == null){}
            int LeftOrRight = random.nextInt(3) - 1;
            int maxIndex = Math.min(river.length - 1, i + LeftOrRight);
            int WhereTo = Math.max(0, maxIndex);
            if(nextStep[WhereTo] == null){
                nextStep[WhereTo] = cur;
            }
            else{
                Animal in = nextStep[WhereTo];
                if(in instanceof Fish && cur instanceof Fish){
                    nextStep[WhereTo] = in;
                    boolean newFishYetToSpawn = true;
                    while(newFishYetToSpawn) {
                        int target = random.nextInt(nextStep.length - 1 );
                        if (nextStep[target] == null){
                            nextStep[target] = new Fish();
                            newFishYetToSpawn = false;
                        }
                    }
                }
                else if(in instanceof Bear && cur instanceof Bear){
                    nextStep[WhereTo] = in;
                    boolean newBearYetToSpawn = true;
                    while(newBearYetToSpawn) {
                        int target = random.nextInt(nextStep.length - 1 );
                        if (nextStep[target] == null){
                            nextStep[target] = new Bear();
                            newBearYetToSpawn = false;
                        }
                    }
                }
                else if(cur instanceof Bear){
                    nextStep[WhereTo] = cur;
                }
            }
        }
        river = nextStep;
    }

    public void visualize() {
        for (Animal animal : river) {
            System.out.print(animal == null ? "-" : animal.toString());
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ecosystem eco = new Ecosystem(20); // Create a river of size 20
        eco.visualize();
        for(int i = 0; i < 20; i++){
            eco.runStep();
            eco.visualize();
        }
        // Loop to run multiple steps...
    }
}