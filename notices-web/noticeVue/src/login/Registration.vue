<template>
  <div class="container-fluid margin-top">
    <!-- Standard -->
    <b-alert :show="showAlert" :variant="variantAlert">
      <h3>{{alertMsg}}</h3>
    </b-alert>
    <b-card header="Registration" header-variant="success" class="mb-2 color-font-white" title="" sub-title="" show-footer>

      <b-form-fieldset class="color-font-black" description="We will convert your name to lowercase instantly" label="Enter your name" :label-cols="3">
        <b-form-input type="text" v-model="user.name"></b-form-input>
      </b-form-fieldset>

      <b-form-fieldset class="color-font-black" description="We will convert your name to lowercase instantly" label="Enter your email" :label-cols="3">
        <b-form-input type="email" v-model="user.email"></b-form-input>
      </b-form-fieldset>

      <b-form-fieldset class="color-font-black" description="" label="Enter your password" :label-cols="3">
        <b-form-input type="password" v-model="user.password"></b-form-input>
      </b-form-fieldset>

      <b-button class="width" size="md" variant="success" href="" @click="createUser"> Submit
      </b-button>
    </b-card>
  </div>
</template>

<script>
import {User} from '../model/model-exporter'
import {UserService} from '../service/exporter-service'
export default {
  data () {
    return {
      user: new User(),
      showAlert: false,
      variantAlert: 'success',
      alertMsg: ''
    }
  },
  methods: {
    async createUser () {
      try {
        this.user.registrationDate = new Date()
        await UserService.createUser(this.user)
        this.updateAlert(true, 'success', `User Was Seccussfully Created`)
      } catch (error) {
        console.log(error)
        this.updateAlert(true, 'danger', error)
      }
    },
    updateAlert (show = false, variant = 'default', msg = '') {
      this.showAlert = show
      this.variant = variant
      this.alertMsg = msg
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  .margin-top {
    margin-top: 6em;
  }
  .width {
    width: 100%;
  }
  .color-font-white {
    color: white;
  }
  .color-font-black {
    color: black;
  }
</style>
