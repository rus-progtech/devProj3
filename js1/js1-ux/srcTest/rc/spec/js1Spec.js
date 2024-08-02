define([ 'nmodule/js1/rc/js1' ], function (js1) {
  'use strict';

  describe("nmodule/js1/rc/js1", () => {
    it("can extol its own virtues", () => {
      expect(js1.extolVirtues()).toBe('js1 is great!');
    });
  });
});
