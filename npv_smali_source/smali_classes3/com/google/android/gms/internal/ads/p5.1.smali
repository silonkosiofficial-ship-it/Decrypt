.class public final Lcom/google/android/gms/internal/ads/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/q5;

.field private final b:Lcom/google/android/gms/internal/ads/sR;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/q5;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/q5;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p5;->a:Lcom/google/android/gms/internal/ads/q5;

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0xae2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/p5;->b:Lcom/google/android/gms/internal/ads/sR;

    return-void
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/p5;->c:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p5;->a:Lcom/google/android/gms/internal/ads/q5;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/q5;->d()V

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 4

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/p5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p2

    const/16 v0, 0xae2

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/u0;->H([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/p5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/p5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/p5;->c:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p5;->a:Lcom/google/android/gms/internal/ads/q5;

    const-wide/16 v2, 0x0

    const/4 p2, 0x4

    invoke-virtual {p1, v2, v3, p2}, Lcom/google/android/gms/internal/ads/q5;->e(JI)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/p5;->c:Z

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/p5;->a:Lcom/google/android/gms/internal/ads/q5;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/p5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/q5;->b(Lcom/google/android/gms/internal/ads/sR;)V

    return v1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 8

    .prologue
    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    move-object v5, p1

    check-cast v5, Lcom/google/android/gms/internal/ads/i0;

    invoke-virtual {v5, v4, v2, v1, v2}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v4

    const v6, 0x494433

    if-eq v4, v6, :cond_4

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    move-object v4, p1

    check-cast v4, Lcom/google/android/gms/internal/ads/i0;

    invoke-virtual {v4, v3, v2}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    move v1, v2

    move v5, v3

    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v4, v6, v2, v7, v2}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v6

    const/16 v7, 0xb77

    if-eq v6, v7, :cond_1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    add-int/lit8 v5, v5, 0x1

    sub-int v1, v5, v3

    const/16 v6, 0x2000

    if-ge v1, v6, :cond_0

    invoke-virtual {v4, v5, v2}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    move v1, v2

    goto :goto_1

    :cond_0
    return v2

    :cond_1
    const/4 v6, 0x1

    add-int/2addr v1, v6

    const/4 v7, 0x4

    if-lt v1, v7, :cond_2

    return v6

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/S;->b([B)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_3

    return v2

    :cond_3
    add-int/lit8 v6, v6, -0x6

    invoke-virtual {v4, v6, v2}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    goto :goto_1

    :cond_4
    const/4 v4, 0x3

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->B()I

    move-result v4

    add-int/lit8 v6, v4, 0xa

    add-int/2addr v3, v6

    invoke-virtual {v5, v4, v2}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    goto :goto_0
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/n6;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/high16 v3, -0x80000000

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/n6;-><init>(III)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/p5;->a:Lcom/google/android/gms/internal/ads/q5;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/q5;->c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    new-instance v0, Lcom/google/android/gms/internal/ads/S0;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    return-void
.end method
