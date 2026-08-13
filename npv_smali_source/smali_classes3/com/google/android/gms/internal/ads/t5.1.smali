.class public final Lcom/google/android/gms/internal/ads/t5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/u5;

.field private final b:Lcom/google/android/gms/internal/ads/sR;

.field private final c:Lcom/google/android/gms/internal/ads/sR;

.field private final d:Lcom/google/android/gms/internal/ads/RQ;

.field private e:Lcom/google/android/gms/internal/ads/w0;

.field private f:J

.field private g:J

.field private h:Z

.field private i:Z


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/u5;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {p1, v2, v0, v1}, Lcom/google/android/gms/internal/ads/u5;-><init>(ZLjava/lang/String;I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->a:Lcom/google/android/gms/internal/ads/u5;

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->b:Lcom/google/android/gms/internal/ads/sR;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/t5;->g:J

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/RQ;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p1

    array-length v1, p1

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/ads/RQ;-><init>([BI)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/t5;->d:Lcom/google/android/gms/internal/ads/RQ;

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

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/t5;->h:Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->a:Lcom/google/android/gms/internal/ads/u5;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/u5;->d()V

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/t5;->f:J

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 7

    .prologue
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->e:Lcom/google/android/gms/internal/ads/w0;

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object p2

    const/16 v0, 0x800

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Lcom/google/android/gms/internal/ads/u0;->H([BII)I

    move-result p1

    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/t5;->i:Z

    const/4 v0, 0x1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->e:Lcom/google/android/gms/internal/ads/w0;

    new-instance v2, Lcom/google/android/gms/internal/ads/S0;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    invoke-interface {p2, v2}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/t5;->i:Z

    :cond_0
    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/t5;->h:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->a:Lcom/google/android/gms/internal/ads/u5;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/t5;->f:J

    const/4 p2, 0x4

    invoke-virtual {p1, v2, v3, p2}, Lcom/google/android/gms/internal/ads/u5;->e(JI)V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/t5;->h:Z

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->a:Lcom/google/android/gms/internal/ads/u5;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/t5;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/u5;->b(Lcom/google/android/gms/internal/ads/sR;)V

    return v1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 9

    .prologue
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/internal/ads/i0;

    const/16 v4, 0xa

    invoke-virtual {v3, v2, v0, v4, v0}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v2

    const v4, 0x494433

    if-eq v2, v4, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    move-object v2, p1

    check-cast v2, Lcom/google/android/gms/internal/ads/i0;

    invoke-virtual {v2, v1, v0}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/t5;->g:J

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-nez v3, :cond_0

    int-to-long v3, v1

    iput-wide v3, p0, Lcom/google/android/gms/internal/ads/t5;->g:J

    :cond_0
    move v3, v0

    move v5, v3

    move v4, v1

    :cond_1
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    const/4 v7, 0x2

    invoke-virtual {v2, v6, v0, v7, v0}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v6

    invoke-static {v6}, Lcom/google/android/gms/internal/ads/u5;->f(I)Z

    move-result v6

    if-nez v6, :cond_2

    :goto_1
    add-int/lit8 v4, v4, 0x1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    invoke-virtual {v2, v4, v0}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    move v3, v0

    move v5, v3

    goto :goto_3

    :cond_2
    const/4 v6, 0x1

    add-int/2addr v3, v6

    const/4 v7, 0x4

    if-lt v3, v7, :cond_4

    const/16 v8, 0xbc

    if-gt v5, v8, :cond_3

    goto :goto_2

    :cond_3
    return v6

    :cond_4
    :goto_2
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v6

    invoke-virtual {v2, v6, v0, v7, v0}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->d:Lcom/google/android/gms/internal/ads/RQ;

    const/16 v7, 0xe

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/RQ;->l(I)V

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/t5;->d:Lcom/google/android/gms/internal/ads/RQ;

    const/16 v7, 0xd

    invoke-virtual {v6, v7}, Lcom/google/android/gms/internal/ads/RQ;->d(I)I

    move-result v6

    const/4 v7, 0x6

    if-gt v6, v7, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v7, v6, -0x6

    invoke-virtual {v2, v7, v0}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    add-int/2addr v5, v6

    :goto_3
    sub-int v6, v4, v1

    const/16 v7, 0x2000

    if-lt v6, v7, :cond_1

    return v0

    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    const/4 v4, 0x3

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/t5;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->B()I

    move-result v2

    add-int/lit8 v4, v2, 0xa

    add-int/2addr v1, v4

    invoke-virtual {v3, v2, v0}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    goto/16 :goto_0
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t5;->e:Lcom/google/android/gms/internal/ads/w0;

    new-instance v0, Lcom/google/android/gms/internal/ads/n6;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/high16 v3, -0x80000000

    invoke-direct {v0, v3, v1, v2}, Lcom/google/android/gms/internal/ads/n6;-><init>(III)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/t5;->a:Lcom/google/android/gms/internal/ads/u5;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ads/u5;->c(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/n6;)V

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    return-void
.end method
