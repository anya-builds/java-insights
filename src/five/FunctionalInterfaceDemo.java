package five;

@FunctionalInterface
interface BookAction{
    void perform();
//    void performance();
}


// ()->{}
public class FunctionalInterfaceDemo {
    static void main(String[] args) {
        BookAction action=new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed");
            };

        };
        action.perform();
    }
}
