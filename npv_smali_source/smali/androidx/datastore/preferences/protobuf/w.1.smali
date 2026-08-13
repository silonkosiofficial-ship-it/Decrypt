.class public abstract Landroidx/datastore/preferences/protobuf/w;
.super Landroidx/datastore/preferences/protobuf/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/datastore/preferences/protobuf/w$b;,
        Landroidx/datastore/preferences/protobuf/w$c;,
        Landroidx/datastore/preferences/protobuf/w$a;,
        Landroidx/datastore/preferences/protobuf/w$d;
    }
.end annotation


# static fields
.field private static final MEMOIZED_SERIALIZED_SIZE_MASK:I = 0x7fffffff

.field private static final MUTABLE_FLAG_MASK:I = -0x80000000

.field static final UNINITIALIZED_HASH_CODE:I = 0x0

.field static final UNINITIALIZED_SERIALIZED_SIZE:I = 0x7fffffff

.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Landroidx/datastore/preferences/protobuf/w;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private memoizedSerializedSize:I

.field protected unknownFields:Landroidx/datastore/preferences/protobuf/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Landroidx/datastore/preferences/protobuf/w;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/datastore/preferences/protobuf/a;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    invoke-static {}, Landroidx/datastore/preferences/protobuf/m0;->c()Landroidx/datastore/preferences/protobuf/m0;

    move-result-object v0

    iput-object v0, p0, Landroidx/datastore/preferences/protobuf/w;->unknownFields:Landroidx/datastore/preferences/protobuf/m0;

    return-void
.end method

.method protected static final A(Landroidx/datastore/preferences/protobuf/w;Z)Z
    .locals 2

    .prologue
    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->C:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/e0;->d(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Landroidx/datastore/preferences/protobuf/w$d;->D:Landroidx/datastore/preferences/protobuf/w$d;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Landroidx/datastore/preferences/protobuf/w;->q(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static E(Landroidx/datastore/preferences/protobuf/y$b;)Landroidx/datastore/preferences/protobuf/y$b;
    .locals 1

    .prologue
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Landroidx/datastore/preferences/protobuf/y$b;->u(I)Landroidx/datastore/preferences/protobuf/y$b;

    move-result-object p0

    return-object p0
.end method

.method protected static G(Landroidx/datastore/preferences/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/c0;

    invoke-direct {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/c0;-><init>(Landroidx/datastore/preferences/protobuf/O;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static I(Landroidx/datastore/preferences/protobuf/w;Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/h;->f(Ljava/io/InputStream;)Landroidx/datastore/preferences/protobuf/h;

    move-result-object p1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/o;->b()Landroidx/datastore/preferences/protobuf/o;

    move-result-object v0

    invoke-static {p0, p1, v0}, Landroidx/datastore/preferences/protobuf/w;->J(Landroidx/datastore/preferences/protobuf/w;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/w;

    move-result-object p0

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/w;->j(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w;

    move-result-object p0

    return-object p0
.end method

.method static J(Landroidx/datastore/preferences/protobuf/w;Landroidx/datastore/preferences/protobuf/h;Landroidx/datastore/preferences/protobuf/o;)Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->H()Landroidx/datastore/preferences/protobuf/w;

    move-result-object p0

    :try_start_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/i;->Q(Landroidx/datastore/preferences/protobuf/h;)Landroidx/datastore/preferences/protobuf/i;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Landroidx/datastore/preferences/protobuf/e0;->b(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/d0;Landroidx/datastore/preferences/protobuf/o;)V

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/e0;->c(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/datastore/preferences/protobuf/z; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroidx/datastore/preferences/protobuf/k0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :catch_3
    move-exception p1

    goto :goto_3

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Landroidx/datastore/preferences/protobuf/z;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/z;

    throw p0

    :cond_0
    throw p0

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Landroidx/datastore/preferences/protobuf/z;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Landroidx/datastore/preferences/protobuf/z;

    throw p0

    :cond_1
    new-instance p2, Landroidx/datastore/preferences/protobuf/z;

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/z;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Landroidx/datastore/preferences/protobuf/z;->k(Landroidx/datastore/preferences/protobuf/O;)Landroidx/datastore/preferences/protobuf/z;

    move-result-object p0

    throw p0

    :goto_2
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/k0;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/z;->k(Landroidx/datastore/preferences/protobuf/O;)Landroidx/datastore/preferences/protobuf/z;

    move-result-object p0

    throw p0

    :goto_3
    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/z;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Landroidx/datastore/preferences/protobuf/z;

    invoke-direct {p2, p1}, Landroidx/datastore/preferences/protobuf/z;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/z;->k(Landroidx/datastore/preferences/protobuf/O;)Landroidx/datastore/preferences/protobuf/z;

    move-result-object p0

    throw p0
.end method

.method protected static K(Ljava/lang/Class;Landroidx/datastore/preferences/protobuf/w;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/datastore/preferences/protobuf/w;->D()V

    sget-object v0, Landroidx/datastore/preferences/protobuf/w;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static j(Landroidx/datastore/preferences/protobuf/w;)Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/a;->g()Landroidx/datastore/preferences/protobuf/k0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/k0;->a()Landroidx/datastore/preferences/protobuf/z;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/z;->k(Landroidx/datastore/preferences/protobuf/O;)Landroidx/datastore/preferences/protobuf/z;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method private n(Landroidx/datastore/preferences/protobuf/e0;)I
    .locals 0

    .prologue
    if-nez p1, :cond_0

    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object p1

    invoke-interface {p1, p0}, Landroidx/datastore/preferences/protobuf/e0;->g(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Landroidx/datastore/preferences/protobuf/e0;->g(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method protected static s()Landroidx/datastore/preferences/protobuf/y$b;
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/b0;->f()Landroidx/datastore/preferences/protobuf/b0;

    move-result-object v0

    return-object v0
.end method

.method static t(Ljava/lang/Class;)Landroidx/datastore/preferences/protobuf/w;
    .locals 3

    .prologue
    sget-object v0, Landroidx/datastore/preferences/protobuf/w;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Landroidx/datastore/preferences/protobuf/w;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Landroidx/datastore/preferences/protobuf/p0;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    invoke-virtual {v0}, Landroidx/datastore/preferences/protobuf/w;->u()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Landroidx/datastore/preferences/protobuf/w;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method static varargs y(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method


# virtual methods
.method B()Z
    .locals 2

    .prologue
    iget v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected C()V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/e0;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->D()V

    return-void
.end method

.method D()V
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    return-void
.end method

.method public final F()Landroidx/datastore/preferences/protobuf/w$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->G:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w$a;

    return-object v0
.end method

.method H()Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->F:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    return-object v0
.end method

.method L(I)V
    .locals 0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method M(I)V
    .locals 3

    .prologue
    if-ltz p1, :cond_0

    iget v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    const v1, 0x7fffffff

    and-int/2addr p1, v1

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public bridge synthetic a()Landroidx/datastore/preferences/protobuf/O;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->u()Landroidx/datastore/preferences/protobuf/w;

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->f(Landroidx/datastore/preferences/protobuf/e0;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic c()Landroidx/datastore/preferences/protobuf/O$a;
    .locals 1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->F()Landroidx/datastore/preferences/protobuf/w$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroidx/datastore/preferences/protobuf/j;)V
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-static {p1}, Landroidx/datastore/preferences/protobuf/k;->P(Landroidx/datastore/preferences/protobuf/j;)Landroidx/datastore/preferences/protobuf/k;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/e0;->e(Ljava/lang/Object;Landroidx/datastore/preferences/protobuf/s0;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    check-cast p1, Landroidx/datastore/preferences/protobuf/w;

    invoke-interface {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/e0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method f(Landroidx/datastore/preferences/protobuf/e0;)I
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/w;->n(Landroidx/datastore/preferences/protobuf/e0;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "serialized size must be non-negative, was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->w()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->w()I

    move-result p1

    return p1

    :cond_2
    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/w;->n(Landroidx/datastore/preferences/protobuf/e0;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/w;->M(I)V

    return p1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->B()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->m()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->m()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->L(I)V

    :cond_1
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->v()I

    move-result v0

    return v0
.end method

.method i()Ljava/lang/Object;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->E:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method k()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return-void
.end method

.method l()V
    .locals 1

    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->M(I)V

    return-void
.end method

.method m()I
    .locals 1

    invoke-static {}, Landroidx/datastore/preferences/protobuf/a0;->a()Landroidx/datastore/preferences/protobuf/a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/a0;->d(Ljava/lang/Object;)Landroidx/datastore/preferences/protobuf/e0;

    move-result-object v0

    invoke-interface {v0, p0}, Landroidx/datastore/preferences/protobuf/e0;->i(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final o()Landroidx/datastore/preferences/protobuf/w$a;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->G:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w$a;

    return-object v0
.end method

.method protected p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Landroidx/datastore/preferences/protobuf/w;->r(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected q(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Landroidx/datastore/preferences/protobuf/w;->r(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract r(Landroidx/datastore/preferences/protobuf/w$d;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/Q;->f(Landroidx/datastore/preferences/protobuf/O;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Landroidx/datastore/preferences/protobuf/w;
    .locals 1

    sget-object v0, Landroidx/datastore/preferences/protobuf/w$d;->H:Landroidx/datastore/preferences/protobuf/w$d;

    invoke-virtual {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->p(Landroidx/datastore/preferences/protobuf/w$d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/datastore/preferences/protobuf/w;

    return-object v0
.end method

.method v()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/a;->memoizedHashCode:I

    return v0
.end method

.method w()I
    .locals 2

    iget v0, p0, Landroidx/datastore/preferences/protobuf/w;->memoizedSerializedSize:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
.end method

.method x()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/w;->v()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Landroidx/datastore/preferences/protobuf/w;->A(Landroidx/datastore/preferences/protobuf/w;Z)Z

    move-result v0

    return v0
.end method
