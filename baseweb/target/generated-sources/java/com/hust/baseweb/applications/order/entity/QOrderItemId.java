package com.hust.baseweb.applications.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItemId is a Querydsl query type for OrderItemId
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QOrderItemId extends BeanPath<OrderItemId> {

    private static final long serialVersionUID = 621233374L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemId orderItemId = new QOrderItemId("orderItemId");

    public final QOrders order;

    public final com.hust.baseweb.applications.product.entity.QProduct product;

    public QOrderItemId(String variable) {
        this(OrderItemId.class, forVariable(variable), INITS);
    }

    public QOrderItemId(Path<? extends OrderItemId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItemId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItemId(PathMetadata metadata, PathInits inits) {
        this(OrderItemId.class, metadata, inits);
    }

    public QOrderItemId(Class<? extends OrderItemId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrders(forProperty("order"), inits.get("order")) : null;
        this.product = inits.isInitialized("product") ? new com.hust.baseweb.applications.product.entity.QProduct(forProperty("product"), inits.get("product")) : null;
    }

}

