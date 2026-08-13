.class final Lcom/google/android/gms/internal/ads/Ji0;
.super Lcom/google/android/gms/internal/ads/ch0;
.source "SourceFile"


# instance fields
.field final transient H:Lcom/google/android/gms/internal/ads/Tg0;


# direct methods
.method constructor <init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/Tg0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/ch0;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Ji0;->H:Lcom/google/android/gms/internal/ads/Tg0;

    return-void
.end method


# virtual methods
.method final e()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uh0;->n()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method final f()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/uh0;->o()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected final bridge synthetic h()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Ji0;->H:Lcom/google/android/gms/internal/ads/Tg0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Tg0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
