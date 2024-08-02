
require([ 'baja!',
         'bajaux/events',
         'nmodule/js1/rc/js1',
         'jquery',
         'nmodule/js1/rc/Js1Widget',
         'hbs!nmodule/js1/rc/template/js1' ], function (
         baja,
         events,
         js1,
         $,
         Js1Widget,
         template) {

  'use strict';

  $("#template").html(template({
    virtues: js1.extolVirtues()
  }));

  var widget = new Js1Widget(),
      comp = baja.$('baja:Component', {
        'superb': true,
        'resplendent': true,
        'sublime': true,
        'magnificent': true,
        'splendid': true
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

