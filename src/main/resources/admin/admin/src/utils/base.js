const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot56i1459q/",
            name: "springboot56i1459q",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot56i1459q/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "志愿者服务平台"
        } 
    }
}
export default base
