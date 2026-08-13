.class final Lcom/google/android/gms/internal/ads/Zi0;
.super Lcom/google/android/gms/internal/ads/dj0;
.source "SourceFile"


# instance fields
.field final synthetic C:Ljava/util/Set;

.field final synthetic D:Ljava/util/Set;


# direct methods
.method constructor <init>(Ljava/util/Set;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/dj0;-><init>(Lcom/google/android/gms/internal/ads/ej0;)V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d()Lcom/google/android/gms/internal/ads/jj0;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    new-instance v2, Lcom/google/android/gms/internal/ads/Yi0;

    invoke-direct {v2, p0, v0, v1}, Lcom/google/android/gms/internal/ads/Yi0;-><init>(Lcom/google/android/gms/internal/ads/Zi0;Ljava/util/Set;Ljava/util/Set;)V

    return-object v2
.end method

.method public final isEmpty()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    invoke-static {v0, v1}, Ljava/util/Collections;->disjoint(Ljava/util/Collection;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Zi0;->d()Lcom/google/android/gms/internal/ads/jj0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Zi0;->C:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Zi0;->D:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
