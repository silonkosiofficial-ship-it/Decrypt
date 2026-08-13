.class final Lcom/google/android/gms/internal/ads/Zv0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/Object;J)Ljava/util/List;
    .locals 2

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ads/Sw0;->p(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Sv0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/Sv0;->c()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v1, v1

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/Sv0;->k(I)Lcom/google/android/gms/internal/ads/Sv0;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/google/android/gms/internal/ads/Sw0;->D(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    return-object v0
.end method
