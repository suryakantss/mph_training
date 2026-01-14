#### Logging and Performance Filter

#### Scenario: Create a filter that logs request information and measures request

#### processing time.

#### Task:

#### 1\. Create a servlet filter named LoggingFilter

#### 2\. Configure it to intercept ALL requests (/\*)

#### 3\. In doFilter() method:

#### o Log the incoming request (URL, method, remote address)

#### o Record the start time using System.currentTimeMillis()

#### o Pass request to the next filter/servlet using chain.doFilter()

#### o After processing, calculate and log the total processing time

#### o Log the response status (if available)

#### 4\. Test with multiple servlets to see the logging in action

#### Hints:

####  Use HttpServletRequest.getRequestURI() to get the URL

####  Use System.currentTimeMillis() for timing

####  You'll need to wrap the response to access status codes 

