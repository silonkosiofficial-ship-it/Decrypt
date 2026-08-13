.class public Lcom/google/android/gms/ads/nativead/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field private C:Z

.field private D:Landroid/widget/ImageView$ScaleType;

.field private E:Z

.field private F:Lcom/google/android/gms/ads/nativead/f;

.field private G:Lcom/google/android/gms/ads/nativead/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method protected final declared-synchronized a(Lcom/google/android/gms/ads/nativead/f;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/b;->F:Lcom/google/android/gms/ads/nativead/f;

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/b;->C:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/f;->a:Lcom/google/android/gms/ads/nativead/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/nativead/d;->b(Lk3/n;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected final declared-synchronized b(Lcom/google/android/gms/ads/nativead/g;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/b;->G:Lcom/google/android/gms/ads/nativead/g;

    iget-boolean v0, p0, Lcom/google/android/gms/ads/nativead/b;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/b;->D:Landroid/widget/ImageView$ScaleType;

    iget-object p1, p1, Lcom/google/android/gms/ads/nativead/g;->a:Lcom/google/android/gms/ads/nativead/d;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/ads/nativead/d;->c(Landroid/widget/ImageView$ScaleType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public getMediaContent()Lk3/n;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public setImageScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/b;->E:Z

    iput-object p1, p0, Lcom/google/android/gms/ads/nativead/b;->D:Landroid/widget/ImageView$ScaleType;

    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/b;->G:Lcom/google/android/gms/ads/nativead/g;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/g;->a:Lcom/google/android/gms/ads/nativead/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/d;->c(Landroid/widget/ImageView$ScaleType;)V

    :cond_0
    return-void
.end method

.method public setMediaContent(Lk3/n;)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/nativead/b;->C:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/nativead/b;->F:Lcom/google/android/gms/ads/nativead/f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/ads/nativead/f;->a:Lcom/google/android/gms/ads/nativead/d;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/nativead/d;->b(Lk3/n;)V

    :cond_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-interface {p1}, Lk3/n;->a()Lcom/google/android/gms/internal/ads/Hh;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lk3/n;->c()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Hh;->C0(LX3/a;)Z

    move-result p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lk3/n;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {p0}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/Hh;->g0(LX3/a;)Z

    move-result p1

    :goto_0
    if-nez p1, :cond_4

    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    :goto_1
    return-void

    :goto_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    const-string v0, ""

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
