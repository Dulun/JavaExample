package thread;

import java.util.Objects;

/**
 * Created by butter on 16-11-5.
 */
public class EnergySystem {

    private final double[] energyBoxes;
    private final Object lockObj = new Object();
    
    public EnergySystem(int n, double initialEnergy) {
        energyBoxes = new double[n];
        for(int i = 0; i < energyBoxes.length; i++){
            energyBoxes[i] = initialEnergy;
        }
    }



    public void transfer(int from, int to, double amount){
        synchronized (lockObj){
            //wait set
            while(energyBoxes[from] < amount){
                try{
                    lockObj.wait();
                }catch (InterruptedException e) {e.printStackTrace();}
            }



            System.out.print(Thread.currentThread().getName());
            energyBoxes[from] -= amount;
            System.out.printf("%d ->  %d : %10.2f\n", from, to, amount);
            energyBoxes[to] += amount;
            System.out.printf("energy sum : %10.2f\n", getTotalEnergies());
            lockObj.notifyAll();
        }
    }

    public double getTotalEnergies() {
        double totalEnergies = 0;
        for(double amount: energyBoxes) totalEnergies += amount;
        return totalEnergies;
    }

    public int getBoxAmount(){
        return energyBoxes.length;
    }
}
