package com.helado.dockerized.api.helado;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/helados")
public class HeladoController {
    
    @Autowired
    private HeladoRepository heladoRepository;
    
    @GetMapping
    public List<Helado> getAllHelados(){
        return heladoRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Helado getHeladoById(@PathVariable Long id){
        return heladoRepository.findById(id).get();
    }
    
    @PostMapping
    public Helado createHelado(@RequestBody Helado helado){
        return heladoRepository.save(helado);
    }
    
    @PutMapping("/{id}")
    public Helado updateHelado(@PathVariable Long id,@RequestBody Helado helado){
        Helado existingHelado = heladoRepository.findById(id).orElse(null);
        if(existingHelado != null){
            existingHelado.setSabor(helado.getSabor());
            existingHelado.setStock(helado.getStock());
            return heladoRepository.save(existingHelado);
        }else{
            return null;
        }
    }
    
    @DeleteMapping("/{id}")
    public void deleteHelado(@PathVariable Long id){
        heladoRepository.deleteById(id);
    }
}
