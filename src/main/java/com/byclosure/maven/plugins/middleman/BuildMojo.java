package com.byclosure.maven.plugins.middleman;

import org.apache.commons.exec.CommandLine;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal build
 * @phase generate-resources
 * @requiresProject true
 */
public class BuildMojo extends AbstractMiddlemanMojo {

	@Override
	public void execute() throws MojoExecutionException {
		CommandLine cmdLine = getCrossPlatformCommandLine("bundle");

		cmdLine.addArgument("exec");
		cmdLine.addArgument("middleman");
		cmdLine.addArgument("build");

		executeCommandLine(cmdLine);
	}

}