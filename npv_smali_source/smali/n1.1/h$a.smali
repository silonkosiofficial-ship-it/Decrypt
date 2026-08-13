.class public final Ln1/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/h;
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

    invoke-direct {p0}, Ln1/h$a;-><init>()V

    return-void
.end method

.method private final a(ILm1/e;)Z
    .locals 7

    .prologue
    invoke-virtual {p2}, Lm1/e;->A()Lm1/e$b;

    move-result-object p1

    invoke-virtual {p2}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v0

    invoke-virtual {p2}, Lm1/e;->o0()Lm1/e;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lm1/e;->o0()Lm1/e;

    move-result-object v1

    check-cast v1, Lm1/f;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v2

    sget-object v3, Lm1/e$b;->C:Lm1/e$b;

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v1

    sget-object v2, Lm1/e$b;->C:Lm1/e$b;

    :cond_2
    sget-object v1, Lm1/e$b;->C:Lm1/e$b;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq p1, v1, :cond_5

    invoke-virtual {p2}, Lm1/e;->Q0()Z

    move-result v5

    if-nez v5, :cond_5

    sget-object v5, Lm1/e$b;->D:Lm1/e$b;

    if-eq p1, v5, :cond_5

    sget-object v5, Lm1/e$b;->E:Lm1/e$b;

    if-ne p1, v5, :cond_3

    invoke-virtual {p2}, Lm1/e;->Q()I

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result v6

    cmpg-float v6, v6, v2

    if-nez v6, :cond_3

    invoke-virtual {p2, v3}, Lm1/e;->E0(I)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_3
    if-ne p1, v5, :cond_4

    invoke-virtual {p2}, Lm1/e;->Q()I

    move-result p1

    if-ne p1, v4, :cond_4

    invoke-virtual {p2}, Lm1/e;->B0()I

    move-result p1

    invoke-virtual {p2, v3, p1}, Lm1/e;->H0(II)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_1

    :cond_4
    move p1, v3

    goto :goto_2

    :cond_5
    :goto_1
    move p1, v4

    :goto_2
    if-eq v0, v1, :cond_8

    invoke-virtual {p2}, Lm1/e;->R0()Z

    move-result v1

    if-nez v1, :cond_8

    sget-object v1, Lm1/e$b;->D:Lm1/e$b;

    if-eq v0, v1, :cond_8

    sget-object v1, Lm1/e$b;->E:Lm1/e$b;

    if-ne v0, v1, :cond_6

    invoke-virtual {p2}, Lm1/e;->P()I

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result v5

    cmpg-float v5, v5, v2

    if-nez v5, :cond_6

    invoke-virtual {p2, v4}, Lm1/e;->E0(I)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_6
    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lm1/e;->P()I

    move-result v0

    if-ne v0, v4, :cond_7

    invoke-virtual {p2}, Lm1/e;->w()I

    move-result v0

    invoke-virtual {p2, v4, v0}, Lm1/e;->H0(II)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    move v0, v3

    goto :goto_4

    :cond_8
    :goto_3
    move v0, v4

    :goto_4
    invoke-virtual {p2}, Lm1/e;->I()F

    move-result p2

    cmpl-float p2, p2, v2

    if-lez p2, :cond_a

    if-nez p1, :cond_9

    if-eqz v0, :cond_a

    :cond_9
    return v4

    :cond_a
    if-eqz p1, :cond_b

    if-eqz v0, :cond_b

    move v3, v4

    :cond_b
    return v3
.end method

.method private final b(ILm1/e;Ln1/b$c;Z)V
    .locals 24

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p4

    invoke-virtual/range {p2 .. p2}, Lm1/e;->K0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ln1/h;->a()I

    move-result v0

    const/4 v10, 0x1

    add-int/2addr v0, v10

    invoke-static {v0}, Ln1/h;->d(I)V

    instance-of v0, v7, Lm1/f;

    if-nez v0, :cond_1

    invoke-virtual/range {p2 .. p2}, Lm1/e;->P0()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 v1, p1, 0x1

    invoke-direct {v6, v1, v7}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v4, Ln1/b$b;

    invoke-direct {v4}, Ln1/b$b;-><init>()V

    sget-object v0, Lm1/f;->h1:Lm1/f$a;

    sget-object v2, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v2}, Ln1/b$b$a;->a()I

    move-result v5

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-virtual/range {v0 .. v5}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    :cond_1
    sget-object v0, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {v7, v0}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v0

    sget-object v1, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {v7, v1}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v11

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->e()I

    move-result v12

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/d;->e()I

    move-result v13

    invoke-virtual {v0}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v1

    const/4 v14, 0x0

    const/16 v15, 0x8

    const/16 v16, 0x0

    const-string v5, "next(...)"

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Lm1/d;->s()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-virtual {v0}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_0
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v0

    check-cast v4, Lm1/d;

    invoke-virtual {v4}, Lm1/d;->g()Lm1/e;

    move-result-object v3

    add-int/lit8 v2, p1, 0x1

    invoke-direct {v6, v2, v3}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v18

    invoke-virtual {v3}, Lm1/e;->P0()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v18, :cond_2

    new-instance v19, Ln1/b$b;

    invoke-direct/range {v19 .. v19}, Ln1/b$b;-><init>()V

    sget-object v0, Lm1/f;->h1:Lm1/f$a;

    sget-object v1, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v1}, Ln1/b$b$a;->a()I

    move-result v20

    move v1, v2

    move/from16 v21, v2

    move-object v2, v3

    move-object/from16 v22, v3

    move-object/from16 v3, p3

    move-object v10, v4

    move-object/from16 v4, v19

    move-object/from16 v23, v5

    move/from16 v5, v20

    invoke-virtual/range {v0 .. v5}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    goto :goto_1

    :cond_2
    move/from16 v21, v2

    move-object/from16 v22, v3

    move-object v10, v4

    move-object/from16 v23, v5

    :goto_1
    invoke-virtual/range {v22 .. v22}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-static {v10, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {v22 .. v22}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual/range {v22 .. v22}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->s()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    invoke-virtual/range {v22 .. v22}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-static {v10, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual/range {v22 .. v22}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual/range {v22 .. v22}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->s()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    move/from16 v0, v16

    :goto_2
    invoke-virtual/range {v22 .. v22}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v1, v2, :cond_9

    if-eqz v18, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual/range {v22 .. v22}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    if-ne v1, v2, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->S()I

    move-result v1

    if-ltz v1, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->U()I

    move-result v1

    if-ltz v1, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->A0()I

    move-result v1

    if-eq v1, v15, :cond_8

    invoke-virtual/range {v22 .. v22}, Lm1/e;->Q()I

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->s()F

    move-result v1

    cmpg-float v1, v1, v14

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    move-object/from16 v5, v23

    const/4 v10, 0x1

    goto/16 :goto_0

    :cond_8
    :goto_4
    invoke-virtual/range {v22 .. v22}, Lm1/e;->M0()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->O0()Z

    move-result v1

    if-nez v1, :cond_7

    if-eqz v0, :cond_7

    invoke-virtual/range {v22 .. v22}, Lm1/e;->M0()Z

    move-result v0

    if-nez v0, :cond_7

    move-object/from16 v0, p0

    move/from16 v1, v21

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, v22

    move/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Ln1/h$a;->f(ILm1/e;Ln1/b$c;Lm1/e;Z)V

    goto :goto_3

    :cond_9
    :goto_5
    invoke-virtual/range {v22 .. v22}, Lm1/e;->P0()Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual/range {v22 .. v22}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-static {v10, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual/range {v22 .. v22}, Lm1/e;->b0()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    if-nez v1, :cond_b

    invoke-virtual/range {v22 .. v22}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    add-int/2addr v0, v12

    invoke-virtual/range {v22 .. v22}, Lm1/e;->B0()I

    move-result v1

    add-int/2addr v1, v0

    move-object/from16 v2, v22

    invoke-virtual {v2, v0, v1}, Lm1/e;->g1(II)V

    move/from16 v1, v21

    :goto_6
    invoke-direct {v6, v1, v2, v8, v9}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_3

    :cond_b
    move/from16 v1, v21

    move-object/from16 v2, v22

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v3

    invoke-static {v10, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-nez v3, :cond_c

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    sub-int v0, v12, v0

    invoke-virtual {v2}, Lm1/e;->B0()I

    move-result v3

    sub-int v3, v0, v3

    invoke-virtual {v2, v3, v0}, Lm1/e;->g1(II)V

    goto :goto_6

    :cond_c
    if-eqz v0, :cond_7

    invoke-virtual {v2}, Lm1/e;->M0()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-direct {v6, v1, v8, v2, v9}, Ln1/h$a;->e(ILn1/b$c;Lm1/e;Z)V

    goto/16 :goto_3

    :cond_d
    move-object/from16 v23, v5

    instance-of v0, v7, Lm1/h;

    if-eqz v0, :cond_e

    return-void

    :cond_e
    invoke-virtual {v11}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-virtual {v11}, Lm1/d;->s()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {v11}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v11, v23

    invoke-static {v0, v11}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v0

    check-cast v12, Lm1/d;

    invoke-virtual {v12}, Lm1/d;->g()Lm1/e;

    move-result-object v5

    const/16 v17, 0x1

    add-int/lit8 v4, p1, 0x1

    invoke-direct {v6, v4, v5}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v18

    invoke-virtual {v5}, Lm1/e;->P0()Z

    move-result v0

    if-eqz v0, :cond_f

    if-eqz v18, :cond_f

    new-instance v19, Ln1/b$b;

    invoke-direct/range {v19 .. v19}, Ln1/b$b;-><init>()V

    sget-object v0, Lm1/f;->h1:Lm1/f$a;

    sget-object v1, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v1}, Ln1/b$b$a;->a()I

    move-result v20

    move v1, v4

    move-object v2, v5

    move-object/from16 v3, p3

    move/from16 v21, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v5

    move/from16 v5, v20

    invoke-virtual/range {v0 .. v5}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    goto :goto_8

    :cond_f
    move/from16 v21, v4

    move-object/from16 v19, v5

    :goto_8
    invoke-virtual/range {v19 .. v19}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-static {v12, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual/range {v19 .. v19}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual/range {v19 .. v19}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->s()Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    invoke-virtual/range {v19 .. v19}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-static {v12, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual/range {v19 .. v19}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual/range {v19 .. v19}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->i()Lm1/d;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/d;->s()Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_11
    move/from16 v0, v17

    goto :goto_9

    :cond_12
    move/from16 v0, v16

    :goto_9
    invoke-virtual/range {v19 .. v19}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    sget-object v2, Lm1/e$b;->E:Lm1/e$b;

    if-ne v1, v2, :cond_16

    if-eqz v18, :cond_13

    goto :goto_c

    :cond_13
    invoke-virtual/range {v19 .. v19}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    if-ne v1, v2, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->S()I

    move-result v1

    if-ltz v1, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->U()I

    move-result v1

    if-ltz v1, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->A0()I

    move-result v1

    if-eq v1, v15, :cond_15

    invoke-virtual/range {v19 .. v19}, Lm1/e;->Q()I

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->s()F

    move-result v1

    cmpg-float v1, v1, v14

    if-nez v1, :cond_14

    goto :goto_b

    :cond_14
    :goto_a
    move-object/from16 v23, v11

    goto/16 :goto_7

    :cond_15
    :goto_b
    invoke-virtual/range {v19 .. v19}, Lm1/e;->M0()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->O0()Z

    move-result v1

    if-nez v1, :cond_14

    if-eqz v0, :cond_14

    invoke-virtual/range {v19 .. v19}, Lm1/e;->M0()Z

    move-result v0

    if-nez v0, :cond_14

    move-object/from16 v0, p0

    move/from16 v1, v21

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, v19

    move/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Ln1/h$a;->f(ILm1/e;Ln1/b$c;Lm1/e;Z)V

    goto :goto_a

    :cond_16
    :goto_c
    invoke-virtual/range {v19 .. v19}, Lm1/e;->P0()Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_a

    :cond_17
    invoke-virtual/range {v19 .. v19}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-static {v12, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-virtual/range {v19 .. v19}, Lm1/e;->b0()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    if-nez v1, :cond_18

    invoke-virtual/range {v19 .. v19}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    add-int/2addr v0, v13

    invoke-virtual/range {v19 .. v19}, Lm1/e;->B0()I

    move-result v1

    add-int/2addr v1, v0

    move-object/from16 v2, v19

    invoke-virtual {v2, v0, v1}, Lm1/e;->g1(II)V

    move/from16 v1, v21

    :goto_d
    invoke-direct {v6, v1, v2, v8, v9}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_a

    :cond_18
    move-object/from16 v2, v19

    move/from16 v1, v21

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v3

    invoke-static {v12, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->i()Lm1/d;

    move-result-object v3

    if-nez v3, :cond_19

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0}, Lm1/d;->k()I

    move-result v0

    sub-int v0, v13, v0

    invoke-virtual {v2}, Lm1/e;->B0()I

    move-result v3

    sub-int v3, v0, v3

    invoke-virtual {v2, v3, v0}, Lm1/e;->g1(II)V

    goto :goto_d

    :cond_19
    if-eqz v0, :cond_14

    invoke-virtual {v2}, Lm1/e;->M0()Z

    move-result v0

    if-nez v0, :cond_14

    invoke-direct {v6, v1, v8, v2, v9}, Ln1/h$a;->e(ILn1/b$c;Lm1/e;Z)V

    goto/16 :goto_a

    :cond_1a
    invoke-virtual/range {p2 .. p2}, Lm1/e;->T0()V

    return-void
.end method

.method private final d(ILm1/a;Ln1/b$c;IZ)V
    .locals 1

    .prologue
    invoke-virtual {p2}, Lm1/a;->f2()Z

    move-result v0

    if-eqz v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    if-nez p4, :cond_0

    invoke-direct {p0, p1, p2, p3, p5}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private final e(ILn1/b$c;Lm1/e;Z)V
    .locals 6

    .prologue
    invoke-virtual {p3}, Lm1/e;->x()F

    move-result v0

    invoke-virtual {p3}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    invoke-virtual {p3}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v2

    invoke-virtual {p3}, Lm1/e;->L()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p3}, Lm1/e;->b0()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->k()I

    move-result v4

    sub-int v4, v2, v4

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v1, v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v1, v3

    move v2, v4

    :goto_0
    invoke-virtual {p3}, Lm1/e;->B0()I

    move-result v3

    sub-int v4, v2, v1

    sub-int/2addr v4, v3

    if-le v1, v2, :cond_1

    sub-int v4, v1, v2

    sub-int/2addr v4, v3

    :cond_1
    if-lez v4, :cond_2

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float/2addr v0, v5

    :goto_1
    float-to-int v0, v0

    goto :goto_2

    :cond_2
    int-to-float v4, v4

    mul-float/2addr v0, v4

    goto :goto_1

    :goto_2
    add-int/2addr v0, v1

    add-int v4, v0, v3

    if-le v1, v2, :cond_3

    sub-int v4, v0, v3

    :cond_3
    invoke-virtual {p3, v0, v4}, Lm1/e;->g1(II)V

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1, p3, p2, p4}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    return-void
.end method

.method private final f(ILm1/e;Ln1/b$c;Lm1/e;Z)V
    .locals 7

    .prologue
    invoke-virtual {p4}, Lm1/e;->x()F

    move-result v0

    invoke-virtual {p4}, Lm1/e;->L()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    invoke-virtual {p4}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p4}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v2

    invoke-virtual {p4}, Lm1/e;->b0()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v1, :cond_5

    invoke-virtual {p4}, Lm1/e;->B0()I

    move-result v3

    invoke-virtual {p4}, Lm1/e;->A0()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_4

    invoke-virtual {p4}, Lm1/e;->Q()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    instance-of v3, p2, Lm1/f;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lm1/f;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lm1/e;->B0()I

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->B0()I

    move-result p2

    :goto_1
    invoke-virtual {p4}, Lm1/e;->x()F

    move-result v3

    mul-float/2addr v3, v6

    int-to-float p2, p2

    mul-float/2addr v3, p2

    float-to-int v3, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p4}, Lm1/e;->Q()I

    move-result p2

    if-nez p2, :cond_3

    sub-int v3, v2, v1

    :cond_3
    :goto_2
    invoke-virtual {p4}, Lm1/e;->U()I

    move-result p2

    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p4}, Lm1/e;->S()I

    move-result p2

    if-lez p2, :cond_4

    invoke-virtual {p4}, Lm1/e;->S()I

    move-result p2

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_4
    sub-int/2addr v2, v1

    sub-int/2addr v2, v3

    int-to-float p2, v2

    mul-float/2addr v0, p2

    add-float/2addr v0, v6

    float-to-int p2, v0

    add-int/2addr v1, p2

    add-int/2addr v3, v1

    invoke-virtual {p4, v1, v3}, Lm1/e;->g1(II)V

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1, p4, p3, p5}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    :cond_5
    return-void
.end method

.method private final g(ILn1/b$c;Lm1/e;)V
    .locals 6

    .prologue
    invoke-virtual {p3}, Lm1/e;->v0()F

    move-result v0

    invoke-virtual {p3}, Lm1/e;->c0()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    invoke-virtual {p3}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v2

    invoke-virtual {p3}, Lm1/e;->c0()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    add-int/2addr v3, v1

    invoke-virtual {p3}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->k()I

    move-result v4

    sub-int v4, v2, v4

    const/high16 v5, 0x3f000000    # 0.5f

    if-ne v1, v2, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v1, v3

    move v2, v4

    :goto_0
    invoke-virtual {p3}, Lm1/e;->w()I

    move-result v3

    sub-int v4, v2, v1

    sub-int/2addr v4, v3

    if-le v1, v2, :cond_1

    sub-int v4, v1, v2

    sub-int/2addr v4, v3

    :cond_1
    if-lez v4, :cond_2

    int-to-float v4, v4

    mul-float/2addr v0, v4

    add-float/2addr v0, v5

    :goto_1
    float-to-int v0, v0

    goto :goto_2

    :cond_2
    int-to-float v4, v4

    mul-float/2addr v0, v4

    goto :goto_1

    :goto_2
    add-int v4, v1, v0

    add-int v5, v4, v3

    if-le v1, v2, :cond_3

    sub-int v4, v1, v0

    sub-int v5, v4, v3

    :cond_3
    invoke-virtual {p3, v4, v5}, Lm1/e;->j1(II)V

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1, p3, p2}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    return-void
.end method

.method private final h(ILm1/e;Ln1/b$c;Lm1/e;)V
    .locals 7

    .prologue
    invoke-virtual {p4}, Lm1/e;->v0()F

    move-result v0

    invoke-virtual {p4}, Lm1/e;->c0()Lm1/d;

    move-result-object v1

    invoke-virtual {v1}, Lm1/d;->i()Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->e()I

    move-result v1

    invoke-virtual {p4}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {p4}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v2

    invoke-virtual {p4}, Lm1/e;->G()Lm1/d;

    move-result-object v3

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v2, v1, :cond_5

    invoke-virtual {p4}, Lm1/e;->w()I

    move-result v3

    invoke-virtual {p4}, Lm1/e;->A0()I

    move-result v4

    const/16 v5, 0x8

    const/high16 v6, 0x3f000000    # 0.5f

    if-eq v4, v5, :cond_4

    invoke-virtual {p4}, Lm1/e;->P()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_2

    instance-of v3, p2, Lm1/f;

    if-eqz v3, :cond_0

    move-object v3, p2

    check-cast v3, Lm1/f;

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lm1/e;->w()I

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lm1/e;->o0()Lm1/e;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lm1/e;->w()I

    move-result p2

    :goto_1
    mul-float v3, v0, v6

    int-to-float p2, p2

    mul-float/2addr v3, p2

    float-to-int v3, v3

    goto :goto_2

    :cond_2
    invoke-virtual {p4}, Lm1/e;->P()I

    move-result p2

    if-nez p2, :cond_3

    sub-int v3, v2, v1

    :cond_3
    :goto_2
    invoke-virtual {p4}, Lm1/e;->T()I

    move-result p2

    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {p4}, Lm1/e;->R()I

    move-result p2

    if-lez p2, :cond_4

    invoke-virtual {p4}, Lm1/e;->R()I

    move-result p2

    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_4
    sub-int/2addr v2, v1

    sub-int/2addr v2, v3

    int-to-float p2, v2

    mul-float/2addr v0, p2

    add-float/2addr v0, v6

    float-to-int p2, v0

    add-int/2addr v1, p2

    add-int/2addr v3, v1

    invoke-virtual {p4, v1, v3}, Lm1/e;->j1(II)V

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1, p4, p3}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    :cond_5
    return-void
.end method

.method private final j(ILm1/e;Ln1/b$c;)V
    .locals 23

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    invoke-virtual/range {p2 .. p2}, Lm1/e;->S0()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ln1/h;->c()I

    move-result v2

    const/4 v9, 0x1

    add-int/2addr v2, v9

    invoke-static {v2}, Ln1/h;->e(I)V

    instance-of v2, v0, Lm1/f;

    if-nez v2, :cond_1

    invoke-virtual/range {p2 .. p2}, Lm1/e;->P0()Z

    move-result v2

    if-eqz v2, :cond_1

    add-int/lit8 v3, p1, 0x1

    invoke-direct {v1, v3, v0}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v6, Ln1/b$b;

    invoke-direct {v6}, Ln1/b$b;-><init>()V

    sget-object v2, Lm1/f;->h1:Lm1/f$a;

    sget-object v4, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v4}, Ln1/b$b$a;->a()I

    move-result v7

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-virtual/range {v2 .. v7}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    :cond_1
    sget-object v2, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {v0, v2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v2

    sget-object v3, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {v0, v3}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v10

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v11

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10}, Lm1/d;->e()I

    move-result v12

    invoke-virtual {v2}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v3

    const/4 v13, 0x0

    const/16 v14, 0x8

    const-string v7, "next(...)"

    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v2

    check-cast v6, Lm1/d;

    invoke-virtual {v6}, Lm1/d;->g()Lm1/e;

    move-result-object v5

    add-int/lit8 v4, p1, 0x1

    invoke-direct {v1, v4, v5}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v17

    invoke-virtual {v5}, Lm1/e;->P0()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v17, :cond_2

    new-instance v18, Ln1/b$b;

    invoke-direct/range {v18 .. v18}, Ln1/b$b;-><init>()V

    sget-object v2, Lm1/f;->h1:Lm1/f$a;

    sget-object v3, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v3}, Ln1/b$b$a;->a()I

    move-result v19

    move v3, v4

    move v15, v4

    move-object v4, v5

    move-object/from16 v20, v5

    move-object/from16 v5, p3

    move-object v9, v6

    move-object/from16 v6, v18

    move-object/from16 v21, v7

    move/from16 v7, v19

    invoke-virtual/range {v2 .. v7}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    goto :goto_1

    :cond_2
    move v15, v4

    move-object/from16 v20, v5

    move-object v9, v6

    move-object/from16 v21, v7

    :goto_1
    invoke-virtual/range {v20 .. v20}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-static {v9, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {v20 .. v20}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual/range {v20 .. v20}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    invoke-virtual/range {v20 .. v20}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-static {v9, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {v20 .. v20}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual/range {v20 .. v20}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    const/4 v2, 0x1

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    invoke-virtual/range {v20 .. v20}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v4, :cond_6

    if-eqz v17, :cond_7

    :cond_6
    move-object/from16 v3, v20

    goto :goto_5

    :cond_7
    invoke-virtual/range {v20 .. v20}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    if-ne v3, v4, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->R()I

    move-result v3

    if-ltz v3, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->T()I

    move-result v3

    if-ltz v3, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->A0()I

    move-result v3

    if-eq v3, v14, :cond_9

    invoke-virtual/range {v20 .. v20}, Lm1/e;->P()I

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->s()F

    move-result v3

    cmpg-float v3, v3, v13

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    move-object/from16 v7, v21

    const/4 v9, 0x1

    goto/16 :goto_0

    :cond_9
    :goto_4
    invoke-virtual/range {v20 .. v20}, Lm1/e;->N0()Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->O0()Z

    move-result v3

    if-nez v3, :cond_8

    if-eqz v2, :cond_8

    invoke-virtual/range {v20 .. v20}, Lm1/e;->N0()Z

    move-result v2

    if-nez v2, :cond_8

    move-object/from16 v3, v20

    invoke-direct {v1, v15, v0, v8, v3}, Ln1/h$a;->h(ILm1/e;Ln1/b$c;Lm1/e;)V

    goto :goto_3

    :goto_5
    invoke-virtual {v3}, Lm1/e;->P0()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {v3}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-static {v9, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-virtual {v3}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-nez v4, :cond_b

    invoke-virtual {v3}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    add-int/2addr v2, v11

    invoke-virtual {v3}, Lm1/e;->w()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v3, v2, v4}, Lm1/e;->j1(II)V

    :goto_6
    invoke-direct {v1, v15, v3, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    goto :goto_3

    :cond_b
    invoke-virtual {v3}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    invoke-static {v9, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-virtual {v3}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-nez v4, :cond_c

    invoke-virtual {v3}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    sub-int v2, v11, v2

    invoke-virtual {v3}, Lm1/e;->w()I

    move-result v4

    sub-int v4, v2, v4

    invoke-virtual {v3, v4, v2}, Lm1/e;->j1(II)V

    goto :goto_6

    :cond_c
    if-eqz v2, :cond_8

    invoke-virtual {v3}, Lm1/e;->N0()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-direct {v1, v15, v8, v3}, Ln1/h$a;->g(ILn1/b$c;Lm1/e;)V

    goto/16 :goto_3

    :cond_d
    move-object/from16 v21, v7

    instance-of v2, v0, Lm1/h;

    if-eqz v2, :cond_e

    return-void

    :cond_e
    invoke-virtual {v10}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-virtual {v10}, Lm1/d;->s()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v10}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v10, v21

    invoke-static {v2, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v2

    check-cast v11, Lm1/d;

    invoke-virtual {v11}, Lm1/d;->g()Lm1/e;

    move-result-object v15

    add-int/lit8 v7, p1, 0x1

    invoke-direct {v1, v7, v15}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v16

    invoke-virtual {v15}, Lm1/e;->P0()Z

    move-result v2

    if-eqz v2, :cond_f

    if-eqz v16, :cond_f

    new-instance v6, Ln1/b$b;

    invoke-direct {v6}, Ln1/b$b;-><init>()V

    sget-object v2, Lm1/f;->h1:Lm1/f$a;

    sget-object v3, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v3}, Ln1/b$b$a;->a()I

    move-result v17

    move v3, v7

    move-object v4, v15

    move-object/from16 v5, p3

    move/from16 v22, v7

    move/from16 v7, v17

    invoke-virtual/range {v2 .. v7}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    goto :goto_8

    :cond_f
    move/from16 v22, v7

    :goto_8
    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-static {v11, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-static {v11, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->i()Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_11
    const/4 v2, 0x1

    goto :goto_9

    :cond_12
    const/4 v2, 0x0

    :goto_9
    invoke-virtual {v15}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-ne v3, v4, :cond_13

    if-eqz v16, :cond_14

    :cond_13
    move/from16 v3, v22

    goto :goto_c

    :cond_14
    invoke-virtual {v15}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    if-ne v3, v4, :cond_15

    invoke-virtual {v15}, Lm1/e;->R()I

    move-result v3

    if-ltz v3, :cond_15

    invoke-virtual {v15}, Lm1/e;->T()I

    move-result v3

    if-ltz v3, :cond_15

    invoke-virtual {v15}, Lm1/e;->A0()I

    move-result v3

    if-eq v3, v14, :cond_16

    invoke-virtual {v15}, Lm1/e;->P()I

    move-result v3

    if-nez v3, :cond_15

    invoke-virtual {v15}, Lm1/e;->s()F

    move-result v3

    cmpg-float v3, v3, v13

    if-nez v3, :cond_15

    goto :goto_b

    :cond_15
    :goto_a
    move-object/from16 v21, v10

    goto/16 :goto_7

    :cond_16
    :goto_b
    invoke-virtual {v15}, Lm1/e;->N0()Z

    move-result v3

    if-nez v3, :cond_15

    invoke-virtual {v15}, Lm1/e;->O0()Z

    move-result v3

    if-nez v3, :cond_15

    if-eqz v2, :cond_15

    invoke-virtual {v15}, Lm1/e;->N0()Z

    move-result v2

    if-nez v2, :cond_15

    move/from16 v3, v22

    invoke-direct {v1, v3, v0, v8, v15}, Ln1/h$a;->h(ILm1/e;Ln1/b$c;Lm1/e;)V

    goto :goto_a

    :goto_c
    invoke-virtual {v15}, Lm1/e;->P0()Z

    move-result v4

    if-eqz v4, :cond_17

    goto :goto_a

    :cond_17
    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-static {v11, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-nez v4, :cond_18

    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    add-int/2addr v2, v12

    invoke-virtual {v15}, Lm1/e;->w()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v15, v2, v4}, Lm1/e;->j1(II)V

    :goto_d
    invoke-direct {v1, v3, v15, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    goto :goto_a

    :cond_18
    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v4

    invoke-static {v11, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v4

    invoke-virtual {v4}, Lm1/d;->i()Lm1/d;

    move-result-object v4

    if-nez v4, :cond_19

    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->k()I

    move-result v2

    sub-int v2, v12, v2

    invoke-virtual {v15}, Lm1/e;->w()I

    move-result v4

    sub-int v4, v2, v4

    invoke-virtual {v15, v4, v2}, Lm1/e;->j1(II)V

    goto :goto_d

    :cond_19
    if-eqz v2, :cond_15

    invoke-virtual {v15}, Lm1/e;->N0()Z

    move-result v2

    if-nez v2, :cond_15

    invoke-direct {v1, v3, v8, v15}, Ln1/h$a;->g(ILn1/b$c;Lm1/e;)V

    goto/16 :goto_a

    :cond_1a
    move-object/from16 v10, v21

    sget-object v2, Lm1/d$b;->H:Lm1/d$b;

    invoke-virtual {v0, v2}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v3

    if-eqz v3, :cond_1f

    invoke-virtual {v2}, Lm1/d;->s()Z

    move-result v3

    if-eqz v3, :cond_1f

    invoke-virtual {v2}, Lm1/d;->e()I

    move-result v9

    invoke-virtual {v2}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_1b
    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v10}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v2

    check-cast v12, Lm1/d;

    invoke-virtual {v12}, Lm1/d;->g()Lm1/e;

    move-result-object v13

    const/4 v14, 0x1

    add-int/lit8 v15, p1, 0x1

    invoke-direct {v1, v15, v13}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v16

    invoke-virtual {v13}, Lm1/e;->P0()Z

    move-result v2

    if-eqz v2, :cond_1c

    if-eqz v16, :cond_1c

    new-instance v6, Ln1/b$b;

    invoke-direct {v6}, Ln1/b$b;-><init>()V

    sget-object v2, Lm1/f;->h1:Lm1/f$a;

    sget-object v3, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v3}, Ln1/b$b$a;->a()I

    move-result v7

    move v3, v15

    move-object v4, v13

    move-object/from16 v5, p3

    invoke-virtual/range {v2 .. v7}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    :cond_1c
    invoke-virtual {v13}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v2

    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v3, :cond_1d

    if-eqz v16, :cond_1b

    :cond_1d
    invoke-virtual {v13}, Lm1/e;->P0()Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_e

    :cond_1e
    invoke-virtual {v13}, Lm1/e;->F()Lm1/d;

    move-result-object v2

    invoke-static {v12, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {v12}, Lm1/d;->k()I

    move-result v2

    add-int/2addr v2, v9

    invoke-virtual {v13, v2}, Lm1/e;->f1(I)V

    :try_start_0
    invoke-direct {v1, v15, v13, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_e

    :catchall_0
    move-exception v0

    move-object v2, v0

    throw v2

    :cond_1f
    invoke-virtual/range {p2 .. p2}, Lm1/e;->U0()V

    return-void
.end method


# virtual methods
.method public final c(I)Ljava/lang/String;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "+-("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final i(Lm1/f;Ln1/b$c;)V
    .locals 17

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    const-string v0, "layout"

    invoke-static {v7, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v9

    const/4 v10, 0x0

    invoke-static {v10}, Ln1/h;->d(I)V

    invoke-static {v10}, Ln1/h;->e(I)V

    invoke-virtual/range {p1 .. p1}, Lm1/e;->Y0()V

    invoke-virtual/range {p1 .. p1}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    move v1, v10

    :goto_0
    const-string v13, "get(...)"

    if-ge v1, v12, :cond_0

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->Y0()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lm1/f;->J2()Z

    move-result v14

    sget-object v1, Lm1/e$b;->C:Lm1/e$b;

    if-ne v0, v1, :cond_1

    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v0

    invoke-virtual {v7, v10, v0}, Lm1/e;->g1(II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v10}, Lm1/e;->h1(I)V

    :goto_1
    move v0, v10

    move v1, v0

    move v2, v1

    :goto_2
    const/high16 v15, 0x3f000000    # 0.5f

    const/4 v5, -0x1

    const/4 v4, 0x1

    if-ge v0, v12, :cond_7

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm1/e;

    instance-of v10, v3, Lm1/h;

    if-eqz v10, :cond_5

    check-cast v3, Lm1/h;

    invoke-virtual {v3}, Lm1/h;->b2()I

    move-result v10

    if-ne v10, v4, :cond_6

    invoke-virtual {v3}, Lm1/h;->c2()I

    move-result v1

    if-eq v1, v5, :cond_2

    invoke-virtual {v3}, Lm1/h;->c2()I

    move-result v1

    :goto_3
    invoke-virtual {v3, v1}, Lm1/h;->f2(I)V

    goto :goto_4

    :cond_2
    invoke-virtual {v3}, Lm1/h;->d2()I

    move-result v1

    if-eq v1, v5, :cond_3

    invoke-virtual/range {p1 .. p1}, Lm1/e;->Q0()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v1

    invoke-virtual {v3}, Lm1/h;->d2()I

    move-result v5

    sub-int/2addr v1, v5

    goto :goto_3

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lm1/e;->Q0()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Lm1/h;->e2()F

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v1, v5

    add-float/2addr v1, v15

    float-to-int v1, v1

    goto :goto_3

    :cond_4
    :goto_4
    move v1, v4

    goto :goto_5

    :cond_5
    instance-of v5, v3, Lm1/a;

    if-eqz v5, :cond_6

    check-cast v3, Lm1/a;

    invoke-virtual {v3}, Lm1/a;->j2()I

    move-result v3

    if-nez v3, :cond_6

    move v2, v4

    :cond_6
    :goto_5
    add-int/lit8 v0, v0, 0x1

    const/4 v10, 0x0

    goto :goto_2

    :cond_7
    if-eqz v1, :cond_9

    const/4 v0, 0x0

    :goto_6
    if-ge v0, v12, :cond_9

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lm1/e;

    instance-of v3, v1, Lm1/h;

    if-eqz v3, :cond_8

    move-object v3, v1

    check-cast v3, Lm1/h;

    invoke-virtual {v3}, Lm1/h;->b2()I

    move-result v3

    if-ne v3, v4, :cond_8

    const/4 v3, 0x0

    invoke-direct {v6, v3, v1, v8, v14}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_7

    :cond_8
    const/4 v3, 0x0

    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    const/4 v3, 0x0

    invoke-direct {v6, v3, v7, v8, v14}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    if-eqz v2, :cond_b

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v12, :cond_b

    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/e;

    instance-of v1, v0, Lm1/a;

    if-eqz v1, :cond_a

    move-object v2, v0

    check-cast v2, Lm1/a;

    invoke-virtual {v2}, Lm1/a;->j2()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v1, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move/from16 v4, v16

    move v15, v5

    move v5, v14

    invoke-direct/range {v0 .. v5}, Ln1/h$a;->d(ILm1/a;Ln1/b$c;IZ)V

    goto :goto_9

    :cond_a
    move v15, v5

    :goto_9
    add-int/lit8 v10, v10, 0x1

    move v5, v15

    const/4 v4, 0x1

    const/high16 v15, 0x3f000000    # 0.5f

    goto :goto_8

    :cond_b
    move v15, v5

    sget-object v0, Lm1/e$b;->C:Lm1/e$b;

    if-ne v9, v0, :cond_c

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {v7, v1, v0}, Lm1/e;->j1(II)V

    goto :goto_a

    :cond_c
    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lm1/e;->i1(I)V

    :goto_a
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_b
    if-ge v1, v12, :cond_14

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    instance-of v3, v2, Lm1/h;

    if-eqz v3, :cond_12

    check-cast v2, Lm1/h;

    invoke-virtual {v2}, Lm1/h;->b2()I

    move-result v3

    if-nez v3, :cond_11

    invoke-virtual {v2}, Lm1/h;->c2()I

    move-result v3

    if-eq v3, v15, :cond_e

    invoke-virtual {v2}, Lm1/h;->c2()I

    move-result v3

    :goto_c
    invoke-virtual {v2, v3}, Lm1/h;->f2(I)V

    :cond_d
    const/high16 v5, 0x3f000000    # 0.5f

    goto :goto_d

    :cond_e
    invoke-virtual {v2}, Lm1/h;->d2()I

    move-result v3

    if-eq v3, v15, :cond_f

    invoke-virtual/range {p1 .. p1}, Lm1/e;->R0()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v3

    invoke-virtual {v2}, Lm1/h;->d2()I

    move-result v4

    sub-int/2addr v3, v4

    goto :goto_c

    :cond_f
    invoke-virtual/range {p1 .. p1}, Lm1/e;->R0()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lm1/h;->e2()F

    move-result v3

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    const/high16 v5, 0x3f000000    # 0.5f

    add-float/2addr v3, v5

    float-to-int v3, v3

    invoke-virtual {v2, v3}, Lm1/h;->f2(I)V

    :goto_d
    const/4 v4, 0x1

    :cond_10
    :goto_e
    const/4 v9, 0x1

    goto :goto_f

    :cond_11
    const/high16 v5, 0x3f000000    # 0.5f

    goto :goto_e

    :cond_12
    const/high16 v5, 0x3f000000    # 0.5f

    instance-of v3, v2, Lm1/a;

    if-eqz v3, :cond_10

    check-cast v2, Lm1/a;

    invoke-virtual {v2}, Lm1/a;->j2()I

    move-result v2

    const/4 v9, 0x1

    if-ne v2, v9, :cond_13

    move v0, v9

    :cond_13
    :goto_f
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_14
    const/4 v9, 0x1

    if-eqz v4, :cond_16

    const/4 v1, 0x0

    :goto_10
    if-ge v1, v12, :cond_16

    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    instance-of v3, v2, Lm1/h;

    if-eqz v3, :cond_15

    move-object v3, v2

    check-cast v3, Lm1/h;

    invoke-virtual {v3}, Lm1/h;->b2()I

    move-result v3

    if-nez v3, :cond_15

    invoke-direct {v6, v9, v2, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_10

    :cond_16
    const/4 v1, 0x0

    invoke-direct {v6, v1, v7, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    if-eqz v0, :cond_18

    const/4 v7, 0x0

    :goto_11
    if-ge v7, v12, :cond_18

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/e;

    instance-of v1, v0, Lm1/a;

    if-eqz v1, :cond_17

    move-object v2, v0

    check-cast v2, Lm1/a;

    invoke-virtual {v2}, Lm1/a;->j2()I

    move-result v0

    if-ne v0, v9, :cond_17

    const/4 v1, 0x0

    const/4 v4, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move v5, v14

    invoke-direct/range {v0 .. v5}, Ln1/h$a;->d(ILm1/a;Ln1/b$c;IZ)V

    :cond_17
    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    :cond_18
    const/4 v7, 0x0

    :goto_12
    if-ge v7, v12, :cond_1c

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v13}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v0

    check-cast v9, Lm1/e;

    invoke-virtual {v9}, Lm1/e;->P0()Z

    move-result v0

    if-eqz v0, :cond_1b

    const/4 v0, 0x0

    invoke-direct {v6, v0, v9}, Ln1/h$a;->a(ILm1/e;)Z

    move-result v1

    if-eqz v1, :cond_1b

    sget-object v0, Lm1/f;->h1:Lm1/f$a;

    invoke-static {}, Ln1/h;->b()Ln1/b$b;

    move-result-object v4

    sget-object v1, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v1}, Ln1/b$b$a;->a()I

    move-result v5

    const/4 v1, 0x0

    move-object v2, v9

    move-object/from16 v3, p2

    invoke-virtual/range {v0 .. v5}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    instance-of v0, v9, Lm1/h;

    if-eqz v0, :cond_1a

    move-object v0, v9

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/h;->b2()I

    move-result v0

    if-nez v0, :cond_19

    const/4 v0, 0x0

    :goto_13
    invoke-direct {v6, v0, v9, v8}, Ln1/h$a;->j(ILm1/e;Ln1/b$c;)V

    goto :goto_14

    :cond_19
    const/4 v0, 0x0

    invoke-direct {v6, v0, v9, v8, v14}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_14

    :cond_1a
    const/4 v0, 0x0

    invoke-direct {v6, v0, v9, v8, v14}, Ln1/h$a;->b(ILm1/e;Ln1/b$c;Z)V

    goto :goto_13

    :cond_1b
    const/4 v0, 0x0

    :goto_14
    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_1c
    return-void
.end method
