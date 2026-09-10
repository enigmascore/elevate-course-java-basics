# Basic Java Course — Answers Repository Template

This repository is a **template** for the Basic Java course. Your own copy
of it holds the course's graded exercises: under `src/main/java/answers`
there is one subdirectory per exercise, each with a `qNN_README.md` of
instructions and classes whose method bodies are **deliberately
unimplemented** — you fill in the gaps. Under `src/test/java/answers` the
same subdirectories hold **fully implemented unit tests**: run them, watch
them fail, implement, watch them pass. Green is the goal, not the start —
on a fresh copy `make test` FAILS by design.

There is no Docker image. You need a JDK (the course pins **Temurin JDK
25**), **Maven** and **STS** — the course's "Getting started" section
walks through installing all three, and also has you clone the read-only
examples project (`elevate-course-java-basics-examples`) with the full
runnable version of every example the course pages teach.

## 1. Create your own repository from this template

1. On this page click the green **Use this template** button and choose
   **Create a new repository**.
2. **Owner:** your own GitHub account.
3. **Repository name:** `firstname-lastname-basic-java-answers`, all
   lowercase, using your own name.
4. **Visibility:** **Private** — your answers must not be visible to
   other students.

## 2. Invite your markers

For each marker listed on your course page: in **your** repository,
**Settings → Collaborators → Add people**, enter the marker's GitHub
username, send the invitation. Then confirm on the course page.

## 3. Clone and import

```bash
git clone https://github.com/YOUR-USERNAME/firstname-lastname-basic-java-answers.git
```

In STS: **File → Import… → Maven → Existing Maven Projects**, select the
cloned folder. Import the examples project the same way, into the same
workspace.

## 4. Working and running the tests

| Command | What it does |
|---|---|
| `make compile` | `mvn compile` |
| `make test` | `mvn test` — all exercises |
| `make test-one TEST=Q01VariablesTest` | `mvn test -Dtest=…` — one exercise |
| `make clean` | `mvn clean` |

In STS: right-click a test class → **Run As → JUnit Test**.

Do NOT edit anything under `src/test/java` — the tests are the marking
spec, and your marker diffs them against this template.

## For markers

```bash
git clone <the student's repository> && cd <it>
git switch <their branch>
make test
git diff origin/main...HEAD -- src/test/java   # must be empty
git log --oneline --graph --all
```

The question's marker rubric on the course page lists the point split.
