<html ng-app>
  <head>
    <title>Flight Search</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    <script>
      function MainCtrl($scope, $http) {
          $http.get('http://localhost:8080/flightsearch/flightdetails').
          success(function(data) {
       	   console.log("data", data);
          $scope.flightDetails = data;
       });
            $scope.availableFlights = [];
    	    $scope.fNumberError=false;
    	    $scope.dateError=false;
    	    $scope.getSearchResult = function(fNumber, origin, destination, date) {
    	    	if(!fNumber && (!origin || !destination)) {
    	    		$scope.fNumberError=true;
    	    		$scope.dateError=false;
    	    		return;
    	    	} else if(!date) {
    	    		$scope.dateError=true;
    	    		$scope.fNumberError=false;
    	    		return;
    	    	}
    	    	else {
    	    		$scope.fNumberError=false;
    	    		$scope.dateError=false;
    	    		$scope.availableFlights = [];
    	    		angular.forEach($scope.flightDetails, function(flightDetail){
    	    		      if((flightDetail.flightNumber == fNumber || 
    	    		    		  (flightDetail.origin == origin && flightDetail.destination == destination)) 
    	    		    		  && flightDetail.date == date)
    	    		    		  {
                	    		    	$scope.availableFlights.push(flightDetail);
    	    		    		  }
    	    		});
    	    		console.log("$scope.availableFlights",$scope.availableFlights);
    	    	}
    	    };
    }
    </script>
   </head>
	<body>
	    <div ng-controller="MainCtrl">
	        Flight Number  : <input type='text' ng-model='fNumber' placeholder="Flight Number" /><br>
	        Origin         : <input type='text' ng-model='origin' placeholder="Origin" /><br>
	        Destination    : <input type='text' ng-model='destination' placeholder="Destination" /><br>
	        Departure Date : <input type='text' ng-model='date' placeholder="YYYY-MM-DD" /><br>
	        <button class="search" ng-click="getSearchResult(fNumber, origin, destination, date)">search</button>
	<span style="margin: 10px; color: #FF0000; font-family: "Helvetica Neue"; font-size: 15px; font-weight: 100;" 
	ng-show="fNumberError">
	             Please Enter Either Flight Number or Origin and Destination!!!
	         <br></span>
	<span style="margin: 10px; color: #FF0000; font-family: "Helvetica Neue"; font-size: 15px; font-weight: 100;" ng-show="dateError">
	             Please Enter Date!!!
	         <br></span><br><br><br>
            <div ng-if="availableFlights.length > 0" ng-repeat="flight in availableFlights">
             Flight Number : {{flight.flightNumber}}<br>
             Carrier       : {{flight.carrier}}<br>
             Origin        : {{flight.origin}}<br>
             Departure     : {{flight.departure}}<br> 
             Destination   : {{flight.destination}}<br>           
             Arrival       : {{flight.arrival}}<br>           
             Aircraft      : {{flight.aircraft}}<br>           
             distance      : {{flight.distance}}<br>
             Travel Time   : {{flight.travelTime}}<br>           
             Status        : {{flight.status}}<br>
             <hr>
             <br>
             </div>
	    </div>
	</body>
</html>