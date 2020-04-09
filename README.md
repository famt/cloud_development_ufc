

# CK0205 - Desenvolvimento de Software para Nuvem

(Essa disciplina já foi oferecida como CKP8422 - Topicos Especiais Em Redes E Sist. Distribuidos II)

## Ciência da Computação, [Departamento de Computação](http://www.dc.ufc.br), ([UFC](http://www.ufc.br))

### Instrutores

* **Professor** - Fernando Trinta ([fernando.trinta@dc.ufc.br](mailto:fernando.trinta@dc.ufc.br))
* **Professor** - Paulo Rêgo ([pauloalr@dc.ufc.br](mailto:pauloalr@dc.ufc.br))

### Local

Bloco 942-A (GREat), Terça e Quintas (14:00-16:00), Sala Lagoinha.


### Edições passadas

- Edições passadas à 2018.1, apenas no SigaA.
- A partir de 2019, as edições anteriores podem ser acessadas de acordo com seus respectivos branches.

### Ementa

Computação em Nuvem é o termo bastante difundido que representar um novo modelo de uso de recursos de TI (hardware, software, dados), onde tais recursos são oferecidos remotamente aos seus usuários, em geral por meio de virtualização. Este novo modelo tem alcançado muito sucesso, pois traz consigo benefícios como utilização de recursos sob demanda, otimização de desempenho e escalabilidade. Porém, o benefício destas propriedades requer que aplicações sejam concebidas com foco na nuvem. Neste sentido, esta disciplina busca apresentar ao aluno como aplicações podem tirar proveito da nuvem para alcançar benefícios como alta elasticidade, maior desempenho e alta disponibilidade.

Um relato de experiência das várias edições desta disciplina pode ser estudado no artigo [Teaching Software Development for the Cloud: An Experience Report](https://dl.acm.org/citation.cfm?id=3131151.3131184), publicado no Congresso Brasileiro de Software 2017.

### Tópicos 

Conceitos Básicos de Computação em Nuvem. Modelos de Serviços e de Implantação em Nuvem. Virtualização. Desenvolvimento com PaaS. Desenvolvimento SaaS. Multitenancy. Mobile Cloud Computing. Desafios para software em nuvem.

### Bibliografia Sugerida

Não há livro texto obrigatório. Entretanto, a seguir estão alguns livros que podem ser recomendados:

- [Essentials of Cloud Computing (CRC Press)](https://www.amazon.com/Essentials-Cloud-Computing-K-Chandrasekaran/dp/1482205432)

- [Cloud Computing: Concepts, Technology & Architecture (The Prentice Hall Service Technology Series from Thomas Erl)](https://www.amazon.com/Cloud-Computing-Concepts-Technology-Architecture/dp/0133387526)

- [Building Microservices: Designing Fine-Grained Systems](https://www.amazon.com/Building-Microservices-Designing-Fine-Grained-Systems/dp/1491950358)

### Bibliografia Complementar

- [The Practice of Cloud System Administration](http://www.the-cloud-book.com/)

- [The evolution of DevOps](https://www.oreilly.com/ideas/the-evolution-of-devops?imm_mid=0f5f78&cmp=em-webops-na-na-vlny17_nurture_em9_evolution_devops)


### Bibliografia sobre Ferramentas, Frameworks e Tecnologias

- [Whitepapers AWS](https://aws.amazon.com/pt/whitepapers/)
- [Whitepapers Google Cloud Platform](https://cloud.google.com/whitepapers/)
- [Whitepapers Microsoft Azure](https://azure.microsoft.com/pt-br/resources/whitepapers/)

### Blogs, Disciplinas, Treinamentos


- [Google Cloud Platform Blog](https://cloudplatform.googleblog.com/)
- [DevOps | AWS Cloud | Cloud Tutorials for Beginners](https://www.youtube.com/playlist?list=PLLsor6GJ_BEEVWzDS3eHLdLkSZsoVnB98)
- [Containers Patterns: There are a thousand ways to use containers](https://l0rd.github.io/containerspatterns/#1)
- [AWS Tutoriais](https://aws.amazon.com/pt/getting-started/tutorials/)
- [Google Cloud Platform Tutorais](https://cloud.google.com/docs/tutorials)
- [Microsoft Azure Tutoriais](https://azure.microsoft.com/pt-br/get-started/)

### Objetivos

 - Objetivo Geral
Introduzir ao aluno os principais conceitos do paradigma de computação móvel em nuvem, em especial, àqueles relacionados ao desenvolvimento de aplicações.

 - Objetivos Específicos
Apresentar os modelos de serviços em nuvem (Infraestrutura como Serviço, Plataforma como Serviço e Software como Serviço), Modelos de Implantação (Nuvem Pública, Privada, Comunitária e Híbrida), Principais plataformas de nuvem públicas (Amazon AWS, Google AppEngine, Microsoft Azure) e para nuvens privadas (OpenStack, CloudStack, OpenNebula, Eucalyptus). Apresentar o modelo de programação Map/Reduce e o conceito de criação de software multi inquilino (MultiTenancy). Discutir sobre os desafios para o desenvolvimento de software para/e com a nuvem.

### Metodologia

A metodologia do curso constará de aulas expositivas, enriquecidas por seminários e debates com a utilização de recursos audiovisuais. As avaliações serão baseadas nas aulas, exercícios dirigidos, e o projeto final.

### Pré-Requisitos

Para participar deste curso é desejável que os participantes tenham:

- **Inglês técnico** para leitura, estudo e acompanhamento das atividades propostas, uma vez que a maior parte do material disponível está em inglês.
- Conhecimento básico de arquitetura de computadores, sistemas operacionais, redes, engenharia de software, sistemas distribuídos e banco de dados.
- Conhecimento de plataformas de desenvolvimento de software para Web;

#### Artigos
Estes artigos podem ser obtidos a partir da rede da UFC, mediante acesso ao portal de periódicos da CAPES.

* [Software Engineering for the Cloud: A Research Roadmap](http://ieeexplore.ieee.org/document/6337860/)

#### Glossário de Ferramentas

* [Amazon AWS](http://aws.amazon.com/)
* [Google Cloud Platform](http://cloud.google.com/)
* [OpenStack](http://www.openstack.org/)
* [Kubernetes](https://kubernetes.io/)



### Avaliação


A avaliação será feita a partir da realização de uma prova escrita (PE) e da realização de trabalhos práticos nos assuntos das disciplinas. Serão realizados os seguintes trabalhos:

* T1 = Aplicação Web com Amazon AWS + Escalabilidade
* T2 = Aplicação Web em uma plataforma opensource ou PAAS (a escolha do aluno)
* T3 = Uso de Map/Reduce para processamento intensivo de Dados
* T4 = Desenvolvimento/Implantação de uma aplicação com Docker/Kubernetes
* T5 = Aplicação Móvel com CAOS MS (Opcional para quem quiser melhorar nota)

A Nota final será calculada com base na Fórmula **NF = {Prova + [(T1 + ... + T4)/4 + T5]}/2**

Alunos que não obtiverem nota acima ou igual a 7,0 (sete), farão prova final escrita sobre todo o conteúdo da disciplina.


### Plano de aulas


| Aulas       | Tópicos                      | Recursos | Tarefas |
|:-------------:|-----------------------------|:---------:|:-----------:|
|18 Fev 2020| Apresentação da Disciplina | [Slides](https://docs.google.com/presentation/d/1VqJDR1fjlsLJw9cwZfLd74rARmFjHDPOE0fVNH8A17Y/edit?usp=sharing) | - |
|20 Fev 2020| Não haverá aula | - | - |
|25 Fev 2020| Carnaval | - | - |
|27 Fev 2020| Conceitos Básicos sobre Nuvem | [Slides](https://docs.google.com/presentation/d/1LIIyQNGq1xrtX1F3COG2g-70yFr8LzdJKtoo_KmIXTo/edit?usp=sharing) | [Artigo NIST](https://csrc.nist.gov/publications/detail/sp/800-145/final) |
| | | | [Artigo Definições sobre CC](http://www.sigcomm.org/node/2749) |
| | | | [Caps 2, 4 e 5 - Essentials of Cloud Computing](https://www.crcpress.com/Essentials-of-Cloud-Computing/Chandrasekaran/p/book/9781482205435) |
|03 Mar 2020| Caso de Estudo Núvem Pública: AWS | [Slides](https://docs.google.com/presentation/d/1TToinfxBdRqmmYpUxjk13sPP5HxlLuC1l92nNgte1No/edit?usp=sharing) | (http://aws.amazon.com) |
|05 Mar 2020| Amazon AWS Restfull API | - | [Trabalho Prático 1 - AWS](https://github.com/famt/cloud_development_ufc/blob/2020/trabalhos/T1-TrabalhoAWS.pdf) |
| |  |  | [AWS SDKs](https://aws.amazon.com/pt/tools/) |
| |  |  | [Exemplo NodeJS](https://github.com/famt/cloud_development_ufc/blob/2020/exemplos/aws_2020.zip)  |
|10 Mar 2020| Soluções Open Source para Nuvens Privadas | [Slides](https://docs.google.com/presentation/d/1AsFHOm1WkQUfTOhv1uIBql5Orzn_a0mi4pJpMGNRbOY/edit?usp=sharing) | [Cap. 12 (Open Source Support for Cloud) - Essentials of Cloud Computing](https://www.crcpress.com/Essentials-of-Cloud-Computing/Chandrasekaran/p/book/9781482205435) |
|12 Mar 2020| Estudo de Caso: OpenStack | - | - |
|17 Mar 2020| Elasticidade | [Slides](https://docs.google.com/presentation/d/1-l8nAf8QyUlkFnfSHP2nsczyWxKj28UNK6G7lZP2L-g/edit?usp=sharing) | [Vídeo-Aula](https://drive.google.com/file/d/1GJ4U7YVo_r2XvSNdDEVKQD9_-AcbgBZo/view?usp=sharing) |
|19 Mar 2020| Feriado Estadual - Dia de São José | - | - |
|24 Mar 2020| Elasticidade na prática: Auto Scalling Groups | - | [Vídeo-Aula](https://www.youtube.com/watch?v=DcrV9c8VM7o&t=79s) |
07 Abr 2020| Entrega de Trabalho I - AWS | - | [Planilha de Notas](https://docs.google.com/spreadsheets/d/12CBYpYAFRGJTeTmaOhhkRlYQ9dwjTbt-TZ8IA-nlUhI/edit?usp=sharing) |
|07 Abr 2020| Google Cloud Platform | [Slides](https://docs.google.com/presentation/d/105yo6MJTTBUtthjhoXjf_-mArEimDsIQflEP9UkbjAg/edit?usp=sharing) | [Vídeo-Aula 1](https://drive.google.com/file/d/13f_s4vyan-2FCNgmbryogX0F7DbtdB2J/view?usp=sharing) [Vídeo-Aula 2](https://drive.google.com/file/d/1HyWt-Qa2YZEUl7Opj_puxB8hz8ZAv4uo/view?usp=sharing) |
|02 Abr 2020| Encontros Universitários 2019 | - | - |
|07 Abr 2020| Software como Serviço  | - | - |
|09 Abr 2020| Semana Santa | - | - |
|14 Abr 2020| Desafios de Engenharia de Software para Nuvem  | - | - |
|16 Abr 2020| Virtualização | - | - |
|21 Abr 2020| Feriado Nacional - Tiradentes | - | - |
|23 Abr 2020| Containers e Microserviços | - | - |
|28 Abr 2020| Prática - Kubernets/Docker | - | - |
|30 Mai 2020| Revisão - Avaliação Escrita | - | - |
|05 Mai 2020| Prova Escrita | - | - |
|07 Mai 2020| Processamento Intensivo (Map/Reduce) | - | - |
|12 Mai 2020| Aula Prática - Elastic Map Reduce | - | - |
|14 Mai 2020| Ambientes Multicloud | - | - |
|19 Mai 2020| Integração Mobile + Nuvem | - | - |
|21 Mai 2020| Estudo de Caso: CAOS MS | - | - |
|26 Mai 2020| a definir | - | - |
|28 Jun 2020| a definir | - | - |
|02 Jun 2020| a definir | - | - |
|04 Jun 2020| a definir | - | - |
|09 Jun 2020| a definir | - | - |
|11 Jun 2020| a definir | - | - |
|16 Jun 2020| a definir | - | - |
|18 Jun 2020| a definir | - | - |
|23 Jun 2020| a definir | - | - |
|25 Jun 2020| a definir | - | - |
|30 Jun 2020| a definir | - | - |
|02 Jul 2020| a definir | - | - |
|06 Jul 2020| Prazo Final para Consolidação de Notas | - | - |
