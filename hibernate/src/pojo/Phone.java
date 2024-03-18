package pojo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity(name = "phone")
@Table(name = "phone")
public class Phone {
    @Id
    private int id;

    @Column(name = "type")
    private String type;
    @Enumerated(EnumType.ORDINAL)
    private PhoneType phoneType;

    @ElementCollection
    @JoinTable(name = "mobile_list",joinColumns = @JoinColumn(name = "mobile_id"))
    private List<String> list = new ArrayList<>();

    @ElementCollection
    private Map<Integer,String> typeToPhone = new HashMap<>();

    public Map<Integer, String> getTypeToPhone() {
        return typeToPhone;
    }

    public void setTypeToPhone(Map<Integer, String> typeToPhone) {
        this.typeToPhone = typeToPhone;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Embedded
    private Name name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }
}
