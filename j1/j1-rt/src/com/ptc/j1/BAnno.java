package com.ptc.j1;

import javax.baja.nre.annotations.*;
import javax.baja.sys.BComponent;
import javax.baja.sys.BFacets;
import javax.baja.sys.Flags;

@NiagaraType
@NiagaraProperty(
        name = "timeDelay",
        type = "baja:RelTime",
        defaultValue = "BRelTime.makeHours(1)",
        facets = {
                @Facet(name = BFacets.MIN, value = "BRelTime.makeSeconds(0)")
        }
)
@NiagaraAction(
        name = "doIt",
        returnType = "baja:Ord"
)
@NiagaraTopic(
        name = "done",
        flags = Flags.HIDDEN
)

public class BAnno
        extends BComponent {
}
