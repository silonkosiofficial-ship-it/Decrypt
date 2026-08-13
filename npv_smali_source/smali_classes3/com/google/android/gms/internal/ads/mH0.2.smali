.class public final Lcom/google/android/gms/internal/ads/mH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/eI0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/y0;

.field private b:Lcom/google/android/gms/internal/ads/t0;

.field private c:Lcom/google/android/gms/internal/ads/u0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mH0;->a:Lcom/google/android/gms/internal/ads/y0;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/qB0;Landroid/net/Uri;Ljava/util/Map;JJLcom/google/android/gms/internal/ads/w0;)V
    .locals 7

    .prologue
    new-instance v6, Lcom/google/android/gms/internal/ads/i0;

    move-object v0, v6

    move-object v1, p1

    move-wide v2, p4

    move-wide v4, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/i0;-><init>(Lcom/google/android/gms/internal/ads/qB0;JJ)V

    iput-object v6, p0, Lcom/google/android/gms/internal/ads/mH0;->c:Lcom/google/android/gms/internal/ads/u0;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mH0;->a:Lcom/google/android/gms/internal/ads/y0;

    invoke-interface {p1, p2, p3}, Lcom/google/android/gms/internal/ads/y0;->a(Landroid/net/Uri;Ljava/util/Map;)[Lcom/google/android/gms/internal/ads/t0;

    move-result-object p1

    array-length p3, p1

    invoke-static {p3}, Lcom/google/android/gms/internal/ads/ci0;->C(I)Lcom/google/android/gms/internal/ads/Zh0;

    move-result-object p6

    const/4 p7, 0x0

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    aget-object p1, p1, p7

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    goto :goto_6

    :cond_1
    move v1, p7

    :goto_0
    if-ge v1, p3, :cond_7

    aget-object v2, p1, v1

    :try_start_0
    invoke-interface {v2, v6}, Lcom/google/android/gms/internal/ads/t0;->j(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result v3

    if-eqz v3, :cond_2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->j()V

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_2
    :try_start_1
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/t0;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p6, v2}, Lcom/google/android/gms/internal/ads/Zh0;->i(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/Zh0;
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-nez v2, :cond_3

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    cmp-long v2, v2, p4

    if-nez v2, :cond_4

    :cond_3
    :goto_1
    move v2, v0

    goto :goto_2

    :cond_4
    move v2, p7

    :goto_2
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->j()V

    goto :goto_4

    :goto_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-nez p2, :cond_5

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide p2

    cmp-long p2, p2, p4

    if-nez p2, :cond_6

    :cond_5
    move p7, v0

    :cond_6
    invoke-static {p7}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->j()V

    throw p1

    :catch_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-nez v2, :cond_3

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    cmp-long v2, v2, p4

    if-nez v2, :cond_4

    goto :goto_1

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    :goto_5
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-eqz p3, :cond_8

    :goto_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    invoke-interface {p1, p8}, Lcom/google/android/gms/internal/ads/t0;->k(Lcom/google/android/gms/internal/ads/w0;)V

    return-void

    :cond_8
    new-instance p3, Lcom/google/android/gms/internal/ads/QI0;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/ci0;->N([Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p1

    new-instance p4, Lcom/google/android/gms/internal/ads/lH0;

    invoke-direct {p4}, Lcom/google/android/gms/internal/ads/lH0;-><init>()V

    invoke-static {p1, p4}, Lcom/google/android/gms/internal/ads/ti0;->b(Ljava/util/List;Lcom/google/android/gms/internal/ads/pg0;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, ", "

    invoke-static {p4, p1, p5}, Lcom/google/android/gms/internal/ads/sg0;->c(Ljava/lang/StringBuilder;Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "None of the available extractors ("

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") could read the stream."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p6}, Lcom/google/android/gms/internal/ads/Zh0;->j()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object p4

    invoke-direct {p3, p1, p2, p4}, Lcom/google/android/gms/internal/ads/QI0;-><init>(Ljava/lang/String;Landroid/net/Uri;Ljava/util/List;)V

    throw p3
.end method

.method public final b()J
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mH0;->c:Lcom/google/android/gms/internal/ads/u0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final c()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/c3;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/c3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/c3;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    :cond_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/mH0;->c:Lcom/google/android/gms/internal/ads/u0;

    return-void
.end method

.method public final e(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/t0;->e(JJ)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/mH0;->b:Lcom/google/android/gms/internal/ads/t0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/mH0;->c:Lcom/google/android/gms/internal/ads/u0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/t0;->i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I

    move-result p1

    return p1
.end method
