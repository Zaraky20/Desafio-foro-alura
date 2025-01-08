package foro.hub.api.domain.topico;

import foro.hub.api.domain.topico.Estado;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record DatosTopicos(
        Long id,
        @NotBlank String titulo,
        @NotBlank String mensaje,
        LocalDateTime fechaCreacion,
        @NotBlank Estado estado,
        @NotBlank String usuario,
        @NotBlank String curso
) {
}
