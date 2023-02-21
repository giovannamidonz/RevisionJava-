### Java

#

<p>Na linguagem java, os programas são compilados e interpretados.</p>
<h3>Programas Interpretados</h3>
<p>o programa interpretado é o código-fonte convertido em <b>Linguagem de máquina</b> à medida que o programa é executado. A conversão é feita por um programa escrito em linguagem de máquina e denominado interpretador. Ele lê o <b>código-fonte </b>linha por linha e decodifica-o para que possa ser executado pelo microporcessador.</p>
<h3>Programas Compilados </h3>
<p>O código-fonte é inteiramente convertido em linguagem de máquina uma única vez. O processo de compilação do <b>Código-fonte</b> para o <b>Código Executável</b> compreende dois passos, sendo a gereção de arquivos objetos e a ligação desses arquivos com as rotinas das bibliotecas de funções da linguagem.</p>

<p>No Java quando finalizado a compilação o código-fonte transforma-se em uma linguagem chamada bytecode  que é independente de plataforma, e posteriormente é interpretado.</p>
<h2>Beneficios </h2>
<p>Os <b>Bytecode</b> torna possível a tecnologia <b>escreva uma unica vez, e é executo em qualquer lugar,</b> pois eles podem ser intermpretados em qualquer plataforma que possua uma <b>JVM (Java Virtual Machine).</b> Assim o programa pode ser executado em qualquer plataforma e sistemas operacionais através do JVM. Ou seja, com isso o programa obtem segurança, portabilidade e alta performace. </p>

#

<h2>Tipos de dados </h2>

<p>existe vários tipos de dados no Java, os tipos inteiros, os tipos fluentes, os tipos textuais, os tipos lógicos.</p>

<table>
    <caption>Tipos de dados INTEIROS </capition>
        <thead>
            <tr>
            <th>tipo</th>
            <th>tamanho</th>
            <th>valor mínimo</th>
            <th>valor máximo</th>
            </tr>
        <thead>
        <tbody>
            <tr>
            <th>byte</th>
            <th>1 byte</th>
            <th>-128</th>
            <th>127</th>
            </tr>
            <tr>
            <th>shot</th>
            <th>2 byte</th>
            <th>-32.768</th>
            <th>32.767</th>
            </tr>
            <tr>
            <th>int</th>
            <th>4 bytes</th>
            <th>-2.147.483.648</th>
            <th>2.147.483.647</th>
            </tr>
        </tbody>
        <tfoot>
            <tr>
            <th>long</th>
            <th>8 bytes</th>
            <th>-9.223.372.036.854.775.808</th>
            <th>9.223.372.036.854.775.808</th>
            </tr>
        </tfoot>
</table>
<p>OBS: Os dados inteiros apenas armazena valores númericos sem parte fracionária.</p>



<table>
    <caption>Tipos de dados FLUTUANTE </capition>
        <thead>
            <tr>
            <th>tipo</th>
            <th>tamanho</th>
            <th>valor mínimo</th>
            <th>valor máximo</th>
            </tr>
        <thead>
        <tbody>
            <tr>
            <th>Float</th>
            <th>4 byte</th>
            <th>-3.4028E + 38F</th>
            <th>3.4028E + 38F</th>
            </tr>
        </tbody>
        <tfoot>
           <tr>
            <th>Double</th>
            <th>8 byte</th>
            <th>-1.7976E +308F</th>
            <th>1.7976E +308F</th>
            </tr>
        </tfoot>
</table>
<p>OBS: Os dados flutuante apenas armazena valores númericos com parte fracionária.</p>
<p>Na maioria das situações onde é necessário a representação do tipo com ponto flutuante utilizamos <b>double</b> pois sua precisação é maior.</p>

<table>
    <caption>Tipos de dados BOOLEANO</caption>
    <thead>
        <tr>
        <th>tipo</th>
        <th>tamanho</th>
        <th>valores</th>
        </tr>
    </thead>
    <tfoot>
        <tr>
        <th>booleano</th>
        <th>1 bit</th>
        <th>true ou false</th>
        </tr>
    </tfoot>
</table>
<p>OBS: os dados lógicos são representados pelo tipo booleano</p>

<p>Dados Textuais</p>
<p>os daods com uma única caractere é feito pelo tipo <b> char</b> 
char letra = 'a' ;</p>

#

<h2>Idetificadores, Variáveis e Constantes</h2>

<h4>Identificadores </h4>
<p> é um nome atribuído a uma variável de memória, uma estrutura de dados, uma classe, um objeto, um procedimento, uma função um comando ou palavra reservada da linguagem.</p>
<p>Algumas regras são estabelecidas para deficinçao de um identificadores, que varia conforme a linguagem.</p>
<ol>
<li>O pirmeiro caractere deve ser uma letra do alfabeto</li>
<li>Os  demais caracteres podem ser letras, números ou o sinal de sublinhado, também conhecido como undersocore(_)</li>
<li>Não são aceitos sinais de pontuação, caracteres acentuados, cedilha(ç) ou espaço em branco</li>
</ol>

<p>Exemplos:<br><ol><li>Nome_Cliente</li><li>Data_Emissao</li><li>valores_1</li></p>

#

<h4><b>Variáveis</b></h4>
<p>São valores armazenados no computador para execução de alguma tarefa do programa. Em nossos programas, declaramos variáveis que fazem referência a essas posições reservadas, atribuindo-lhes nomes e definindo o tipo de dado que elas podem receber.</p>

<p>A sintaxe da variável é:<br>tipo_de_dado : nome_variável = valor_da_variável ;<br>Em Java todas variáveis de um programa necessitam que tenham um tipo declarado e sempre é iniciado com o seu tipo, seu nome e terminando com ponto e virgula.<br>
int numero = x ; <br>
double numero = y ;</p>

<p>Sempre é bom comentar no seu código é mais legivél para entender e é uma boa prática de programação<br>// <- utilizamos duas barras em qualquer posição de uma linha, e tudo o que aparecer a direita das barras será ignorado pelo compilador.</p>

<p>Utilizamos os caracteres /* e */ para inserir comentários de várias linhas 

<h4><b>Constantes</b></h4>
<p>As constantes não podem ter seus valores alterados durante toda a execução do programa. Elas são muito utilizadas na definição de parâmentro a diferentes seções de um programa.</p>
<p>Em Java utilizamos a palavra reservada <b>FINAL</b> que impede que o valor de uma variável seja modificado, e normalmente as constantes são definidas em caixa alta.<br><br>
<b>final double ANGULO = 1.5 ;</b></p>

#

<h2>Operadores</h2>
<table>
<capition> Tabela</capition>
    <thead>
        <tr>
        <th>operador</th>
        <th>Descrição</th>
        </tr>
    </thead>
    <tbody>
        <tr>
        <th>+</th>
        <th><b>Adição: </b>efetua a soma entre dois números</th>
        </tr>
        <tr>
        <th>-</th>
        <th><b>Subtração: </b>efetua a subtração entre dois números</th>
        </tr>
        <tr>
        <th>*</th>
        <th><b>Multiplicação: </b>efetua a multiplicação entre dois números</th>
        </tr>
        <tr>
        <th>/</th>
        <th><b>Divisão decimal: </b>efetua a divisão entre dois números e dá como resultado um número em ponto flutuante</th>
        </tr>
        <tr>
        <th>\</th>
        <th><b>Divisão inteira: </b>efetua a divisão entre dois números inteiros e dá como resultado um número inteiro, desprezando-se a parte fracionária, caso exista.</th>
        </tr>
    </tbody>
    <tfoot>
        <tr>
        <th>%</th>
        <th><b>Resto de divisão: </b>retorna o resto de uma disisão não exata entre dois números inteiros.</th>
        </tr>
    </tfoot>

</table>

<p>esses são os operadores aritméticos que são utilizados para soma, subtração, multiplicação e divisão. Podemos utilizar operadores na inicialização das variáveis. <br> Exemplos: <br>
int a = 2 * 10 ; <br>
int b = 4 ;<br>
Utilizamos o operador % para obter o valor do resto de uma divisão.<br>Assim como na matemática, em programação os operadores possuem precedência uns em relação aos outros, ou seja, determinadas operações têm prioridade sobre outras. Por exemplo, na expressão aritmética 150+290/10*7 primeiro é executado a divisão e a multiplicação, em seguida é efetuada a soma. </p><br>

<h2>Operadores de Comparação</h2>
<p>conhecido também como operadores relacionais, permite relacionamento entre dois valores, variáveis ou variável com valor.<br> </p>
<table>
<caption>Relacionais</caption>
    <thead>
        <tr>
        <th>Operador</th>
        <th>Descrição</th>
        </tr>
    </thead>
    <tbody>
        <tr>
        <th><</th>
        <th>Menor que</th>
        </tr>
        <tr>
        <th>></th>
        <th>Maior que</th>
        </tr>
        <tr>
        <th><=</th>
        <th>Menor que ou igual a</th>
        </tr>
        <tr>
        <th>>=</th>
        <th>Maior que ou igual a </th>
        </tr>
        <tr>
        <th>==</th>
        <th>igual</th>
        </tr>
    </tbody>
    <tfoot>
        <tr>
        <th>!=</th>
        <th>Diferente de</th>
        </tr>
    </tfoot>
</table>

<h2>Operadores Lógicos</h2>
<p>Os operadores lógicos, junto com os operadores relacionais, são empregrados na construção de expressões lógicas, que são aquelas expressões que sempre resultam num valor verdadeiro ou falso.<br></p>

<table>
    <caption>Lógicos</caption>
        <thead>
            <tr>
            <th>Operadores</th>
            <th>Descrição</th>
            </tr>
        </thead>
        <tbody>
        <tr>
        <th>&& (and)</th>
        <th>Efetua a operação lógica "e". Se ambas as expressões forem verdadeiras.</th>
        </tr>
        <tr>
        <th>|| (or)</th>
        <th>Efetua a operação lógica "ou". Se uma das expressões (ou ambas) for verdadeira, então o resultado será verdadeiro. </th>
        </tr>
        </tbody>
        <tfoot>
        <tr>
        <th><h3>! (not)</h3></th>
        <th>Efetua a negação de uma expressão lógica. Se ela for verdadeira,a torna falsa e vice-versa</th>
        </tr>
        </tfoot>
</table>


<br>

#

<p>Podemos <b> incrementar </b>e <b> decrementar</b></p> uma váriável utilizando ++ ou -- .<br>Exemplo: <br> int x = 2 ; <br> int a = 2 * ++x ;</p>
<p>A classe <b>String</b> : <br> é  arepresentação de textos (representado por aspas duplos) , <br>Stirng nome = "Maria";</p>

#

<h2>Vetores e Matrizes</h2>
<p>no inicio de estudo a lógica de progrmação pensei que vetor fosse a parte mais dificíl, porém vetor trata-se de uma variável que agrupa num único nome uma série de valores que apresentam similiaridade quanto ao tipo de dado.<br>
um vetor é unidimensional, no entanto podemos ter também veotres com duas ou mais dimensões e costuma chamar-se de matrizes.<br>
então matriz é um vetor que possui outro vetor, ou seja, cada elemento do primeiro vetor é subdividido novamente.<br>
então deixa eu te explicar se um vetor é uma variável com um grupo de valores a matriz são vetores com grupos de valores dentro de uma unica variável.</p>

#

