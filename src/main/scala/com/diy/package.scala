package com

import com.typesafe.config.{Config, ConfigFactory}

package object diy {

  private val cfg: Config = ConfigFactory.load("application.conf")
  val port = cfg.getString("api.port")
}
