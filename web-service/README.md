# Startup Context Dependency Injection (CDI)

---

Are you in charge of developing or maintaining a stateful web application with the Java EE API? 
Do you want some set of events to be triggered on your appliactions startup and shutdown? 
If you answered yes to any of these questions, then this example  should help!

---


Things you will need on your machine:
 - The latest version of [Docker](https://www.docker.com/community-edition)
 - One Internet
 
Once you have your Docker host installed. 

1. Open up a command prompt. 
2. Run the command: 
     ````
     sudo docker pull alexsimons/startup-cdi`.
   ````
   This pulls in the image I have created for your convenience.
3. Once the command completes an the docker image is on your host all you have to do is run the container and attach it to see the output of the busy bean.
Which can be accomplished by: 

    ````
    sudo docker run --rm --name=cdi -it alexsimons/startup-cdi`
    ````
    Here we have a named container of "cdi" and we told docker to attach to the running processes to a [TTY](http://www.abouttty.com/) so we can see the output. The `--rm` flag tells docker to remove the Docker container after the Docker container has stopped 
