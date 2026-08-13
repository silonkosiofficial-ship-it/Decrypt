.class public abstract Ls3/X0;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Ls3/Y0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IVideoController"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Eb;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static o6(Landroid/os/IBinder;)Ls3/Y0;
    .locals 2

    .prologue
    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.client.IVideoController"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Ls3/Y0;

    if-eqz v1, :cond_1

    check-cast v0, Ls3/Y0;

    return-object v0

    :cond_1
    new-instance v0, Ls3/V0;

    invoke-direct {v0, p0}, Ls3/V0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method protected final n6(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 1

    .prologue
    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    invoke-interface {p0}, Ls3/Y0;->n()V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_5

    :pswitch_1
    invoke-interface {p0}, Ls3/Y0;->p()Z

    move-result p1

    :goto_1
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    sget p2, Lcom/google/android/gms/internal/ads/Fb;->b:I

    :goto_2
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_5

    :pswitch_2
    invoke-interface {p0}, Ls3/Y0;->h()Ls3/b1;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/Fb;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_5

    :pswitch_3
    invoke-interface {p0}, Ls3/Y0;->q()Z

    move-result p1

    goto :goto_1

    :pswitch_4
    invoke-interface {p0}, Ls3/Y0;->d()F

    move-result p1

    :goto_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeFloat(F)V

    goto :goto_5

    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_4

    :cond_0
    const-string p4, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/b1;

    if-eqz v0, :cond_1

    move-object p1, p4

    check-cast p1, Ls3/b1;

    goto :goto_4

    :cond_1
    new-instance p4, Ls3/Z0;

    invoke-direct {p4, p1}, Ls3/Z0;-><init>(Landroid/os/IBinder;)V

    move-object p1, p4

    :goto_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/Y0;->b4(Ls3/b1;)V

    goto :goto_0

    :pswitch_6
    invoke-interface {p0}, Ls3/Y0;->e()F

    move-result p1

    goto :goto_3

    :pswitch_7
    invoke-interface {p0}, Ls3/Y0;->i()F

    move-result p1

    goto :goto_3

    :pswitch_8
    invoke-interface {p0}, Ls3/Y0;->g()I

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_2

    :pswitch_9
    invoke-interface {p0}, Ls3/Y0;->s()Z

    move-result p1

    goto :goto_1

    :pswitch_a
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->g(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/Y0;->l0(Z)V

    goto :goto_0

    :pswitch_b
    invoke-interface {p0}, Ls3/Y0;->k()V

    goto :goto_0

    :pswitch_c
    invoke-interface {p0}, Ls3/Y0;->l()V

    goto :goto_0

    :goto_5
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
