public class Media {
    private String m;

    public Media() {
    }

    public Media(String m) {
        this.m = m;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return  "" + m;
    }
}
