package com.hust.baseweb.applications.product.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = -49728835L;

    public static final QCategory category = new QCategory("category");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final BooleanPath deleted = createBoolean("deleted");

    public final StringPath description = createString("description");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final StringPath name = createString("name");

    public final ListPath<com.hust.baseweb.applications.supplier.entity.Supplier, com.hust.baseweb.applications.supplier.entity.QSupplier> suppliers = this.<com.hust.baseweb.applications.supplier.entity.Supplier, com.hust.baseweb.applications.supplier.entity.QSupplier>createList("suppliers", com.hust.baseweb.applications.supplier.entity.Supplier.class, com.hust.baseweb.applications.supplier.entity.QSupplier.class, PathInits.DIRECT2);

    public QCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}

