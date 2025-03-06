package br.com.alura.screenmatch.excecao;

public class ConversionYearException extends RuntimeException {
    private String message;

    public ConversionYearException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
