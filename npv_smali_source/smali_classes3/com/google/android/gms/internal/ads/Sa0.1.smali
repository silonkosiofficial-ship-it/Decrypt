.class final Lcom/google/android/gms/internal/ads/Sa0;
.super Ls3/J;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/il0;

.field final synthetic D:Ls3/V;

.field final synthetic E:Lcom/google/android/gms/internal/ads/Ta0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Ta0;Lcom/google/android/gms/internal/ads/il0;Ls3/V;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Sa0;->C:Lcom/google/android/gms/internal/ads/il0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Sa0;->D:Ls3/V;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Sa0;->E:Lcom/google/android/gms/internal/ads/Ta0;

    invoke-direct {p0}, Ls3/J;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sa0;->D:Ls3/V;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Sa0;->C:Lcom/google/android/gms/internal/ads/il0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Oa0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/il0;)V

    return-void
.end method

.method public final x0(Ls3/W0;)V
    .locals 4

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object v0

    invoke-virtual {v0}, Lk3/b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Sa0;->E:Lcom/google/android/gms/internal/ads/Ta0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/tb0;->e:Ls3/I1;

    iget-object v1, v1, Ls3/I1;->C:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load interstitial ad with error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " for ad unit: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Sa0;->E:Lcom/google/android/gms/internal/ads/Ta0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/tb0;->o(Lcom/google/android/gms/internal/ads/tb0;Ls3/W0;)V

    return-void
.end method
