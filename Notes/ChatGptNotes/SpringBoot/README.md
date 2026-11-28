# Spring Boot — Complete Interview Preparation Index
> Java 21 · Spring Boot 3.5 teaching baseline · 10 expanded textbooks · 40 lessons · 444 PDF pages

## Module overview

| Module | Lessons | Pages | Interview priority | PDF |
| --- | --- | ---: | --- | --- |
| [01. Spring Core Fundamentals](#module-01--spring-core-fundamentals) | 1–6 | 44 | Very high | [Open PDF](./Spring_Boot_Module_1_Expanded.pdf) |
| [02. Spring Boot Internals](#module-02--spring-boot-internals) | 7–10 | 37 | Very high | [Open PDF](./Spring_Boot_Module_2_Expanded.pdf) |
| [03. Spring MVC and REST APIs](#module-03--spring-mvc-and-rest-apis) | 11–16 | 55 | Very high | [Open PDF](./Spring_Boot_Module_3_Expanded.pdf) |
| [04. Spring Data JPA and Hibernate](#module-04--spring-data-jpa-and-hibernate) | 17–23 | 61 | Very high | [Open PDF](./Spring_Boot_Module_4_Expanded.pdf) |
| [05. Spring AOP and Transaction Management](#module-05--spring-aop-and-transaction-management) | 24–26 | 40 | Very high | [Open PDF](./Spring_Boot_Module_5_Expanded.pdf) |
| [06. Spring Security](#module-06--spring-security) | 27–30 | 42 | High | [Open PDF](./Spring_Boot_Module_6_Expanded.pdf) |
| [07. Unit and Integration Testing](#module-07--unit-and-integration-testing) | 31–33 | 41 | High | [Open PDF](./Spring_Boot_Module_7_Expanded.pdf) |
| [08. Production-ready Spring Boot](#module-08--production-ready-spring-boot) | 34–35 | 38 | Medium | [Open PDF](./Spring_Boot_Module_8_Expanded.pdf) |
| [09. Microservices and Backend Integration](#module-09--microservices-and-backend-integration) | 36–38 | 44 | High | [Open PDF](./Spring_Boot_Module_9_Expanded.pdf) |
| [10. Interview Consolidation](#module-10--interview-consolidation) | 39–40 | 42 | Final revision | [Open PDF](./Spring_Boot_Module_10_Expanded.pdf) |
| **Total** | **1–40** | **444** | | |

## Study progress

- [ ] Module 01 — Spring Core Fundamentals (read, implement lab, answer interview questions without notes)
- [ ] Module 02 — Spring Boot Internals (read, implement lab, answer interview questions without notes)
- [ ] Module 03 — Spring MVC and REST APIs (read, implement lab, answer interview questions without notes)
- [ ] Module 04 — Spring Data JPA and Hibernate (read, implement lab, answer interview questions without notes)
- [ ] Module 05 — Spring AOP and Transaction Management (read, implement lab, answer interview questions without notes)
- [ ] Module 06 — Spring Security (read, implement lab, answer interview questions without notes)
- [ ] Module 07 — Unit and Integration Testing (read, implement lab, answer interview questions without notes)
- [ ] Module 08 — Production-ready Spring Boot (read, implement lab, answer interview questions without notes)
- [ ] Module 09 — Microservices and Backend Integration (read, implement lab, answer interview questions without notes)
- [ ] Module 10 — Interview Consolidation (read, implement lab, answer interview questions without notes)

## Quick concept finder

Use these entry points for focused revision. The detailed page index below gives finer-grained coverage.

| Concept / interview scenario | Start here |
| --- | --- |
| IoC, constructor injection, bean selection | [M01](#module-01--spring-core-fundamentals) pp. 8–12, 31–37 |
| BeanFactory, ApplicationContext, refresh, post-processors | [M01](#module-01--spring-core-fundamentals) pp. 13–17; [M02](#module-02--spring-boot-internals) pp. 18–24 |
| Bean lifecycle, scopes, singleton thread safety | [M01](#module-01--spring-core-fundamentals) pp. 24–30; [M03](#module-03--spring-mvc-and-rest-apis) pp. 14 |
| Starters, Maven, BOM, executable JAR | [M02](#module-02--spring-boot-internals) pp. 3–9 |
| Auto-configuration, conditions, back-off | [M02](#module-02--spring-boot-internals) pp. 10–17 |
| Properties, YAML, profiles, typed configuration | [M02](#module-02--spring-boot-internals) pp. 25–32 |
| DispatcherServlet, HandlerMapping, HandlerAdapter | [M03](#module-03--spring-mvc-and-rest-apis) pp. 3–14 |
| Jackson, HTTP binding and ResponseEntity | [M03](#module-03--spring-mvc-and-rest-apis) pp. 15–21 |
| DTOs, validation, ProblemDetail | [M03](#module-03--spring-mvc-and-rest-apis) pp. 22–34 |
| REST semantics, duplicate POST, filters and interceptors | [M03](#module-03--spring-mvc-and-rest-apis) pp. 35–41; [M09](#module-09--microservices-and-backend-integration) pp. 26; [M10](#module-10--interview-consolidation) pp. 12 |
| Repository proxy, entity states and ID generation | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 3–13 |
| Persistence context, dirty checking, flush and commit | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 14–19; [M05](#module-05--spring-aop-and-transaction-management) pp. 18 |
| Relationships, mappedBy, cascade, orphan removal | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 20–25 |
| Lazy loading, N+1, fetch joins, entity graphs | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 26–31 |
| JPQL, projections and pagination | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 32–37 |
| Caching, optimistic and pessimistic locking | [M04](#module-04--spring-data-jpa-and-hibernate) pp. 38–44; [M08](#module-08--production-ready-spring-boot) pp. 15–19 |
| AOP proxies and self-invocation | [M05](#module-05--spring-aop-and-transaction-management) pp. 3–10; [M05](#module-05--spring-aop-and-transaction-management) pp. 38 |
| Rollback, transaction manager and @Transactional | [M05](#module-05--spring-aop-and-transaction-management) pp. 11–21 |
| Propagation, isolation and concurrency anomalies | [M05](#module-05--spring-aop-and-transaction-management) pp. 22–32 |
| Authentication, sessions, CORS and CSRF | [M06](#module-06--spring-security) pp. 3–9 |
| Filter chain, SecurityContext and providers | [M06](#module-06--spring-security) pp. 10–17 |
| JWT, refresh tokens and password hashing | [M06](#module-06--spring-security) pp. 18–24 |
| OAuth 2.0, OIDC, PKCE and ownership checks | [M06](#module-06--spring-security) pp. 25–31 |
| JUnit lifecycle, assertions and parameterized tests | [M07](#module-07--unit-and-integration-testing) pp. 3–10 |
| Mockito mocks, stubs, spies and verification | [M07](#module-07--unit-and-integration-testing) pp. 11–18 |
| MockMvc, test slices and integration tests | [M07](#module-07--unit-and-integration-testing) pp. 19–26 |
| Logging, Actuator, metrics, tracing and slow API | [M08](#module-08--production-ready-spring-boot) pp. 3–11; [M10](#module-10--interview-consolidation) pp. 29 |
| HikariCP and pool exhaustion | [M08](#module-08--production-ready-spring-boot) pp. 12–14, 34 |
| Redis, TTL and cache invalidation | [M08](#module-08--production-ready-spring-boot) pp. 15–19, 32–33 |
| Async, thread pools and scheduling | [M08](#module-08--production-ready-spring-boot) pp. 20–24 |
| REST clients and downstream failure handling | [M09](#module-09--microservices-and-backend-integration) pp. 3–15 |
| Kafka, offsets, consumer groups and delivery semantics | [M09](#module-09--microservices-and-backend-integration) pp. 16–20 |
| SQS, EventBridge and Lambda | [M09](#module-09--microservices-and-backend-integration) pp. 21–23 |
| Saga, outbox and idempotent consumer | [M09](#module-09--microservices-and-backend-integration) pp. 24–26, 34–40 |
| Capstone, 50 interview questions, debugging and mock rounds | [M10](#module-10--interview-consolidation) pp. 3–38 |

---

## Module 01 — Spring Core Fundamentals

**[Download / open PDF](./Spring_Boot_Module_1_Expanded.pdf)** · **44 pages** · Priority: Very high

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 1 — Why Spring? | 3–7 |
| Lesson 2 — IoC and dependency injection | 8–12 |
| Lesson 3 — IoC container | 13–17 |
| Lesson 4 — Spring beans and configuration | 18–23 |
| Lesson 5 — Bean lifecycle and scopes | 24–30 |
| Lesson 6 — Dependency resolution | 31–37 |
| Hands-on lab | 38–42 |
| Interview revision | 43–44 |

### Lesson 1 — Why Spring? (pp. 3–7)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why Spring? The problem before the framework | Imagine a mortgage application service; The first implementation: hard-wired collaborators |
| 4 | Tight coupling, loose coupling and dependency inversion | A replaceable contract; Dependency inversion principle (DIP); Test the design before introducing Spring |
| 5 | Manual wiring versus container-managed wiring | Manual composition is a valid option; What Spring changes. **Keywords:** `@Configuration`, `@Bean` |
| 6 | Spring Framework versus Spring Boot | Understand the layers, not the branding; What each layer solves. **Keywords:** `AnnotationConfigApplicationContext` |
| 7 | Lesson 1 interview rehearsal and design exercise | Why should we use Spring instead of creating every object ourselves?; Is new prohibited in a Spring application?; Do we need an interface for every Spring bean?; What is the difference between DIP and DI?; Design exercise: split responsibilities; Notebook notes. **Keywords:** loose coupling, tight coupling, constructor injection |

### Lesson 2 — IoC and dependency injection (pp. 8–12)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 8 | Inversion of Control and Dependency Injection | The meaning of inversion; Constructor injection: mandatory dependency; What about @Autowired?. **Keywords:** `IoC`, thread-safe, `@Service` |
| 9 | Setter and field injection: when and why | Setter injection; Field injection; Comparing approaches. **Keywords:** constructor injection, `@Autowired`, `@Component`, `@Service` |
| 10 | What happens when Spring injects a constructor? | Trace a small dependency graph; Important internal names (good to know). **Keywords:** `AutowiredAnnotationBeanPostProcessor`, `DefaultListableBeanFactory`, `@Autowired`, `@Component`, `@Service` |
| 11 | Testing and optional dependencies without confusion | Unit testing a constructor-injected service; Optional collaborators are explicit choices. **Keywords:** `ObjectProvider`, prototype, `@Service` |
| 12 | Lesson 2 interview rehearsal and debugging drills | Why is constructor injection preferred over field injection?; Is DI only for interfaces?; Does a final injected field make the service thread-safe?; When would you choose ObjectProvider instead of direct injection?; Debug this snippet; Notebook notes. **Keywords:** Optional, `IoC`, setter injection, `@Autowired`, prototype, `@Service` |

### Lesson 3 — IoC container (pp. 13–17)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 13 | The IoC container and bean definitions | What is a container?; Inspect a real standalone container; Two important maps conceptually. **Keywords:** `BeanDefinition`, `AnnotationConfigApplicationContext`, prototype, singleton |
| 14 | BeanFactory versus ApplicationContext | BeanFactory: the fundamental contract; ApplicationContext: application-oriented container; Why not call getBean everywhere?. **Keywords:** `DefaultListableBeanFactory`, `AnnotationConfigApplicationContext`, singleton |
| 15 | Refresh: from registration to ready application | A simplified startup timeline; Why process metadata first?; Why register bean post-processors before creating services?; A useful mental model for Boot startup. **Keywords:** `ConfigurationClassPostProcessor`, `AnnotationConfigApplicationContext`, `@Bean`, singleton |
| 16 | Post-processors: metadata versus objects | BeanFactoryPostProcessor; BeanPostProcessor. **Keywords:** `@Bean` |
| 17 | Lesson 3 interview rehearsal and inspection exercise | Does registering a bean definition immediately construct its bean?; What is the difference between BeanFactory and ApplicationContext?; What if the bean constructor fails?; What is a BeanPostProcessor used for?; Inspect the container; Notebook notes. **Keywords:** `BeanDefinition`, `AnnotationConfigApplicationContext`, prototype, singleton |

### Lesson 4 — Spring beans and configuration (pp. 18–23)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 18 | Spring beans: what is managed and what is not? | Class, object and bean are different things; How do objects enter the container?; What should be a bean?. **Keywords:** component scanning, `@Configuration`, `@Bean`, `@Service`, singleton |
| 19 | Component scanning and package structure | How the scanner finds candidates; Correcting a scan problem. **Keywords:** `@Autowired` |
| 20 | Stereotypes and their real meaning | @Component, @Service and @Repository; @Controller and @RestController; Custom stereotypes (good to know). **Keywords:** component scanning |
| 21 | @Bean and @Configuration: explicit object construction | When a third-party class needs to be a bean; Names, aliases and explicit choices; Which approach should I choose?. **Keywords:** `proxyBeanMethods`, `@Primary`, `@Component` |
| 22 | Configuration class proxies: why direct method calls matter | Full configuration mode; Lite configuration mode; Predict the result. **Keywords:** `proxyBeanMethods`, `@Configuration`, `@Component`, `@Bean`, singleton |
| 23 | Lesson 4 interview rehearsal and debugging exercises | How is @Bean different from @Component?; Does @Service automatically create a bean everywhere?; If two @Bean methods return the same type, are they the same object?; Why use proxyBeanMethods=false with parameter injection?; Fix this mistake; Notebook notes. **Keywords:** `@Repository`, `@RestController`, `@Configuration`, singleton |

### Lesson 5 — Bean lifecycle and scopes (pp. 24–30)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 24 | Bean lifecycle: from raw object to usable bean | The main phases; Why lifecycle matters; The callback order to remember. **Keywords:** Aware, `InitializingBean`, `DisposableBean`, field injection, setter injection, `@PostConstruct`, `@PreDestroy`, singleton |
| 25 | Lifecycle demonstration with predictable output | A complete configuration fragment; Which hook should I use in real code?. **Keywords:** `InitializingBean`, `DisposableBean`, `@PostConstruct`, `@PreDestroy`, `AnnotationConfigApplicationContext`, `@Configuration`, `@Bean` |
| 26 | Bean scopes and object identity | The six common scopes; Scope is not the GoF Singleton pattern; Destruction is scope-dependent. **Keywords:** session scope, websocket, `AnnotationConfigApplicationContext`, `@Configuration`, prototype, `@Bean` |
| 27 | Scope mismatch: injecting short-lived objects into singletons | The trap; Solution: ask for a new target when needed; Web scopes and scoped proxies. **Keywords:** scoped proxy, `ObjectProvider`, prototype, `@Component`, `@Service` |
| 28 | Singleton beans and multithreading | The dangerous assumption; Preferred design: stateless services; What if we really need shared state?. **Keywords:** thread-safe, `@Service` |
| 29 | Lazy initialization, ordering and startup cost | Eager versus lazy creation; Ordering: what is guaranteed?; Practical banking example. **Keywords:** `@Lazy`, `@DependsOn`, `@Order`, `ObjectProvider`, `@Component`, `@Bean`, `@Service`, singleton |
| 30 | Lesson 5 interview rehearsal and revision | What is the Spring bean lifecycle?; Are singleton beans thread-safe? Are prototypes always thread-safe?; Does @PostConstruct execute on a manually constructed object?; Will @PreDestroy always run when a Spring application stops?; How do you get a fresh prototype for each operation?; Notebook notes. **Keywords:** request scope, `ObjectProvider` |

### Lesson 6 — Dependency resolution (pp. 31–37)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 31 | Dependency resolution: how Spring chooses a bean | @Autowired is an injection instruction; Zero candidates versus multiple candidates. **Keywords:** `NoUniqueBeanDefinitionException`, `UnsatisfiedDependencyException`, constructor injection, `@Primary`, `@Component`, `@Service` |
| 32 | @Primary, @Qualifier and bean names | Prefer a default with @Primary; Select a specific role with @Qualifier; Can Spring use the parameter name?. **Keywords:** `@Component`, `@Bean`, `@Service` |
| 33 | Collection injection and runtime routing | Sometimes multiple beans are the feature; Selecting a strategy at runtime. **Keywords:** `@Order`, `@Primary`, `@Component`, `@Service` |
| 34 | Circular dependencies: the chicken-and-egg problem | Constructor cycles cannot be built normally; Can setter injection fix a cycle?; What about @Lazy?. **Keywords:** `BeanCurrentlyInCreationException`, `@Service`, singleton |
| 35 | Refactoring circular dependencies instead of hiding them | Before: service responsibilities overlap; After: pass the required facts explicitly; Other legitimate patterns. **Keywords:** `@Service` |
| 36 | Dependency debugging: read the error from the inside out | Common errors and how to investigate; Debug a startup failure; Use targeted inspection. **Keywords:** `NoSuchBeanDefinitionException`, `NoUniqueBeanDefinitionException`, `UnsatisfiedDependencyException`, `BeanCurrentlyInCreationException`, `@Qualifier` |
| 37 | Lesson 6 interview rehearsal and revision | What if multiple beans implement the same interface?; Does a qualifier override a primary?; Can @Autowired work on a private field?; What is a circular dependency and why is a constructor cycle a problem?; What is the difference between @Order and @Primary?; Notebook notes. **Keywords:** `@Qualifier`, circular dependencies |

### Hands-on lab (pp. 38–42)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 38 | Hands-on lab: build a small mortgage integration core | Create the project |
| 39 | Lab part 2: implement collaborators and configuration | File: CoreConfig.java; What should you predict before running?. **Keywords:** `proxyBeanMethods`, `@Primary`, `@Configuration`, `@Component`, `@Bean`, singleton |
| 40 | Lab part 3: service and explicit runtime entry point | File: MortgageService.java; File: MortgageApplication.java. **Keywords:** `@Bean`, `@Service` |
| 41 | Lab part 4: verify behaviour, identity and wiring | File: MortgageServiceTest.java. **Keywords:** `AnnotationConfigApplicationContext` |
| 42 | Lab part 5: deliberately break the application and repair it | Experiment A: remove the preferred candidate; Experiment B: choose corporate instead; Experiment C: change the validator scope; Experiment D: observe actual lifecycle; Experiment E: simulate a missing registration. **Keywords:** stateless, `@PostConstruct`, `@PreDestroy`, `@Qualifier`, `@Primary`, prototype, `@Component`, singleton |

### Interview revision (pp. 43–44)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 43 | Interview revision: explain the complete story | A two-minute answer to "How does Spring DI work?"; Follow-up ladder: practice out loud; What happens if the target class is not scanned?; Why did @Autowired fail after I used new?; What if a service is injected but is actually a proxy?; Why does a field in a singleton cause request mixing?; How does Boot differ from Spring in this explanation?. **Keywords:** component scanning, `@Bean` |
| 44 | Module 1 cheat sheet and mastery checklist | Must remember without notes; Good to know, not necessary to memorize; Self-assessment (tick after demonstrating); Official documentation for deeper study. **Keywords:** `AutowiredAnnotationBeanPostProcessor`, `BeanFactoryPostProcessor`, `ConfigurationClassPostProcessor`, `@DependsOn`, tight coupling, `BeanFactory`, `ApplicationContext`, `DefaultListableBeanFactory`, `BeanPostProcessor`, `IoC`, `@Order`, circular dependencies |

[Back to module overview](#module-overview)

---

## Module 02 — Spring Boot Internals

**[Download / open PDF](./Spring_Boot_Module_2_Expanded.pdf)** · **37 pages** · Priority: Very high

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 7 — Architecture and dependencies | 3–9 |
| Lesson 8 — Auto-configuration | 10–17 |
| Lesson 9 — Startup and embedded Tomcat | 18–24 |
| Lesson 10 — External configuration | 25–32 |
| Hands-on lab | 33–36 |
| Interview revision | 37 |

### Lesson 7 — Architecture and dependencies (pp. 3–9)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why Spring Boot exists | Start with the problem, not the annotation; Convention over configuration; Interview question: Can we use Spring without Boot?. **Keywords:** Tomcat |
| 4 | The smallest Boot application | Three separate layers of responsibility; What changes if you add starter-web?. **Keywords:** `SpringApplication.run`, `@SpringBootApplication`, Tomcat |
| 5 | What exactly is a starter? | Choosing dependencies intentionally; Interview: Is a starter the same as auto-configuration?. **Keywords:** exclude, Tomcat |
| 6 | Parent POM, BOM and version alignment | What if the company requires a corporate parent?. **Keywords:** `dependencyManagement`, spring-boot-dependencies, spring-boot-starter-parent, starter |
| 7 | Dependency conflicts and classpath failures | Diagnose rather than guess. **Keywords:** effective-pom, `NoSuchMethodError`, `ClassNotFoundException`, dependency:tree, Tomcat, starter |
| 8 | How an executable Boot JAR works | Embedded server vs external server. **Keywords:** BOOT-INF, spring-boot-maven-plugin, repackage, `SpringApplication.run` |
| 9 | Architecture checkpoint and interview practice | Q1. Can we omit the Boot parent?; Q2. Why does a new dependency change startup behavior?; Q3. What is the difference between package and verify?; Exercise: reason about three changes. **Keywords:** repackage, BOM, dependency:tree, starter |

### Lesson 8 — Auto-configuration (pp. 10–17)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 10 | What @SpringBootApplication actually means | 1. @SpringBootConfiguration; 2. @ComponentScan; 3. @EnableAutoConfiguration |
| 11 | Component scanning boundaries and package layout | Component scan is not entity or repository scan. **Keywords:** `@EntityScan`, `@EnableJpaRepositories`, `@SpringBootApplication` |
| 12 | How Boot discovers auto-configuration classes | A useful internal mental model; Why order matters. **Keywords:** `AutoConfigurationImportSelector`, `@EnableAutoConfiguration`, `AutoConfiguration.imports` |
| 13 | Conditional annotations: selective defaults | Four important conditions; Is this runtime switching?. **Keywords:** `@ConditionalOnClass`, `@ConditionalOnBean`, `@ConditionalOnProperty`, `@AutoConfiguration`, `@ConditionalOnMissingBean`, refresh |
| 14 | Back-off behavior and replacing defaults | Back-off is not bean overriding; Choose the smallest customization. **Keywords:** `@ConditionalOnMissingBean`, exclude |
| 15 | Trace a database configuration decision | What if the URL is missing?; What if a custom DataSource is provided?. **Keywords:** `HikariCP`, starter |
| 16 | Excluding and investigating auto-configuration | Read the conditions report; A repeatable debugging method. **Keywords:** --debug, `DataSource`, exclude, `@SpringBootApplication`, starter |
| 17 | Custom auto-configuration and interview checkpoint | A tiny library experiment (optional); Q. Does Boot create every possible bean at startup?; Q. Scan vs import?. **Keywords:** `AutoConfiguration.imports`, `@AutoConfiguration`, `@ConditionalOnMissingBean`, back-off, exclude, refresh |

### Lesson 9 — Startup and embedded Tomcat (pp. 18–24)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 18 | What happens when main calls run()? | The complete mental model. **Keywords:** `SpringApplication.run`, refresh, Tomcat, Environment |
| 19 | Choosing the application context | SERVLET; REACTIVE. **Keywords:** `WebApplicationType`, NONE, Tomcat, starter |
| 20 | The Environment is prepared before refresh | Initializers vs regular beans. **Keywords:** `ApplicationContextInitializer`, property sources, `@Value` |
| 21 | Refresh: from configuration to running beans | What happens inside refresh?; Why does dependency order matter? |
| 22 | Where does Tomcat come from? | Can we replace Tomcat?. **Keywords:** refresh, starter |
| 23 | Request threads and singleton services | Operational implication. **Keywords:** `DispatcherServlet` |
| 24 | Started, ready, runners and graceful shutdown | What should happen at shutdown?; Q. PostConstruct vs runner?. **Keywords:** `ApplicationStartedEvent`, `ApplicationReadyEvent`, `ApplicationRunner`, `CommandLineRunner`, refresh |

### Lesson 10 — External configuration (pp. 25–32)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 25 | Why externalized configuration matters | Properties vs YAML; Where do the values go?. **Keywords:** precedence, `@Value`, Environment |
| 26 | Property sources and precedence | The distinction between JVM and application arguments. **Keywords:** Environment |
| 27 | Locations, imports and environment variables | Relaxed binding; Imported config vs profile config. **Keywords:** spring.config.import, spring.config.location, precedence |
| 28 | Profiles: choosing environment-specific behavior | Do not confuse profile and property; Multi-document YAML. **Keywords:** spring.profiles.active |
| 29 | Profile-controlled bean registration | When is @Profile("!prod") appropriate?. **Keywords:** Environment |
| 30 | Reading individual properties with @Value | Placeholder vs expression; When @Value becomes awkward. **Keywords:** `SpEL`, property sources, `@ConfigurationProperties` |
| 31 | @ConfigurationProperties and typed configuration | Why is this easier to test?. **Keywords:** `@EnableConfigurationProperties`, relaxed binding, `@ConfigurationPropertiesScan`, `@SpringBootApplication`, Environment |
| 32 | Fail-fast configuration and secrets | Keep secrets outside source control; Interview debugging scenario. **Keywords:** `@Validated`, `@Value`, `@ConfigurationProperties`, Environment, starter |

### Hands-on lab (pp. 33–36)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 33 | Build a small configuration-driven Boot service | Complete pom.xml. **Keywords:** spring-boot-starter-parent, spring-boot-maven-plugin, `GatewayPropertiesTest`, starter |
| 34 | Create the entry point and configuration type | MortgageApplication.java; GatewayProperties.java. **Keywords:** `@Validated`, `@ConfigurationPropertiesScan`, `SpringApplication.run`, `@ConfigurationProperties`, `@SpringBootApplication`, starter |
| 35 | Create the service, endpoint and property files | GatewayService.java; StatusController.java; src/main/resources/application.properties; src/main/resources/application-dev.properties |
| 36 | Run experiments and verify configuration binding | GatewayPropertiesTest.java. **Keywords:** --debug, NONE, spring.profiles.active, `@ConfigurationPropertiesScan` |

### Interview revision (p. 37)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 37 | Explain the whole system without memorizing code | Two-minute interview explanation; Scenario drill: what would you investigate first?; Mastery checklist; Official reference reading (Boot 3.5). **Keywords:** `DispatcherServlet`, BOM, dependency:tree, back-off, `DataSource`, precedence, refresh, Tomcat, Environment, starter |

[Back to module overview](#module-overview)

---

## Module 03 — Spring MVC and REST APIs

**[Download / open PDF](./Spring_Boot_Module_3_Expanded.pdf)** · **55 pages** · Priority: Very high

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 11 — MVC architecture | 3–8 |
| Lesson 12 — HTTP request and response lifecycle | 9–14 |
| Lesson 13 — Controllers, binding and JSON | 15–21 |
| Lesson 14 — DTOs and validation | 22–28 |
| Lesson 15 — Exception handling | 29–34 |
| Lesson 16 — REST API design | 35–41 |
| Hands-on lab | 42–52 |
| Interview revision and references | 53–55 |

### Lesson 11 — MVC architecture (pp. 3–8)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why do we need a web framework? | What is a web server? What is a servlet container?; Framework vs server vs application. **Keywords:** Tomcat |
| 4 | Servlets and the front controller | How does this relate to @RestController?. **Keywords:** Tomcat, `@GetMapping`, `DispatcherServlet` |
| 5 | MVC vs a REST API | **Keywords:** `ViewResolver`, `HttpMessageConverter`, `@ResponseBody`, `@Controller`, `@GetMapping`, `@RestController`, record |
| 6 | HandlerMapping: find the right method | Ambiguity and specificity. **Keywords:** `RequestMappingHandlerMapping`, `HandlerExecutionChain`, `@RequestMapping`, `@PathVariable`, `@GetMapping`, `@RestController`, `@PostMapping`, `@RequestBody` |
| 7 | HandlerAdapter: invoke the handler | Interview: Mapping vs adapter vs converter. **Keywords:** `RequestMappingHandlerAdapter`, `@RequestHeader`, `@PathVariable`, Jackson, `DispatcherServlet`, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity`, record |
| 8 | How Boot assembles MVC infrastructure | Check your understanding. **Keywords:** Front Controller, Tomcat, `DispatcherServlet`, `@RestController`, Servlet |

### Lesson 12 — HTTP request and response lifecycle (pp. 9–14)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 9 | Read a real HTTP request | Three independent pieces of information. **Keywords:** Content-Type, Accept, Jackson, DTO |
| 10 | Trace the successful request | Which part runs before the controller?. **Keywords:** `preHandle`, `postHandle`, `afterCompletion`, `HandlerMapping`, `HandlerAdapter`, Tomcat, `DispatcherServlet`, `@RequestBody`, `@Valid`, Servlet |
| 11 | What happens inside argument binding? | Predict which stage fails. **Keywords:** `@RequestHeader`, deserialization, `@RequestParam`, `@PathVariable`, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity` |
| 12 | From Java result to HTTP response | What does committed mean?; Common misconception. **Keywords:** `MappingJackson2HttpMessageConverter`, `ObjectMapper`, serialization, Content-Type, Jackson, DTO, `ResponseEntity`, Servlet |
| 13 | Failure paths and short-circuiting | Before MVC or before handler selection; Inside argument resolution; Inside application logic or response writing. **Keywords:** `HandlerExceptionResolver` |
| 14 | Request threads and singleton controllers | Blocking and asynchronous requests. **Keywords:** Tomcat, `@RestController`, `@PostMapping`, `@RequestBody`, Servlet |

### Lesson 13 — Controllers, binding and JSON (pp. 15–21)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 15 | Request mappings and controller contracts | Common mapping mistakes. **Keywords:** `@RequestMapping`, `@PathVariable`, `@GetMapping`, `@RestController`, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity` |
| 16 | Path variables and query parameters | Collections and conversion. **Keywords:** pagination, `@RequestParam`, `@PathVariable`, `@GetMapping` |
| 17 | Headers, cookies and form binding | @ModelAttribute vs @RequestBody. **Keywords:** `@CookieValue`, `@RequestHeader`, `@RequestParam`, `@PathVariable`, `@GetMapping`, record, Servlet |
| 18 | Jackson: deserialization from JSON to Java | Unknown fields and coercion. **Keywords:** `ObjectMapper`, `@PostMapping`, `@RequestBody`, record |
| 19 | Serialization and controlling the contract | Common production surprise. **Keywords:** `@JsonProperty`, `@JsonIgnore`, `ObjectMapper`, deserialization, Jackson, DTO, record |
| 20 | Content negotiation and message converters | Understand 400 vs 415 vs 406. **Keywords:** Content-Type, Accept, Jackson, `@PostMapping`, `@RequestBody`, `@Valid` |
| 21 | ResponseEntity, headers and status codes | Returning Optional is not automatic not-found handling. **Keywords:** `@DeleteMapping`, `@Controller`, serialization, `@PathVariable`, `@GetMapping`, `@RestController`, `@PostMapping`, `@RequestBody`, DTO, `@Valid` |

### Lesson 14 — DTOs and validation (pp. 22–28)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 22 | Why request and response DTOs matter | Why not one DTO for every operation?. **Keywords:** record |
| 23 | Mapping: from boundary to domain and back | Manual mapping or MapStruct?. **Keywords:** DTO, record |
| 24 | Three kinds of input checks | Stage 1: Parsing and type conversion; Stage 2: Declarative constraints; Stage 3: Business validation. **Keywords:** DTO, `@Valid` |
| 25 | Jakarta Bean Validation constraints | Predict the result. **Keywords:** `@Positive`, `@Email`, `@NotBlank`, `@Size`, `@NotNull`, Accept, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity`, record |
| 26 | Nested objects, lists and cascading | Validation groups and @Validated. **Keywords:** `@Pattern`, `@NotBlank`, `@Size`, `@NotNull`, DTO, record |
| 27 | Method validation and binding errors | Handling validation locally. **Keywords:** `BindingResult`, `HandlerMethodValidationException`, `@Validated`, `MethodArgumentNotValidException`, `@RequestParam`, `@GetMapping`, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity` |
| 28 | Custom constraints and business rules | When the rule depends on changing state. **Keywords:** `ConstraintValidator`, `@NotNull` |

### Lesson 15 — Exception handling (pp. 29–34)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 29 | Why centralized exception handling matters | What should a service know about HTTP?. **Keywords:** `ResponseEntity`, Servlet |
| 30 | HandlerExceptionResolver: the internal path | Three important resolver roles; Local versus global handlers. **Keywords:** `ExceptionHandlerExceptionResolver`, `ResponseStatusExceptionResolver`, `DefaultHandlerExceptionResolver`, `@ControllerAdvice`, `@ExceptionHandler`, `@RestControllerAdvice`, `DispatcherServlet`, `ResponseEntity`, Servlet |
| 31 | Design a structured error contract | **Keywords:** RFC 9457, `@ExceptionHandler`, `ProblemDetail`, `ResponseEntity` |
| 32 | Convert validation errors into useful responses | Test with more than one invalid field. **Keywords:** `BindingResult`, `HandlerMethodValidationException`, `ResponseEntityExceptionHandler`, `MethodArgumentNotValidException`, `@ExceptionHandler`, `@RestControllerAdvice`, `ProblemDetail`, DTO, `ResponseEntity` |
| 33 | Failure boundaries: filters, security and downstream calls | Downstream integration examples; What if the response is already committed?. **Keywords:** `@RestControllerAdvice`, `DispatcherServlet`, record, Servlet |
| 34 | Debugging and logging without leaking data | Scenario: 500 after the database write; Lesson checkpoint. **Keywords:** serialization, `@ExceptionHandler`, `ProblemDetail`, record |

### Lesson 16 — REST API design (pp. 35–41)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 35 | What makes an API RESTful? | Start with a resource, not a Java method; Statelessness is not "no database". **Keywords:** `@RestController` |
| 36 | Safe methods, idempotency and retries | GET, POST, PUT, PATCH and DELETE; Scenario: client times out after submission |
| 37 | Designing idempotent POST requests | Production design decisions. **Keywords:** Idempotency-Key, idempotency, `@PostMapping`, record |
| 38 | A practical status-code reference | Successful outcomes (2xx); Client-side failures (4xx); Server and gateway failures (5xx); Interview practice. **Keywords:** If-Match, idempotency |
| 39 | Pagination, versioning and conditional requests | API evolution and versioning; Conditional updates and caching. **Keywords:** ETag, If-Match |
| 40 | Servlet filters and request tracing | Why not read the request body in a logging filter?. **Keywords:** `OncePerRequestFilter`, MDC, deserialization, `DispatcherServlet` |
| 41 | HandlerInterceptor vs Filter vs AOP | **Keywords:** `preHandle`, `postHandle`, `afterCompletion`, record, Servlet |

### Hands-on lab (pp. 42–52)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 42 | Build a complete mortgage REST API | API contract. **Keywords:** pagination, `ProblemDetail`, DTO, Servlet |
| 43 | Maven dependencies and build setup | **Keywords:** Jackson |
| 44 | Application entry point and local configuration | What should happen when you start it?; Troubleshooting setup. **Keywords:** Servlet |
| 45 | DTOs and internal domain model | Why use these types?. **Keywords:** `@NotBlank`, `@Size`, `@NotNull`, record |
| 46 | Implement the business service | **Keywords:** `ConcurrentHashMap` |
| 47 | Implement the HTTP endpoints | **Keywords:** `@DeleteMapping`, `@RequestMapping`, `@Validated`, `@RequestParam`, `@PathVariable`, `@GetMapping`, `@RestController`, `@PostMapping`, `@RequestBody`, `@Valid`, `ResponseEntity` |
| 48 | Implement predictable ProblemDetail errors | **Keywords:** `HttpMessageNotReadableException`, `ResponseEntityExceptionHandler`, `MethodArgumentNotValidException`, `@ExceptionHandler`, `@RestControllerAdvice`, `ResponseEntity`, Servlet |
| 49 | Trace requests and run the application | **Keywords:** `OncePerRequestFilter`, MDC, Servlet |
| 50 | Exercise the API as a client | Failure experiments (edit request.json for each case). **Keywords:** Content-Type, Accept |
| 51 | Integration tests with MockMvc: setup and success | **Keywords:** Servlet |
| 52 | Integration tests: invalid inputs and errors | **Keywords:** Accept, DTO |

### Interview revision and references (pp. 53–55)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 53 | Scenario-based questions and answers | 1. Trace an HTTP request from client to service.; 2. Why did @Valid not work?; 3. Why is an invalid UUID 400 rather than 404?; 4. A client repeats POST after timing out. What should you do?; 5. Is @RestController thread-safe?; 6. Should you catch every exception in the controller?. **Keywords:** `HandlerMapping`, `HandlerAdapter`, idempotency, Tomcat, `DispatcherServlet` |
| 54 | Notebook cheat sheet and mastery check | Must know without notes; Required practical mastery; Good to know / optional; Connect to your mortgage integration practice. **Keywords:** `HttpMessageConverter`, `@ResponseBody`, content negotiation, `MockMvc`, Front Controller, `@Controller`, `HandlerMapping`, `HandlerAdapter`, pagination, Content-Type, `@RestControllerAdvice`, idempotency |
| 55 | Official references and baseline | Spring MVC and Boot; HTTP protocol and error format. **Keywords:** RFC 9457, Jackson, `DispatcherServlet`, `ResponseEntity`, Servlet |

[Back to module overview](#module-overview)

---

## Module 04 — Spring Data JPA and Hibernate

**[Download / open PDF](./Spring_Boot_Module_4_Expanded.pdf)** · **61 pages** · Priority: Very high

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 17 — JDBC, ORM, JPA and Hibernate | 3–7 |
| Lesson 18 — Entity mapping and lifecycle | 8–13 |
| Lesson 19 — Persistence context and dirty checking | 14–19 |
| Lesson 20 — Entity relationships and cascades | 20–25 |
| Lesson 21 — Fetching and N+1 | 26–31 |
| Lesson 22 — Repositories, queries and pagination | 32–37 |
| Lesson 23 — Caching, locking and performance | 38–44 |
| Hands-on lab | 45–58 |
| Interview revision and references | 59–61 |

### Lesson 17 — JDBC, ORM, JPA and Hibernate (pp. 3–7)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | From JDBC to an object model | Why persistence is a separate concern; Start with plain JDBC; Interview answer: JDBC is the low-level Java database access API. ORM is a higher-level; mapping and state-management mechanism, usually built on JDBC in a traditional Spring JPA; application. Neither replaces the database itself.. **Keywords:** `JdbcTemplate`, `DataSource`, IDENTITY, Hibernate |
| 4 | The five layers: JDBC, ORM, JPA, Hibernate, Spring Data | Separate the responsibilities; One operation, several levels; When is JDBC preferable?; Must know: Be able to draw this stack and explain which layer owns the SQL, the connection,; the object mapping and the repository interface.. **Keywords:** repository proxy, batch fetching, `EntityManager`, managed |
| 5 | What Spring Boot creates at startup | From dependency to persistence infrastructure; Startup debugging. **Keywords:** `JpaTransactionManager`, `EntityManagerFactory`, `PostgreSQL`, `DataSource`, ORM, `EntityManager`, JDBC, persistence context, JPA, Hibernate |
| 6 | The repository proxy and transaction boundary | What happens when findById runs?; Interview drill. **Keywords:** `SimpleJpaRepository`, ORM, `EntityManager`, JDBC, persistence context, JPA, Hibernate |
| 7 | Lesson 17 review: select the right abstraction | Compare the tools with a concrete requirement; Common misconceptions; Practice: explain this from memory; Q: What happens if you replace Hibernate with another JPA provider?; Q: Is EntityManagerFactory thread-safe?; Q: Why use @Repository?; Notebook notes; Mastery check: Draw the stack without reading, explain the difference between Spring; ApplicationContext and persistence context, and trace a repository method from interface to. **Keywords:** `DataSource`, ORM, JDBC, dirty checking, projection, IDENTITY, managed |

### Lesson 18 — Entity mapping and lifecycle (pp. 8–13)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 8 | Your first entity: map a row to an object | Entity annotations and identity. **Keywords:** `@Table`, `@Enumerated`, `@Entity`, `@Column`, `@Id`, `@GeneratedValue`, JPA, Hibernate |
| 9 | SQL schema and application invariants | The database is the final consistency boundary; Why uniqueness needs a database constraint; DDL choices; Interview question: What is the difference between @NotNull and nullable=false? One is a; validation rule; the other is persistence mapping/schema metadata. Neither should substitute; for the real database constraint where data integrity matters.. **Keywords:** `@Column`, IDENTITY, Hibernate |
| 10 | Primary key generation strategies | Where does a new ID come from?; IDENTITY; SEQUENCE; UUID, AUTO and TABLE; Decision and interview depth. **Keywords:** `@Id`, `@GeneratedValue`, index, `PostgreSQL`, persist, Hibernate |
| 11 | The four entity states | A state is about management, not whether a row exists; Why this matters; untracked. Removed = pending delete. Learn transitions, not just definitions.. **Keywords:** transient, `Open EntityManager in View`, detached, merge, detach, `EntityManager`, persist, persistence context, flush, IDENTITY, managed, JPA |
| 12 | Entity equality, value objects and mapping traps | Java identity is not database identity; Embeddable versus entity; Practical mapping choices; Interview drill: Why should entities not be annotated with @Component? The Spring bean; lifetime is unrelated to a persistent row's identity and transaction-specific state.. **Keywords:** `@Embeddable`, `@Embedded`, `@Transient`, transient, `hashCode`, equals, managed, JPA |
| 13 | Lifecycle callbacks and lesson revision | Callbacks are not Spring bean lifecycle methods; Predict the behavior; Interview answers; Q: Why a protected no-arg constructor?; Q: Can a record be a portable JPA entity?; Mastery check: Write a basic entity without IDE assistance. Explain ID generation, nullability,; enum mapping, four states and why entity equality deserves care.. **Keywords:** `@PrePersist`, `@PreUpdate`, `@Enumerated`, `hashCode`, detach, persist, commit, flush |

### Lesson 19 — Persistence context and dirty checking (pp. 14–19)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 14 | Persistence context: the unit of work | Understand the identity map before learning dirty checking; Spring's transaction-scoped model; Must know: first-level cache, persistence context and managed entity identity are related; concepts. A first-level cache hit does not mean a database transaction never occurs.. **Keywords:** refresh, `EntityManager`, JDBC, JPQL, Hibernate |
| 15 | Inside dirty checking | How does Hibernate know that a setter changed something?; Cost and implications. **Keywords:** bytecode enhancement, snapshot, detached, projection, persistence context, flush, managed |
| 16 | Flush versus commit: two different events | SQL execution does not mean durable success; Why force a flush?; Automatic flush timing; Interview answer: flush sends pending SQL; commit makes the transaction successful. Flushed; is not committed. A rollback after flush can still undo the change.. **Keywords:** HQL, native SQL, dirty checking, JPQL, persistence context, IDENTITY, managed, JPA, Hibernate |
| 17 | Persist, merge, save and saveAndFlush | Predict which object is managed; Spring Data save decision; Pitfall: Never map an untrusted partial PATCH payload directly to a detached entity and merge; it. Missing fields can overwrite valid state. Load the existing entity and apply only allowed; changes.. **Keywords:** `@Version`, dirty checking, commit, persistence context |
| 18 | Find, getReference, detach, clear and refresh | Read APIs have different intentions; Manage context state intentionally; Bulk update trap; Mastery question: Why can findById after a bulk update return old field values? Because the; managed entity already exists in the identity map. Clearing or refreshing makes it possible to; observe updated state, subject to transaction isolation.. **Keywords:** `@Modifying`, merge, dirty checking, JPQL, persistence context, flush |
| 19 | Persistence context experiments and revision | Run small experiments, predict before executing; Experiment A: identity and query execution; Experiment B: clear without flush; Interview revision; Q: Is calling save mandatory after editing a managed entity?; Q: Can a read-only transaction be used for updates?; Q: Why shouldn't a managed entity escape to a background thread?; Notebook: identity map + tracked state + pending operations; flush detects and synchronizes;; commit decides transaction success; merge returns managed copy; clear detaches all.. **Keywords:** dirty checking, JPQL, Hibernate |

### Lesson 20 — Entity relationships and cascades (pp. 20–25)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 20 | Relationships: model the database first | One mortgage, many documents; Uni-directional versus bi-directional; Interview rule: Owning side means the side controlling the relationship's database mapping,; not which object is the business owner.. **Keywords:** `@Entity`, `@ManyToOne`, `@Id`, `@GeneratedValue`, `@JoinColumn`, JPA |
| 21 | mappedBy and the owning side | Keep both sides synchronized; What goes wrong without helpers?; Practice: Draw the actual tables, identify which table holds the FK, then write the owning; annotation and inverse mappedBy value. This is more reliable than memorizing annotation; patterns.. **Keywords:** `@OneToMany`, `CascadeType`, `orphanRemoval`, `@JoinColumn`, persist, JPA, Hibernate |
| 22 | Cascade operations are not database cascades | Propagation of an entity operation; When cascade ALL is dangerous; Database cascade. **Keywords:** `@ManyToOne`, detached, merge, detach, refresh, persist, flush, IDENTITY, managed, JPA, Hibernate |
| 23 | Orphan removal: deleting a child from a collection | Removing a relationship can mean deleting a row; Cascade REMOVE versus orphanRemoval; Collections and update operations; Interview answer: Cascades propagate lifecycle operations. Orphan removal deletes privately; owned children disconnected from their parent. Neither is equivalent to an SQL FK cascade.. **Keywords:** `hashCode`, removed, equals, flush, managed, JPA, Hibernate |
| 24 | One-to-one and many-to-many relationships | Translate cardinality into constraints; Many-to-many: introduce a join table; Do not use CascadeType.REMOVE on shared many-to-many targets: deleting a link should not; delete a reviewer who serves other mortgages.. **Keywords:** `@OneToOne`, `@ManyToMany`, `@JoinColumn`, `mappedBy`, IDENTITY, Hibernate |
| 25 | Relationship design and interview exercises | Design a small domain on paper; Relationship reference table; Scenario questions; Q: Which side controls updates in a bidirectional association?; Q: Why not return both entities directly from a controller?; Q: Why can deleting a mortgage fail when a document exists?; Q: Is List always worse than Set in Hibernate?; Mastery check: Map the four cardinalities, explain mappedBy, implement add/remove helpers,; choose cascades by ownership, and predict SQL for orphan removal. Then move to fetching,; where relationship mapping meets query performance. |

### Lesson 21 — Fetching and N+1 (pp. 26–31)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 26 | Lazy and eager fetching: when does related data load? | Mapping does not dictate one SQL statement; What should be the default design?; Interview answer: Lazy delays retrieval; eager requires retrieval. Actual SQL shape depends on; the provider and query plan. Eager does not mean one SQL join and lazy does not guarantee; zero queries.. **Keywords:** bytecode enhancement, `@OneToMany`, `@ManyToOne`, `@JoinColumn`, `mappedBy`, fetch join, N+1, projection, managed, JPA, Hibernate |
| 27 | LazyInitializationException and Open EntityManager in View | The persistence context must be available to initialize lazy state; The tempting workaround; Better fix: load and map inside a service; Debugging sequence: identify the lazy property, locate where the entity leaves its context,; verify the fetch plan and map to a DTO while the context is still open. Do not catch and ignore; LazyInitializationException.. **Keywords:** snapshot, detached, N+1, JPA, Hibernate |
| 28 | The N+1 query problem: count every round trip | One query for parents, then one per parent; Detect it instead of guessing; Interview exercise: Why does changing LAZY to EAGER fail to guarantee a solution? Because; eager loading can use secondary selects and fetch data even for endpoints that do not need it.. **Keywords:** JPQL, projection, Hibernate |
| 29 | Fetch joins and entity graphs | Fetch associations on purpose; Entity graphs: separate fetch plan from query text; When not to fetch everything; Decision: for a single mortgage detail, fetch join/graph is often a good starting point. For a; paginated list, avoid collection fetch joins with offset/limit; use the two-step pattern on the; next page or a summary projection.. **Keywords:** `@EntityGraph`, `@Query`, N+1, JPQL, managed, Hibernate |
| 30 | Batch fetching and safe collection pagination | Choose a fetch strategy for the endpoint shape; Why collection fetch join pagination is problematic; A safe two-step solution; Interview scenario: a query has only two SQL statements but consumes huge memory. Explain; row multiplication, joined collection pagination and why minimizing statement count alone is; not sufficient.. **Keywords:** N+1, projection, persistence context, JPA, Hibernate |
| 31 | Fetch planning practice: choose by requirement | Compare solutions using the same mortgage data; Interview answers to memorize only after understanding; Q: What causes LazyInitializationException?; Q: What is N+1?; Q: Why are DTO projections useful?; Q: Does @EntityGraph eliminate all N+1?; Mastery check: Trace the SQL for three parent rows, demonstrate lazy failure outside a; context, fix it, and explain why joining collections and paging must be handled carefully.. **Keywords:** batch fetching, fetch join, JPQL, managed, Hibernate |

### Lesson 22 — Repositories, queries and pagination (pp. 32–37)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 32 | Repository interfaces and derived queries | Spring Data JPA writes the implementation, not your business rules; Translate method names to the query in your head; Return type matters; Practice: Write queries for status IN, amount BETWEEN, reference starting with a prefix and; exists by reference. Confirm each predicate and generated SQL.. **Keywords:** repository proxy, equals, `saveAndFlush`, Slice, `@Query`, Page, flush |
| 33 | JPQL, HQL and native SQL | Query the entity model or query the database schema; Parameter binding and injection; Interview answer: JPQL uses entity names and fields; SQL uses tables and columns. Both; ultimately execute database operations. Spring Data can support both without requiring; separate DAO implementations.. **Keywords:** `@Query`, Hibernate |
| 34 | Projections and read models | Return only what the use case requires; Constructor projection: explicit DTO shape; Dynamic queries at the right depth; Engineering rule: separate read DTOs from write aggregates where that makes access patterns; clearer. Avoid loading a whole object graph just to discard most of it.. **Keywords:** `getReference`, Pageable, `@Query`, Page, JPQL, managed, JPA |
| 35 | Page, Slice, Sort and database-level pagination | Do not load all rows and then slice a Java list; What makes a count expensive?; Resume-level interview answer: I implement pagination at query level with Pageable and; deterministic sorting, avoid retrieving the full table, evaluate the count cost and verify the; generated SQL. Say this as a practice skill unless you have actually done it in production.. **Keywords:** index, Hibernate |
| 36 | Keyset pagination and indexing | Large offsets may get expensive; Interview scenario; Depth boundary: be able to write the keyset predicate and compare it with offset pagination.; Full index internals belong in DBMS preparation.. **Keywords:** Slice, EXPLAIN |
| 37 | Modifying queries, transactions and stale state | Bulk operations do not behave like entity mutations; Derived delete versus bulk delete; Revision questions; Q: Can @Modifying replace @Transactional?; Q: When do I use Page versus Slice?; Q: How do I avoid concatenating SQL filters?; Mastery check: implement a derived query, a JPQL query, native scalar query, DTO projection,; pageable query and bulk update. Explain which return managed entities and how bulk; operations affect them.. **Keywords:** `@Query`, dirty checking |

### Lesson 23 — Caching, locking and performance (pp. 38–44)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 38 | First-level cache versus second-level cache | Do not confuse the caches with database isolation; Separate the query cache; Which data is a sensible candidate?; Interview answer: L1 belongs to an EntityManager; L2 can span contexts within a configured; factory/cache topology. Neither is the same as the database buffer cache or a transaction; isolation guarantee.. **Keywords:** identity map, refresh, JPQL, persistence context, IDENTITY, managed, Hibernate |
| 39 | Application caching versus Hibernate caching | Three different ways to avoid repeated database work; Compare ownership and scope; A debugging scenario; Depth boundary: know the layers and trade-offs. Detailed distributed cache architecture and; Redis eviction policies are reserved for later modules.. **Keywords:** query cache, snapshot, refresh, dirty checking, commit, persistence context, IDENTITY, managed |
| 40 | Lost updates and optimistic locking | Two threads, two transactions, one database row; Retry policy; Must know: optimistic locking detects conflicting writes without holding a long exclusive lock; during the initial read. It is appropriate when conflicts are relatively infrequent.. **Keywords:** `@Version`, commit, flush, managed, Hibernate |
| 41 | Pessimistic locking and atomic updates | Prevent a conflicting writer during a critical section; Compare the approaches; Atomic conditional update; Interview scenario: Two loan processors take the same job. A version check, conditional; update or row lock can coordinate across instances. A Java synchronized method alone cannot.; Choose based on contention and business semantics.. **Keywords:** `@Lock`, `PESSIMISTIC_WRITE`, `@Query`, JPQL, managed, Hibernate |
| 42 | Isolation, locks and what the persistence context hides | Consistency problems are not all the same; Why two find calls are not an isolation test; Other concurrency anomalies; Interview drill; Q: Does @Version prevent dirty reads?; Q: Can optimistic locking fail only at commit?; Q: Is pessimistic locking immune to deadlock?; Notebook: version checks protect row updates; database locks coordinate conflicting; operations; isolation governs concurrent visibility; business invariants may span rows.. **Keywords:** first-level cache, snapshot, refresh, managed, Hibernate |
| 43 | Performance: JDBC batching and bounded persistence contexts | Avoid one round trip and one retained object per row; Diagnose before tuning; Interview difference: JDBC write batching optimizes sending DML; fetch batching optimizes; loading associations; pagination bounds result size; flush/clear bounds context memory. They; solve related but distinct problems.. **Keywords:** batch fetching, SEQUENCE, dirty checking, commit, IDENTITY, managed, JPA, Hibernate |
| 44 | A systematic database performance investigation | Scenario: the mortgage list endpoint is slow; Hibernate diagnostic properties (local only); Interview consolidation; Q: How would you optimize a slow JPA API?; Q: Is caching always the first solution?; Lesson mastery: explain L1/L2, optimistic and pessimistic locks, conditional updates, write; batching and a repeatable performance-debugging approach.. **Keywords:** index, N+1, JDBC, projection |

### Hands-on lab (pp. 45–58)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 45 | Hands-on lab: design and acceptance criteria | Convert Module 3's in-memory API to persistent storage; API contract; Engineering decisions. **Keywords:** H2, `PostgreSQL`, `DataSource`, fetch join, SEQUENCE, JPA, Hibernate |
| 46 | Project setup and dependencies | Start with an ordinary Maven project. **Keywords:** snapshot, H2, `PostgreSQL`, JPA |
| 47 | Bootstrap, configuration and status | Create the application and local settings; Local lab only: SQL logging shows generated statements. Leave parameter/bind logging off.; The database contains synthetic references and document labels, never real personal data.. **Keywords:** `EntityManagerFactory`, H2, `PostgreSQL`, `DataSource`, JDBC, JPA, Hibernate |
| 48 | Mortgage entity: the aggregate root | Mortgage.java (part 1 of 2). **Keywords:** `@Table`, `@Enumerated`, `@OneToMany`, `CascadeType`, `orphanRemoval`, `@Entity`, `@Column`, `@Id`, `@GeneratedValue`, `@Version`, `mappedBy`, SEQUENCE |
| 49 | Mortgage entity: behavior and child mapping | Mortgage.java (part 2 of 2); MortgageDocument.java. **Keywords:** `@Table`, `@Entity`, `@Column`, `getReference`, `@ManyToOne`, `@Id`, `@GeneratedValue`, `@JoinColumn`, detach, IDENTITY |
| 50 | DTOs and validation: keep HTTP separate from entities | CreateMortgage.java and ApproveMortgage.java; MortgageRow.java and MortgageDetail.java. **Keywords:** `getReference`, projection |
| 51 | Repository and transaction service | MortgageRepository.java; MortgageService.java (part 1 of 2). **Keywords:** Pageable, `saveAndFlush`, `@Query`, Page, JPA |
| 52 | Service completion and application exceptions | MortgageService.java (part 2 of 2); Conflict.java and NotFound.java. **Keywords:** Sort, equals, Page, commit, flush, managed |
| 53 | REST controller and bounded page response | MortgageController.java |
| 54 | Error handling and constraint conflicts | ApiErrors.java; Verify the boundaries. **Keywords:** flush |
| 55 | Run and observe the SQL | Execute the lab locally; Read the SQL rather than memorize it; Practice: remove the fetch join and fetch multiple mortgages, then access each document list in; a transaction. Count the SELECTs, restore the fetch plan, and explain the difference.. **Keywords:** SEQUENCE, projection, Hibernate |
| 56 | PostgreSQL profile: real database setup | Keep the schema under explicit control. **Keywords:** index, H2, `DataSource`, SEQUENCE, JDBC, IDENTITY, JPA, Hibernate |
| 57 | Repository tests: prove persistence instead of trusting memory | MortgageRepositoryTest.java. **Keywords:** `@DataJpaTest`, `saveAndFlush`, ORM, `EntityManager`, commit, flush, managed, JPA |
| 58 | Concurrency integration test: two independent transactions | OptimisticLockingTest.java. **Keywords:** `TransactionTemplate`, `saveAndFlush`, flush |

### Interview revision and references (pp. 59–61)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 59 | Interview consolidation: answer in layers | Questions that expose shallow memorization; Q1. What happens internally when I call repository.save?; Q3. Why might a SELECT happen before an UPDATE?; Q4. Why not use EAGER everywhere?; Q5. How do you fix duplicate application creation?; Q6. Why did an update appear in logs but not in the database?; Q7. How do you protect concurrent updates?; Q8. How would you prove an optimization?. **Keywords:** optimistic locking, pessimistic locking, identity map, detached, merge, persist, dirty checking, commit, EXPLAIN, persistence context, flush, IDENTITY |
| 60 | Notebook notes and mastery checklist | One-page mental model; Before moving to Module 5, verify you can:; SDE-1 stopping point: understand these mechanisms and troubleshoot them. Do not memorize; Hibernate's complete event-listener hierarchy, cache-provider internals, custom type; implementation or every Criteria API method unless a role specifically requires it.. **Keywords:** keyset, JDBC batching, removed, native SQL, Slice, `@Version`, H2, identity map, `mappedBy`, detached, merge, detach |
| 61 | Further reading and next module | Official references and a practical revision path; References for targeted verification; Study sequence; Next: Module 5 - AOP and transaction management. It will explain the proxy interception,; transaction propagation, rollback rules, isolation and self-invocation behind the service; boundaries used throughout this book.. **Keywords:** `DataSource`, ORM, JPA, Hibernate |

[Back to module overview](#module-overview)

---

## Module 05 — Spring AOP and Transaction Management

**[Download / open PDF](./Spring_Boot_Module_5_Expanded.pdf)** · **40 pages** · Priority: Very high

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 24 — AOP and proxies | 3–10 |
| Lesson 25 — Transaction management internals | 11–21 |
| Lesson 26 — Propagation, isolation and failure scenarios | 22–32 |
| Hands-on lab | 33–38 |
| Interview revision and references | 39–40 |

### Lesson 24 — AOP and proxies (pp. 3–10)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why AOP exists | A problem you already know; What changes with AOP?; Depth for SDE-1. **Keywords:** cross-cutting, execution, self-invocation, aspect, advice |
| 4 | The vocabulary, with one example | Join point, pointcut and advice; A small mental model; Spring AOP versus AspectJ; Notebook notes. **Keywords:** cross-cutting, `@Aspect`, SUPPORTS, execution |
| 5 | Five advice types and when to use them | Choose the smallest advice that solves the problem; Why around advice is powerful (and risky); Quick exercise. **Keywords:** `@Before`, `@AfterReturning`, `@AfterThrowing`, `@After`, pointcut, `@Around`, `ProceedingJoinPoint`, `@Aspect`, execution, aspect |
| 6 | Pointcuts and a custom timing annotation | How pointcuts select operations; What does this measure?. **Keywords:** `@annotation`, `@Around`, `ProceedingJoinPoint`, `@Aspect`, execution, flush, aspect, advice |
| 7 | What a proxy actually does | A plain Java model of interception; How Spring builds a proxy. **Keywords:** aspect, advice |
| 8 | JDK dynamic proxies versus CGLIB | Two ways to expose the proxy; Visibility and version nuance. **Keywords:** JDK dynamic proxy, SUPPORTS, MANDATORY, aspect, advice |
| 9 | Self-invocation and the proxy boundary | The common production bug; The clean fix: separate responsibilities; Other reasons interception may be absent. **Keywords:** `TransactionTemplate`, `REQUIRES_NEW`, aspect, advice, `@Transactional` |
| 10 | Advice order, interview practice and revision | Ordering changes semantics; Interview questions and answers; Notebook notes and mastery check. **Keywords:** join point, `@Order`, pointcut, execution, self-invocation, rollback-only, aspect |

### Lesson 25 — Transaction management internals (pp. 11–21)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 11 | Why transactions exist: ACID from scratch | One business operation, multiple writes; Auto-commit versus explicit boundaries. **Keywords:** outbox, `@Transactional` |
| 12 | From manual JDBC to Spring transactions | The burden of manual demarcation; Declarative version. **Keywords:** `TransactionTemplate`, flush, outbox, `@Transactional` |
| 13 | The transaction infrastructure | Who does what?; How resources get reused. **Keywords:** `TransactionAttributeSource`, `TransactionSynchronizationManager`, `PlatformTransactionManager`, `JdbcTransactionManager`, `JpaTransactionManager`, `TransactionInterceptor`, `JdbcTemplate`, `@Transactional` |
| 14 | What happens when the annotated method is called? | Step-by-step runtime flow; Target return is not a durable commit. **Keywords:** `TransactionInterceptor`, flush, rollback-only, `@Transactional` |
| 15 | Choosing the transaction boundary | Why the service layer is usually the right place; Keep the boundary short, but complete; Class versus method configuration. **Keywords:** outbox, `@Transactional` |
| 16 | Rollback rules: checked and unchecked exceptions | Defaults and how to change them; Why use type-based rules?; Be careful with noRollbackFor. **Keywords:** rollback-only, `@Transactional` |
| 17 | Caught exceptions and rollback-only state | Catching the exception inside a transactional method; Catching a failure from another transactional bean. **Keywords:** `UnexpectedRollbackException`, REQUIRED, advice, `@Transactional` |
| 18 | Flush, commit and persistence context | Reconnect to Module 4; Query-triggered flushing; Why transaction completion can fail. **Keywords:** idempotency, `@Transactional` |
| 19 | Read-only, timeout and explicit boundaries | @Transactional settings in practice; Programmatic alternative: TransactionTemplate. **Keywords:** `PlatformTransactionManager`, `readOnly`, `rollbackFor`, self-invocation, flush, rollback-only, REQUIRED |
| 20 | Threads, @Async and transaction events | Link to Java multithreading; Run work after commit. **Keywords:** `ThreadLocal`, `@TransactionalEventListener`, `AFTER_COMMIT`, outbox, `@Transactional` |
| 21 | Interview drill and notebook notes | Explain, then predict; Debugging exercise; Notebook notes. **Keywords:** ACID, `readOnly`, `TransactionInterceptor`, flush, rollback-only, `@Transactional` |

### Lesson 26 — Propagation, isolation and failure scenarios (pp. 22–32)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 22 | Propagation: logical versus physical transactions | Why do we need propagation?; Logical versus physical. **Keywords:** `NOT_SUPPORTED`, NEVER, savepoint, NESTED, SUPPORTS, MANDATORY, REQUIRED, `REQUIRES_NEW` |
| 23 | REQUIRED and UnexpectedRollbackException | Shared transaction: the default use case; What is the correct fix?. **Keywords:** rollback-only, `@Transactional` |
| 24 | REQUIRES_NEW and independent commits | Audit an attempt, not a successful outcome; The connection pool trap. **Keywords:** `@Transactional` |
| 25 | NESTED and savepoints | Partial rollback within one physical transaction; Spring support matters. **Keywords:** `DataSourceTransactionManager`, `JdbcTransactionManager`, `JpaTransactionManager`, SUPPORTS, REQUIRED, `REQUIRES_NEW` |
| 26 | The other propagation modes | SUPPORTS, MANDATORY, NOT_SUPPORTED and NEVER; Which policy should I choose?. **Keywords:** NESTED, outbox, REQUIRED, `REQUIRES_NEW`, `@Transactional` |
| 27 | Isolation: dirty and non-repeatable reads | A concurrent database is not a Java synchronized block; What does this mean for mortgage processing?. **Keywords:** `READ_COMMITTED`, MVCC, dirty read |
| 28 | Phantoms, lost updates and write skew | Phantom reads concern a set of rows; Lost update: read-modify-write race; Write skew: a cross-row invariant. **Keywords:** MVCC, dirty read, non-repeatable read, SERIALIZABLE |
| 29 | The four standard isolation levels | Minimum guarantees in the classic SQL model; PostgreSQL-specific behavior. **Keywords:** `READ_UNCOMMITTED`, `REPEATABLE_READ`, write skew, `READ_COMMITTED`, dirty read, non-repeatable read, phantom, SERIALIZABLE, H2, execution, `@Transactional` |
| 30 | Hands-on SQL: observe real isolation | Run in two PostgreSQL sessions; Extend the lab: phantom reads |
| 31 | Deadlocks, retry and remote side effects | Locks have a lifetime; Local rollback cannot undo an HTTP call. **Keywords:** idempotency, timeout, `TransactionTemplate`, outbox, `REQUIRES_NEW`, `@Transactional` |
| 32 | Scenario drill and revision | Answer before reading the explanation; Notebook notes. **Keywords:** `NOT_SUPPORTED`, NEVER, savepoint, SERIALIZABLE, `PostgreSQL`, NESTED, `UnexpectedRollbackException`, SUPPORTS, MANDATORY, rollback-only, REQUIRED, `REQUIRES_NEW` |

### Hands-on lab (pp. 33–38)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 33 | Build a small, reproducible transaction lab | Goal and design; File organization. **Keywords:** H2, `JdbcTemplate`, self-invocation, aspect |
| 34 | Application, schema and data access | TxLabApplication.java; application.properties and schema.sql; LabStore.java. **Keywords:** auto-commit, H2, `JdbcTemplate`, `@Transactional` |
| 35 | Two services, different transaction policies | AuditService.java; SubmissionService.java (first half). **Keywords:** `REQUIRES_NEW`, `@Transactional` |
| 36 | Finish the service and add the aspect | SubmissionService.java (continued); TimingAspect.java. **Keywords:** `@Order`, `@Around`, `ProceedingJoinPoint`, `rollbackFor`, `@Aspect`, `JdbcTemplate`, execution, `@Transactional` |
| 37 | Integration tests: commit and rollback | SubmissionServiceTest.java (first half). **Keywords:** `JdbcTemplate`, `UnexpectedRollbackException`, execution, `@Transactional` |
| 38 | Integration tests: propagation and self-invocation | **Keywords:** H2, `UnexpectedRollbackException`, MANDATORY, REQUIRED |

### Interview revision and references (pp. 39–40)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 39 | Production troubleshooting playbook | Diagnose the symptom, not just the annotation; A realistic interview debugging narrative; Resume defense. **Keywords:** deadlock, timeout, `UnexpectedRollbackException`, MANDATORY, self-invocation, flush, outbox, rollback-only, REQUIRED, `REQUIRES_NEW`, advice |
| 40 | Final cheat sheet and reading references | Last-minute notebook revision; Final mastery checklist; Further reading (official documentation). **Keywords:** cross-cutting, `TransactionInterceptor`, SERIALIZABLE, `PostgreSQL`, NESTED, self-invocation, flush, outbox, rollback-only, REQUIRED, `REQUIRES_NEW`, aspect |

[Back to module overview](#module-overview)

---

## Module 06 — Spring Security

**[Download / open PDF](./Spring_Boot_Module_6_Expanded.pdf)** · **42 pages** · Priority: High

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 27 — Authentication, authorization, CORS and CSRF | 3–9 |
| Lesson 28 — Security filter chain and authentication internals | 10–17 |
| Lesson 29 — JWT and password security | 18–24 |
| Lesson 30 — Authorization, OAuth 2.0 and OIDC | 25–31 |
| Hands-on lab | 32–40 |
| Interview revision and references | 41–42 |

### Lesson 27 — Authentication, authorization, CORS and CSRF (pp. 3–9)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why security belongs in the backend | The problem before Spring Security; Think in trust boundaries; Security requirements for our running example; Interview checkpoint; Q. Why use a security framework instead of writing an if statement in every controller?. **Keywords:** Authentication, authentication, authorization |
| 4 | Authentication, authorization and identity | A mental model for each request; Authentication is not authorization; Authentication methods at a glance; Q. Can authentication and authorization occur in different services?. **Keywords:** bearer token, tenant, session, resource server |
| 5 | Sessions, cookies and stateful authentication | Why a session exists; Session lifecycle and scaling; Q. Is a cookie the same as a session?. **Keywords:** `HttpOnly`, `SameSite`, Secure |
| 6 | Stateless APIs and bearer tokens | A different way to remember identity; Stateful versus stateless; Choosing for the mortgage service; Q. Does a valid JWT guarantee the user is still employed?. **Keywords:** cookie, PKCE, revocation, session, Authentication, resource server, issuer, authentication, authorization |
| 7 | Browser origins and CORS | Why browsers block certain requests; What CORS cannot do; Q. Postman succeeds but the frontend fails. What do you check?. **Keywords:** cookie, preflight, bearer token, authentication, authorization |
| 8 | CSRF and how it differs from CORS | The problem: ambient credentials; CSRF token defense; When can an API disable CSRF?; Q. Is CORS a substitute for CSRF protection?. **Keywords:** `SameSite`, cookie, session, authentication, authorization |
| 9 | Security basics: error semantics and revision | The three most useful status codes; Security is a layered design; Practice before moving on; Q. Is HTTPS sufficient to secure an API?; Notebook notes. **Keywords:** preflight, bearer token, stateless, CORS, CSRF, session, Authentication, resource server, JWT, authentication, authorization |

### Lesson 28 — Security filter chain and authentication internals (pp. 10–17)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 10 | How Spring Security enters the MVC lifecycle | From Module 3 to this module; Why a delegating proxy?; What happens on startup?; Q. Why not use a HandlerInterceptor for all security?. **Keywords:** `DelegatingFilterProxy`, `FilterChainProxy`, `SecurityFilterChain`, authentication, authorization |
| 11 | SecurityFilterChain and matching rules | Build a chain using modern Java configuration; Two kinds of matching; permitAll versus ignoring a request; Q. What happens if no chain matches?. **Keywords:** `securityMatcher`, `FilterChainProxy`, `requestMatchers`, session, Authentication, authentication, authorization |
| 12 | Filter ordering and request flow | A representative servlet chain; When a custom filter is appropriate; Q. Will @ControllerAdvice handle every security exception?. **Keywords:** `AuthorizationFilter`, `ExceptionTranslationFilter`, `BearerTokenAuthenticationFilter`, bearer token, CORS, CSRF, session, Authentication, JWT, authentication, authorization |
| 13 | Authentication objects and SecurityContext | Understand the data structures; Anonymous authentication nuance; Q. Is the SecurityContext the same as HttpSession?. **Keywords:** `GrantedAuthority`, `SecurityContextHolder`, authorization |
| 14 | AuthenticationManager and provider delegation | A manager coordinates, a provider authenticates; Important distinction; Q. Why does Spring have multiple providers?. **Keywords:** `AuthenticationProvider`, `UsernamePasswordAuthenticationToken`, `DaoAuthenticationProvider`, `UserDetailsService`, `JwtAuthenticationProvider`, `ProviderManager`, `PasswordEncoder`, bearer token, resource server, JWT |
| 15 | Walkthrough: username and password authentication | Follow one login from start to finish; What success and failure mean; Q. Does UserDetailsService check the password?. **Keywords:** `ROLE_`, `DaoAuthenticationProvider`, `ProviderManager`, `PasswordEncoder`, session |
| 16 | ThreadLocal, persistence and request cleanup | Reconnect to Java concurrency; Context repository versus holder; Q. Does a security context automatically persist because you called setAuthentication?. **Keywords:** `SecurityContextRepository`, `SecurityContextHolder`, stateless, session, authorization |
| 17 | Exception translation and chain debugging | The two security response handlers; A practical debugging sequence; Lesson 28 notebook notes. **Keywords:** `AuthenticationEntryPoint`, `AccessDeniedHandler`, `DelegatingFilterProxy`, `AuthenticationManager`, `ExceptionTranslationFilter`, `FilterChainProxy`, `SecurityContextHolder`, `SecurityFilterChain`, ownership, CORS, CSRF, session |

### Lesson 29 — JWT and password security (pp. 18–24)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 18 | JWT structure: what is actually inside? | JSON Web Token from scratch; Claims worth remembering; Q. Is JWT encrypted by default?. **Keywords:** JWS, RS256, audience, issuer, authorization |
| 19 | Signature verification and the trust model | Symmetric and asymmetric signatures; JWKS and key rotation; Signature validity is necessary, not sufficient; Q. Why not use the same secret in every service?. **Keywords:** HS256, RS256, audience, issuer, authorization |
| 20 | The Spring JWT authentication pipeline | Walk through one API request; How a scope becomes an authority; Q. Does Spring validate the JWT by calling the issuer on every request?. **Keywords:** `JwtAuthenticationConverter`, `AuthorizationFilter`, `JwtDecoder`, `JwtAuthenticationProvider`, `BearerTokenAuthenticationFilter`, `SCOPE_`, OAuth 2.0, `SecurityContext`, `ProviderManager`, revocation, resource server |
| 21 | Configuring a real resource server | Minimal application setup; Q. What if a token issued for a payroll API is presented here?. **Keywords:** `permitAll`, `requestMatchers`, `SecurityFilterChain`, stateless, CSRF, audience, JWT, issuer |
| 22 | Access tokens, refresh tokens and revocation | Two different credentials; Why shorter lifetime helps; Rotation and logout; Browser storage trade-offs; Q. Can the resource server refresh a token automatically for the client?. **Keywords:** `HttpOnly`, CSRF, session, issuer, authorization |
| 23 | Password hashing and account protection | Hashing is not encryption; Credential lifecycle; Q. Why would an application use JWT if passwords are already hashed?; Experiment. **Keywords:** BCrypt, salt, `PasswordEncoder`, resource server, issuer |
| 24 | Token validation failure scenarios | Work backward from the symptom; Safe troubleshooting checklist; Interview prediction; Q. A JWT is validly signed and unexpired, but it contains no mortgage:read scope. Should the decoder; Lesson 29 notebook notes. **Keywords:** JWKS, revocation, audience, Authentication, resource server, issuer, authentication, authorization |

### Lesson 30 — Authorization, OAuth 2.0 and OIDC (pp. 25–31)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 25 | Roles, scopes and least privilege | Model permissions first; Role prefix and authority prefix; Deny by default; Q. Are JWT roles enough to enforce ownership?. **Keywords:** `SCOPE_`, `requestMatchers`, tenant, issuer, authorization |
| 26 | Method security and proxy behavior | Why protect a service method?; The Module 5 connection; Q. Does @PreAuthorize require a controller?. **Keywords:** `@EnableMethodSecurity`, tenant, authorization |
| 27 | Object-level authorization and tenant boundaries | The missing check in many APIs; Avoid check-then-act races; Q. Should a borrower receive 403 or 404 for someone else's mortgage?. **Keywords:** ownership, issuer, authentication |
| 28 | OAuth 2.0 and OpenID Connect from scratch | Four roles in delegated access; Spring's three OAuth roles; Q. Is OAuth 2.0 an authentication protocol?. **Keywords:** refresh token, OIDC, audience, resource server, JWT, authorization |
| 29 | Authorization code flow with PKCE | User-facing client workflow; Important protections; Confidential versus public clients; Q. Why exchange a code instead of putting access tokens in the redirect URL?. **Keywords:** OIDC, client credentials, CSRF, issuer, authentication |
| 30 | Service-to-service authentication | Client credentials flow; Real-world integration decisions; Token management for outbound calls; Q. Is an API gateway enough for authentication and authorization?. **Keywords:** audience, issuer |
| 31 | Security beyond the happy path | A compact security review of a backend API; Security headers and input handling; Interview scenario; Q. A reviewer can approve a loan by invoking a service from a different controller. The original approval; Lesson 30 notebook notes. **Keywords:** Secure, authorization code, OIDC, PKCE, client credentials, revocation, tenant, ownership, CORS, CSRF, audience, resource server |

### Hands-on lab (pp. 32–40)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 32 | Lab: secured mortgage resource server | **Keywords:** tenant, ownership, CORS, audience, JWT, issuer |
| 33 | Step 1: Maven and application configuration | **Keywords:** JWT, issuer |
| 34 | Step 2: create the security filter chain | **Keywords:** `@EnableMethodSecurity`, `permitAll`, `requestMatchers`, `SecurityFilterChain`, stateless, CORS, CSRF, JWT, authentication, authorization |
| 35 | Step 3: CORS policy and service ownership | **Keywords:** `SecurityContextHolder`, `@PreAuthorize`, Authentication, authentication, authorization |
| 36 | Step 4: complete the service and REST controller | **Keywords:** `@PreAuthorize`, Authentication, authentication |
| 37 | Step 5: test with a real signed JWT | **Keywords:** JWS, `MockMvc`, audience, issuer |
| 38 | Step 6: decoder and authentication tests | **Keywords:** `NimbusJwtDecoder`, `JwtDecoder`, RS256, audience, JWT, issuer, authorization |
| 39 | Step 7: test permissions and ownership | **Keywords:** preflight, authentication, authorization |
| 40 | Step 8: execute and debug the application | Run the tests first; Run against a real development issuer; Five debugging experiments. **Keywords:** preflight, audience, authorization |

### Interview revision and references (pp. 41–42)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 41 | Interview consolidation: explain the mechanisms | Q. Walk me through a JWT-protected Spring Boot API.; Q. What happens if the token is missing, expired or underprivileged?; Q. Why can @PreAuthorize appear not to work?; Q. Why does a protected POST work in Postman but fail in a browser?; Q. Can you invalidate a JWT on logout?; Q. How would you protect a banking integration downstream call?. **Keywords:** preflight, revocation, ownership, CORS, CSRF, audience, session, authentication, authorization |
| 42 | Mastery checklist and reading references | Must know before the next module; Good to know / optional; Official reading references; Exit goal. **Keywords:** `ThreadLocal`, `MockMvc`, `SecurityContext`, PKCE, client credentials, stateless, ownership, CORS, CSRF, audience, session, Authentication |

[Back to module overview](#module-overview)

---

## Module 07 — Unit and Integration Testing

**[Download / open PDF](./Spring_Boot_Module_7_Expanded.pdf)** · **41 pages** · Priority: High

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 31 — JUnit 5 | 3–10 |
| Lesson 32 — Mockito | 11–18 |
| Lesson 33 — Spring Boot integration testing | 19–26 |
| Hands-on lab | 27–39 |
| Interview revision and references | 40–41 |

### Lesson 31 — JUnit 5 (pp. 3–10)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why automated testing matters | The problem before writing tests; Three questions to ask before writing any test; Interview perspective. **Keywords:** CI, integration test, never, unit test, stub, verify, when |
| 4 | Unit, integration and end-to-end tests | Understand the boundary rather than memorizing annotations; A concrete testing strategy; Q. Is @SpringBootTest always an integration test?. **Keywords:** test pyramid, `DispatcherServlet`, rollback, unit test, `MockMvc`, when |
| 5 | JUnit 5 architecture and Maven execution | Dependency management in Spring Boot 3.5; Interview and debugging. **Keywords:** JUnit Platform, Surefire, Failsafe, `Spring TestContext`, Jupiter, `@Test`, verify, when |
| 6 | First unit test: arrange, act, assert | Why this test is valuable; A weak test versus a meaningful test; Q. Do we need @SpringBootTest for this class?. **Keywords:** any, Jupiter, `@Test` |
| 7 | Assertions and exception testing | Equality traps; Q. What is the difference between assertThrows and declaring throws on a test?. **Keywords:** `assertAll`, never, `assertEquals` |
| 8 | Lifecycle, test isolation and extensions | Avoid order-dependent tests; Extension model; Q. Does @BeforeEach run before each parameterized test case?. **Keywords:** `@BeforeAll`, `@AfterAll`, `@TestInstance`, `@AfterEach`, `@ExtendWith`, `Spring TestContext`, `MockitoExtension`, Jupiter, `@Test`, when |
| 9 | Parameterized tests and edge-case design | Design a useful test matrix; Q. When are parameterized tests a bad choice?. **Keywords:** `@ValueSource`, `@MethodSource`, `@ParameterizedTest`, `@CsvSource`, `assertEquals`, Jupiter |
| 10 | Determinism, timeouts and coverage | Coverage: useful signal, not correctness; Lesson 31 interview review; Q. What makes a good unit test?; Q. Why is 100% coverage not enough?. **Keywords:** `JaCoCo`, Clock, any, never, `assertEquals`, Jupiter |

### Lesson 32 — Mockito (pp. 11–18)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 11 | Test doubles: why we need Mockito | Choosing what to replace; Q. Can a mock tell us whether a downstream API is really available?. **Keywords:** fake, spy, unit test, stub, `thenReturn`, verify, when |
| 12 | Mockito internals: invocation interception | Default answers and limitations; Q. Is Mockito the same as a Spring AOP proxy?. **Keywords:** mock maker, Byte Buddy, never, stub, `thenReturn`, verify, when |
| 13 | @Mock, @InjectMocks and constructor wiring | A typical debugging case; Q. Which is better, @InjectMocks or constructor injection in tests?. **Keywords:** `@ExtendWith`, `Spring TestContext`, spy, `@BeforeEach`, `MockitoExtension`, never, `@MockitoBean`, Jupiter, when |
| 14 | Stubbing return values, exceptions and void methods | Consecutive responses and dynamic answers; Failure scenario exercise. **Keywords:** `doThrow`, `thenAnswer`, eq, flush, `thenThrow`, integration test, any, unit test, `thenReturn`, verify, when |
| 15 | Matchers, equality and argument capture | ArgumentCaptor: inspect a value built inside the service; Q. When should I use eq versus any?. **Keywords:** `assertEquals`, `thenReturn`, verify |
| 16 | Verification: what actually happened? | InOrder: order only when it matters; Q. Should we verify private methods?. **Keywords:** `verifyNoMoreInteractions`, any, never |
| 17 | Spies, strict stubbing and common exceptions | Strict stubbing; Q. Why not mock everything, including the service?. **Keywords:** `doReturn`, `PotentialStubbingProblem`, Clock, eq, spy, `@BeforeEach`, `MockitoExtension`, `@Mock`, `assertEquals`, `thenReturn`, when |
| 18 | Service testing: failure paths and meaningful design | Exercise: write before reading the lab; Test-driven development and refactoring; Q. How do you unit-test a dependency failure?. **Keywords:** `@InjectMocks`, `assertThrows`, spy, `thenThrow`, integration test, `@Mock`, rollback, stub, `thenReturn`, verify, when |

### Lesson 33 — Spring Boot integration testing (pp. 19–26)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 19 | Spring TestContext: how integration tests start | Context caching and test isolation; Q. Why does the first integration test take longer than the next one?. **Keywords:** `@DirtiesContext`, unit test, `@SpringBootTest`, Jupiter, `@Test`, when |
| 20 | Choose @SpringBootTest or a test slice | Web environment options; Q. Is a slice test a unit test?. **Keywords:** `RANDOM_PORT`, `@WebMvcTest`, `@DataJpaTest`, `MockMvc` |
| 21 | MockMvc: test the HTTP contract without a socket | Standalone versus context-backed MockMvc. **Keywords:** `DispatcherServlet`, `@WebMvcTest`, `@MockitoBean`, `thenReturn`, `@Test`, when |
| 22 | Validation, error responses and security tests | Security integration from Module 6. **Keywords:** `@WithMockUser`, `jwt()`, `@WebMvcTest`, `MockMvc`, verify, when |
| 23 | @MockitoBean versus @MockBean and local mocks | Context configuration troubleshooting; Q. Why does @Mock fail to replace the Spring service dependency?. **Keywords:** spy, `@SpringBootTest`, `MockMvc`, when |
| 24 | @DataJpaTest: test SQL, mappings and constraints | Constraint tests; Q. Why can a JPA test pass but production fail at commit?. **Keywords:** `PostgreSQL`, flush, integration test, rollback, `assertEquals`, `@Test`, when |
| 25 | Full-context tests and transaction traps | Why the test transaction matters; Real HTTP tests; Q. How would you prove @Transactional rollback?. **Keywords:** timeout, `RANDOM_PORT`, `@BeforeEach`, integration test, never, `@SpringBootTest`, `MockMvc`, when |
| 26 | PostgreSQL, HTTP stubs and CI strategy | Testcontainers: use a real dependency in tests; Test the real HTTP adapter against a stub server; CI and diagnostics. **Keywords:** `@ServiceConnection`, `MockRestServiceServer`, `WireMock`, end-to-end, Surefire, Failsafe, context caching, timeout, `@WebMvcTest`, `@DataJpaTest`, rollback, any |

### Hands-on lab (pp. 27–39)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 27 | Lab setup: one API, four testing boundaries | See the page for examples and explanations. |
| 28 | Application configuration and persistence model | See the page for examples and explanations. |
| 29 | Repository, request models and domain rules | See the page for examples and explanations. |
| 30 | Real service, transactions and behavior contract | What must the tests prove?. **Keywords:** rollback, unit test, when |
| 31 | HTTP layer and global error handling | See the page for examples and explanations. |
| 32 | Unit tests: policy boundaries and service success | **Keywords:** `@ParameterizedTest`, `@CsvSource`, `thenAnswer`, `ArgumentCaptor`, `@ExtendWith`, `@BeforeEach`, `MockitoExtension`, `@Mock`, any, stub, `assertEquals`, `thenReturn` |
| 33 | Unit tests: exercise every failure path | Predicted results; Break the code deliberately. **Keywords:** strict stubbing, `assertThrows`, `thenThrow`, `thenReturn`, `@Test`, verify, when |
| 34 | MVC slice: HTTP success and invalid requests | **Keywords:** `@WebMvcTest`, `@MockitoBean`, `MockMvc`, `thenReturn`, Jupiter, `@Test`, verify, when |
| 35 | MVC slice: malformed JSON, missing ID and business rule | Why test three distinct 400 paths?. **Keywords:** `thenThrow`, `@MockitoBean`, `@Test`, verify, when |
| 36 | Persistence slice: read from SQL and enforce constraints | Test what a mock cannot prove. **Keywords:** Testcontainers, `assertThrows`, `PostgreSQL`, flush, `@DataJpaTest`, rollback, `assertEquals`, Jupiter, `@Test` |
| 37 | Full-context test: successful persistence after HTTP call | **Keywords:** `@AfterEach`, `@BeforeEach`, `@MockitoBean`, `assertEquals`, `@SpringBootTest`, `MockMvc`, `thenReturn`, Jupiter, `@Test`, verify, when |
| 38 | Full-context test: failures and database absence | Test suite inventory. **Keywords:** `thenThrow`, rollback, `assertEquals`, `thenReturn`, `@Test`, verify, when |
| 39 | Real HTTP extension and debugging exercises | Deliberate debugging experiments; How to diagnose a failing suite. **Keywords:** timeout, `RANDOM_PORT`, `@Mock`, any, stub, `@MockitoBean`, `assertEquals`, `@SpringBootTest`, `MockMvc`, Jupiter, `@Test` |

### Interview revision and references (pp. 40–41)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 40 | Interview consolidation: questions and model answers | Q. What is the difference between JUnit and Mockito?; Q. What is the difference between @Mock, @InjectMocks and @MockitoBean?; Q. How do you test an external API failure?; Q. Why not use @SpringBootTest everywhere?; Q. MockMvc versus a RANDOM_PORT test?; Q. How do you test a repository query correctly?; Q. Does @Transactional on a test roll back every change?; Q. How do you improve flaky tests and long startup times?; Q. Is 100 percent coverage sufficient for a strong suite?. **Keywords:** `@DirtiesContext`, flush, `MockitoExtension`, `@DataJpaTest`, unit test, stub, Jupiter, verify, when |
| 41 | Notebook notes, mastery checks and references | Mastery checklist; References and next steps. **Keywords:** context caching, Testcontainers, `PostgreSQL`, flush, `RANDOM_PORT`, `MockitoExtension`, `thenThrow`, `@WebMvcTest`, `@DataJpaTest`, `@Mock`, never, stub |

[Back to module overview](#module-overview)

---

## Module 08 — Production-ready Spring Boot

**[Download / open PDF](./Spring_Boot_Module_8_Expanded.pdf)** · **38 pages** · Priority: Medium

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 34 — Logging, Actuator and observability | 3–11 |
| Lesson 35 — Pooling, caching, async and scheduling | 12–24 |
| Hands-on lab | 25–35 |
| Interview revision and references | 36–38 |

### Lesson 34 — Logging, Actuator and observability (pp. 3–11)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | What does production-ready mean? | Beyond a working REST endpoint; The SDE-1 depth boundary; Q. What is the difference between monitoring and observability?. **Keywords:** backpressure, cache-aside, readiness, serialization, TTL, Actuator, Redis |
| 4 | SLF4J and Logback from scratch | Why not just System.out.println()?; Logger, appender and encoder; Q. Is SLF4J the same as Logback?. **Keywords:** log level |
| 5 | Log levels, configuration and safe messages | Q. Why use log.debug("id={}", id) rather than string concatenation?. **Keywords:** appender, Logger |
| 6 | Correlation IDs, MDC and structured logs | Connect the events of a single request; Q. Does MDC automatically work in @Async methods?. **Keywords:** structured logging, span ID, `ThreadLocal`, trace ID, `TaskDecorator`, distributed tracing, idempotency, SLF4J |
| 7 | Actuator architecture and endpoint exposure | **Keywords:** Logger, Micrometer |
| 8 | Health checks, liveness and readiness | Three different questions. **Keywords:** `HealthIndicator`, Actuator |
| 9 | Metrics and Micrometer fundamentals | A measurement versus a log event. **Keywords:** Counter, Gauge, Timer, histogram, `MeterRegistry`, Actuator |
| 10 | Latency, throughput and percentiles | Why an average is insufficient; SLI, SLO and alerting; Q. If CPU is low but p99 increases, is the server healthy?. **Keywords:** p95, histogram, Micrometer |
| 11 | Distributed tracing and troubleshooting a slow API | A practical investigation sequence. **Keywords:** SLI, trace ID, p95, p99, serialization, Micrometer |

### Lesson 35 — Pooling, caching, async and scheduling (pp. 12–24)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 12 | Connection pooling from first principles | Why creating a connection for every request is expensive; Q. Is a connection pool a thread pool?. **Keywords:** `HikariCP` |
| 13 | HikariCP configuration and pool saturation | Scenario: ten connections, thirty requests; Q. Does connection-timeout limit how long a query can execute?. **Keywords:** liveness |
| 14 | Diagnosing connection pool exhaustion | The failure is usually a symptom; Operational runbook; Q. Why does REQUIRES_NEW sometimes cause connection pool starvation? |
| 15 | Caching: the problem and cache-aside pattern | Why do we cache?; Local versus distributed cache; Q. Should we cache mortgage application status?. **Keywords:** serialization, Redis |
| 16 | Spring Cache annotations and proxy internals | Q. Why does @Cacheable not work when called from the same class?. **Keywords:** `@CachePut`, `@EnableCaching`, `@CacheEvict`, `CacheManager`, distributed lock, Redis |
| 17 | Redis architecture, keys and expiration | Q. Is TTL the same as LRU?. **Keywords:** serialization, eviction |
| 18 | Cache consistency and invalidation pitfalls | The database is the source of truth; A concurrency race even with eviction after commit; Security and key design; Q. Can @CacheEvict replace a database transaction?. **Keywords:** TTL, Redis |
| 19 | Cache stampede, penetration and Redis outages | When a cache becomes the bottleneck; Fail-open versus fail-closed; Q. Redis is down; should we automatically switch to the database?. **Keywords:** cache penetration, `@Cacheable`, eviction |
| 20 | Asynchronous execution: @Async and proxies | Why asynchronous methods exist; Context boundaries. **Keywords:** `@EnableAsync`, `CompletableFuture`, MDC |
| 21 | Thread pools, queues and backpressure | CPU-bound vs I/O-bound tasks; Q. If the async queue is full, should we just increase queue capacity?. **Keywords:** bounded queue, `CallerRunsPolicy`, `ThreadPoolTaskExecutor`, idempotency |
| 22 | Context propagation and reliable background work | A failure timeline; Q. Is CompletableFuture the same as @Async?. **Keywords:** `TaskDecorator`, MDC |
| 23 | Scheduling: fixed rate, delay and cron | Q. Will @Scheduled run on every service instance?. **Keywords:** `@EnableScheduling`, `fixedDelay`, distributed lock |
| 24 | Deployment readiness and operational design review | Scheduling in a replicated service; Graceful shutdown; Notebook notes and mastery checks. **Keywords:** idempotency, `@Cacheable`, `@Async`, TTL, Redis |

### Hands-on lab (pp. 25–35)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 25 | Build the mortgage operations lab | Goal and design; Project creation. **Keywords:** H2, `HikariCP`, Actuator, Redis |
| 26 | Maven dependencies continued | Why each dependency exists. **Keywords:** H2, Actuator, Micrometer, Redis |
| 27 | Application configuration and sample data | **Keywords:** `@EnableCaching`, `@EnableScheduling`, `@EnableAsync`, H2, histogram, Redis |
| 28 | Rate repository and cache service | **Keywords:** `@CacheEvict`, Logger, `MeterRegistry`, `@Cacheable`, eviction, SLF4J, Micrometer |
| 29 | REST routes and request correlation | **Keywords:** SLF4J, MDC |
| 30 | Bounded worker configuration and scheduled job | **Keywords:** `ThreadPoolTaskExecutor`, `@Scheduled`, `fixedDelay`, `MeterRegistry`, SLF4J, MDC, Micrometer |
| 31 | Async worker and overload response | **Keywords:** `TaskRejectedException`, `CompletableFuture`, `MeterRegistry`, SLF4J, `@Async`, Micrometer |
| 32 | Optional Redis profile and typed cache values | **Keywords:** `CacheManager`, serialization, eviction |
| 33 | Execute the cache and observability experiments | Experiment 1: prove cache hits and invalidation; Experiment 2: inspect health and metrics; Experiment 3: Redis expiration. **Keywords:** liveness, readiness, `HikariCP`, TTL, Actuator |
| 34 | Reproduce pool and executor saturation | Experiment 4: exhaust the report executor; Experiment 5: hold every connection with a test. **Keywords:** `HikariCP`, Actuator |
| 35 | Integration tests for cache and async behavior | **Keywords:** `CacheManager`, `MeterRegistry`, Micrometer |

### Interview revision and references (pp. 36–38)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 36 | Interview revision: logging and operations | Q. What happens when a Spring Boot service calls log.info()?; Q. How do you trace a request across multiple services?; Q. What is Actuator, and should all its endpoints be exposed?; Q. How do liveness and readiness differ?; Q. What would you monitor in a Java backend?; Q. Why is p95 more useful than only average latency?; A practice incident. **Keywords:** percentile, p99, distributed tracing, histogram, MDC |
| 37 | Interview revision: caching and concurrency | Q. What is the difference between HikariCP and Tomcat's thread pool?; Q. How do you know whether a connection leak exists?; Q. What happens internally when @Cacheable is called twice?; Q. How would you avoid stale data after an update?; Q. How is Redis different from Hibernate's first-level cache?; Q. What if @Async does not run on another thread?; Q. What is the difference between fixedRate and fixedDelay?; Q. How would you make scheduled tasks safe across replicas?. **Keywords:** `@EnableAsync`, cron, distributed lock, eviction, TTL |
| 38 | Notebook cheat sheet and study checklist | Mastery checklist; References and further reading. **Keywords:** Logback, cache stampede, cache-aside, `@Scheduled`, cron, liveness, readiness, serialization, SLF4J, MDC, `HikariCP`, `@Async` |

[Back to module overview](#module-overview)

---

## Module 09 — Microservices and Backend Integration

**[Download / open PDF](./Spring_Boot_Module_9_Expanded.pdf)** · **44 pages** · Priority: High

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 36 — Service architecture and communication | 3–10 |
| Lesson 37 — Infrastructure and resilience | 11–15 |
| Lesson 38 — Messaging and distributed consistency | 16–26 |
| Hands-on lab | 27–41 |
| Interview revision and references | 42–44 |

### Lesson 36 — Service architecture and communication (pp. 3–10)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Why microservices exist | Start with the problem, not the technology; When should we choose which?. **Keywords:** monolith |
| 4 | Service boundaries and data ownership | Design a boundary around behavior; What about queries spanning services?. **Keywords:** command, event |
| 5 | Synchronous vs asynchronous communication | Command vs event. **Keywords:** `WebClient`, broker, timeout, Kafka |
| 6 | What actually happens in an outbound HTTP call? | The important failure boundaries. **Keywords:** TLS, DNS, idempotency, timeout |
| 7 | RestClient: modern synchronous HTTP | Configuration and error handling. **Keywords:** TLS, DNS, timeout |
| 8 | WebClient and reactive trade-offs | What changes with Java 21 virtual threads?. **Keywords:** `RestTemplate`, backpressure, synchronous, `RestClient`, timeout, event |
| 9 | Declarative clients and integration adapters | Keep business logic independent of transport. **Keywords:** `OpenFeign`, load balancing, `RestClient` |
| 10 | Integration security and contract testing | Authentication across service boundaries; Request and response contracts. **Keywords:** TLS, API gateway, synchronous, `WebClient`, `RestClient`, timeout |

### Lesson 37 — Infrastructure and resilience (pp. 11–15)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 11 | API gateway, discovery and load balancing | Failure and health. **Keywords:** service discovery, DNS, circuit breaker |
| 12 | Timeouts and retry budgets | Retry is a decision, not a default. **Keywords:** jitter, idempotency |
| 13 | Circuit breaker internals | **Keywords:** sliding window, half-open |
| 14 | Bulkheads, rate limits and backpressure | **Keywords:** asynchronous, circuit breaker, timeout |
| 15 | Combine resilience policies deliberately | Debugging a slow or unavailable dependency. **Keywords:** half-open, bulkhead, DNS, Resilience4j, timeout |

### Lesson 38 — Messaging and distributed consistency (pp. 16–26)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 16 | Messaging fundamentals and delivery guarantees | Event design. **Keywords:** at-most-once, at-least-once, exactly-once, idempotency, broker, Kafka |
| 17 | Kafka architecture from scratch | **Keywords:** topic, partition, broker, event |
| 18 | Kafka producers, acknowledgments and retries | **Keywords:** idempotent producer, acks, offset, partition, deduplication, broker, timeout, event |
| 19 | Consumer groups, polling and offsets | **Keywords:** rebalance, topic, partition, Kafka |
| 20 | Kafka failures, dead-letter topics and ordering | **Keywords:** offset, DLT, partition, deduplication, event |
| 21 | SQS: queue-based processing on AWS | **Keywords:** at-least-once, visibility timeout, FIFO, DLQ, deduplication, timeout, Kafka |
| 22 | EventBridge, SQS and Lambda together | **Keywords:** partial batch, FIFO, DLQ |
| 23 | Kafka vs SQS vs EventBridge | Example: a mortgage integration. **Keywords:** FIFO, Lambda, exactly-once, topic, partition, deduplication, broker |
| 24 | Eventual consistency, sagas and compensation | **Keywords:** choreography, orchestration, monolith, asynchronous |
| 25 | Transactional outbox: solve the dual-write gap | **Keywords:** exactly-once, `PostgreSQL`, deduplication, broker, event, Kafka |
| 26 | Idempotency and concurrent duplicates | **Keywords:** ON CONFLICT, transactional outbox, exactly-once, `PostgreSQL`, deduplication, event |

### Hands-on lab (pp. 27–41)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 27 | Build a mortgage integration application | What we are building; Files and prerequisites. **Keywords:** `OutboxRelay`, `ReviewConsumer`, `ReviewStore`, TLS, Docker, circuit breaker, `PostgreSQL`, `RestClient`, deduplication, broker, event, Kafka |
| 28 | Maven and local infrastructure | pom.xml. **Keywords:** Resilience4j, `PostgreSQL`, Kafka |
| 29 | Start the local services and configure profiles | application-policy.yml; application-intake.yml. **Keywords:** acks, command, offset, Docker, `PostgreSQL`, timeout, Kafka |
| 30 | Database schema and message contracts | schema.sql; IntegrationApplication.java and Contracts.java. **Keywords:** topic, event |
| 31 | Simulate a downstream banking API | PolicyController.java; Failure classification: Failures.java |
| 32 | Configure HTTP client and resilience | PolicyConfig.java. **Keywords:** jitter, Resilience4j, `RestClient` |
| 33 | Implement the outbound adapter | PolicyGateway.java. **Keywords:** Resilience4j, `RestClient` |
| 34 | Atomic submission and outbox persistence | MortgageStore.java. **Keywords:** ON CONFLICT, `PostgreSQL` |
| 35 | Submission workflow and HTTP endpoints | SubmissionService.java; MortgageController.java |
| 36 | Structured errors and broker setup | ApiErrors.java; MessagingConfig.java. **Keywords:** DLT, Kafka |
| 37 | Relay: publish confirmed events | OutboxRelay.java. **Keywords:** timeout, Kafka |
| 38 | Consumer: transactional deduplication | ReviewConsumer.java; ReviewStore.java. **Keywords:** ON CONFLICT, DLT, event, Kafka |
| 39 | Run the lab and verify the normal path | **Keywords:** poll, Docker, asynchronous, `PostgreSQL` |
| 40 | Failure experiments and expected observations | Experiment 1: bank outage and breaker recovery; Experiment 2: Kafka unavailable after submission; Experiment 3: simulate a relay crash after publish; Experiment 4: poison event and DLT. **Keywords:** Docker, broker |
| 41 | Unit tests and a stronger integration-test plan | SubmissionServiceTest.java. **Keywords:** poll, DLT, Docker, `PostgreSQL`, broker, Kafka |

### Interview revision and references (pp. 42–44)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 42 | Interview questions: service architecture and resilience | **Keywords:** half-open, monolith, API gateway, load balancing, bulkhead, DNS, `WebClient`, circuit breaker, SQS, idempotency, `RestClient`, timeout |
| 43 | Interview questions: Kafka, AWS and consistency | **Keywords:** consumer group, eventual consistency, `EventBridge`, Lambda, transactional outbox, exactly-once, offset, asynchronous, topic, SQS, idempotency, partition |
| 44 | Mastery checklist and official references | Must know before an SDE-1 interview; Good to know; defer the rest; Official documentation for deeper study. **Keywords:** data ownership, `OpenFeign`, dead-letter, visibility timeout, saga, compensation, consumer group, DLQ, eventual consistency, monolith, API gateway, load balancing |

[Back to module overview](#module-overview)

---

## Module 10 — Interview Consolidation

**[Download / open PDF](./Spring_Boot_Module_10_Expanded.pdf)** · **42 pages** · Priority: Final revision

Pages 1–2: cover and reading guide.

| Section | PDF pages |
| --- | ---: |
| Lesson 39 — End-to-end backend design and capstone | 3–18 |
| Lesson 40 — Interview question bank | 19–28 |
| Lesson 40 — Debugging exercises | 29–33 |
| Lesson 40 — Mock interviews | 34–36 |
| Lesson 40 — Resume defense | 37–38 |
| Final revision and references | 39–42 |

### Lesson 39 — End-to-end backend design and capstone (pp. 3–18)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 3 | Think like a backend engineer | The difference between knowing and applying Spring; Translate requirements into engineering constraints; How to answer a design question in an interview. **Keywords:** idempotency key, scope |
| 4 | Define the API contract first | Endpoint and authorization contract; Define status codes by responsibility. **Keywords:** idempotency key, scope |
| 5 | Architecture and responsibility boundaries | Draw the layers and their dependency direction; Trace a successful submission; What belongs where?. **Keywords:** `DispatcherServlet`, Bean Validation, idempotency key, `@Transactional`, DTO, ownership, scope |
| 6 | Concurrency and data model | Model invariants in the database; Two simultaneous submissions; Two simultaneous reviewer decisions. **Keywords:** optimistic locking |
| 7 | Set up the capstone project | **Keywords:** Actuator, H2, JWT, scope |
| 8 | Configuration and security boundary | **Keywords:** auto-configuration, H2, DTO, JWT |
| 9 | Implement the entity and repository | **Keywords:** `@Version`, `JpaRepository`, optimistic locking |
| 10 | DTOs and domain failures | Why separate entities from API models?. **Keywords:** Bean Validation |
| 11 | Implement the transactional service | **Keywords:** idempotency key, `@Transactional` |
| 12 | Recover from a concurrent insert safely | **Keywords:** unique constraint, `@Transactional` |
| 13 | HTTP controller and authenticated identity | **Keywords:** JWT |
| 14 | Security rules and error responses | **Keywords:** `ProblemDetail`, `SecurityFilterChain`, Actuator, JWT |
| 15 | Integration tests: verify the complete flow | **Keywords:** `@MockitoBean`, JUnit, Mockito, H2, `MockMvc`, `@Transactional`, JWT, scope |
| 16 | Integration tests: failure paths | See the page for examples and explanations. |
| 17 | Unit tests and concurrency verification | Extend the tests to prove the race behavior. **Keywords:** `PostgreSQL`, JUnit, H2, optimistic locking, `MockMvc`, ownership, JWT |
| 18 | Run the lab and extend it responsibly | Local workflow; Production extension: real bank communication. **Keywords:** Kafka, outbox |

### Lesson 40 — Interview question bank (pp. 19–28)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 19 | Spring Core: explain the container, not just DI | Q: What is IoC? How is it related to dependency injection?; Q: What happens after Spring finds a @Service class?; Q: BeanFactory vs ApplicationContext?; Q: What if two beans implement one interface?; Q: Are Spring singletons thread-safe? What about prototype scope? |
| 20 | Spring Boot: startup and auto-configuration | Q: What is the difference between Spring Framework and Spring Boot?; Q: Explain @SpringBootApplication and auto-configuration.; Q: How does Boot configure a database when I add JPA?; Q: What happens inside SpringApplication.run()?; Q: How do profiles and externalized configuration differ?. **Keywords:** `HikariCP`, dependency injection |
| 21 | MVC, REST and request validation | Q: Explain the complete Spring MVC request lifecycle.; Q: Filter vs HandlerInterceptor vs AOP?; Q: @RequestParam vs @PathVariable vs @RequestBody?; Q: What does @RestControllerAdvice do?; Q: What is idempotency? Are POST requests always unsafe to retry?. **Keywords:** `DispatcherServlet`, Bean Validation, `ProblemDetail`, DTO, concurrency, ownership, scope |
| 22 | JPA and Hibernate: entity state and SQL | Q: What is the difference between JPA, Hibernate and Spring Data JPA?; Q: What is a persistence context?; Q: What does save() do internally?; Q: When does Hibernate send SQL?; Q: What are the four entity states?. **Keywords:** dirty checking |
| 23 | Hibernate: performance and concurrency | Q: What causes the N+1 query problem?; Q: Why does LazyInitializationException occur?; Q: Page vs Slice vs keyset pagination?; Q: How do first-level and second-level caching differ?; Q: How do you prevent lost updates?. **Keywords:** Redis, optimistic locking, DTO |
| 24 | AOP and transactions: the interview core | Q: How does @Transactional work?; Q: Does Spring roll back on all exceptions?; Q: REQUIRED vs REQUIRES_NEW vs NESTED?; Q: What about isolation levels?; Q: Will @Async inherit a transaction? Can I roll back a remote REST call?. **Keywords:** `UnexpectedRollbackException`, rollback-only, outbox, concurrency |
| 25 | Spring Security: authentication and authorization | Q: How does a JWT request become authenticated in Spring Security?; Q: Is a JWT encrypted? Can I trust decoded claims?; Q: Authentication vs authorization? 401 vs 403?; Q: Why do CORS and CSRF exist? When can CSRF be disabled?; Q: OAuth 2.0 vs OpenID Connect?. **Keywords:** `SecurityFilterChain`, ownership, scope |
| 26 | Testing: choosing the right confidence boundary | Q: What is the difference between unit, integration and end-to-end testing?; Q: @Mock vs @InjectMocks vs @MockitoBean?; Q: What is stubbing vs verification?; Q: @WebMvcTest vs @SpringBootTest vs @DataJpaTest?; Q: Why use Testcontainers instead of H2?. **Keywords:** `PostgreSQL`, `MockMvc`, concurrency |
| 27 | Production readiness: diagnose before tuning | Q: What is Spring Boot Actuator and what should be exposed?; Q: How does a connection pool work?; Q: Explain Spring caching and Redis TTL.; Q: Why does @Async sometimes run synchronously?; Q: How would you troubleshoot slow requests?. **Keywords:** `HikariCP`, `SecurityFilterChain`, ownership, scope |
| 28 | Microservices, Kafka and AWS integration | Q: When would you choose microservices over a monolith?; Q: RestClient vs WebClient? What about retries?; Q: What does a circuit breaker do? How is it different from a bulkhead?; Q: Kafka partitions, offsets and consumer groups?; Q: SQS vs EventBridge vs Kafka?. **Keywords:** duplicate delivery, Lambda, outbox, concurrency, ownership |

### Lesson 40 — Debugging exercises (pp. 29–33)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 29 | Debugging framework: slow or failing APIs | Case 1: a normally fast API now takes eight seconds; Case 2: one endpoint is returning unexpected 400 responses; Case 3: the app starts but receives no requests. **Keywords:** DTO, concurrency |
| 30 | Predict the output: transaction pitfalls | Exercise A: same-class call; Exercise B: the caught inner failure; Exercise C: local commit and remote side effect. **Keywords:** `UnexpectedRollbackException`, rollback-only, `REQUIRES_NEW`, idempotency key, `@Transactional` |
| 31 | Predict the SQL: persistence failures | Exercise A: modifying a managed entity; Exercise B: lazy collection outside a transaction; Exercise C: N+1 and pagination; Exercise D: two simultaneous updates. **Keywords:** fetch join, `@Transactional`, DTO |
| 32 | Predict the behavior: security and testing | Exercise A: valid token, wrong user; Exercise B: custom advice never catches an invalid JWT; Exercise C: mock stubbing appears to do nothing; Exercise D: a transactional test hides a production failure. **Keywords:** `DispatcherServlet`, `ProblemDetail`, `@MockitoBean`, Mockito, `MockMvc`, DTO, ownership, scope |
| 33 | Distributed failures: work through the timeline | Case 1: client timed out after submitting a mortgage; Case 2: database committed but Kafka publishing failed; Case 3: Kafka consumer processed an event twice; Case 4: SQS Lambda batch contains a poison message. **Keywords:** unique constraint, idempotency key, outbox |

### Lesson 40 — Mock interviews (pp. 34–36)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 34 | Mock round 1: Spring fundamentals and MVC | Section A — 10 minutes; Section B — 15 minutes; Section C — 10 minutes; Self-score rubric. **Keywords:** auto-configuration, N+1, `MockMvc`, DTO, scope |
| 35 | Mock round 2: data, transactions and security | Section A — 15 minutes; Section B — 15 minutes; Section C — 10 minutes; Self-score and targeted recovery. **Keywords:** `SecurityFilterChain`, `REQUIRES_NEW`, N+1, `@Transactional`, ownership, JWT |
| 36 | Mock round 3: production and microservices | Section A — incident response (15 minutes); Section B — distributed architecture (15 minutes); Section C — testing and trade-offs (10 minutes); Self-score rubric. **Keywords:** Redis, circuit breaker, SQS, Lambda, Kafka |

### Lesson 40 — Resume defense (pp. 37–38)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 37 | Prepare honest experience stories | A four-part explanation for each claim; Example: explain a simulated request-validation task; Follow-ups to prepare for your own experience. **Keywords:** resume, Bean Validation, JUnit, Mockito, Lambda, DTO, ownership |
| 38 | Walk through your project in an interview | A two-minute capstone explanation; Likely follow-up sequence; SQL and performance story template; Production integration story template. **Keywords:** unique constraint, `PostgreSQL`, resume, pagination, outbox, optimistic locking, `MockMvc`, DTO, ownership, JWT |

### Final revision and references (pp. 39–42)

| Page | Main topic | Subtopics / searchable concepts |
| ---: | --- | --- |
| 39 | High-value revision sheet: modules 1–5 | Spring Core and Boot (Modules 1–2); MVC and REST (Module 3); JPA and Hibernate (Module 4); AOP and transactions (Module 5). **Keywords:** `IoC`, fetch join, rollback-only, `DispatcherServlet`, `REQUIRES_NEW`, auto-configuration, pagination, N+1, H2, optimistic locking, concurrency, scope |
| 40 | High-value revision sheet: modules 6–9 | Security (Module 6); Testing (Module 7); Production readiness (Module 8); Microservices and integration (Module 9). **Keywords:** duplicate delivery, circuit breaker, `@MockitoBean`, JUnit, Mockito, Actuator, SQS, Lambda, Kafka, outbox, `MockMvc`, concurrency |
| 41 | A focused final preparation plan | Seven revision sessions (suggested, not a deadline); Mastery checklist; What is enough for SDE-1?. **Keywords:** dirty checking, dependency injection, resume, auto-configuration, pagination, SQS, N+1, Kafka, optimistic locking, DTO, ownership, JWT |
| 42 | References and next steps | Official reference material; How to use this book after finishing it. **Keywords:** `ProblemDetail`, Actuator, concurrency, JWT, scope |

[Back to module overview](#module-overview)

---

## Suggested repository layout

```text
spring-boot-interview-preparation/
├── README.md
├── Spring_Boot_Module_1_Expanded.pdf
├── Spring_Boot_Module_2_Expanded.pdf
├── Spring_Boot_Module_3_Expanded.pdf
├── Spring_Boot_Module_4_Expanded.pdf
├── Spring_Boot_Module_5_Expanded.pdf
├── Spring_Boot_Module_6_Expanded.pdf
├── Spring_Boot_Module_7_Expanded.pdf
├── Spring_Boot_Module_8_Expanded.pdf
├── Spring_Boot_Module_9_Expanded.pdf
└── Spring_Boot_Module_10_Expanded.pdf
```

## Scope and version notes

The books target Java 21, Spring Boot 3.5 and the compatible Spring ecosystem (Framework 6.2, Hibernate 6.6, Security 6.5 where relevant). The fixed teaching baseline is not a recommendation to deploy old dependencies. Use supported security-patched dependencies and verify examples in your own environment. The index catalogs the books as written; it does not independently validate or execute their Java, SQL or configuration examples.

**Index coverage:** all 444 pages accounted for (20 cover/reading-guide pages and 424 indexed content pages).
