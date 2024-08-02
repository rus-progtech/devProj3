

/** @jsx spandrel.jsx */

/**
 * A module defining `Js2Widget`.
 *
 * @module nmodule/js2/rc/Js2Widget
 */
define([
  'bajaux/spandrel',
  'bajaux/mixin/subscriberMixIn',
  'jquery',
  'Promise' ], function (
  spandrel,
  subscriberMixIn,
  $,
  Promise) {

  'use strict';

  const SELECTED_CLASS = 'active';
  const BUTTON_CLASS = 'Js2Widget-button';

  const TITLE_TEXT = 'These are the slots on your component.';
  const SELECTED_SLOT_TEXT = "You've selected slot: ";
  const widgetDefaults = () => ({
    properties: { selectedSlot: ' ' }
  });

  /**
   * A demonstration Widget. This builds a list of buttons from the slots of a
   * Complex value, allowing the user to select a slot.
   *
   * @class
   * @extends module:nmodule/webEditors/rc/fe/baja/BaseEditor
   * @alias module:nmodule/js2/rc/Js2Widget
   */
  class Js2Widget extends spandrel((comp, { properties }) => {
    const { selectedSlot } = properties;
    return <div class="Js2Widget">
      <div class="Js2Widget-header">
        <p>{ TITLE_TEXT }</p>
        <p>
          <span className="Js2Widget-selected-slot-text">{ SELECTED_SLOT_TEXT }</span>
          <span className="Js2Widget-selected-slot">{ selectedSlot }</span>
        </p>
      </div>
      <div class="Js2Widget-content">
        <div className="Js2Widget-button-container">
          { comp.getSlots().toArray().map((slot) => (
            <button className="Js2Widget-button" type="button" data-slot={ slot.getName() }>
              { comp.getDisplayName(slot) }
            </button>
          )) }
        </div>
      </div>
    </div>;
  }) {
    constructor(params) {
      super({ params, defaults: widgetDefaults() });
      subscriberMixIn(this);
      this.getSubscriber().attach('added removed renamed', () => this.rerender());
    }

    /**
     * Arm event handlers for the Widget.
     *
     * @param {jQuery} element the DOM element into which to load this widget
     */
    doInitialize(dom) {
      dom.on('click', '.Js2Widget-content button', (e) => {
        const target = $(e.target);
        target.siblings().removeClass(SELECTED_CLASS);
        target.addClass(SELECTED_CLASS);
        this.$updateSlotText();
        this.setModified(true);
      });
    }

    /**
     * @returns {string} the name of the currently selected slot
     */
    getSelectedSlotName() {
      const selectedButton = this.jq().find(
        '.Js2Widget-content .' + BUTTON_CLASS + '.' + SELECTED_CLASS);

      return selectedButton.data('slot');
    }

    /**
     * Reads the currently selected slot and update the display accordingly.
     *
     * @private
     */
    $updateSlotText() {
      const selectedSlot = this.getSelectedSlotName();
      this.properties().setValue('selectedSlot', selectedSlot);
    }
  }

  return Js2Widget;
});
