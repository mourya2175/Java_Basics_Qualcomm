package oops;

public class CBIT extends University{
    @Override
    public void library() {
        System.out.println("Library is big");
    }

    @Override
    public void playground() {
        System.out.println("Big playground");
    }

    public static void main(String[] args) {
        CBIT c = new CBIT();
        c.syllabus();
        c.library();
        c.playground();
    }
}
