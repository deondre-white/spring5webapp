package guru.springframework.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.spring5webapp.repositories.BookRepo;

@Controller
public class BookController {

	private final BookRepo bookRepo;
	
	
	
	
	public BookController(BookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}




	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books", bookRepo.findAll());
		return "books";
	}
}
