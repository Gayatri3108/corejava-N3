package AccesSpecifierExample;

public class AccesSpecifier {
      private String name;
      public void display()
      {
    	  System.out.println("the name is:"+name);
      }
      public String getName() {
    	  return name;
      }
      public void setName(String name) {
    	  this.name=name;
      }
}
