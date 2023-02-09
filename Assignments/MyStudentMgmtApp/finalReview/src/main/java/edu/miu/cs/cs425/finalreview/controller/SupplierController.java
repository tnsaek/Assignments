package edu.miu.cs.cs425.finalreview.controller;

import edu.miu.cs.cs425.finalreview.model.Supplier;
import edu.miu.cs.cs425.finalreview.service.SupplierService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @GetMapping(value = "/suppliers/list")
    public ModelAndView displayListOfSuppliers(){
        var modelAndView = new ModelAndView();
        modelAndView.addObject("suppliers", supplierService.getAllSuppliers());
        modelAndView.setViewName("secured/list");
        return modelAndView;
    }

    @GetMapping(value = "/supplier/new")
    public String displayNewSupplierForm(Model model){
        Supplier supplier = new Supplier();
        model.addAttribute("supplier", supplier);
        return "secured/new";
    }

    @PostMapping("supplier/new")
    public String addSupplier(@Valid @ModelAttribute("supplier") Supplier supplier, BindingResult bindingResult,
                              Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("supplier", supplier);
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "/supplier/new";
        }
        supplierService.addSupplier(supplier);
        return "redirect:/suppliers/list";
    }
}
