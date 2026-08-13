.class final Lv3/L;
.super Lcom/google/android/gms/internal/ads/H7;
.source "SourceFile"


# instance fields
.field final synthetic Q:[B

.field final synthetic R:Ljava/util/Map;

.field final synthetic S:Lw3/m;


# direct methods
.method constructor <init>(Lv3/Q;ILjava/lang/String;Lcom/google/android/gms/internal/ads/g7;Lcom/google/android/gms/internal/ads/f7;[BLjava/util/Map;Lw3/m;)V
    .locals 0

    iput-object p6, p0, Lv3/L;->Q:[B

    iput-object p7, p0, Lv3/L;->R:Ljava/util/Map;

    iput-object p8, p0, Lv3/L;->S:Lw3/m;

    invoke-direct {p0, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/H7;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/g7;Lcom/google/android/gms/internal/ads/f7;)V

    return-void
.end method


# virtual methods
.method public final G()[B
    .locals 1

    .prologue
    iget-object v0, p0, Lv3/L;->Q:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method protected final I(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv3/L;->S:Lw3/m;

    invoke-virtual {v0, p1}, Lw3/m;->g(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/android/gms/internal/ads/H7;->I(Ljava/lang/String;)V

    return-void
.end method

.method public final u()Ljava/util/Map;
    .locals 1

    .prologue
    iget-object v0, p0, Lv3/L;->R:Ljava/util/Map;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final bridge synthetic x(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/H7;->I(Ljava/lang/String;)V

    return-void
.end method
