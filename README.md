<div align="center">

# 🌀 **Desafio – Processador de Palíndromos**  

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="90"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="90"/>

</div>


## 🎯 **Objetivo do Desafio**
Praticar **Lógica de Programação**, criando um programa capaz de identificar se uma string é um **palíndromo**, e utilizar **ferramentas de IA** para auxiliar em correções, melhorias e depuração do código.  
O propósito não é apenas entregar o resultado final, mas demonstrar o processo de evolução do código.

---


## 📝 **Linguagem Escolhida**
Para este desafio, optei por desenvolver a solução em **Java**, utilizando o ambiente do **Spring Tools Suite (STS)** por ser uma IDE que me deixa mais confortável e organizada para trabalhar com projetos Java.

---



## 🧩 **Etapa 1 – Estrutura Inicial**
- Criei um projeto Java chamado **processar_palindromos**.  
- Criei o repositório:  
  🔗 **https://github.com/Rayssa-Ferraz/desafio_palindromos**  
- Desabilitei todos os plugins de IA da IDE.  
- Desenvolvi a primeira versão do código, bem simples e direta.  
- Fiz o print da versão inicial conforme solicitado.

A primeira versão funcionava, mas era limitada: não removia espaços ou pontuações, aceitava apenas uma entrada por execução e não tinha interação com o usuário além do básico.

---

## 🤖 **Etapa 2 – Uso da IA na Depuração**
Com a IA habilitada, pedi sugestões de melhorias.  
A partir disso trabalhei em:

✔ otimização do código  
✔ limpeza da string  
✔ inclusão de um loop para testar múltiplas entradas  
✔ criação de um menu no console  
✔ interação mais amigável  
✔ diferenciação visual das mensagens  
✔ melhorias na experiência do usuário  

As sugestões da IA foram analisadas, ajustadas e adaptadas manualmente até chegar à versão final.

---

## 🛠️ **Lógica Utilizada na Solução Final**

A solução final segue esta lógica:

Primeiro, desenvolvi uma versão inicial bem simples: o programa lia uma palavra, invertia a string e verificava se era igual ao original — sem remover espaços, sem limpar caracteres e sem permitir múltiplas entradas. Essa primeira versão serviu como base para evolução.

Na versão final, o programa passou a trabalhar com uma string normalizada: transformada em minúsculas e com remoção de espaços, pontuação e símbolos. Em seguida, essa string "limpa" é invertida manualmente por um laço `for` e comparada com a versão original limpa.  
Se ambas forem iguais, é identificada como palíndromo; caso contrário, não é.

O programa foi colocado dentro de um laço `while` para permitir testes contínuos sem reiniciar. Também foi criado um menu que permite continuar pressionando ENTER ou encerrar digitando “SAIR”, tornando a experiência mais fluida.  

Além disso, foram adicionadas estilizações no console para melhorar a visualização.

---

## ⚙️ **A solução é eficiente com strings grandes?**

Sim.  
Mesmo utilizando a inversão manual por um `for`, o algoritmo tem complexidade **O(n)** — o que significa que ele é eficiente e cresce de forma proporcional ao tamanho da string.  
Para os propósitos do desafio e do console, o desempenho é totalmente adequado e estável mesmo com strings longas.

---

## ▶️ **Como Executar o Projeto**

1. Clone o repositório:
   
   ```
   git clone https://github.com/Rayssa-Ferraz/desafio_palindromos
   ```

2. Abra o Eclipse/STS e selecione a pasta do Workspace onde você clonou o repositório do projeto
3. No menu superior do Eclipse/STS, clique na opção: File 🡲 Import...
4. Na janela Import, selecione a opção: General 🡲 Existing Projects into Workspace e clique no botão Next
5. Na janela Import Projects, no item Select root directory, clique no botão Browse... e selecione a pasta do Workspace onde você clonou o repositório do projeto
6. O Eclipse/STS reconhecerá automaticamente o projeto
7. Marque o processar_palindromos no item Projects e clique no botão Finish para concluir a importação.

---

## 📸 Imagem do Resultado no Console
<img src="https://ik.imagekit.io/f9incgeso/palindromoresultado.JPG?updatedAt=1764310482301" width="650">

---

## ⭐ Autora

👩‍💻 Desenvolvido por [**Rayssa Ferraz**](https://github.com/Rayssa-Ferraz)

📧 Contato: rayssa_nana@hotmail.com

🌎 [**Meu site**](https://rayssa-ferraz.github.io/PORTFOLIO)
