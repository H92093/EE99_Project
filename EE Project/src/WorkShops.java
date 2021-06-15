public class WorkShops {
    private int cost;
    private int requiredTime;
    private boolean isWorking;
    private String workshopName;
    private int passedTime;

    public WorkShops(String workshopName,int cost,int requiredTime){
        this.workshopName = workshopName;
        this.cost = cost;
        this.requiredTime = requiredTime;
    }

    public String getWorkshopName(){return workshopName;}

    public int getCost(){return cost;}

    public boolean getIsWorking(){return isWorking;}

    public void setWorkingTrue(){this.isWorking = true;}

    public void setPassedTime(){this.passedTime = 0;}

    public boolean hasEnoughCoins(int coins){
        if(coins > this.cost)
            return true;
        else
            return false;
    }
}
