const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaojiaoshidianzimingpian/",
            name: "gaoxiaojiaoshidianzimingpian",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaojiaoshidianzimingpian/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校教师电子名片系统"
        } 
    }
}
export default base
