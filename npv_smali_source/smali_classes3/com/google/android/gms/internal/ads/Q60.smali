.class public final Lcom/google/android/gms/internal/ads/Q60;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LV3/f;

.field private final b:Lcom/google/android/gms/internal/ads/eO;

.field private final c:Ljava/lang/Object;

.field private volatile d:J

.field private volatile e:I


# direct methods
.method public constructor <init>(LV3/f;Lcom/google/android/gms/internal/ads/eO;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/Q60;->d:J

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Q60;->a:LV3/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Q60;->b:Lcom/google/android/gms/internal/ads/eO;

    return-void
.end method

.method private final e()V
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->a:LV3/f;

    invoke-interface {v0}, LV3/f;->a()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Q60;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/Q60;->d:J

    sget-object v5, Lcom/google/android/gms/internal/ads/Af;->P5:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    add-long/2addr v3, v5

    cmp-long v0, v3, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2

    return-void

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private final f(II)V
    .locals 4

    .prologue
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Q60;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->c:Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Q60;->a:LV3/f;

    invoke-interface {v1}, LV3/f;->a()J

    move-result-wide v1

    monitor-enter v0

    :try_start_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    if-eq v3, p1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    iget p1, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_1

    iput-wide v1, p0, Lcom/google/android/gms/internal/ads/Q60;->d:J

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Q60;->f(II)V

    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->Tc:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->b:Lcom/google/android/gms/internal/ads/eO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/eO;->a()Lcom/google/android/gms/internal/ads/dO;

    move-result-object v0

    const-string v2, "action"

    const-string v3, "mbs_state"

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    if-eq v1, p1, :cond_0

    const-string v2, "0"

    goto :goto_0

    :cond_0
    const-string v2, "1"

    :goto_0
    invoke-virtual {v0, v3, v2}, Lcom/google/android/gms/internal/ads/dO;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/dO;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/dO;->g()V

    :cond_1
    const/4 v0, 0x2

    if-eqz p1, :cond_2

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/ads/Q60;->f(II)V

    return-void

    :cond_2
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/Q60;->f(II)V

    return-void
.end method

.method public final c()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Q60;->e()V

    iget v1, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Q60;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Q60;->e()V

    iget v1, p0, Lcom/google/android/gms/internal/ads/Q60;->e:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
