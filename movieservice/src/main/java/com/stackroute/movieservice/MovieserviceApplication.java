package com.stackroute.movieservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//
//import com.stackroute.movieservice.domain.Movie;
//import com.stackroute.movieservice.repository.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//
@SpringBootApplication
//class MovieserviceApplication implements ApplicationListener<ContextRefreshedEvent> {
public class MovieserviceApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(MovieserviceApplication.class, args);
	}
//
//	MovieRepository movieRepository;
//
//	@Autowired
//	public MovieserviceApplication(MovieRepository movieRepository){
//		this.movieRepository = movieRepository;
//	}
//
//	@Override
//	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
//		movieRepository.save(new Movie(1,"Batman","Ok", 3));
//		movieRepository.save(new Movie(2,"Superman","Good",3));
//		movieRepository.save(new Movie(3,"Justaman","Great",3));
//	}
}