package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.SpacecraftConstants;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The spacecraft entity abstract model.
 *
 */
@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public class Spacecraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = SpacecraftConstants.WEIGHT_LENGTH)
    private String weight;

    @Column(nullable = false, length = SpacecraftConstants.HEIGHT_LENGTH)
    private String height;

    @Column(nullable = false, length = SpacecraftConstants.MISSION_LENGTH)
    private String mission;

    @Column(nullable = false, length = SpacecraftConstants.FUEL_LENGTH)
    private String fuel;

    @Column(nullable = false, length = SpacecraftConstants.STATE_LENGTH)
    private String state;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Inventory inventory;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spacecraft that = (Spacecraft) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
