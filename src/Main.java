import java.util.HashMap;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,TodoItem> Hmap=new HashMap<Integer,TodoItem>();

        System.out.println("Welcome to Todo App");
        Scanner input=new Scanner(System.in);
        int val;
        do{

            System.out.println("1.Create Todo");
            System.out.println("2.Show aLL Todos");
            System.out.println("3.Get Todo By Id");
            System.out.println("4.Edit Todo");
            System.out.println("5.Delete Todo");
            System.out.println("6.Exit App");
            System.out.println("Enter ur Choice:");
            Scanner space=new Scanner(System.in);
            val=input.nextInt();
            switch(val)
            {
                case 1:
                    Scanner inp=new Scanner(System.in);
                    System.out.println("Enter Todo : ");
                    String description=inp.next();
                    TodoItem tdo=new TodoItem(description);
                    Hmap.put(tdo.getId(),tdo);
                    System.out.println("Todo created successfully");
                    space.nextLine();
                    break;
                case 2:
                    System.out.println("All Todos");
                    for(TodoItem todo:Hmap.values())
                    {
                        System.out.println(todo.toString());
                    }
                    space.nextLine();
                    break;
                case 3:
                    System.out.println("Enter Todo Id : ");
                    Scanner intt=new Scanner(System.in);
                    int id=intt.nextInt();
                    for(TodoItem i:Hmap.values())
                    {
                        if(id==i.getId())
                        {
                            System.out.println(i.toString());
                        }
                    }
                    space.nextLine();
                    break;
                case 4:
                    System.out.println("Enter Todo Id:");
                    Scanner sc=new Scanner(System.in);
                    int todoid=sc.nextInt();
                    if(Hmap.containsKey(todoid))
                    {
                        Scanner wrds=new Scanner(System.in);
                        System.out.println("Id Found");
                        System.out.println("Enter Description:");
                        String Desc=wrds.nextLine();
                        TodoItem edittodo=new TodoItem(todoid,Desc);
                        Hmap.put(todoid,edittodo);
                        System.out.println("Todo Updated Successfully");
                    }
                    else{
                        System.out.println("Todo not found");
                    }
                    space.nextLine();
                    break;
                case 5:
                    System.out.println("Enter Todo Id");
                    Scanner scs=new Scanner(System.in);
                    int deleteid=scs.nextInt();
                    if(Hmap.containsKey(deleteid))
                    {
                        Hmap.remove(deleteid);
                        System.out.println("Todo Deleted");
                    }
                    else{
                        System.out.println("Todo not found");
                    }
                    space.nextLine();
                    break;
                case 6:
                    System.out.println("Existing");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Plz,choose crt option");

            };


        }while(val!=6);
    }
}