import Usuario._
import Salon._

object main extends App{
   /* var Usuario1 = new Usuario("Paul",true)
    println(Usuario1.getAdmin)
    Usuario1.contra_("12345.")
    println(Usuario1.getContra)
    */

    var Salon1 = new Salon("ID123")
    var Salon2 = new Salon("ID1234")
    var Salon3 = new Salon("ID12345")

    var Salones : List[Salon] = List(Salon1,Salon2,Salon3)

    /*println(Salon1.getTemp)
    Salon1.cambiarTemp(23)
    println(Salon1.getTemp)
    println(Salon1.getId)*/

    println(Salon1.getReservas)
    Salon1.nuevaReserva(7,"12345")
    println(Salon1.getReservas)
    Salon1.nuevaReserva(8,"12345")
    println(Salon1.getReservas)
    Salon1.nuevaReserva(8,"12345")
    println(Salon1.getReservas)
    Salon1.nuevaReserva(9,"12345")
    println(Salon1.getReservas)
    Salon1.nuevaReserva(28,"12345")
    println(Salon1.getReservas)

    Salon1.getReservas.foreach{
        x => println(x._1)
    }

    /*println(Salon1.getHabilitado)
    Salon1.desHabilitar()
    println(Salon1.getHabilitado)
    Salon1.habilitar()
    println(Salon1.getHabilitado)
    println(Salon1.getEnUso)
    Salon1.cerrar()
    println(Salon1.getEnUso)
    Salon1.abrir()
    println(Salon1.getEnUso)
    Salones.foreach{
        x => 
            println(x.getId)
        
    }*/
    

}