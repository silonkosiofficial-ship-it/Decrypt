.class public final Lcom/google/android/gms/internal/ads/Pp;
.super LF3/a;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/google/android/gms/internal/ads/vp;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/google/android/gms/internal/ads/Np;

.field private final e:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, LF3/a;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Pp;->e:J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Pp;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pp;->c:Landroid/content/Context;

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    invoke-virtual {v0, p1, p2, v1}, Ls3/w;->n(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/vp;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    new-instance p1, Lcom/google/android/gms/internal/ads/Np;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/Np;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pp;->d:Lcom/google/android/gms/internal/ads/Np;

    return-void
.end method


# virtual methods
.method public final a()Lk3/u;
    .locals 3

    .prologue
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/vp;->c()Ls3/U0;

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

.method public final c(Landroid/app/Activity;Lk3/p;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pp;->d:Lcom/google/android/gms/internal/ads/Np;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/Np;->o6(Lk3/p;)V

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pp;->d:Lcom/google/android/gms/internal/ads/Np;

    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/vp;->d3(Lcom/google/android/gms/internal/ads/yp;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    invoke-static {p1}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/google/android/gms/internal/ads/vp;->S2(LX3/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final d(Ls3/f1;LF3/b;)V
    .locals 3

    .prologue
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/Pp;->e:J

    invoke-virtual {p1, v0, v1}, Ls3/f1;->o(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pp;->b:Lcom/google/android/gms/internal/ads/vp;

    sget-object v1, Ls3/b2;->a:Ls3/b2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pp;->c:Landroid/content/Context;

    invoke-virtual {v1, v2, p1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/Op;

    invoke-direct {v1, p2, p0}, Lcom/google/android/gms/internal/ads/Op;-><init>(LF3/b;Lcom/google/android/gms/internal/ads/Pp;)V

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/vp;->m5(Ls3/X1;Lcom/google/android/gms/internal/ads/Cp;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    const-string p2, "#007 Could not call remote method."

    invoke-static {p2, p1}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
