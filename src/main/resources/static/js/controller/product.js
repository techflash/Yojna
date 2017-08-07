yojnaApp.controller('productCntrl', ['$scope','$http', function($scope, $http){
    $scope.getAllProducts = function(){
         $http.get('products').success(function(data) {
               $scope.products = data;
            });

    }

}]);