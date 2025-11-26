package org.example.exercicioFacade2;

public class CadastroUsuarioFacade {
    private ValidadorDados validador;
    private UsuarioService usuarioService;
    private EmailService emailService;
    private LogService logService;

    public CadastroUsuarioFacade() {
        this.validador = new ValidadorDados();
        this.usuarioService = new UsuarioService();
        this.emailService = new EmailService();
        this.logService = new LogService();
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        System.out.println("\n=== Iniciando cadastro para: " + usuario.getNome() + " ===");


        if (!validador.validar(usuario)) {
            logService.registrar("Dados inválidos para: " + usuario.getNome());
            return false;
        }


        if (usuarioService.cpfExiste(usuario.getCpf())) {
            logService.registrar("CPF já cadastrado: " + usuario.getCpf());
            return false;
        }

        usuarioService.salvar(usuario);

        emailService.enviarBoasVindas(usuario.getEmail());

        logService.registrar("Usuário cadastrado com sucesso: " + usuario.getNome());

        System.out.println("=== Cadastro concluído ===");
        return true;
    }
}