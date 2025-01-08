package foro.hub.api.domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String usuario,
        String esatdo,
        java.time.LocalDate fechaCreacion
) {
}
