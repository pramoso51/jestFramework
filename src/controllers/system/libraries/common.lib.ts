import * as fs from 'fs';
import { SystemTestConfiguration } from '../schema/common.schema';

export const systemTestConfiguration: SystemTestConfiguration = JSON.parse(fs.readFileSync(`${process.env.TESTCONFIG}`, 'utf-8'));