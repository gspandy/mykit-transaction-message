/**
 * Copyright 2020-9999 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mykit.transaction.message.core.service;

import io.mykit.transaction.message.common.bean.context.MykitTransactionMessageContext;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author binghe
 * @version 1.0.0
 * @description MykitTransactionAspectService
 */
@FunctionalInterface
public interface MykitTransactionAspectService {

    /**
     * myth aspect.
     *
     * @param mykitTransactionMessageContext {@linkplain MykitTransactionMessageContext}
     * @param point                  cut point.
     * @return object
     * @throws Throwable ex
     */
    Object invoke(MykitTransactionMessageContext mykitTransactionMessageContext, ProceedingJoinPoint point) throws Throwable;
}
