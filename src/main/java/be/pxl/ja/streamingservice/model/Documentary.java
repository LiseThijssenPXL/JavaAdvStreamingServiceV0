package be.pxl.ja.streamingservice.model;

public final class Documentary extends Movie {



    private String topic;

    public Documentary(String title, Rating rating) {

        super(title, rating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void play(){
        System.out.println("Topic van de docu: " + this.topic);
    }

    public void pause(){
        System.out.println("Topic van de docu: " + this.topic);
    }
}
