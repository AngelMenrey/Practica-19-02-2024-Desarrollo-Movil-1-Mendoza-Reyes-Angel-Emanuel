fun main() {
    println("Hello, world!")
    //Variables
    val uno: Int = 20
    var dos: Int = 30
    //Interpolacion y Concatenacion
    println("uno: $uno")
    println("dos: $dos")
    //Mutabilidad
    dos = 40
    println("dos: $dos")
    //Llamar funciones o metodos
    funcion1()
    var a: Int = 0
    a = funcion2()
    println("Valor de A: $a")
    var b: String = "Text"
    b = funcion3("Laura", 20)
    println("$b")
}

//Tipos de Metodos
fun funcion1(): Unit {
    println("Metodo sin parametros")
    println("y sin retorno")
    println("Unit es equivalente")
}

fun funcion2(): Int {
    println("Metodos sin parametros y con retorno")
    return 100
}

fun funcion3(nom: String, ed: Int): String {
    return "Hola $nom, tienes $ed años, felicidades!!!"
}
//////////////////////////////////////////////
//WHEN
fun main() {
    var a : Any = 20
    var b : String = "naranja"
    
    when(a){
        0 ->{
            println("Posicion 0")
        }
        1 ->{
            println("Posicion 1")
        }
        2 ->{
            println("Posicion 2")
        }
        3, 4, 5, 6 ->{
            println("Mas de 2 posiciones")
        }
        in 7..10 ->{
            println("Mas de 6 posiciones")
        }
        is Int ->{
            println("Es entero")
        }
        is Float ->{
            println("Es flotante")
        }
        else ->{
            println("Numero desconocido")
        }
        
    }
    when(b){
        "rojo" ->{
            println("Rojo")
        }
        "azul" ->{
            println("Azul")
        }
        "verde" ->{
            println("Verde")
        
    }
        is String ->{
            println("Es string")
        }
      else ->{
        println("Color desconocido")
    }
}

}
//////////////////////////////////////////////
//FOR
fun main() {
    for( a in 0..10){
    println("el valor es $a")
}
    for( b in 0..10 step 2){
        println("el valor es $b")
    }
    for(c in 10 downTo 0 step 3){
        println("Numero: $c")
    }
    
}
/////////////////////////////////////////////
//WHILE
fun main() {
    var a : Int = 0
    while(a < 10){
        println("Valor $a")
        a++
    }
}
/////////////////////////////////////////////
//DO-WHILE
fun main() {
    var a : Int = 0
    do{
        println("valor $a")
        a++
    }while(a < 10)
}
/////////////////////////////////////////////
//ARRAYS
fun main() {
    
    var aEnteros : Array<Int> = arrayOf(1,2,3,4,5,6,7,8,10)
    println("Enteros")
    for(i in 0 until 6){
        println("[$i] = ${aEnteros[i]}")
    }
    var aCaracteres : Array<Char> = arrayOf('a', 'b', 'c')
    println("Caracteres")
    for(i in 0 until aCaracteres.size){
        println("[$i] = ${aCaracteres.get(i)}")
    }
    var aCadenas = arrayOf("angel", "mendoza", "reyes")
    println("Cadenas")
    for(i in aCadenas){
        println(i)
    }
}
/////////////////////////////////////////////
//ARRAYS
fun main() {
    var tam = 5
    var aEnteros : Array<Int> = Array(tam, {i->10})
    var aLetras = Array(tam, {i->'x'})
    var aCadenas : Array<String> = Array(tam, {i->"hola"})
    var aNumeros = IntArray(tam)
    println("Enteros")
    for(i in aEnteros){
        println(i)
    }
    println("Letras")
    for(i in aLetras){
        println(i)
    }
    println("Cadenas")
    for(i in aCadenas){
        println(i)
    }
    println("Numeros")
    for(i in aNumeros){
        println(i)
    }
    //Agregar valores
    aEnteros[0]=10
    aEnteros[1]=20
    aEnteros[2]=30
    aEnteros.set(3,40)
    aEnteros.set(4,50)
    println("Enteros")
    for(i in aEnteros){
        println(i)
    }
}
/////////////////////////////////////////////
//COMILLAS DOBLES Y SIMPLES
fun main() {
    println("Cadena 'uno'")
    println("Texto \"dos\"")
}
/////////////////////////////////////////////
//PROGRAMACION ORIENTADA A OBJETOS (POO)    
fun main() {
    //Declarar objetos
    val persona = Persona()
    //asignar valores
    persona.nombre = "Ana"
    persona.apellidos = "Rosa"
    persona.edad = 20
    println("Estatus: ${persona.estatus}")
    println("Nombre: ${persona.nombre}")
    println("Apellido: ${persona.apellidos}")
    println("Edad: ${persona.edad}")
    
    val persona2 = Persona2("Juan", "Mendoza", 20)
    println("Nombre: ${persona2.nombre}")
    println("Apellido: ${persona2.apellidos}")
    println("Edad: ${persona2.edad}")
    
    val persona3 = Persona3("Laura", "Reyes", 20)
    println("Nombre: ${persona3.nombre}")
    println("Apellido: ${persona3.apellidos}")
    println("Edad: ${persona3.edad}")
    
    var jugador = Jugador("Javier", "Hernandez", 30)
    println("Nombre: ${jugador.nombre}")
    println("Apellido: ${jugador.apellidos}")
    println("Edad: ${jugador.edad}")
    println("Deporte: ${jugador.deporte}")
    jugador.correr()
    
}

class Persona{
    val estatus : String = "Activo"
    var nombre : String = ""
    get(){
        return field
    }
    set(value){
        field = value
    }
    var apellidos : String = ""
    get(){
        return field
    }
    set(value){
        field = value
    }
    var edad : Int = 0
    get(){
        return field
    }
    set(value){
        field = value
    }
}

class Persona2(var nombre: String, var apellidos : String){
    var edad : Int = 0
    get(){
        return field
    }
    set(value){
        field = value
    }
    constructor (nom: String, ape: String, ed: Int) : this(nom, ape){
        this.edad = ed
    }
}
open class Persona3 (var nombre: String, var apellidos :String, var edad :Int){
}

class Jugador(nom:String, ape:String, ed:Int)
:Persona3(nombre=nom, apellidos=ape, edad=ed){
    var deporte :String = "Futbol"
    fun correr():Unit{
        println("Estoy corriendo")
    }
}