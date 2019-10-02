package rx.controls;

public class RXTextFieldCopy extends RXTextFieldBase{
    private static final String DEFAULT_STYLE_CLASS = "rx-text-field-copy";
    private static final String USER_AGENT_STYLESHEET = RXTextFieldCopy.class.getResource("rx-controls.css")
            .toExternalForm();

    public RXTextFieldCopy() {
        getStyleClass().add(DEFAULT_STYLE_CLASS);
        setOnClickButton(e->{
            selectAll();
            copy();
        });
    }

    public RXTextFieldCopy(String text) {
        this();
        setText(text);
    }

    @Override
    public String getUserAgentStylesheet() {
        return USER_AGENT_STYLESHEET;
    }


}
