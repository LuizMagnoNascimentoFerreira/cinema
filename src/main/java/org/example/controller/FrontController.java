package org.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/view")
public class FrontController {
    @GetMapping("/index")
    public String getIndexView(){
        return "index";
    }
    @GetMapping("/movies/add")
    public String getAddMovieView(){
        return "addMovie";
    }
    @GetMapping("/movies/update")
    public String getUpdateMovieView(){
        return "updateMovie";
    }
    @GetMapping("/movies/delete")
    public String getDeleteMovieView(){
        return "deleteMovie";
    }
    @GetMapping("/sessions/add")
    public String getAddSessionView(){
        return "addSession";
    }
    @GetMapping("/sessions/update")
    public String getUpdateSessionView(){
        return "updateSession";
    }
    @GetMapping("/sessions/delete")
    public String getDeleteSessionView(){
        return "deleteSession";
    }
    @GetMapping("/rooms/add")
    public String getAddRoomView(){
        return "addRoom";
    }
    @GetMapping("/rooms/delete")
    public String getDeleteRoomView(){
        return "deleteRoom";
    }
}