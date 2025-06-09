
var projectName = '垃圾分类系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '考试记录',
	url: '../examrecord/list.html'
}, 
{
	name: '错题本',
	url: '../examrecord/wrong.html'
},
]


var indexNav = [

{
	name: '垃圾信息',
	url: './pages/lajixinxi/list.html'
}, 
{
	name: '商城礼品',
	url: './pages/shangchenglipin/list.html'
}, 

{
	name: '试卷列表',
	url: './pages/exampaper/list.html'
}, 
{
	name: '资讯信息',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm5g92n/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","用户积分"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"垃圾信息","menuJump":"列表","tableName":"lajixinxi"}],"menu":"垃圾信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"垃圾分类","menuJump":"列表","tableName":"lajifenlei"}],"menu":"垃圾分类管理"},{"child":[{"buttons":["查看","修改","删除","添加积分","消耗"],"menu":"用户积分","menuJump":"列表","tableName":"yonghujifen"}],"menu":"用户积分管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"积分增加","menuJump":"列表","tableName":"jifenzengjia"}],"menu":"积分增加管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商城礼品","menuJump":"列表","tableName":"shangchenglipin"}],"menu":"商城礼品管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"商品分类","menuJump":"列表","tableName":"shangpinfenlei"}],"menu":"商品分类管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"礼品兑换","menuJump":"列表","tableName":"lipinduihuan"}],"menu":"礼品兑换管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"积分消耗","menuJump":"列表","tableName":"jifenxiaohao"}],"menu":"积分消耗管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷管理","tableName":"exampaper"}],"menu":"试卷管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试题管理","tableName":"examquestion"}],"menu":"试题管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"资讯信息","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["新增","查看","修改","删除"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"垃圾信息列表","menuJump":"列表","tableName":"lajixinxi"}],"menu":"垃圾信息模块"},{"child":[{"buttons":["查看","礼品兑换"],"menu":"商城礼品列表","menuJump":"列表","tableName":"shangchenglipin"}],"menu":"商城礼品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"用户积分","menuJump":"列表","tableName":"yonghujifen"}],"menu":"用户积分管理"},{"child":[{"buttons":["查看"],"menu":"积分增加","menuJump":"列表","tableName":"jifenzengjia"}],"menu":"积分增加管理"},{"child":[{"buttons":["查看","删除"],"menu":"礼品兑换","menuJump":"列表","tableName":"lipinduihuan"}],"menu":"礼品兑换管理"},{"child":[{"buttons":["查看"],"menu":"积分消耗","menuJump":"列表","tableName":"jifenxiaohao"}],"menu":"积分消耗管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看"],"menu":"错题本","tableName":"examfailrecord"},{"buttons":["查看"],"menu":"试卷列表","tableName":"exampaperlist"},{"buttons":["查看"],"menu":"考试记录","tableName":"examrecord"}],"menu":"考试管理"}],"frontMenu":[{"child":[{"buttons":["查看","查看评论"],"menu":"垃圾信息列表","menuJump":"列表","tableName":"lajixinxi"}],"menu":"垃圾信息模块"},{"child":[{"buttons":["查看","礼品兑换"],"menu":"商城礼品列表","menuJump":"列表","tableName":"shangchenglipin"}],"menu":"商城礼品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
