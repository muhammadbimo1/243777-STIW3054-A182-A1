public class UseCase{
   private String name;
   private int complexity;
   
   UseCase(String name, int complexity){
      this.name = name;
      this.complexity = complexity;
   }
   public String getName(){
      return name;
   }
   public int getComplexity(){
      return complexity;
   }
   public void setName(){
      this.name = name;
   }
   public void setComplexity(){
      this.complexity = complexity;
   }
}
