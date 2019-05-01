/**
 * *REALLY* Small set of browser-compatible utility functions 
 *
 * Author: Raphael Mannadiar
 * Date: 2014/08/14
 */

utils = {};

utils.random = function() {
	var r = Math.random();
    if (Math.random() < 0.5) {
        return -r
    } else {
        return r
    }
};


