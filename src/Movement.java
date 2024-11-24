import java.time.LocalDateTime;

public class Movement {
    private final String type;
    private final double value;
    private final LocalDateTime datetime;

    public Movement(double value, String type) {
        this.value = value;
        this.type = type;
        this.datetime = LocalDateTime.now().withNano(0);
    }

    @Override
    public String toString() {
        return "[" + datetime + "]" + type + ": R$" + value;
    }
}
