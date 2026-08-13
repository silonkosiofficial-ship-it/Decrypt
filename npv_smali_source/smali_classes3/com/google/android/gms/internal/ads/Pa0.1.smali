.class final Lcom/google/android/gms/internal/ads/Pa0;
.super Lcom/google/android/gms/internal/ads/Jc;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/il0;

.field final synthetic D:Ls3/I1;

.field final synthetic E:Lcom/google/android/gms/internal/ads/Qa0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Qa0;Lcom/google/android/gms/internal/ads/il0;Ls3/I1;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Pa0;->C:Lcom/google/android/gms/internal/ads/il0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Pa0;->D:Ls3/I1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Pa0;->E:Lcom/google/android/gms/internal/ads/Qa0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Jc;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(I)V
    .locals 0

    return-void
.end method

.method public final B3(Ls3/W0;)V
    .locals 4

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object v0

    invoke-virtual {v0}, Lk3/b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Pa0;->D:Ls3/I1;

    iget-object v1, v1, Ls3/I1;->C:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load app open ad with error parcel: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " for ad unit: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pa0;->E:Lcom/google/android/gms/internal/ads/Qa0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/tb0;->o(Lcom/google/android/gms/internal/ads/tb0;Ls3/W0;)V

    return-void
.end method

.method public final Q0(Lcom/google/android/gms/internal/ads/Hc;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Pa0;->C:Lcom/google/android/gms/internal/ads/il0;

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/Oa0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/il0;)V

    return-void
.end method
