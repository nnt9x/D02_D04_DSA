package buoi2.hangdoi_photo;

public class Document {
    // Thuoc tinh
    private int code;
    private String content;
    // Phuong thuc khoi tao

    public Document(int code) {
        this.code = code;
    }

    public Document(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "code=" + code +
                ", content='" + content + '\'' +
                '}';
    }
}
