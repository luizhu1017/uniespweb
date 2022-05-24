package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Contato;
import br.edu.uniesp.api.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    public Contato salvar(Contato contato){
        return repository.save(contato);
    }

    public Contato atualizar(Contato contato) throws Exception {
        if(contato.getId()==null){
            throw new Exception("ID não encontrado");
        }
        return repository.save(contato);
    }

    public void deletar(int id){
        repository.deleteById(id);
    }

    public List<Contato> listar(){
        return repository.findAll();
    }


}
