import axios from 'axios'
import {REST_API_PATH} from './rest-api-path'
import {InputChecker} from '../utility/utility-exporter'

/* User Service */
export class UserService {

  /* Create User */
  static createUser (user = null) {
    if (InputChecker.checkInputName(user.name)) {

    }

    axios.post(REST_API_PATH.BASE_URL + REST_API_PATH.USER_REST_API_PATH.POST.CREATE_USER, user)
  }
}
