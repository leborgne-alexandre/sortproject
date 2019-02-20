# sortproject

## Installation

```console
$ git clone https://github.com/aminnairi/sortproject.git
```

## Usage

*Note: GNU/Linux & Mac OS X can use the `make` command. Windows users have to use `docker-compose` command.*

Make | Docker Compose | Description
---|---|---
`make compile` | `docker-compose run compile` | Compile the Java classes files
`make run` | `docker-compose run run` | Run the main class
`make clean` | `docker-compose run clean` | Remove the compiled classes files

## Examples

### Docker Compose

```console
$ docker-compose run compile
$ docker-compose run run
$ docker-compose run clean
```

### Make

```console
$ make compile run clean
```