<<template>
  <div class="container">
    <div class="row">
      <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
        <b-button block size="lg" variant="primary" @click="routerServie.navigateTo(APP_PATH.LOGIN)">Login</b-button>
      </div>
     <div class="col-sm-12 col-md-12 col-lg-12 col-xl-12">
        <b-button class="margin-top" size="lg" block variant="success" @click="routerServie.navigateTo(APP_PATH.REGISTRATION)">Registration</b-button>
      </div>
    </div>
  </div>
</template>
<script>
import { RouterService } from '../service/exporter-service'
import {APPLICATION_PATH} from '../router/router-application-path'
export default {
  data () {
    return {
      routerServie: RouterService,
      APP_PATH: APPLICATION_PATH
    }
  },
  methods: {

  }
}
</script>
<<style scoped>
  .container {
    margin-top: 15em;
  }
  .margin-top {
    margin-top: 1em;
  }
</style>
