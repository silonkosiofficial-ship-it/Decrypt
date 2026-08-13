.class public final Lcom/google/android/gms/internal/ads/dz0;
.super Lcom/google/android/gms/internal/ads/Vy0;
.source "SourceFile"


# direct methods
.method synthetic constructor <init>(ILcom/google/android/gms/internal/ads/cz0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/Vy0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/dz0;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Vy0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/kz0;)Lcom/google/android/gms/internal/ads/Vy0;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/ez0;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/ez0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Vy0;->a:Ljava/util/LinkedHashMap;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/ez0;-><init>(Ljava/util/Map;Lcom/google/android/gms/internal/ads/cz0;)V

    return-object v0
.end method
