/* User Class */
export class User {

  constructor (id = null, name = '', password = '', email = '', registrationDate = null) {
    this.id = id
    this.name = name
    this.password = password
    this.email = email
    this.registrationDate = registrationDate
  }
}
