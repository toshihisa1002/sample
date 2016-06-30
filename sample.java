import java.util.ArrayList;

class sample {
  public static ArrayList<String> name_list;
  public static void main(String[] args) {
    name_list = new ArrayList<String>();
    add();
    for (int i=0;i<name_list.size() ;i++ ) {
      System.out.println(name_list.get(i));
    }
  }
  public static void add(){
    name_list.add("toshi");
  }
}
