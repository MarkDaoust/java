/* Copyright 2018 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.data;

import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.PrimitiveOp;
import org.tensorflow.op.Scope;
import org.tensorflow.types.family.TType;

/**
 */
public final class UnwrapDatasetVariant extends PrimitiveOp implements Operand<TType> {
  
  /**
   * Factory method to create a class wrapping a new UnwrapDatasetVariant operation.
   * 
   * @param scope current scope
   * @param inputHandle 
   * @return a new instance of UnwrapDatasetVariant
   */
  public static UnwrapDatasetVariant create(Scope scope, Operand<?> inputHandle) {
    OperationBuilder opBuilder = scope.env().opBuilder("UnwrapDatasetVariant", scope.makeOpName("UnwrapDatasetVariant"));
    opBuilder.addInput(inputHandle.asOutput());
    opBuilder = scope.applyControlDependencies(opBuilder);
    return new UnwrapDatasetVariant(opBuilder.build());
  }
  
  /**
   */
  public Output<?> outputHandle() {
    return outputHandle;
  }
  
  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) outputHandle;
  }
  
  private Output<?> outputHandle;
  
  private UnwrapDatasetVariant(Operation operation) {
    super(operation);
    int outputIdx = 0;
    outputHandle = operation.output(outputIdx++);
  }
}