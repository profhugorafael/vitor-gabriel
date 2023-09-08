package br.com.vitor.linkapi.resources;

import br.com.vitor.linkapi.model.Link;
import br.com.vitor.linkapi.repository.LinkRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("links")
public class LinkController {

    @Autowired
    private LinkRepository linkRepository;

    @GetMapping // GET localhost:3306/links
    public ResponseEntity<List<Link>> getAll(){
        return ResponseEntity.ok(linkRepository.findAll());
    }

    @GetMapping("/{id}") // GET localhost:3306/links/2
    public Link getById(@PathVariable Long id){
        var linkSearch = linkRepository.findById(id);
        return linkSearch.orElseThrow();
    }

    @PostMapping // POST localhost:3306/links
    public Link register(@RequestBody Link link) {
        var savedLink = linkRepository.save(link);
        return savedLink;
    }
}
