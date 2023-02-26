Step 1: First created the spring boot gradle project using Spring initializer 

Dependencies 

<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
  
 Webhook Controller 
 
 
@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    public ResponseEntity<String> print(@RequestBody String requestBody){
        System.out.println("##### Webhook ####" + requestBody);
        return new ResponseEntity<String>(requestBody,HttpStatus.OK);
    }
    
}


Step 2 : After running the project we uses ngrok to get the access of our localhost from remote .
       -> used command prompt to generate the weblink of thee local host like : 
       
       Web Interface                 http://127.0.0.1:4040                                                                 
       Forwarding                    https://9098-2401-4900-43ad-6ab9-a1b8-92a8-516d-7aad.in.ngrok.io -> http://localhost:8080                                                                                                                         
  Step 3 : Created the repository with the name which you have given (dummy-github-events)
        -> added new webhook by using the setting of github where i have provided the abolve link as a payload.
        
        
 Running or Executin Part 
 
 (i) First run the Spring Boot gradle project and then simple commite any data or any file.
 (ii) It will automatically reflect to the command part of the project.
 (iii) It will also reflect in the manage WEBHOOK where all the recent deliveries are stored including the status.
 
 Where response will be stored like the below format :---->
 
 Payload
 
 
 
{
  "ref": "refs/heads/main",
  "before": "bdf1c2dee2b79708c00d82aff9cf7e86052a396e",
  "after": "2250f16c780209768ebde467eb9a0c563278a78f",
  "repository": {
    "id": 606768347,
    "node_id": "R_kgDOJCqM2w",
    "name": "dummy-github-events",
    "full_name": "chandu93011/dummy-github-events",
    "private": false,
    "owner": {
      "name": "chandu93011",
      "email": "94711399+chandu93011@users.noreply.github.com",
      "login": "chandu93011",
      "id": 94711399,
      "node_id": "U_kgDOBaUuZw",
      "avatar_url": "https://avatars.githubusercontent.com/u/94711399?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/chandu93011",
      "html_url": "https://github.com/chandu93011",
      "followers_url": "https://api.github.com/users/chandu93011/followers",
      "following_url": "https://api.github.com/users/chandu93011/following{/other_user}",
      "gists_url": "https://api.github.com/users/chandu93011/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/chandu93011/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/chandu93011/subscriptions",
      "organizations_url": "https://api.github.com/users/chandu93011/orgs",
      "repos_url": "https://api.github.com/users/chandu93011/repos",
      "events_url": "https://api.github.com/users/chandu93011/events{/privacy}",
      "received_events_url": "https://api.github.com/users/chandu93011/received_events",
      "type": "User",
      "site_admin": false
    }

  
  
