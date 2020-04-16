
public class RiverCrab extends Neutral implements Defence, Restore, Enhance{
    private int ar, mr;
    public RiverCrab(int hp1){
        super(hp1);
    }
    /*----restore----*/
    public int restoreTime(){
        return 195;
    }
    /*----enhance----*/
    public void enhanceView(){
        System.out.println("give river view 2min");
    }
    /*----defence----*/
    public void Armor_Resistance(){
        ar = 60;
    }

    public void Magic_Resistance(){
        mr = 60;
    }
}