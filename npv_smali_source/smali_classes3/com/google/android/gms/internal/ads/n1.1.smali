.class public final Lcom/google/android/gms/internal/ads/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/t0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/sR;

.field private final b:Lcom/google/android/gms/internal/ads/l1;

.field private final c:Z

.field private final d:Lcom/google/android/gms/internal/ads/q4;

.field private e:I

.field private f:Lcom/google/android/gms/internal/ads/w0;

.field private g:Lcom/google/android/gms/internal/ads/o1;

.field private h:J

.field private i:[Lcom/google/android/gms/internal/ads/q1;

.field private j:J

.field private k:Lcom/google/android/gms/internal/ads/q1;

.field private l:I

.field private m:J

.field private n:J

.field private o:I

.field private p:Z


# direct methods
.method public constructor <init>(ILcom/google/android/gms/internal/ads/q4;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/n1;->d:Lcom/google/android/gms/internal/ads/q4;

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    const/4 v0, 0x0

    if-eq p2, p1, :cond_0

    move p2, v0

    :cond_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/n1;->c:Z

    new-instance p1, Lcom/google/android/gms/internal/ads/sR;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    new-instance p1, Lcom/google/android/gms/internal/ads/l1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/l1;-><init>(Lcom/google/android/gms/internal/ads/m1;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    new-instance p1, Lcom/google/android/gms/internal/ads/O0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/O0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    new-array p1, v0, [Lcom/google/android/gms/internal/ads/q1;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/n1;->m:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/n1;->n:J

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/n1;->l:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/n1;->h:J

    return-void
.end method

.method static bridge synthetic a(Lcom/google/android/gms/internal/ads/n1;)[Lcom/google/android/gms/internal/ads/q1;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    return-object p0
.end method

.method private final b(I)Lcom/google/android/gms/internal/ads/q1;
    .locals 5

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/q1;->f(I)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final synthetic c()Lcom/google/android/gms/internal/ads/t0;
    .locals 0

    return-object p0
.end method

.method public final e(JJ)V
    .locals 3

    .prologue
    const-wide/16 p3, -0x1

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/n1;->j:J

    const/4 p3, 0x0

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/n1;->k:Lcom/google/android/gms/internal/ads/q1;

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    array-length p4, p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p4, :cond_0

    aget-object v2, p3, v1

    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/q1;->e(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    array-length p1, p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/n1;->e:I

    return-void

    :cond_2
    const/4 p1, 0x6

    iput p1, p0, Lcom/google/android/gms/internal/ads/n1;->e:I

    return-void
.end method

.method public final synthetic f()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/ads/ci0;->O()Lcom/google/android/gms/internal/ads/ci0;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lcom/google/android/gms/internal/ads/u0;Lcom/google/android/gms/internal/ads/Q0;)I
    .locals 27

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v6, :cond_2

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v9

    cmp-long v6, v2, v9

    if-ltz v6, :cond_0

    const-wide/32 v11, 0x40000

    add-long/2addr v11, v9

    cmp-long v6, v2, v11

    if-lez v6, :cond_1

    :cond_0
    move-object/from16 v6, p2

    goto :goto_0

    :cond_1
    sub-long/2addr v2, v9

    long-to-int v2, v2

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :cond_2
    move v2, v8

    goto :goto_1

    :goto_0
    iput-wide v2, v6, Lcom/google/android/gms/internal/ads/Q0;->a:J

    move v2, v7

    :goto_1
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    if-eqz v2, :cond_3

    return v7

    :cond_3
    iget v2, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    const/16 v3, 0xc

    const/4 v6, 0x0

    if-eqz v2, :cond_2c

    const v9, 0x6c726468

    const v10, 0x5453494c

    const/4 v11, 0x2

    if-eq v2, v7, :cond_29

    const/4 v12, 0x3

    if-eq v2, v11, :cond_1d

    const v9, 0x69766f6d

    const/4 v11, 0x6

    const/4 v13, 0x4

    const-wide/16 v16, 0x8

    const/16 v14, 0x10

    if-eq v2, v12, :cond_15

    const/4 v4, 0x5

    const/16 v5, 0x8

    if-eq v2, v13, :cond_13

    if-eq v2, v4, :cond_c

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v11

    iget-wide v13, v0, Lcom/google/android/gms/internal/ads/n1;->n:J

    cmp-long v2, v11, v13

    if-ltz v2, :cond_4

    const/4 v8, -0x1

    goto/16 :goto_4

    :cond_4
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->k:Lcom/google/android/gms/internal/ads/q1;

    if-eqz v2, :cond_6

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/q1;->g(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_4

    :cond_5
    iput-object v6, v0, Lcom/google/android/gms/internal/ads/n1;->k:Lcom/google/android/gms/internal/ads/q1;

    return v8

    :cond_6
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v11

    const-wide/16 v13, 0x1

    and-long/2addr v11, v13

    cmp-long v2, v11, v13

    if-nez v2, :cond_7

    invoke-interface {v1, v7}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    :cond_7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    invoke-interface {v1, v2, v8, v3}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v2

    if-ne v2, v10, :cond_9

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v2

    if-ne v2, v9, :cond_8

    goto :goto_2

    :cond_8
    move v3, v5

    :goto_2
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    goto :goto_4

    :cond_9
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v3

    const v4, 0x4b4e554a    # 1.352225E7f

    if-ne v2, v4, :cond_a

    int-to-long v2, v3

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v4

    add-long/2addr v4, v2

    add-long v4, v4, v16

    :goto_3
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    goto :goto_4

    :cond_a
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/n1;->b(I)Lcom/google/android/gms/internal/ads/q1;

    move-result-object v2

    if-nez v2, :cond_b

    int-to-long v2, v3

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v4

    add-long/2addr v4, v2

    goto :goto_3

    :cond_b
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/q1;->d(I)V

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->k:Lcom/google/android/gms/internal/ads/q1;

    :goto_4
    return v8

    :cond_c
    new-instance v2, Lcom/google/android/gms/internal/ads/sR;

    iget v3, v0, Lcom/google/android/gms/internal/ads/n1;->o:I

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v3

    iget v4, v0, Lcom/google/android/gms/internal/ads/n1;->o:I

    invoke-interface {v1, v3, v8, v4}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v1

    if-ge v1, v14, :cond_d

    const-wide/16 v18, 0x0

    goto :goto_6

    :cond_d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->t()I

    move-result v1

    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v3

    int-to-long v3, v3

    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/n1;->m:J

    cmp-long v3, v3, v5

    if-lez v3, :cond_e

    const-wide/16 v18, 0x0

    goto :goto_5

    :cond_e
    add-long v3, v5, v16

    move-wide/from16 v18, v3

    :goto_5
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    :cond_f
    :goto_6
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->r()I

    move-result v1

    if-lt v1, v14, :cond_11

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v1

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v4

    int-to-long v4, v4

    add-long v4, v4, v18

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/n1;->b(I)Lcom/google/android/gms/internal/ads/q1;

    move-result-object v1

    if-eqz v1, :cond_f

    and-int/2addr v3, v14

    if-ne v3, v14, :cond_10

    move v3, v7

    goto :goto_7

    :cond_10
    move v3, v8

    :goto_7
    invoke-virtual {v1, v4, v5, v3}, Lcom/google/android/gms/internal/ads/q1;->b(JZ)V

    goto :goto_6

    :cond_11
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    array-length v2, v1

    move v3, v8

    :goto_8
    if-ge v3, v2, :cond_12

    aget-object v4, v1, v3

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/q1;->c()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_12
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/n1;->p:Z

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    new-instance v2, Lcom/google/android/gms/internal/ads/k1;

    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/n1;->h:J

    invoke-direct {v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/k1;-><init>(Lcom/google/android/gms/internal/ads/n1;J)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    iput v11, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/n1;->m:J

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    return v8

    :cond_13
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    invoke-interface {v1, v2, v8, v5}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v3

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v2

    const v5, 0x31786469

    if-ne v3, v5, :cond_14

    iput v4, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    iput v2, v0, Lcom/google/android/gms/internal/ads/n1;->o:I

    goto :goto_9

    :cond_14
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v3

    int-to-long v1, v2

    add-long/2addr v3, v1

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    :goto_9
    return v8

    :cond_15
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/n1;->m:J

    cmp-long v2, v11, v4

    if-eqz v2, :cond_17

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v4

    cmp-long v2, v4, v11

    if-nez v2, :cond_16

    goto :goto_a

    :cond_16
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    return v8

    :cond_17
    :goto_a
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    invoke-interface {v1, v2, v8, v3}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->j()V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/l1;->a(Lcom/google/android/gms/internal/ads/sR;)V

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v2

    iget v4, v4, Lcom/google/android/gms/internal/ads/l1;->a:I

    const v5, 0x46464952

    if-ne v4, v5, :cond_18

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    return v8

    :cond_18
    if-ne v4, v10, :cond_1c

    if-eq v2, v9, :cond_19

    goto :goto_c

    :cond_19
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/n1;->m:J

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    iget v4, v4, Lcom/google/android/gms/internal/ads/l1;->b:I

    int-to-long v4, v4

    add-long/2addr v2, v4

    add-long v2, v2, v16

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/n1;->n:J

    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/n1;->p:Z

    if-nez v4, :cond_1b

    iget-object v4, v0, Lcom/google/android/gms/internal/ads/n1;->g:Lcom/google/android/gms/internal/ads/o1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v4, Lcom/google/android/gms/internal/ads/o1;->b:I

    and-int/2addr v4, v14

    if-eq v4, v14, :cond_1a

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    new-instance v3, Lcom/google/android/gms/internal/ads/S0;

    iget-wide v4, v0, Lcom/google/android/gms/internal/ads/n1;->h:J

    const-wide/16 v9, 0x0

    invoke-direct {v3, v4, v5, v9, v10}, Lcom/google/android/gms/internal/ads/S0;-><init>(JJ)V

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/w0;->R(Lcom/google/android/gms/internal/ads/T0;)V

    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/n1;->p:Z

    goto :goto_b

    :cond_1a
    iput v13, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    return v8

    :cond_1b
    :goto_b
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v1

    const-wide/16 v3, 0xc

    add-long/2addr v1, v3

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    const/4 v1, 0x6

    iput v1, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    return v8

    :cond_1c
    :goto_c
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/u0;->e()J

    move-result-wide v1

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    iget v3, v3, Lcom/google/android/gms/internal/ads/l1;->b:I

    int-to-long v3, v3

    add-long/2addr v1, v3

    add-long v1, v1, v16

    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/n1;->j:J

    return v8

    :cond_1d
    iget v2, v0, Lcom/google/android/gms/internal/ads/n1;->l:I

    add-int/lit8 v2, v2, -0x4

    new-instance v3, Lcom/google/android/gms/internal/ads/sR;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/sR;-><init>(I)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v4

    invoke-interface {v1, v4, v8, v2}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    invoke-static {v9, v3}, Lcom/google/android/gms/internal/ads/r1;->c(ILcom/google/android/gms/internal/ads/sR;)Lcom/google/android/gms/internal/ads/r1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/r1;->a()I

    move-result v2

    if-ne v2, v9, :cond_28

    const-class v2, Lcom/google/android/gms/internal/ads/o1;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/r1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/j1;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/o1;

    if-eqz v2, :cond_27

    iput-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->g:Lcom/google/android/gms/internal/ads/o1;

    iget v3, v2, Lcom/google/android/gms/internal/ads/o1;->c:I

    iget v2, v2, Lcom/google/android/gms/internal/ads/o1;->a:I

    int-to-long v3, v3

    int-to-long v9, v2

    mul-long/2addr v3, v9

    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/n1;->h:J

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/r1;->a:Lcom/google/android/gms/internal/ads/ci0;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move v4, v8

    move v14, v4

    :goto_d
    if-ge v4, v3, :cond_26

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/j1;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/j1;->a()I

    move-result v9

    const v10, 0x6c727473

    if-ne v9, v10, :cond_25

    check-cast v5, Lcom/google/android/gms/internal/ads/r1;

    add-int/lit8 v9, v14, 0x1

    const-class v10, Lcom/google/android/gms/internal/ads/p1;

    invoke-virtual {v5, v10}, Lcom/google/android/gms/internal/ads/r1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/j1;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/ads/p1;

    const-class v13, Lcom/google/android/gms/internal/ads/s1;

    invoke-virtual {v5, v13}, Lcom/google/android/gms/internal/ads/r1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/j1;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/ads/s1;

    const-string v15, "AviExtractor"

    if-nez v10, :cond_1e

    const-string v5, "Missing Stream Header"

    :goto_e
    invoke-static {v15, v5}, Lcom/google/android/gms/internal/ads/eM;->f(Ljava/lang/String;Ljava/lang/String;)V

    move-object v11, v6

    move/from16 p1, v9

    goto/16 :goto_10

    :cond_1e
    if-nez v13, :cond_1f

    const-string v5, "Missing Stream Format"

    goto :goto_e

    :cond_1f
    iget v15, v10, Lcom/google/android/gms/internal/ads/p1;->d:I

    iget v6, v10, Lcom/google/android/gms/internal/ads/p1;->b:I

    iget v12, v10, Lcom/google/android/gms/internal/ads/p1;->c:I

    iget-object v13, v13, Lcom/google/android/gms/internal/ads/s1;->a:Lcom/google/android/gms/internal/ads/D;

    move/from16 p1, v9

    int-to-long v8, v6

    const-wide/32 v16, 0xf4240

    mul-long v22, v8, v16

    int-to-long v8, v12

    sget-object v26, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    int-to-long v11, v15

    move-wide/from16 v20, v11

    move-wide/from16 v24, v8

    invoke-static/range {v20 .. v26}, Lcom/google/android/gms/internal/ads/EW;->M(JJJLjava/math/RoundingMode;)J

    move-result-wide v8

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/D;->b()Lcom/google/android/gms/internal/ads/oK0;

    move-result-object v11

    invoke-virtual {v11, v14}, Lcom/google/android/gms/internal/ads/oK0;->l(I)Lcom/google/android/gms/internal/ads/oK0;

    iget v12, v10, Lcom/google/android/gms/internal/ads/p1;->e:I

    if-eqz v12, :cond_20

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/ads/oK0;->r(I)Lcom/google/android/gms/internal/ads/oK0;

    :cond_20
    const-class v12, Lcom/google/android/gms/internal/ads/t1;

    invoke-virtual {v5, v12}, Lcom/google/android/gms/internal/ads/r1;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/j1;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/t1;

    if-eqz v5, :cond_21

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/t1;->a:Ljava/lang/String;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/ads/oK0;->o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/oK0;

    :cond_21
    iget-object v5, v13, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/ed;->b(Ljava/lang/String;)I

    move-result v5

    if-eq v5, v7, :cond_23

    const/4 v6, 0x2

    if-ne v5, v6, :cond_22

    const/4 v15, 0x2

    goto :goto_f

    :cond_22
    const/4 v11, 0x0

    goto :goto_10

    :cond_23
    move v15, v5

    :goto_f
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v5, v14, v15}, Lcom/google/android/gms/internal/ads/w0;->S(II)Lcom/google/android/gms/internal/ads/a1;

    move-result-object v5

    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/oK0;->H()Lcom/google/android/gms/internal/ads/D;

    move-result-object v11

    invoke-interface {v5, v11}, Lcom/google/android/gms/internal/ads/a1;->c(Lcom/google/android/gms/internal/ads/D;)V

    iget v10, v10, Lcom/google/android/gms/internal/ads/p1;->d:I

    new-instance v11, Lcom/google/android/gms/internal/ads/q1;

    move-object v13, v11

    move-wide/from16 v16, v8

    move/from16 v18, v10

    move-object/from16 v19, v5

    invoke-direct/range {v13 .. v19}, Lcom/google/android/gms/internal/ads/q1;-><init>(IIJILcom/google/android/gms/internal/ads/a1;)V

    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/n1;->h:J

    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/n1;->h:J

    :goto_10
    if-eqz v11, :cond_24

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_24
    move/from16 v14, p1

    :cond_25
    add-int/lit8 v4, v4, 0x1

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x3

    goto/16 :goto_d

    :cond_26
    move v4, v8

    new-array v1, v4, [Lcom/google/android/gms/internal/ads/q1;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lcom/google/android/gms/internal/ads/q1;

    iput-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->i:[Lcom/google/android/gms/internal/ads/q1;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/w0;->Q()V

    const/4 v1, 0x3

    iput v1, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    return v4

    :cond_27
    const-string v1, "AviHeader not found"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_28
    move-object v2, v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/r1;->a()I

    move-result v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unexpected header list type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_29
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v2

    const/4 v4, 0x0

    invoke-interface {v1, v2, v4, v3}, Lcom/google/android/gms/internal/ads/u0;->M([BII)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v4}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    iget-object v2, v0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/l1;->a(Lcom/google/android/gms/internal/ads/sR;)V

    iget v3, v1, Lcom/google/android/gms/internal/ads/l1;->a:I

    if-ne v3, v10, :cond_2b

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result v2

    iput v2, v1, Lcom/google/android/gms/internal/ads/l1;->c:I

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/n1;->b:Lcom/google/android/gms/internal/ads/l1;

    iget v2, v1, Lcom/google/android/gms/internal/ads/l1;->c:I

    if-ne v2, v9, :cond_2a

    iget v1, v1, Lcom/google/android/gms/internal/ads/l1;->b:I

    iput v1, v0, Lcom/google/android/gms/internal/ads/n1;->l:I

    const/4 v1, 0x2

    iput v1, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    :goto_11
    const/4 v1, 0x0

    return v1

    :cond_2a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hdrl expected, found: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_2b
    const/4 v2, 0x0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "LIST expected, found: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1

    :cond_2c
    move-object v2, v6

    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/n1;->j(Lcom/google/android/gms/internal/ads/u0;)Z

    move-result v4

    if-eqz v4, :cond_2d

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/u0;->I(I)V

    iput v7, v0, Lcom/google/android/gms/internal/ads/n1;->e:I

    goto :goto_11

    :cond_2d
    const-string v1, "AVI Header List not found"

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/of;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/of;

    move-result-object v1

    throw v1
.end method

.method public final j(Lcom/google/android/gms/internal/ads/u0;)Z
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/sR;->n()[B

    move-result-object v0

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Lcom/google/android/gms/internal/ads/u0;->N([BII)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/sR;->l(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result p1

    const v0, 0x46464952

    if-eq p1, v0, :cond_0

    return v2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/sR;->m(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->a:Lcom/google/android/gms/internal/ads/sR;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/sR;->y()I

    move-result p1

    const v0, 0x20495641

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v2
.end method

.method public final k(Lcom/google/android/gms/internal/ads/w0;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/n1;->e:I

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/n1;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/n1;->d:Lcom/google/android/gms/internal/ads/q4;

    new-instance v1, Lcom/google/android/gms/internal/ads/t4;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/t4;-><init>(Lcom/google/android/gms/internal/ads/w0;Lcom/google/android/gms/internal/ads/q4;)V

    move-object p1, v1

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n1;->f:Lcom/google/android/gms/internal/ads/w0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/n1;->j:J

    return-void
.end method
