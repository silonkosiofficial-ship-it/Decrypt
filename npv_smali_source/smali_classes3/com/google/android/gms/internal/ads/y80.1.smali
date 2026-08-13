.class public final Lcom/google/android/gms/internal/ads/y80;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/b80;

.field private final b:Lcom/google/android/gms/internal/ads/w80;

.field private final c:Lcom/google/android/gms/internal/ads/X70;

.field private final d:Ljava/util/ArrayDeque;

.field private e:Lcom/google/android/gms/internal/ads/E80;

.field private f:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/X70;Lcom/google/android/gms/internal/ads/w80;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/y80;->f:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y80;->a:Lcom/google/android/gms/internal/ads/b80;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/y80;->c:Lcom/google/android/gms/internal/ads/X70;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/y80;->b:Lcom/google/android/gms/internal/ads/w80;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    new-instance p1, Lcom/google/android/gms/internal/ads/t80;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/t80;-><init>(Lcom/google/android/gms/internal/ads/y80;)V

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/X70;->b(Lcom/google/android/gms/internal/ads/t80;)V

    return-void
.end method

.method static bridge synthetic b(Lcom/google/android/gms/internal/ads/y80;)Ljava/util/ArrayDeque;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    return-object p0
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/y80;Lcom/google/android/gms/internal/ads/E80;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/y80;->e:Lcom/google/android/gms/internal/ads/E80;

    return-void
.end method

.method static bridge synthetic d(Lcom/google/android/gms/internal/ads/y80;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/y80;->h()V

    return-void
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/y80;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/y80;->f:I

    return p0
.end method

.method private final declared-synchronized h()V
    .locals 4

    .prologue
    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->e6:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Uq;->j()Lv3/s0;

    move-result-object v0

    invoke-interface {v0}, Lv3/s0;->i()Lcom/google/android/gms/internal/ads/Oq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Oq;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/y80;->i()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/x80;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/y80;->a:Lcom/google/android/gms/internal/ads/b80;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/x80;->a()Lcom/google/android/gms/internal/ads/m80;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/b80;->b(Lcom/google/android/gms/internal/ads/m80;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/y80;->a:Lcom/google/android/gms/internal/ads/b80;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/y80;->b:Lcom/google/android/gms/internal/ads/w80;

    new-instance v3, Lcom/google/android/gms/internal/ads/E80;

    invoke-direct {v3, v1, v2, v0}, Lcom/google/android/gms/internal/ads/E80;-><init>(Lcom/google/android/gms/internal/ads/b80;Lcom/google/android/gms/internal/ads/w80;Lcom/google/android/gms/internal/ads/x80;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/y80;->e:Lcom/google/android/gms/internal/ads/E80;

    new-instance v1, Lcom/google/android/gms/internal/ads/u80;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/ads/u80;-><init>(Lcom/google/android/gms/internal/ads/y80;Lcom/google/android/gms/internal/ads/x80;)V

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/E80;->d(Lcom/google/android/gms/internal/ads/Jk0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method private final declared-synchronized i()Z
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->e:Lcom/google/android/gms/internal/ads/E80;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x2

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/ads/y80;->f:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/y80;->i()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->e:Lcom/google/android/gms/internal/ads/E80;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/E80;->a(Lcom/google/android/gms/internal/ads/x80;)LP4/d;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized e(Lcom/google/android/gms/internal/ads/x80;)V
    .locals 1

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/y80;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
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

.method final synthetic f()V
    .locals 1

    .prologue
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/ads/y80;->f:I

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/y80;->h()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
