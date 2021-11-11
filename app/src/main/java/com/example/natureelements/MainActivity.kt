package com.example.natureelements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoAr = findViewById<Button>(R.id.botaoAr)
        botaoAr.setOnClickListener() {elementoAr()}

        val botaoAgua = findViewById<Button>(R.id.botaoAgua)
        botaoAgua.setOnClickListener() {elementoAgua()}

        val botaoTerra = findViewById<Button>(R.id.botaoTerra)
        botaoTerra.setOnClickListener() {elementoTerra()}

        val botaoFogo = findViewById<Button>(R.id.botaoFogo)
        botaoFogo.setOnClickListener() {elementoFogo()}

    }

    fun elementoAr(){

        val textViewTituloElemento = findViewById<TextView>(R.id.elemento)
        textViewTituloElemento.text = "AR"
        //textViewTituloElemento.setTextColor(resources.getColor(R.color.ar))

        val textViewElementoDesc = findViewById<TextView>(R.id.elementodesc)
        textViewElementoDesc.text = ARDESC
      //  textViewElementoDesc.setTextColor(resources.getColor(R.color.ar))
    }


    fun elementoAgua(){

        val textViewTituloElemento = findViewById<TextView>(R.id.elemento)
        textViewTituloElemento.text = "ÁGUA"

        val textViewElementoDesc = findViewById<TextView>(R.id.elementodesc)
        textViewElementoDesc.text = AGUADESC
    }

    fun elementoTerra(){

        val textViewTituloElemento = findViewById<TextView>(R.id.elemento)
        textViewTituloElemento.text = "TERRA"

        val textViewElementoDesc = findViewById<TextView>(R.id.elementodesc)
        textViewElementoDesc.text = TERRADESC
    }

    fun elementoFogo(){

        val textViewTituloElemento = findViewById<TextView>(R.id.elemento)
        textViewTituloElemento.text = "FOGO"

        val textViewElementoDesc = findViewById<TextView>(R.id.elementodesc)
        textViewElementoDesc.text = FOGODESC
    }











    companion object {


    val AGUADESC = "O elemento Água é encontrado na Natureza nos rios, mares, oceanos, lagos e cachoeiras. Em nós, encontramos água em todos os líquidos do nosso corpo, como sangue, saliva, suor e outros fluidos. \n" +
            "\n" +
            "Falar de Água é falar de fluidez e flexibilidade. Ela se movimenta e se molda. Você já ouviu alguém aconselhar \"seja como a água, ela contorna seus obstáculos\"? Ou a famosa frase \"água mole em pedra dura, tanto bate até que fura\"? É a mais pura verdade; não subestime o poder da Água.\n" +
            "\n" +
            "A origem da vida se dá na água. Pense: ficamos nove meses mergulhados em água enquanto estamos crescendo na barriga de nossa mãe. Nosso corpo físico é composto de mais de 70% de água. Consegue compreender a importância que esse elemento tem em sua existência? \n" +
            "\n" +
            "Além do físico, a água também representa o nosso emocional, ou seja, ela influencia diretamente nossas emoções. Amor, alegria, tristeza; todos regidos pela água. Debaixo do chuveiro, podemos soltar um choro represado. Podemos sair mais calmos depois de um tempo nadando e boiando nas águas claras de um rio. E você já reparou como se sente depois de um belo banho de cachoeira? Um entusiasmo, uma força brota do nada? Sim, é tudo efeito da água!\n" +
            "\n" +
            "Contudo, o excesso desse elemento em nós pode gerar choros descontrolados, sentimentalismo exagerado, melancolia, distorção dos fatos do dia-a-dia, entre outros problemas. Já a falta da água nos deixa mais frios, insensíveis e bem menos empáticos. "


        val TERRADESC = "O elemento Terra é encontrado na Natureza de forma mais ampla; ela abrange as espécies animais, minerais e vegetais. Ou seja, consideramos do elemento Terra todos os animais, as árvores, montanhas, cavernas, pedras, plantas, flores, raízes, frutos e a terra propriamente dita. Já em nós, a Terra é o nosso corpo físico, a nossa matéria.\n" +
                "\n" +
                "A terra é farta e é dela que tiramos o nosso alimento. É a terra que nos dá abrigo, é ela que molda e limita a nossa água. Pense: sem a terra, nossos líquidos escorreriam do corpo. A água não teria a forma de rio ou de lago se não houvesse a terra para segurá-la e dar a forma. \n" +
                "\n" +
                "Quando falamos da terra além do físico, podemos dizer que ela representa firmeza, força, determinação, objetividade, praticidade, estrutura, pé no chão. É na terra que encontramos os tesouros, o ouro, o diamante, a esmeralda, entre outros, então, podemos relacioná-la também com a nossa prosperidade.\n" +
                "\n" +
                "O excesso desse elemento nos torna rígidos, teimosos, materialistas, estagnados (sem movimento) e pesados (soterramento). Já a falta desse elemento nos deixa desestruturados, instáveis, sem foco, sem determinação, apáticos, na escassez"


        val FOGODESC = "O elemento Fogo é encontrado na Natureza nas fogueiras, queimadas, lavas vulcânicas, explosões e no calor do Sol. Em nós, encontramos o elemento Fogo no calor do nosso corpo. Além disso, o fogo sempre causou fascinação em nós; ele tem uma energia sedutora que nos atrai.\n" +
                "\n" +
                "Você encontra o elemento fogo na chama de uma vela, no fogo da lareira de uma casa, no centro da Terra, na lava do vulcão - ou seja, onde tem calor, o elemento Fogo está se manifestando.\n" +
                "\n" +
                "Quando o homem da pré-história descobriu o fogo, transformou sua vida. Passou a se aquecer nas épocas frias, iluminou sua caverna para sair da imensa escuridão e conseguiu andar à noite sem dificuldade. Com o fogo, ele também conseguiu cozinhar os alimentos, deixando-os mais saborosos e fáceis de digerir. Conseguiu forjar metais para produção de armas de caça, objetos de adornos como colares, pulseiras, anéis, brasões, além de uma série de outros objetos importantes e úteis, como panelas, portões, elmos, armaduras de guerra e até o vidro.\n" +
                "\n" +
                "Fogo é calor e luz e sua importância em nossa vida é evidente.\n" +
                "\n" +
                "Além do físico, o fogo é representado em nós em forma de coragem, ação, transformação, atitude, impulso, paixão, vigor e vitalidade. Um corpo físico morto não produz calor. Se sentir vivo, empolgado, excitado, eletrizado, cheio de gás é tudo obra do elemento Fogo. Ele é pura energia!\n" +
                "\n" +
                "O excesso de elemento fogo nos deixa agressivos, reativos, impulsivos acelerados e agitados. Já a falta desse elemento causa desânimo, falta de iniciativa e de autoconfiança, medo, depressão e lentidão."

        val ARDESC = "O elemento Ar é encontrado na Natureza na brisa, nas rajadas de vento, no oxigênio que respiramos. É o único elemento invisível. Em nós, encontramos o Ar em nossa respiração, na absorção do oxigênio, na inspiração e expiração, no sopro.\n" +
                "\n" +
                "Não há nada mais gostoso que a brisa fresca em uma tarde de verão. A forma como ele balança as folhas das árvores, que produzem um som interessante. Aliás, você já experimentou fechar os olhos nesse momento? Faça isso um dia!" + "\n" +
                "Falando em som, temos música produzida na flauta, no trombone, na gaita - tudo com a ajuda do ar. O ar é imprescindível para nossa existência. Sem ar por alguns poucos minutos, não sobrevivemos. No ar está o sopro da vida - termo muito usado nos praticantes de Magia Natural.\n" +
                "\n" +
                "O ar, manifestado pelo vento, carrega as sementes que se soltam das flores, fazendo com que elas se espalhem e germinem em novos lugares, aumentando a vegetação e a beleza das paisagens do campo. O ar não pode ser visto, mas pode ser profundamente sentido.\n" +
                "\n" +
                "Além do físico, o ar está representado em nós em todos os assuntos intelectuais; pensamentos, conhecimento, memória, inteligência, aprendizado, estudos, criação, imaginação. Uma mente ativa e equilibrada está harmônica com o elemento Ar. Nossa mente é capaz de produzir, se concentrar e criar ideias fantásticas quando é bem trabalhada neste elemento.\n" +
                "\n" +
                "O excesso de elemento Ar faz com que a pessoa saia da realidade, permanecendo apenas no mundo das ideias, sem concretizar nada. Ela fica sem o impulso da ação. Ela apenas vive e reina em sua mente enquanto a vida está acontecendo e passando - meio que despercebida - no mundo real. A pessoa fica \"aérea\". Pode ficar extremamente fria, racional e dispersa.\n" +
                "\n" +
                "Já a falta desse elemento pode deixar a pessoa muito crítica ou com a língua afiada, sem criatividade, sem conseguir se concentrar ou focar no que é importante. Faz as coisas sem pensar ou sem medir conseqüências - apenas age. Não se interessa por novos conhecimentos e não consegue enxergar ou valorizar as novas ideias."
    }

}