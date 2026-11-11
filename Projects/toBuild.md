**My recommendation: build an event ticket booking backend as your main project, plus an expense splitter and a support ticket system as your two smaller projects.**

Together, these give you different interview topics: concurrency and transactions, financial calculations, and authorization and workflows. All three can use Java, Spring Boot, PostgreSQL, and REST APIs.

Your timeline is reasonable for **focused backend projects**, assuming roughly 4–6 hours of work per day with AI assistance. Include understanding, testing, and documentation in that time; a polished frontend would need extra time.

| Project | Time estimate | Main engineering challenge |
|---|---:|---|
| Event ticket booking | 7–9 days | Preventing double booking and handling retries |
| Group expense splitter | 2–3 days | Correct money calculations and settlements |
| Support ticket system | 2–3 days | Permissions, state transitions, and audit history |

### 1. Main project: Event ticket booking backend

**The problem:** Users browse events, temporarily reserve seats, and confirm bookings. Multiple people might try to reserve the same seat.

Keep the scope to **one venue per event, assigned seats, and simulated payments**.

**Core features**

- Customer and admin authentication.
- Admin creates events and seats.
- Customer views available seats and reserves one or more seats.
- Reservations expire after a configurable period.
- Simulated payment success confirms the booking.
- Customer views and cancels eligible bookings.
- Repeated confirmation requests do not create duplicate bookings.

**Main tables:** `users`, `events`, `event_seats`, `reservations`, `reservation_seats`, `bookings`, `payment_attempts`.

**What makes this worth discussing**

The important part is proving business rules:

- Two simultaneous requests cannot successfully reserve the same seat.
- An expired reservation cannot be confirmed.
- Retrying confirmation cannot create a second booking.
- A failed operation does not leave partially updated records.

Use database transactions and a deliberate locking strategy. PostgreSQL documents how isolation and explicit locks affect concurrent updates—this is useful background for your design decision. [PostgreSQL concurrency documentation](https://www.postgresql.org/docs/current/mvcc.html)

**Questions you should be able to answer**

- Why doesn’t “check availability, then save” prevent double booking?
- Where does `@Transactional` belong, and what does it guarantee?
- Why did you choose pessimistic or optimistic locking?
- What happens if payment confirmation and reservation expiry happen together?
- What is idempotency, and how did you implement it?
- Which columns need indexes, and why?

**Suggested schedule**

| Day | Deliverable |
|---|---|
| 1 | Requirements, booking states, schema, API contract |
| 2 | Event and seat APIs, migrations, seed data |
| 3 | Authentication and ownership checks |
| 4 | Reservation transaction and concurrency test |
| 5 | Expiry and simulated payment confirmation |
| 6 | Idempotency, cancellation, failure cases |
| 7 | Integration tests, Docker setup, documentation |
| 8–9 | Buffer, deployment, interview preparation |

Keep real payment integration, seat-map UI, microservices, and message brokers outside the first version.

### 2. Smaller project: Group expense splitter

**The problem:** Friends record shared expenses, see who owes whom, and record repayments.

**Core features**

- Create groups and manage members.
- Record an expense paid by one member.
- Support equal and exact-amount splits.
- Calculate each member’s net balance.
- Suggest transfers to settle balances.
- Record settlements and show history.

**Main tables:** `users`, `groups`, `group_members`, `expenses`, `expense_shares`, `settlements`.

**The engineering depth**

Use Java `BigDecimal` and PostgreSQL `NUMERIC` for money. Define an explicit rounding rule: splitting ₹100 among three people must still allocate exactly ₹100.

Build a valid settlement suggestion algorithm, but only claim it finds the minimum number of transfers if you can prove that.

**Interview questions**

- Why is `double` unsuitable for money?
- How do you distribute rounding remainders?
- Why must total net balances sum to zero?
- What happens if an expense is edited after a settlement?
- What is your settlement algorithm’s complexity?

**Three-day scope:** Day 1 schema and expense APIs; day 2 balances and settlements; day 3 edge-case tests, documentation, and deployment. Keep one currency and exclude recurring expenses.

### 3. Smaller project: Support ticket and SLA tracker

**The problem:** Customers report issues; agents process them; admins monitor overdue work.

**Core features**

- Customer, agent, and admin roles.
- Customers create tickets and see their own tickets.
- Agents handle assigned tickets.
- Enforce a defined workflow, such as `OPEN → IN_PROGRESS → RESOLVED → CLOSED`.
- Add comments and retain status-change history.
- Filter and paginate by status, priority, and assignee.
- Calculate resolution deadlines and list overdue tickets.

**Main tables:** `users`, `tickets`, `comments`, `ticket_history`.

**The engineering depth**

Focus on **object-level authorization**: being logged in must not allow a customer to read another customer’s ticket by changing the ID.

For the first version, use elapsed hours for deadlines. Business calendars and holidays add considerable scope.

**Interview questions**

- How do role checks differ from ownership checks?
- Where do you enforce valid status transitions?
- What happens when two agents update the same ticket?
- Why keep history separately?
- Which indexes support the overdue-ticket query?

**Three-day scope:** Day 1 ticket workflow; day 2 security, comments, and filtering; day 3 tests, deadline queries, and documentation.

### Follow a small, real SDLC for each

Use the same stack and development process so you can spend time on the business problems:

**Stack:** Java, Spring Boot, Spring Web, Spring Data JPA, Spring Security, PostgreSQL, Maven, Flyway, JUnit, Docker Compose, and OpenAPI documentation.

For each repository, include:

1. **Requirements:** user stories, acceptance criteria, and explicit exclusions.
2. **Design:** an ER diagram, API contract, and key design decisions.
3. **Implementation:** small commits linked to tasks or issues.
4. **Testing:** business-rule tests and database integration tests.
5. **Delivery:** repeatable startup instructions, sample requests, and a working demo.
6. **Review:** known limitations and what you would improve next.

For database integration testing, Spring Boot with PostgreSQL and Testcontainers is a documented approach. [Docker’s Spring Boot testing guide](https://docs.docker.com/guides/testcontainers-java-spring-boot-rest-api/)

**Build the expense splitter first, the booking system second, and the support system last.** That lets you refresh Spring Boot before tackling concurrency.

Use AI to implement small pieces, review your design, and generate failure scenarios. Before calling a feature finished, explain its request flow, database changes, failure cases, and tests without referring to AI’s explanation. That understanding will matter more in interviews than the number of features on your resume.