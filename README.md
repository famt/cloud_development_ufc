

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
|01 Dez 2020 | Conceitos Básicos sobre Nuvem (Continuação) | [Video-Aula - Modelos de Serviço](https://drive.google.com/file/d/1Zi_LG7MVmYqdpndz-wlWCdXca4fDJ4CI/view?usp=sharing) |  |
| | | [Video-Aula - Modelos de Implantação/Desafios](https://drive.google.com/file/d/1D56NCLVy-C35PUz9R2HhJQ8nIe60C0kp/view?usp=sharing) | Leitura dos [Caps 2, 4 e 5 - Essentials of Cloud Computing](https://www.crcpress.com/Essentials-of-Cloud-Computing/Chandrasekaran/p/book/9781482205435) |
|03 Dez 2020| Amazon Web Services | [Slides](https://docs.google.com/presentation/d/1TToinfxBdRqmmYpUxjk13sPP5HxlLuC1l92nNgte1No/edit?usp=sharing) / [Video-Aula Apresentação AWS (Parte1)](https://drive.google.com/file/d/1VQ9A5BYx8ntqkjLIDH-1CE_pPVC3bm-3/view?usp=sharing) / [Video-Aula Apresentação AWS (Parte2)](https://drive.google.com/file/d/1cpofQcNIIFNd3Sqt1nlcsyLfl1he_l6l/view?usp=sharing) | [Documentação AWS](https://docs.aws.amazon.com/)  |
|08 Dez 2020| Amazon AWS Restfull API | [Slides](https://docs.google.com/presentation/d/1Qhwa6rTJeqFD0a13228yxu-fJNMtWO24zsWge-JdeR0/edit?usp=sharing) / [Video-Aula ](https://drive.google.com/file/d/1gIDrNsZekXCQImkzLWLbo7gVDV0yfr7k/view?usp=sharing) | [AWS SDKs](https://aws.amazon.com/pt/tools/)  |
| |  |  | [Exemplo NodeJS](https://github.com/famt/cloud_development_ufc/blob/2020/exemplos/aws_2020.zip)  |
| |  |  | [Especificação Trabalho 1](https://docs.google.com/document/d/1so-heS5DndeBjgpI4UT8GD0d0siOWyxj0THEbMipn_0/edit?usp=sharing)  |
|10 Dez 2020| Open Source Cloud | [Slides](https://docs.google.com/presentation/d/1AsFHOm1WkQUfTOhv1uIBql5Orzn_a0mi4pJpMGNRbOY/edit?usp=sharing) / [Video-Aula ](https://drive.google.com/file/d/1nzCFtFBpdRxRzVETIm0H0R-7m8nfK9Fa/view?usp=sharing) |  Leitura do [Cap. 12 - Essentials of Cloud Computing](https://www.crcpress.com/Essentials-of-Cloud-Computing/Chandrasekaran/p/book/9781482205435) |
|15 Dez 2020|Open Source Cloud: Visão Prática|[Video-Aula](https://drive.google.com/file/d/1jN5Yoxjqpafu_iaTGYl7LvG9s5GX93-n/view?usp=sharing)| [OpenStack](https://docs.openstack.org)/[OpenNebula](https://opennebula.io/docs/) |
|17 e 22 Dez 2020|Google Cloud Platform|[Slides](https://docs.google.com/presentation/d/1L9gwdv8_U_LfFfFvbSKI3FtklrkxbCu3KoDXe0Hy42I/edit?usp=sharing) / Video-Aula [parte 1](https://drive.google.com/file/d/155CXI29zDDw4uItNIHqx_aaFstAEyVOe/view?usp=sharing) / [parte 2](https://drive.google.com/file/d/1npXq197zZM19-z_ZCPKyBGx5yT48BosU/view?usp=sharing)| [Documentação GCP](https://cloud.google.com/docs) |
|07 Jan 2021|Google Cloud Platform APIs e AppEngine|[Slides](https://docs.google.com/presentation/d/1k81bsDVMaJy7qkDIUcivWks1JtfLWljuWJ0IYmhnFnQ/edit?usp=sharing) / [Video-Aula](https://drive.google.com/file/d/1FX0zPHw-Wl9kITfk3YtR2SkFHTWwTAwY/view?usp=sharing)| [Jupyter Notebook](https://drive.google.com/file/d/1RHvabTcnDUHN97A0L9XmWvUcADBcbuF6/view?usp=sharing) |
| | Mais sobre o GCP: |[Introdução](https://drive.google.com/file/d/1h39lVYV4RCcwzPXzuVP-ctXng8Sm63CH/view?usp=sharing) / [Dicas Iniciais](https://drive.google.com/file/d/1rekBhHB5WT_nx9mru9lqvBSd3o0ki9NR/view?usp=sharing) / [Exemplo Datastore](https://drive.google.com/file/d/1JndsvV81xjCi691P4jb687PL6iv2znCU/view?usp=sharing) / [Exemplo Storage](https://drive.google.com/file/d/1EbyI1a88YoTZeAPnB6mGh7F6yGmj8hTB/view?usp=sharing) / [Permissões de Acesso](https://drive.google.com/file/d/1w9C2QifZzBJuJ8f-OqjM1Tf2slX6Hk8G/view?usp=sharing) / [Deploy](https://drive.google.com/file/d/1ZMggT0Nj8Ol6NrhiLSYXHRDfeBkCZjxj/view?usp=sharing)| |
|12 Jan 2021|Elasticidade|[Slides](https://docs.google.com/presentation/d/1-l8nAf8QyUlkFnfSHP2nsczyWxKj28UNK6G7lZP2L-g/edit?usp=sharing) / [Video-Aula](https://drive.google.com/file/d/1f65PRm0X_x-xO6V422eY2HbzWcZ3K9gX/view?usp=sharing)| |
|14 Jan 2021| Elasticidade na prática: Auto Scalling Groups | [Vídeo-Aula](https://www.youtube.com/watch?v=DcrV9c8VM7o&t=79s) |  |
|19 Jan 2021| Virtualização | [Slides](https://docs.google.com/presentation/d/1wxvtghuxDr_0wz_ChV2OBj6PLY0NefKAncwEliPb_1k/edit?usp=sharing)/[Vídeo-Aula](https://drive.google.com/file/d/1piPFDPlec81obaTurICYuY8jGKO1jyn8/view?usp=sharing) |  |
|21 Jan 2021| Docker - Introdução | [Slides](https://docs.google.com/presentation/d/1aw98EWX2GrsBQOZaP8NWsxV957zgjoZQxk56geMJ8ps/edit?usp=sharing) / [Vídeo-Aula](https://drive.google.com/file/d/1I7GnGQcoiMvVdWVThRojkYyWbAfripSu/view?usp=sharing) | [Free Docker Books](https://github.com/grglzrv/docker-books) |
| |  |  | [Especificação Trabalho 2](https://drive.google.com/file/d/17GNdaSNZNcp17KzmIcVXrhYlURpYZVy9/view?usp=sharing)  |
|26 Jan 2021| Prática Docker e Docker Compose | [Slides](https://docs.google.com/presentation/d/1aw98EWX2GrsBQOZaP8NWsxV957zgjoZQxk56geMJ8ps/edit?usp=sharing) / Vídeo-Aulas: [Prática Docker](https://drive.google.com/file/d/1tMvgmuVG-4eYCBgLhY2lt62ICAl9PwYu/view?usp=sharing) / [Docker Compose](https://drive.google.com/file/d/1wWI4nSzxJg3yqeQGjDGxgNmnoQXuqzd-/view?usp=sharing) |  |
|28 Jan 2021| Kubernetes | [Slides](https://docs.google.com/presentation/d/1uy_yNNo1G3qiOvTKkMkjpifMRhJSzkvlwbBOTr3JKco/edit?usp=sharing) | [Lista de Video-Aulas: #2 a #10](https://www.youtube.com/playlist?list=PLXzx948cNtr8XI5JBemHT9OWuYSPNUtXs) |


