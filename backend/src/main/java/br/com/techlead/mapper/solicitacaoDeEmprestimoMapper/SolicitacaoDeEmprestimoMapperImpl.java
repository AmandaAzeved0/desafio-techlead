package br.com.techlead.mapper.solicitacaoDeEmprestimoMapper;


import br.com.techlead.domain.Livro;
import br.com.techlead.domain.SolicitacaoDeEmprestimo;
import br.com.techlead.domain.Usuario;
import br.com.techlead.dto.response.SolicitacoesDeEmprestimoResponseDto;

import java.time.LocalDate;

public class SolicitacaoDeEmprestimoMapperImpl extends SolicitacaoDeEmprestimoMapper {
    @Override
    public SolicitacaoDeEmprestimo toEntity(
            Usuario usuario,
            LocalDate dataSolicitacao,
            String status,
            Livro livro, Integer quantidadeDias) {
        SolicitacaoDeEmprestimo entity = SolicitacaoDeEmprestimo.builder()
                .usuario(usuario)
                .livro(livro)
                .dataSoliciacao(dataSolicitacao)
                .status(status)
                .quantidadeDias(quantidadeDias)
                .build();
        return entity;
    }

    @Override
    public SolicitacoesDeEmprestimoResponseDto toDto(SolicitacaoDeEmprestimo solicitacao) {
        SolicitacoesDeEmprestimoResponseDto dto = SolicitacoesDeEmprestimoResponseDto.builder()
                .id(solicitacao.getId())
                .usuarioNome(solicitacao.getUsuario().getNome())
                .usuarioCpf(solicitacao.getUsuario().getCpf())
                .livroTitulo(solicitacao.getLivro().getEstoque().getTitulo())
                .dataSoliciacao(solicitacao.getDataSoliciacao())
                .status(solicitacao.getStatus())
                .diasSolicitados(solicitacao.getQuantidadeDias())
                .build();
        return dto;
    }

}
