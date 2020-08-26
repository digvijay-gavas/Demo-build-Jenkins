## Synopsis

The project was created for demonstrating build process using Jenkins and docker file. There is simple Hello world application created using spring boot which have GET REST endpoint which returns the Options object having {name,description,link} properties as JSON array.

## How to use
The project is have Jenkins CI/CD with Jenkinsfile in SCM. The Jenkinsfile will generate Docker image with name 'digvijay0gavas/hello-world' and upload it to registry.hub.docker.com. The docker image can be started with command 
 `docker run -p 5060:5060 digvijay0gavas/hello-world:33` 
The GET endpoint can be accessed on port ip_or_dn:5060/rest

## How to test
1. start docker image 
`docker run -p 5060:5060 digvijay0gavas/hello-world:33`
2. enter command 
`curl localhost:5060/rest`
3. The response should be printed on command line as JSON array having 3 Options object

## How to setup Jenkins CI/CD pipeline to build the App
1. create empty pipeline job (lets say 'Demo-build-Jenkins')
2. goto Configure --> Pipeline section and select 'Definition' as 'Pipeline script for SCM'
3. select SCM as GIT and add the repo url https://github.com/digvijay-gavas/Demo-build-Jenkins.git
4. add jdk and maven tool in 'Manage Jenkins' --> 'Global Tool Configuration' with name JDK8 and MVN3.6.3 respectively
5. add Jenkins credential with id 'digvijay-cred' (depends on docker repository)
6. The Jenkinsfile have one parameter as 'deploy', Deploy stage runs based on the 'deploy' parameter.
6. The Jenkins job is already set up for this repo on cloud m/c see **URLs** section

## URLs
1. ready to test docker images are uploaded to https://hub.docker.com/r/digvijay0gavas/hello-world
2. Jenkins job to build the project is at https://35.224.137.252/job/Demo-build-Jenkins/ use credential (user: developer, pass: developer)

Note: the https://35.224.137.252/ have unsigned certificate and browsers might not straight away allow the URL to access.