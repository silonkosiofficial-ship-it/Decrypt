.class final Lcom/google/android/gms/internal/ads/zw0;
.super Lcom/google/android/gms/internal/ads/Yu0;
.source "SourceFile"


# instance fields
.field final C:Lcom/google/android/gms/internal/ads/Bw0;

.field D:Lcom/google/android/gms/internal/ads/av0;

.field final synthetic E:Lcom/google/android/gms/internal/ads/Dw0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Dw0;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zw0;->E:Lcom/google/android/gms/internal/ads/Dw0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Yu0;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Bw0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/Bw0;-><init>(Lcom/google/android/gms/internal/ads/fv0;Lcom/google/android/gms/internal/ads/Cw0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zw0;->C:Lcom/google/android/gms/internal/ads/Bw0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zw0;->b()Lcom/google/android/gms/internal/ads/av0;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zw0;->D:Lcom/google/android/gms/internal/ads/av0;

    return-void
.end method

.method private final b()Lcom/google/android/gms/internal/ads/av0;
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw0;->C:Lcom/google/android/gms/internal/ads/Bw0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bw0;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Bw0;->b()Lcom/google/android/gms/internal/ads/bv0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/fv0;->Q()Lcom/google/android/gms/internal/ads/av0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final a()B
    .locals 2

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw0;->D:Lcom/google/android/gms/internal/ads/av0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/av0;->a()B

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zw0;->D:Lcom/google/android/gms/internal/ads/av0;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zw0;->b()Lcom/google/android/gms/internal/ads/av0;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zw0;->D:Lcom/google/android/gms/internal/ads/av0;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw0;->D:Lcom/google/android/gms/internal/ads/av0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
