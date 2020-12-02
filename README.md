

# CK0205 - Desenvolvimento de Software para Nuvem

(Essa disciplina já foi oferecida como CKP8422 - Topicos Especiais Em Redes E Sist. Distribuidos II)

## Ciência da Computação, [Departamento de Computação](http://www.dc.ufc.br), ([UFC](http://www.ufc.br))

### Instrutores

* **Professor** - Fernando Trinta ([fernando.trinta@dc.ufc.br](mailto:fernando.trinta@dc.ufc.br))
* **Professor** - Paulo A L Rego ([paulo@dc.ufc.br](mailto:paulo@dc.ufc.br))

### Local

Terça e Quintas (14:00-16:00), Aulas pré-gravadas e Reuniões tíra-dúvidas pelo GoogleMeets.


### Edições passadas

- Edições passadas à 2018.1, apenas no SigaA.
- A partir de 2019, as edições anteriores podem ser acessadas de acordo com seus respectivos branches.
- Edição de 2020.1, aulas online disponíveis devido à pandemia de Covid19

### Ementa

Computação em Nuvem é o termo bastante difundido que representar um novo modelo de uso de recursos de TI (hardware, software, dados), onde tais recursos são oferecidos remotamente aos seus usuários, em geral por meio de virtualização. Este novo modelo tem alcançado muito sucesso, pois traz consigo benefícios como utilização de recursos sob demanda, otimização de desempenho e escalabilidade. Porém, o benefício destas propriedades requer que aplicações sejam concebidas com foco na nuvem. Neste sentido, esta disciplina busca apresentar ao aluno como aplicações podem tirar proveito da nuvem para alcançar benefícios como alta elasticidade, maior desempenho e alta disponibilidade.

Um relato de experiência das várias edições desta disciplina pode ser estudado no artigo [Teaching Software Development for the Cloud: An Experience Report](https://dl.acm.org/citation.cfm?id=3131151.3131184), publicado no Congresso Brasileiro de Software 2017.

### Tópicos 

Conceitos Básicos: O que é Cloud Computing? Vantagens. Desvantagens. Características. Exemplos de Sucesso. Modelos de Serviço e Implantação. Plataformas públicas e de Desenvolvimento para Nuvem. Amazon AWS. Google App Engine. Microsoft Azure.  Soluções open source para computação em nuvem: Open Stack, OpenNebula, CloudStack. Técnicas de Virtualização. Containers/Microsserviços/Kubernetes. Engenharia de Software para Nuvem. Problemas e Possíveis Soluções. Multicloud. Paradigmas de Programação para Nuvem, como o Map/Reduce. Ecossistema Apache Hadoop para desenvolvimento de soluções Big Data. Serverless. Tópicos relacionados: Mobile Cloud Computing, IoT e Fog Computing.


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


A avaliação será feita a partir da realização de 5 trabalhos práticos e 2 seminários. Serão realizados os seguintes trabalhos:

* T1 = Aplicação Web com Amazon AWS + Elasticidade
* T2 = Aplicação Web em uma plataforma PaaS
* T3 = Desenvolvimento/Implantação de uma aplicação com Docker Compose
* T4 = Uso de Map/Reduce para processamento intensivo de Dados
* T5 = Desenvolvimento de uma aplicação que use Serverless e/ou Algorithmia



A Nota final será calculada com base na média ponderada dos trabalhos e seminários, com peso 1 para trabalhos, e peso 2 para seminários. 

Alunos que não obtiverem nota acima ou igual a 7,0 (sete), farão prova final escrita sobre todo o conteúdo da disciplina.


### Plano de aulas


| Aulas       | Tópicos                      | Recursos | Tarefas |
|:-------------:|-----------------------------|:---------:|:-----------:|
|24 Nov 2020| Apresentação da Disciplina | [Slides](https://docs.google.com/presentation/d/1r0ud_XY3TH5nyv9JVReP4_Edt6zdWNh7NDAMyjlAt64/edit?usp=sharing) / [Video-Aula Apresentação da Disciplina](https://drive.google.com/file/d/1-ymdNQGkKrGUsYdBYdFbogUEXCuBpYyB/view?usp=sharing) |   |
|26 Nov 2020| Conceitos Básicos sobre Nuvem | [Slides](https://docs.google.com/presentation/d/1LIIyQNGq1xrtX1F3COG2g-70yFr8LzdJKtoo_KmIXTo/edit?usp=sharing) / [Video-Aula Conceitos Básicos](https://drive.google.com/file/d/1LVPV1TJ9nxAMEQY2iYFy8Oq5cCVg-7eA/view?usp=sharing)| Leitura do [Artigo NIST](https://csrc.nist.gov/publications/detail/sp/800-145/final) e do [Artigo sobre Definições de CC](http://www.sigcomm.org/node/2749)  |
| | | [Video-Aula - Características Essenciais](https://drive.google.com/file/d/10BDhQQJ7aW1yijYHVRnTjTu-vpKUdP3O/view?usp=sharing) |  |
|01 Dez 2020 | Conceitos Básicos sobre Nuvem (Continuação) | [Video-Aula Modelos de Serviço](https://drive.google.com/file/d/1Zi_LG7MVmYqdpndz-wlWCdXca4fDJ4CI/view?usp=sharing) |  |
| | | [Video-Aula - Modelos de Implantação/Desafios](https://drive.google.com/file/d/1D56NCLVy-C35PUz9R2HhJQ8nIe60C0kp/view?usp=sharing) | Leitura dos [Caps 2, 4 e 5 - Essentials of Cloud Computing](https://www.crcpress.com/Essentials-of-Cloud-Computing/Chandrasekaran/p/book/9781482205435) |
