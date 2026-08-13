.class public final Lcom/google/android/gms/internal/ads/Uz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/uD;
.implements Lcom/google/android/gms/internal/ads/Nb;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/R60;

.field private final D:Lcom/google/android/gms/internal/ads/XC;

.field private final E:Lcom/google/android/gms/internal/ads/DD;

.field private final F:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final G:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/XC;Lcom/google/android/gms/internal/ads/DD;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uz;->C:Lcom/google/android/gms/internal/ads/R60;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Uz;->D:Lcom/google/android/gms/internal/ads/XC;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Uz;->E:Lcom/google/android/gms/internal/ads/DD;

    return-void
.end method

.method private final a()V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->F:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->D:Lcom/google/android/gms/internal/ads/XC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/XC;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final L(Lcom/google/android/gms/internal/ads/Mb;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->C:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-boolean v0, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Uz;->a()V

    :cond_0
    iget-boolean p1, p1, Lcom/google/android/gms/internal/ads/Mb;->j:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Uz;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/Uz;->E:Lcom/google/android/gms/internal/ads/DD;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/DD;->a()V

    :cond_1
    return-void
.end method

.method public final declared-synchronized u()V
    .locals 2

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uz;->C:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->e:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Uz;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
