package com.jd.tests

import com.jd.models.Artist
import org.specs2.mutable._
import java.time.Year

class ArtistSpec2Test extends Specification {
  var artist:Artist=_
  "Artist Life Time Achievement Award" >> {
    "Where Number of Awards must be greater than 20" >> {
      artist = new Artist("AR","Rahman",100,1954)
      artist.noOfAwards should be_>(20)
    }
    "Where Age must be greater than 60" >> {
      (Year.now.getValue - artist.birthYear) should be_>(60)
    }
  }
}
