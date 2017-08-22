package com.diy.rest

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter
import com.twitter.server.Stats

import com.diy._

object Main extends FinatraServer

class FinatraServer extends HttpServer with Stats {

  override protected def defaultFinatraHttpPort: String = s":$port"

  override protected def configureHttp(router: HttpRouter): Unit = {
    implicit val stats = statsReceiver
    router.add[Router]
  }
}
