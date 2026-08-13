.class public abstract Ls3/U;
.super Lcom/google/android/gms/internal/ads/Eb;
.source "SourceFile"

# interfaces
.implements Ls3/V;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.ads.internal.client.IAdManager"

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Eb;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final n6(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2

    .prologue
    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    invoke-interface {p0}, Ls3/V;->H0()Z

    move-result p1

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    sget p2, Lcom/google/android/gms/internal/ads/Fb;->b:I

    :goto_1
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    goto/16 :goto_e

    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p4, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/p0;

    if-eqz v0, :cond_1

    check-cast p4, Ls3/p0;

    goto :goto_2

    :cond_1
    new-instance p4, Ls3/n0;

    invoke-direct {p4, p1}, Ls3/n0;-><init>(Landroid/os/IBinder;)V

    :goto_2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->F1(Ls3/p0;)V

    :goto_3
    :pswitch_3
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_e

    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, LX3/a$a;->y0(Landroid/os/IBinder;)LX3/a;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->m6(LX3/a;)V

    goto :goto_3

    :pswitch_5
    sget-object p1, Ls3/X1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/X1;

    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    const-string p4, "com.google.android.gms.ads.internal.client.IAdLoadCallback"

    invoke-interface {v0, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v1, p4, Ls3/K;

    if-eqz v1, :cond_3

    check-cast p4, Ls3/K;

    goto :goto_4

    :cond_3
    new-instance p4, Ls3/I;

    invoke-direct {p4, v0}, Ls3/I;-><init>(Landroid/os/IBinder;)V

    :goto_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Ls3/V;->o3(Ls3/X1;Ls3/K;)V

    goto :goto_3

    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_5

    :cond_4
    const-string p4, "com.google.android.gms.ads.internal.client.IOnPaidEventListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/N0;

    if-eqz v0, :cond_5

    check-cast p4, Ls3/N0;

    goto :goto_5

    :cond_5
    new-instance p4, Ls3/L0;

    invoke-direct {p4, p1}, Ls3/L0;-><init>(Landroid/os/IBinder;)V

    :goto_5
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->l1(Ls3/N0;)V

    goto :goto_3

    :pswitch_7
    invoke-interface {p0}, Ls3/V;->k()Ls3/U0;

    move-result-object p1

    :goto_6
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/Fb;->f(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto/16 :goto_e

    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Jc;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Kc;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->I5(Lcom/google/android/gms/internal/ads/Kc;)V

    goto :goto_3

    :pswitch_9
    sget-object p1, Ls3/i2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/i2;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->V0(Ls3/i2;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->W0(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_b
    invoke-interface {p0}, Ls3/V;->f()Landroid/os/Bundle;

    move-result-object p1

    :goto_7
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/Fb;->e(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_e

    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_8

    :cond_6
    const-string p4, "com.google.android.gms.ads.internal.client.IAdMetadataListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/a0;

    if-eqz v0, :cond_7

    check-cast p4, Ls3/a0;

    goto :goto_8

    :cond_7
    new-instance p4, Ls3/Y;

    invoke-direct {p4, p1}, Ls3/Y;-><init>(Landroid/os/IBinder;)V

    :goto_8
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->x4(Ls3/a0;)V

    goto/16 :goto_3

    :pswitch_d
    invoke-interface {p0}, Ls3/V;->w()Ljava/lang/String;

    move-result-object p1

    :goto_9
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto/16 :goto_e

    :pswitch_e
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->g(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->Y4(Z)V

    goto/16 :goto_3

    :pswitch_f
    invoke-interface {p0}, Ls3/V;->h()Ls3/H;

    move-result-object p1

    goto :goto_6

    :pswitch_10
    invoke-interface {p0}, Ls3/V;->j()Ls3/i0;

    move-result-object p1

    goto/16 :goto_6

    :pswitch_11
    invoke-interface {p0}, Ls3/V;->t()Ljava/lang/String;

    move-result-object p1

    goto :goto_9

    :pswitch_12
    sget-object p1, Ls3/c1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/c1;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->g3(Ls3/c1;)V

    goto/16 :goto_3

    :pswitch_13
    sget-object p1, Ls3/Q1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/Q1;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->j4(Ls3/Q1;)V

    goto/16 :goto_3

    :pswitch_14
    invoke-interface {p0}, Ls3/V;->l()Ls3/Y0;

    move-result-object p1

    goto/16 :goto_6

    :pswitch_15
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->r2(Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/hp;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/ip;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->Y1(Lcom/google/android/gms/internal/ads/ip;)V

    goto/16 :goto_3

    :pswitch_17
    invoke-interface {p0}, Ls3/V;->P5()Z

    move-result p1

    goto/16 :goto_0

    :pswitch_18
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->g(Landroid/os/Parcel;)Z

    move-result p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->e6(Z)V

    goto/16 :goto_3

    :pswitch_19
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_a

    :cond_8
    const-string p4, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/m0;

    if-eqz v0, :cond_9

    check-cast p4, Ls3/m0;

    goto :goto_a

    :cond_9
    new-instance p4, Ls3/m0;

    invoke-direct {p4, p1}, Ls3/m0;-><init>(Landroid/os/IBinder;)V

    :goto_a
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->v3(Ls3/m0;)V

    goto/16 :goto_3

    :pswitch_1a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_a

    goto :goto_b

    :cond_a
    const-string p4, "com.google.android.gms.ads.internal.client.IAdClickListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/E;

    if-eqz v0, :cond_b

    check-cast p4, Ls3/E;

    goto :goto_b

    :cond_b
    new-instance p4, Ls3/C;

    invoke-direct {p4, p1}, Ls3/C;-><init>(Landroid/os/IBinder;)V

    :goto_b
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->V5(Ls3/E;)V

    goto/16 :goto_3

    :pswitch_1b
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Vf;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Wf;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->F2(Lcom/google/android/gms/internal/ads/Wf;)V

    goto/16 :goto_3

    :pswitch_1c
    invoke-interface {p0}, Ls3/V;->u()Ljava/lang/String;

    move-result-object p1

    goto/16 :goto_9

    :pswitch_1d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Xn;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Yn;

    move-result-object p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1, p4}, Ls3/V;->X1(Lcom/google/android/gms/internal/ads/Yn;Ljava/lang/String;)V

    goto/16 :goto_3

    :pswitch_1e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Un;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Vn;

    move-result-object p1

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->W2(Lcom/google/android/gms/internal/ads/Vn;)V

    goto/16 :goto_3

    :pswitch_1f
    sget-object p1, Ls3/c2;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/c2;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->T1(Ls3/c2;)V

    goto/16 :goto_3

    :pswitch_20
    invoke-interface {p0}, Ls3/V;->i()Ls3/c2;

    move-result-object p1

    goto/16 :goto_7

    :pswitch_21
    invoke-interface {p0}, Ls3/V;->h0()V

    goto/16 :goto_3

    :pswitch_22
    invoke-interface {p0}, Ls3/V;->X()V

    goto/16 :goto_3

    :pswitch_23
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_c

    goto :goto_c

    :cond_c
    const-string p4, "com.google.android.gms.ads.internal.client.IAppEventListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/i0;

    if-eqz v0, :cond_d

    check-cast p4, Ls3/i0;

    goto :goto_c

    :cond_d
    new-instance p4, Ls3/g0;

    invoke-direct {p4, p1}, Ls3/g0;-><init>(Landroid/os/IBinder;)V

    :goto_c
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->i2(Ls3/i0;)V

    goto/16 :goto_3

    :pswitch_24
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_e

    goto :goto_d

    :cond_e
    const-string p4, "com.google.android.gms.ads.internal.client.IAdListener"

    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object p4

    instance-of v0, p4, Ls3/H;

    if-eqz v0, :cond_f

    check-cast p4, Ls3/H;

    goto :goto_d

    :cond_f
    new-instance p4, Ls3/F;

    invoke-direct {p4, p1}, Ls3/F;-><init>(Landroid/os/IBinder;)V

    :goto_d
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p4}, Ls3/V;->u3(Ls3/H;)V

    goto/16 :goto_3

    :pswitch_25
    invoke-interface {p0}, Ls3/V;->Y()V

    goto/16 :goto_3

    :pswitch_26
    invoke-interface {p0}, Ls3/V;->J()V

    goto/16 :goto_3

    :pswitch_27
    sget-object p1, Ls3/X1;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/Fb;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ls3/X1;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/Fb;->c(Landroid/os/Parcel;)V

    invoke-interface {p0, p1}, Ls3/V;->K3(Ls3/X1;)Z

    move-result p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto/16 :goto_1

    :pswitch_28
    invoke-interface {p0}, Ls3/V;->f0()Z

    move-result p1

    goto/16 :goto_0

    :pswitch_29
    invoke-interface {p0}, Ls3/V;->C()V

    goto/16 :goto_3

    :pswitch_2a
    invoke-interface {p0}, Ls3/V;->n()LX3/a;

    move-result-object p1

    goto/16 :goto_6

    :goto_e
    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_3
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_0
        :pswitch_0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_0
        :pswitch_0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
