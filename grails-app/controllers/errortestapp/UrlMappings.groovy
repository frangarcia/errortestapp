package errortestapp

class UrlMappings {

    static mappings = {
        "/admin/$controller/$action?/$id?(.$format)?"{
            namespace = "admin"
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
