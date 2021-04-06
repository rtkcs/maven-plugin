package org.sonatype.mavenbook.plugins;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Goal which outputs a message.
 *
 * @goal echo
 * 
 * @phase validate
 */
public class MyMojo extends AbstractMojo {

	/**
	 * Any Object to print out.
	 * 
	 * @parameter expression="${echo.message}" default-value="Hello Maven World"
	 */
	private Object message;

	public void execute() throws MojoExecutionException, MojoFailureException {

		getLog().info(message.toString());

//		throw new MojoExecutionException("This is a MojoExecutionException. This text is visible in a build process.");
	}
}
