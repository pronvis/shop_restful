import com.softwaremill.macwire._
import controllers.{RegistrationController, MainController}
import services.akka.ActorsModule
import services.database.DatabaseModule

object Application extends DatabaseModule with ActorsModule {
  val mainController          = wire[MainController]
  val registrationController  = wire[RegistrationController]
}