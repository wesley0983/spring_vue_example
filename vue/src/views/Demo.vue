<template>
    <div class="demo">
        <h2>{{msg}}</h2>
        <div>
            <div>
                <b-form @submit="onSubmit">
                    <b-form-input v-model="username" placeholder="請輸入帳號"></b-form-input>
                    <b-form-input v-model="password" placeholder="請輸入密碼"></b-form-input>
                    <b-button @click="onSubmit">submit</b-button>
                </b-form>
            </div>

        </div>
    </div>
</template>

<script>
    import axios from 'axios'
    import qs from 'qs'

    export default {
        data() {
            return {
                username: '',
                password:'',
                msg: ''
            }
        },
        methods: {
            onSubmit() {
                /**  Fetch POST方式 **/
                fetch('/login',{
                    method:'POST',
                    body:JSON.stringify({
                        username:this.username,
                        password:this.password
                    }),
                    headers:{"Content-Type":"application/json; charset=utf-8"},
                    mode: 'cors',
                    credentials: 'include'
                });

                /**四 /postApiJson/RequestBody **/  //Json傳送
                // axios.post('/postApiJson/RequestBody', {
                //         username: this.username,
                //         password: this.username
                // }).then(response => {
                //     console.log(response.data);
                //     this.msg = response.data;
                // })

                /**三 postApiJson **/  //x-www-form-urlencoded 送出 需要用到 qs套件配合
                // axios.post('/postApiJson', qs.stringify({
                //         username:this.username,
                //         password:this.username
                // })).then(response => {
                //     console.log(response.data);
                //     this.msg = response.data;
                // })

                /**二 postApiParam **/  //x-www-form-urlencoded 送出 需要用到 qs套件配合
                // axios.post('/postApiParam', qs.stringify({
                //     api: this.username,
                //     //api_2:123
                // })).then(response => {
                //     console.log(response.data);
                //     this.msg = response.data;
                // })

                /**一 postApi **/ //post x-www-form-urlencoded 送出 需要用到 qs套件配合
                // axios.post('/postApi', qs.stringify({
                //     api: this.username
                // })).then(response => {
                //     console.log(response.data);
                //     this.msg = response.data;
                // })
            }
        },
        mounted() {
            /**三 /getApiPath/{api} **/
            // axios.get('/getApiPath/123').then(response => {
            //     console.log(response.data);
            //     this.msg = response.data;
            // })

            /**二 getApiParam **/
            // axios.get('/getApiParam',{
            //     params: {
            //         api: 12345,
            //         //api_2:456
            //     }
            // }).then(response => {
            //     console.log(response.data);
            //     this.msg = response.data;
            // })

            /**一 getApi **/
            // axios.get('/getApi',{
            //     params: {
            //         api: 12345
            //     }
            // }).then(response => {
            //     console.log(response.data);
            //     this.msg = response.data;
            // })
        }
    }
</script>