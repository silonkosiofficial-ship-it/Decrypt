.class public final Lcom/google/android/gms/internal/ads/eo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lcom/google/android/gms/internal/ads/Bq;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lk3/c;

.field private final c:Ls3/f1;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk3/c;Ls3/f1;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eo;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/eo;->b:Lk3/c;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/eo;->c:Ls3/f1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/eo;->d:Ljava/lang/String;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Bq;
    .locals 3

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/eo;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/eo;->e:Lcom/google/android/gms/internal/ads/Bq;

    if-nez v1, :cond_0

    invoke-static {}, Ls3/y;->a()Ls3/w;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/Rl;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/Rl;-><init>()V

    invoke-virtual {v1, p0, v2}, Ls3/w;->o(Landroid/content/Context;Lcom/google/android/gms/internal/ads/Vl;)Lcom/google/android/gms/internal/ads/Bq;

    move-result-object p0

    sput-object p0, Lcom/google/android/gms/internal/ads/eo;->e:Lcom/google/android/gms/internal/ads/Bq;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    sget-object p0, Lcom/google/android/gms/internal/ads/eo;->e:Lcom/google/android/gms/internal/ads/Bq;

    monitor-exit v0

    return-object p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final b(LD3/b;)V
    .locals 11

    .prologue
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/eo;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/eo;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/Bq;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v0, "Internal Error, query info generator is null."

    :goto_0
    invoke-virtual {p1, v0}, LD3/b;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/eo;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/eo;->c:Ls3/f1;

    invoke-static {v3}, LX3/b;->c2(Ljava/lang/Object;)LX3/a;

    move-result-object v3

    if-nez v4, :cond_1

    new-instance v4, Ls3/Y1;

    invoke-direct {v4}, Ls3/Y1;-><init>()V

    invoke-virtual {v4, v0, v1}, Ls3/Y1;->g(J)Ls3/Y1;

    invoke-virtual {v4}, Ls3/Y1;->a()Ls3/X1;

    move-result-object v0

    :goto_1
    move-object v8, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v4, v0, v1}, Ls3/f1;->o(J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eo;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eo;->c:Ls3/f1;

    sget-object v4, Ls3/b2;->a:Ls3/b2;

    invoke-virtual {v4, v0, v1}, Ls3/b2;->a(Landroid/content/Context;Ls3/f1;)Ls3/X1;

    move-result-object v0

    goto :goto_1

    :goto_2
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/eo;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eo;->b:Lk3/c;

    new-instance v1, Lcom/google/android/gms/internal/ads/Fq;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, v1

    invoke-direct/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/Fq;-><init>(Ljava/lang/String;Ljava/lang/String;Ls3/c2;Ls3/X1;ILjava/lang/String;)V

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/co;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/co;-><init>(Lcom/google/android/gms/internal/ads/eo;LD3/b;)V

    invoke-interface {v2, v3, v1, v0}, Lcom/google/android/gms/internal/ads/Bq;->F3(LX3/a;Lcom/google/android/gms/internal/ads/Fq;Lcom/google/android/gms/internal/ads/yq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Internal Error."

    goto :goto_0
.end method
