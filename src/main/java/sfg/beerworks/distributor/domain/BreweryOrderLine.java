/*
 *  Copyright 2019 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package sfg.beerworks.distributor.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class BreweryOrderLine extends BaseEntity {

    @Builder
    public BreweryOrderLine(String id, Long version, LocalDateTime createdDate, LocalDateTime lastModifiedDate,
                            Beer beer, Integer orderQuantity) {
        super(id, version, createdDate, lastModifiedDate);
        this.beer = beer;
        this.orderQuantity = orderQuantity;
    }


    @DBRef
    private Beer beer;

    private Integer orderQuantity = 0;
}
