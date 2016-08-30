This is an example project to show an issue when unit testing redirect on grails controllers when using namespaces.

After starting up the grails application with the command:

```
grails run-app
```

and going to http://localhost:8080/admin/content, it redirects to http://localhost:8080/admin/content/list, which is the expected behaviour.

The problem comes with the unit test ContentControllerSpec not working as expected, so when running

```
grails test-app -unit
```

the error does not pass because the application does not do the redirection properly