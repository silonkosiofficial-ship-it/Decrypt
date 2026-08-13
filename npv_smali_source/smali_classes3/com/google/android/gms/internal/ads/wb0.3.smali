.class final Lcom/google/android/gms/internal/ads/wb0;
.super Lcom/google/android/gms/internal/ads/Bp;
.source "SourceFile"


# instance fields
.field final synthetic C:Lcom/google/android/gms/internal/ads/il0;

.field final synthetic D:Lcom/google/android/gms/internal/ads/vp;

.field final synthetic E:Lcom/google/android/gms/internal/ads/xb0;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/xb0;Lcom/google/android/gms/internal/ads/il0;Lcom/google/android/gms/internal/ads/vp;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/wb0;->C:Lcom/google/android/gms/internal/ads/il0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/wb0;->D:Lcom/google/android/gms/internal/ads/vp;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/wb0;->E:Lcom/google/android/gms/internal/ads/xb0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/Bp;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(I)V
    .locals 0

    return-void
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb0;->D:Lcom/google/android/gms/internal/ads/vp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wb0;->C:Lcom/google/android/gms/internal/ads/il0;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/Oa0;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/il0;)V

    return-void
.end method

.method public final x(Ls3/W0;)V
    .locals 4

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object v0

    invoke-virtual {v0}, Lk3/b;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/wb0;->E:Lcom/google/android/gms/internal/ads/xb0;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/tb0;->e:Ls3/I1;

    iget-object v1, v1, Ls3/I1;->C:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to load rewarded ad with error: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", adUnitId: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lw3/p;->g(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/wb0;->E:Lcom/google/android/gms/internal/ads/xb0;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/tb0;->o(Lcom/google/android/gms/internal/ads/tb0;Ls3/W0;)V

    return-void
.end method
