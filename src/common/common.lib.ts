const idSuffxLabel: string = 'IDSUFFIX';

export const replaceRegex: RegExp = new RegExp(idSuffxLabel, 'g');

export const dateStampString: string = Date.now().toString();

export function getTestData(testInputArray: any[], testCaseId: string): any[] {
  const testInput: any = testInputArray.find(
    (testInputItem:any) => (testInputItem.testCaseId === testCaseId && testInputItem.enabled),
  )!;

  let testData: any[] = [];
  if (testInput && testInput.testData.length > 0) {
    testData = testInput.testData;
  }
  return testData;
}