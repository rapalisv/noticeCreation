import axios from 'axios'
import {REST_API_PATH} from './rest-api-path'
import {InputChecker} from '../utility/utility-exporter'

/* User Service */
export class UserService {

  /* Create User */
  static async createUser (user = null) {
    InputChecker.checkInputEmail(user.email)
    InputChecker.checkInputName(user.name)
    InputChecker.checkInputPassword(user.password)
    return axios.post(REST_API_PATH.BASE_URL + REST_API_PATH.USER_REST_API_PATH.POST.CREATE_USER, user)
  }
}
