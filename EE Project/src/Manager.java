import java.util.ArrayList;

public class Manager {
    ArrayList<WorkShops> workShops = new ArrayList<>();
    ArrayList<Goods> goods = new ArrayList<>();
    final static int COINS_AT_FIRST = 2000;
    static int coins = COINS_AT_FIRST;

   public void buildMill(){
           workShops.add(new WorkShops("Mill",150,4));
    }

    public void buildFabricWeaving(){
        workShops.add(new WorkShops("FabricWeaving",250,5));
    }

    public void buildMilkPacking(){
       workShops.add(new WorkShops("MilkPacking",400,6));
    }

    public void buildBakery(){
        workShops.add(new WorkShops("Bakery",250,5));
    }

    public void buildTailoring(){
        workShops.add(new WorkShops("Tailoring",400,6));
    }

    public void buildIceCreamWorkshop(){
        workShops.add(new WorkShops("IceCreamWorkshop",550,7));
    }

    public WorkShops getWorkshopByName(String name){
        for(WorkShops workShops : workShops){
            if(workShops.getWorkshopName().equals(name))
                return workShops;
        }
        return null;
    }
    public void working(String name){
        WorkShops workShop = getWorkshopByName(name);
        if(workShop.getIsWorking())
            System.out.println("This workshop is already working!");
        else if(workShop.getCost() > coins)
            System.out.println("You don't have enough coins!");
        else{
            workShop.setWorkingTrue();
            workShop.setPassedTime();
        }
    }





}


