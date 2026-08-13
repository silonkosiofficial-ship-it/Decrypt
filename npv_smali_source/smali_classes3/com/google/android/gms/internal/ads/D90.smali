.class public abstract synthetic Lcom/google/android/gms/internal/ads/D90;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;
    .locals 2

    .prologue
    invoke-static {}, Lcom/google/android/gms/internal/ads/T90;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v0, p1, -0x2

    const/16 v1, 0x14

    if-eq v0, v1, :cond_0

    const/16 v1, 0x15

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->b:Lcom/google/android/gms/internal/ads/lg;

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/lg;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :pswitch_1
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->d:Lcom/google/android/gms/internal/ads/lg;

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->c:Lcom/google/android/gms/internal/ads/lg;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/vg;->e:Lcom/google/android/gms/internal/ads/lg;

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/G90;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/G90;-><init>(Landroid/content/Context;I)V

    return-object v0

    :cond_1
    :goto_2
    new-instance p0, Lcom/google/android/gms/internal/ads/na0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/na0;-><init>()V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;IILs3/X1;)Lcom/google/android/gms/internal/ads/E90;
    .locals 0

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/D90;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/E90;

    move-result-object p0

    instance-of p1, p0, Lcom/google/android/gms/internal/ads/G90;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/E90;->h()Lcom/google/android/gms/internal/ads/E90;

    invoke-interface {p0, p2}, Lcom/google/android/gms/internal/ads/E90;->A(I)Lcom/google/android/gms/internal/ads/E90;

    iget-object p1, p3, Ls3/X1;->O:Landroid/os/Bundle;

    invoke-static {p1}, LB3/c;->a(Landroid/os/Bundle;)Lcom/google/android/gms/internal/ads/V90;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/E90;->b(Lcom/google/android/gms/internal/ads/V90;)Lcom/google/android/gms/internal/ads/E90;

    iget-object p1, p3, Ls3/X1;->R:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/P90;->e(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p3, Ls3/X1;->R:Ljava/lang/String;

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/E90;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/E90;

    :cond_1
    :goto_0
    return-object p0
.end method
