import {INPUT_GLOBAL_RULES} from '../rules/rules-exporter'

/* Check Input Class */
export class InputChecker {

  /* Check Input Email */
  static checkInputEmail (email = '') {
    if (INPUT_GLOBAL_RULES.EMAIL.LENGHT_MIN >= email.length) {
      throw new Error('Email Lenght Is To Short')
    } else if (INPUT_GLOBAL_RULES.EMAIL.LENGHT_MAX <= email) {
      throw new Error('Email Lenght Is To Long')
    } else {
      return true
    }
  }

  /* Check Input Name */
  static checkInputName (name = '') {
    if (INPUT_GLOBAL_RULES.NAME.LENGHT_MIN >= name.length) {
      throw new Error('Name Lenght Is To Short')
    } else if (INPUT_GLOBAL_RULES.NAME.LENGHT_MAX <= name.length) {
      throw new Error('Name Lenght Is To Long')
    } else {
      return true
    }
  }

  /* Check Input Password */
  static checkInputPassword (password = '') {
    if (INPUT_GLOBAL_RULES.PASSWORD.LENGHT_MIN >= password.length) {
      throw new Error('Password Is To Short')
    } else if (INPUT_GLOBAL_RULES.PASSWORD.LENGHT_MAX <= password.length) {
      throw new Error('Password Is To Long')
    } else {
      return true
    }
  }
}
