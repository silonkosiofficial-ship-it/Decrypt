.class public final Lcom/google/android/gms/internal/ads/li;
.super Ln3/g;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/ki;

.field private final b:Ljava/util/List;

.field private final c:Lcom/google/android/gms/internal/ads/ph;

.field private final d:Lk3/w;

.field private final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ki;)V
    .locals 5

    .prologue
    const-string v0, ""

    invoke-direct {p0}, Ln3/g;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/li;->b:Ljava/util/List;

    new-instance v1, Lk3/w;

    invoke-direct {v1}, Lk3/w;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/li;->d:Lk3/w;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/li;->e:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ki;->A()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/os/IBinder;

    if-nez v2, :cond_2

    :cond_1
    move-object v3, v1

    goto :goto_1

    :cond_2
    const-string v3, "com.google.android.gms.ads.internal.formats.client.INativeAdImage"

    invoke-interface {v2, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/gms/internal/ads/oh;

    if-eqz v4, :cond_3

    check-cast v3, Lcom/google/android/gms/internal/ads/oh;

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    new-instance v3, Lcom/google/android/gms/internal/ads/mh;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/mh;-><init>(Landroid/os/IBinder;)V

    :goto_1
    if-eqz v3, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/li;->b:Ljava/util/List;

    new-instance v4, Lcom/google/android/gms/internal/ads/ph;

    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/ph;-><init>(Lcom/google/android/gms/internal/ads/oh;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_2
    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :try_start_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ki;->v()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_6

    check-cast v2, Landroid/os/IBinder;

    invoke-static {v2}, Ls3/C0;->o6(Landroid/os/IBinder;)Ls3/D0;

    move-result-object v2

    goto :goto_4

    :catch_1
    move-exception p1

    goto :goto_5

    :cond_6
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_5

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/li;->e:Ljava/util/List;

    new-instance v4, Ls3/E0;

    invoke-direct {v4, v2}, Ls3/E0;-><init>(Ls3/D0;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :goto_5
    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :try_start_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ki;->k()Lcom/google/android/gms/internal/ads/oh;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v2, Lcom/google/android/gms/internal/ads/ph;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/ads/ph;-><init>(Lcom/google/android/gms/internal/ads/oh;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v2

    goto :goto_6

    :catch_2
    move-exception p1

    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_6
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/li;->c:Lcom/google/android/gms/internal/ads/ph;

    :try_start_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/ki;->h()Lcom/google/android/gms/internal/ads/hh;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance p1, Lcom/google/android/gms/internal/ads/ih;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ki;->h()Lcom/google/android/gms/internal/ads/hh;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/google/android/gms/internal/ads/ih;-><init>(Lcom/google/android/gms/internal/ads/hh;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_3

    return-void

    :catch_3
    move-exception p1

    goto :goto_7

    :cond_9
    return-void

    :goto_7
    invoke-static {v0, p1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final a()Lk3/w;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->g()Ls3/Y0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->d:Lk3/w;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ki;->g()Ls3/Y0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk3/w;->c(Ls3/Y0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "Exception occurred while getting video controller"

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->d:Lk3/w;

    return-object v0
.end method

.method public final b()Ln3/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->c:Lcom/google/android/gms/internal/ads/ph;

    return-object v0
.end method

.method public final c()Ljava/lang/Double;
    .locals 5

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/ki;->d()D

    move-result-wide v1

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    cmpl-double v3, v1, v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    const-string v2, ""

    invoke-static {v2, v1}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->l()LX3/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LX3/b;->L0(LX3/a;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->n()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->p()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->q()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->s()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->u()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->a:Lcom/google/android/gms/internal/ads/ki;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ki;->w()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lw3/p;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/li;->b:Ljava/util/List;

    return-object v0
.end method
