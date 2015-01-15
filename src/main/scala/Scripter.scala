/*
 * Copyright (c) 2015. The Project (Project Founder, Project Owner, Project Committers, Project Developers and Project Contributors.)
 *
 * Licensed under:
 *  - the Apache License, Version 2.0 <http://www.apache.org/licenses/LICENSE-2.0> or
 *  - the Academic Free License, Version 3.0 <http://opensource.org/licenses/AFL-3.0> or
 *  - the CeCILL-B Free Software License, Version 1.0 <http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html>, at your option.
 * This file may not be copied, modified, or distributed except according to those terms.
 * Any contribution to the project should comply with terms in all of the above licenses.
 */


package fabric.fbp

import akka.actor.Actor

class FBPConfig {
}

class FBP {

  import javax.script.ScriptEngineManager

  val scriptEngine = new ScriptEngineManager().getEngineByName("scala")
}

object Scripter {
  def apply() = new Scripter
}

class Scripter private() extends Actor {

  import javax.script.{Bindings, ScriptEngineManager}

  val scriptEngine = new ScriptEngineManager().getEngineByName("scala")

  def receive = {
    case cmd: String => sender() ! scriptEngine.eval(cmd)
    case (cmd: String, bindings: Bindings) => sender() ! scriptEngine.eval(cmd, bindings)
  }
}
