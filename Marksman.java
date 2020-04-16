
public class Marksman extends Hero implements Attack, Defence {
    public Marksman(String newName, int newHp, int newDistance) {
        super(newName, newHp, newDistance);
    }

    /*----Attack----*/
    public void attack() {
        hp = hp - (int) (hp - 0.09f);
    }

    public void attackBuilding() {
        hp = hp - (int) (hp - 0.08f);
    }

    public void setAttackPower(float power) {

    }

    public int armyDistance() {
        return getDistance();
    }

    public void showAnimation() {

    }

    /*----Defance----*/
    public void Armor_Resistance() {
        
    }

    public void Magic_Resistance() {

    }
}