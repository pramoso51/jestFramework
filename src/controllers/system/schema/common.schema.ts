import { TestConfiguration } from '../../../common/common.schema';

export enum DataItemType {
  dummy = 'dummy',
}
export interface DummyInputFiles {
  dummy: string,
}

export interface SystemTestConfiguration extends TestConfiguration {
  testInputFiles: DummyInputFiles
}