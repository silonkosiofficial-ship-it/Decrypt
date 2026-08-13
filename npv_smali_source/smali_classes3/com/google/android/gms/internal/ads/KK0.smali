.class public final Lcom/google/android/gms/internal/ads/KK0;
.super Landroid/view/Surface;
.source "SourceFile"


# static fields
.field private static F:I

.field private static G:Z


# instance fields
.field public final C:Z

.field private final D:Lcom/google/android/gms/internal/ads/IK0;

.field private E:Z


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/IK0;Landroid/graphics/SurfaceTexture;ZLcom/google/android/gms/internal/ads/JK0;)V
    .locals 0

    invoke-direct {p0, p2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/KK0;->D:Lcom/google/android/gms/internal/ads/IK0;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/KK0;->C:Z

    return-void
.end method

.method public static a(Landroid/content/Context;Z)Lcom/google/android/gms/internal/ads/KK0;
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/KK0;->b(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    new-instance p0, Lcom/google/android/gms/internal/ads/IK0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/IK0;-><init>()V

    if-eqz p1, :cond_2

    sget v0, Lcom/google/android/gms/internal/ads/KK0;->F:I

    :cond_2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/IK0;->a(I)Lcom/google/android/gms/internal/ads/KK0;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/KK0;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/google/android/gms/internal/ads/KK0;->G:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_2

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/vH;->b(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/vH;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    move p0, v3

    goto :goto_0

    :cond_0
    const/4 p0, 0x2

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    move p0, v2

    :goto_0
    sput p0, Lcom/google/android/gms/internal/ads/KK0;->F:I

    sput-boolean v3, Lcom/google/android/gms/internal/ads/KK0;->G:Z

    :cond_2
    sget p0, Lcom/google/android/gms/internal/ads/KK0;->F:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    if-eqz p0, :cond_3

    return v3

    :cond_3
    return v2

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final release()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroid/view/Surface;->release()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/KK0;->D:Lcom/google/android/gms/internal/ads/IK0;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/KK0;->E:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/KK0;->D:Lcom/google/android/gms/internal/ads/IK0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/IK0;->b()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/KK0;->E:Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
