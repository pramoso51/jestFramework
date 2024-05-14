import * as fs from 'fs';
import * as commondLib from '../../../common/common.lib';
import * as systemCommonLib from './common.lib';
import * as dummySchema from '../schema/dummy.schema';

export const dummyTestInput: dummySchema.DummyTestInput[] = JSON.parse(
  fs.readFileSync(systemCommonLib.systemTestConfiguration.testInputFiles.dummy, 'utf-8',
  ).replace(commondLib.replaceRegex, commondLib.dateStampString));
