var yojnaApp = angular.module('yojnaApp', ['ngRoute']);

yojnaApp.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/products', {
        templateUrl: 'view/yojna.partial.product.html',
        controller: 'productCntrl'
    });
    $routeProvider.otherwise({
        redirectTo: 'products'
    });
}
]);

yojnaApp.run(function() {
    console.log("Starting Up");
});
