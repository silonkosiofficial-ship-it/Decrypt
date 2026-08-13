.class final Lcom/google/android/gms/internal/ads/Kg0;
.super Lcom/google/android/gms/internal/ads/Og0;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Lg0;Lcom/google/android/gms/internal/ads/Qg0;Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ads/Og0;-><init>(Lcom/google/android/gms/internal/ads/Qg0;Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final c(I)I
    .locals 0

    return p1
.end method

.method public final d(I)I
    .locals 1

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Og0;->E:Ljava/lang/CharSequence;

    add-int/lit16 p1, p1, 0xfa0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method
