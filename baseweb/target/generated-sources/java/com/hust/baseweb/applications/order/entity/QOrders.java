package com.hust.baseweb.applications.order.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrders is a Querydsl query type for Orders
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrders extends EntityPathBase<Orders> {

    private static final long serialVersionUID = 825046339L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrders orders = new QOrders("orders");

    public final StringPath code = createString("code");

    public final DateTimePath<java.util.Date> createdStamp = createDateTime("createdStamp", java.util.Date.class);

    public final BooleanPath deleted = createBoolean("deleted");

    public final NumberPath<Long> discount = createNumber("discount", Long.class);

    public final DatePath<java.time.LocalDate> expDeliveryDate = createDate("expDeliveryDate", java.time.LocalDate.class);

    public final ComparablePath<java.util.UUID> id = createComparable("id", java.util.UUID.class);

    public final DateTimePath<java.util.Date> lastUpdatedStamp = createDateTime("lastUpdatedStamp", java.util.Date.class);

    public final StringPath note = createString("note");

    public final EnumPath<com.hust.baseweb.applications.order.constant.PaymentMethod> paymentMethod = createEnum("paymentMethod", com.hust.baseweb.applications.order.constant.PaymentMethod.class);

    public final NumberPath<Integer> quantity = createNumber("quantity", Integer.class);

    public final EnumPath<com.hust.baseweb.applications.order.constant.OrderStatus> status = createEnum("status", com.hust.baseweb.applications.order.constant.OrderStatus.class);

    public final com.hust.baseweb.applications.supplier.entity.QSupplier supplier;

    public final NumberPath<Long> totalPayment = createNumber("totalPayment", Long.class);

    public QOrders(String variable) {
        this(Orders.class, forVariable(variable), INITS);
    }

    public QOrders(Path<? extends Orders> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrders(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrders(PathMetadata metadata, PathInits inits) {
        this(Orders.class, metadata, inits);
    }

    public QOrders(Class<? extends Orders> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.supplier = inits.isInitialized("supplier") ? new com.hust.baseweb.applications.supplier.entity.QSupplier(forProperty("supplier")) : null;
    }

}

