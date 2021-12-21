package com.jd.tests


import com.jd.models.Artist
import org.specs2.Specification
import org.specs2.specification.Tables

class ArtistSpec2DataTablesTest extends Specification with Tables{def is = s2"""

 Artist life time Achievement Award  ${
  // the header of the table, with `|` separated strings (`>` executes the table)
  "firstName"   | "lastName" | "noOfAwards" | "birthYear" |>
    "AR"    !  "Rahman"  !  100  ! 1954  |                   // an example row
    "Udit"    !  "Narayan"  !  200  ! 1974  |                 // another example row
    { (firstName, lastName, noOfAwards,birthYear) => new Artist(firstName,lastName,noOfAwards,birthYear).validateData() must_== true}      // the expectation to check on each row
}
"""

}
