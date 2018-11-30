public class ProjectTest{
    public static void main(String []args){
        Project alpha= new Project("Project alpha","Earth is round");
        String info=alpha.elevatorPitch();
        System.out.println(info);
        
        Project beta= new Project();

        String betainfo=beta.elevatorPitch();
        System.out.println(betainfo);
        
        beta.setName("Beta");
        beta.setDescription("Earth is Flat");
        betainfo=beta.elevatorPitch();
        System.out.println(betainfo);
    }
}