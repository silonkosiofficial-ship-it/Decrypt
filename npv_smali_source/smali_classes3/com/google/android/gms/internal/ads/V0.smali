.class public final Lcom/google/android/gms/internal/ads/V0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Lcom/google/android/gms/internal/ads/w0;

.field private g:Lcom/google/android/gms/internal/ads/a1;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/V0;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/V0;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/V0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 0

    .prologue
    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, Lcom/google/android/gms/internal/ads/V0;->e:I

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/V0;->e:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/V0;->d:I

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 9

    .prologue
    iget p2, p0, Lcom/google/android/gms/internal/ads/V0;->e:I

    const/4 v0, -0x1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    if-ne p2, v1, :cond_0

    return v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/V0;->g:Lcom/google/android/gms/internal/ads/a1;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v3, 0x400

    invoke-interface {p2, p1, v3, v2}, Lcom/google/android/gms/internal/ads/a1;->e(Lcom/google/android/gms/internal/ads/qB0;IZ)I

    move-result p1

    const/4 p2, 0x0

    if-ne p1, v0, :cond_2

    iput v1, p0, Lcom/google/android/gms/internal/ads/V0;->e:I

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/V0;->g:Lcom/google/android/gms/internal/ads/a1;

    iget v6, p0, Lcom/google/android/gms/internal/ads/V0;->d:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    invoke-interface/range {v2 .. v8}, Lcom/google/android/gms/internal/ads/a1;->b(JIIILcom/google/android/gms/internal/ads/Z0;)V

    iput p2, p0, Lcom/google/android/gms/internal/ads/V0;->d:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/V0;->d:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/V0;->d:I

    :goto_0
    return p2
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 5

    .prologue
    iget v0, p0, Lcom/google/android/gms/internal/ads/V0;->a:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/V0;->b:I

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LC;->f(Z)V

    iget v0, p0, Lcom/google/android/gms/internal/ads/V0;->b:I

    new-instance v3, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v3, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    iget v4, p0, Lcom/google/android/gms/internal/ads/V0;->b:I

    check-cast p1, Lcom/google/android/gms/internal/ads/i0;

    invoke-virtual {p1, v0, v2, v4, v2}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/V0;->a:I

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    return v2
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/V0;->f:Lcom/google/android/gms/internal/ads/w0;

    const/16 v0, 0x400

    const/4 v1, 0x4

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/V0;->g:Lcom/google/android/gms/internal/ads/a1;

    new-instance v0, Lcom/google/android/gms/internal/ads/oK0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/oK0;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/V0;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/oK0;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/V0;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/V0;->f:Lcom/google/android/gms/internal/ads/w0;

    new-instance v0, Lcom/google/android/gms/internal/ads/W0;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/W0;-><init>(J)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/V0;->e:I

    return-void
.end method
