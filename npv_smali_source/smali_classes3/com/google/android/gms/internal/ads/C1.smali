.class public final Lcom/google/android/gms/internal/ads/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sR;

.field private final b:Lcom/google/android/gms/internal/ads/sR;

.field private final c:Lcom/google/android/gms/internal/ads/sR;

.field private final d:Lcom/google/android/gms/internal/ads/sR;

.field private final e:Lcom/google/android/gms/internal/ads/D1;

.field private f:Lcom/google/android/gms/internal/ads/w0;

.field private g:I

.field private h:Z

.field private i:J

.field private j:I

.field private k:I

.field private l:I

.field private m:J

.field private n:Z

.field private o:Lcom/google/android/gms/internal/ads/B1;

.field private p:Lcom/google/android/gms/internal/ads/G1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sR;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    new-instance v0, Lcom/google/android/gms/internal/ads/D1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/D1;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->e:Lcom/google/android/gms/internal/ads/D1;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/C1;->g:I

    return-void
.end method

.method private final a(Lcom/google/android/gms/internal/ads/u0;)Lcom/google/android/gms/internal/ads/sR;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    iget v1, p0, Lcom/google/android/gms/internal/ads/C1;->l:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->s()I

    move-result v0

    const/4 v2, 0x0

    if-le v1, v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->s()I

    move-result v1

    add-int/2addr v1, v1

    iget v3, p0, Lcom/google/android/gms/internal/ads/C1;->l:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/sR;->j([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    iget v1, p0, Lcom/google/android/gms/internal/ads/C1;->l:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/sR;->k(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    iget v1, p0, Lcom/google/android/gms/internal/ads/C1;->l:I

    invoke-interface {p1, v0, v2, v1}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/C1;->d:Lcom/google/android/gms/internal/ads/sR;

    return-object p1
.end method

.method private final b()V
    .locals 6

    .prologue
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/C1;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    new-instance v1, Lcom/google/android/gms/internal/ads/S0;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v4, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/C1;->n:Z

    :cond_0
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

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/C1;->g:I

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/C1;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lcom/google/android/gms/internal/ads/C1;->g:I

    :goto_0
    iput p2, p0, Lcom/google/android/gms/internal/ads/C1;->j:I

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/LC;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    iget v2, v0, Lcom/google/android/gms/internal/ads/C1;->g:I

    const/4 v3, -0x1

    const/16 v4, 0x9

    const/16 v5, 0x8

    const/4 v6, 0x2

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v2, v9, :cond_e

    const/4 v10, 0x3

    if-eq v2, v6, :cond_d

    if-eq v2, v10, :cond_b

    if-ne v2, v7, :cond_a

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/C1;->h:Z

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/C1;->i:J

    iget-wide v14, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    add-long/2addr v2, v14

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->e:Lcom/google/android/gms/internal/ads/D1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/D1;->d()J

    move-result-wide v2

    cmp-long v2, v2, v12

    if-nez v2, :cond_2

    const-wide/16 v2, 0x0

    goto :goto_1

    :cond_2
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    :goto_1
    iget v14, v0, Lcom/google/android/gms/internal/ads/C1;->k:I

    if-ne v14, v5, :cond_4

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/C1;->o:Lcom/google/android/gms/internal/ads/B1;

    if-eqz v14, :cond_5

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/C1;->b()V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/C1;->o:Lcom/google/android/gms/internal/ads/B1;

    :goto_2
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/C1;->a(Lcom/google/android/gms/internal/ads/u0;)Lcom/google/android/gms/internal/ads/sR;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/google/android/gms/internal/ads/F1;->c(Lcom/google/android/gms/internal/ads/sR;J)Z

    move-result v2

    :cond_3
    :goto_3
    move v3, v9

    goto :goto_4

    :cond_4
    move v5, v14

    :cond_5
    if-ne v5, v4, :cond_6

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/C1;->p:Lcom/google/android/gms/internal/ads/G1;

    if-eqz v4, :cond_7

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/internal/ads/C1;->b()V

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/C1;->p:Lcom/google/android/gms/internal/ads/G1;

    goto :goto_2

    :cond_6
    const/16 v4, 0x12

    if-ne v5, v4, :cond_7

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/C1;->n:Z

    if-nez v4, :cond_7

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/C1;->e:Lcom/google/android/gms/internal/ads/D1;

    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/C1;->a(Lcom/google/android/gms/internal/ads/u0;)Lcom/google/android/gms/internal/ads/sR;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/google/android/gms/internal/ads/F1;->c(Lcom/google/android/gms/internal/ads/sR;J)Z

    move-result v2

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/C1;->e:Lcom/google/android/gms/internal/ads/D1;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/D1;->d()J

    move-result-wide v4

    cmp-long v14, v4, v12

    if-eqz v14, :cond_3

    iget-object v14, v0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    new-instance v15, Lcom/google/android/gms/internal/ads/L0;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/D1;->e()[J

    move-result-object v10

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/D1;->f()[J

    move-result-object v3

    invoke-direct {v15, v10, v3, v4, v5}, Lcom/google/android/gms/internal/ads/L0;-><init>([J[JJ)V

    invoke-interface {v14, v15}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/C1;->n:Z

    goto :goto_3

    :cond_7
    iget v2, v0, Lcom/google/android/gms/internal/ads/C1;->l:I

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    move v2, v8

    move v3, v2

    :goto_4
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/C1;->h:Z

    if-nez v4, :cond_9

    if-eqz v2, :cond_9

    iput-boolean v9, v0, Lcom/google/android/gms/internal/ads/C1;->h:Z

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->e:Lcom/google/android/gms/internal/ads/D1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/D1;->d()J

    move-result-wide v4

    cmp-long v2, v4, v12

    if-nez v2, :cond_8

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    neg-long v10, v4

    goto :goto_5

    :cond_8
    const-wide/16 v10, 0x0

    :goto_5
    iput-wide v10, v0, Lcom/google/android/gms/internal/ads/C1;->i:J

    :cond_9
    iput v7, v0, Lcom/google/android/gms/internal/ads/C1;->j:I

    iput v6, v0, Lcom/google/android/gms/internal/ads/C1;->g:I

    if-eqz v3, :cond_0

    return v8

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_b
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    const/16 v4, 0xb

    invoke-interface {v1, v2, v8, v4, v9}, Lcom/google/android/gms/internal/ads/u0;->J([BIIZ)Z

    move-result v2

    if-nez v2, :cond_c

    return v3

    :cond_c
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/C1;->k:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v2

    iput v2, v0, Lcom/google/android/gms/internal/ads/C1;->l:I

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    int-to-long v5, v2

    or-long v2, v5, v3

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/C1;->m:J

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->c:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v10}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iput v7, v0, Lcom/google/android/gms/internal/ads/C1;->g:I

    goto/16 :goto_0

    :cond_d
    iget v2, v0, Lcom/google/android/gms/internal/ads/C1;->j:I

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    iput v8, v0, Lcom/google/android/gms/internal/ads/C1;->j:I

    iput v10, v0, Lcom/google/android/gms/internal/ads/C1;->g:I

    goto/16 :goto_0

    :cond_e
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    invoke-interface {v1, v2, v8, v4, v9}, Lcom/google/android/gms/internal/ads/u0;->J([BIIZ)Z

    move-result v2

    if-nez v2, :cond_f

    return v3

    :cond_f
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v7}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->C()I

    move-result v2

    and-int/lit8 v3, v2, 0x4

    and-int/2addr v2, v9

    if-eqz v3, :cond_10

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/C1;->o:Lcom/google/android/gms/internal/ads/B1;

    if-nez v3, :cond_10

    new-instance v3, Lcom/google/android/gms/internal/ads/B1;

    iget-object v7, v0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v7, v5, v9}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/google/android/gms/internal/ads/B1;-><init>(Lcom/google/android/gms/internal/ads/a1;)V

    iput-object v3, v0, Lcom/google/android/gms/internal/ads/C1;->o:Lcom/google/android/gms/internal/ads/B1;

    :cond_10
    if-eqz v2, :cond_11

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->p:Lcom/google/android/gms/internal/ads/G1;

    if-nez v2, :cond_11

    new-instance v2, Lcom/google/android/gms/internal/ads/G1;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v3, v4, v6}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/G1;-><init>(Lcom/google/android/gms/internal/ads/a1;)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->p:Lcom/google/android/gms/internal/ads/G1;

    :cond_11
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/C1;->b:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    iput v2, v0, Lcom/google/android/gms/internal/ads/C1;->j:I

    iput v6, v0, Lcom/google/android/gms/internal/ads/C1;->g:I

    goto/16 :goto_0
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/i0;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2, v3}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->E()I

    move-result v0

    const v2, 0x464c56

    if-eq v0, v2, :cond_0

    return v3

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    const/4 v2, 0x2

    invoke-virtual {v1, v0, v3, v2, v3}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->G()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v3

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    const/4 v2, 0x4

    invoke-virtual {v1, v0, v3, v2, v3}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    check-cast p1, Lcom/google/android/gms/internal/ads/i0;

    invoke-virtual {p1, v0, v3}, Lcom/google/android/gms/internal/ads/i0;->g(IZ)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    invoke-virtual {p1, v0, v3, v2, v3}, Lcom/google/android/gms/internal/ads/i0;->L([BIIZ)Z

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/C1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->w()I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v3
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/C1;->f:Lcom/google/android/gms/internal/ads/w0;

    return-void
.end method
