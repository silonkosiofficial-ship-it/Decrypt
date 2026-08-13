.class public final Lcom/google/android/gms/internal/ads/EZ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/EZ;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/EZ;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0xd

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/DZ;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/DZ;-><init>(Lcom/google/android/gms/internal/ads/EZ;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/EZ;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/FZ;
    .locals 14

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/EZ;->b:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v1

    invoke-virtual {v1}, Lv3/c;->a()F

    move-result v11

    invoke-static {}, Lr3/v;->v()Lv3/c;

    move-result-object v1

    invoke-virtual {v1}, Lv3/c;->e()Z

    move-result v12

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/FZ;

    const/4 v10, -0x1

    const/4 v13, 0x1

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v9, -0x1

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/google/android/gms/internal/ads/FZ;-><init>(IZZIIIIIFZZ)V

    return-object v0

    :cond_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v3

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v4

    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v5

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v6

    sget-object v2, Lcom/google/android/gms/internal/ads/Af;->Ra:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lr3/v;->u()Lv3/b;

    move-result-object v2

    invoke-virtual {v2, v0}, Lv3/b;->i(Landroid/media/AudioManager;)I

    move-result v2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v1

    move v8, v1

    move v7, v2

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    move v7, v1

    move v8, v7

    :goto_0
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    move-result v9

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v10

    new-instance v0, Lcom/google/android/gms/internal/ads/FZ;

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/google/android/gms/internal/ads/FZ;-><init>(IZZIIIIIFZZ)V

    return-object v0
.end method
