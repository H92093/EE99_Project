import java.util.Locale;
import java.util.Scanner;

public class Input {
    private Manager manager;
    private Scanner sc = new Scanner(System.in);

    public Input(Manager manager){
        this.manager = manager;
    }

    private void processBuilding(String[] split){
        if(split[1].toLowerCase(Locale.ROOT).equals("mill"))
            manager.buildMill();
        else if(split[1].toLowerCase(Locale.ROOT).equals("fabric"))
            manager.buildFabricWeaving();
        else if(split[1].toLowerCase(Locale.ROOT).equals("milk"))
            manager.buildMilkPacking();
        else if(split[1].toLowerCase(Locale.ROOT).equals("bakery"))
            manager.buildBakery();
        else if(split[1].toLowerCase(Locale.ROOT).equals("tailoring"))
            manager.buildTailoring();
        else if(split[1].toLowerCase(Locale.ROOT).equals("ice"))
            manager.buildIceCreamWorkshop();
        else
            System.out.println("Invalid build order!!!");
    }

    private void processWorking(String[] split){
        if(split[1].toLowerCase(Locale.ROOT).equals("mill"))
            manager.working("Mill");
        else if(split[1].toLowerCase(Locale.ROOT).equals("fabric"))
            manager.working("FabricWeaving");
        else if(split[1].toLowerCase(Locale.ROOT).equals("milk"))
            manager.working("MilkPacking");
        else if(split[1].toLowerCase(Locale.ROOT).equals("bakery"))
            manager.working("Bakery");
        else if(split[1].toLowerCase(Locale.ROOT).equals("tailoring"))
            manager.working("Tailoring");
        else if(split[1].toLowerCase(Locale.ROOT).equals("ice"))
            manager.working("IceCreamWorkshop");
    }

    public void run(){
        String input;
        while (!(input = sc.nextLine()).equalsIgnoreCase("LOG OUT")){
            if(input.toLowerCase(Locale.ROOT).startsWith("build"))
                processBuilding(input.split("\\s"));
            else if(input.toLowerCase(Locale.ROOT).startsWith("work"))
                processWorking(input.split("\\s"));
        }
    }
}
