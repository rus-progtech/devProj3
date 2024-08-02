
define([
  'baja!',
  'jquery',
  'Promise',
  'nmodule/js/rc/jasmine/promiseUtils',
  'nmodule/js1/rc/Js1Widget' ], function (
  baja,
  $,
  Promise,
  promiseUtils,
  Js1Widget) {

  'use strict';

  const { waitForTrue } = promiseUtils;

  describe('nmodule/js1/rc/Js1Widget', () => {
    let stooges,
        widget,
        elem;

    function addStoogesComponent() {
      return baja.Ord.make('station:|slot:').get({ lease: true })
        .then((station) => {
          return station.add({
            slot: 'stooges?',
            value: baja.$('baja:Component', {
              moe: true, larry: true, curly: true
            })
          });
        })
        .then((prop) => {
          return baja.Ord.make('station:|slot:/' + prop).get({ lease: true });
        })
        .then((s) => {
          stooges = s;
        });
    }

    function removeStoogesComponent() {
      return baja.Ord.make('station:|slot:').get({ lease: true })
        .then(function (station) {
          return station.remove({ slot: stooges.getName() });
        });
    }

    function initializeWidget() {
      widget = new Js1Widget();
      elem = $('<div/>');

      return widget.initialize(elem);
    }

    beforeEach(() => {
      //for each spec, we want an initialized widget, and a mounted
      //component to work with.
      //the use of promiseUtils in allSpecs.js gets us some custom matcher
      //functions and the ability to simply return a Promise from
      //beforeEach()/afterEach()/it() to do an async test.
      return Promise.all([
        addStoogesComponent(),
        initializeWidget()
      ])
        .then(() => widget.load(stooges));
    });
    
    afterEach(() => {
      //after each spec, we clean up after ourselves.
      return removeStoogesComponent();
    });

    describe('#doInitialize()', () => {
      it('creates the structure to load buttons into', () => {
        expect(elem.find('.Js1Widget-header').length).toBe(1);
        expect(elem.find('.Js1Widget-content').length).toBe(1);
      });

      it('arms a handler to set active class on button click', () => {
        var contentDom = elem.find('.Js1Widget-content'),
            button = $('<button></button>');

        button.appendTo(contentDom).click();
        expect(button).toHaveClass('active');
      });

      it("removes active class from other buttons when one is clicked", () => {
        const contentDom = elem.find('.Js1Widget-content');
        const button1 = $('<button></button>').appendTo(contentDom);
        const button2 = $('<button></button>').appendTo(contentDom);
        const button3 = $('<button></button>').appendTo(contentDom);

        button1.click();
        expect(button1).toHaveClass('active');

        button2.click();
        expect(button1).not.toHaveClass('active');
        expect(button2).toHaveClass('active');

        button3.click();
        expect(button3).toHaveClass('active');
        expect(contentDom.find('button.active').length).toBe(1);
      });

      it('arms a handler to display selected slot name', () => {
        return widget.load(stooges)
          .then(function () {
            const slotDom = elem.find('.Js1Widget-selected-slot');
            const contentDom = elem.find('.Js1Widget-content');
            const button = contentDom.find('[data-slot=larry]');
            button.click();

            return waitForTrue(() => slotDom.text() === 'larry', 'slot name to match the expected name');
          });
      });
    });

    describe('#doLoad()', () => {
      it('creates a button for each slot', () => {
        const slots = stooges.getSlots().toArray();
        const buttons = elem.find('button');

        expect(buttons.length).toBe(slots.length);
        buttons.each((i, elem) => {
          expect($(elem).data('slot')).toBe(slots[i].getName());
        });
      });

      it("updates buttons when component adds slots", () => {
        return stooges.add({ slot: 'shemp', value: true })
          .then(() => {
            return waitForTrue(() => {
              const buttons = elem.find('button');
              return buttons.eq(3).data('slot') === 'shemp';
            });
          });
      });
    });

    describe('#getSelectedSlotName()', () => {
      beforeEach(() => {
        return widget.load(stooges);
      });

      it('returns the value of the currently active button', () => {
        elem.find('button:contains(curly)').addClass('active');
        expect(widget.getSelectedSlotName()).toBe('curly');
      });

      it('returns undefined if no button selected', () => {
        expect(widget.getSelectedSlotName()).toBe(undefined);
      });
    });
  });
});


