
var menina = {
    
    nome:"Lucas",

    falar:function(){
        console.log('Olá ' + this.nome)
    }
}

menina.falar();

var dizer = menina.falar
dizer()
dizer.call(menina) //com isso da para usar um metodo de uma objeto em um outro objeto
