.class public final Lcom/google/android/gms/internal/ads/vq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Lcom/google/android/gms/internal/ads/tq0;

.field private final c:Ljava/lang/Class;

.field private final d:Lcom/google/android/gms/internal/ads/Cp0;


# direct methods
.method synthetic constructor <init>(Ljava/util/Map;Ljava/util/List;Lcom/google/android/gms/internal/ads/tq0;Lcom/google/android/gms/internal/ads/Cp0;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/uq0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/vq0;->a:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/vq0;->b:Lcom/google/android/gms/internal/ads/tq0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/vq0;->c:Ljava/lang/Class;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/vq0;->d:Lcom/google/android/gms/internal/ads/Cp0;

    return-void
.end method

.method public static b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/sq0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/sq0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/sq0;-><init>(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/uq0;)V

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/Cp0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->d:Lcom/google/android/gms/internal/ads/Cp0;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/tq0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->b:Lcom/google/android/gms/internal/ads/tq0;

    return-object v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public final e()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final f([B)Ljava/util/List;
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->a:Ljava/util/Map;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Lu0;->b([B)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g()Z
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/vq0;->d:Lcom/google/android/gms/internal/ads/Cp0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Cp0;->a()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
