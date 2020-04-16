
public class DefenceTower extends Building implements Attack, Defence {
    public DefenceTower(String newImgName, int newHp, int newDp, int newDistance) {
        super(newImgName, newHp, newDp, newDistance);
    }

    /*----Attack----*/
    public void attack() {
        hp = hp - (int) (hp - 0.1f);
    }

    public void attackBuilding() {
        
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