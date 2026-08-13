.class final Lcom/google/android/gms/internal/ads/lo0;
.super Lcom/google/android/gms/internal/ads/Sh0;
.source "SourceFile"


# instance fields
.field private final C:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Sh0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Sh0;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Sh0;->r(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/kn0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/kn0;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/fj0;->c(Ljava/util/Set;Lcom/google/android/gms/internal/ads/Bg0;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .prologue
    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/Sh0;->s(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/Sh0;->q()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_2

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/Sh0;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-super {p0, v0}, Lcom/google/android/gms/internal/ads/Sh0;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v2

    :cond_1
    move v1, v2

    :cond_2
    :goto_0
    return v1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/Kn0;

    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/Kn0;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/fj0;->c(Ljava/util/Set;Lcom/google/android/gms/internal/ads/Bg0;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    return-object v0
.end method

.method protected final o()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lo0;->C:Ljava/util/Map;

    return-object v0
.end method

.method public final size()I
    .locals 2

    invoke-super {p0}, Lcom/google/android/gms/internal/ads/Sh0;->size()I

    move-result v0

    const/4 v1, 0x0

    invoke-super {p0, v1}, Lcom/google/android/gms/internal/ads/Sh0;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
