#!/usr/bin/groovy

def call(String cmd='echo run command'){

	echo 'Hello World'
	sh '${cmd}'
}