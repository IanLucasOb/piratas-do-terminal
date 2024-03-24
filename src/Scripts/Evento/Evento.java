package Scripts.Evento;

abstract class Evento {
    
    /*
     * PROPRIEDADES
     */
    private String nome;

    /*
     * CONSTRUTOR
     */
    public Evento(String nome)
    {
        this.nome = nome;
    }

    /*
     * MÉTODOS
     */
    public abstract void Iniciar();

    /*
     * GETTERS E SETTERS
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
