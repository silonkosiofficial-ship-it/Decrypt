.class public Lr1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr1/e$b;
    }
.end annotation


# static fields
.field public static v0:F = 0.5f


# instance fields
.field private A:Z

.field public B:Lr1/d;

.field public C:Lr1/d;

.field public D:Lr1/d;

.field public E:Lr1/d;

.field F:Lr1/d;

.field G:Lr1/d;

.field H:Lr1/d;

.field I:Lr1/d;

.field public J:[Lr1/d;

.field protected K:Ljava/util/ArrayList;

.field private L:[Z

.field public M:[Lr1/e$b;

.field public N:Lr1/e;

.field O:I

.field P:I

.field public Q:F

.field protected R:I

.field protected S:I

.field protected T:I

.field U:I

.field V:I

.field protected W:I

.field protected X:I

.field Y:I

.field protected Z:I

.field public a:Z

.field protected a0:I

.field public b:[Ls1/m;

.field b0:F

.field public c:Ls1/c;

.field c0:F

.field public d:Ls1/c;

.field private d0:Ljava/lang/Object;

.field public e:Ls1/j;

.field private e0:I

.field public f:Ls1/l;

.field private f0:I

.field public g:[Z

.field private g0:Ljava/lang/String;

.field public h:[I

.field private h0:Ljava/lang/String;

.field i:Z

.field i0:Z

.field public j:I

.field j0:Z

.field public k:I

.field k0:Z

.field public l:I

.field l0:Z

.field public m:I

.field m0:I

.field public n:[I

.field n0:I

.field public o:I

.field o0:Z

.field public p:I

.field p0:Z

.field public q:F

.field public q0:[F

.field public r:I

.field protected r0:[Lr1/e;

.field public s:I

.field protected s0:[Lr1/e;

.field public t:F

.field t0:Lr1/e;

.field u:I

.field u0:Lr1/e;

.field v:F

.field private w:[I

.field private x:F

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr1/e;->a:Z

    const/4 v1, 0x2

    new-array v2, v1, [Ls1/m;

    iput-object v2, p0, Lr1/e;->b:[Ls1/m;

    new-instance v2, Ls1/j;

    invoke-direct {v2, p0}, Ls1/j;-><init>(Lr1/e;)V

    iput-object v2, p0, Lr1/e;->e:Ls1/j;

    new-instance v2, Ls1/l;

    invoke-direct {v2, p0}, Ls1/l;-><init>(Lr1/e;)V

    iput-object v2, p0, Lr1/e;->f:Ls1/l;

    const/4 v2, 0x1

    new-array v3, v1, [Z

    fill-array-data v3, :array_0

    iput-object v3, p0, Lr1/e;->g:[Z

    filled-new-array {v0, v0, v0, v0}, [I

    move-result-object v3

    iput-object v3, p0, Lr1/e;->h:[I

    iput-boolean v0, p0, Lr1/e;->i:Z

    const/4 v3, -0x1

    iput v3, p0, Lr1/e;->j:I

    iput v3, p0, Lr1/e;->k:I

    iput v0, p0, Lr1/e;->l:I

    iput v0, p0, Lr1/e;->m:I

    new-array v4, v1, [I

    iput-object v4, p0, Lr1/e;->n:[I

    iput v0, p0, Lr1/e;->o:I

    iput v0, p0, Lr1/e;->p:I

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lr1/e;->q:F

    iput v0, p0, Lr1/e;->r:I

    iput v0, p0, Lr1/e;->s:I

    iput v4, p0, Lr1/e;->t:F

    iput v3, p0, Lr1/e;->u:I

    iput v4, p0, Lr1/e;->v:F

    const v4, 0x7fffffff

    filled-new-array {v4, v4}, [I

    move-result-object v4

    iput-object v4, p0, Lr1/e;->w:[I

    const/4 v4, 0x0

    iput v4, p0, Lr1/e;->x:F

    iput-boolean v0, p0, Lr1/e;->y:Z

    iput-boolean v0, p0, Lr1/e;->A:Z

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->D:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->B:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->E:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->C:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->F:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->D:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->G:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->E:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->H:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->F:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->J:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->G:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->K:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->H:Lr1/d;

    new-instance v5, Lr1/d;

    sget-object v6, Lr1/d$b;->I:Lr1/d$b;

    invoke-direct {v5, p0, v6}, Lr1/d;-><init>(Lr1/e;Lr1/d$b;)V

    iput-object v5, p0, Lr1/e;->I:Lr1/d;

    iget-object v6, p0, Lr1/e;->B:Lr1/d;

    iget-object v7, p0, Lr1/e;->D:Lr1/d;

    iget-object v8, p0, Lr1/e;->C:Lr1/d;

    iget-object v9, p0, Lr1/e;->E:Lr1/d;

    iget-object v10, p0, Lr1/e;->F:Lr1/d;

    const/4 v11, 0x6

    new-array v11, v11, [Lr1/d;

    aput-object v6, v11, v0

    aput-object v7, v11, v2

    aput-object v8, v11, v1

    const/4 v6, 0x3

    aput-object v9, v11, v6

    const/4 v6, 0x4

    aput-object v10, v11, v6

    const/4 v6, 0x5

    aput-object v5, v11, v6

    iput-object v11, p0, Lr1/e;->J:[Lr1/d;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lr1/e;->K:Ljava/util/ArrayList;

    new-array v5, v1, [Z

    iput-object v5, p0, Lr1/e;->L:[Z

    new-array v5, v1, [Lr1/e$b;

    sget-object v6, Lr1/e$b;->C:Lr1/e$b;

    aput-object v6, v5, v0

    aput-object v6, v5, v2

    iput-object v5, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v5, 0x0

    iput-object v5, p0, Lr1/e;->N:Lr1/e;

    iput v0, p0, Lr1/e;->O:I

    iput v0, p0, Lr1/e;->P:I

    iput v4, p0, Lr1/e;->Q:F

    iput v3, p0, Lr1/e;->R:I

    iput v0, p0, Lr1/e;->S:I

    iput v0, p0, Lr1/e;->T:I

    iput v0, p0, Lr1/e;->U:I

    iput v0, p0, Lr1/e;->V:I

    iput v0, p0, Lr1/e;->W:I

    iput v0, p0, Lr1/e;->X:I

    iput v0, p0, Lr1/e;->Y:I

    sget v3, Lr1/e;->v0:F

    iput v3, p0, Lr1/e;->b0:F

    iput v3, p0, Lr1/e;->c0:F

    iput v0, p0, Lr1/e;->e0:I

    iput v0, p0, Lr1/e;->f0:I

    iput-object v5, p0, Lr1/e;->g0:Ljava/lang/String;

    iput-object v5, p0, Lr1/e;->h0:Ljava/lang/String;

    iput-boolean v0, p0, Lr1/e;->k0:Z

    iput-boolean v0, p0, Lr1/e;->l0:Z

    iput v0, p0, Lr1/e;->m0:I

    iput v0, p0, Lr1/e;->n0:I

    new-array v3, v1, [F

    fill-array-data v3, :array_1

    iput-object v3, p0, Lr1/e;->q0:[F

    new-array v3, v1, [Lr1/e;

    aput-object v5, v3, v0

    aput-object v5, v3, v2

    iput-object v3, p0, Lr1/e;->r0:[Lr1/e;

    new-array v1, v1, [Lr1/e;

    aput-object v5, v1, v0

    aput-object v5, v1, v2

    iput-object v1, p0, Lr1/e;->s0:[Lr1/e;

    iput-object v5, p0, Lr1/e;->t0:Lr1/e;

    iput-object v5, p0, Lr1/e;->u0:Lr1/e;

    invoke-direct {p0}, Lr1/e;->d()V

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x1t
    .end array-data

    nop

    :array_1
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
    .end array-data
.end method

.method private U(I)Z
    .locals 3

    .prologue
    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lr1/e;->J:[Lr1/d;

    aget-object v1, v0, p1

    iget-object v2, v1, Lr1/d;->d:Lr1/d;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lr1/d;->d:Lr1/d;

    if-eq v2, v1, :cond_0

    const/4 v1, 0x1

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    iget-object v0, p1, Lr1/d;->d:Lr1/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lr1/d;->d:Lr1/d;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->G:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->H:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->I:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    iget-object v1, p0, Lr1/e;->F:Lr1/d;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private h(Lq1/d;ZZZZLq1/i;Lq1/i;Lr1/e$b;ZLr1/d;Lr1/d;IIIIFZZZZIIIIFZ)V
    .locals 31

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p10

    move-object/from16 v14, p11

    move/from16 v15, p14

    move/from16 v1, p15

    move/from16 v2, p22

    move/from16 v3, p23

    move/from16 v4, p24

    invoke-virtual {v10, v13}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v9

    invoke-virtual {v10, v14}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v8

    invoke-virtual/range {p10 .. p10}, Lr1/d;->g()Lr1/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v7

    invoke-virtual/range {p11 .. p11}, Lr1/d;->g()Lr1/d;

    move-result-object v5

    invoke-virtual {v10, v5}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v6

    invoke-static {}, Lq1/d;->w()Lq1/e;

    invoke-virtual/range {p10 .. p10}, Lr1/d;->j()Z

    move-result v16

    invoke-virtual/range {p11 .. p11}, Lr1/d;->j()Z

    move-result v17

    iget-object v5, v0, Lr1/e;->I:Lr1/d;

    invoke-virtual {v5}, Lr1/d;->j()Z

    move-result v18

    if-eqz v17, :cond_0

    add-int/lit8 v5, v16, 0x1

    goto :goto_0

    :cond_0
    move/from16 v5, v16

    :goto_0
    if-eqz v18, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    if-eqz p17, :cond_2

    const/16 v19, 0x3

    goto :goto_1

    :cond_2
    move/from16 v19, p21

    :goto_1
    sget-object v20, Lr1/e$a;->b:[I

    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v21

    aget v12, v20, v21

    const/4 v2, 0x1

    if-eq v12, v2, :cond_3

    const/4 v2, 0x2

    if-eq v12, v2, :cond_3

    const/4 v2, 0x3

    if-eq v12, v2, :cond_3

    const/4 v2, 0x4

    if-eq v12, v2, :cond_4

    :cond_3
    move/from16 v12, v19

    :goto_2
    const/16 v19, 0x0

    goto :goto_3

    :cond_4
    move/from16 v12, v19

    if-ne v12, v2, :cond_5

    goto :goto_2

    :cond_5
    const/16 v19, 0x1

    :goto_3
    iget v2, v0, Lr1/e;->f0:I

    const/16 v14, 0x8

    if-ne v2, v14, :cond_6

    const/4 v2, 0x0

    const/16 v19, 0x0

    goto :goto_4

    :cond_6
    move/from16 v2, p13

    :goto_4
    if-eqz p26, :cond_9

    if-nez v16, :cond_8

    if-nez v17, :cond_8

    if-nez v18, :cond_8

    move/from16 v14, p12

    invoke-virtual {v10, v9, v14}, Lq1/d;->f(Lq1/i;I)V

    :cond_7
    move-object/from16 v23, v6

    const/16 v6, 0x8

    goto :goto_5

    :cond_8
    if-eqz v16, :cond_7

    if-nez v17, :cond_7

    invoke-virtual/range {p10 .. p10}, Lr1/d;->c()I

    move-result v14

    move-object/from16 v23, v6

    const/16 v6, 0x8

    invoke-virtual {v10, v9, v7, v14, v6}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    goto :goto_5

    :cond_9
    move-object/from16 v23, v6

    move v6, v14

    :goto_5
    if-nez v19, :cond_d

    if-eqz p9, :cond_b

    const/4 v6, 0x0

    const/4 v14, 0x3

    invoke-virtual {v10, v8, v9, v6, v14}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    const/16 v6, 0x8

    if-lez v15, :cond_a

    invoke-virtual {v10, v8, v9, v15, v6}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_a
    const v2, 0x7fffffff

    if-ge v1, v2, :cond_c

    invoke-virtual {v10, v8, v9, v1, v6}, Lq1/d;->j(Lq1/i;Lq1/i;II)V

    goto :goto_6

    :cond_b
    invoke-virtual {v10, v8, v9, v2, v6}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    :cond_c
    :goto_6
    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    :goto_7
    move/from16 v25, v19

    move-object/from16 v14, v23

    move/from16 v19, p5

    :goto_8
    move/from16 v23, v5

    goto/16 :goto_10

    :cond_d
    const/4 v1, 0x2

    if-eq v5, v1, :cond_10

    if-nez p17, :cond_10

    const/4 v1, 0x1

    if-eq v12, v1, :cond_e

    if-nez v12, :cond_10

    :cond_e
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v4, :cond_f

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_f
    const/16 v2, 0x8

    invoke-virtual {v10, v8, v9, v1, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    move/from16 v19, p5

    move/from16 v24, v3

    move v1, v4

    move-object v15, v7

    move-object v2, v8

    move-object/from16 v14, v23

    const/16 v25, 0x0

    goto :goto_8

    :cond_10
    const/4 v1, -0x2

    if-ne v3, v1, :cond_11

    move v14, v2

    goto :goto_9

    :cond_11
    move v14, v3

    :goto_9
    if-ne v4, v1, :cond_12

    move v1, v2

    goto :goto_a

    :cond_12
    move v1, v4

    :goto_a
    if-lez v2, :cond_13

    const/4 v3, 0x1

    if-eq v12, v3, :cond_13

    const/4 v2, 0x0

    :cond_13
    const/16 v3, 0x8

    if-lez v14, :cond_14

    invoke-virtual {v10, v8, v9, v14, v3}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    invoke-static {v2, v14}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_14
    const/4 v4, 0x1

    if-lez v1, :cond_16

    if-eqz p3, :cond_15

    if-ne v12, v4, :cond_15

    goto :goto_b

    :cond_15
    invoke-virtual {v10, v8, v9, v1, v3}, Lq1/d;->j(Lq1/i;Lq1/i;II)V

    :goto_b
    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_16
    if-ne v12, v4, :cond_18

    if-eqz p3, :cond_17

    invoke-virtual {v10, v8, v9, v2, v3}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    goto :goto_c

    :cond_17
    const/4 v4, 0x5

    invoke-virtual {v10, v8, v9, v2, v4}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    invoke-virtual {v10, v8, v9, v2, v3}, Lq1/d;->j(Lq1/i;Lq1/i;II)V

    :goto_c
    move-object v15, v7

    move-object v2, v8

    move/from16 v24, v14

    goto :goto_7

    :cond_18
    const/4 v2, 0x2

    if-ne v12, v2, :cond_1b

    invoke-virtual/range {p10 .. p10}, Lr1/d;->h()Lr1/d$b;

    move-result-object v3

    sget-object v4, Lr1/d$b;->E:Lr1/d$b;

    if-eq v3, v4, :cond_1a

    invoke-virtual/range {p10 .. p10}, Lr1/d;->h()Lr1/d$b;

    move-result-object v3

    sget-object v6, Lr1/d$b;->G:Lr1/d$b;

    if-ne v3, v6, :cond_19

    goto :goto_e

    :cond_19
    iget-object v3, v0, Lr1/e;->N:Lr1/e;

    sget-object v4, Lr1/d$b;->D:Lr1/d$b;

    invoke-virtual {v3, v4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v3

    iget-object v4, v0, Lr1/e;->N:Lr1/e;

    sget-object v6, Lr1/d$b;->F:Lr1/d$b;

    :goto_d
    invoke-virtual {v4, v6}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v4

    invoke-virtual {v10, v4}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v4

    move-object/from16 v19, v3

    move-object v6, v4

    goto :goto_f

    :cond_1a
    :goto_e
    iget-object v3, v0, Lr1/e;->N:Lr1/e;

    invoke-virtual {v3, v4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v3

    iget-object v4, v0, Lr1/e;->N:Lr1/e;

    sget-object v6, Lr1/d$b;->G:Lr1/d$b;

    goto :goto_d

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lq1/d;->r()Lq1/b;

    move-result-object v3

    move-object v4, v8

    move v2, v5

    move-object v5, v9

    move/from16 p9, v14

    move-object/from16 v14, v23

    move-object v15, v7

    move-object/from16 v7, v19

    move/from16 v23, v2

    move-object v2, v8

    move/from16 v8, p25

    invoke-virtual/range {v3 .. v8}, Lq1/b;->k(Lq1/i;Lq1/i;Lq1/i;Lq1/i;F)Lq1/b;

    move-result-object v3

    invoke-virtual {v10, v3}, Lq1/d;->d(Lq1/b;)V

    move/from16 v19, p5

    move/from16 v24, p9

    const/16 v25, 0x0

    goto :goto_10

    :cond_1b
    move-object v15, v7

    move-object v2, v8

    move/from16 p9, v14

    move-object/from16 v14, v23

    move/from16 v23, v5

    move/from16 v24, p9

    move/from16 v25, v19

    const/16 v19, 0x1

    :goto_10
    if-eqz p26, :cond_4e

    if-eqz p18, :cond_1c

    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    move/from16 v6, v23

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    goto/16 :goto_29

    :cond_1c
    if-nez v16, :cond_1e

    if-nez v17, :cond_1e

    if-nez v18, :cond_1e

    :cond_1d
    :goto_11
    move-object v5, v2

    goto/16 :goto_27

    :cond_1e
    if-eqz v16, :cond_1f

    if-nez v17, :cond_1f

    goto :goto_11

    :cond_1f
    if-nez v16, :cond_20

    if-eqz v17, :cond_20

    invoke-virtual/range {p11 .. p11}, Lr1/d;->c()I

    move-result v1

    neg-int v1, v1

    const/16 v3, 0x8

    invoke-virtual {v10, v2, v14, v1, v3}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    if-eqz p3, :cond_1d

    const/4 v1, 0x5

    const/4 v6, 0x0

    invoke-virtual {v10, v9, v11, v6, v1}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    goto :goto_11

    :cond_20
    const/16 v3, 0x8

    const/4 v6, 0x0

    if-eqz v16, :cond_1d

    if-eqz v17, :cond_1d

    iget-object v4, v13, Lr1/d;->d:Lr1/d;

    iget-object v8, v4, Lr1/d;->b:Lr1/e;

    move-object/from16 v5, p11

    move v7, v3

    iget-object v3, v5, Lr1/d;->d:Lr1/d;

    iget-object v4, v3, Lr1/d;->b:Lr1/e;

    invoke-virtual/range {p0 .. p0}, Lr1/e;->G()Lr1/e;

    move-result-object v3

    const/16 v16, 0x6

    if-eqz v25, :cond_31

    if-nez v12, :cond_24

    if-nez v1, :cond_21

    if-nez v24, :cond_21

    move/from16 v18, v6

    move v1, v7

    move/from16 v17, v1

    const/16 v20, 0x1

    goto :goto_12

    :cond_21
    move/from16 v20, v6

    const/4 v1, 0x5

    const/16 v17, 0x5

    const/16 v18, 0x1

    :goto_12
    instance-of v6, v8, Lr1/a;

    if-nez v6, :cond_23

    instance-of v6, v4, Lr1/a;

    if-eqz v6, :cond_22

    goto :goto_13

    :cond_22
    move/from16 v23, v1

    move/from16 v1, v16

    move/from16 v21, v18

    const/4 v6, 0x0

    const/4 v7, 0x1

    move/from16 v18, v17

    goto/16 :goto_1a

    :cond_23
    :goto_13
    move/from16 v23, v1

    move/from16 v1, v16

    move/from16 v21, v18

    const/4 v6, 0x0

    const/4 v7, 0x1

    :goto_14
    const/16 v18, 0x4

    goto/16 :goto_1a

    :cond_24
    const/4 v6, 0x1

    if-ne v12, v6, :cond_25

    move/from16 v23, v7

    move/from16 v1, v16

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x1

    goto/16 :goto_1a

    :cond_25
    const/4 v6, 0x3

    if-ne v12, v6, :cond_30

    iget v6, v0, Lr1/e;->u:I

    const/4 v7, -0x1

    if-ne v6, v7, :cond_28

    if-eqz p19, :cond_27

    if-eqz p3, :cond_26

    const/4 v1, 0x5

    :goto_15
    const/4 v6, 0x1

    const/4 v7, 0x1

    const/16 v18, 0x5

    const/16 v20, 0x1

    const/16 v21, 0x1

    const/16 v23, 0x8

    goto/16 :goto_1a

    :cond_26
    const/4 v1, 0x4

    goto :goto_15

    :cond_27
    const/16 v1, 0x8

    goto :goto_15

    :cond_28
    if-eqz p17, :cond_2b

    move/from16 v6, p22

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2a

    const/4 v7, 0x1

    if-ne v6, v7, :cond_29

    goto :goto_16

    :cond_29
    const/16 v1, 0x8

    const/4 v6, 0x5

    goto :goto_17

    :cond_2a
    const/4 v7, 0x1

    :goto_16
    const/4 v1, 0x5

    const/4 v6, 0x4

    :goto_17
    move/from16 v23, v1

    move/from16 v18, v6

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    goto/16 :goto_1a

    :cond_2b
    const/4 v7, 0x1

    if-lez v1, :cond_2c

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x5

    :goto_18
    const/16 v23, 0x5

    goto :goto_1a

    :cond_2c
    if-nez v1, :cond_2f

    if-nez v24, :cond_2f

    if-nez p19, :cond_2d

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x8

    goto :goto_18

    :cond_2d
    if-eq v8, v3, :cond_2e

    if-eq v4, v3, :cond_2e

    const/4 v1, 0x4

    goto :goto_19

    :cond_2e
    const/4 v1, 0x5

    :goto_19
    move/from16 v23, v1

    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    goto/16 :goto_14

    :cond_2f
    move v6, v7

    move/from16 v20, v6

    move/from16 v21, v20

    move/from16 v1, v16

    const/16 v18, 0x4

    goto :goto_18

    :cond_30
    const/4 v7, 0x1

    move/from16 v1, v16

    const/4 v6, 0x0

    const/16 v18, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    goto :goto_18

    :cond_31
    const/4 v7, 0x1

    move v6, v7

    move/from16 v21, v6

    move/from16 v1, v16

    const/16 v18, 0x4

    const/16 v20, 0x0

    goto :goto_18

    :goto_1a
    if-eqz v6, :cond_32

    if-ne v15, v14, :cond_32

    if-eq v8, v3, :cond_32

    const/16 v26, 0x0

    const/16 v27, 0x0

    goto :goto_1b

    :cond_32
    move/from16 v26, v6

    move/from16 v27, v7

    :goto_1b
    if-eqz v21, :cond_34

    iget v6, v0, Lr1/e;->f0:I

    const/16 v7, 0x8

    if-ne v6, v7, :cond_33

    const/16 v17, 0x4

    goto :goto_1c

    :cond_33
    move/from16 v17, v1

    :goto_1c
    invoke-virtual/range {p10 .. p10}, Lr1/d;->c()I

    move-result v6

    invoke-virtual/range {p11 .. p11}, Lr1/d;->c()I

    move-result v28

    move-object/from16 v1, p1

    move-object/from16 p5, v2

    const/4 v13, 0x0

    const/16 v21, 0x4

    const/16 v22, 0x1

    move-object v2, v9

    move-object v13, v3

    move-object v3, v15

    move/from16 p21, v12

    move-object v12, v4

    move v4, v6

    move-object v6, v5

    move/from16 v5, p16

    move-object v6, v14

    move v11, v7

    move-object/from16 v7, p5

    move-object/from16 v29, v8

    move/from16 v8, v28

    move-object/from16 v30, v9

    move/from16 v9, v17

    invoke-virtual/range {v1 .. v9}, Lq1/d;->c(Lq1/i;Lq1/i;IFLq1/i;Lq1/i;II)V

    goto :goto_1d

    :cond_34
    move-object/from16 p5, v2

    move-object v13, v3

    move/from16 v22, v7

    move-object/from16 v29, v8

    move-object/from16 v30, v9

    move/from16 p21, v12

    const/16 v11, 0x8

    const/16 v21, 0x4

    move-object v12, v4

    :goto_1d
    iget v1, v0, Lr1/e;->f0:I

    if-ne v1, v11, :cond_35

    return-void

    :cond_35
    if-eqz v26, :cond_39

    if-eqz p3, :cond_37

    if-eq v15, v14, :cond_37

    if-nez v25, :cond_37

    move-object/from16 v1, v29

    instance-of v2, v1, Lr1/a;

    if-nez v2, :cond_36

    instance-of v2, v12, Lr1/a;

    if-eqz v2, :cond_38

    :cond_36
    move/from16 v2, v16

    goto :goto_1e

    :cond_37
    move-object/from16 v1, v29

    :cond_38
    move/from16 v2, v23

    :goto_1e
    invoke-virtual/range {p10 .. p10}, Lr1/d;->c()I

    move-result v3

    move-object/from16 v4, v30

    invoke-virtual {v10, v4, v15, v3, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    invoke-virtual/range {p11 .. p11}, Lr1/d;->c()I

    move-result v3

    neg-int v3, v3

    move-object/from16 v5, p5

    invoke-virtual {v10, v5, v14, v3, v2}, Lq1/d;->j(Lq1/i;Lq1/i;II)V

    move/from16 v23, v2

    goto :goto_1f

    :cond_39
    move-object/from16 v5, p5

    move-object/from16 v1, v29

    move-object/from16 v4, v30

    :goto_1f
    if-eqz p3, :cond_3a

    if-eqz p20, :cond_3a

    instance-of v2, v1, Lr1/a;

    if-nez v2, :cond_3a

    instance-of v2, v12, Lr1/a;

    if-nez v2, :cond_3a

    move/from16 v3, v16

    move v6, v3

    move/from16 v2, v22

    goto :goto_20

    :cond_3a
    move/from16 v3, v18

    move/from16 v6, v23

    move/from16 v2, v27

    :goto_20
    if-eqz v2, :cond_46

    if-eqz v20, :cond_43

    if-eqz p19, :cond_3b

    if-eqz p4, :cond_43

    :cond_3b
    if-eq v1, v13, :cond_3d

    if-ne v12, v13, :cond_3c

    goto :goto_21

    :cond_3c
    move/from16 v16, v3

    :cond_3d
    :goto_21
    instance-of v2, v1, Lr1/h;

    if-nez v2, :cond_3e

    instance-of v2, v12, Lr1/h;

    if-eqz v2, :cond_3f

    :cond_3e
    const/16 v16, 0x5

    :cond_3f
    instance-of v2, v1, Lr1/a;

    if-nez v2, :cond_40

    instance-of v2, v12, Lr1/a;

    if-eqz v2, :cond_41

    :cond_40
    const/16 v16, 0x5

    :cond_41
    if-eqz p19, :cond_42

    const/4 v2, 0x5

    goto :goto_22

    :cond_42
    move/from16 v2, v16

    :goto_22
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_23

    :cond_43
    move v2, v3

    :goto_23
    if-eqz p3, :cond_45

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-eqz p17, :cond_45

    if-nez p19, :cond_45

    if-eq v1, v13, :cond_44

    if-ne v12, v13, :cond_45

    :cond_44
    move/from16 v2, v21

    :cond_45
    invoke-virtual/range {p10 .. p10}, Lr1/d;->c()I

    move-result v1

    invoke-virtual {v10, v4, v15, v1, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    invoke-virtual/range {p11 .. p11}, Lr1/d;->c()I

    move-result v1

    neg-int v1, v1

    invoke-virtual {v10, v5, v14, v1, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    :cond_46
    if-eqz p3, :cond_48

    move-object/from16 v1, p6

    move v2, v11

    if-ne v1, v15, :cond_47

    invoke-virtual/range {p10 .. p10}, Lr1/d;->c()I

    move-result v3

    goto :goto_24

    :cond_47
    const/4 v3, 0x0

    :goto_24
    if-eq v15, v1, :cond_49

    const/4 v6, 0x5

    invoke-virtual {v10, v4, v1, v3, v6}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    goto :goto_25

    :cond_48
    move v2, v11

    :cond_49
    :goto_25
    if-eqz p3, :cond_4b

    if-eqz v25, :cond_4b

    if-nez p14, :cond_4b

    if-nez v24, :cond_4b

    if-eqz v25, :cond_4a

    move/from16 v12, p21

    const/4 v1, 0x3

    if-ne v12, v1, :cond_4a

    const/4 v1, 0x0

    :goto_26
    invoke-virtual {v10, v5, v4, v1, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    goto :goto_27

    :cond_4a
    const/4 v1, 0x0

    const/4 v2, 0x5

    goto :goto_26

    :cond_4b
    :goto_27
    if-eqz p3, :cond_4d

    if-eqz v19, :cond_4d

    move-object/from16 v1, p11

    iget-object v2, v1, Lr1/d;->d:Lr1/d;

    if-eqz v2, :cond_4c

    invoke-virtual/range {p11 .. p11}, Lr1/d;->c()I

    move-result v2

    move-object/from16 v3, p7

    goto :goto_28

    :cond_4c
    move-object/from16 v3, p7

    const/4 v2, 0x0

    :goto_28
    if-eq v14, v3, :cond_4d

    const/4 v1, 0x5

    invoke-virtual {v10, v3, v5, v2, v1}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_4d
    return-void

    :cond_4e
    move-object/from16 v3, p7

    move-object v5, v2

    move-object v4, v9

    move-object v1, v11

    const/16 v2, 0x8

    const/4 v7, 0x2

    const/16 v22, 0x1

    move/from16 v6, v23

    :goto_29
    if-ge v6, v7, :cond_53

    if-eqz p3, :cond_53

    if-eqz v19, :cond_53

    const/4 v6, 0x0

    invoke-virtual {v10, v4, v1, v6, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    if-nez p2, :cond_50

    iget-object v1, v0, Lr1/e;->F:Lr1/d;

    iget-object v1, v1, Lr1/d;->d:Lr1/d;

    if-nez v1, :cond_4f

    goto :goto_2a

    :cond_4f
    const/4 v1, 0x0

    goto :goto_2b

    :cond_50
    :goto_2a
    move/from16 v1, v22

    :goto_2b
    if-nez p2, :cond_52

    iget-object v4, v0, Lr1/e;->F:Lr1/d;

    iget-object v4, v4, Lr1/d;->d:Lr1/d;

    if-eqz v4, :cond_52

    iget-object v1, v4, Lr1/d;->b:Lr1/e;

    iget v4, v1, Lr1/e;->Q:F

    const/4 v6, 0x0

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_51

    iget-object v1, v1, Lr1/e;->M:[Lr1/e$b;

    const/4 v4, 0x0

    aget-object v6, v1, v4

    sget-object v4, Lr1/e$b;->E:Lr1/e$b;

    if-ne v6, v4, :cond_51

    aget-object v1, v1, v22

    if-ne v1, v4, :cond_51

    goto :goto_2c

    :cond_51
    const/16 v22, 0x0

    goto :goto_2c

    :cond_52
    move/from16 v22, v1

    :goto_2c
    if-eqz v22, :cond_53

    const/4 v1, 0x0

    invoke-virtual {v10, v3, v5, v1, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_53
    return-void
.end method


# virtual methods
.method public A(I)I
    .locals 1

    .prologue
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lr1/e;->P()I

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lr1/e;->v()I

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public A0(Lr1/e$b;)V
    .locals 2

    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x1

    aput-object p1, v0, v1

    return-void
.end method

.method public B()I
    .locals 2

    iget-object v0, p0, Lr1/e;->w:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    return v0
.end method

.method public B0(IIIF)V
    .locals 0

    .prologue
    iput p1, p0, Lr1/e;->m:I

    iput p2, p0, Lr1/e;->r:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lr1/e;->s:I

    iput p4, p0, Lr1/e;->t:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lr1/e;->m:I

    :cond_1
    return-void
.end method

.method public C()I
    .locals 2

    iget-object v0, p0, Lr1/e;->w:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public C0(F)V
    .locals 2

    iget-object v0, p0, Lr1/e;->q0:[F

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public D()I
    .locals 1

    iget v0, p0, Lr1/e;->a0:I

    return v0
.end method

.method public D0(I)V
    .locals 0

    iput p1, p0, Lr1/e;->f0:I

    return-void
.end method

.method public E()I
    .locals 1

    iget v0, p0, Lr1/e;->Z:I

    return v0
.end method

.method public E0(I)V
    .locals 1

    .prologue
    iput p1, p0, Lr1/e;->O:I

    iget v0, p0, Lr1/e;->Z:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lr1/e;->O:I

    :cond_0
    return-void
.end method

.method public F(I)Lr1/e;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, Lr1/e;->D:Lr1/d;

    iget-object v0, p1, Lr1/d;->d:Lr1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lr1/d;->b:Lr1/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lr1/e;->E:Lr1/d;

    iget-object v0, p1, Lr1/d;->d:Lr1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lr1/d;->b:Lr1/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public F0(I)V
    .locals 0

    iput p1, p0, Lr1/e;->S:I

    return-void
.end method

.method public G()Lr1/e;
    .locals 1

    iget-object v0, p0, Lr1/e;->N:Lr1/e;

    return-object v0
.end method

.method public G0(I)V
    .locals 0

    iput p1, p0, Lr1/e;->T:I

    return-void
.end method

.method public H(I)Lr1/e;
    .locals 2

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, Lr1/e;->B:Lr1/d;

    iget-object v0, p1, Lr1/d;->d:Lr1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lr1/d;->b:Lr1/e;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lr1/e;->C:Lr1/d;

    iget-object v0, p1, Lr1/d;->d:Lr1/d;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-ne v1, p1, :cond_1

    iget-object p1, v0, Lr1/d;->b:Lr1/e;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public H0(ZZZZ)V
    .locals 3

    .prologue
    iget p1, p0, Lr1/e;->u:I

    const/high16 p2, 0x3f800000    # 1.0f

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-ne p1, v2, :cond_1

    if-eqz p3, :cond_0

    if-nez p4, :cond_0

    iput v0, p0, Lr1/e;->u:I

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    if-eqz p4, :cond_1

    iput v1, p0, Lr1/e;->u:I

    iget p1, p0, Lr1/e;->R:I

    if-ne p1, v2, :cond_1

    iget p1, p0, Lr1/e;->v:F

    div-float p1, p2, p1

    iput p1, p0, Lr1/e;->v:F

    :cond_1
    :goto_0
    iget p1, p0, Lr1/e;->u:I

    if-nez p1, :cond_3

    iget-object p1, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput v1, p0, Lr1/e;->u:I

    goto :goto_1

    :cond_3
    iget p1, p0, Lr1/e;->u:I

    if-ne p1, v1, :cond_5

    iget-object p1, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    iput v0, p0, Lr1/e;->u:I

    :cond_5
    :goto_1
    iget p1, p0, Lr1/e;->u:I

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_7

    iput v0, p0, Lr1/e;->u:I

    goto :goto_2

    :cond_7
    iget-object p1, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1}, Lr1/d;->j()Z

    move-result p1

    if-eqz p1, :cond_8

    iget p1, p0, Lr1/e;->v:F

    div-float p1, p2, p1

    iput p1, p0, Lr1/e;->v:F

    iput v1, p0, Lr1/e;->u:I

    :cond_8
    :goto_2
    iget p1, p0, Lr1/e;->u:I

    if-ne p1, v2, :cond_a

    iget p1, p0, Lr1/e;->o:I

    if-lez p1, :cond_9

    iget p3, p0, Lr1/e;->r:I

    if-nez p3, :cond_9

    iput v0, p0, Lr1/e;->u:I

    goto :goto_3

    :cond_9
    if-nez p1, :cond_a

    iget p1, p0, Lr1/e;->r:I

    if-lez p1, :cond_a

    iget p1, p0, Lr1/e;->v:F

    div-float/2addr p2, p1

    iput p2, p0, Lr1/e;->v:F

    iput v1, p0, Lr1/e;->u:I

    :cond_a
    :goto_3
    return-void
.end method

.method public I()I
    .locals 2

    invoke-virtual {p0}, Lr1/e;->Q()I

    move-result v0

    iget v1, p0, Lr1/e;->O:I

    add-int/2addr v0, v1

    return v0
.end method

.method public I0(ZZ)V
    .locals 7

    .prologue
    iget-object v0, p0, Lr1/e;->e:Ls1/j;

    invoke-virtual {v0}, Ls1/m;->k()Z

    move-result v0

    and-int/2addr p1, v0

    iget-object v0, p0, Lr1/e;->f:Ls1/l;

    invoke-virtual {v0}, Ls1/m;->k()Z

    move-result v0

    and-int/2addr p2, v0

    iget-object v0, p0, Lr1/e;->e:Ls1/j;

    iget-object v1, v0, Ls1/m;->h:Ls1/f;

    iget v1, v1, Ls1/f;->g:I

    iget-object v2, p0, Lr1/e;->f:Ls1/l;

    iget-object v3, v2, Ls1/m;->h:Ls1/f;

    iget v3, v3, Ls1/f;->g:I

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    iget-object v2, v2, Ls1/m;->i:Ls1/f;

    iget v2, v2, Ls1/f;->g:I

    sub-int v4, v0, v1

    sub-int v5, v2, v3

    const/4 v6, 0x0

    if-ltz v4, :cond_0

    if-ltz v5, :cond_0

    const/high16 v4, -0x80000000

    if-eq v1, v4, :cond_0

    const v5, 0x7fffffff

    if-eq v1, v5, :cond_0

    if-eq v3, v4, :cond_0

    if-eq v3, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v2, v4, :cond_0

    if-ne v2, v5, :cond_1

    :cond_0
    move v0, v6

    move v1, v0

    move v2, v1

    move v3, v2

    :cond_1
    sub-int/2addr v0, v1

    sub-int/2addr v2, v3

    if-eqz p1, :cond_2

    iput v1, p0, Lr1/e;->S:I

    :cond_2
    if-eqz p2, :cond_3

    iput v3, p0, Lr1/e;->T:I

    :cond_3
    iget v1, p0, Lr1/e;->f0:I

    const/16 v3, 0x8

    if-ne v1, v3, :cond_4

    iput v6, p0, Lr1/e;->O:I

    iput v6, p0, Lr1/e;->P:I

    return-void

    :cond_4
    if-eqz p1, :cond_6

    iget-object p1, p0, Lr1/e;->M:[Lr1/e$b;

    aget-object p1, p1, v6

    sget-object v1, Lr1/e$b;->C:Lr1/e$b;

    if-ne p1, v1, :cond_5

    iget p1, p0, Lr1/e;->O:I

    if-ge v0, p1, :cond_5

    move v0, p1

    :cond_5
    iput v0, p0, Lr1/e;->O:I

    iget p1, p0, Lr1/e;->Z:I

    if-ge v0, p1, :cond_6

    iput p1, p0, Lr1/e;->O:I

    :cond_6
    if-eqz p2, :cond_8

    iget-object p1, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 p2, 0x1

    aget-object p1, p1, p2

    sget-object p2, Lr1/e$b;->C:Lr1/e$b;

    if-ne p1, p2, :cond_7

    iget p1, p0, Lr1/e;->P:I

    if-ge v2, p1, :cond_7

    move v2, p1

    :cond_7
    iput v2, p0, Lr1/e;->P:I

    iget p1, p0, Lr1/e;->a0:I

    if-ge v2, p1, :cond_8

    iput p1, p0, Lr1/e;->P:I

    :cond_8
    return-void
.end method

.method public J(I)Ls1/m;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    iget-object p1, p0, Lr1/e;->e:Ls1/j;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lr1/e;->f:Ls1/l;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public J0(Lq1/d;)V
    .locals 6

    .prologue
    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->x(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1, v1}, Lq1/d;->x(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1, v2}, Lq1/d;->x(Ljava/lang/Object;)I

    move-result v2

    iget-object v3, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1, v3}, Lq1/d;->x(Ljava/lang/Object;)I

    move-result p1

    iget-object v3, p0, Lr1/e;->e:Ls1/j;

    iget-object v4, v3, Ls1/m;->h:Ls1/f;

    iget-boolean v5, v4, Ls1/f;->j:Z

    if-eqz v5, :cond_0

    iget-object v3, v3, Ls1/m;->i:Ls1/f;

    iget-boolean v5, v3, Ls1/f;->j:Z

    if-eqz v5, :cond_0

    iget v0, v4, Ls1/f;->g:I

    iget v2, v3, Ls1/f;->g:I

    :cond_0
    iget-object v3, p0, Lr1/e;->f:Ls1/l;

    iget-object v4, v3, Ls1/m;->h:Ls1/f;

    iget-boolean v5, v4, Ls1/f;->j:Z

    if-eqz v5, :cond_1

    iget-object v3, v3, Ls1/m;->i:Ls1/f;

    iget-boolean v5, v3, Ls1/f;->j:Z

    if-eqz v5, :cond_1

    iget v1, v4, Ls1/f;->g:I

    iget p1, v3, Ls1/f;->g:I

    :cond_1
    sub-int v3, v2, v0

    sub-int v4, p1, v1

    if-ltz v3, :cond_2

    if-ltz v4, :cond_2

    const/high16 v3, -0x80000000

    if-eq v0, v3, :cond_2

    const v4, 0x7fffffff

    if-eq v0, v4, :cond_2

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_2

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_2

    if-eq p1, v3, :cond_2

    if-ne p1, v4, :cond_3

    :cond_2
    const/4 v0, 0x0

    move p1, v0

    move v1, p1

    move v2, v1

    :cond_3
    invoke-virtual {p0, v0, v1, v2, p1}, Lr1/e;->f0(IIII)V

    return-void
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lr1/e;->c0:F

    return v0
.end method

.method public L()I
    .locals 1

    iget v0, p0, Lr1/e;->n0:I

    return v0
.end method

.method public M()Lr1/e$b;
    .locals 2

    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public N()I
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr1/e;->C:Lr1/d;

    iget v0, v0, Lr1/d;->e:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lr1/e;->D:Lr1/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lr1/e;->E:Lr1/d;

    iget v1, v1, Lr1/d;->e:I

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public O()I
    .locals 1

    iget v0, p0, Lr1/e;->f0:I

    return v0
.end method

.method public P()I
    .locals 2

    .prologue
    iget v0, p0, Lr1/e;->f0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lr1/e;->O:I

    return v0
.end method

.method public Q()I
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lr1/f;

    if-eqz v1, :cond_0

    check-cast v0, Lr1/f;

    iget v0, v0, Lr1/f;->C0:I

    iget v1, p0, Lr1/e;->S:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lr1/e;->S:I

    return v0
.end method

.method public R()I
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_0

    instance-of v1, v0, Lr1/f;

    if-eqz v1, :cond_0

    check-cast v0, Lr1/f;

    iget v0, v0, Lr1/f;->D0:I

    iget v1, p0, Lr1/e;->T:I

    add-int/2addr v0, v1

    return v0

    :cond_0
    iget v0, p0, Lr1/e;->T:I

    return v0
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lr1/e;->y:Z

    return v0
.end method

.method public T(Lr1/d$b;Lr1/e;Lr1/d$b;II)V
    .locals 0

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p4, p5, p3}, Lr1/d;->b(Lr1/d;IIZ)Z

    return-void
.end method

.method public V()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lr1/d;->d:Lr1/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr1/e;->D:Lr1/d;

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lr1/d;->d:Lr1/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public W()Z
    .locals 1

    iget-boolean v0, p0, Lr1/e;->z:Z

    return v0
.end method

.method public X()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->C:Lr1/d;

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lr1/d;->d:Lr1/d;

    if-eq v1, v0, :cond_1

    :cond_0
    iget-object v0, p0, Lr1/e;->E:Lr1/d;

    iget-object v1, v0, Lr1/d;->d:Lr1/d;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lr1/d;->d:Lr1/d;

    if-ne v1, v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public Y()V
    .locals 6

    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->F:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->G:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->H:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    iget-object v0, p0, Lr1/e;->I:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->l()V

    const/4 v0, 0x0

    iput-object v0, p0, Lr1/e;->N:Lr1/e;

    const/4 v1, 0x0

    iput v1, p0, Lr1/e;->x:F

    const/4 v2, 0x0

    iput v2, p0, Lr1/e;->O:I

    iput v2, p0, Lr1/e;->P:I

    iput v1, p0, Lr1/e;->Q:F

    const/4 v1, -0x1

    iput v1, p0, Lr1/e;->R:I

    iput v2, p0, Lr1/e;->S:I

    iput v2, p0, Lr1/e;->T:I

    iput v2, p0, Lr1/e;->W:I

    iput v2, p0, Lr1/e;->X:I

    iput v2, p0, Lr1/e;->Y:I

    iput v2, p0, Lr1/e;->Z:I

    iput v2, p0, Lr1/e;->a0:I

    sget v3, Lr1/e;->v0:F

    iput v3, p0, Lr1/e;->b0:F

    iput v3, p0, Lr1/e;->c0:F

    iget-object v3, p0, Lr1/e;->M:[Lr1/e$b;

    sget-object v4, Lr1/e$b;->C:Lr1/e$b;

    aput-object v4, v3, v2

    const/4 v5, 0x1

    aput-object v4, v3, v5

    iput-object v0, p0, Lr1/e;->d0:Ljava/lang/Object;

    iput v2, p0, Lr1/e;->e0:I

    iput v2, p0, Lr1/e;->f0:I

    iput-object v0, p0, Lr1/e;->h0:Ljava/lang/String;

    iput-boolean v2, p0, Lr1/e;->i0:Z

    iput-boolean v2, p0, Lr1/e;->j0:Z

    iput v2, p0, Lr1/e;->m0:I

    iput v2, p0, Lr1/e;->n0:I

    iput-boolean v2, p0, Lr1/e;->o0:Z

    iput-boolean v2, p0, Lr1/e;->p0:Z

    iget-object v0, p0, Lr1/e;->q0:[F

    const/high16 v3, -0x40800000    # -1.0f

    aput v3, v0, v2

    aput v3, v0, v5

    iput v1, p0, Lr1/e;->j:I

    iput v1, p0, Lr1/e;->k:I

    iget-object v0, p0, Lr1/e;->w:[I

    const v3, 0x7fffffff

    aput v3, v0, v2

    aput v3, v0, v5

    iput v2, p0, Lr1/e;->l:I

    iput v2, p0, Lr1/e;->m:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lr1/e;->q:F

    iput v0, p0, Lr1/e;->t:F

    iput v3, p0, Lr1/e;->p:I

    iput v3, p0, Lr1/e;->s:I

    iput v2, p0, Lr1/e;->o:I

    iput v2, p0, Lr1/e;->r:I

    iput-boolean v2, p0, Lr1/e;->i:Z

    iput v1, p0, Lr1/e;->u:I

    iput v0, p0, Lr1/e;->v:F

    iput-boolean v2, p0, Lr1/e;->k0:Z

    iput-boolean v2, p0, Lr1/e;->l0:Z

    iget-object v0, p0, Lr1/e;->g:[Z

    aput-boolean v5, v0, v2

    aput-boolean v5, v0, v5

    iput-boolean v2, p0, Lr1/e;->A:Z

    iget-object v0, p0, Lr1/e;->L:[Z

    aput-boolean v2, v0, v2

    aput-boolean v2, v0, v5

    return-void
.end method

.method public Z()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Lr1/e;->G()Lr1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    instance-of v0, v0, Lr1/f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr1/e;->G()Lr1/e;

    move-result-object v0

    check-cast v0, Lr1/f;

    invoke-virtual {v0}, Lr1/f;->W0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lr1/e;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lr1/e;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr1/d;

    invoke-virtual {v2}, Lr1/d;->l()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public a0(Lq1/c;)V
    .locals 1

    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->F:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->I:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->G:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    iget-object v0, p0, Lr1/e;->H:Lr1/d;

    invoke-virtual {v0, p1}, Lr1/d;->m(Lq1/c;)V

    return-void
.end method

.method public b0(I)V
    .locals 0

    .prologue
    iput p1, p0, Lr1/e;->Y:I

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lr1/e;->y:Z

    return-void
.end method

.method public c0(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr1/e;->d0:Ljava/lang/Object;

    return-void
.end method

.method public d0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lr1/e;->g0:Ljava/lang/String;

    return-void
.end method

.method e()Z
    .locals 1

    .prologue
    instance-of v0, p0, Lr1/l;

    if-nez v0, :cond_1

    instance-of v0, p0, Lr1/h;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public e0(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, -0x1

    if-lez v2, :cond_3

    add-int/lit8 v6, v1, -0x1

    if-ge v2, v6, :cond_3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v7, "W"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "H"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_0

    :cond_2
    move v3, v5

    :goto_0
    add-int/2addr v2, v4

    move v5, v3

    move v3, v2

    :cond_3
    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-ltz v2, :cond_5

    sub-int/2addr v1, v4

    if-ge v2, v1, :cond_5

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/2addr v2, v4

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_6

    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    cmpl-float v2, v1, v0

    if-lez v2, :cond_6

    cmpl-float v2, p1, v0

    if-lez v2, :cond_6

    if-ne v5, v4, :cond_4

    div-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    goto :goto_1

    :cond_4
    div-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    :try_start_1
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    :cond_6
    move p1, v0

    :goto_1
    cmpl-float v0, p1, v0

    if-lez v0, :cond_7

    iput p1, p0, Lr1/e;->Q:F

    iput v5, p0, Lr1/e;->R:I

    :cond_7
    return-void

    :cond_8
    :goto_2
    iput v0, p0, Lr1/e;->Q:F

    return-void
.end method

.method public f(Lq1/d;)V
    .locals 47

    .prologue
    move-object/from16 v13, p0

    move-object/from16 v9, p1

    iget-object v0, v13, Lr1/e;->B:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v7

    iget-object v0, v13, Lr1/e;->D:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v6

    iget-object v0, v13, Lr1/e;->C:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v4

    iget-object v0, v13, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v3

    iget-object v0, v13, Lr1/e;->F:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    sget-boolean v0, Lq1/d;->r:Z

    iget-object v0, v13, Lr1/e;->e:Ls1/j;

    iget-object v2, v0, Ls1/m;->h:Ls1/f;

    iget-boolean v5, v2, Ls1/f;->j:Z

    const/16 v15, 0x8

    const/4 v14, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_4

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget-boolean v0, v0, Ls1/f;->j:Z

    if-eqz v0, :cond_4

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v5, v0, Ls1/m;->h:Ls1/f;

    iget-boolean v5, v5, Ls1/f;->j:Z

    if-eqz v5, :cond_4

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget-boolean v0, v0, Ls1/f;->j:Z

    if-eqz v0, :cond_4

    iget v0, v2, Ls1/f;->g:I

    invoke-virtual {v9, v7, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->e:Ls1/j;

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    invoke-virtual {v9, v6, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v0, v0, Ls1/m;->h:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    invoke-virtual {v9, v4, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    invoke-virtual {v9, v3, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v0, v0, Ls1/l;->k:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    invoke-virtual {v9, v1, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_3

    if-eqz v0, :cond_0

    iget-object v1, v0, Lr1/e;->M:[Lr1/e$b;

    aget-object v1, v1, v12

    sget-object v2, Lr1/e$b;->D:Lr1/e$b;

    if-ne v1, v2, :cond_0

    move v1, v14

    goto :goto_0

    :cond_0
    move v1, v12

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lr1/e;->M:[Lr1/e$b;

    aget-object v0, v0, v14

    sget-object v2, Lr1/e$b;->D:Lr1/e$b;

    if-ne v0, v2, :cond_1

    move v0, v14

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    if-eqz v1, :cond_2

    iget-object v1, v13, Lr1/e;->g:[Z

    aget-boolean v1, v1, v12

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lr1/e;->V()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v13, Lr1/e;->N:Lr1/e;

    iget-object v1, v1, Lr1/e;->D:Lr1/d;

    invoke-virtual {v9, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    invoke-virtual {v9, v1, v6, v12, v15}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, v13, Lr1/e;->g:[Z

    aget-boolean v0, v0, v14

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lr1/e;->X()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v13, Lr1/e;->N:Lr1/e;

    iget-object v0, v0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v0

    invoke-virtual {v9, v0, v3, v12, v15}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, v13, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_b

    if-eqz v0, :cond_5

    iget-object v2, v0, Lr1/e;->M:[Lr1/e$b;

    aget-object v2, v2, v12

    sget-object v5, Lr1/e$b;->D:Lr1/e$b;

    if-ne v2, v5, :cond_5

    move v2, v14

    goto :goto_2

    :cond_5
    move v2, v12

    :goto_2
    if-eqz v0, :cond_6

    iget-object v0, v0, Lr1/e;->M:[Lr1/e$b;

    aget-object v0, v0, v14

    sget-object v5, Lr1/e$b;->D:Lr1/e$b;

    if-ne v0, v5, :cond_6

    move v0, v14

    goto :goto_3

    :cond_6
    move v0, v12

    :goto_3
    invoke-direct {v13, v12}, Lr1/e;->U(I)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v13, Lr1/e;->N:Lr1/e;

    check-cast v5, Lr1/f;

    invoke-virtual {v5, v13, v12}, Lr1/f;->N0(Lr1/e;I)V

    move v5, v14

    goto :goto_4

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lr1/e;->V()Z

    move-result v5

    :goto_4
    invoke-direct {v13, v14}, Lr1/e;->U(I)Z

    move-result v8

    if-eqz v8, :cond_8

    iget-object v8, v13, Lr1/e;->N:Lr1/e;

    check-cast v8, Lr1/f;

    invoke-virtual {v8, v13, v14}, Lr1/f;->N0(Lr1/e;I)V

    move v8, v14

    goto :goto_5

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lr1/e;->X()Z

    move-result v8

    :goto_5
    if-nez v5, :cond_9

    if-eqz v2, :cond_9

    iget v10, v13, Lr1/e;->f0:I

    if-eq v10, v15, :cond_9

    iget-object v10, v13, Lr1/e;->B:Lr1/d;

    iget-object v10, v10, Lr1/d;->d:Lr1/d;

    if-nez v10, :cond_9

    iget-object v10, v13, Lr1/e;->D:Lr1/d;

    iget-object v10, v10, Lr1/d;->d:Lr1/d;

    if-nez v10, :cond_9

    iget-object v10, v13, Lr1/e;->N:Lr1/e;

    iget-object v10, v10, Lr1/e;->D:Lr1/d;

    invoke-virtual {v9, v10}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v10

    invoke-virtual {v9, v10, v6, v12, v14}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_9
    if-nez v8, :cond_a

    if-eqz v0, :cond_a

    iget v10, v13, Lr1/e;->f0:I

    if-eq v10, v15, :cond_a

    iget-object v10, v13, Lr1/e;->C:Lr1/d;

    iget-object v10, v10, Lr1/d;->d:Lr1/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr1/e;->E:Lr1/d;

    iget-object v10, v10, Lr1/d;->d:Lr1/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr1/e;->F:Lr1/d;

    if-nez v10, :cond_a

    iget-object v10, v13, Lr1/e;->N:Lr1/e;

    iget-object v10, v10, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v10}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v10

    invoke-virtual {v9, v10, v3, v12, v14}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_a
    move/from16 v28, v5

    move/from16 v27, v8

    goto :goto_6

    :cond_b
    move v0, v12

    move v2, v0

    move/from16 v27, v2

    move/from16 v28, v27

    :goto_6
    iget v5, v13, Lr1/e;->O:I

    iget v8, v13, Lr1/e;->Z:I

    if-ge v5, v8, :cond_c

    goto :goto_7

    :cond_c
    move v8, v5

    :goto_7
    iget v10, v13, Lr1/e;->P:I

    iget v11, v13, Lr1/e;->a0:I

    if-ge v10, v11, :cond_d

    goto :goto_8

    :cond_d
    move v11, v10

    :goto_8
    iget-object v15, v13, Lr1/e;->M:[Lr1/e$b;

    aget-object v14, v15, v12

    sget-object v12, Lr1/e$b;->E:Lr1/e$b;

    move-object/from16 v19, v1

    if-eq v14, v12, :cond_e

    const/4 v1, 0x1

    :goto_9
    const/16 v17, 0x1

    goto :goto_a

    :cond_e
    const/4 v1, 0x0

    goto :goto_9

    :goto_a
    aget-object v15, v15, v17

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    if-eq v15, v12, :cond_f

    const/4 v3, 0x1

    goto :goto_b

    :cond_f
    const/4 v3, 0x0

    :goto_b
    iget v4, v13, Lr1/e;->R:I

    iput v4, v13, Lr1/e;->u:I

    move/from16 v22, v8

    iget v8, v13, Lr1/e;->Q:F

    iput v8, v13, Lr1/e;->v:F

    move/from16 v23, v11

    iget v11, v13, Lr1/e;->l:I

    move-object/from16 v26, v6

    iget v6, v13, Lr1/e;->m:I

    const/16 v24, 0x0

    cmpl-float v24, v8, v24

    move-object/from16 v29, v7

    if-lez v24, :cond_18

    iget v7, v13, Lr1/e;->f0:I

    const/16 v9, 0x8

    if-eq v7, v9, :cond_18

    const/4 v7, 0x3

    if-ne v14, v12, :cond_10

    if-nez v11, :cond_10

    move v11, v7

    :cond_10
    if-ne v15, v12, :cond_11

    if-nez v6, :cond_11

    move v6, v7

    :cond_11
    if-ne v14, v12, :cond_12

    if-ne v15, v12, :cond_12

    if-ne v11, v7, :cond_12

    if-ne v6, v7, :cond_12

    invoke-virtual {v13, v2, v0, v1, v3}, Lr1/e;->H0(ZZZZ)V

    goto :goto_10

    :cond_12
    const/4 v1, 0x4

    if-ne v14, v12, :cond_14

    if-ne v11, v7, :cond_14

    const/4 v3, 0x0

    iput v3, v13, Lr1/e;->u:I

    int-to-float v3, v10

    mul-float/2addr v8, v3

    float-to-int v8, v8

    if-eq v15, v12, :cond_13

    move/from16 v33, v1

    move/from16 v32, v6

    :goto_c
    move/from16 v31, v23

    :goto_d
    const/4 v9, 0x0

    goto :goto_11

    :cond_13
    move/from16 v32, v6

    move/from16 v33, v11

    :goto_e
    move/from16 v31, v23

    :goto_f
    const/4 v9, 0x1

    goto :goto_11

    :cond_14
    if-ne v15, v12, :cond_17

    if-ne v6, v7, :cond_17

    const/4 v3, 0x1

    iput v3, v13, Lr1/e;->u:I

    const/4 v3, -0x1

    if-ne v4, v3, :cond_15

    const/high16 v3, 0x3f800000    # 1.0f

    div-float/2addr v3, v8

    iput v3, v13, Lr1/e;->v:F

    :cond_15
    iget v3, v13, Lr1/e;->v:F

    int-to-float v4, v5

    mul-float/2addr v3, v4

    float-to-int v3, v3

    if-eq v14, v12, :cond_16

    move/from16 v32, v1

    move/from16 v31, v3

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_d

    :cond_16
    move/from16 v31, v3

    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_f

    :cond_17
    :goto_10
    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_e

    :cond_18
    move/from16 v32, v6

    move/from16 v33, v11

    move/from16 v8, v22

    goto :goto_c

    :goto_11
    iget-object v1, v13, Lr1/e;->n:[I

    const/4 v3, 0x0

    aput v33, v1, v3

    const/4 v3, 0x1

    aput v32, v1, v3

    iput-boolean v9, v13, Lr1/e;->i:Z

    if-eqz v9, :cond_1a

    iget v1, v13, Lr1/e;->u:I

    const/4 v7, -0x1

    if-eqz v1, :cond_19

    if-ne v1, v7, :cond_1b

    :cond_19
    const/16 v22, 0x1

    goto :goto_12

    :cond_1a
    const/4 v7, -0x1

    :cond_1b
    const/16 v22, 0x0

    :goto_12
    iget-object v1, v13, Lr1/e;->M:[Lr1/e$b;

    const/4 v3, 0x0

    aget-object v1, v1, v3

    sget-object v6, Lr1/e$b;->D:Lr1/e$b;

    if-ne v1, v6, :cond_1c

    instance-of v1, v13, Lr1/f;

    if-eqz v1, :cond_1c

    const/16 v30, 0x1

    goto :goto_13

    :cond_1c
    const/16 v30, 0x0

    :goto_13
    if-eqz v30, :cond_1d

    const/16 v34, 0x0

    goto :goto_14

    :cond_1d
    move/from16 v34, v8

    :goto_14
    iget-object v1, v13, Lr1/e;->I:Lr1/d;

    invoke-virtual {v1}, Lr1/d;->j()Z

    move-result v1

    const/4 v3, 0x1

    xor-int/lit8 v35, v1, 0x1

    iget-object v1, v13, Lr1/e;->L:[Z

    const/4 v4, 0x0

    aget-boolean v36, v1, v4

    aget-boolean v37, v1, v3

    iget v1, v13, Lr1/e;->j:I

    const/4 v4, 0x2

    const/16 v38, 0x0

    if-eq v1, v4, :cond_23

    iget-object v1, v13, Lr1/e;->e:Ls1/j;

    iget-object v5, v1, Ls1/m;->h:Ls1/f;

    iget-boolean v8, v5, Ls1/f;->j:Z

    if-eqz v8, :cond_1e

    iget-object v1, v1, Ls1/m;->i:Ls1/f;

    iget-boolean v1, v1, Ls1/f;->j:Z

    if-nez v1, :cond_1f

    :cond_1e
    move-object/from16 v15, p1

    move-object/from16 v12, v26

    move-object/from16 v14, v29

    const/16 v11, 0x8

    goto :goto_15

    :cond_1f
    iget v1, v5, Ls1/f;->g:I

    move-object/from16 v15, p1

    move-object/from16 v14, v29

    invoke-virtual {v15, v14, v1}, Lq1/d;->f(Lq1/i;I)V

    iget-object v1, v13, Lr1/e;->e:Ls1/j;

    iget-object v1, v1, Ls1/m;->i:Ls1/f;

    iget v1, v1, Ls1/f;->g:I

    move-object/from16 v12, v26

    invoke-virtual {v15, v12, v1}, Lq1/d;->f(Lq1/i;I)V

    iget-object v1, v13, Lr1/e;->N:Lr1/e;

    if-eqz v1, :cond_20

    if-eqz v2, :cond_20

    iget-object v1, v13, Lr1/e;->g:[Z

    const/4 v5, 0x0

    aget-boolean v1, v1, v5

    if-eqz v1, :cond_20

    invoke-virtual/range {p0 .. p0}, Lr1/e;->V()Z

    move-result v1

    if-nez v1, :cond_20

    iget-object v1, v13, Lr1/e;->N:Lr1/e;

    iget-object v1, v1, Lr1/e;->D:Lr1/d;

    invoke-virtual {v15, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    const/16 v11, 0x8

    invoke-virtual {v15, v1, v12, v5, v11}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_20
    move/from16 v41, v0

    move/from16 v29, v2

    move-object/from16 v45, v6

    move/from16 v46, v9

    move-object/from16 v39, v12

    move-object/from16 v40, v14

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    goto/16 :goto_19

    :goto_15
    iget-object v1, v13, Lr1/e;->N:Lr1/e;

    if-eqz v1, :cond_21

    iget-object v1, v1, Lr1/e;->D:Lr1/d;

    invoke-virtual {v15, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_16

    :cond_21
    move-object/from16 v17, v38

    :goto_16
    iget-object v1, v13, Lr1/e;->N:Lr1/e;

    if-eqz v1, :cond_22

    iget-object v1, v1, Lr1/e;->B:Lr1/d;

    invoke-virtual {v15, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    move-object/from16 v26, v1

    goto :goto_17

    :cond_22
    move-object/from16 v26, v38

    :goto_17
    iget-object v1, v13, Lr1/e;->g:[Z

    const/16 v16, 0x0

    aget-boolean v5, v1, v16

    iget-object v1, v13, Lr1/e;->M:[Lr1/e$b;

    aget-object v8, v1, v16

    iget-object v10, v13, Lr1/e;->B:Lr1/d;

    iget-object v1, v13, Lr1/e;->D:Lr1/d;

    move/from16 v18, v11

    move-object v11, v1

    iget v1, v13, Lr1/e;->S:I

    move/from16 v29, v2

    move-object/from16 v39, v12

    move/from16 v2, v16

    move v12, v1

    iget v1, v13, Lr1/e;->Z:I

    move-object/from16 v40, v14

    move v14, v1

    iget-object v1, v13, Lr1/e;->w:[I

    aget v1, v1, v2

    move v15, v1

    iget v1, v13, Lr1/e;->b0:F

    move/from16 v16, v1

    iget v1, v13, Lr1/e;->o:I

    move/from16 v23, v1

    iget v1, v13, Lr1/e;->p:I

    move/from16 v24, v1

    iget v1, v13, Lr1/e;->q:F

    move/from16 v25, v1

    const/4 v1, 0x1

    move v2, v1

    move/from16 v41, v0

    move-object/from16 v0, p0

    move-object/from16 v42, v19

    move-object/from16 v1, p1

    move-object/from16 v43, v20

    move/from16 v3, v29

    move-object/from16 v44, v21

    move/from16 v4, v41

    move-object/from16 v45, v6

    move-object/from16 v6, v26

    move-object/from16 v7, v17

    move/from16 v46, v9

    move/from16 v9, v30

    move/from16 v13, v34

    move/from16 v17, v22

    move/from16 v18, v28

    move/from16 v19, v27

    move/from16 v20, v36

    move/from16 v21, v33

    move/from16 v22, v32

    move/from16 v26, v35

    invoke-direct/range {v0 .. v26}, Lr1/e;->h(Lq1/d;ZZZZLq1/i;Lq1/i;Lr1/e$b;ZLr1/d;Lr1/d;IIIIFZZZZIIIIFZ)V

    :goto_18
    move-object/from16 v13, p0

    goto :goto_19

    :cond_23
    move/from16 v41, v0

    move-object/from16 v45, v6

    move/from16 v46, v9

    move-object/from16 v42, v19

    move-object/from16 v43, v20

    move-object/from16 v44, v21

    move-object/from16 v39, v26

    move-object/from16 v40, v29

    move/from16 v29, v2

    goto :goto_18

    :goto_19
    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v1, v0, Ls1/m;->h:Ls1/f;

    iget-boolean v2, v1, Ls1/f;->j:Z

    if-eqz v2, :cond_26

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget-boolean v0, v0, Ls1/f;->j:Z

    if-eqz v0, :cond_26

    iget v0, v1, Ls1/f;->g:I

    move-object/from16 v9, p1

    move-object/from16 v7, v44

    invoke-virtual {v9, v7, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v0, v0, Ls1/m;->i:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    move-object/from16 v6, v43

    invoke-virtual {v9, v6, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->f:Ls1/l;

    iget-object v0, v0, Ls1/l;->k:Ls1/f;

    iget v0, v0, Ls1/f;->g:I

    move-object/from16 v1, v42

    invoke-virtual {v9, v1, v0}, Lq1/d;->f(Lq1/i;I)V

    iget-object v0, v13, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_25

    if-nez v27, :cond_25

    if-eqz v41, :cond_25

    iget-object v2, v13, Lr1/e;->g:[Z

    const/4 v4, 0x1

    aget-boolean v2, v2, v4

    if-eqz v2, :cond_24

    iget-object v0, v0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v9, v0, v6, v3, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    goto :goto_1a

    :cond_24
    const/16 v2, 0x8

    const/4 v3, 0x0

    goto :goto_1a

    :cond_25
    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    :goto_1a
    move v14, v3

    goto :goto_1b

    :cond_26
    move-object/from16 v9, p1

    move-object/from16 v1, v42

    move-object/from16 v6, v43

    move-object/from16 v7, v44

    const/16 v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v14, v4

    :goto_1b
    iget v0, v13, Lr1/e;->k:I

    const/4 v5, 0x2

    if-ne v0, v5, :cond_27

    move v12, v3

    goto :goto_1c

    :cond_27
    move v12, v14

    :goto_1c
    if-eqz v12, :cond_32

    iget-object v0, v13, Lr1/e;->M:[Lr1/e$b;

    aget-object v0, v0, v4

    move-object/from16 v5, v45

    if-ne v0, v5, :cond_28

    instance-of v0, v13, Lr1/f;

    if-eqz v0, :cond_28

    move/from16 v17, v4

    goto :goto_1d

    :cond_28
    move/from16 v17, v3

    :goto_1d
    if-eqz v17, :cond_29

    move/from16 v31, v3

    :cond_29
    if-eqz v46, :cond_2b

    iget v0, v13, Lr1/e;->u:I

    if-eq v0, v4, :cond_2a

    const/4 v5, -0x1

    if-ne v0, v5, :cond_2b

    :cond_2a
    move/from16 v18, v4

    goto :goto_1e

    :cond_2b
    move/from16 v18, v3

    :goto_1e
    iget-object v0, v13, Lr1/e;->N:Lr1/e;

    if-eqz v0, :cond_2c

    iget-object v0, v0, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v0

    goto :goto_1f

    :cond_2c
    move-object/from16 v0, v38

    :goto_1f
    iget-object v5, v13, Lr1/e;->N:Lr1/e;

    if-eqz v5, :cond_2d

    iget-object v5, v5, Lr1/e;->C:Lr1/d;

    invoke-virtual {v9, v5}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v5

    move-object/from16 v38, v5

    :cond_2d
    iget v5, v13, Lr1/e;->Y:I

    if-gtz v5, :cond_2e

    iget v5, v13, Lr1/e;->f0:I

    if-ne v5, v2, :cond_31

    :cond_2e
    invoke-virtual/range {p0 .. p0}, Lr1/e;->n()I

    move-result v5

    invoke-virtual {v9, v1, v7, v5, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    iget-object v5, v13, Lr1/e;->F:Lr1/d;

    iget-object v5, v5, Lr1/d;->d:Lr1/d;

    if-eqz v5, :cond_30

    invoke-virtual {v9, v5}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v5

    invoke-virtual {v9, v1, v5, v3, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    if-eqz v41, :cond_2f

    iget-object v1, v13, Lr1/e;->E:Lr1/d;

    invoke-virtual {v9, v1}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v9, v0, v1, v3, v2}, Lq1/d;->h(Lq1/i;Lq1/i;II)V

    :cond_2f
    move/from16 v26, v3

    goto :goto_20

    :cond_30
    iget v5, v13, Lr1/e;->f0:I

    if-ne v5, v2, :cond_31

    invoke-virtual {v9, v1, v7, v3, v2}, Lq1/d;->e(Lq1/i;Lq1/i;II)Lq1/b;

    :cond_31
    move/from16 v26, v35

    :goto_20
    iget-object v1, v13, Lr1/e;->g:[Z

    aget-boolean v5, v1, v4

    iget-object v1, v13, Lr1/e;->M:[Lr1/e$b;

    aget-object v8, v1, v4

    iget-object v10, v13, Lr1/e;->C:Lr1/d;

    iget-object v11, v13, Lr1/e;->E:Lr1/d;

    iget v12, v13, Lr1/e;->T:I

    iget v14, v13, Lr1/e;->a0:I

    iget-object v1, v13, Lr1/e;->w:[I

    aget v15, v1, v4

    iget v1, v13, Lr1/e;->c0:F

    move/from16 v16, v1

    iget v1, v13, Lr1/e;->r:I

    move/from16 v23, v1

    iget v1, v13, Lr1/e;->s:I

    move/from16 v24, v1

    iget v1, v13, Lr1/e;->t:F

    move/from16 v25, v1

    const/4 v2, 0x0

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, v41

    move/from16 v4, v29

    move-object/from16 v29, v6

    move-object/from16 v6, v38

    move-object/from16 v30, v7

    move-object/from16 v7, v19

    move/from16 v9, v17

    move/from16 v13, v31

    move/from16 v17, v18

    move/from16 v18, v27

    move/from16 v19, v28

    move/from16 v20, v37

    move/from16 v21, v32

    move/from16 v22, v33

    invoke-direct/range {v0 .. v26}, Lr1/e;->h(Lq1/d;ZZZZLq1/i;Lq1/i;Lr1/e$b;ZLr1/d;Lr1/d;IIIIFZZZZIIIIFZ)V

    goto :goto_21

    :cond_32
    move-object/from16 v29, v6

    move-object/from16 v30, v7

    :goto_21
    move-object/from16 v7, p0

    if-eqz v46, :cond_34

    iget v0, v7, Lr1/e;->u:I

    const/16 v6, 0x8

    const/4 v1, 0x1

    iget v5, v7, Lr1/e;->v:F

    if-ne v0, v1, :cond_33

    move-object/from16 v0, p1

    move-object/from16 v1, v29

    move-object/from16 v2, v30

    move-object/from16 v3, v39

    move-object/from16 v4, v40

    :goto_22
    invoke-virtual/range {v0 .. v6}, Lq1/d;->k(Lq1/i;Lq1/i;Lq1/i;Lq1/i;FI)V

    goto :goto_23

    :cond_33
    move-object/from16 v0, p1

    move-object/from16 v1, v39

    move-object/from16 v2, v40

    move-object/from16 v3, v29

    move-object/from16 v4, v30

    goto :goto_22

    :cond_34
    :goto_23
    iget-object v0, v7, Lr1/e;->I:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->j()Z

    move-result v0

    if-eqz v0, :cond_35

    iget-object v0, v7, Lr1/e;->I:Lr1/d;

    invoke-virtual {v0}, Lr1/d;->g()Lr1/d;

    move-result-object v0

    invoke-virtual {v0}, Lr1/d;->e()Lr1/e;

    move-result-object v0

    iget v1, v7, Lr1/e;->x:F

    const/high16 v2, 0x42b40000    # 90.0f

    add-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    double-to-float v1, v1

    iget-object v2, v7, Lr1/e;->I:Lr1/d;

    invoke-virtual {v2}, Lr1/d;->c()I

    move-result v2

    move-object/from16 v3, p1

    invoke-virtual {v3, v7, v0, v1, v2}, Lq1/d;->b(Lr1/e;Lr1/e;FI)V

    :cond_35
    return-void
.end method

.method public f0(IIII)V
    .locals 1

    .prologue
    sub-int/2addr p3, p1

    sub-int/2addr p4, p2

    iput p1, p0, Lr1/e;->S:I

    iput p2, p0, Lr1/e;->T:I

    iget p1, p0, Lr1/e;->f0:I

    const/16 p2, 0x8

    const/4 v0, 0x0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lr1/e;->O:I

    iput v0, p0, Lr1/e;->P:I

    return-void

    :cond_0
    iget-object p1, p0, Lr1/e;->M:[Lr1/e$b;

    aget-object p2, p1, v0

    sget-object v0, Lr1/e$b;->C:Lr1/e$b;

    if-ne p2, v0, :cond_1

    iget p2, p0, Lr1/e;->O:I

    if-ge p3, p2, :cond_1

    move p3, p2

    :cond_1
    const/4 p2, 0x1

    aget-object p1, p1, p2

    if-ne p1, v0, :cond_2

    iget p1, p0, Lr1/e;->P:I

    if-ge p4, p1, :cond_2

    move p4, p1

    :cond_2
    iput p3, p0, Lr1/e;->O:I

    iput p4, p0, Lr1/e;->P:I

    iget p1, p0, Lr1/e;->a0:I

    if-ge p4, p1, :cond_3

    iput p1, p0, Lr1/e;->P:I

    :cond_3
    iget p1, p0, Lr1/e;->Z:I

    if-ge p3, p1, :cond_4

    iput p1, p0, Lr1/e;->O:I

    :cond_4
    return-void
.end method

.method public g()Z
    .locals 2

    .prologue
    iget v0, p0, Lr1/e;->f0:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g0(Z)V
    .locals 0

    iput-boolean p1, p0, Lr1/e;->y:Z

    return-void
.end method

.method public h0(I)V
    .locals 1

    .prologue
    iput p1, p0, Lr1/e;->P:I

    iget v0, p0, Lr1/e;->a0:I

    if-ge p1, v0, :cond_0

    iput v0, p0, Lr1/e;->P:I

    :cond_0
    return-void
.end method

.method public i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V
    .locals 8

    .prologue
    sget-object v0, Lr1/d$b;->I:Lr1/d$b;

    const/4 v1, 0x0

    if-ne p1, v0, :cond_c

    sget-object p1, Lr1/d$b;->D:Lr1/d$b;

    if-ne p3, v0, :cond_8

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    sget-object p4, Lr1/d$b;->F:Lr1/d$b;

    invoke-virtual {p0, p4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v2

    sget-object v3, Lr1/d$b;->E:Lr1/d$b;

    invoke-virtual {p0, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v4

    sget-object v5, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {p0, v5}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lr1/d;->j()Z

    move-result p3

    if-nez p3, :cond_1

    :cond_0
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lr1/d;->j()Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, p2, p1, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    invoke-virtual {p0, p4, p2, p4, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    move p1, v7

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lr1/d;->j()Z

    move-result p3

    if-nez p3, :cond_4

    :cond_3
    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lr1/d;->j()Z

    move-result p3

    if-eqz p3, :cond_5

    :cond_4
    move v7, v1

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v3, p2, v3, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    invoke-virtual {p0, v5, p2, v5, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    :goto_1
    if-eqz p1, :cond_6

    if-eqz v7, :cond_6

    invoke-virtual {p0, v0}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p2, v0}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    goto :goto_5

    :cond_6
    if-eqz p1, :cond_7

    sget-object p1, Lr1/d$b;->J:Lr1/d$b;

    :goto_2
    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p2, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p3, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    goto/16 :goto_a

    :cond_7
    if-eqz v7, :cond_1d

    sget-object p1, Lr1/d$b;->K:Lr1/d$b;

    goto :goto_2

    :cond_8
    if-eq p3, p1, :cond_b

    sget-object p4, Lr1/d$b;->F:Lr1/d$b;

    if-ne p3, p4, :cond_9

    goto :goto_6

    :cond_9
    sget-object p1, Lr1/d$b;->E:Lr1/d$b;

    if-eq p3, p1, :cond_a

    sget-object p4, Lr1/d$b;->G:Lr1/d$b;

    if-ne p3, p4, :cond_1d

    :cond_a
    invoke-virtual {p0, p1, p2, p3, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    sget-object p1, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {p0, p1, p2, p3, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    :goto_3
    invoke-virtual {p0, v0}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    :goto_4
    invoke-virtual {p2, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    :goto_5
    invoke-virtual {p1, p2, v1}, Lr1/d;->a(Lr1/d;I)Z

    goto/16 :goto_a

    :cond_b
    :goto_6
    invoke-virtual {p0, p1, p2, p3, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    sget-object p1, Lr1/d$b;->F:Lr1/d$b;

    :try_start_0
    invoke-virtual {p0, p1, p2, p3, v1}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    throw p1

    :cond_c
    sget-object v2, Lr1/d$b;->J:Lr1/d$b;

    if-ne p1, v2, :cond_e

    sget-object v3, Lr1/d$b;->D:Lr1/d$b;

    if-eq p3, v3, :cond_d

    sget-object v4, Lr1/d$b;->F:Lr1/d$b;

    if-ne p3, v4, :cond_e

    :cond_d
    invoke-virtual {p0, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p2, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    sget-object p3, Lr1/d$b;->F:Lr1/d$b;

    invoke-virtual {p0, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p1, p2, v1}, Lr1/d;->a(Lr1/d;I)Z

    invoke-virtual {p3, p2, v1}, Lr1/d;->a(Lr1/d;I)Z

    invoke-virtual {p0, v2}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    goto :goto_5

    :cond_e
    sget-object v3, Lr1/d$b;->K:Lr1/d$b;

    if-ne p1, v3, :cond_10

    sget-object v4, Lr1/d$b;->E:Lr1/d$b;

    if-eq p3, v4, :cond_f

    sget-object v5, Lr1/d$b;->G:Lr1/d$b;

    if-ne p3, v5, :cond_10

    :cond_f
    invoke-virtual {p2, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p0, v4}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    sget-object p2, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {p0, p2}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    invoke-virtual {p0, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    goto/16 :goto_a

    :cond_10
    if-ne p1, v2, :cond_11

    if-ne p3, v2, :cond_11

    sget-object p1, Lr1/d$b;->D:Lr1/d$b;

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    sget-object p1, Lr1/d$b;->F:Lr1/d$b;

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    invoke-virtual {p0, v2}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    goto/16 :goto_4

    :cond_11
    if-ne p1, v3, :cond_12

    if-ne p3, v3, :cond_12

    sget-object p1, Lr1/d$b;->E:Lr1/d$b;

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    sget-object p1, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p4

    invoke-virtual {p2, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p4, p1, v1}, Lr1/d;->a(Lr1/d;I)Z

    invoke-virtual {p0, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    goto/16 :goto_4

    :cond_12
    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object v4

    invoke-virtual {p2, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p2

    invoke-virtual {v4, p2}, Lr1/d;->k(Lr1/d;)Z

    move-result p3

    if-eqz p3, :cond_1d

    sget-object p3, Lr1/d$b;->H:Lr1/d$b;

    if-ne p1, p3, :cond_15

    sget-object p1, Lr1/d$b;->E:Lr1/d$b;

    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    sget-object p3, Lr1/d$b;->G:Lr1/d$b;

    invoke-virtual {p0, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lr1/d;->l()V

    :cond_13
    if-eqz p3, :cond_14

    invoke-virtual {p3}, Lr1/d;->l()V

    :cond_14
    move p4, v1

    goto :goto_9

    :cond_15
    sget-object v1, Lr1/d$b;->E:Lr1/d$b;

    if-eq p1, v1, :cond_19

    sget-object v1, Lr1/d$b;->G:Lr1/d$b;

    if-ne p1, v1, :cond_16

    goto :goto_7

    :cond_16
    sget-object p3, Lr1/d$b;->D:Lr1/d$b;

    if-eq p1, p3, :cond_17

    sget-object p3, Lr1/d$b;->F:Lr1/d$b;

    if-ne p1, p3, :cond_1c

    :cond_17
    invoke-virtual {p0, v0}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p3}, Lr1/d;->g()Lr1/d;

    move-result-object v0

    if-eq v0, p2, :cond_18

    invoke-virtual {p3}, Lr1/d;->l()V

    :cond_18
    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p1}, Lr1/d;->d()Lr1/d;

    move-result-object p1

    invoke-virtual {p0, v2}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p3}, Lr1/d;->j()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_8

    :cond_19
    :goto_7
    invoke-virtual {p0, p3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    if-eqz p3, :cond_1a

    invoke-virtual {p3}, Lr1/d;->l()V

    :cond_1a
    invoke-virtual {p0, v0}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p3}, Lr1/d;->g()Lr1/d;

    move-result-object v0

    if-eq v0, p2, :cond_1b

    invoke-virtual {p3}, Lr1/d;->l()V

    :cond_1b
    invoke-virtual {p0, p1}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p1

    invoke-virtual {p1}, Lr1/d;->d()Lr1/d;

    move-result-object p1

    invoke-virtual {p0, v3}, Lr1/e;->m(Lr1/d$b;)Lr1/d;

    move-result-object p3

    invoke-virtual {p3}, Lr1/d;->j()Z

    move-result v0

    if-eqz v0, :cond_1c

    :goto_8
    invoke-virtual {p1}, Lr1/d;->l()V

    invoke-virtual {p3}, Lr1/d;->l()V

    :cond_1c
    :goto_9
    invoke-virtual {v4, p2, p4}, Lr1/d;->a(Lr1/d;I)Z

    :cond_1d
    :goto_a
    return-void
.end method

.method public i0(F)V
    .locals 0

    iput p1, p0, Lr1/e;->b0:F

    return-void
.end method

.method public j(Lr1/d;Lr1/d;I)V
    .locals 1

    .prologue
    invoke-virtual {p1}, Lr1/d;->e()Lr1/e;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-virtual {p1}, Lr1/d;->h()Lr1/d$b;

    move-result-object p1

    invoke-virtual {p2}, Lr1/d;->e()Lr1/e;

    move-result-object v0

    invoke-virtual {p2}, Lr1/d;->h()Lr1/d$b;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2, p3}, Lr1/e;->i(Lr1/d$b;Lr1/e;Lr1/d$b;I)V

    :cond_0
    return-void
.end method

.method public j0(I)V
    .locals 0

    iput p1, p0, Lr1/e;->m0:I

    return-void
.end method

.method public k(Lr1/e;FI)V
    .locals 6

    sget-object v3, Lr1/d$b;->I:Lr1/d$b;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, v3

    move-object v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lr1/e;->T(Lr1/d$b;Lr1/e;Lr1/d$b;II)V

    iput p2, p0, Lr1/e;->x:F

    return-void
.end method

.method public k0(II)V
    .locals 0

    .prologue
    iput p1, p0, Lr1/e;->S:I

    sub-int/2addr p2, p1

    iput p2, p0, Lr1/e;->O:I

    iget p1, p0, Lr1/e;->Z:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lr1/e;->O:I

    :cond_0
    return-void
.end method

.method public l(Lq1/d;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    iget-object v0, p0, Lr1/e;->C:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    iget-object v0, p0, Lr1/e;->D:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    iget-object v0, p0, Lr1/e;->E:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    iget v0, p0, Lr1/e;->Y:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lr1/e;->F:Lr1/d;

    invoke-virtual {p1, v0}, Lq1/d;->q(Ljava/lang/Object;)Lq1/i;

    :cond_0
    return-void
.end method

.method public l0(Lr1/e$b;)V
    .locals 2

    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public m(Lr1/d$b;)Lr1/d;
    .locals 2

    .prologue
    sget-object v0, Lr1/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lr1/e;->H:Lr1/d;

    return-object p1

    :pswitch_2
    iget-object p1, p0, Lr1/e;->G:Lr1/d;

    return-object p1

    :pswitch_3
    iget-object p1, p0, Lr1/e;->I:Lr1/d;

    return-object p1

    :pswitch_4
    iget-object p1, p0, Lr1/e;->F:Lr1/d;

    return-object p1

    :pswitch_5
    iget-object p1, p0, Lr1/e;->E:Lr1/d;

    return-object p1

    :pswitch_6
    iget-object p1, p0, Lr1/e;->D:Lr1/d;

    return-object p1

    :pswitch_7
    iget-object p1, p0, Lr1/e;->C:Lr1/d;

    return-object p1

    :pswitch_8
    iget-object p1, p0, Lr1/e;->B:Lr1/d;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m0(IIIF)V
    .locals 0

    .prologue
    iput p1, p0, Lr1/e;->l:I

    iput p2, p0, Lr1/e;->o:I

    const p2, 0x7fffffff

    if-ne p3, p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput p3, p0, Lr1/e;->p:I

    iput p4, p0, Lr1/e;->q:F

    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-lez p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpg-float p2, p4, p2

    if-gez p2, :cond_1

    if-nez p1, :cond_1

    const/4 p1, 0x2

    iput p1, p0, Lr1/e;->l:I

    :cond_1
    return-void
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lr1/e;->Y:I

    return v0
.end method

.method public n0(F)V
    .locals 2

    iget-object v0, p0, Lr1/e;->q0:[F

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public o(I)F
    .locals 1

    .prologue
    if-nez p1, :cond_0

    iget p1, p0, Lr1/e;->b0:F

    return p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget p1, p0, Lr1/e;->c0:F

    return p1

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    return p1
.end method

.method protected o0(IZ)V
    .locals 1

    iget-object v0, p0, Lr1/e;->L:[Z

    aput-boolean p2, v0, p1

    return-void
.end method

.method public p()I
    .locals 2

    invoke-virtual {p0}, Lr1/e;->R()I

    move-result v0

    iget v1, p0, Lr1/e;->P:I

    add-int/2addr v0, v1

    return v0
.end method

.method public p0(Z)V
    .locals 0

    iput-boolean p1, p0, Lr1/e;->z:Z

    return-void
.end method

.method public q()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr1/e;->d0:Ljava/lang/Object;

    return-object v0
.end method

.method public q0(Z)V
    .locals 0

    iput-boolean p1, p0, Lr1/e;->A:Z

    return-void
.end method

.method public r()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lr1/e;->g0:Ljava/lang/String;

    return-object v0
.end method

.method public r0(I)V
    .locals 2

    iget-object v0, p0, Lr1/e;->w:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    return-void
.end method

.method public s(I)Lr1/e$b;
    .locals 1

    .prologue
    if-nez p1, :cond_0

    invoke-virtual {p0}, Lr1/e;->y()Lr1/e$b;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lr1/e;->M()Lr1/e$b;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public s0(I)V
    .locals 2

    iget-object v0, p0, Lr1/e;->w:[I

    const/4 v1, 0x0

    aput p1, v0, v1

    return-void
.end method

.method public t()F
    .locals 1

    iget v0, p0, Lr1/e;->Q:F

    return v0
.end method

.method public t0(I)V
    .locals 0

    .prologue
    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lr1/e;->a0:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lr1/e;->h0:Ljava/lang/String;

    const-string v2, ""

    const-string v3, " "

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "type: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lr1/e;->h0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lr1/e;->g0:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lr1/e;->g0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr1/e;->S:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr1/e;->T:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ") - ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr1/e;->O:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lr1/e;->P:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lr1/e;->R:I

    return v0
.end method

.method public u0(I)V
    .locals 0

    .prologue
    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    iput p1, p0, Lr1/e;->Z:I

    return-void
.end method

.method public v()I
    .locals 2

    .prologue
    iget v0, p0, Lr1/e;->f0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lr1/e;->P:I

    return v0
.end method

.method public v0(II)V
    .locals 0

    iput p1, p0, Lr1/e;->S:I

    iput p2, p0, Lr1/e;->T:I

    return-void
.end method

.method public w()F
    .locals 1

    iget v0, p0, Lr1/e;->b0:F

    return v0
.end method

.method public w0(Lr1/e;)V
    .locals 0

    iput-object p1, p0, Lr1/e;->N:Lr1/e;

    return-void
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lr1/e;->m0:I

    return v0
.end method

.method public x0(F)V
    .locals 0

    iput p1, p0, Lr1/e;->c0:F

    return-void
.end method

.method public y()Lr1/e$b;
    .locals 2

    iget-object v0, p0, Lr1/e;->M:[Lr1/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public y0(I)V
    .locals 0

    iput p1, p0, Lr1/e;->n0:I

    return-void
.end method

.method public z()I
    .locals 2

    .prologue
    iget-object v0, p0, Lr1/e;->B:Lr1/d;

    if-eqz v0, :cond_0

    iget v0, v0, Lr1/d;->e:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lr1/e;->D:Lr1/d;

    if-eqz v1, :cond_1

    iget v1, v1, Lr1/d;->e:I

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public z0(II)V
    .locals 0

    .prologue
    iput p1, p0, Lr1/e;->T:I

    sub-int/2addr p2, p1

    iput p2, p0, Lr1/e;->P:I

    iget p1, p0, Lr1/e;->a0:I

    if-ge p2, p1, :cond_0

    iput p1, p0, Lr1/e;->P:I

    :cond_0
    return-void
.end method
