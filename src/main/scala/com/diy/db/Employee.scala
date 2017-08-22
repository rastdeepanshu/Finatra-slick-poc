package com.diy.db

import slick.jdbc.PostgresProfile.api._

case class Employee(id: Int, first_name: String, last_name: Option[String], age:Option[Int], gender: Option[String])

class EmployeeSchema(tag: Tag) extends Table[Employee](tag, "employee"){
  def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  def first_name = column[String]("first_name")
  def last_name = column[Option[String]]("last_name")
  def age = column[Option[Int]]("age")
  def gender = column[Option[String]]("gender")
  def * = (id, first_name, last_name, age, gender) <> (Employee.tupled, Employee.unapply)
}

object EmployeeSchema extends TableQuery(new EmployeeSchema(_))