package rx.controls;

public class RXTextFieldDelete extends  RXTextFieldBase{
    private static final String DEFAULT_STYLE_CLASS = "rx-text-field-delete";
    private static final String USER_AGENT_STYLESHEET = RXTextFieldDelete.class.getResource("rx-controls.css")
            .toExternalForm();

    public RXTextFieldDelete() {
        getStyleClass().add(DEFAULT_STYLE_CLASS);
        setOnClickButton(e->{
            clear();
        });
    }

    public RXTextFieldDelete(String text) {
        this();
        setText(text);
    }
    @Override
    public String getUserAgentStylesheet() {
        return USER_AGENT_STYLESHEET;
    }
}
