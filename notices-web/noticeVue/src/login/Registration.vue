<template>
  <div class="container-fluid margin-top">
    <!-- Standard -->
    <b-card header="Registration" header-variant="success" class="mb-2 color-font-white" title="" sub-title="" show-footer>

      <b-form-fieldset class="color-font-black" description="We will convert your name to lowercase instantly" label="Enter your name" :label-cols="3">
        <b-form-input type="text"></b-form-input>
      </b-form-fieldset>

      <b-form-fieldset class="color-font-black" description="We will convert your name to lowercase instantly" label="Enter your email" :label-cols="3">
        <b-form-input type="email"></b-form-input>
      </b-form-fieldset>

      <b-form-fieldset class="color-font-black" description="" label="Enter your password" :label-cols="3">
        <b-form-input type="password"></b-form-input>
      </b-form-fieldset>

      <b-button class="width" size="md" variant="success" href=""> Submit
      </b-button>
    </b-card>
  </div>
</template>

<script>
export default {
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
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
