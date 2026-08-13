.class public abstract Lcom/google/android/gms/internal/ads/t70;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/util/List;)Ls3/c2;
    .locals 4

    .prologue
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/S60;

    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/S60;->c:Z

    if-eqz v2, :cond_0

    sget-object v1, Lk3/h;->p:Lk3/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v2, Lk3/h;

    iget v3, v1, Lcom/google/android/gms/internal/ads/S60;->a:I

    iget v1, v1, Lcom/google/android/gms/internal/ads/S60;->b:I

    invoke-direct {v2, v3, v1}, Lk3/h;-><init>(II)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lk3/h;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lk3/h;

    new-instance v0, Ls3/c2;

    invoke-direct {v0, p0, p1}, Ls3/c2;-><init>(Landroid/content/Context;[Lk3/h;)V

    return-object v0
.end method

.method public static b(Ls3/c2;)Lcom/google/android/gms/internal/ads/S60;
    .locals 3

    .prologue
    iget-boolean v0, p0, Ls3/c2;->K:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/S60;

    const/4 v0, -0x3

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/S60;-><init>(IIZ)V

    return-object p0

    :cond_0
    iget v0, p0, Ls3/c2;->G:I

    iget p0, p0, Ls3/c2;->D:I

    new-instance v2, Lcom/google/android/gms/internal/ads/S60;

    invoke-direct {v2, v0, p0, v1}, Lcom/google/android/gms/internal/ads/S60;-><init>(IIZ)V

    return-object v2
.end method
