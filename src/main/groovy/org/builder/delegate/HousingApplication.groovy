package org.builder.delegate

import org.builder.model.Door
import org.builder.model.House

class HousingApplication {

    static void main(String[] args) {
        Door door = DoorBuilder.builder()
                .withDoorKnobType("Lever")
                .build()

        println "Door with door knob type = " + door.doorKnobType

        House house = org.builder.trait.HouseBuilder.builder()
//                .withDoorKnobType("Lever")
//                .withRoofType("Gable")
                .build()

        println "House with door knob type = " + house.door.doorKnobType + "and roof Type = " + house.roof.type

    }

}

