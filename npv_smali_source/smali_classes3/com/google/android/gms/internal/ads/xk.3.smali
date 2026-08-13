.class public final Lcom/google/android/gms/internal/ads/xk;
.super Ll3/b;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ls3/b2;

.field private final c:Ls3/V;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/google/android/gms/internal/ads/Rl;

.field private final f:J

.field private g:Lk3/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ll3/b;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->e:Lcom/google/android/gms/internal/ads/Rl;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/xk;->f:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xk;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/xk;->d:Ljava/lang/String;

    sget-object v1, Ls3/b2;->a:Ls3/b2;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/xk;->b:Ls3/b2;

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v1

    new-instance v2, Ls3/c2;

    invoke-direct {v2}, Ls3/c2;-><init>()V

    invoke-virtual {v1, p1, v2, p2, v0}, Ls3/w;->e(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/V;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    return-void
.end method


# virtual methods
.method public final a()Lk3/u;
    .locals 3

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ls3/V;->k()Ls3/U0;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "#007 Could not call remote method."

    invoke-static {v2, v1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    invoke-static {v0}, Lk3/u;->e(Ls3/U0;)Lk3/u;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lk3/l;)V
    .locals 2

    .prologue
    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xk;->g:Lk3/l;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    if-eqz v0, :cond_0

    new-instance v1, Ls3/B;

    invoke-direct {v1, p1}, Ls3/B;-><init>(Lk3/l;)V

    invoke-interface {v0, v1}, Ls3/V;->F1(Ls3/p0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Z)V
    .locals 1

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ls3/V;->Y4(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final e(Landroid/app/Activity;)V
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const-string v0, "The activity for show is null, will proceed with show using the context provided when loading the ad."

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    if-eqz v0, :cond_1

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {v0, p1}, Ls3/V;->m6(LX3/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    return-void

    :goto_0
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final f(Ls3/f1;Lk3/e;)V
    .locals 7

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/xk;->f:J

    invoke-virtual {p1, v0, v1}, Ls3/f1;->o(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xk;->c:Ls3/V;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xk;->b:Ls3/b2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xk;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object p1

    new-instance v1, Ls3/S1;

    invoke-direct {v1, p2, p0}, Ls3/S1;-><init>(Lk3/e;Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1}, Ls3/V;->o3(Ls3/X1;Ls3/K;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p1, Lk3/m;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v3, "Internal Error."

    const-string v4, "com.google.android.gms.ads"

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lk3/m;-><init>(ILjava/lang/String;Ljava/lang/String;Lk3/b;Lk3/u;)V

    invoke-virtual {p2, p1}, Lk3/e;->a(Lk3/m;)V

    return-void
.end method
