import {INPUT_GLOBAL_RULES} from '../rules/rules-exporter'
import {INPUT_ERROR} from '../msg/msg-exporter'

/* Check Input Class */
export class InputChecker {

  /* Check Input For Registration */
  static checkUserInputForRegistration (user = null) {
    InputChecker.checkInputName(user.name)
    InputChecker.checkInputEmail(user.email)
    InputChecker.checkInputPassword(user.password)
  }

  /* Check Input Email */
  static checkInputEmail (email = '') {
    if (INPUT_GLOBAL_RULES.EMAIL.LENGHT_MIN >= email.length) {
      throw new Error(INPUT_ERROR.EMAIL.LENGHT_MIN)
    } else if (INPUT_GLOBAL_RULES.EMAIL.LENGHT_MAX <= email) {
      throw new Error(INPUT_ERROR.EMAIL.LENGHT_MAX)
    } else {
      return true
    }
  }

  /* Check Input Name */
  static checkInputName (name = '') {
    if (INPUT_GLOBAL_RULES.NAME.LENGHT_MIN >= name.length) {
      throw new Error(INPUT_ERROR.NAME.LENGHT_MIN)
    } else if (INPUT_GLOBAL_RULES.NAME.LENGHT_MAX <= name.length) {
      throw new Error(INPUT_ERROR.NAME.LENGHT_MAX)
    } else {
      return true
    }
  }

  /* Check Input Password */
  static checkInputPassword (password = '') {
    if (INPUT_GLOBAL_RULES.PASSWORD.LENGHT_MIN >= password.length) {
      throw new Error(INPUT_ERROR.PASSWORD.LENGHT_MIN)
    } else if (INPUT_GLOBAL_RULES.PASSWORD.LENGHT_MAX <= password.length) {
      throw new Error(INPUT_ERROR.PASSWORD.LENGHT_MAX)
    } else {
      return true
    }
  }

  /* Check Email, Email Have To Contain @ To Do */
  static checkCorrectnessOfAnEmail (email = null) {
    if (!email && typeof email !== 'string') {
      throw new Error('Email Is Null Or Is Not Of Type String')
    }

    /* Should To Be Continued */
  }
}
