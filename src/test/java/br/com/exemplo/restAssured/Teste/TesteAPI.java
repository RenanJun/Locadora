
package br.com.exemplo.restAssured.Teste;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

import org.junit.Test;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;

public class TesteAPI {

     @Test
     public void TestesAPI() {

          baseURI = "https://jsonplaceholder.typicode.com/todos/1";
     }

     /* Chama o serviço pelo metodo POST */
     public void testCriaUsuario() {

          String myJson = "{\"userId\":\"1\"" + ",\"id\":\"1\"" + ",\"title\":\"delectus aut autem\"" + ",\"completed\":'\"false\"}";

          given().contentType("application/json").body(myJson).when().post("/").then().statusCode(200).body("id", equalTo("1"));

          System.out.println(myJson);
     }
}
