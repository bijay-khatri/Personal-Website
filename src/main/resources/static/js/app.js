/**
 * Created by Bijay on 5/21/2016.
 */
(function(){
    var app = angular.module('personalApp',[]);
    app.controller('MainController',['$http',function($http){
        var tab = 1;
        var self = this;

        //set the baseurl
        var url;

        /*set the base url on page load */
        this.init = function(baseurl){
            self.url = baseurl;
            self.loadPage(1);
            self.loadPages();
        }

        this.setTab = function(tab){
            self.tab = tab;
        }



        this.loadPage = function(id){
            $http.get(self.url + "page/" + id)
                .success(function(data) {
                    self.page = data;
                });
        };

        this.loadPages = function(){
            $http.get(self.url + "page/all")
                .success(function(data) {
                    self.pages = data;
                });
        }

        this.deletePage = function(id){
            $http.delete(self.url + "page/delete/"+id).success(function(){
                self.loadPages(); //refresh after deletion
            });
        }
    }]);
})();