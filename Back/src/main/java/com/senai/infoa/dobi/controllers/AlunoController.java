package com.senai.infoa.dobi.controllers;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoService alunoService;

     @PostMapping("/cadastrar")
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }

   @PostMapping("/login")
    public Aluno login(@RequestParam String cpf, @RequestParam String matricula) {
        return alunoService.login(cpf, matricula);
    }

     @PutMapping("/atualizar/{id}")
    public Aluno atualizar(@PathVariable Integer id, @RequestBody Aluno aluno) {
        return alunoService.atualizar(aluno, id);
        
    }

    @GetMapping("/listar")
    public List<Aluno> listarTodos() {
        return alunoService.listarTodos();
    }

     @GetMapping("/buscar/{id}")
    public String buscar(@PathVariable Integer id) {
        boolean buscou = alunoService.buscar(id);
        if (buscou) {
            String texto = "Aluno " + id + "encontrado com sucesso";
            return texto;
        }
        return "Falha ao buscar o admin";
    }

    @DeleteMapping("/delete/{id}")
    public String apagar(@PathVariable Integer id) {
        boolean deletou = alunoService.apagar(id);
        if (deletou) {
            return "Aluno removido com sucesso";
        }
        return "Falha ao remover o aluno";
    }
}
