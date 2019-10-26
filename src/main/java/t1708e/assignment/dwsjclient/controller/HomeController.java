package t1708e.assignment.dwsjclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import t1708e.assignment.dwsjclient.service.image.ImageService;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "")
public class HomeController {
//    @Autowired
//    PlaceService placeService;
    @Autowired
    ImageService imageService;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) throws RemoteException {
//        System.out.println("SIZE: " + placeService.getListPlace().size());
//        model.addAttribute("places", new ArrayList<>(Arrays.asList(placeService.getListPlace())));
        return "index";
    }


    @RequestMapping(value = "/search-page", method = RequestMethod.GET)
    public String searchPage(Model model){
        return "search-page";
    }

    @RequestMapping(value = "/place-detail", method = RequestMethod.GET)
    public String placeDetail(Model model){
        return "place-detail";
    }
}
