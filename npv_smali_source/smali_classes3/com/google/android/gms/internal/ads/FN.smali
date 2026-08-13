.class public final Lcom/google/android/gms/internal/ads/FN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/w90;


# instance fields
.field private final C:Ljava/util/Map;

.field private final D:Lcom/google/android/gms/internal/ads/od;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/od;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/FN;->D:Lcom/google/android/gms/internal/ads/od;

    return-void
.end method


# virtual methods
.method public final i(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->D:Lcom/google/android/gms/internal/ads/od;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {p3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/EN;

    iget p1, p1, Lcom/google/android/gms/internal/ads/EN;->c:I

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/od;->c(I)V

    :cond_0
    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->D:Lcom/google/android/gms/internal/ads/od;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/EN;

    iget p1, p1, Lcom/google/android/gms/internal/ads/EN;->b:I

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/od;->c(I)V

    :cond_0
    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/ads/p90;Ljava/lang/String;)V
    .locals 1

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/FN;->D:Lcom/google/android/gms/internal/ads/od;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/FN;->C:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/EN;

    iget p1, p1, Lcom/google/android/gms/internal/ads/EN;->a:I

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/od;->c(I)V

    :cond_0
    return-void
.end method
