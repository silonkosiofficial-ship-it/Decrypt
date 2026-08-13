.class public final Lcom/google/android/gms/internal/ads/BA;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu3/z;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/nD;

.field private final D:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final E:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/nD;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/BA;->C:Lcom/google/android/gms/internal/ads/nD;

    return-void
.end method

.method private final b()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->C:Lcom/google/android/gms/internal/ads/nD;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nD;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final T2()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->C:Lcom/google/android/gms/internal/ads/nD;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/nD;->c()V

    return-void
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/BA;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final d2()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/BA;->b()V

    return-void
.end method

.method public final f3()V
    .locals 0

    return-void
.end method

.method public final p4(I)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/BA;->D:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/BA;->b()V

    return-void
.end method

.method public final q0()V
    .locals 0

    return-void
.end method

.method public final y0()V
    .locals 0

    return-void
.end method
