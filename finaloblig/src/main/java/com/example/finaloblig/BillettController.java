package com.example.finaloblig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    @Autowired
    private BillettRepository rep;

    @PostMapping("/bestill")
    public void bestillBillett(Billett innbillett){

        rep.lagrebillett(innbillett);
    }

    @GetMapping("/hent")
    public List<Billett> hentBestillinger(){

        return rep.hentAlleBilletter();
    }

    @GetMapping("/slett")
    public void slettAllebestillinger(){
        rep.slettALleBilletter();
    }
}