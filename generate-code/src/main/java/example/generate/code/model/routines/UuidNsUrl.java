/*
 * This file is generated by jOOQ.
 */
package example.generate.code.model.routines;


import example.generate.code.model.Public;

import java.util.UUID;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UuidNsUrl extends AbstractRoutine<UUID> {

    private static final long serialVersionUID = 443669443;

    /**
     * The parameter <code>public.uuid_ns_url.RETURN_VALUE</code>.
     */
    public static final Parameter<UUID> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.UUID, false, false);

    /**
     * Create a new routine call instance
     */
    public UuidNsUrl() {
        super("uuid_ns_url", Public.PUBLIC, SQLDataType.UUID);

        setReturnParameter(RETURN_VALUE);
    }
}
