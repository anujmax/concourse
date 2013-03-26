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
package com.cinchapi.concourse.db;

import java.util.Iterator;

/**
 * An service whose writes can be flushed by a {@link FlushingService}.
 * 
 * @author jnelson
 */
public interface FlushableService {

	/**
	 * Return an iterator over the writes in the service.
	 * 
	 * @return the flusher
	 */
	public Iterator<Write> flusher();

}
