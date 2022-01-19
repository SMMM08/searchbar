package searchbar.entity;

import javax.persistence.*;

@Entity
@Table
public class ContentHasActors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int contentId;
    private int actorId;

    public ContentHasActors() {
    }

    public ContentHasActors(int id, int contentId, int actorId) {
        this.id = id;
        this.contentId = contentId;
        this.actorId = actorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }
}
