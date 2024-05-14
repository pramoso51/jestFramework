import * as commonSchema from '../../../common/common.schema';

export interface DummyTestInput extends commonSchema.TestInput {
  testData: DummyGetData[] | DummyTestCaseData[]
}

export interface DummyGetData {
  name: string
}

export interface DummyTestCaseData {
  title: string
}