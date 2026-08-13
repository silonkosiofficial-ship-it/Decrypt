.class public abstract Lcom/google/android/gms/internal/ads/Jv0;
.super Lcom/google/android/gms/internal/ads/Ou0;
.source "SourceFile"


# static fields
.field private static final zza:I = -0x80000000

.field private static final zzb:I = 0x7fffffff

.field private static zzc:Ljava/util/Map; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/google/android/gms/internal/ads/Jv0;",
            ">;"
        }
    .end annotation
.end field

.field static final zzr:I = 0x7fffffff

.field static final zzs:I


# instance fields
.field private zzd:I

.field protected zzt:Lcom/google/android/gms/internal/ads/Mw0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/Jv0;->zzc:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Ou0;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    invoke-static {}, Lcom/google/android/gms/internal/ads/Mw0;->c()Lcom/google/android/gms/internal/ads/Mw0;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzt:Lcom/google/android/gms/internal/ads/Mw0;

    return-void
.end method

.method protected static A(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/xw0;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/xw0;-><init>(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected static F(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Jv0;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jv0;->E()V

    sget-object v0, Lcom/google/android/gms/internal/ads/Jv0;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method static I(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Jv0;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

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

    sget-object v0, Lcom/google/android/gms/internal/ads/Jv0;->zzc:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

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

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Sw0;->o(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->J()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/ads/Jv0;->zzc:Ljava/util/Map;

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

.method protected static L(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/xv0;->c:Lcom/google/android/gms/internal/ads/xv0;

    sget v0, Lcom/google/android/gms/internal/ads/vw0;->d:I

    sget-object v0, Lcom/google/android/gms/internal/ads/xv0;->c:Lcom/google/android/gms/internal/ads/xv0;

    invoke-static {p0, p1, v0}, Lcom/google/android/gms/internal/ads/Jv0;->N(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Jv0;->X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;

    return-object p0
.end method

.method protected static M(Lcom/google/android/gms/internal/ads/Jv0;[B)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 3

    array-length v0, p1

    sget-object v1, Lcom/google/android/gms/internal/ads/xv0;->c:Lcom/google/android/gms/internal/ads/xv0;

    sget v1, Lcom/google/android/gms/internal/ads/vw0;->d:I

    sget-object v1, Lcom/google/android/gms/internal/ads/xv0;->c:Lcom/google/android/gms/internal/ads/xv0;

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/Jv0;->Z(Lcom/google/android/gms/internal/ads/Jv0;[BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Jv0;->X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;

    return-object p0
.end method

.method protected static N(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Jv0;->Y(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Jv0;->X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;

    return-object p0
.end method

.method protected static O(Lcom/google/android/gms/internal/ads/Jv0;Ljava/io/InputStream;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    const/16 v0, 0x1000

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/kv0;->e(Ljava/io/InputStream;I)Lcom/google/android/gms/internal/ads/kv0;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Jv0;->R(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/kv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Jv0;->X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;

    return-object p0
.end method

.method protected static Q(Lcom/google/android/gms/internal/ads/Jv0;[BLcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Lcom/google/android/gms/internal/ads/Jv0;->Z(Lcom/google/android/gms/internal/ads/Jv0;[BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Jv0;->X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;

    return-object p0
.end method

.method static R(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/kv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->K()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/lv0;->T(Lcom/google/android/gms/internal/ads/kv0;)Lcom/google/android/gms/internal/ads/lv0;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/Ew0;->j(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/yw0;Lcom/google/android/gms/internal/ads/xv0;)V

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Ew0;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/ads/Kw0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_2

    :catch_3
    move-exception p0

    goto :goto_3

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/ads/Vv0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Vv0;

    throw p0

    :cond_0
    throw p0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/ads/Vv0;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Vv0;

    throw p0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/Vv0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/io/IOException;)V

    throw p1

    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Kw0;->a()Lcom/google/android/gms/internal/ads/Vv0;

    move-result-object p0

    throw p0

    :goto_3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vv0;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/Vv0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/io/IOException;)V

    throw p1

    :cond_2
    throw p0
.end method

.method private S(Lcom/google/android/gms/internal/ads/Ew0;)I
    .locals 1

    .prologue
    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object p1

    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/Ew0;->b(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Lcom/google/android/gms/internal/ads/Ew0;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method private static X(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    .prologue
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->h()Lcom/google/android/gms/internal/ads/Kw0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Kw0;->a()Lcom/google/android/gms/internal/ads/Vv0;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method private static Y(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/fv0;->E()Lcom/google/android/gms/internal/ads/kv0;

    move-result-object p1

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Jv0;->R(Lcom/google/android/gms/internal/ads/Jv0;Lcom/google/android/gms/internal/ads/kv0;Lcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/kv0;->z(I)V

    return-object p0
.end method

.method private static Z(Lcom/google/android/gms/internal/ads/Jv0;[BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Jv0;
    .locals 7

    .prologue
    if-nez p3, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->K()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v6

    add-int v4, p2, p3

    new-instance v5, Lcom/google/android/gms/internal/ads/Su0;

    invoke-direct {v5, p4}, Lcom/google/android/gms/internal/ads/Su0;-><init>(Lcom/google/android/gms/internal/ads/xv0;)V

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/Ew0;->h(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/Su0;)V

    invoke-interface {v6, p0}, Lcom/google/android/gms/internal/ads/Ew0;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/android/gms/internal/ads/Kw0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_3

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    goto :goto_2

    :catch_3
    new-instance p0, Lcom/google/android/gms/internal/ads/Vv0;

    const-string p1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/lang/String;)V

    throw p0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/ads/Vv0;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/Vv0;

    throw p0

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/Vv0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/io/IOException;)V

    throw p1

    :goto_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Kw0;->a()Lcom/google/android/gms/internal/ads/Vv0;

    move-result-object p0

    throw p0

    :goto_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vv0;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/Vv0;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/io/IOException;)V

    throw p1

    :cond_2
    throw p0
.end method

.method private static final a0(Lcom/google/android/gms/internal/ads/Jv0;Z)Z
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->C:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Ew0;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    if-eq v2, v0, :cond_2

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p0

    :goto_0
    sget-object v2, Lcom/google/android/gms/internal/ads/Iv0;->D:Lcom/google/android/gms/internal/ads/Iv0;

    invoke-virtual {p0, v2, p1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method protected static q()Lcom/google/android/gms/internal/ads/Ov0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Kv0;->g()Lcom/google/android/gms/internal/ads/Kv0;

    move-result-object v0

    return-object v0
.end method

.method protected static r(Lcom/google/android/gms/internal/ads/Ov0;)Lcom/google/android/gms/internal/ads/Ov0;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v0

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/Ov0;->L(I)Lcom/google/android/gms/internal/ads/Ov0;

    move-result-object p0

    return-object p0
.end method

.method protected static t()Lcom/google/android/gms/internal/ads/Rv0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/bw0;->n()Lcom/google/android/gms/internal/ads/bw0;

    move-result-object v0

    return-object v0
.end method

.method protected static u(Lcom/google/android/gms/internal/ads/Rv0;)Lcom/google/android/gms/internal/ads/Rv0;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v0

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/Rv0;->F(I)Lcom/google/android/gms/internal/ads/Rv0;

    move-result-object p0

    return-object p0
.end method

.method protected static v()Lcom/google/android/gms/internal/ads/Sv0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ww0;->e()Lcom/google/android/gms/internal/ads/ww0;

    move-result-object v0

    return-object v0
.end method

.method protected static w(Lcom/google/android/gms/internal/ads/Sv0;)Lcom/google/android/gms/internal/ads/Sv0;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, v0

    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/Sv0;->k(I)Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object p0

    return-object p0
.end method

.method static varargs z(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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
.method B()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/Ou0;->zzq:I

    return-void
.end method

.method C()V
    .locals 1

    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Ou0;->j(I)V

    return-void
.end method

.method protected D()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Ew0;->a(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->E()V

    return-void
.end method

.method E()V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    return-void
.end method

.method public final G()Lcom/google/android/gms/internal/ads/Fv0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->G:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Fv0;

    return-object v0
.end method

.method public final H()Lcom/google/android/gms/internal/ads/Fv0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->G:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Fv0;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Fv0;->r(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Fv0;

    return-object v0
.end method

.method public final J()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->H:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0
.end method

.method K()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->F:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0
.end method

.method public final P()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/Jv0;->a0(Lcom/google/android/gms/internal/ads/Jv0;Z)Z

    move-result v0

    return v0
.end method

.method T(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Ou0;->zzq:I

    return-void
.end method

.method U()Z
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->o()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method V()Z
    .locals 2

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected abstract W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public bridge synthetic a()Lcom/google/android/gms/internal/ads/mw0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->J()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/google/android/gms/internal/ads/lw0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->G()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Ou0;->f(Lcom/google/android/gms/internal/ads/Ew0;)I

    move-result v0

    return v0
.end method

.method public d(Lcom/google/android/gms/internal/ads/rv0;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/sv0;->a(Lcom/google/android/gms/internal/ads/rv0;)Lcom/google/android/gms/internal/ads/sv0;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Ew0;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/Yw0;)V

    return-void
.end method

.method e()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    return v0
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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/ads/Jv0;

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Ew0;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method f(Lcom/google/android/gms/internal/ads/Ew0;)I
    .locals 3

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->V()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->S(Lcom/google/android/gms/internal/ads/Ew0;)I

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
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->e()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Ou0;->e()I

    move-result p1

    return p1

    :cond_2
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->S(Lcom/google/android/gms/internal/ads/Ew0;)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/Ou0;->j(I)V

    return p1
.end method

.method public hashCode()I
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->V()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->n()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->U()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->n()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/Jv0;->T(I)V

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jv0;->o()I

    move-result v0

    return v0
.end method

.method j(I)V
    .locals 3

    .prologue
    if-ltz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Jv0;->zzd:I

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

.method n()I
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/google/android/gms/internal/ads/Ew0;->c(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/Ou0;->zzq:I

    return v0
.end method

.method protected final p()Lcom/google/android/gms/internal/ads/Fv0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->G:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Fv0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ads/ow0;->a(Lcom/google/android/gms/internal/ads/mw0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x()Lcom/google/android/gms/internal/ads/tw0;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->I:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/tw0;

    return-object v0
.end method

.method y()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/Iv0;->E:Lcom/google/android/gms/internal/ads/Iv0;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/Jv0;->W(Lcom/google/android/gms/internal/ads/Iv0;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
