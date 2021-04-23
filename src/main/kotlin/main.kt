fun main(){

    val nombre1 = Nombre("asd","qwe")
    val nombre2 = Nombre("qwe","asd")

    val mascota = Mascota("rty", "fgh",1)
    val mascota2 = Mascota("fgh","rty",2)

    val persona = Persona(nombre1, mascota, mascota2)
    val persona2 = Persona(nombre2,mascota, mascota2)

    mascota.setChip("12345678A")
    mascota2.setChip("12345678E")

    persona.edad=1
    persona2.edad=2

    persona.setDni("11111111E")
    persona2.setDni("22222222Z")
}

class Persona(var Nombre : Nombre, var Mascota: Mascota, var Mascota2: Mascota){

    var edad = 18
    private var DNI : String? = null

    fun setDni(DNI: String) {
        if (DNI.length == 9 && DNI[DNI.length-1].isLetter()){
            this.DNI = DNI
        }
    }

}

class Nombre( var Nombre: String,var Apellido: String){

}


class Mascota (var Nombre: String,var Raza: String, var Edad: Int){

    private var Chip : String? = null

    fun setChip (Chip: String){
        if (Chip.length == 9 && Chip[Chip.length-1].isLetter()){
            this.Chip= Chip
        }

    }
}