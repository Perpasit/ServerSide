package sit.int202.jcfreview;

import java.util.Comparator;
public class StudentComparatorByGpaxDesc implements Comparator<Student>{

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
}
