.class public abstract Lcom/google/android/gms/internal/ads/Fv0;
.super Lcom/google/android/gms/internal/ads/Nu0;
.source "SourceFile"


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/Jv0;

.field protected D:Lcom/google/android/gms/internal/ads/Jv0;


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/internal/ads/Jv0;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Nu0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fv0;->C:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Jv0;->V()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fv0;->n()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private n()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->C:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->K()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    return-object v0
.end method

.method private static p(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/ads/Ew0;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->q()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic h([BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Nu0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/Fv0;->t([BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Fv0;

    return-object p0
.end method

.method public q()Lcom/google/android/gms/internal/ads/Fv0;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->w()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->G()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->v()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0
.end method

.method public r(Lcom/google/android/gms/internal/ads/Jv0;)Lcom/google/android/gms/internal/ads/Fv0;
    .locals 1

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->w()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Jv0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Fv0;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method public bridge synthetic s()Lcom/google/android/gms/internal/ads/mw0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->v()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    return-object v0
.end method

.method public t([BIILcom/google/android/gms/internal/ads/xv0;)Lcom/google/android/gms/internal/ads/Fv0;
    .locals 8

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->x()V

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/ads/vw0;->a()Lcom/google/android/gms/internal/ads/vw0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vw0;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Ew0;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    add-int v6, p2, p3

    new-instance v7, Lcom/google/android/gms/internal/ads/Su0;

    invoke-direct {v7, p4}, Lcom/google/android/gms/internal/ads/Su0;-><init>(Lcom/google/android/gms/internal/ads/xv0;)V

    move-object v4, p1

    move v5, p2

    invoke-interface/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/Ew0;->h(Ljava/lang/Object;[BIILcom/google/android/gms/internal/ads/Su0;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/Vv0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/lang/RuntimeException;

    const-string p3, "Reading from byte array should not throw IOException."

    invoke-direct {p2, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    new-instance p1, Lcom/google/android/gms/internal/ads/Vv0;

    const-string p2, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/Vv0;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    throw p1
.end method

.method public final u()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 2

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->v()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nu0;->k(Lcom/google/android/gms/internal/ads/mw0;)Lcom/google/android/gms/internal/ads/Kw0;

    move-result-object v0

    throw v0
.end method

.method public v()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->V()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->D()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0
.end method

.method public w()Lcom/google/android/gms/internal/ads/Jv0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->C:Lcom/google/android/gms/internal/ads/Jv0;

    return-object v0
.end method

.method protected final x()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->V()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Fv0;->y()V

    :cond_0
    return-void
.end method

.method protected y()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Fv0;->n()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Fv0;->p(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Fv0;->D:Lcom/google/android/gms/internal/ads/Jv0;

    return-void
.end method
