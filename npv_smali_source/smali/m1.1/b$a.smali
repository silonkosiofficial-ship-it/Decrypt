.class public final Lm1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lm1/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm1/f;Le1/d;IILm1/c;)V
    .locals 36

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v9, p2

    move/from16 v10, p3

    const-string v1, "container"

    invoke-static {v0, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "system"

    invoke-static {v9, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "chainHead"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p5 .. p5}, Lm1/c;->c()Lm1/e;

    move-result-object v11

    invoke-virtual/range {p5 .. p5}, Lm1/c;->i()Lm1/e;

    move-result-object v12

    invoke-virtual/range {p5 .. p5}, Lm1/c;->e()Lm1/e;

    move-result-object v13

    invoke-virtual/range {p5 .. p5}, Lm1/c;->k()Lm1/e;

    move-result-object v14

    invoke-virtual/range {p5 .. p5}, Lm1/c;->h()Lm1/e;

    move-result-object v1

    invoke-virtual/range {p5 .. p5}, Lm1/c;->l()F

    move-result v3

    invoke-virtual/range {p5 .. p5}, Lm1/c;->d()Lm1/e;

    invoke-virtual/range {p5 .. p5}, Lm1/c;->j()Lm1/e;

    invoke-virtual/range {p1 .. p1}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v4

    aget-object v4, v4, v10

    sget-object v5, Lm1/e$b;->D:Lm1/e$b;

    const/4 v6, 0x1

    if-ne v4, v5, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x2

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    if-nez v10, :cond_4

    invoke-virtual {v1}, Lm1/e;->J()I

    move-result v8

    if-nez v8, :cond_1

    move v8, v6

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v1}, Lm1/e;->J()I

    move-result v15

    if-ne v15, v6, :cond_2

    move v15, v6

    goto :goto_2

    :cond_2
    const/4 v15, 0x0

    :goto_2
    invoke-virtual {v1}, Lm1/e;->J()I

    move-result v7

    if-ne v7, v5, :cond_3

    :goto_3
    move v5, v6

    goto :goto_4

    :cond_3
    const/4 v5, 0x0

    :goto_4
    move/from16 v17, v15

    move v15, v8

    goto :goto_7

    :cond_4
    invoke-virtual {v1}, Lm1/e;->d0()I

    move-result v7

    if-nez v7, :cond_5

    move v8, v6

    goto :goto_5

    :cond_5
    const/4 v8, 0x0

    :goto_5
    invoke-virtual {v1}, Lm1/e;->d0()I

    move-result v7

    if-ne v7, v6, :cond_6

    move v15, v6

    goto :goto_6

    :cond_6
    const/4 v15, 0x0

    :goto_6
    invoke-virtual {v1}, Lm1/e;->d0()I

    move-result v7

    if-ne v7, v5, :cond_3

    goto :goto_3

    :goto_7
    move-object v8, v11

    const/4 v7, 0x0

    :goto_8
    const/16 v22, 0x0

    if-nez v7, :cond_14

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v23

    aget-object v23, v23, p4

    if-eqz v5, :cond_7

    const/16 v20, 0x1

    goto :goto_9

    :cond_7
    const/16 v20, 0x4

    :goto_9
    invoke-virtual/range {v23 .. v23}, Lm1/d;->k()I

    move-result v24

    invoke-virtual {v8}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v25

    aget-object v6, v25, v10

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v6, v2, :cond_8

    invoke-virtual {v8}, Lm1/e;->a0()[I

    move-result-object v6

    aget v6, v6, v10

    if-nez v6, :cond_8

    const/4 v6, 0x1

    goto :goto_a

    :cond_8
    const/4 v6, 0x0

    :goto_a
    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v25

    if-eqz v25, :cond_9

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v25

    if-nez v25, :cond_9

    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v25

    invoke-static/range {v25 .. v25}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v25 .. v25}, Lm1/d;->k()I

    move-result v25

    add-int v24, v24, v25

    :cond_9
    move/from16 v25, v3

    move/from16 v3, v24

    if-eqz v5, :cond_a

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_a

    invoke-static {v8, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24

    if-nez v24, :cond_a

    const/16 v20, 0x8

    :cond_a
    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v24

    if-eqz v24, :cond_e

    invoke-static {v8, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_b

    move/from16 v24, v7

    invoke-virtual/range {v23 .. v23}, Lm1/d;->h()Le1/i;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Ly7/t;->c(Ljava/lang/Object;)V

    move/from16 v27, v15

    invoke-virtual/range {v26 .. v26}, Lm1/d;->h()Le1/i;

    move-result-object v15

    invoke-static {v15}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v26, v1

    const/4 v1, 0x6

    invoke-virtual {v9, v7, v15, v3, v1}, Le1/d;->l(Le1/i;Le1/i;II)V

    goto :goto_b

    :cond_b
    move-object/from16 v26, v1

    move/from16 v24, v7

    move/from16 v27, v15

    invoke-virtual/range {v23 .. v23}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    const/16 v15, 0x8

    invoke-virtual {v9, v1, v7, v3, v15}, Le1/d;->l(Le1/i;Le1/i;II)V

    :goto_b
    if-eqz v6, :cond_c

    if-nez v5, :cond_c

    const/16 v20, 0x5

    :cond_c
    invoke-static {v8, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    if-eqz v5, :cond_d

    invoke-virtual {v8, v10}, Lm1/e;->L0(I)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, 0x5

    goto :goto_c

    :cond_d
    move/from16 v1, v20

    :goto_c
    invoke-virtual/range {v23 .. v23}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {v23 .. v23}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v9, v6, v7, v3, v1}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    goto :goto_d

    :cond_e
    move-object/from16 v26, v1

    move/from16 v24, v7

    move/from16 v27, v15

    :goto_d
    if-eqz v4, :cond_10

    invoke-virtual {v8}, Lm1/e;->A0()I

    move-result v1

    const/16 v3, 0x8

    if-eq v1, v3, :cond_f

    invoke-virtual {v8}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v1

    aget-object v1, v1, v10

    if-ne v1, v2, :cond_f

    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/lit8 v2, p4, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/4 v6, 0x5

    invoke-virtual {v9, v1, v2, v3, v6}, Le1/d;->l(Le1/i;Le1/i;II)V

    :cond_f
    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, p4

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/16 v6, 0x8

    invoke-virtual {v9, v1, v2, v3, v6}, Le1/d;->l(Le1/i;Le1/i;II)V

    :cond_10
    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/lit8 v2, p4, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lm1/d;->g()Lm1/e;

    move-result-object v1

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v1}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->g()Lm1/e;

    move-result-object v2

    invoke-static {v2, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_e

    :cond_11
    move-object/from16 v22, v1

    :cond_12
    :goto_e
    move-object/from16 v2, p5

    if-eqz v22, :cond_13

    move-object/from16 v8, v22

    move/from16 v7, v24

    move/from16 v3, v25

    move-object/from16 v1, v26

    move/from16 v15, v27

    goto/16 :goto_8

    :cond_13
    move/from16 v3, v25

    move-object/from16 v1, v26

    move/from16 v15, v27

    const/4 v7, 0x1

    goto/16 :goto_8

    :cond_14
    move-object/from16 v26, v1

    move/from16 v25, v3

    move/from16 v27, v15

    if-eqz v14, :cond_17

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/lit8 v2, p4, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    if-eqz v1, :cond_17

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-virtual {v14}, Lm1/e;->N()[Lm1/e$b;

    move-result-object v3

    aget-object v3, v3, v10

    sget-object v6, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v6, :cond_15

    invoke-virtual {v14}, Lm1/e;->a0()[I

    move-result-object v3

    aget v3, v3, v10

    if-nez v3, :cond_15

    if-nez v5, :cond_15

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/d;->g()Lm1/e;

    move-result-object v3

    invoke-static {v3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v7

    neg-int v7, v7

    const/4 v8, 0x5

    invoke-virtual {v9, v3, v6, v7, v8}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    goto :goto_f

    :cond_15
    const/4 v8, 0x5

    if-eqz v5, :cond_16

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/d;->g()Lm1/e;

    move-result-object v3

    invoke-static {v3, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v7

    neg-int v7, v7

    const/4 v15, 0x4

    invoke-virtual {v9, v3, v6, v7, v15}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    :cond_16
    :goto_f
    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v6

    aget-object v2, v6, v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    neg-int v1, v1

    const/4 v6, 0x6

    invoke-virtual {v9, v3, v2, v1, v6}, Le1/d;->n(Le1/i;Le1/i;II)V

    goto :goto_10

    :cond_17
    const/4 v8, 0x5

    :goto_10
    if-eqz v4, :cond_18

    invoke-virtual/range {p1 .. p1}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    add-int/lit8 v1, p4, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v3

    aget-object v1, v3, v1

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    const/16 v3, 0x8

    invoke-virtual {v9, v0, v2, v1, v3}, Le1/d;->l(Le1/i;Le1/i;II)V

    :cond_18
    invoke-virtual/range {p5 .. p5}, Lm1/c;->m()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1e

    invoke-virtual/range {p5 .. p5}, Lm1/c;->g()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual/range {p5 .. p5}, Lm1/c;->f()Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual/range {p5 .. p5}, Lm1/c;->o()I

    move-result v3

    int-to-float v3, v3

    goto :goto_11

    :cond_19
    move/from16 v3, v25

    :goto_11
    const/4 v4, 0x0

    move/from16 v29, v4

    move-object/from16 v7, v22

    const/4 v6, 0x0

    :goto_12
    if-ge v6, v1, :cond_1e

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    const-string v2, "get(...)"

    invoke-static {v15, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Lm1/e;

    invoke-virtual {v15}, Lm1/e;->f0()[F

    move-result-object v2

    aget v2, v2, v10

    cmpg-float v19, v2, v4

    if-gez v19, :cond_1b

    invoke-virtual/range {p5 .. p5}, Lm1/c;->f()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    add-int/lit8 v19, p4, 0x1

    aget-object v2, v2, v19

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v15

    aget-object v15, v15, p4

    invoke-virtual {v15}, Lm1/d;->h()Le1/i;

    move-result-object v15

    invoke-static {v15}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x4

    const/4 v8, 0x0

    invoke-virtual {v9, v2, v15, v8, v4}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    move v4, v8

    goto :goto_15

    :cond_1a
    const/4 v4, 0x4

    const/high16 v2, 0x3f800000    # 1.0f

    :goto_13
    const/4 v8, 0x0

    goto :goto_14

    :cond_1b
    const/4 v4, 0x4

    goto :goto_13

    :goto_14
    cmpg-float v19, v2, v8

    if-nez v19, :cond_1c

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    add-int/lit8 v19, p4, 0x1

    aget-object v2, v2, v19

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v15

    aget-object v15, v15, p4

    invoke-virtual {v15}, Lm1/d;->h()Le1/i;

    move-result-object v15

    invoke-static {v15}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v4, 0x0

    const/16 v8, 0x8

    invoke-virtual {v9, v2, v15, v4, v8}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    goto :goto_15

    :cond_1c
    const/4 v4, 0x0

    if-eqz v7, :cond_1d

    invoke-virtual {v7}, Lm1/e;->M()[Lm1/d;

    move-result-object v8

    aget-object v8, v8, p4

    invoke-virtual {v8}, Lm1/d;->h()Le1/i;

    move-result-object v32

    invoke-virtual {v7}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    add-int/lit8 v8, p4, 0x1

    aget-object v7, v7, v8

    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v33

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    aget-object v7, v7, p4

    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v34

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    aget-object v7, v7, v8

    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v35

    invoke-virtual/range {p2 .. p2}, Le1/d;->v()Le1/b;

    move-result-object v7

    move-object/from16 v28, v7

    move/from16 v30, v3

    move/from16 v31, v2

    invoke-virtual/range {v28 .. v35}, Le1/b;->l(FFFLe1/i;Le1/i;Le1/i;Le1/i;)Le1/b;

    invoke-virtual {v9, v7}, Le1/d;->h(Le1/b;)V

    :cond_1d
    move/from16 v29, v2

    move-object v7, v15

    :goto_15
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v8, 0x5

    goto/16 :goto_12

    :cond_1e
    const/4 v4, 0x0

    if-eqz v13, :cond_24

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    if-eqz v5, :cond_24

    :cond_1f
    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/lit8 v2, p4, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-eqz v3, :cond_20

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v0

    move-object v3, v0

    goto :goto_16

    :cond_20
    move-object/from16 v3, v22

    :goto_16
    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v0

    move-object v5, v0

    goto :goto_17

    :cond_21
    move-object/from16 v5, v22

    :goto_17
    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    if-eqz v14, :cond_22

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, v2

    :cond_22
    if-eqz v3, :cond_45

    if-eqz v5, :cond_45

    if-nez v10, :cond_23

    invoke-virtual/range {v26 .. v26}, Lm1/e;->x()F

    move-result v2

    :goto_18
    move v4, v2

    goto :goto_19

    :cond_23
    invoke-virtual/range {v26 .. v26}, Lm1/e;->v0()F

    move-result v2

    goto :goto_18

    :goto_19
    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v6

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v7

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v8

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v10, 0x7

    move-object/from16 v0, p2

    move-object v1, v2

    move-object v2, v3

    move v3, v6

    move-object v6, v8

    move v8, v10

    invoke-virtual/range {v0 .. v8}, Le1/d;->g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V

    goto/16 :goto_32

    :cond_24
    if-eqz v27, :cond_35

    if-eqz v13, :cond_35

    invoke-virtual/range {p5 .. p5}, Lm1/c;->o()I

    move-result v0

    if-lez v0, :cond_25

    invoke-virtual/range {p5 .. p5}, Lm1/c;->n()I

    move-result v0

    invoke-virtual/range {p5 .. p5}, Lm1/c;->o()I

    move-result v1

    if-ne v0, v1, :cond_25

    const/16 v18, 0x1

    goto :goto_1a

    :cond_25
    move/from16 v18, v4

    :goto_1a
    move-object v8, v13

    move-object v15, v8

    :goto_1b
    if-eqz v15, :cond_45

    invoke-virtual {v15}, Lm1/e;->Z()[Lm1/e;

    move-result-object v0

    aget-object v0, v0, v10

    move-object/from16 v16, v0

    :goto_1c
    if-eqz v16, :cond_26

    invoke-virtual/range {v16 .. v16}, Lm1/e;->A0()I

    move-result v0

    const/16 v6, 0x8

    if-ne v0, v6, :cond_27

    invoke-virtual/range {v16 .. v16}, Lm1/e;->Z()[Lm1/e;

    move-result-object v0

    aget-object v16, v0, v10

    goto :goto_1c

    :cond_26
    const/16 v6, 0x8

    :cond_27
    if-nez v16, :cond_29

    invoke-static {v15, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    goto :goto_1d

    :cond_28
    move-object/from16 v19, v8

    const/16 v21, 0x5

    goto/16 :goto_25

    :cond_29
    :goto_1d
    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_2a

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    goto :goto_1e

    :cond_2a
    move-object/from16 v2, v22

    :goto_1e
    invoke-static {v8, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    add-int/lit8 v3, p4, 0x1

    aget-object v2, v2, v3

    :goto_1f
    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    goto :goto_20

    :cond_2b
    invoke-static {v15, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_2c

    invoke-virtual {v11}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, p4

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1f

    :cond_2c
    move-object/from16 v2, v22

    :cond_2d
    :goto_20
    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v3

    add-int/lit8 v4, p4, 0x1

    aget-object v3, v3, v4

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    if-eqz v16, :cond_2e

    invoke-virtual/range {v16 .. v16}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, p4

    :goto_21
    invoke-virtual {v5}, Lm1/d;->h()Le1/i;

    move-result-object v7

    goto :goto_22

    :cond_2e
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-eqz v5, :cond_2f

    goto :goto_21

    :cond_2f
    move-object/from16 v7, v22

    :goto_22
    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v19

    aget-object v19, v19, v4

    invoke-virtual/range {v19 .. v19}, Lm1/d;->h()Le1/i;

    move-result-object v19

    if-eqz v5, :cond_30

    invoke-virtual {v5}, Lm1/d;->k()I

    move-result v5

    add-int/2addr v3, v5

    :cond_30
    invoke-virtual {v8}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-virtual {v5}, Lm1/d;->k()I

    move-result v5

    add-int/2addr v0, v5

    if-eqz v1, :cond_28

    if-eqz v2, :cond_28

    if-eqz v7, :cond_28

    if-eqz v19, :cond_28

    invoke-static {v15, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_31

    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    :cond_31
    move v5, v0

    invoke-static {v15, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_32

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    move/from16 v20, v0

    goto :goto_23

    :cond_32
    move/from16 v20, v3

    :goto_23
    if-eqz v18, :cond_33

    move/from16 v23, v6

    goto :goto_24

    :cond_33
    const/16 v23, 0x5

    :goto_24
    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p2

    move v3, v5

    move-object v5, v7

    move v7, v6

    const/16 v21, 0x5

    move-object/from16 v6, v19

    move/from16 v7, v20

    move-object/from16 v19, v8

    move/from16 v8, v23

    invoke-virtual/range {v0 .. v8}, Le1/d;->g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V

    :goto_25
    invoke-virtual {v15}, Lm1/e;->A0()I

    move-result v0

    const/16 v8, 0x8

    if-eq v0, v8, :cond_34

    goto :goto_26

    :cond_34
    move-object/from16 v15, v19

    :goto_26
    move-object v8, v15

    move-object/from16 v15, v16

    goto/16 :goto_1b

    :cond_35
    const/16 v8, 0x8

    if-eqz v17, :cond_45

    if-eqz v13, :cond_45

    invoke-virtual/range {p5 .. p5}, Lm1/c;->o()I

    move-result v0

    if-lez v0, :cond_36

    invoke-virtual/range {p5 .. p5}, Lm1/c;->n()I

    move-result v0

    invoke-virtual/range {p5 .. p5}, Lm1/c;->o()I

    move-result v1

    if-ne v0, v1, :cond_36

    const/16 v18, 0x1

    goto :goto_27

    :cond_36
    move/from16 v18, v4

    :goto_27
    move-object v15, v13

    move-object/from16 v16, v15

    :goto_28
    if-eqz v15, :cond_42

    invoke-virtual {v15}, Lm1/e;->Z()[Lm1/e;

    move-result-object v0

    aget-object v0, v0, v10

    :goto_29
    if-eqz v0, :cond_37

    invoke-virtual {v0}, Lm1/e;->A0()I

    move-result v1

    if-ne v1, v8, :cond_37

    invoke-virtual {v0}, Lm1/e;->Z()[Lm1/e;

    move-result-object v0

    aget-object v0, v0, v10

    goto :goto_29

    :cond_37
    invoke-static {v15, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    invoke-static {v15, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_40

    if-eqz v0, :cond_40

    invoke-static {v0, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_38

    move-object/from16 v19, v22

    goto :goto_2a

    :cond_38
    move-object/from16 v19, v0

    :goto_2a
    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_39

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    :cond_39
    invoke-virtual/range {v16 .. v16}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    add-int/lit8 v3, p4, 0x1

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    aget-object v4, v4, v3

    invoke-virtual {v4}, Lm1/d;->k()I

    move-result v4

    if-eqz v19, :cond_3b

    invoke-virtual/range {v19 .. v19}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, p4

    invoke-virtual {v5}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    if-eqz v7, :cond_3a

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_2c

    :cond_3a
    move-object/from16 v7, v22

    goto :goto_2d

    :cond_3b
    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, p4

    if-eqz v5, :cond_3c

    invoke-virtual {v5}, Lm1/d;->h()Le1/i;

    move-result-object v6

    goto :goto_2b

    :cond_3c
    move-object/from16 v6, v22

    :goto_2b
    invoke-virtual {v15}, Lm1/e;->M()[Lm1/d;

    move-result-object v7

    aget-object v7, v7, v3

    :goto_2c
    invoke-virtual {v7}, Lm1/d;->h()Le1/i;

    move-result-object v7

    :goto_2d
    if-eqz v5, :cond_3d

    invoke-virtual {v5}, Lm1/d;->k()I

    move-result v5

    add-int/2addr v4, v5

    :cond_3d
    move/from16 v21, v4

    invoke-virtual/range {v16 .. v16}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    aget-object v3, v4, v3

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    add-int/2addr v3, v0

    if-eqz v18, :cond_3e

    move/from16 v23, v8

    goto :goto_2e

    :cond_3e
    const/16 v23, 0x4

    :goto_2e
    if-eqz v1, :cond_3f

    if-eqz v2, :cond_3f

    if-eqz v6, :cond_3f

    if-eqz v7, :cond_3f

    const/high16 v4, 0x3f000000    # 0.5f

    move-object/from16 v0, p2

    const/16 v20, 0x4

    move-object v5, v6

    move-object v6, v7

    move/from16 v7, v21

    move v10, v8

    move/from16 v8, v23

    invoke-virtual/range {v0 .. v8}, Le1/d;->g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V

    goto :goto_2f

    :cond_3f
    move v10, v8

    const/16 v20, 0x4

    :goto_2f
    move-object/from16 v0, v19

    goto :goto_30

    :cond_40
    move v10, v8

    const/16 v20, 0x4

    :goto_30
    invoke-virtual {v15}, Lm1/e;->A0()I

    move-result v1

    if-eq v1, v10, :cond_41

    move-object/from16 v16, v15

    :cond_41
    move-object v15, v0

    move v8, v10

    move/from16 v10, p3

    goto/16 :goto_28

    :cond_42
    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, p4

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    add-int/lit8 v3, p4, 0x1

    aget-object v10, v2, v3

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v2

    aget-object v2, v2, v3

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v11

    const/4 v15, 0x5

    if-eqz v1, :cond_44

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    invoke-virtual {v9, v2, v1, v0, v15}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    goto :goto_31

    :cond_43
    if-eqz v11, :cond_44

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v4

    invoke-virtual {v10}, Lm1/d;->h()Le1/i;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v7

    const/high16 v8, 0x3f000000    # 0.5f

    move-object/from16 v0, p2

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v8

    move v8, v15

    invoke-virtual/range {v0 .. v8}, Le1/d;->g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V

    :cond_44
    :goto_31
    if-eqz v11, :cond_45

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    invoke-virtual {v10}, Lm1/d;->h()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/d;->h()Le1/i;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lm1/d;->k()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {v9, v0, v1, v2, v15}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    :cond_45
    :goto_32
    if-nez v27, :cond_46

    if-eqz v17, :cond_4d

    :cond_46
    if-eqz v13, :cond_4d

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4d

    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    if-nez v14, :cond_47

    move-object v14, v13

    :cond_47
    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    add-int/lit8 v2, p4, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-eqz v3, :cond_48

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/d;->h()Le1/i;

    move-result-object v3

    goto :goto_33

    :cond_48
    move-object/from16 v3, v22

    :goto_33
    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-eqz v4, :cond_49

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm1/d;->h()Le1/i;

    move-result-object v4

    goto :goto_34

    :cond_49
    move-object/from16 v4, v22

    :goto_34
    invoke-static {v12, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4b

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lm1/e;->M()[Lm1/d;

    move-result-object v4

    aget-object v4, v4, v2

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-eqz v5, :cond_4a

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm1/d;->h()Le1/i;

    move-result-object v22

    :cond_4a
    move-object/from16 v5, v22

    goto :goto_35

    :cond_4b
    move-object v5, v4

    :goto_35
    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4c

    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v0

    aget-object v0, v0, p4

    invoke-virtual {v13}, Lm1/e;->M()[Lm1/d;

    move-result-object v1

    aget-object v1, v1, v2

    :cond_4c
    if-eqz v3, :cond_4d

    if-eqz v5, :cond_4d

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v4

    invoke-virtual {v14}, Lm1/e;->M()[Lm1/d;

    move-result-object v6

    aget-object v2, v6, v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v7

    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->h()Le1/i;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v8, 0x5

    const/high16 v10, 0x3f000000    # 0.5f

    move-object/from16 v0, p2

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    move v4, v10

    invoke-virtual/range {v0 .. v8}, Le1/d;->g(Le1/i;Le1/i;IFLe1/i;Le1/i;II)V

    :cond_4d
    return-void
.end method

.method public final b(Lm1/f;Le1/d;Ljava/util/ArrayList;I)V
    .locals 10

    .prologue
    const-string v0, "constraintWidgetContainer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p4, :cond_0

    invoke-virtual {p1}, Lm1/f;->x2()I

    move-result v1

    invoke-virtual {p1}, Lm1/f;->w2()[Lm1/c;

    move-result-object v2

    move v9, v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm1/f;->D2()I

    move-result v1

    invoke-virtual {p1}, Lm1/f;->C2()[Lm1/c;

    move-result-object v2

    const/4 v3, 0x2

    move v9, v3

    :goto_0
    if-ge v0, v1, :cond_3

    aget-object v8, v2, v0

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v8}, Lm1/c;->a()V

    if-eqz p3, :cond_1

    invoke-virtual {v8}, Lm1/c;->c()Lm1/e;

    move-result-object v3

    invoke-static {p3, v3}, Lj7/v;->Z(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p4

    move v7, v9

    invoke-virtual/range {v3 .. v8}, Lm1/b$a;->a(Lm1/f;Le1/d;IILm1/c;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
