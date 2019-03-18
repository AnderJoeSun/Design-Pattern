package decorator.decorator;

import decorator.component.Component;

public abstract class Decorator extends Component {
    private Component component;
    public void setComponent(Component component){
        this.component = component;
    }
}
