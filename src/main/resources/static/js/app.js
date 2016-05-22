/**
 * Created by Bijay on 5/21/2016.
 */
(function(){
    var app = angular.module('personalApp',[]);

    app.controller('MainController',['$http',function($http){
        this.tab = 1;
        this.addFrom = false;
        var self = this;
        this.setTab = function(tab){
            self.tab = tab;
        }

        this.showAddForm = function(){
            self.addForm = true;
        }

        this.loadPage = function(id){
            $http.get("http://localhost:8080/page/" + id)
                .success(function(data) {
                    self.page = data;
                });
        };

        this.loadPages = function(){
            $http.get("http://localhost:8080/page/all")
                .success(function(data) {
                    self.pages = data;
                });
        }

        this.deletePage = function(id){
            $http.delete("http://localhost:8080/page/delete/"+id).success(function(){
                self.loadPages(); //refresh after deletion
            });
        }
    }]);
})();