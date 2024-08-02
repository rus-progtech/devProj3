# js2

A superb Niagara module brought to you by PTC.

#### 



```javascript
  require(['/nmodule/js2/rc/Js2Widget'], function (Js2Widget) {
    var widget = new Js2Widget();
    widget.initialize($('#myWidgetGoesHere')).then(function () {
      return widget.load('my value');
    });
  });
```



## Building

This module builds with Gradle. The Gradle build will perform r.js optimization,
minification, and JSDoc generation. Just type: `gradlew :js2:build`

## Development

You can do development on this module with the help of Grunt. Just cd into
the module directory and type `grunt watch` to begin; JSHint and Karma tests
will be run on every file save. You can also type `grunt jshint:src` and
`grunt karma` just to run them once.

Just type `grunt` for a listing of all options.