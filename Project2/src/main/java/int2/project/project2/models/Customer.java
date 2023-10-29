package int2.project.project2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private static int autoIncrementId = 1;

    private int id;
    private String name;
    private String phone;

    public Customer(String name, String phone) {
        this.id = autoIncrementId++;
        this.name = name;
        this.phone = phone;
    }
}

