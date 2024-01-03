import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class TodoItem {
    @Getter @Setter
    private int id;

    @Getter @Setter
    private Date date;

    @Getter @Setter
    private static int noofthetodo=1;

    @Getter @Setter
    private String Description;

    TodoItem(String desc){
        this.date=new Date();
        this.id=noofthetodo++;
        this.Description=desc;
    }

    TodoItem(int id,String desc)
    {
        this.date=new Date();
        this.id=id;
        this.Description=desc;
    }








}
