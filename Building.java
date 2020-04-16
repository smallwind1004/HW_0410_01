
public class Building {
    protected int hp, dp, distance, width, height;
    protected String imgName;

    public Building(String newImgName, int newHp, int newDp, int newDistance) {
        this.imgName = newImgName;
        this.dp = newDp;
        setDistance(newDistance);
        setHp(newHp);
    }

    public void setHp(int hp1) {
        this.hp = hp1;
    }

    public int getHp() {
        return this.hp;
    }

    public void setDistance(int distance1) {
        this.distance = distance1;
    }

    public int getDistance() {
        return this.distance;
    }
}