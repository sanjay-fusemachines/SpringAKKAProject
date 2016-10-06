package com.fusemachines;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import akka.actor.UntypedActor;

@Component("HelloWorld")
@Scope("prototype")

public class HelloWorld extends UntypedActor{

	@Override
	public void onReceive(Object message){
		if(message == "Hello World"){
			System.out.println(message);
		}else{
			unhandled(message);
		}
	}

}
