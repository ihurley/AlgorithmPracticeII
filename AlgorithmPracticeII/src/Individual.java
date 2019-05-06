/**
 * Name: Izzy Hurley
 * Lab Name: Individual
 * Lab Purpose: The goal of Individual is to create a program
 * Date: 4/19/19
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class Individual {
    static int defaultGeneLength = 64;
   // 8-bit signed two's complement integer (-128 through 127)
    private byte [] genes = new byte[defaultGeneLength];
    private int fitness = 0;

    //A random individual

    public void newIndividual(){
        for (int i = 0; i < size(); i++) {
            byte gene = (byte) Math.round(Math.random());
            genes[i] = gene;
        }
    }


    // Use this if you want to create individuals with different gene lengths
    public static void setDefaultGeneLength(int length) {
        defaultGeneLength = length;
    }

    public byte getGene(int index) {
        return genes[index];
    }

    public void setGene(int index, byte value) {
        genes[index] = value;
        fitness = 0;
    }

    /* Public methods */
    public int size() {
        return genes.length;
    }

    public int getFitness() {
        if (fitness == 0) {
            fitness = FitnessCalc.getFitness(this);
        }
        return fitness;
    }

    @Override
    public String toString() {
        String geneString = "";
        for (int i = 0; i < size(); i++) {
            geneString += getGene(i);
        }
        return geneString;
    }
}


