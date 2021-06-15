public class Goods {
    private String name;
    private int timeToExpire;
    private int size;
    private int inventory;
    private boolean isInStorage;
    final static int EXPIRATION_TIME_FOR_PRIMARY = 4;
    final static int EXPIRATION_TIME_FOR_SECONDARY = 5;
    final static int EXPIRATION_TIME_FOR_FINAL = 6;

    public Goods(String name,int timeToExpire,int size){
        this.name = name;
        this.timeToExpire = timeToExpire;
        this.size = size;
    }

    public boolean isPrimary(String name){
        String[] primaries = {"egg","feather","milk"};
        for(int i = 0;i < 3;i++){
            if(primaries[i].equals(name))
                return true;
        }
        return false;
    }

    public boolean isSecondary(String name){
        String[] secondaries = {"egg","feather","milk"};
        for(int i = 0;i < 3;i++){
            if(secondaries[i].equals(name))
                return true;
        }
        return false;
    }

    public void addToInventory(Goods goods){
        this.inventory++;
    }
}
