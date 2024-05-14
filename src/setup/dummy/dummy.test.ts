import {describe, expect, test} from '@jest/globals';
import {sum} from './dummy';

describe('Test Case Dummy', () => {
  test('Test Case 1+2', () => {
    expect(sum(1, 2)).toBe(3);
  });
});