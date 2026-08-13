.class abstract Lcom/google/android/gms/internal/ads/ch0;
.super Lcom/google/android/gms/internal/ads/uh0;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ni0;


# direct methods
.method protected constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/uh0;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method final i(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method final j(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 1

    check-cast p2, Ljava/util/List;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/uh0;->l(Ljava/lang/Object;Ljava/util/List;Lcom/google/android/gms/internal/ads/rh0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
