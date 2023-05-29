package data;

public class Usuario {

    private int idusuario;
    private String nome;
    private String senha;
    private String endereco;
    private String telefone;
    private String estado;
    private double altura;
    private String cep;
    private String cpf;
    private double peso;
    private double pesoIdeal;
    private String sexo;
    private String login;
    private String email;

    public Usuario() {
    }

 
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPesoIdeal() { // AQUI O USUÁRIO NÃO VAI INSERIR VAI CALCULAR AUTOMATICAMENTE E MANDAR PRO BANCO.
        pesoIdeal = peso / (altura * altura); // AI QUANDO ELE(A) FIZER O LOGIN VAI APARECER O PESO IDEAL PRA CADA PESSOA -- TEM QUE TESTAR.
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
