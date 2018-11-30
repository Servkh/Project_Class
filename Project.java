public class Project{
    private String name;
    private String description;
    private Double initialCost;

    public Project(){
    }
    public Project(String name){
        this.name=name;
    }
    public Project(String name,Double cost,String desc){
        this.name=name;
        this.description=desc;
    }

    //getter
    public String elevatorPitch(){
        return this.name+" : "+this.description;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String desc){
        this.description=desc;
    }
    
    public void setCost(Double cost){
        this.initialCost=cost;
    }


}
