/*
 * This file is generated by jOOQ.
*/
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.JoinlistRecord;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Joinlist extends TableImpl<JoinlistRecord> {

    private static final long serialVersionUID = 199488850;

    /**
     * The reference instance of <code>public.joinlist</code>
     */
    public static final Joinlist JOINLIST = new Joinlist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JoinlistRecord> getRecordType() {
        return JoinlistRecord.class;
    }

    /**
     * The column <code>public.joinlist.id</code>.
     */
    public final TableField<JoinlistRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('joinlist_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.joinlist.userid</code>.
     */
    public final TableField<JoinlistRecord, String> USERID = createField("userid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.joinlist.guildid</code>.
     */
    public final TableField<JoinlistRecord, String> GUILDID = createField("guildid", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.joinlist.jointime</code>.
     */
    public final TableField<JoinlistRecord, Long> JOINTIME = createField("jointime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.joinlist.allowtime</code>.
     */
    public final TableField<JoinlistRecord, Long> ALLOWTIME = createField("allowtime", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.joinlist.allowed</code>.
     */
    public final TableField<JoinlistRecord, Boolean> ALLOWED = createField("allowed", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>public.joinlist</code> table reference
     */
    public Joinlist() {
        this("joinlist", null);
    }

    /**
     * Create an aliased <code>public.joinlist</code> table reference
     */
    public Joinlist(String alias) {
        this(alias, JOINLIST);
    }

    private Joinlist(String alias, Table<JoinlistRecord> aliased) {
        this(alias, aliased, null);
    }

    private Joinlist(String alias, Table<JoinlistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JoinlistRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOINLIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JoinlistRecord> getPrimaryKey() {
        return Keys.JOINLIST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JoinlistRecord>> getKeys() {
        return Arrays.<UniqueKey<JoinlistRecord>>asList(Keys.JOINLIST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Joinlist as(String alias) {
        return new Joinlist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Joinlist rename(String name) {
        return new Joinlist(name, null);
    }
}