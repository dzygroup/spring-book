package cn.org.springbook.book.entity;

/**
 * 书籍付费类型
 *
 * @author 戴志勇
 */
public class BookPaymentTypeEntity {

    private Integer id;
    private String name; // 不超过40字
    private String description; // 500字

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
