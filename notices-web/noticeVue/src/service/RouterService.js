import router from '../router'

/* Router Service Class */
export class RouterService {

  /* Navigate To Path */
  static navigateTo (path = '') {
    router.push(path)
  }
}
