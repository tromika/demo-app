import play.api._
import play.api.mvc._
import java.util.Calendar

// Note: this is in the default package.
object Global extends GlobalSettings {

  override def onRouteRequest(request: RequestHeader): Option[Handler] = {
     println(Calendar.getInstance().getTime()+" RequestHeader: " + request.toString)
     super.onRouteRequest(request)
  }

}