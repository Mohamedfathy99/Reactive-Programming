package io.javabrains.reactiveworkshop;

import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        // TODO: Write code here
        // Th first method
//        ReactiveSources.intNumbersFlux().subscribe(element -> System.out.println(element));
        // The second method
        Flux<Integer> stream = ReactiveSources.intNumbersFlux();
        stream.subscribe(element -> System.out.println(element));


//        stream.subscribe(
//                number -> System.out.println(number),
//                err -> System.out.println(err.getMessage()),
//                () -> System.out.println("Complete")
//        );


        System.out.println("---------------------------------------------------");

        // Print all users in the ReactiveSources.userFlux stream
        // TODO: Write code here
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));

        System.out.println("Press a key to end");
        System.in.read();
    }

}
