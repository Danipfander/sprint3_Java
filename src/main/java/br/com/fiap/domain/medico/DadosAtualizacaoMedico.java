package br.com.fiap.domain.medico;

import jakarta.validation.constraints.NotNull;
import br.com.fiap.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
