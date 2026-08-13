.class final Lcom/google/android/gms/internal/ads/Si0;
.super Lcom/google/android/gms/internal/ads/hi0;
.source "SourceFile"


# instance fields
.field private final transient E:Lcom/google/android/gms/internal/ads/fi0;

.field private final transient F:Lcom/google/android/gms/internal/ads/ci0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/fi0;Lcom/google/android/gms/internal/ads/ci0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/hi0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Si0;->E:Lcom/google/android/gms/internal/ads/fi0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Si0;->F:Lcom/google/android/gms/internal/ads/ci0;

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->E:Lcom/google/android/gms/internal/ads/fi0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/fi0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method final d([Ljava/lang/Object;I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->F:Lcom/google/android/gms/internal/ads/ci0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/Xh0;->d([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final g()Lcom/google/android/gms/internal/ads/ci0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->F:Lcom/google/android/gms/internal/ads/ci0;

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->F:Lcom/google/android/gms/internal/ads/ci0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ci0;->V(I)Lcom/google/android/gms/internal/ads/kj0;

    move-result-object v0

    return-object v0
.end method

.method public final n()Lcom/google/android/gms/internal/ads/jj0;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->F:Lcom/google/android/gms/internal/ads/ci0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ci0;->V(I)Lcom/google/android/gms/internal/ads/kj0;

    move-result-object v0

    return-object v0
.end method

.method final o()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Si0;->E:Lcom/google/android/gms/internal/ads/fi0;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method
