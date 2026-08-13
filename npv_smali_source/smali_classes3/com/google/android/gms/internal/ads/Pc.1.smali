.class public final Lcom/google/android/gms/internal/ads/Pc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ls3/V;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Ls3/f1;

.field private final e:I

.field private final f:Lm3/a$a;

.field private final g:Lcom/google/android/gms/internal/ads/Rl;

.field private final h:Ls3/b2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ls3/f1;ILm3/a$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Pc;->g:Lcom/google/android/gms/internal/ads/Rl;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pc;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Pc;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Pc;->d:Ls3/f1;

    iput p4, p0, Lcom/google/android/gms/internal/ads/Pc;->e:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/Pc;->f:Lm3/a$a;

    sget-object p1, Ls3/b2;->a:Ls3/b2;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pc;->h:Ls3/b2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Ls3/c2;->f()Ls3/c2;

    move-result-object v2

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/Pc;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/Pc;->c:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Pc;->g:Lcom/google/android/gms/internal/ads/Rl;

    invoke-virtual {v3, v4, v2, v5, v6}, Ls3/w;->d(Landroid/content/Context;Ls3/c2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Vl;)Ls3/V;

    move-result-object v2

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/Pc;->a:Ls3/V;

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/google/android/gms/internal/ads/Pc;->e:I

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    new-instance v2, Ls3/i2;

    iget v3, p0, Lcom/google/android/gms/internal/ads/Pc;->e:I

    invoke-direct {v2, v3}, Ls3/i2;-><init>(I)V

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Pc;->a:Ls3/V;

    invoke-interface {v3, v2}, Ls3/V;->V0(Ls3/i2;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pc;->d:Ls3/f1;

    invoke-virtual {v2, v0, v1}, Ls3/f1;->o(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pc;->a:Ls3/V;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ac;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pc;->f:Lm3/a$a;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Pc;->c:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/Ac;-><init>(Lm3/a$a;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ls3/V;->I5(Lcom/google/android/gms/internal/ads/Kc;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pc;->a:Ls3/V;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pc;->h:Ls3/b2;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Pc;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Pc;->d:Ls3/f1;

    invoke-virtual {v1, v2, v3}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object v1

    invoke-interface {v0, v1}, Ls3/V;->K3(Ls3/X1;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_1
    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lw3/p;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
