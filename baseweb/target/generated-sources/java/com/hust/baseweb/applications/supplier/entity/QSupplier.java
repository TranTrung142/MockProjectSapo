package com.hust.baseweb.applications.supplier.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSupplier is a Querydsl query type for Supplier
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSupplier extends EntityPathBase<Supplier> {

    private static final long serialVersionUID = 1146049250L;

    public static final QSupplier supplier = new QSupplier("supplier");

    public final StringPath address = createString("address");

    public final ListPath<com.hust.baseweb.applications.product.entity.Category, com.hust.baseweb.applications.product.entity.QCategory> categories = this.<com.hust.baseweb.applications.product.entity.Category, com.hust.baseweb.applications.product.entity.QCategory>createList("categories", com.hust.baseweb.applications.product.entity.Category.class, com.hust.baseweb.applications.product.entity.QCategory.class, PathInits.DIRECT2);

    public final StringPath code = createString("code");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final BooleanPath deleted = createBoolean("deleted");

    public final StringPath email = createString("email");

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final StringPath name = createString("name");

    public final ListPath<com.hust.baseweb.applications.order.entity.Orders, com.hust.baseweb.applications.order.entity.QOrders> orders = this.<com.hust.baseweb.applications.order.entity.Orders, com.hust.baseweb.applications.order.entity.QOrders>createList("orders", com.hust.baseweb.applications.order.entity.Orders.class, com.hust.baseweb.applications.order.entity.QOrders.class, PathInits.DIRECT2);

    public final StringPath phoneNumber = createString("phoneNumber");

    public QSupplier(String variable) {
        super(Supplier.class, forVariable(variable));
    }

    public QSupplier(Path<? extends Supplier> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSupplier(PathMetadata metadata) {
        super(Supplier.class, metadata);
    }

}

