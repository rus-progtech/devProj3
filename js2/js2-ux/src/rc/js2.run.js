
require([ 'baja!',
         'bajaux/events',
         'nmodule/js2/rc/js2',
         'jquery',
         'nmodule/js2/rc/Js2Widget',
         'hbs!nmodule/js2/rc/template/js2' ], function (
         baja,
         events,
         js2,
         $,
         Js2Widget,
         template) {

  'use strict';

  $("#template").html(template({
    virtues: js2.extolVirtues()
  }));

  var widget = new Js2Widget(),
      comp = baja.$('baja:Component', {
        'magnificent': true,
        'remarkable': true,
        'distinguished': true,
        'renowned': true,
        'transcendent': true
      });

  var widgetDiv = $('#widget'),
      description = $('#description');

  widget.initialize(widgetDiv)
    .then(function () {

      widgetDiv.on(events.MODIFY_EVENT, function () {
        widget.read()
          .then(function (value) {
            description.text(value);
          })
          .catch(baja.error);
      });

      return widget.load(comp);
    })
    .catch(baja.error);
});

