import Vue from 'vue'
import Router from 'vue-router'
import {Login, LoginComponent, Registration} from '../login/login-exporter'
import {APPLICATION_PATH} from './router-application-path'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'LoginComponent',
      component: LoginComponent
    },
    {
      path: APPLICATION_PATH.LOGIN,
      name: 'Login',
      component: Login
    },
    {
      path: APPLICATION_PATH.REGISTRATION,
      name: 'Registration',
      component: Registration
    }
  ],
  mode: 'history'
})
