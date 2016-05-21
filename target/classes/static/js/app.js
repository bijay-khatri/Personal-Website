/**
 * Created by Bijay on 5/21/2016.
 */
(function(){
    var app = angular.module('personalApp',[]);

    app.controller('MainController',function(){
        this.tab = 1;
        var self = this;
        this.setTab = function(tab){
            self.tab = tab;
            console.log("Tab : ", self.tab);
        }
    });
})();