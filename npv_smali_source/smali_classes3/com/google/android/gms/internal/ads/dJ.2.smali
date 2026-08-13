.class public final Lcom/google/android/gms/internal/ads/dJ;
.super Ls3/X0;
.source "SourceFile"


# instance fields
.field private final C:Ljava/lang/Object;

.field private final D:Ls3/Y0;

.field private final E:Lcom/google/android/gms/internal/ads/km;


# direct methods
.method public constructor <init>(Ls3/Y0;Lcom/google/android/gms/internal/ads/km;)V
    .locals 1

    invoke-direct {p0}, Ls3/X0;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/dJ;->C:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dJ;->D:Ls3/Y0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/dJ;->E:Lcom/google/android/gms/internal/ads/km;

    return-void
.end method


# virtual methods
.method public final b4(Ls3/b1;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dJ;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dJ;->D:Ls3/Y0;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Ls3/Y0;->b4(Ls3/b1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final d()F
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final e()F
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dJ;->E:Lcom/google/android/gms/internal/ads/km;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/km;->i()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()I
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final h()Ls3/b1;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dJ;->C:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/dJ;->D:Ls3/Y0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ls3/Y0;->h()Ls3/b1;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i()F
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dJ;->E:Lcom/google/android/gms/internal/ads/km;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/km;->g()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final l()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final l0(Z)V
    .locals 0

    new-instance p1, Landroid/os/RemoteException;

    invoke-direct {p1}, Landroid/os/RemoteException;-><init>()V

    throw p1
.end method

.method public final n()V
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final p()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final q()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method

.method public final s()Z
    .locals 1

    new-instance v0, Landroid/os/RemoteException;

    invoke-direct {v0}, Landroid/os/RemoteException;-><init>()V

    throw v0
.end method
