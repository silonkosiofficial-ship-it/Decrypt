.class public final Ln1/c;
.super Ln1/p;
.source "SourceFile"


# instance fields
.field private k:Ljava/util/ArrayList;

.field private l:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm1/e;I)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln1/p;-><init>(Lm1/e;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p0, p2}, Ln1/p;->C(I)V

    invoke-direct {p0}, Ln1/c;->H()V

    return-void
.end method

.method private final H()V
    .locals 5

    .prologue
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Lm1/e;->p0(I)Lm1/e;

    move-result-object v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Ln1/p;->A(Lm1/e;)V

    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v2

    invoke-virtual {v1, v2}, Lm1/e;->r0(I)Ln1/p;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v0

    invoke-virtual {v1, v0}, Lm1/e;->n0(I)Lm1/e;

    move-result-object v0

    :goto_1
    if-eqz v0, :cond_1

    iget-object v1, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v2

    invoke-virtual {v0, v2}, Lm1/e;->r0(I)Ln1/p;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Lm1/e;->n0(I)Lm1/e;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/p;

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v1}, Ln1/p;->n()Lm1/e;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lm1/e;->o1(Ln1/c;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v3

    if-ne v3, v2, :cond_2

    invoke-virtual {v1}, Ln1/p;->n()Lm1/e;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lm1/e;->M1(Ln1/c;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    check-cast v0, Lm1/f;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/f;->J2()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v2, :cond_5

    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/p;

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Ln1/p;->A(Lm1/e;)V

    :cond_5
    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->z()I

    move-result v0

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->x0()I

    move-result v0

    :goto_3
    iput v0, p0, Ln1/c;->l:I

    return-void
.end method

.method private final I()Lm1/e;
    .locals 5

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ln1/p;

    invoke-virtual {v2}, Ln1/p;->n()Lm1/e;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->A0()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private final J()Lm1/e;
    .locals 4

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2

    :goto_0
    add-int/lit8 v1, v0, -0x1

    iget-object v2, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "get(...)"

    invoke-static {v0, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln1/p;

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->A0()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    return-object v0

    :cond_0
    if-gez v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public D()Z
    .locals 5

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "get(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ln1/p;

    invoke-virtual {v3}, Ln1/p;->D()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public a(Ln1/d;)V
    .locals 25

    .prologue
    move-object/from16 v0, p0

    const-string v1, "node"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->i()Z

    move-result v1

    if-eqz v1, :cond_55

    invoke-virtual/range {p0 .. p0}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->i()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_37

    :cond_0
    invoke-virtual/range {p0 .. p0}, Ln1/p;->n()Lm1/e;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/e;->o0()Lm1/e;

    move-result-object v1

    instance-of v2, v1, Lm1/f;

    if-eqz v2, :cond_1

    check-cast v1, Lm1/f;

    invoke-virtual {v1}, Lm1/f;->J2()Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p0}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Ln1/p;->q()Ln1/f;

    move-result-object v4

    invoke-virtual {v4}, Ln1/f;->j()I

    move-result v4

    sub-int/2addr v2, v4

    iget-object v4, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    const/4 v6, -0x1

    const/16 v7, 0x8

    const-string v8, "get(...)"

    if-ge v5, v4, :cond_2

    iget-object v9, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ln1/p;

    invoke-virtual {v9}, Ln1/p;->n()Lm1/e;

    move-result-object v9

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9}, Lm1/e;->A0()I

    move-result v9

    if-ne v9, v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move v5, v6

    :cond_3
    add-int/lit8 v9, v4, -0x1

    move v10, v9

    :goto_2
    if-ge v6, v10, :cond_5

    iget-object v11, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ln1/p;

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->A0()I

    move-result v11

    if-ne v11, v7, :cond_4

    add-int/lit8 v10, v10, -0x1

    goto :goto_2

    :cond_4
    move v6, v10

    :cond_5
    const/4 v10, 0x0

    :goto_3
    const/4 v12, 0x2

    const/4 v13, 0x1

    if-ge v10, v12, :cond_13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_4
    if-ge v14, v4, :cond_10

    iget-object v3, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v3, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ln1/p;

    invoke-virtual {v3}, Ln1/p;->n()Lm1/e;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v19 .. v19}, Lm1/e;->A0()I

    move-result v12

    if-ne v12, v7, :cond_6

    goto/16 :goto_9

    :cond_6
    add-int/lit8 v17, v17, 0x1

    if-lez v14, :cond_7

    if-lt v14, v5, :cond_7

    invoke-virtual {v3}, Ln1/p;->q()Ln1/f;

    move-result-object v12

    invoke-virtual {v12}, Ln1/f;->e()I

    move-result v12

    add-int/2addr v15, v12

    :cond_7
    invoke-virtual {v3}, Ln1/p;->i()Ln1/g;

    move-result-object v12

    invoke-virtual {v12}, Ln1/f;->j()I

    move-result v12

    invoke-virtual {v3}, Ln1/p;->j()Lm1/e$b;

    move-result-object v7

    sget-object v11, Lm1/e$b;->E:Lm1/e$b;

    if-eq v7, v11, :cond_8

    move v7, v13

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    if-eqz v7, :cond_a

    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v3}, Ln1/p;->n()Lm1/e;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->K()Ln1/l;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Ln1/p;->i()Ln1/g;

    move-result-object v11

    invoke-virtual {v11}, Ln1/f;->i()Z

    move-result v11

    if-nez v11, :cond_9

    return-void

    :cond_9
    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v11

    if-ne v11, v13, :cond_c

    invoke-virtual {v3}, Ln1/p;->n()Lm1/e;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->e0()Ln1/n;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Ln1/p;->i()Ln1/g;

    move-result-object v11

    invoke-virtual {v11}, Ln1/f;->i()Z

    move-result v11

    if-nez v11, :cond_c

    return-void

    :cond_a
    invoke-virtual {v3}, Ln1/p;->o()I

    move-result v11

    if-ne v11, v13, :cond_b

    if-nez v10, :cond_b

    invoke-virtual {v3}, Ln1/p;->i()Ln1/g;

    move-result-object v7

    invoke-virtual {v7}, Ln1/g;->u()I

    move-result v12

    add-int/lit8 v16, v16, 0x1

    :goto_6
    move v7, v13

    goto :goto_7

    :cond_b
    invoke-virtual {v3}, Ln1/p;->i()Ln1/g;

    move-result-object v11

    invoke-virtual {v11}, Ln1/f;->i()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_6

    :cond_c
    :goto_7
    if-nez v7, :cond_d

    add-int/lit8 v16, v16, 0x1

    invoke-virtual {v3}, Ln1/p;->n()Lm1/e;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->f0()[F

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v11

    aget v7, v7, v11

    const/4 v11, 0x0

    cmpl-float v12, v7, v11

    if-ltz v12, :cond_e

    add-float v18, v18, v7

    goto :goto_8

    :cond_d
    add-int/2addr v15, v12

    :cond_e
    :goto_8
    if-ge v14, v9, :cond_f

    if-ge v14, v6, :cond_f

    invoke-virtual {v3}, Ln1/p;->g()Ln1/f;

    move-result-object v3

    invoke-virtual {v3}, Ln1/f;->e()I

    move-result v3

    neg-int v3, v3

    add-int/2addr v15, v3

    :cond_f
    :goto_9
    add-int/lit8 v14, v14, 0x1

    const/16 v7, 0x8

    const/4 v12, 0x2

    goto/16 :goto_4

    :cond_10
    if-lt v15, v2, :cond_12

    if-nez v16, :cond_11

    goto :goto_a

    :cond_11
    add-int/lit8 v10, v10, 0x1

    const/16 v7, 0x8

    goto/16 :goto_3

    :cond_12
    :goto_a
    move/from16 v3, v16

    move/from16 v7, v17

    goto :goto_b

    :cond_13
    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    :goto_b
    invoke-virtual/range {p0 .. p0}, Ln1/p;->q()Ln1/f;

    move-result-object v10

    invoke-virtual {v10}, Ln1/f;->j()I

    move-result v10

    if-eqz v1, :cond_14

    invoke-virtual/range {p0 .. p0}, Ln1/p;->g()Ln1/f;

    move-result-object v10

    invoke-virtual {v10}, Ln1/f;->j()I

    move-result v10

    :cond_14
    const/high16 v11, 0x3f000000    # 0.5f

    if-le v15, v2, :cond_16

    const/high16 v12, 0x40000000    # 2.0f

    sub-int v14, v15, v2

    int-to-float v14, v14

    div-float/2addr v14, v12

    add-float/2addr v14, v11

    float-to-int v12, v14

    if-eqz v1, :cond_15

    add-int/2addr v10, v12

    goto :goto_c

    :cond_15
    sub-int/2addr v10, v12

    :cond_16
    :goto_c
    if-lez v3, :cond_25

    sub-int v12, v2, v15

    int-to-float v12, v12

    int-to-float v14, v3

    div-float v14, v12, v14

    add-float/2addr v14, v11

    float-to-int v14, v14

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_d
    if-ge v13, v4, :cond_1e

    iget-object v11, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ln1/p;

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Ly7/t;->c(Ljava/lang/Object;)V

    move/from16 v22, v14

    invoke-virtual/range {v21 .. v21}, Lm1/e;->A0()I

    move-result v14

    move/from16 v21, v15

    const/16 v15, 0x8

    if-ne v14, v15, :cond_18

    :cond_17
    move/from16 v24, v1

    move/from16 v23, v10

    move/from16 v20, v12

    goto/16 :goto_12

    :cond_18
    invoke-virtual {v11}, Ln1/p;->j()Lm1/e$b;

    move-result-object v14

    sget-object v15, Lm1/e$b;->E:Lm1/e$b;

    if-ne v14, v15, :cond_17

    invoke-virtual {v11}, Ln1/p;->i()Ln1/g;

    move-result-object v14

    invoke-virtual {v14}, Ln1/f;->i()Z

    move-result v14

    if-nez v14, :cond_17

    const/4 v14, 0x0

    cmpl-float v15, v18, v14

    if-lez v15, :cond_19

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v15

    invoke-static {v15}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lm1/e;->f0()[F

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v20

    aget v15, v15, v20

    mul-float/2addr v15, v12

    div-float v15, v15, v18

    const/high16 v20, 0x3f000000    # 0.5f

    add-float v15, v15, v20

    float-to-int v15, v15

    goto :goto_e

    :cond_19
    move/from16 v15, v22

    :goto_e
    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v20

    if-nez v20, :cond_1a

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lm1/e;->S()I

    move-result v20

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lm1/e;->U()I

    move-result v23

    :goto_f
    move/from16 v14, v20

    move/from16 v20, v12

    move/from16 v12, v23

    move/from16 v23, v10

    goto :goto_10

    :cond_1a
    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v20 .. v20}, Lm1/e;->R()I

    move-result v20

    invoke-virtual {v11}, Ln1/p;->n()Lm1/e;

    move-result-object v23

    invoke-static/range {v23 .. v23}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lm1/e;->T()I

    move-result v23

    goto :goto_f

    :goto_10
    invoke-virtual {v11}, Ln1/p;->o()I

    move-result v10

    move/from16 v24, v1

    const/4 v1, 0x1

    if-ne v10, v1, :cond_1b

    invoke-virtual {v11}, Ln1/p;->i()Ln1/g;

    move-result-object v1

    invoke-virtual {v1}, Ln1/g;->u()I

    move-result v1

    invoke-static {v15, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_11

    :cond_1b
    move v1, v15

    :goto_11
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-lez v14, :cond_1c

    invoke-static {v14, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_1c
    if-eq v1, v15, :cond_1d

    add-int/lit8 v17, v17, 0x1

    move v15, v1

    :cond_1d
    invoke-virtual {v11}, Ln1/p;->i()Ln1/g;

    move-result-object v1

    invoke-virtual {v1, v15}, Ln1/g;->k(I)V

    :goto_12
    add-int/lit8 v13, v13, 0x1

    move/from16 v12, v20

    move/from16 v15, v21

    move/from16 v14, v22

    move/from16 v10, v23

    move/from16 v1, v24

    const/high16 v11, 0x3f000000    # 0.5f

    goto/16 :goto_d

    :cond_1e
    move/from16 v24, v1

    move/from16 v23, v10

    move/from16 v21, v15

    if-lez v17, :cond_22

    sub-int v3, v3, v17

    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_13
    if-ge v1, v4, :cond_23

    iget-object v10, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ln1/p;

    invoke-virtual {v10}, Ln1/p;->n()Lm1/e;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->A0()I

    move-result v11

    const/16 v12, 0x8

    if-ne v11, v12, :cond_1f

    goto :goto_14

    :cond_1f
    if-lez v1, :cond_20

    if-lt v1, v5, :cond_20

    invoke-virtual {v10}, Ln1/p;->q()Ln1/f;

    move-result-object v11

    invoke-virtual {v11}, Ln1/f;->e()I

    move-result v11

    add-int/2addr v15, v11

    :cond_20
    invoke-virtual {v10}, Ln1/p;->i()Ln1/g;

    move-result-object v11

    invoke-virtual {v11}, Ln1/f;->j()I

    move-result v11

    add-int/2addr v15, v11

    if-ge v1, v9, :cond_21

    if-ge v1, v6, :cond_21

    invoke-virtual {v10}, Ln1/p;->g()Ln1/f;

    move-result-object v10

    invoke-virtual {v10}, Ln1/f;->e()I

    move-result v10

    neg-int v10, v10

    add-int/2addr v15, v10

    :cond_21
    :goto_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_22
    move/from16 v15, v21

    :cond_23
    iget v1, v0, Ln1/c;->l:I

    const/4 v10, 0x2

    if-ne v1, v10, :cond_24

    if-nez v17, :cond_24

    const/4 v1, 0x0

    iput v1, v0, Ln1/c;->l:I

    goto :goto_15

    :cond_24
    const/4 v1, 0x0

    goto :goto_15

    :cond_25
    move/from16 v24, v1

    move/from16 v23, v10

    move/from16 v21, v15

    const/4 v1, 0x0

    const/4 v10, 0x2

    :goto_15
    if-le v15, v2, :cond_26

    iput v10, v0, Ln1/c;->l:I

    :cond_26
    if-lez v7, :cond_27

    if-nez v3, :cond_27

    if-ne v5, v6, :cond_27

    iput v10, v0, Ln1/c;->l:I

    :cond_27
    iget v10, v0, Ln1/c;->l:I

    const/4 v11, 0x1

    if-ne v10, v11, :cond_37

    if-le v7, v11, :cond_28

    sub-int/2addr v2, v15

    sub-int/2addr v7, v11

    div-int/2addr v2, v7

    goto :goto_16

    :cond_28
    if-ne v7, v11, :cond_29

    sub-int/2addr v2, v15

    const/4 v7, 0x2

    div-int/2addr v2, v7

    goto :goto_16

    :cond_29
    move v2, v1

    :goto_16
    if-lez v3, :cond_2a

    move v2, v1

    :cond_2a
    move v3, v1

    move/from16 v10, v23

    :goto_17
    if-ge v3, v4, :cond_55

    if-eqz v24, :cond_2b

    add-int/lit8 v1, v3, 0x1

    sub-int v1, v4, v1

    goto :goto_18

    :cond_2b
    move v1, v3

    :goto_18
    iget-object v7, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->n()Lm1/e;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->A0()I

    move-result v7

    const/16 v11, 0x8

    if-ne v7, v11, :cond_2c

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1, v10}, Ln1/f;->k(I)V

    goto/16 :goto_20

    :cond_2c
    if-lez v3, :cond_2e

    if-eqz v24, :cond_2d

    sub-int/2addr v10, v2

    goto :goto_19

    :cond_2d
    add-int/2addr v10, v2

    :cond_2e
    :goto_19
    if-lez v3, :cond_30

    if-lt v3, v5, :cond_30

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    invoke-virtual {v7}, Ln1/f;->e()I

    move-result v7

    if-eqz v24, :cond_2f

    sub-int/2addr v10, v7

    goto :goto_1a

    :cond_2f
    add-int/2addr v10, v7

    :cond_30
    :goto_1a
    if-eqz v24, :cond_31

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    :goto_1b
    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    goto :goto_1c

    :cond_31
    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    goto :goto_1b

    :goto_1c
    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v7

    invoke-virtual {v7}, Ln1/f;->j()I

    move-result v7

    invoke-virtual {v1}, Ln1/p;->j()Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->E:Lm1/e$b;

    if-ne v11, v12, :cond_32

    invoke-virtual {v1}, Ln1/p;->o()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_32

    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v7

    invoke-virtual {v7}, Ln1/g;->u()I

    move-result v7

    :cond_32
    if-eqz v24, :cond_33

    sub-int/2addr v10, v7

    goto :goto_1d

    :cond_33
    add-int/2addr v10, v7

    :goto_1d
    if-eqz v24, :cond_34

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    :goto_1e
    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    const/4 v7, 0x1

    goto :goto_1f

    :cond_34
    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    goto :goto_1e

    :goto_1f
    invoke-virtual {v1, v7}, Ln1/p;->x(Z)V

    if-ge v3, v9, :cond_36

    if-ge v3, v6, :cond_36

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->e()I

    move-result v1

    neg-int v1, v1

    if-eqz v24, :cond_35

    sub-int/2addr v10, v1

    goto :goto_20

    :cond_35
    add-int/2addr v10, v1

    :cond_36
    :goto_20
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_17

    :cond_37
    if-nez v10, :cond_44

    sub-int/2addr v2, v15

    const/4 v10, 0x1

    add-int/2addr v7, v10

    div-int/2addr v2, v7

    if-lez v3, :cond_38

    move v2, v1

    :cond_38
    move v3, v1

    move/from16 v10, v23

    :goto_21
    if-ge v3, v4, :cond_55

    if-eqz v24, :cond_39

    add-int/lit8 v1, v3, 0x1

    sub-int v1, v4, v1

    goto :goto_22

    :cond_39
    move v1, v3

    :goto_22
    iget-object v7, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->n()Lm1/e;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->A0()I

    move-result v7

    const/16 v11, 0x8

    if-ne v7, v11, :cond_3a

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1, v10}, Ln1/f;->k(I)V

    goto/16 :goto_2a

    :cond_3a
    if-eqz v24, :cond_3b

    sub-int/2addr v10, v2

    goto :goto_23

    :cond_3b
    add-int/2addr v10, v2

    :goto_23
    if-lez v3, :cond_3d

    if-lt v3, v5, :cond_3d

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    invoke-virtual {v7}, Ln1/f;->e()I

    move-result v7

    if-eqz v24, :cond_3c

    sub-int/2addr v10, v7

    goto :goto_24

    :cond_3c
    add-int/2addr v10, v7

    :cond_3d
    :goto_24
    if-eqz v24, :cond_3e

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    :goto_25
    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    goto :goto_26

    :cond_3e
    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    goto :goto_25

    :goto_26
    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v7

    invoke-virtual {v7}, Ln1/f;->j()I

    move-result v7

    invoke-virtual {v1}, Ln1/p;->j()Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->E:Lm1/e$b;

    if-ne v11, v12, :cond_3f

    invoke-virtual {v1}, Ln1/p;->o()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_3f

    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v11

    invoke-virtual {v11}, Ln1/g;->u()I

    move-result v11

    invoke-static {v7, v11}, Ljava/lang/Math;->min(II)I

    move-result v7

    :cond_3f
    if-eqz v24, :cond_40

    sub-int/2addr v10, v7

    goto :goto_27

    :cond_40
    add-int/2addr v10, v7

    :goto_27
    if-eqz v24, :cond_41

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v7

    :goto_28
    invoke-virtual {v7, v10}, Ln1/f;->k(I)V

    goto :goto_29

    :cond_41
    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v7

    goto :goto_28

    :goto_29
    if-ge v3, v9, :cond_43

    if-ge v3, v6, :cond_43

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->e()I

    move-result v1

    neg-int v1, v1

    if-eqz v24, :cond_42

    sub-int/2addr v10, v1

    goto :goto_2a

    :cond_42
    add-int/2addr v10, v1

    :cond_43
    :goto_2a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_21

    :cond_44
    const/4 v7, 0x2

    if-ne v10, v7, :cond_55

    invoke-virtual/range {p0 .. p0}, Ln1/p;->p()I

    move-result v7

    if-nez v7, :cond_45

    invoke-virtual/range {p0 .. p0}, Ln1/p;->n()Lm1/e;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->x()F

    move-result v7

    goto :goto_2b

    :cond_45
    invoke-virtual/range {p0 .. p0}, Ln1/p;->n()Lm1/e;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/e;->v0()F

    move-result v7

    :goto_2b
    if-eqz v24, :cond_46

    const/4 v10, 0x1

    int-to-float v11, v10

    sub-float v7, v11, v7

    :cond_46
    sub-int/2addr v2, v15

    int-to-float v2, v2

    mul-float/2addr v2, v7

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v2, v7

    float-to-int v2, v2

    if-ltz v2, :cond_47

    if-lez v3, :cond_48

    :cond_47
    move v2, v1

    :cond_48
    if-eqz v24, :cond_49

    sub-int v10, v23, v2

    goto :goto_2c

    :cond_49
    add-int v10, v23, v2

    :goto_2c
    move v3, v1

    :goto_2d
    if-ge v3, v4, :cond_55

    if-eqz v24, :cond_4a

    add-int/lit8 v1, v3, 0x1

    sub-int v1, v4, v1

    goto :goto_2e

    :cond_4a
    move v1, v3

    :goto_2e
    iget-object v2, v0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->A0()I

    move-result v2

    const/16 v7, 0x8

    if-ne v2, v7, :cond_4b

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v2, v10}, Ln1/f;->k(I)V

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1, v10}, Ln1/f;->k(I)V

    const/4 v12, 0x1

    goto/16 :goto_36

    :cond_4b
    if-lez v3, :cond_4d

    if-lt v3, v5, :cond_4d

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->e()I

    move-result v2

    if-eqz v24, :cond_4c

    sub-int/2addr v10, v2

    goto :goto_2f

    :cond_4c
    add-int/2addr v10, v2

    :cond_4d
    :goto_2f
    if-eqz v24, :cond_4e

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    :goto_30
    invoke-virtual {v2, v10}, Ln1/f;->k(I)V

    goto :goto_31

    :cond_4e
    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    goto :goto_30

    :goto_31
    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/f;->j()I

    move-result v2

    invoke-virtual {v1}, Ln1/p;->j()Lm1/e$b;

    move-result-object v11

    sget-object v12, Lm1/e$b;->E:Lm1/e$b;

    if-ne v11, v12, :cond_4f

    invoke-virtual {v1}, Ln1/p;->o()I

    move-result v11

    const/4 v12, 0x1

    if-ne v11, v12, :cond_50

    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v2

    invoke-virtual {v2}, Ln1/g;->u()I

    move-result v2

    goto :goto_32

    :cond_4f
    const/4 v12, 0x1

    :cond_50
    :goto_32
    if-eqz v24, :cond_51

    sub-int/2addr v10, v2

    goto :goto_33

    :cond_51
    add-int/2addr v10, v2

    :goto_33
    if-eqz v24, :cond_52

    invoke-virtual {v1}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    :goto_34
    invoke-virtual {v2, v10}, Ln1/f;->k(I)V

    goto :goto_35

    :cond_52
    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    goto :goto_34

    :goto_35
    if-ge v3, v9, :cond_54

    if-ge v3, v6, :cond_54

    invoke-virtual {v1}, Ln1/p;->g()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->e()I

    move-result v1

    neg-int v1, v1

    if-eqz v24, :cond_53

    sub-int/2addr v10, v1

    goto :goto_36

    :cond_53
    add-int/2addr v10, v1

    :cond_54
    :goto_36
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_2d

    :cond_55
    :goto_37
    return-void
.end method

.method public d()V
    .locals 5

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->d()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v2, p0, Ln1/c;->k:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln1/p;

    invoke-virtual {v2}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    iget-object v4, p0, Ln1/c;->k:Ljava/util/ArrayList;

    sub-int/2addr v0, v1

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln1/p;

    invoke-virtual {v0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v4

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez v4, :cond_5

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {p0, v1, v3}, Ln1/p;->s(Lm1/d;I)Ln1/f;

    move-result-object v2

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    invoke-direct {p0}, Ln1/c;->I()Lm1/e;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    :cond_2
    if-eqz v2, :cond_3

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v4

    invoke-virtual {p0, v4, v2, v1}, Ln1/p;->b(Ln1/f;Ln1/f;I)V

    :cond_3
    invoke-virtual {p0, v0, v3}, Ln1/p;->s(Lm1/d;I)Ln1/f;

    move-result-object v1

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    invoke-direct {p0}, Ln1/c;->J()Lm1/e;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    :cond_4
    if-eqz v1, :cond_9

    :goto_1
    invoke-virtual {p0}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    neg-int v0, v0

    invoke-virtual {p0, v2, v1, v0}, Ln1/p;->b(Ln1/f;Ln1/f;I)V

    goto :goto_2

    :cond_5
    invoke-virtual {v2}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    invoke-virtual {p0, v2, v1}, Ln1/p;->s(Lm1/d;I)Ln1/f;

    move-result-object v3

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    invoke-direct {p0}, Ln1/c;->I()Lm1/e;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v4

    invoke-virtual {p0, v4, v3, v2}, Ln1/p;->b(Ln1/f;Ln1/f;I)V

    :cond_7
    invoke-virtual {p0, v0, v1}, Ln1/p;->s(Lm1/d;I)Ln1/f;

    move-result-object v1

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    invoke-direct {p0}, Ln1/c;->J()Lm1/e;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    :cond_8
    if-eqz v1, :cond_9

    goto :goto_1

    :cond_9
    :goto_2
    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln1/f;->s(Ln1/d;)V

    invoke-virtual {p0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0, p0}, Ln1/f;->s(Ln1/d;)V

    return-void
.end method

.method public e()V
    .locals 4

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ln1/p;

    invoke-virtual {v2}, Ln1/p;->e()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ln1/p;->y(Ln1/m;)V

    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln1/p;

    invoke-virtual {v1}, Ln1/p;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t()J
    .locals 7

    .prologue
    iget-object v0, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "get(...)"

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ln1/p;

    invoke-virtual {v4}, Ln1/p;->q()Ln1/f;

    move-result-object v5

    invoke-virtual {v5}, Ln1/f;->e()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v1, v5

    invoke-virtual {v4}, Ln1/p;->t()J

    move-result-wide v5

    add-long/2addr v1, v5

    invoke-virtual {v4}, Ln1/p;->g()Ln1/f;

    move-result-object v4

    invoke-virtual {v4}, Ln1/f;->e()I

    move-result v4

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChainRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ln1/p;->p()I

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "horizontal : "

    goto :goto_0

    :cond_0
    const-string v1, "vertical : "

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln1/c;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln1/p;

    const-string v3, "<"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
