package br.com.fiap.netxai.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FidelidadeClienteValidator implements ConstraintValidator<FidelidadeCliente, String> {
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.equals("FILIADO") || value.equals("NÃOFILIADO");
    }

}
