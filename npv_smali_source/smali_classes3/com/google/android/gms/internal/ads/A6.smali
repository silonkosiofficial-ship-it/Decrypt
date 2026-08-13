.class public final Lcom/google/android/gms/internal/ads/A6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sR;

.field private final b:Lcom/google/android/gms/internal/ads/V0;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/V0;

    const/4 v1, -0x1

    const-string v2, "image/webp"

    invoke-direct {v0, v1, v1, v2}, Lcom/google/android/gms/internal/ads/V0;-><init>(IILjava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->b:Lcom/google/android/gms/internal/ads/V0;

    return-void
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->b:Lcom/google/android/gms/internal/ads/V0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/V0;->e(JJ)V

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->b:Lcom/google/android/gms/internal/ads/V0;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/V0;->i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I

    move-result p1

    return p1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/ads/i0;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v3

    const-wide/32 v5, 0x52494646

    cmp-long v0, v3, v5

    if-nez v0, :cond_0

    invoke-virtual {p1, v1, v2}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sR;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-virtual {p1, v0, v2, v1, v2}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/A6;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->K()J

    move-result-wide v0

    const-wide/32 v3, 0x57454250

    cmp-long p1, v0, v3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/A6;->b:Lcom/google/android/gms/internal/ads/V0;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/V0;->k(Lcom/google/android/gms/internal/ads/w0;)V

    return-void
.end method
