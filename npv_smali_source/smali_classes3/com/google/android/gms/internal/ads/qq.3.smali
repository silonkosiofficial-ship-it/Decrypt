.class public abstract Lcom/google/android/gms/internal/ads/qq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Lcom/google/android/gms/internal/ads/qq;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/qq;
    .locals 4

    .prologue
    const-class v0, Lcom/google/android/gms/internal/ads/qq;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/qq;->a:Lcom/google/android/gms/internal/ads/qq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/Af;->a(Landroid/content/Context;)V

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v1

    invoke-interface {v1, p0}, Lv3/s0;->t(Landroid/content/Context;)V

    new-instance v2, Lcom/google/android/gms/internal/ads/iq;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/iq;-><init>(Lcom/google/android/gms/internal/ads/kq;)V

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/iq;->b(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/iq;

    invoke-static {}, Lr3/v;->c()LV3/f;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/iq;->c(LV3/f;)Lcom/google/android/gms/internal/ads/iq;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/iq;->a(Lv3/s0;)Lcom/google/android/gms/internal/ads/iq;

    invoke-static {}, Lr3/v;->r()Lcom/google/android/gms/internal/ads/pq;

    move-result-object p0

    invoke-virtual {v2, p0}, Lcom/google/android/gms/internal/ads/iq;->d(Lcom/google/android/gms/internal/ads/pq;)Lcom/google/android/gms/internal/ads/iq;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/iq;->e()Lcom/google/android/gms/internal/ads/qq;

    move-result-object p0

    sput-object p0, Lcom/google/android/gms/internal/ads/qq;->a:Lcom/google/android/gms/internal/ads/qq;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qq;->a()Lcom/google/android/gms/internal/ads/bq;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/bq;->a()V

    sget-object p0, Lcom/google/android/gms/internal/ads/qq;->a:Lcom/google/android/gms/internal/ads/qq;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/qq;->c()Lcom/google/android/gms/internal/ads/uq;

    move-result-object p0

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->E0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Lr3/v;->t()Lv3/E0;

    sget-object v1, Lcom/google/android/gms/internal/ads/Af;->F0:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lv3/E0;->b0(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/uq;->c(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/sq;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/sq;-><init>(Lcom/google/android/gms/internal/ads/uq;Ljava/util/Map;)V

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/uq;->d(Lcom/google/android/gms/internal/ads/sq;)V

    :goto_1
    sget-object p0, Lcom/google/android/gms/internal/ads/qq;->a:Lcom/google/android/gms/internal/ads/qq;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method abstract a()Lcom/google/android/gms/internal/ads/bq;
.end method

.method abstract b()Lcom/google/android/gms/internal/ads/fq;
.end method

.method abstract c()Lcom/google/android/gms/internal/ads/uq;
.end method
