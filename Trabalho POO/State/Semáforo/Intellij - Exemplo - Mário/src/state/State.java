package state;

public interface State {
    public State pegarCogumelo();

    public State pegarEstrela();

    public State pegarflordeFogo();

    public State colidirComInimigo();

    public State retornarTipo();
}
