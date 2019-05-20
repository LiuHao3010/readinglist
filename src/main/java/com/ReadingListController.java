package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/ReadingList")
public class ReadingListController {
    private ReadingListRepository readinglistrepository;
    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository){
        this.readinglistrepository=readingListRepository;
    }
    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readBooks(@PathVariable("reader") String reader, Model model){
        List<Book> readingList=readinglistrepository.findByReader(reader);
        if (readingList!=null)
            model.addAttribute("books",readingList);
        return "ReadingList";
    }
    @RequestMapping(value = "/{reader}",method =RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader")String reader,Book book){
        book.setReader(reader);
        readinglistrepository.save(book);
        List<Book> list=readinglistrepository.findAll();
//        for(Book book1 :readinglistrepository.findAll())
//            System.out.println(book1);
        System.out.println(list.size());
        return "redirect:/ReadingList/{reader}";
    }
}
