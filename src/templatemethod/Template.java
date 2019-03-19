package templatemethod;

public abstract class Template {
    public void TemplateMethod(){
        methodA();
        methodB();
    }
    public abstract void methodA();
    public abstract void methodB();
}
