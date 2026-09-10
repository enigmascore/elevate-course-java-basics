# Basic Java course - answers repository.
#
# The targets wrap the everyday Maven commands the course teaches.
# Run one exercise's tests with e.g.:  make test-one TEST=Q01VariablesTest

.PHONY: compile test test-one clean

compile:
	mvn compile

test:
	mvn test

test-one:
	mvn test -Dtest=$(TEST)

clean:
	mvn clean
