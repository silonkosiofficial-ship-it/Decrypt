.class public final synthetic Lcom/google/android/gms/internal/ads/Vf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Lcom/google/android/gms/internal/ads/Xf0;

.field public final synthetic D:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Xf0;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Vf0;->C:Lcom/google/android/gms/internal/ads/Xf0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Vf0;->D:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Vf0;->D:Landroid/os/IBinder;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/We0;->o6(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/Xe0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vf0;->C:Lcom/google/android/gms/internal/ads/Xf0;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/Zf0;->g(Lcom/google/android/gms/internal/ads/Zf0;Landroid/os/IInterface;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zf0;->d(Lcom/google/android/gms/internal/ads/Zf0;)Lcom/google/android/gms/internal/ads/ag0;

    move-result-object v0

    const-string v2, "linkToDeath"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v4}, Lcom/google/android/gms/internal/ads/ag0;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    :try_start_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zf0;->b(Lcom/google/android/gms/internal/ads/Zf0;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/os/IInterface;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Zf0;->a(Lcom/google/android/gms/internal/ads/Zf0;)Landroid/os/IBinder$DeathRecipient;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    throw v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Zf0;->d(Lcom/google/android/gms/internal/ads/Zf0;)Lcom/google/android/gms/internal/ads/ag0;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "linkToDeath failed"

    invoke-virtual {v2, v0, v5, v4}, Lcom/google/android/gms/internal/ads/ag0;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    :goto_1
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/Zf0;->f(Lcom/google/android/gms/internal/ads/Zf0;Z)V

    iget-object v0, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Zf0;->e(Lcom/google/android/gms/internal/ads/Zf0;)Ljava/util/List;

    move-result-object v0

    monitor-enter v0

    :try_start_1
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/Zf0;->e(Lcom/google/android/gms/internal/ads/Zf0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Runnable;

    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_3

    :cond_1
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/Xf0;->a:Lcom/google/android/gms/internal/ads/Zf0;

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/Zf0;->e(Lcom/google/android/gms/internal/ads/Zf0;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
