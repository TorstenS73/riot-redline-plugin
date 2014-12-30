package com.riotgames.maven.redline

import groovy.text.Template
import groovy.text.SimpleTemplateEngine

class SRPMSpecTemplate{
  void writeSpecFile(String specfileName) {
	def fle = new File("C:\\Users\\tschlaba\\workspace-luna\\SourceRPM\\src\\srpm.spec-template")
	def binding = [name: "Groovy"]
	def engine = new SimpleTemplateEngine()
	def template = engine.createTemplate(fle).make(binding)
	
	def outputFile = new File(specfileName)
	outputFile.write template.toString()
  }
}
