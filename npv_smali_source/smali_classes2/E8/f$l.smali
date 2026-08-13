.class LE8/f$l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE8/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# instance fields
.field private final C:LE8/f;

.field private final D:Ljava/util/concurrent/ConcurrentMap;

.field private final E:Lx7/l;


# direct methods
.method public constructor <init>(LE8/f;Ljava/util/concurrent/ConcurrentMap;Lx7/l;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, LE8/f$l;->e(I)V

    :cond_0
    if-nez p2, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LE8/f$l;->e(I)V

    :cond_1
    if-nez p3, :cond_2

    const/4 v0, 0x2

    invoke-static {v0}, LE8/f$l;->e(I)V

    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE8/f$l;->C:LE8/f;

    iput-object p2, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    iput-object p3, p0, LE8/f$l;->E:Lx7/l;

    return-void
.end method

.method private static synthetic e(I)V
    .locals 9

    .prologue
    const/4 v0, 0x4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v2, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v3, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction"

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq p0, v7, :cond_4

    if-eq p0, v3, :cond_3

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_2

    const-string v8, "storageManager"

    aput-object v8, v4, v6

    goto :goto_2

    :cond_2
    aput-object v5, v4, v6

    goto :goto_2

    :cond_3
    const-string v8, "compute"

    aput-object v8, v4, v6

    goto :goto_2

    :cond_4
    const-string v8, "map"

    aput-object v8, v4, v6

    :goto_2
    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_5

    aput-object v5, v4, v7

    goto :goto_3

    :cond_5
    const-string v5, "raceCondition"

    aput-object v5, v4, v7

    goto :goto_3

    :cond_6
    const-string v5, "recursionDetected"

    aput-object v5, v4, v7

    :goto_3
    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    const-string v5, "<init>"

    aput-object v5, v4, v3

    :cond_7
    invoke-static {v2, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0
.end method

.method private f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;
    .locals 3

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Inconsistent key detected. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, LE8/f$n;->D:LE8/f$n;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " is expected, was: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", most probably race condition detected on input "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LE8/f;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/AssertionError;

    return-object p1
.end method

.method private g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Race condition detected on input "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Old value is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, LE8/f;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/AssertionError;

    if-nez p1, :cond_0

    const/4 p2, 0x4

    invoke-static {p2}, LE8/f$l;->e(I)V

    :cond_0
    return-object p1
.end method

.method private m(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;
    .locals 3

    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to remove "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " under "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0}, LE8/f;->l(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    check-cast p1, Ljava/lang/AssertionError;

    return-object p1
.end method


# virtual methods
.method protected k(Ljava/lang/Object;Z)LE8/f$o;
    .locals 1

    .prologue
    iget-object p2, p0, LE8/f$l;->C:LE8/f;

    const-string v0, ""

    invoke-virtual {p2, v0, p1}, LE8/f;->p(Ljava/lang/String;Ljava/lang/Object;)LE8/f$o;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p2, 0x3

    invoke-static {p2}, LE8/f$l;->e(I)V

    :cond_0
    return-object p1
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, LE8/f$n;->D:LE8/f$n;

    if-eq v0, v1, :cond_0

    invoke-static {v0}, LP8/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LE8/f$l;->C:LE8/f;

    iget-object v0, v0, LE8/f;->a:LE8/k;

    invoke-interface {v0}, LE8/k;->b()V

    :try_start_0
    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LE8/f$n;->D:LE8/f$n;

    if-ne v0, v1, :cond_1

    sget-object v0, LE8/f$n;->E:LE8/f$n;

    const/4 v2, 0x1

    invoke-virtual {p0, p1, v2}, LE8/f$l;->k(Ljava/lang/Object;Z)LE8/f$o;

    move-result-object v2

    invoke-virtual {v2}, LE8/f$o;->c()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    invoke-virtual {v2}, LE8/f$o;->b()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iget-object v0, p0, LE8/f$l;->C:LE8/f;

    iget-object v0, v0, LE8/f;->a:LE8/k;

    invoke-interface {v0}, LE8/k;->a()V

    return-object p1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_1
    :try_start_1
    sget-object v2, LE8/f$n;->E:LE8/f$n;

    if-ne v0, v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v2}, LE8/f$l;->k(Ljava/lang/Object;Z)LE8/f$o;

    move-result-object v2

    invoke-virtual {v2}, LE8/f$o;->c()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    invoke-static {v0}, LP8/h;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :try_start_2
    iget-object v2, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, LE8/f$l;->E:Lx7/l;

    invoke-interface {v2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v2}, LP8/h;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v3, v1, :cond_4

    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    iget-object p1, p1, LE8/f;->a:LE8/k;

    invoke-interface {p1}, LE8/k;->a()V

    return-object v2

    :cond_4
    :try_start_3
    invoke-direct {p0, p1, v3}, LE8/f$l;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object v0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {v1}, LP8/d;->a(Ljava/lang/Throwable;)Z

    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v2, :cond_6

    :try_start_5
    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    sget-object v2, LE8/f$n;->D:LE8/f$n;

    if-eq v0, v2, :cond_5

    invoke-direct {p0, p1, v0}, LE8/f$l;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_5
    check-cast v1, Ljava/lang/RuntimeException;

    throw v1

    :catchall_2
    move-exception v0

    invoke-direct {p0, p1, v0}, LE8/f$l;->m(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_6
    if-eq v1, v0, :cond_8

    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-static {v1}, LP8/h;->c(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LE8/f$n;->D:LE8/f$n;

    if-eq v0, v2, :cond_7

    invoke-direct {p0, p1, v0}, LE8/f$l;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_7
    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    invoke-static {p1}, LE8/f;->k(LE8/f;)LE8/f$f;

    move-result-object p1

    invoke-interface {p1, v1}, LE8/f$f;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_8
    :try_start_7
    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    iget-object p1, p0, LE8/f$l;->C:LE8/f;

    invoke-static {p1}, LE8/f;->k(LE8/f;)LE8/f$f;

    move-result-object p1

    invoke-interface {p1, v1}, LE8/f$f;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :catchall_3
    move-exception v0

    invoke-direct {p0, p1, v0}, LE8/f$l;->m(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_2
    iget-object v0, p0, LE8/f$l;->C:LE8/f;

    iget-object v0, v0, LE8/f;->a:LE8/k;

    invoke-interface {v0}, LE8/k;->a()V

    throw p1
.end method

.method public q(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, LE8/f$l;->D:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, LE8/f$n;->D:LE8/f$n;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
