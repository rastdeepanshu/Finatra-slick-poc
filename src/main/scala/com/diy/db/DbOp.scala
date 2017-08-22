package com.diy.db

import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Future

class DbOp {

  private val db = Database.forConfig("postgres")

  def employees(): Future[Seq[Employee]] = {
    db.run(EmployeeSchema.result)
  }

  def employee(id: Int): Future[Option[Employee]] = {
    db.run(EmployeeSchema.filter(_.id === id).result.headOption)
  }

  def insertEmployee(employee: Employee) : Future[Int] = {
    db.run(EmployeeSchema += employee)
  }

  def deleteEmployee(id: Int): Future[Int] = {
    db.run(EmployeeSchema.filter(_.id === id).delete)
  }
}
