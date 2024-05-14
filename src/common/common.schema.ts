export enum HttpMethod {
  connect = 'CONNECT',
  delete = 'DELETE',
  get = 'GET',
  head = 'HEAD',
  options = 'OPTIONS',
  patch = 'PATCH',
  post = 'POST',
  put = 'PUT',
  trace = 'trace',
}

export interface TestInput {
  api: string,
  component: string,
  testCaseId: string,
  enabled: boolean,
  testData: any[]
}

export interface TestConfiguration {
  apiUrl: string
}