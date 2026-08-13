.class public abstract Lv3/q0;
.super Lw3/p;
.source "SourceFile"


# direct methods
.method public static k(Ljava/lang/String;)V
    .locals 4

    .prologue
    invoke-static {}, Lv3/q0;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Ads"

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xfa0

    if-gt v1, v2, :cond_0

    goto :goto_2

    :cond_0
    sget-object v1, Lw3/p;->a:Lcom/google/android/gms/internal/ads/Qg0;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Qg0;->d(Ljava/lang/CharSequence;)Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    nop

    :goto_1
    move v1, v3

    goto :goto_0

    :cond_1
    const-string v1, "Ads-cont"

    nop

    goto :goto_1

    :cond_2
    :goto_2
    nop

    :cond_3
    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    invoke-static {}, Lv3/q0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Ads"

    nop

    :cond_0
    return-void
.end method

.method public static m()Z
    .locals 1

    .prologue
    const/4 v0, 0x2

    invoke-static {v0}, Lw3/p;->j(I)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/Eg;->a:Lcom/google/android/gms/internal/ads/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
