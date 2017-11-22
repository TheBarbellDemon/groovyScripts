#!/usr/bin/groovy
def list = new File(args[0]).collect{it}

Collections.sort list

new File(args[1]).withWriter('utf-8'){
	writer ->
		list.each{
			writer.println it
		}
}
