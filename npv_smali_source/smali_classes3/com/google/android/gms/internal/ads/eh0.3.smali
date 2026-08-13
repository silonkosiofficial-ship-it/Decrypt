.class final Lcom/google/android/gms/internal/ads/eh0;
.super Lcom/google/android/gms/internal/ads/vi0;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/gh0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gh0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/eh0;->C:Lcom/google/android/gms/internal/ads/gh0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/vi0;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eh0;->C:Lcom/google/android/gms/internal/ads/gh0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/gh0;->E:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/Ah0;->a(Ljava/util/Collection;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eh0;->C:Lcom/google/android/gms/internal/ads/gh0;

    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/fh0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/eh0;->C:Lcom/google/android/gms/internal/ads/gh0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/fh0;-><init>(Lcom/google/android/gms/internal/ads/gh0;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/vi0;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/eh0;->C:Lcom/google/android/gms/internal/ads/gh0;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/gh0;->F:Lcom/google/android/gms/internal/ads/uh0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/uh0;->r(Lcom/google/android/gms/internal/ads/uh0;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
