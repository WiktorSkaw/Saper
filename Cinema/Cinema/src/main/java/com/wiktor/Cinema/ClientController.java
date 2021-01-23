package com.wiktor.Cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ClientController {

    @Autowired
    private ClientRepository userRepository;
    @RequestMapping(path="/CreateClient")
   public String createClient(@RequestParam String name, Model model){

        Client client = new Client();
        client.setName(name);

        userRepository.save(client); //klient zostaje zapisany w bazie

        model.addAttribute("message","User Created " + name);

        return "client";
    }
}
