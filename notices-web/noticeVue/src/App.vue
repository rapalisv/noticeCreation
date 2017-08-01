<template>
  <div id="app">
    <notice-header></notice-header>
    <router-view></router-view>
  </div>
</template>

<script>
import {Header} from './components/component-exporter'
export default {
  name: 'app',
  components: {
    'notice-header': Header
  }
}
</script>

<style>

</style>
