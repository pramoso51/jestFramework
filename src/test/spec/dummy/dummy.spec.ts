import * as commonSchema from '../../../common/common.schema';
import * as commondLib from '../../../common/common.lib';
import * as dummyLibrary from '../../../controllers/system/libraries/dummy.lib';
import * as dummySchema from '../../../controllers/system/schema/dummy.schema';
import { SystemApi } from '../../../controllers/system/system.api';

const systemController: SystemApi = new SystemApi();
const currentTc: string = 'TC-00';

const dummyTestInput: dummySchema.DummyTestCaseData[]  = commondLib.getTestData(dummyLibrary.dummyTestInput, currentTc);

if (dummyTestInput.length > 0) {
  describe.each(dummyTestInput)('CASOS', (currentData: dummySchema.DummyTestCaseData) => {
    describe('Dummy Test Cases', () => {
      it(`${currentData.title}`, () => {
        expect(1).toEqual(1);
      });
    });
  });
}
