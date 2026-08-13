.class public final Lcom/google/android/gms/internal/ads/GG;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Nb;


# instance fields
.field private final D:Ljava/util/Map;

.field private final E:Landroid/content/Context;

.field private final F:Lcom/google/android/gms/internal/ads/R60;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    new-instance p2, Ljava/util/WeakHashMap;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GG;->E:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/GG;->F:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method


# virtual methods
.method public final declared-synchronized L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/FG;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/FG;-><init>(Lcom/google/android/gms/internal/ads/Mb;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized q1(Landroid/view/View;)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ob;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->E:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/ads/Ob;

    invoke-direct {v1, v0, p1}, Lcom/google/android/gms/internal/ads/Ob;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/Ob;->c(Lcom/google/android/gms/internal/ads/Nb;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/GG;->F:Lcom/google/android/gms/internal/ads/R60;

    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/R60;->X:Z

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->x1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/ads/Af;->w1:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/Ob;->g(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Ob;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized r1(Landroid/view/View;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Ob;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/Ob;->e(Lcom/google/android/gms/internal/ads/Nb;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GG;->D:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
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
