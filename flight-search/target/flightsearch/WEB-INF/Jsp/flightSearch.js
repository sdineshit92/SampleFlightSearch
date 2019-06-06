var app = angular.module('flightSearch' ,[]);

app.controller("MainCtrl", ['$scope', '$http', function($scope, $http) {
	$scope.flightDetails = [];
    $scope.getUserDetails = function() {
       $http.get('http://localhost:8080/flightsearch/flightdetails').
       success(function(data) {
       console.log("data", data);
       $scope.flightDetails = data;
       });
    };
    $scope.fNumberError=false;
    $scope.dateError=false;
    $scope.getSearchResult = function(fNumber, origin, destination, date) {
    	if(!fNumber && (!origin || !destination)) {
    		$scope.fNumberError=true;
    		$scope.dateError=false;
    	} else if(!date) {
    		$scope.dateError=true;
    		$scope.fNumberError=false;
    	}
    	else {
    		$scope.fNumberError=false;
    		$scope.dateError=false;
    	}
    };
}]);