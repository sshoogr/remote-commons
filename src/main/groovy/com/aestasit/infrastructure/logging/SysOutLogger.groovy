/*
 * Copyright (C) 2011-2014 Aestas/IT
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aestasit.infrastructure.logging

import groovy.transform.CompileStatic
import groovy.transform.TypeChecked

/**
 * Standard system output logger.
 *
 * @author Andrey Adamovich
 *
 */
@CompileStatic
@TypeChecked
class SysOutLogger implements Logger {

  @Override
  void commandOutput(String line) {
    println line
  }

  @Override
  void commandOutput(String[] lines) {
    lines.each { String line ->
      commandOutput(line)
    }
  }

  @Override
  void commandErrorOutput(String line) {
    println "ERROR: ${line}"
  }

  @Override
  void commandErrorOutput(String[] lines) {
    lines.each { String line ->
      commandErrorOutput(line)
    }
  }

  @Override
  void commandInput(String line) {
    println "${line}:"
  }

  @Override
  void uploadStart(String local, String remote) {
    println "> Uploading: ${local} <- ${remote}"
  }

  @Override
  void uploadProgress(String local, String remote, int progress) {
    print '.'
  }

  @Override
  void uploadEnd(String local, String remote) {
    println 'Done.'
  }

  @Override
  void downloadStart(String remote, String local) {
    println "> Downloading: ${local} -> ${remote}"
  }

  @Override
  void downloadProgress(String remote, String local, int progress) {
    print '.'
  }

  @Override
  void downloadEnd(String remote, String local) {
    println 'Done.'
  }

  @Override
  void info(String message) {
    println "$message"
  }

  @Override
  void warn(String message) {
    println "WARN: $message"
  }

  @Override
  void debug(String message) {
    println "DEBUG: $message"
  }

}
