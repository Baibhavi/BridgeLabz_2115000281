package Day23.Annotations.BasicProblems;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("This is old feature");
    }
    public void newFeature(){
        System.out.println("This is new feature");
    }
    public static void main(String[] args) {
        LegacyAPI obj = new LegacyAPI();
        obj.newFeature();
        obj.oldFeature();
    }
}
