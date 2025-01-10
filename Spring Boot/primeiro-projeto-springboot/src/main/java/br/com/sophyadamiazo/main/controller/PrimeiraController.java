package br.com.sophyadamiazo.main.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    
    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parâmetro é " + id;
    }
    // requisição desse método http://localhost:8080/primeiraController/primeiroMetodo/1

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "O parâmetro com metodoComQueryParams é " + id;
    }
    // requisição desse método http://localhost:8080/primeiraController/metodoComQueryParams?id=189

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O parâmetro com metodoComQueryParams2 é " + allParams.entrySet();
    }
    // requisição desse método http://localhost:8080/primeiraController/metodoComQueryParams2?id=189&nome=Sophya&curso=java

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody Usuario usuario) {
        return "metodoComBodyParams " + usuario.username();
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers) {
        return "metodoComListHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id) {
        var usuario = new Usuario("sophyadamiazo");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Numero menor que 5");
    }

    record Usuario(String username){
    }

}
