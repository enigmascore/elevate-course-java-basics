# Exercise q13_exceptions — exceptions

Implement `parseAge` (catch `NumberFormatException` and re-throw as `IllegalArgumentException` with the EXACT messages the test names; range-check 0–150) and `parseOrDefault` (catch and fall back).

Run the test:

```bash
make test-one TEST=Q13ExceptionsTest
```
