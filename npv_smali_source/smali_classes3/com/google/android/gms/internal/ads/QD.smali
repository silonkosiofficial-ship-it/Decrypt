.class public final Lcom/google/android/gms/internal/ads/QD;
.super Lcom/google/android/gms/internal/ads/BF;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZC;
.implements Lcom/google/android/gms/internal/ads/FD;


# instance fields
.field private final D:Lcom/google/android/gms/internal/ads/R60;

.field private final E:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/R60;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/BF;-><init>(Ljava/util/Set;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/QD;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/QD;->D:Lcom/google/android/gms/internal/ads/R60;

    return-void
.end method

.method private final a()V
    .locals 3

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/ads/Af;->I7:Lcom/google/android/gms/internal/ads/rf;

    invoke-static {}, Ls3/A;->c()Lcom/google/android/gms/internal/ads/yf;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/yf;->a(Lcom/google/android/gms/internal/ads/rf;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QD;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QD;->D:Lcom/google/android/gms/internal/ads/R60;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/R60;->e0:Ls3/e2;

    if-eqz v0, :cond_0

    iget v1, v0, Ls3/e2;->C:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/PD;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/PD;-><init>(Ls3/e2;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/BF;->p1(Lcom/google/android/gms/internal/ads/AF;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final i()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QD;->D:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/QD;->a()V

    :cond_0
    return-void
.end method

.method public final t()V
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/QD;->D:Lcom/google/android/gms/internal/ads/R60;

    iget v0, v0, Lcom/google/android/gms/internal/ads/R60;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/QD;->a()V

    return-void
.end method
