package errortestapp

class ContentController {

	public static String namespace = "admin"

    def index() {
    	redirect uri:g.createLink(action:"list")
    }

    def list() {
    	render "list method"
    }
}
