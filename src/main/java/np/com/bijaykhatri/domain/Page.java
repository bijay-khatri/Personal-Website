package np.com.bijaykhatri.domain;

import javax.persistence.*;

/**
 * Created by Bijay on 5/21/2016.
 */
@Entity
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    @Column(name="body", columnDefinition="TEXT")
    private String body;

    public Page() {

    }

    public Page(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

