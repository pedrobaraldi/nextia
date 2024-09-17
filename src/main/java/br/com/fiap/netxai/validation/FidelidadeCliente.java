package br.com.fiap.netxai.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(FIELD)
@Constraint(validatedBy = FidelidadeClienteValidator.class)
@Retention(RUNTIME)
public @interface FidelidadeCliente {

    String message() default "Fidelidade inválida. Fidelidade deve ser FILIADO ou NÃOFILIADO.";

    Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
    
}
