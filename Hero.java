
public class Hero {
    protected String name, img;
    protected int hp, distance;
    public  Hero(String newName, int newHp, int newDistance) {
        this.name = newName;
        setDistance(newDistance);
        setHp(newHp);
    }
    public void setHp(int hp1){
        this.hp = hp1;
    }
    public int getHp(){
        return this.hp;
    } 
    public void setDistance(int distance1){
        this.distance = distance1;
    }
    public int getDistance(){
        return this.distance;
    } 
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setImg(String newImg){
        img = newImg;
    }
    public String getImg(){
        return img;
    }
}