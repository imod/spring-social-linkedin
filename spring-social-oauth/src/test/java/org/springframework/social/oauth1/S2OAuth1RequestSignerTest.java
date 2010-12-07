/*
 * Copyright 2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.oauth1;


/**
 * @author Craig Walls
 */
public class S2OAuth1RequestSignerTest extends AbstractOAuth1RequestSignerTest {
	public OAuth1ClientRequestSigner getSigner() {
		return new S2OAuth1RequestSigner("API_KEY", "API_SECRET", "TOKEN_VALUE", "TOKEN_SECRET");
	}
}
