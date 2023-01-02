package B;

public class Fox {
    String vid;
    int age;
    String size;
    String color;
    String hasChild;
    String pol;
    String country;
    String alive;
    private ChildFox childFox;

    static class Builder{
        private Fox fox=null;
    public Builder() {
        fox = new Fox();
    }

    Builder withChild(ChildFox childFox){
        fox.childFox = childFox;
        return this;
    }

    Builder withAge(int age){
        fox.age = age;
        return this;
    }

    Builder withVid(String vid){
        fox.vid = vid;
        return this;
    }

    Builder withSize(String size){
        fox.size = size;
        return this;
    }

    Fox build(){
        return fox;
    }
}

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHasChild() {
        return hasChild;
    }

    public void setHasChild(String hasChild) {
        this.hasChild = hasChild;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlive() {
        return alive;
    }

    public void setAlive(String alive) {
        this.alive = alive;
    }
}
