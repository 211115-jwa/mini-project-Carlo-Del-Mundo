package com.revature.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.revature.entities.Car;
import com.revature.util.Util;

import io.javalin.Javalin;

public class ListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Car> lot = new HashMap<String, Car>();
		
		Javalin app = Javalin.create();
		
		app.start();
		
		app.post("/parkingLot", ctx -> {
			StringBuilder body = new StringBuilder();
			String html = "";
			
//			if(!lot.isEmpty()) {
				Car car = new Car(ctx.formParam("make"),ctx.formParam("model"),ctx.formParam("color"),ctx.formParam("type"),ctx.formParam("plateNumber"));
				lot.put(ctx.formParam("lot"), car);
				
				System.out.println(car);
				System.out.println(lot.size());
				
				body.append("<ul>");
				Set<String> keys = lot.keySet();
				keys.forEach(key -> {
					String info = "<li>" + lot.get(key).getColor() + " " + lot.get(key).getMake() + " " + lot.get(key).getModel() + " " + lot.get(key).getType() + " with plate no. " + lot.get(key).getPlateNumber() + " parked at " + key + "</li>";
					body.append(info);
				});
				body.append("</ul>");
					
//			}
//			else {
//				body.append("<h1>No cars parked in The Parking Lot!</h1>");
//			}
			
			html = Util.generateHTML(body.toString());
			ctx.html(html);
		});
	}
}
