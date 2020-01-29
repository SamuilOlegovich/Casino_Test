public class Generator {
    private Field field;


    public void generatorEndOfField() {
        field.setCenterAndOfField((int) (51 + Math.random() * 3));
    }

    public void generatorStartOfField() {
        field.setCenterStartOfField((int) (47 + Math.random() * 3));
    }

    public void setField(Field field) {
        this.field = field;
    }
}
