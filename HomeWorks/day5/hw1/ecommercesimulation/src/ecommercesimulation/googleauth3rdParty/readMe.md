This package is to be regarded as a third party service consumed by our software project.

 * That is, this code is not written by us. In this project we try to find out how to add 3rd party
 services into our project without making our project tightly coupled and highly dependent to that
 3rd party service. Because by time, we may change our strategy to use other services.
 
In this workshop we want to find out how we can include a third-party service into our code.
(The Hint: adaptation pattern)

 Solution:
 ---------
 We created  
 ecommercesimulation.business.abstracts.AuthService interface and 
 ecommercesimulation.business.adapters.GoogleAuthManagerAdapter class.
 
 GoogleAuthManagerAdapter implements AuthService interface. And it creates an instance
 of 3rd party service class.
 
 In our codes we instantiate the GoogleAuthManagerAdapter class instead of directly instantiating
 3rd party class.