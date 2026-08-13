.class public final Lcom/google/android/gms/internal/ads/TW;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr3/g;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/CC;

.field private final b:Lcom/google/android/gms/internal/ads/XC;

.field private final c:Lcom/google/android/gms/internal/ads/OG;

.field private final d:Lcom/google/android/gms/internal/ads/GG;

.field private final e:Lcom/google/android/gms/internal/ads/ky;

.field final f:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/CC;Lcom/google/android/gms/internal/ads/XC;Lcom/google/android/gms/internal/ads/OG;Lcom/google/android/gms/internal/ads/GG;Lcom/google/android/gms/internal/ads/ky;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/TW;->a:Lcom/google/android/gms/internal/ads/CC;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/TW;->b:Lcom/google/android/gms/internal/ads/XC;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/TW;->c:Lcom/google/android/gms/internal/ads/OG;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/TW;->d:Lcom/google/android/gms/internal/ads/GG;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/TW;->e:Lcom/google/android/gms/internal/ads/ky;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Landroid/view/View;)V
    .locals 3

    .prologue
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->e:Lcom/google/android/gms/internal/ads/ky;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ky;->t()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->d:Lcom/google/android/gms/internal/ads/GG;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/GG;->q1(Landroid/view/View;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->a:Lcom/google/android/gms/internal/ads/CC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/CC;->e0()V

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->b:Lcom/google/android/gms/internal/ads/XC;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/XC;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/TW;->c:Lcom/google/android/gms/internal/ads/OG;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/OG;->a()V

    :cond_0
    return-void
.end method
