package br.com.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // vai criar um construtor com esses dois argumentos
public class AuthCompanyDTO {
    
    private String password;
    private String username;
}
