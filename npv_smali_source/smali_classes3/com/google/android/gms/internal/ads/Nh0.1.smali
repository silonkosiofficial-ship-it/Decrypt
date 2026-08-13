.class final Lcom/google/android/gms/internal/ads/Nh0;
.super Lcom/google/android/gms/internal/ads/Rh0;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/Rh0;-><init>(Lcom/google/android/gms/internal/ads/Qh0;)V

    return-void
.end method

.method static final j(I)Lcom/google/android/gms/internal/ads/Rh0;
    .locals 0

    .prologue
    if-gez p0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->h()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-lez p0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->g()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/ads/Rh0;->f()Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final b(II)Lcom/google/android/gms/internal/ads/Rh0;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nh0;->j(I)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/android/gms/internal/ads/Rh0;
    .locals 0

    invoke-interface {p3, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nh0;->j(I)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p1

    return-object p1
.end method

.method public final d(ZZ)Lcom/google/android/gms/internal/ads/Rh0;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nh0;->j(I)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p1

    return-object p1
.end method

.method public final e(ZZ)Lcom/google/android/gms/internal/ads/Rh0;
    .locals 0

    invoke-static {p2, p1}, Ljava/lang/Boolean;->compare(ZZ)I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Nh0;->j(I)Lcom/google/android/gms/internal/ads/Rh0;

    move-result-object p1

    return-object p1
.end method
