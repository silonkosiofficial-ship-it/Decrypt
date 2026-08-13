.class Lcom/google/android/gms/internal/ads/aj0;
.super Lcom/google/android/gms/internal/ads/zh0;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;


# direct methods
.method constructor <init>(Ljava/util/Set;Lcom/google/android/gms/internal/ads/Bg0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zh0;-><init>(Ljava/util/Collection;Lcom/google/android/gms/internal/ads/Bg0;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/fj0;->d(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/fj0;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method
