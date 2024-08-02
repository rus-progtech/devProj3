define([ 'nmodule/js2/rc/js2' ], function (js2) {
  'use strict';

  describe("nmodule/js2/rc/js2", () => {
    it("can extol its own virtues", () => {
      expect(js2.extolVirtues()).toBe('js2 is great!');
    });
  });
});
