package entidades;

public enum Mensajes {

    MENSAJE_NOTA_SEGUIMIENTO("Nota de seguimiento"),
    MENSAJE_NOTA_PARCIAL("Nota de parcial"),
    MENSAJE_NOTA_FINAL("Nota de examen final"),
    MENSAJE_PETICION_EXE("Excelente, tu rendimiento ha sido el mejor."),
    MENSAJE_PETICION_BIEN("Tu rendimiento es aceptable, pero finalizaste bien."),
    MENSAJE_PETICION_MAS("Te sugerimos comprometerte más con tu estudio."),
    MENSAJE_PETICION_MIN("Malas noticias, no cumpliste con el mínimo para avanzar."),
    MENSAJE_PETICION_DED("Nuevamente vuelve a iniciar tus estudios y dedícate."),
    MENSAJE_NOTA("Nota final: ");




    private String mensaje;

    Mensajes(String s) {
        this.mensaje=s;
    }

    public String getMensajes() {
        return mensaje;
    }
}
