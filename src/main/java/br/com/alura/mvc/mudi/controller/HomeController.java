package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private PedidoRepository repository;

    @GetMapping("/home")
    public ModelAndView home(Model model){
        List<Pedido> pedidos = repository.findAll();
        ModelAndView mv = new ModelAndView("home");
        model.addAttribute("pedidos", pedidos);
        return mv;
    }
}
