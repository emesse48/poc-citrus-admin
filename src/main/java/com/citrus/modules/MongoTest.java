package com.citrus.modules;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class MongoTest {
	
	public static void MongoT() {
	
	String BenitoDB = "benito_rest";
	String BenitoCollection = "benitoApiApplication";

	MongoClientURI uri = new MongoClientURI("mongodb+srv://bento:univ2323@benito-pqi0r.gcp.mongodb.net/test?retryWrites=true");
	MongoClient mongoClient = new MongoClient(uri);		
	
	MongoDatabase database = mongoClient.getDatabase(BenitoDB);
	MongoCollection<Document> benitoCollection = database.getCollection(BenitoCollection);
	MongoCursor<Document> cursor = benitoCollection.find().iterator();
	System.out.println(" ");
	System.out.println("============================================");
	System.out.println("BenitoMongoClient.java - Read Collection");
	System.out.println("============================================");
	
		while (cursor.hasNext()) {
		    System.out.println(cursor.next().toJson());	            
		}
    
		System.out.println("============================================");
		
		cursor.close();
		mongoClient.close();

}
}
