/**
 * Name: Izzy Hurley
 * Lab Name: Population
 * Lab Purpose: The goal of Population is to create a program
 * Date: 4/19/19
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class Population {
    Individual [] individuals;

    public Population(int populationSize, boolean initialise){
        individuals = new Individual[populationSize];
        if (initialise){
            for (int i = 0; i < size(); i++){
                Individual newIndividual = new Individual();
                newIndividual.newIndividual();
                saveIndividual(i,newIndividual);
            }
        }
    }

public Individual getIndividual(int index){
        return individuals[index];
}

public Individual getFittest(){
    Individual fitman = individuals[0];
    for (int i = 0; i< size(); i++){
        if (fitman.getFitness()<= getIndividual(i).getFitness()){fitman = getIndividual(i);}
    }
    return fitman;
}
public int size(){
    return individuals.length;
}

public void saveIndividual(int index, Individual in){
    individuals[index] = in;
}
}
