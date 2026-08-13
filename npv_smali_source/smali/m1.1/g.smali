.class public final Lm1/g;
.super Lm1/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/g$a;,
        Lm1/g$b;
    }
.end annotation


# static fields
.field public static final s1:Lm1/g$a;

.field public static final t1:I


# instance fields
.field private T0:I

.field private U0:I

.field private V0:I

.field private W0:I

.field private X0:I

.field private Y0:I

.field private Z0:F

.field private a1:F

.field private b1:F

.field private c1:F

.field private d1:F

.field private e1:F

.field private f1:I

.field private g1:I

.field private h1:I

.field private i1:I

.field private j1:I

.field private k1:I

.field private l1:I

.field private final m1:Ljava/util/ArrayList;

.field private n1:[Lm1/e;

.field private o1:[Lm1/e;

.field private p1:[I

.field private q1:[Lm1/e;

.field private r1:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/g$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/g;->s1:Lm1/g$a;

    const/16 v0, 0x8

    sput v0, Lm1/g;->t1:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lm1/l;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm1/g;->T0:I

    iput v0, p0, Lm1/g;->U0:I

    iput v0, p0, Lm1/g;->V0:I

    iput v0, p0, Lm1/g;->W0:I

    iput v0, p0, Lm1/g;->X0:I

    iput v0, p0, Lm1/g;->Y0:I

    const/high16 v1, 0x3f000000    # 0.5f

    iput v1, p0, Lm1/g;->Z0:F

    iput v1, p0, Lm1/g;->a1:F

    iput v1, p0, Lm1/g;->b1:F

    iput v1, p0, Lm1/g;->c1:F

    iput v1, p0, Lm1/g;->d1:F

    iput v1, p0, Lm1/g;->e1:F

    const/4 v1, 0x2

    iput v1, p0, Lm1/g;->h1:I

    iput v1, p0, Lm1/g;->i1:I

    iput v0, p0, Lm1/g;->k1:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic A2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->c1:F

    return p0
.end method

.method public static final synthetic B2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->W0:I

    return p0
.end method

.method public static final synthetic C2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->h1:I

    return p0
.end method

.method public static final synthetic D2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->Z0:F

    return p0
.end method

.method public static final synthetic E2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->f1:I

    return p0
.end method

.method public static final synthetic F2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->T0:I

    return p0
.end method

.method public static final synthetic G2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->d1:F

    return p0
.end method

.method public static final synthetic H2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->X0:I

    return p0
.end method

.method public static final synthetic I2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->e1:F

    return p0
.end method

.method public static final synthetic J2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->Y0:I

    return p0
.end method

.method public static final synthetic K2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->i1:I

    return p0
.end method

.method public static final synthetic L2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->a1:F

    return p0
.end method

.method public static final synthetic M2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->g1:I

    return p0
.end method

.method public static final synthetic N2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->U0:I

    return p0
.end method

.method public static final synthetic O2(Lm1/g;Lm1/e;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lm1/g;->R2(Lm1/e;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic P2(Lm1/g;Lm1/e;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lm1/g;->S2(Lm1/e;I)I

    move-result p0

    return p0
.end method

.method private final Q2(Z)V
    .locals 12

    .prologue
    iget-object v0, p0, Lm1/g;->p1:[I

    if-eqz v0, :cond_17

    iget-object v0, p0, Lm1/g;->o1:[Lm1/e;

    if-eqz v0, :cond_17

    iget-object v0, p0, Lm1/g;->n1:[Lm1/e;

    if-nez v0, :cond_0

    goto/16 :goto_a

    :cond_0
    iget v0, p0, Lm1/g;->r1:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v0, :cond_2

    iget-object v4, p0, Lm1/g;->q1:[Lm1/e;

    if-eqz v4, :cond_1

    aget-object v3, v4, v2

    :cond_1
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->X0()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lm1/g;->p1:[I

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    aget v0, v0, v1

    iget-object v2, p0, Lm1/g;->p1:[I

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x1

    aget v2, v2, v4

    iget v5, p0, Lm1/g;->Z0:F

    move v6, v1

    move-object v7, v3

    :goto_1
    const/16 v8, 0x8

    if-ge v6, v0, :cond_9

    if-eqz p1, :cond_3

    sub-int v5, v0, v6

    sub-int/2addr v5, v4

    int-to-float v9, v4

    iget v10, p0, Lm1/g;->Z0:F

    sub-float/2addr v9, v10

    goto :goto_2

    :cond_3
    move v9, v5

    move v5, v6

    :goto_2
    iget-object v10, p0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v5, v10, v5

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lm1/e;->A0()I

    move-result v10

    if-ne v10, v8, :cond_4

    goto :goto_3

    :cond_4
    if-nez v6, :cond_5

    invoke-virtual {v5}, Lm1/e;->L()Lm1/d;

    move-result-object v8

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    invoke-virtual {p0}, Lm1/l;->j2()I

    move-result v11

    invoke-virtual {v5, v8, v10, v11}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    iget v8, p0, Lm1/g;->T0:I

    invoke-virtual {v5, v8}, Lm1/e;->p1(I)V

    invoke-virtual {v5, v9}, Lm1/e;->n1(F)V

    :cond_5
    add-int/lit8 v8, v0, -0x1

    if-ne v6, v8, :cond_6

    invoke-virtual {v5}, Lm1/e;->b0()Lm1/d;

    move-result-object v8

    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    invoke-virtual {p0}, Lm1/l;->k2()I

    move-result v11

    invoke-virtual {v5, v8, v10, v11}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_6
    if-lez v6, :cond_7

    if-eqz v7, :cond_7

    invoke-virtual {v5}, Lm1/e;->L()Lm1/d;

    move-result-object v8

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    iget v11, p0, Lm1/g;->f1:I

    invoke-virtual {v5, v8, v10, v11}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v8

    invoke-virtual {v5}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    invoke-virtual {v7, v8, v10, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_7
    move-object v7, v5

    :cond_8
    :goto_3
    add-int/lit8 v6, v6, 0x1

    move v5, v9

    goto :goto_1

    :cond_9
    move p1, v1

    :goto_4
    if-ge p1, v2, :cond_f

    iget-object v5, p0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v5, v5, p1

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Lm1/e;->A0()I

    move-result v6

    if-ne v6, v8, :cond_a

    goto :goto_5

    :cond_a
    if-nez p1, :cond_b

    invoke-virtual {v5}, Lm1/e;->c0()Lm1/d;

    move-result-object v6

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v9

    invoke-virtual {p0}, Lm1/l;->l2()I

    move-result v10

    invoke-virtual {v5, v6, v9, v10}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    iget v6, p0, Lm1/g;->U0:I

    invoke-virtual {v5, v6}, Lm1/e;->N1(I)V

    iget v6, p0, Lm1/g;->a1:F

    invoke-virtual {v5, v6}, Lm1/e;->L1(F)V

    :cond_b
    add-int/lit8 v6, v2, -0x1

    if-ne p1, v6, :cond_c

    invoke-virtual {v5}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object v9

    invoke-virtual {p0}, Lm1/l;->i2()I

    move-result v10

    invoke-virtual {v5, v6, v9, v10}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_c
    if-lez p1, :cond_d

    if-eqz v7, :cond_d

    invoke-virtual {v5}, Lm1/e;->c0()Lm1/d;

    move-result-object v6

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v9

    iget v10, p0, Lm1/g;->g1:I

    invoke-virtual {v5, v6, v9, v10}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    invoke-virtual {v5}, Lm1/e;->c0()Lm1/d;

    move-result-object v9

    invoke-virtual {v7, v6, v9, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_d
    move-object v7, v5

    :cond_e
    :goto_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_f
    move p1, v1

    :goto_6
    if-ge p1, v0, :cond_17

    move v5, v1

    :goto_7
    if-ge v5, v2, :cond_16

    mul-int v6, v5, v0

    add-int/2addr v6, p1

    iget v7, p0, Lm1/g;->l1:I

    if-ne v7, v4, :cond_10

    mul-int v6, p1, v2

    add-int/2addr v6, v5

    :cond_10
    iget-object v7, p0, Lm1/g;->q1:[Lm1/e;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v7, v7

    if-lt v6, v7, :cond_11

    goto :goto_9

    :cond_11
    iget-object v7, p0, Lm1/g;->q1:[Lm1/e;

    if-eqz v7, :cond_12

    aget-object v6, v7, v6

    goto :goto_8

    :cond_12
    move-object v6, v3

    :goto_8
    if-eqz v6, :cond_15

    invoke-virtual {v6}, Lm1/e;->A0()I

    move-result v7

    if-ne v7, v8, :cond_13

    goto :goto_9

    :cond_13
    iget-object v7, p0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v7, v7, p1

    iget-object v9, p0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v9, v9, v5

    invoke-static {v6, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_14

    invoke-virtual {v6}, Lm1/e;->L()Lm1/d;

    move-result-object v10

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v11

    invoke-virtual {v6, v10, v11, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    invoke-virtual {v6}, Lm1/e;->b0()Lm1/d;

    move-result-object v10

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v7

    invoke-virtual {v6, v10, v7, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_14
    invoke-static {v6, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    invoke-virtual {v6}, Lm1/e;->c0()Lm1/d;

    move-result-object v7

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->c0()Lm1/d;

    move-result-object v10

    invoke-virtual {v6, v7, v10, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    invoke-virtual {v6}, Lm1/e;->G()Lm1/d;

    move-result-object v7

    invoke-virtual {v9}, Lm1/e;->G()Lm1/d;

    move-result-object v9

    invoke-virtual {v6, v7, v9, v1}, Lm1/e;->h(Lm1/d;Lm1/d;I)V

    :cond_15
    :goto_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_16
    add-int/lit8 p1, p1, 0x1

    goto :goto_6

    :cond_17
    :goto_a
    return-void
.end method

.method private final R2(Lm1/e;I)I
    .locals 8

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v1

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v1, v2, :cond_6

    invoke-virtual {p1}, Lm1/e;->P()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v0, 0x1

    if-eq v1, v0, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 p2, 0x3

    if-eq v1, p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Lm1/e;->I()F

    move-result p1

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_2
    invoke-virtual {p1}, Lm1/e;->V()F

    move-result v1

    int-to-float p2, p2

    mul-float/2addr v1, p2

    float-to-int p2, v1

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result v1

    if-eq p2, v1, :cond_3

    invoke-virtual {p1, v0}, Lm1/e;->E1(Z)V

    invoke-virtual {p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v4

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result v5

    sget-object v6, Lm1/e$b;->C:Lm1/e$b;

    move-object v2, p0

    move-object v3, p1

    move v7, p2

    invoke-virtual/range {v2 .. v7}, Lm1/l;->n2(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :cond_3
    return p2

    :cond_4
    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p1

    return p1

    :cond_5
    return v0

    :cond_6
    :goto_0
    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p1

    return p1
.end method

.method private final S2(Lm1/e;I)I
    .locals 8

    .prologue
    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v1, v2, :cond_6

    invoke-virtual {p1}, Lm1/e;->Q()I

    move-result v1

    if-eqz v1, :cond_5

    const/4 v0, 0x1

    if-eq v1, v0, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 p2, 0x3

    if-eq v1, p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lm1/e;->w()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1}, Lm1/e;->I()F

    move-result p1

    mul-float/2addr p2, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p2, p1

    float-to-int p1, p2

    return p1

    :cond_2
    invoke-virtual {p1}, Lm1/e;->W()F

    move-result v1

    int-to-float p2, p2

    mul-float/2addr v1, p2

    float-to-int p2, v1

    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result v1

    if-eq p2, v1, :cond_3

    invoke-virtual {p1, v0}, Lm1/e;->E1(Z)V

    sget-object v4, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v6

    invoke-virtual {p1}, Lm1/e;->w()I

    move-result v7

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    invoke-virtual/range {v2 .. v7}, Lm1/l;->n2(Lm1/e;Lm1/e$b;ILm1/e$b;I)V

    :cond_3
    return p2

    :cond_4
    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p1

    return p1

    :cond_5
    return v0

    :cond_6
    :goto_0
    invoke-virtual {p1}, Lm1/e;->B0()I

    move-result p1

    return p1
.end method

.method private final T2([Lm1/e;III[I)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    const/4 v5, 0x0

    iget v6, v0, Lm1/g;->k1:I

    if-nez v3, :cond_4

    if-gtz v6, :cond_3

    move v6, v5

    move v7, v6

    move v8, v7

    :goto_0
    if-ge v7, v2, :cond_3

    if-lez v7, :cond_0

    iget v9, v0, Lm1/g;->f1:I

    add-int/2addr v8, v9

    :cond_0
    aget-object v9, v1, v7

    if-nez v9, :cond_1

    goto :goto_1

    :cond_1
    invoke-direct {v0, v9, v4}, Lm1/g;->S2(Lm1/e;I)I

    move-result v9

    add-int/2addr v8, v9

    if-le v8, v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    move v7, v6

    move v6, v5

    goto :goto_6

    :cond_4
    if-gtz v6, :cond_8

    move v6, v5

    move v7, v6

    move v8, v7

    :goto_3
    if-ge v7, v2, :cond_8

    if-lez v7, :cond_5

    iget v9, v0, Lm1/g;->g1:I

    add-int/2addr v8, v9

    :cond_5
    aget-object v9, v1, v7

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    invoke-direct {v0, v9, v4}, Lm1/g;->R2(Lm1/e;I)I

    move-result v9

    add-int/2addr v8, v9

    if-le v8, v4, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v6, v6, 0x1

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_8
    :goto_5
    move v7, v5

    :goto_6
    iget-object v8, v0, Lm1/g;->p1:[I

    if-nez v8, :cond_9

    const/4 v8, 0x2

    new-array v8, v8, [I

    iput-object v8, v0, Lm1/g;->p1:[I

    :cond_9
    const/4 v8, 0x1

    if-nez v6, :cond_a

    if-eq v3, v8, :cond_b

    :cond_a
    if-nez v7, :cond_c

    if-nez v3, :cond_c

    :cond_b
    move v9, v8

    goto :goto_7

    :cond_c
    move v9, v5

    :goto_7
    if-nez v9, :cond_24

    if-nez v3, :cond_d

    int-to-float v6, v2

    int-to-float v10, v7

    div-float/2addr v6, v10

    float-to-double v10, v6

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v6, v10

    goto :goto_8

    :cond_d
    int-to-float v7, v2

    int-to-float v10, v6

    div-float/2addr v7, v10

    float-to-double v10, v7

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v7, v10

    :goto_8
    iget-object v10, v0, Lm1/g;->o1:[Lm1/e;

    if-eqz v10, :cond_f

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v10, v10

    if-ge v10, v7, :cond_e

    goto :goto_9

    :cond_e
    iget-object v11, v0, Lm1/g;->o1:[Lm1/e;

    if-eqz v11, :cond_10

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lj7/n;->B([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    goto :goto_a

    :cond_f
    :goto_9
    new-array v10, v7, [Lm1/e;

    iput-object v10, v0, Lm1/g;->o1:[Lm1/e;

    :cond_10
    :goto_a
    iget-object v10, v0, Lm1/g;->n1:[Lm1/e;

    if-eqz v10, :cond_12

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    array-length v10, v10

    if-ge v10, v6, :cond_11

    goto :goto_b

    :cond_11
    iget-object v11, v0, Lm1/g;->n1:[Lm1/e;

    if-eqz v11, :cond_13

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lj7/n;->B([Ljava/lang/Object;Ljava/lang/Object;IIILjava/lang/Object;)V

    goto :goto_c

    :cond_12
    :goto_b
    new-array v10, v6, [Lm1/e;

    iput-object v10, v0, Lm1/g;->n1:[Lm1/e;

    :cond_13
    :goto_c
    move v10, v5

    :goto_d
    if-ge v10, v7, :cond_1c

    move v11, v5

    :goto_e
    if-ge v11, v6, :cond_1b

    mul-int v12, v11, v7

    add-int/2addr v12, v10

    if-ne v3, v8, :cond_14

    mul-int v12, v10, v6

    add-int/2addr v12, v11

    :cond_14
    array-length v13, v1

    if-lt v12, v13, :cond_15

    goto :goto_f

    :cond_15
    aget-object v12, v1, v12

    if-nez v12, :cond_16

    goto :goto_f

    :cond_16
    invoke-direct {v0, v12, v4}, Lm1/g;->S2(Lm1/e;I)I

    move-result v13

    iget-object v14, v0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v14, v14, v10

    if-eqz v14, :cond_17

    iget-object v14, v0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v14, v14, v10

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14}, Lm1/e;->B0()I

    move-result v14

    if-ge v14, v13, :cond_18

    :cond_17
    iget-object v13, v0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    aput-object v12, v13, v10

    :cond_18
    invoke-direct {v0, v12, v4}, Lm1/g;->R2(Lm1/e;I)I

    move-result v13

    iget-object v14, v0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v14, v14, v11

    if-eqz v14, :cond_19

    iget-object v14, v0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v14, v14, v11

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14}, Lm1/e;->w()I

    move-result v14

    if-ge v14, v13, :cond_1a

    :cond_19
    iget-object v13, v0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    aput-object v12, v13, v11

    :cond_1a
    :goto_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_1b
    add-int/lit8 v10, v10, 0x1

    goto :goto_d

    :cond_1c
    move v10, v5

    move v11, v10

    :goto_10
    if-ge v10, v7, :cond_1f

    iget-object v12, v0, Lm1/g;->o1:[Lm1/e;

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v12, v12, v10

    if-eqz v12, :cond_1e

    if-lez v10, :cond_1d

    iget v13, v0, Lm1/g;->f1:I

    add-int/2addr v11, v13

    :cond_1d
    invoke-direct {v0, v12, v4}, Lm1/g;->S2(Lm1/e;I)I

    move-result v12

    add-int/2addr v11, v12

    :cond_1e
    add-int/lit8 v10, v10, 0x1

    goto :goto_10

    :cond_1f
    move v10, v5

    move v12, v10

    :goto_11
    if-ge v10, v6, :cond_22

    iget-object v13, v0, Lm1/g;->n1:[Lm1/e;

    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    aget-object v13, v13, v10

    if-eqz v13, :cond_21

    if-lez v10, :cond_20

    iget v14, v0, Lm1/g;->g1:I

    add-int/2addr v12, v14

    :cond_20
    invoke-direct {v0, v13, v4}, Lm1/g;->R2(Lm1/e;I)I

    move-result v13

    add-int/2addr v12, v13

    :cond_21
    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    :cond_22
    aput v11, p5, v5

    aput v12, p5, v8

    if-nez v3, :cond_23

    if-le v11, v4, :cond_b

    if-le v7, v8, :cond_b

    add-int/lit8 v7, v7, -0x1

    goto/16 :goto_7

    :cond_23
    if-le v12, v4, :cond_b

    if-le v6, v8, :cond_b

    add-int/lit8 v6, v6, -0x1

    goto/16 :goto_7

    :cond_24
    iget-object v1, v0, Lm1/g;->p1:[I

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aput v7, v1, v5

    iget-object v1, v0, Lm1/g;->p1:[I

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    aput v6, v1, v8

    return-void
.end method

.method private final U2([Lm1/e;III[I)V
    .locals 29

    .prologue
    move-object/from16 v8, p0

    move/from16 v9, p2

    move/from16 v15, p4

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    move/from16 v0, v21

    move v1, v0

    move v12, v1

    if-nez p3, :cond_8

    :goto_0
    if-ge v12, v9, :cond_10

    aget-object v13, p1, v12

    invoke-direct {v8, v13, v15}, Lm1/g;->S2(Lm1/e;I)I

    move-result v14

    if-eqz v13, :cond_1

    invoke-virtual {v13}, Lm1/e;->A()Lm1/e$b;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v11

    :goto_1
    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v3, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    move/from16 v16, v0

    if-eq v1, v15, :cond_3

    iget v0, v8, Lm1/g;->f1:I

    add-int/2addr v0, v1

    add-int/2addr v0, v14

    if-le v0, v15, :cond_4

    :cond_3
    invoke-virtual {v10}, Lm1/g$b;->e()Lm1/e;

    move-result-object v0

    if-eqz v0, :cond_4

    move/from16 v0, v20

    goto :goto_2

    :cond_4
    move/from16 v0, v21

    :goto_2
    if-nez v0, :cond_5

    if-lez v12, :cond_5

    iget v2, v8, Lm1/g;->k1:I

    if-lez v2, :cond_5

    rem-int v2, v12, v2

    if-nez v2, :cond_5

    move/from16 v0, v20

    :cond_5
    if-eqz v0, :cond_7

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    invoke-virtual {v10, v12}, Lm1/g$b;->i(I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    move v1, v14

    goto :goto_3

    :cond_7
    if-lez v12, :cond_6

    iget v0, v8, Lm1/g;->f1:I

    add-int/2addr v0, v14

    add-int/2addr v1, v0

    :goto_3
    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lm1/g$b;->a(Lm1/e;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v0, v16

    goto :goto_0

    :cond_8
    :goto_4
    if-ge v12, v9, :cond_10

    aget-object v13, p1, v12

    invoke-direct {v8, v13, v15}, Lm1/g;->R2(Lm1/e;I)I

    move-result v14

    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v2

    goto :goto_5

    :cond_9
    move-object v2, v11

    :goto_5
    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v3, :cond_a

    add-int/lit8 v0, v0, 0x1

    :cond_a
    move/from16 v16, v0

    if-eq v1, v15, :cond_b

    iget v0, v8, Lm1/g;->g1:I

    add-int/2addr v0, v1

    add-int/2addr v0, v14

    if-le v0, v15, :cond_c

    :cond_b
    invoke-virtual {v10}, Lm1/g$b;->e()Lm1/e;

    move-result-object v0

    if-eqz v0, :cond_c

    move/from16 v0, v20

    goto :goto_6

    :cond_c
    move/from16 v0, v21

    :goto_6
    if-nez v0, :cond_d

    if-lez v12, :cond_d

    iget v2, v8, Lm1/g;->k1:I

    if-lez v2, :cond_d

    rem-int v2, v12, v2

    if-nez v2, :cond_d

    move/from16 v0, v20

    :cond_d
    if-eqz v0, :cond_f

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    invoke-virtual {v10, v12}, Lm1/g$b;->i(I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    move v1, v14

    goto :goto_7

    :cond_f
    if-lez v12, :cond_e

    iget v0, v8, Lm1/g;->g1:I

    add-int/2addr v0, v14

    add-int/2addr v1, v0

    :goto_7
    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lm1/g$b;->a(Lm1/e;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v0, v16

    goto :goto_4

    :cond_10
    iget-object v1, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/l;->j2()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lm1/l;->l2()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lm1/e;->A()Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->D:Lm1/e$b;

    if-eq v11, v12, :cond_12

    invoke-virtual/range {p0 .. p0}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v11

    if-ne v11, v12, :cond_11

    goto :goto_8

    :cond_11
    move/from16 v11, v21

    goto :goto_9

    :cond_12
    :goto_8
    move/from16 v11, v20

    :goto_9
    const-string v14, "get(...)"

    if-lez v0, :cond_14

    if-eqz v11, :cond_14

    move/from16 v0, v21

    :goto_a
    if-ge v0, v1, :cond_14

    iget-object v11, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lm1/g$b;

    if-nez p3, :cond_13

    invoke-virtual {v11}, Lm1/g$b;->f()I

    move-result v12

    :goto_b
    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lm1/g$b;->g(I)V

    goto :goto_c

    :cond_13
    invoke-virtual {v11}, Lm1/g$b;->d()I

    move-result v12

    goto :goto_b

    :goto_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_14
    move/from16 v22, v7

    move v0, v9

    move/from16 v11, v21

    move v12, v11

    move v13, v12

    move v7, v6

    move-object v6, v3

    move-object v3, v2

    move v2, v10

    :goto_d
    if-ge v13, v1, :cond_1a

    iget-object v9, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v9

    check-cast v23, Lm1/g$b;

    if-nez p3, :cond_17

    add-int/lit8 v2, v1, -0x1

    if-ge v13, v2, :cond_15

    iget-object v2, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    add-int/lit8 v5, v13, 0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/g$b;

    invoke-virtual {v2}, Lm1/g$b;->e()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    move/from16 v5, v21

    goto :goto_e

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v5

    :goto_e
    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->G()Lm1/d;

    move-result-object v24

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v9, v23

    move/from16 v10, p3

    move/from16 p1, v1

    move v1, v11

    move-object v11, v3

    move-object/from16 p2, v3

    move v3, v12

    move-object v12, v6

    move v6, v13

    move-object v13, v4

    move-object/from16 v25, v4

    move-object v4, v14

    move-object v14, v2

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v0

    move/from16 v18, v5

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lm1/g$b;->j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->f()I

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->d()I

    move-result v9

    add-int v11, v1, v9

    if-lez v6, :cond_16

    iget v1, v8, Lm1/g;->g1:I

    add-int/2addr v11, v1

    :cond_16
    move v12, v3

    move/from16 v22, v21

    move-object/from16 v3, p2

    move-object/from16 v27, v25

    move/from16 v25, v0

    move v0, v6

    move-object/from16 v6, v24

    move-object/from16 v24, v27

    move/from16 v28, v5

    move-object v5, v2

    move/from16 v2, v28

    goto/16 :goto_10

    :cond_17
    move/from16 p1, v1

    move-object/from16 p2, v3

    move v1, v11

    move v3, v12

    move v0, v13

    move-object v4, v14

    add-int/lit8 v9, p1, -0x1

    if-ge v0, v9, :cond_18

    iget-object v9, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    add-int/lit8 v13, v0, 0x1

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lm1/g$b;

    invoke-virtual {v9}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->L()Lm1/d;

    move-result-object v9

    move-object/from16 v24, v9

    move/from16 v25, v21

    goto :goto_f

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v10

    move-object/from16 v24, v9

    move/from16 v25, v10

    :goto_f
    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->b0()Lm1/d;

    move-result-object v26

    invoke-static/range {p2 .. p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v11, p2

    move-object v12, v6

    move-object/from16 v13, v24

    move-object v14, v5

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v25

    move/from16 v18, v2

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lm1/g$b;->j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->f()I

    move-result v7

    add-int v12, v3, v7

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->d()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v0, :cond_19

    iget v3, v8, Lm1/g;->f1:I

    add-int/2addr v12, v3

    :cond_19
    move v11, v1

    move/from16 v7, v21

    move-object/from16 v3, v26

    :goto_10
    add-int/lit8 v13, v0, 0x1

    move/from16 v1, p1

    move/from16 v15, p4

    move-object v14, v4

    move-object/from16 v4, v24

    move/from16 v0, v25

    goto/16 :goto_d

    :cond_1a
    move v1, v11

    move v3, v12

    aput v3, p5, v21

    aput v1, p5, v20

    return-void
.end method

.method private final V2([Lm1/e;III[I)V
    .locals 29

    .prologue
    move-object/from16 v8, p0

    move/from16 v9, p2

    move/from16 v15, p4

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x1

    move/from16 v0, v20

    move v1, v0

    move v2, v1

    move v12, v2

    if-nez p3, :cond_8

    :goto_0
    if-ge v12, v9, :cond_10

    add-int/lit8 v0, v0, 0x1

    aget-object v13, p1, v12

    invoke-direct {v8, v13, v15}, Lm1/g;->S2(Lm1/e;I)I

    move-result v14

    if-eqz v13, :cond_1

    invoke-virtual {v13}, Lm1/e;->A()Lm1/e$b;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v11

    :goto_1
    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v4, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    move/from16 v16, v1

    if-eq v2, v15, :cond_3

    iget v1, v8, Lm1/g;->f1:I

    add-int/2addr v1, v2

    add-int/2addr v1, v14

    if-le v1, v15, :cond_4

    :cond_3
    invoke-virtual {v10}, Lm1/g$b;->e()Lm1/e;

    move-result-object v1

    if-eqz v1, :cond_4

    move/from16 v1, v21

    goto :goto_2

    :cond_4
    move/from16 v1, v20

    :goto_2
    if-nez v1, :cond_5

    if-lez v12, :cond_5

    iget v3, v8, Lm1/g;->k1:I

    if-lez v3, :cond_5

    if-le v0, v3, :cond_5

    move/from16 v1, v21

    :cond_5
    if-eqz v1, :cond_6

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    invoke-virtual {v10, v12}, Lm1/g$b;->i(I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v14

    move/from16 v0, v21

    goto :goto_3

    :cond_6
    if-lez v12, :cond_7

    iget v1, v8, Lm1/g;->f1:I

    add-int/2addr v1, v14

    add-int/2addr v2, v1

    goto :goto_3

    :cond_7
    move v2, v14

    :goto_3
    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lm1/g$b;->a(Lm1/e;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v16

    goto :goto_0

    :cond_8
    :goto_4
    if-ge v12, v9, :cond_10

    add-int/lit8 v0, v0, 0x1

    aget-object v13, p1, v12

    invoke-direct {v8, v13, v15}, Lm1/g;->R2(Lm1/e;I)I

    move-result v14

    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    goto :goto_5

    :cond_9
    move-object v3, v11

    :goto_5
    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v4, :cond_a

    add-int/lit8 v1, v1, 0x1

    :cond_a
    move/from16 v16, v1

    if-eq v2, v15, :cond_b

    iget v1, v8, Lm1/g;->g1:I

    add-int/2addr v1, v2

    add-int/2addr v1, v14

    if-le v1, v15, :cond_c

    :cond_b
    invoke-virtual {v10}, Lm1/g$b;->e()Lm1/e;

    move-result-object v1

    if-eqz v1, :cond_c

    move/from16 v1, v21

    goto :goto_6

    :cond_c
    move/from16 v1, v20

    :goto_6
    if-nez v1, :cond_d

    if-lez v12, :cond_d

    iget v3, v8, Lm1/g;->k1:I

    if-lez v3, :cond_d

    if-le v0, v3, :cond_d

    move/from16 v1, v21

    :cond_d
    if-eqz v1, :cond_e

    new-instance v10, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    invoke-virtual {v10, v12}, Lm1/g$b;->i(I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v14

    move/from16 v0, v21

    goto :goto_7

    :cond_e
    if-lez v12, :cond_f

    iget v1, v8, Lm1/g;->g1:I

    add-int/2addr v1, v14

    add-int/2addr v2, v1

    goto :goto_7

    :cond_f
    move v2, v14

    :goto_7
    invoke-static {v13}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10, v13}, Lm1/g$b;->a(Lm1/e;)V

    add-int/lit8 v12, v12, 0x1

    move/from16 v1, v16

    goto :goto_4

    :cond_10
    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/l;->j2()I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Lm1/l;->l2()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lm1/e;->A()Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->D:Lm1/e$b;

    if-eq v11, v12, :cond_12

    invoke-virtual/range {p0 .. p0}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v11

    if-ne v11, v12, :cond_11

    goto :goto_8

    :cond_11
    move/from16 v11, v20

    goto :goto_9

    :cond_12
    :goto_8
    move/from16 v11, v21

    :goto_9
    const-string v14, "get(...)"

    if-lez v1, :cond_14

    if-eqz v11, :cond_14

    move/from16 v1, v20

    :goto_a
    if-ge v1, v0, :cond_14

    iget-object v11, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lm1/g$b;

    if-nez p3, :cond_13

    invoke-virtual {v11}, Lm1/g$b;->f()I

    move-result v12

    :goto_b
    sub-int v12, v15, v12

    invoke-virtual {v11, v12}, Lm1/g$b;->g(I)V

    goto :goto_c

    :cond_13
    invoke-virtual {v11}, Lm1/g$b;->d()I

    move-result v12

    goto :goto_b

    :goto_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_14
    move/from16 v22, v7

    move v1, v9

    move/from16 v11, v20

    move v12, v11

    move v13, v12

    move v7, v6

    move-object v6, v3

    move-object v3, v2

    move v2, v10

    :goto_d
    if-ge v13, v0, :cond_1a

    iget-object v9, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v23, v9

    check-cast v23, Lm1/g$b;

    if-nez p3, :cond_17

    add-int/lit8 v2, v0, -0x1

    if-ge v13, v2, :cond_15

    iget-object v2, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    add-int/lit8 v5, v13, 0x1

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v14}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/g$b;

    invoke-virtual {v2}, Lm1/g$b;->e()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    move/from16 v5, v20

    goto :goto_e

    :cond_15
    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v5

    :goto_e
    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->G()Lm1/d;

    move-result-object v24

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v9, v23

    move/from16 v10, p3

    move/from16 p1, v0

    move v0, v11

    move-object v11, v3

    move-object/from16 p2, v3

    move v3, v12

    move-object v12, v6

    move v6, v13

    move-object v13, v4

    move-object/from16 v25, v4

    move-object v4, v14

    move-object v14, v2

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v1

    move/from16 v18, v5

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lm1/g$b;->j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->f()I

    move-result v9

    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->d()I

    move-result v9

    add-int v11, v0, v9

    if-lez v6, :cond_16

    iget v0, v8, Lm1/g;->g1:I

    add-int/2addr v11, v0

    :cond_16
    move v12, v3

    move/from16 v22, v20

    move-object/from16 v3, p2

    move-object/from16 v27, v25

    move/from16 v25, v1

    move v1, v6

    move-object/from16 v6, v24

    move-object/from16 v24, v27

    move/from16 v28, v5

    move-object v5, v2

    move/from16 v2, v28

    goto/16 :goto_10

    :cond_17
    move/from16 p1, v0

    move-object/from16 p2, v3

    move v0, v11

    move v3, v12

    move v1, v13

    move-object v4, v14

    add-int/lit8 v9, p1, -0x1

    if-ge v1, v9, :cond_18

    iget-object v9, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    add-int/lit8 v13, v1, 0x1

    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Lm1/g$b;

    invoke-virtual {v9}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->L()Lm1/d;

    move-result-object v9

    move-object/from16 v24, v9

    move/from16 v25, v20

    goto :goto_f

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v10

    move-object/from16 v24, v9

    move/from16 v25, v10

    :goto_f
    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->e()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->b0()Lm1/d;

    move-result-object v26

    invoke-static/range {p2 .. p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v9, v23

    move/from16 v10, p3

    move-object/from16 v11, p2

    move-object v12, v6

    move-object/from16 v13, v24

    move-object v14, v5

    move v15, v7

    move/from16 v16, v22

    move/from16 v17, v25

    move/from16 v18, v2

    move/from16 v19, p4

    invoke-virtual/range {v9 .. v19}, Lm1/g$b;->j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->f()I

    move-result v7

    add-int v12, v3, v7

    invoke-virtual/range {v23 .. v23}, Lm1/g$b;->d()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v1, :cond_19

    iget v3, v8, Lm1/g;->f1:I

    add-int/2addr v12, v3

    :cond_19
    move v11, v0

    move/from16 v7, v20

    move-object/from16 v3, v26

    :goto_10
    add-int/lit8 v13, v1, 0x1

    move/from16 v0, p1

    move/from16 v15, p4

    move-object v14, v4

    move-object/from16 v4, v24

    move/from16 v1, v25

    goto/16 :goto_d

    :cond_1a
    move v0, v11

    move v3, v12

    aput v3, p5, v20

    aput v0, p5, v21

    return-void
.end method

.method private final W2([Lm1/e;III[I)V
    .locals 22

    .prologue
    move-object/from16 v8, p0

    move/from16 v9, p2

    if-nez v9, :cond_0

    return-void

    :cond_0
    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v10, 0x0

    if-nez v0, :cond_1

    new-instance v11, Lm1/g$b;

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v6

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lm1/g$b;-><init>(Lm1/g;ILm1/d;Lm1/d;Lm1/d;Lm1/d;I)V

    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, v8, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/g$b;

    invoke-virtual {v0}, Lm1/g$b;->b()V

    invoke-virtual/range {p0 .. p0}, Lm1/e;->L()Lm1/d;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lm1/e;->G()Lm1/d;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lm1/l;->j2()I

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lm1/l;->l2()I

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v19

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v20

    move-object v11, v0

    move/from16 v12, p3

    move/from16 v21, p4

    invoke-virtual/range {v11 .. v21}, Lm1/g$b;->j(ILm1/d;Lm1/d;Lm1/d;Lm1/d;IIIII)V

    :goto_0
    move v0, v10

    :goto_1
    if-ge v0, v9, :cond_2

    aget-object v1, p1, v0

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11, v1}, Lm1/g$b;->a(Lm1/e;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v11}, Lm1/g$b;->f()I

    move-result v0

    aput v0, p5, v10

    invoke-virtual {v11}, Lm1/g$b;->d()I

    move-result v0

    const/4 v1, 0x1

    aput v0, p5, v1

    return-void
.end method

.method public static final synthetic w2(Lm1/g;)[Lm1/e;
    .locals 0

    iget-object p0, p0, Lm1/g;->q1:[Lm1/e;

    return-object p0
.end method

.method public static final synthetic x2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->r1:I

    return p0
.end method

.method public static final synthetic y2(Lm1/g;)F
    .locals 0

    iget p0, p0, Lm1/g;->b1:F

    return p0
.end method

.method public static final synthetic z2(Lm1/g;)I
    .locals 0

    iget p0, p0, Lm1/g;->V0:I

    return p0
.end method


# virtual methods
.method public final X2(F)V
    .locals 0

    iput p1, p0, Lm1/g;->b1:F

    return-void
.end method

.method public final Y2(I)V
    .locals 0

    iput p1, p0, Lm1/g;->V0:I

    return-void
.end method

.method public final Z2(F)V
    .locals 0

    iput p1, p0, Lm1/g;->c1:F

    return-void
.end method

.method public final a3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->W0:I

    return-void
.end method

.method public final b3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->h1:I

    return-void
.end method

.method public final c3(F)V
    .locals 0

    iput p1, p0, Lm1/g;->Z0:F

    return-void
.end method

.method public d(Le1/d;Z)V
    .locals 6

    .prologue
    const-string v0, "system"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lm1/e;->d(Le1/d;Z)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object p1

    check-cast p1, Lm1/f;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm1/f;->J2()Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iget v1, p0, Lm1/g;->j1:I

    const-string v2, "get(...)"

    if-eqz v1, :cond_6

    if-eq v1, v0, :cond_4

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    goto :goto_5

    :cond_1
    iget-object v1, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, p2

    :goto_1
    if-ge v3, v1, :cond_7

    iget-object v4, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lm1/g$b;

    add-int/lit8 v5, v1, -0x1

    if-ne v3, v5, :cond_2

    move v5, v0

    goto :goto_2

    :cond_2
    move v5, p2

    :goto_2
    invoke-virtual {v4, p1, v3, v5}, Lm1/g$b;->c(ZIZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-direct {p0, p1}, Lm1/g;->Q2(Z)V

    goto :goto_5

    :cond_4
    iget-object v1, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    move v3, p2

    :goto_3
    if-ge v3, v1, :cond_7

    iget-object v4, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lm1/g$b;

    add-int/lit8 v5, v1, -0x1

    if-ne v3, v5, :cond_5

    move v5, v0

    goto :goto_4

    :cond_5
    move v5, p2

    :goto_4
    invoke-virtual {v4, p1, v3, v5}, Lm1/g$b;->c(ZIZ)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_7

    iget-object v1, p0, Lm1/g;->m1:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lm1/g$b;

    invoke-virtual {v1, p1, p2, v0}, Lm1/g$b;->c(ZIZ)V

    :cond_7
    :goto_5
    invoke-virtual {p0, p2}, Lm1/l;->q2(Z)V

    return-void
.end method

.method public final d3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->f1:I

    return-void
.end method

.method public final e3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->T0:I

    return-void
.end method

.method public final f3(F)V
    .locals 0

    iput p1, p0, Lm1/g;->d1:F

    return-void
.end method

.method public final g3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->X0:I

    return-void
.end method

.method public final h3(F)V
    .locals 0

    iput p1, p0, Lm1/g;->e1:F

    return-void
.end method

.method public final i3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->Y0:I

    return-void
.end method

.method public final j3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->k1:I

    return-void
.end method

.method public final k3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->l1:I

    return-void
.end method

.method public final l3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->i1:I

    return-void
.end method

.method public m2(IIII)V
    .locals 19

    .prologue
    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v0

    const/4 v11, 0x0

    if-lez v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lm1/l;->o2()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v6, v11, v11}, Lm1/l;->r2(II)V

    invoke-virtual {v6, v11}, Lm1/l;->q2(Z)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lm1/l;->j2()I

    move-result v12

    invoke-virtual/range {p0 .. p0}, Lm1/l;->k2()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lm1/l;->l2()I

    move-result v14

    invoke-virtual/range {p0 .. p0}, Lm1/l;->i2()I

    move-result v15

    const/4 v0, 0x2

    new-array v5, v0, [I

    sub-int v1, v8, v12

    sub-int/2addr v1, v13

    iget v2, v6, Lm1/g;->l1:I

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    sub-int v1, v10, v14

    sub-int/2addr v1, v15

    :cond_1
    move/from16 v16, v1

    const/4 v1, -0x1

    if-nez v2, :cond_3

    iget v2, v6, Lm1/g;->T0:I

    if-ne v2, v1, :cond_2

    iput v11, v6, Lm1/g;->T0:I

    :cond_2
    iget v2, v6, Lm1/g;->U0:I

    if-ne v2, v1, :cond_5

    :goto_0
    iput v11, v6, Lm1/g;->U0:I

    goto :goto_1

    :cond_3
    iget v2, v6, Lm1/g;->T0:I

    if-ne v2, v1, :cond_4

    iput v11, v6, Lm1/g;->T0:I

    :cond_4
    iget v2, v6, Lm1/g;->U0:I

    if-ne v2, v1, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v2

    move v3, v11

    move/from16 v17, v3

    :goto_2
    const/16 v11, 0x8

    if-ge v3, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v18

    aget-object v18, v18, v3

    invoke-static/range {v18 .. v18}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v18 .. v18}, Lm1/e;->A0()I

    move-result v0

    if-ne v0, v11, :cond_6

    add-int/lit8 v17, v17, 0x1

    :cond_6
    add-int/lit8 v3, v3, 0x1

    const/4 v0, 0x2

    goto :goto_2

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v0

    if-lez v17, :cond_a

    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v0

    sub-int v0, v0, v17

    new-array v0, v0, [Lm1/e;

    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_3
    if-ge v2, v1, :cond_9

    invoke-virtual/range {p0 .. p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v17

    aget-object v17, v17, v2

    invoke-static/range {v17 .. v17}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v17 .. v17}, Lm1/e;->A0()I

    move-result v4

    if-eq v4, v11, :cond_8

    aput-object v17, v0, v3

    add-int/lit8 v3, v3, 0x1

    :cond_8
    add-int/lit8 v2, v2, 0x1

    const/4 v4, 0x1

    goto :goto_3

    :cond_9
    move-object v1, v0

    move v2, v3

    goto :goto_4

    :cond_a
    move v2, v0

    :goto_4
    iput-object v1, v6, Lm1/g;->q1:[Lm1/e;

    iput v2, v6, Lm1/g;->r1:I

    iget v0, v6, Lm1/g;->j1:I

    if-eqz v0, :cond_e

    const/4 v4, 0x1

    if-eq v0, v4, :cond_d

    const/4 v3, 0x2

    if-eq v0, v3, :cond_c

    const/4 v3, 0x3

    if-eq v0, v3, :cond_b

    move v11, v4

    move-object/from16 v17, v5

    :goto_5
    const/4 v0, 0x0

    goto :goto_6

    :cond_b
    iget v3, v6, Lm1/g;->l1:I

    move-object/from16 v0, p0

    move v11, v4

    move/from16 v4, v16

    move-object/from16 v17, v5

    invoke-direct/range {v0 .. v5}, Lm1/g;->V2([Lm1/e;III[I)V

    goto :goto_5

    :cond_c
    move v11, v4

    move-object/from16 v17, v5

    iget v3, v6, Lm1/g;->l1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lm1/g;->T2([Lm1/e;III[I)V

    goto :goto_5

    :cond_d
    move v11, v4

    move-object/from16 v17, v5

    iget v3, v6, Lm1/g;->l1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lm1/g;->U2([Lm1/e;III[I)V

    goto :goto_5

    :cond_e
    move-object/from16 v17, v5

    const/4 v11, 0x1

    iget v3, v6, Lm1/g;->l1:I

    move-object/from16 v0, p0

    move/from16 v4, v16

    invoke-direct/range {v0 .. v5}, Lm1/g;->W2([Lm1/e;III[I)V

    goto :goto_5

    :goto_6
    aget v1, v17, v0

    add-int/2addr v1, v12

    add-int/2addr v1, v13

    aget v2, v17, v11

    add-int/2addr v2, v14

    add-int/2addr v2, v15

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, -0x80000000

    if-eq v7, v4, :cond_10

    if-eqz v7, :cond_11

    if-eq v7, v3, :cond_f

    move v1, v0

    goto :goto_7

    :cond_f
    move v1, v8

    goto :goto_7

    :cond_10
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_11
    :goto_7
    if-eq v9, v4, :cond_13

    if-eqz v9, :cond_14

    if-eq v9, v3, :cond_12

    move v2, v0

    goto :goto_8

    :cond_12
    move v2, v10

    goto :goto_8

    :cond_13
    invoke-static {v2, v10}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_14
    :goto_8
    invoke-virtual {v6, v1, v2}, Lm1/l;->r2(II)V

    invoke-virtual {v6, v1}, Lm1/e;->U1(I)V

    invoke-virtual {v6, v2}, Lm1/e;->m1(I)V

    invoke-virtual/range {p0 .. p0}, Lm1/j;->e2()I

    move-result v1

    if-lez v1, :cond_15

    goto :goto_9

    :cond_15
    move v11, v0

    :goto_9
    invoke-virtual {v6, v11}, Lm1/l;->q2(Z)V

    return-void
.end method

.method public final m3(F)V
    .locals 0

    iput p1, p0, Lm1/g;->a1:F

    return-void
.end method

.method public final n3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->g1:I

    return-void
.end method

.method public final o3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->U0:I

    return-void
.end method

.method public final p3(I)V
    .locals 0

    iput p1, p0, Lm1/g;->j1:I

    return-void
.end method
