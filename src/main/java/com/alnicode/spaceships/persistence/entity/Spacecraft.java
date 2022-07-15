package com.alnicode.spaceships.persistence.entity;

import com.alnicode.spaceships.constants.SpacecraftConstants;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

}
