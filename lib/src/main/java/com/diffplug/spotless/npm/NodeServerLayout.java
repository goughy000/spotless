/*
 * Copyright 2020-2021 DiffPlug
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.diffplug.spotless.npm;

import java.io.File;

class NodeServerLayout {

	private final File nodeModulesDir;
	private final File packageJsonFile;
	private final File serveJsFile;
	private final File npmrcFile;

	NodeServerLayout(File buildDir, String stepName) {
		this.nodeModulesDir = new File(buildDir, "spotless-node-modules-" + stepName);
		this.packageJsonFile = new File(nodeModulesDir, "package.json");
		this.serveJsFile = new File(nodeModulesDir, "serve.js");
		this.npmrcFile = new File(nodeModulesDir, ".npmrc");
	}

	File nodeModulesDir() {
		return nodeModulesDir;
	}

	File packageJsonFile() {
		return packageJsonFile;
	}

	File serveJsFile() {
		return serveJsFile;
	}

	public File npmrcFile() {
		return npmrcFile;
	}

	static File getBuildDirFromNodeModulesDir(File nodeModulesDir) {
		return nodeModulesDir.getParentFile();
	}
}
