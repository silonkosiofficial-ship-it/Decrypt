.class public final Lcom/google/android/gms/internal/ads/Zp0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lcom/google/android/gms/internal/ads/Zp0;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/Xp0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Xp0;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Jq0;->a(Lcom/google/android/gms/internal/ads/Iq0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Zp0;

    sput-object v0, Lcom/google/android/gms/internal/ads/Zp0;->b:Lcom/google/android/gms/internal/ads/Zp0;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/google/android/gms/internal/ads/Dq0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Dq0;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/ads/Hq0;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/google/android/gms/internal/ads/Hq0;-><init>(Lcom/google/android/gms/internal/ads/Dq0;Lcom/google/android/gms/internal/ads/Gq0;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static c()Lcom/google/android/gms/internal/ads/Zp0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/Zp0;->b:Lcom/google/android/gms/internal/ads/Zp0;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Cq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/El0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Hq0;->a(Lcom/google/android/gms/internal/ads/Cq0;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/El0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/ads/Cq0;)Lcom/google/android/gms/internal/ads/Sl0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Hq0;->b(Lcom/google/android/gms/internal/ads/Cq0;)Lcom/google/android/gms/internal/ads/Sl0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Cq0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/Hq0;->c(Lcom/google/android/gms/internal/ads/El0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/Wl0;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Cq0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Hq0;->d(Lcom/google/android/gms/internal/ads/Sl0;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/Cq0;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized f(Lcom/google/android/gms/internal/ads/rp0;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Dq0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Dq0;-><init>(Lcom/google/android/gms/internal/ads/Hq0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Dq0;->a(Lcom/google/android/gms/internal/ads/rp0;)Lcom/google/android/gms/internal/ads/Dq0;

    new-instance p1, Lcom/google/android/gms/internal/ads/Hq0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Hq0;-><init>(Lcom/google/android/gms/internal/ads/Dq0;Lcom/google/android/gms/internal/ads/Gq0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
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

.method public final declared-synchronized g(Lcom/google/android/gms/internal/ads/vp0;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Dq0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Dq0;-><init>(Lcom/google/android/gms/internal/ads/Hq0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Dq0;->b(Lcom/google/android/gms/internal/ads/vp0;)Lcom/google/android/gms/internal/ads/Dq0;

    new-instance p1, Lcom/google/android/gms/internal/ads/Hq0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Hq0;-><init>(Lcom/google/android/gms/internal/ads/Dq0;Lcom/google/android/gms/internal/ads/Gq0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
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

.method public final declared-synchronized h(Lcom/google/android/gms/internal/ads/eq0;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Dq0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Dq0;-><init>(Lcom/google/android/gms/internal/ads/Hq0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Dq0;->c(Lcom/google/android/gms/internal/ads/eq0;)Lcom/google/android/gms/internal/ads/Dq0;

    new-instance p1, Lcom/google/android/gms/internal/ads/Hq0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Hq0;-><init>(Lcom/google/android/gms/internal/ads/Dq0;Lcom/google/android/gms/internal/ads/Gq0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
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

.method public final declared-synchronized i(Lcom/google/android/gms/internal/ads/iq0;)V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/Dq0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/Dq0;-><init>(Lcom/google/android/gms/internal/ads/Hq0;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Dq0;->d(Lcom/google/android/gms/internal/ads/iq0;)Lcom/google/android/gms/internal/ads/Dq0;

    new-instance p1, Lcom/google/android/gms/internal/ads/Hq0;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/google/android/gms/internal/ads/Hq0;-><init>(Lcom/google/android/gms/internal/ads/Dq0;Lcom/google/android/gms/internal/ads/Gq0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
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

.method public final j(Lcom/google/android/gms/internal/ads/Cq0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Hq0;->i(Lcom/google/android/gms/internal/ads/Cq0;)Z

    move-result p1

    return p1
.end method

.method public final k(Lcom/google/android/gms/internal/ads/Cq0;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zp0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Hq0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/Hq0;->j(Lcom/google/android/gms/internal/ads/Cq0;)Z

    move-result p1

    return p1
.end method
