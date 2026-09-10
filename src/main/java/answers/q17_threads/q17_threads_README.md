# Exercise q17_threads — thread pools

Implement `squareAll` with `Executors.newFixedThreadPool`, one submitted task per number, results collected via `Future.get()` in input order, and `shutdown()` at the end. `get()` makes the result deterministic.

Run the test:

```bash
make test-one TEST=Q17ThreadsTest
```
