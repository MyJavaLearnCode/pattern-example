package pattern.creat.prototype;

public abstract class Prototype {
    protected String detail = "";

    abstract Prototype copy();

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
