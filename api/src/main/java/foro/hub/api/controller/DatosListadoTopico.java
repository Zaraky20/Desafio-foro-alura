package foro.hub.api.controller;

import foro.hub.api.domain.topico.Topico;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaCreacion,
        String estado,
        String usuario,
        String curso
                                 ) {
    public DatosListadoTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                String.valueOf(topico.getFechaCreacion().toLocalDate()),
                topico.getEstado().toString(),
                topico.getUsuario(),
                topico.getCurso()
        );
    }

}
