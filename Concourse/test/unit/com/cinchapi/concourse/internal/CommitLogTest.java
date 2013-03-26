/*
 * This project is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * This project is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this project. If not, see <http://www.gnu.org/licenses/>.
 */
package com.cinchapi.concourse.internal;

import org.junit.Test;

import com.cinchapi.concourse.db.Buffer;
import com.cinchapi.concourse.internal.ConcourseServiceProvider;
import com.cinchapi.concourse.internal.ConcourseServiceTest;

/**
 * Unit tests for {@link Buffer}.
 * 
 * @author jnelson
 */
public class CommitLogTest extends ConcourseServiceTest {

	@Override
	protected Buffer getService() {
		return ConcourseServiceProvider.provideNewCommitLog();
	}

//	@Test
//	public void testIsFull() {
//		CommitLog service = getService();
//		while (!service.isFull()) {
//			try {
//				service.add(randomColumnName(), randomObject(),
//						randomLong());
//			}
//			catch (IllegalStateException e) {
//				log("{}", e);
//				break;
//			}
//		}
//		assertTrue(service.isFull());
//		assertTrue(service.size() <= ConcourseServiceProvider.COMMIT_LOG_DEFAULT_SIZE_IN_BYTES);
//	}

}
