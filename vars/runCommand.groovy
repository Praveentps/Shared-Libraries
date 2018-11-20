#!/usr/bin/groovy

def call(String cmd='echo run command'){

	echo 'Hello World'
	echo "${cmd}"
	sh "${cmd}"
}