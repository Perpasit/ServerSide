package sit.int202.jcfreview;

import lombok.*;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString //(exclude = {"id"})
@EqualsAndHashCode (exclude = {"gpax"})
public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpax;
    //annonymous class use When order by other value without id
    public static final Comparator<Student> SORT_BY_GPAX_DESC = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getGpax() < o2.getGpax() ) {
                return  1; //desc
            } else if (o1.getGpax() > o2.getGpax()) {
                return -1;
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }
    };
    //When use TreSet
    @Override
    public int compareTo(Student o) {
        return  this.getId() - o.getId();
    }
}
