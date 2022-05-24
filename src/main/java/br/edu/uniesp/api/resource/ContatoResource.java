package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Contato;
import br.edu.uniesp.api.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contato")
public class ContatoResource {

    @Autowired
    private ContatoService service;


    //POST localhost:8080/contato
        /*
      {
        "titulo": "Harry Fujioka"
      }
     */
    @PostMapping
    public Contato salvar(@RequestBody Contato contato){
        contato = service.salvar(contato);
        return contato;
    }

    //PUT localhost:8080/contato
    /*
      {
        "id": 3,
        "titulo": "AlterandoContato"
      }
     */
    @PutMapping
    public Contato atualizar(@RequestBody Contato contato) throws Exception {
        return service.atualizar(contato);
    }

    //GET localhost:8080/contato
    @GetMapping
    public List<Contato> listar(){
        return service.listar();
    }

    //DELETE localhost:8080/contato/3
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }


}
