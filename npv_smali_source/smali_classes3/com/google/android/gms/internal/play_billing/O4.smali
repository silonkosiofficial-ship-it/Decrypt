.class final Lcom/google/android/gms/internal/play_billing/O4;
.super Lcom/google/android/gms/internal/play_billing/D1;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/play_billing/D1;-><init>(Lcom/google/android/gms/internal/play_billing/Q4;)V

    return-void
.end method


# virtual methods
.method final a(Lcom/google/android/gms/internal/play_billing/P4;Lcom/google/android/gms/internal/play_billing/P4;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/P4;->b:Lcom/google/android/gms/internal/play_billing/P4;

    return-void
.end method

.method final b(Lcom/google/android/gms/internal/play_billing/P4;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lcom/google/android/gms/internal/play_billing/P4;->a:Ljava/lang/Thread;

    return-void
.end method

.method final c(Lcom/google/android/gms/internal/play_billing/R4;Lcom/google/android/gms/internal/play_billing/w3;Lcom/google/android/gms/internal/play_billing/w3;)Z
    .locals 1

    .prologue
    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/R4;->D:Lcom/google/android/gms/internal/play_billing/w3;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/R4;->D:Lcom/google/android/gms/internal/play_billing/w3;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final d(Lcom/google/android/gms/internal/play_billing/R4;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .prologue
    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/R4;->C:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/R4;->C:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method final e(Lcom/google/android/gms/internal/play_billing/R4;Lcom/google/android/gms/internal/play_billing/P4;Lcom/google/android/gms/internal/play_billing/P4;)Z
    .locals 1

    .prologue
    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lcom/google/android/gms/internal/play_billing/R4;->E:Lcom/google/android/gms/internal/play_billing/P4;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lcom/google/android/gms/internal/play_billing/R4;->E:Lcom/google/android/gms/internal/play_billing/P4;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
