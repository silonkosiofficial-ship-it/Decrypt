.class public final Lcom/google/android/gms/internal/ads/Xd0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:[B

.field private b:I

.field private c:I

.field final synthetic d:Lcom/google/android/gms/internal/ads/Zd0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Zd0;[BLcom/google/android/gms/internal/ads/Yd0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Xd0;->a:[B

    return-void
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/internal/ads/Xd0;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xd0;->c:I

    return-object p0
.end method

.method public final b(I)Lcom/google/android/gms/internal/ads/Xd0;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Xd0;->b:I

    return-object p0
.end method

.method public final declared-synchronized c()V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/Zd0;->b:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zd0;->a:Lcom/google/android/gms/internal/ads/ce0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Xd0;->a:[B

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ce0;->o0([B)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zd0;->a:Lcom/google/android/gms/internal/ads/ce0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xd0;->b:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ce0;->K(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zd0;->a:Lcom/google/android/gms/internal/ads/ce0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/Xd0;->c:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ce0;->D(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zd0;->a:Lcom/google/android/gms/internal/ads/ce0;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/ce0;->B0([I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Xd0;->d:Lcom/google/android/gms/internal/ads/Zd0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/Zd0;->a:Lcom/google/android/gms/internal/ads/ce0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ce0;->e()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    const-string v1, "GASS"

    const-string v2, "Clearcut log failed"

    nop
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
