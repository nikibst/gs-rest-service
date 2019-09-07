package myApi;

public class FeatureFeedback {

    private long id;
    private String content;

    public FeatureFeedback(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}