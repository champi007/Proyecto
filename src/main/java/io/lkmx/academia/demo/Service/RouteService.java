package io.lkmx.academia.demo.Service;

import io.lkmx.academia.demo.Entity.Route;
import io.lkmx.academia.demo.Repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/routes")
public class RouteService {

    @Autowired
    private RouteRepository routeRepository;





    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public void add(@PathVariable Route route){


     routeRepository.save(route);


    }

    @GetMapping("/all")
    public List<Route> getAll(){

        return routeRepository.findAll();

    }


   /* @GetMapping("/{corto}")
    public String getRoute(@PathVariable String corto)  {
       Route route = get(corto);


        return ("redirect:"+ route.getLargo());

    }*/
   @GetMapping("/{corto}")
   public ModelAndView getRoute(@PathVariable String corto){
       Route route = get(corto);
       return new ModelAndView("redirect:"+route.getLargo());
   }


    public Route get(String corto){

        return  routeRepository.findByCortoAndId(corto);
    }
    /*public Optional<Route> getId(String id){

        return  routeRepository.findById(id);
    }
*/
/*    @PostMapping("/post")
    public void add(HuespedEntity huespedEntity){


        huespedRepository.save(huespedEntity);



        /////////////////////////////
        @RestController
public class MapperService {

	Map<String, String> routes = new HashMap<>();

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/routes")
	public Route addRoute(@RequestBody Route route) {
		routes.put(route.getFrom(), route.getTo());
		return route;
	}

	@GetMapping("/routes")
	public Map<String, String> getRoutes() {
		return routes;
	}

	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	@PutMapping("/routes/{key}")
	public void editRoute(@PathVariable String key, @RequestBody String route) {
		routes.put(key, route);
	}

	@GetMapping("/routes/{key}")
	public ModelAndView getRoute(@PathVariable String key) {
		return new ModelAndView("redirect:" + routes.get(key));
	}
    }*/
}
