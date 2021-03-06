package ua.step.bookshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.step.bookshop.repositories.BookRepository;
import ua.step.bookshop.repositories.GenreRepository;
import ua.step.bookshop.repositories.PublisherRepository;

@Controller
public class MainController {
	@Autowired
	private BookRepository repo;
	@Autowired
	private GenreRepository repoJ;
	@Autowired
	private PublisherRepository repoP;

	@GetMapping("/")
	private String getIndex(Model model) {
		model.addAttribute("books", repo.findAll());
		model.addAttribute("genres", repoJ.findAll());
		model.addAttribute("publishers", repoP.findAll());
		model.addAttribute("contentPage", "books");
		return "index";
	}

	@GetMapping("/payment")
	private String getPayment(Model model) {
		model.addAttribute("genres", repoJ.findAll());
		model.addAttribute("publishers", repoP.findAll());
		model.addAttribute("contentPage", "payment");
		return "index";
	}

	@GetMapping("/delivery")
	private String getDelivery(Model model) {
		model.addAttribute("genres", repoJ.findAll());
		model.addAttribute("publishers", repoP.findAll());
		model.addAttribute("contentPage", "delivery");
		return "index";
	}

	@GetMapping("/contacts")
	private String getContacts(Model model) {
		model.addAttribute("genres", repoJ.findAll());
		model.addAttribute("publishers", repoP.findAll());
		model.addAttribute("contentPage", "contacts");
		return "index";
	}
}