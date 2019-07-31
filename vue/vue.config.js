module.exports = {
    chainWebpack: config => {
        config.module.rules.delete('eslint');
    },
    productionSourceMap: false,
    devServer: {
        proxy: {
            "^/": {
                target: "http://127.0.0.1:8888/",
                ws: false,
                changeOrigin: true
            }
        }
    }
};
