package com.diy.rest

import com.diy.db.{DbOp, Employee}
import com.google.inject.Inject
import com.twitter.finagle.http.Request
import com.twitter.finagle.stats.StatsReceiver
import com.twitter.finatra.http.Controller

class Router @Inject()(db : DbOp)(implicit statsRec: StatsReceiver) extends Controller {

  prefix("/employee"){
    get(""){request: Request =>
      statsRec.counter("getall").incr()
      db.employees()
    }

    get("/:id"){request: Request =>
      statsRec.counter("get").incr()
      db.employee(request.getIntParam("id"))
    }

    post(""){employee: Employee =>
      statsRec.counter("post").incr()
      db.insertEmployee(employee)
    }

    delete("/:id"){request: Request =>
      statsRec.counter("delete").incr()
      db.deleteEmployee(request.getIntParam("id"))
    }
  }
}
