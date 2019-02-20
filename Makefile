DOCKERCOMPOSE=docker-compose

.PHONY: run compile clean

run:
	@$(DOCKERCOMPOSE) run --rm run

compile:
	@$(DOCKERCOMPOSE) run --rm compile

clean:
	@$(DOCKERCOMPOSE) run --rm clean