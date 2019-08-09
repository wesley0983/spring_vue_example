module.exports = {
    chainWebpack: config => {
        config.module.rules.delete('eslint');
    },
    productionSourceMap: false,
    devServer: {
        proxy: {
            "^/": {
                target: "http://127.0.0.1:8889/",
                ws: false,
                changeOrigin: true
            }
        }
    }
};
