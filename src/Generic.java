class Box<T> {
    private T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }
    public void setContent(T content) {
        this.content = content;
    }
    public <E> void printContent(E extraInfo) {
        System.out.println("Content: " + content + ", Extra: " + extraInfo);
    }
}
public class Generic {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("이것은 박스이다.");
        System.out.println(stringBox.getContent());
        stringBox.setContent("출력 실패");
        System.out.println(stringBox.getContent());
        stringBox.printContent(123);
    }
}