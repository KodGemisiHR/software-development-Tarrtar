/*
 * Copyright (C) 10, 2015 Kod Gemisi Ltd. <foss@kodgemisi.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kodgemisi.web.sample.repository;

import com.kodgemisi.web.sample.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDao extends GenericDao<Item> {

}
