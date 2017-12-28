package models;

/**
 * 实体类
 */
public class Cat {

    private int id ;
    private  int age;
    private  String catName;


    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getCatName() {
        return catName;
    }
}
