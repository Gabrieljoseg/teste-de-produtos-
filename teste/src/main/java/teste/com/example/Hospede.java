package teste;


public class Hospede {
    private String nome;
    private String documentoIdentidade;
    private String contato;

    public Hospede(String nome, String documentoIdentidade, String contato) {
        this.nome = nome;
        this.documentoIdentidade = documentoIdentidade;
        this.contato = contato;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public String getDocumentoIdentidade() {
        return documentoIdentidade;
    }

    public String getContato() {
        return contato;
    }

    public void setDocumentoIdentidade(String documentoIdentidade) {
        this.documentoIdentidade = documentoIdentidade;
    }
    

    // Outros métodos conforme necessário
}