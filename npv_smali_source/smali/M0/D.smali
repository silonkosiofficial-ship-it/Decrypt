.class public abstract LM0/D;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J

.field private static final b:J

.field private static final c:J

.field private static final d:J

.field private static final e:LX0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xe

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide v0

    sput-wide v0, LM0/D;->a:J

    const/4 v0, 0x0

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide v0

    sput-wide v0, LM0/D;->b:J

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->f()J

    move-result-wide v1

    sput-wide v1, LM0/D;->c:J

    invoke-virtual {v0}, Lo0/y0$a;->a()J

    move-result-wide v0

    sput-wide v0, LM0/D;->d:J

    sget-object v2, LX0/o;->a:LX0/o$a;

    invoke-virtual {v2, v0, v1}, LX0/o$a;->b(J)LX0/o;

    move-result-object v0

    sput-object v0, LM0/D;->e:LX0/o;

    return-void
.end method

.method public static final synthetic a()LX0/o;
    .locals 1

    sget-object v0, LM0/D;->e:LX0/o;

    return-object v0
.end method

.method public static final b(LM0/C;JLo0/n0;FJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;)LM0/C;
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p14

    move-object/from16 v11, p15

    move-object/from16 v12, p16

    move-wide/from16 v13, p17

    move-object/from16 v15, p19

    move-object/from16 v0, p20

    invoke-static/range {p5 .. p6}, LY0/y;->g(J)Z

    move-result v16

    xor-int/lit8 v16, v16, 0x1

    const-wide/16 v17, 0x10

    if-eqz v16, :cond_1

    invoke-virtual/range {p0 .. p0}, LM0/C;->k()J

    move-result-wide v13

    move-wide/from16 v11, p5

    invoke-static {v11, v12, v13, v14}, LY0/x;->e(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_3

    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v13, p15

    :goto_0
    move-wide/from16 v11, p17

    :goto_1
    move-object/from16 v14, p21

    :goto_2
    move-object/from16 v15, p22

    goto/16 :goto_8

    :cond_1
    move-wide/from16 v11, p5

    :goto_3
    if-nez v3, :cond_2

    cmp-long v13, v1, v17

    if-eqz v13, :cond_2

    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v13

    invoke-interface {v13}, LX0/o;->c()J

    move-result-wide v13

    invoke-static {v1, v2, v13, v14}, Lo0/y0;->o(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual/range {p0 .. p0}, LM0/C;->l()LR0/o;

    move-result-object v13

    invoke-static {v6, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual/range {p0 .. p0}, LM0/C;->n()LR0/q;

    move-result-object v13

    invoke-static {v5, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_4
    if-eqz v8, :cond_5

    invoke-virtual/range {p0 .. p0}, LM0/C;->i()LR0/h;

    move-result-object v13

    if-ne v8, v13, :cond_0

    :cond_5
    invoke-static/range {p12 .. p13}, LY0/y;->g(J)Z

    move-result v13

    xor-int/lit8 v13, v13, 0x1

    if-eqz v13, :cond_6

    invoke-virtual/range {p0 .. p0}, LM0/C;->o()J

    move-result-wide v13

    move-wide/from16 v11, p12

    invoke-static {v11, v12, v13, v14}, LY0/x;->e(JJ)Z

    move-result v13

    if-eqz v13, :cond_0

    goto :goto_4

    :cond_6
    move-wide/from16 v11, p12

    :goto_4
    if-eqz v15, :cond_7

    invoke-virtual/range {p0 .. p0}, LM0/C;->s()LX0/k;

    move-result-object v13

    invoke-static {v15, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_7
    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v13

    invoke-interface {v13}, LX0/o;->f()Lo0/n0;

    move-result-object v13

    invoke-static {v3, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    if-eqz v3, :cond_8

    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v13

    invoke-interface {v13}, LX0/o;->a()F

    move-result v13

    cmpg-float v13, v4, v13

    if-nez v13, :cond_0

    :cond_8
    if-eqz v7, :cond_9

    invoke-virtual/range {p0 .. p0}, LM0/C;->m()LR0/p;

    move-result-object v13

    invoke-static {v7, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_9
    if-eqz v9, :cond_a

    invoke-virtual/range {p0 .. p0}, LM0/C;->j()Ljava/lang/String;

    move-result-object v13

    invoke-static {v9, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_a
    if-eqz v10, :cond_b

    invoke-virtual/range {p0 .. p0}, LM0/C;->e()LX0/a;

    move-result-object v13

    invoke-static {v10, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    :cond_b
    move-object/from16 v13, p15

    if-eqz v13, :cond_c

    invoke-virtual/range {p0 .. p0}, LM0/C;->u()LX0/p;

    move-result-object v14

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    :cond_c
    move-object/from16 v14, p16

    goto :goto_5

    :cond_d
    move-object/from16 v0, p0

    goto/16 :goto_0

    :goto_5
    if-eqz v14, :cond_e

    invoke-virtual/range {p0 .. p0}, LM0/C;->p()LT0/h;

    move-result-object v11

    invoke-static {v14, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    :cond_e
    move-wide/from16 v11, p17

    cmp-long v16, v11, v17

    if-eqz v16, :cond_10

    invoke-virtual/range {p0 .. p0}, LM0/C;->d()J

    move-result-wide v14

    invoke-static {v11, v12, v14, v15}, Lo0/y0;->o(JJ)Z

    move-result v14

    if-eqz v14, :cond_f

    goto :goto_6

    :cond_f
    move-object/from16 v0, p0

    goto/16 :goto_1

    :cond_10
    :goto_6
    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, LM0/C;->r()Lo0/c2;

    move-result-object v14

    invoke-static {v0, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    :cond_11
    move-object/from16 v14, p21

    if-eqz v14, :cond_12

    invoke-virtual/range {p0 .. p0}, LM0/C;->q()LM0/z;

    move-result-object v15

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    :cond_12
    move-object/from16 v15, p22

    goto :goto_7

    :cond_13
    move-object/from16 v0, p0

    goto/16 :goto_2

    :goto_7
    if-eqz v15, :cond_14

    invoke-virtual/range {p0 .. p0}, LM0/C;->h()Lq0/h;

    move-result-object v0

    invoke-static {v15, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    move-object/from16 v0, p0

    goto :goto_8

    :cond_14
    move-object/from16 v0, p0

    return-object v0

    :goto_8
    if-eqz v3, :cond_15

    sget-object v1, LX0/o;->a:LX0/o$a;

    invoke-virtual {v1, v3, v4}, LX0/o$a;->a(Lo0/n0;F)LX0/o;

    move-result-object v1

    goto :goto_9

    :cond_15
    sget-object v3, LX0/o;->a:LX0/o$a;

    invoke-virtual {v3, v1, v2}, LX0/o$a;->b(J)LX0/o;

    move-result-object v1

    :goto_9
    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v2

    invoke-interface {v2, v1}, LX0/o;->e(LX0/o;)LX0/o;

    move-result-object v1

    if-nez v8, :cond_16

    invoke-virtual/range {p0 .. p0}, LM0/C;->i()LR0/h;

    move-result-object v2

    goto :goto_a

    :cond_16
    move-object v2, v8

    :goto_a
    invoke-static/range {p5 .. p6}, LY0/y;->g(J)Z

    move-result v3

    if-nez v3, :cond_17

    move-wide/from16 v3, p5

    goto :goto_b

    :cond_17
    invoke-virtual/range {p0 .. p0}, LM0/C;->k()J

    move-result-wide v3

    :goto_b
    if-nez v5, :cond_18

    invoke-virtual/range {p0 .. p0}, LM0/C;->n()LR0/q;

    move-result-object v5

    :cond_18
    if-nez v6, :cond_19

    invoke-virtual/range {p0 .. p0}, LM0/C;->l()LR0/o;

    move-result-object v6

    :cond_19
    if-nez v7, :cond_1a

    invoke-virtual/range {p0 .. p0}, LM0/C;->m()LR0/p;

    move-result-object v7

    :cond_1a
    if-nez v9, :cond_1b

    invoke-virtual/range {p0 .. p0}, LM0/C;->j()Ljava/lang/String;

    move-result-object v8

    move-object v9, v8

    :cond_1b
    invoke-static/range {p12 .. p13}, LY0/y;->g(J)Z

    move-result v8

    if-nez v8, :cond_1c

    move-wide/from16 v19, p12

    goto :goto_c

    :cond_1c
    invoke-virtual/range {p0 .. p0}, LM0/C;->o()J

    move-result-wide v19

    :goto_c
    if-nez v10, :cond_1d

    invoke-virtual/range {p0 .. p0}, LM0/C;->e()LX0/a;

    move-result-object v8

    move-object v10, v8

    :cond_1d
    if-nez v13, :cond_1e

    invoke-virtual/range {p0 .. p0}, LM0/C;->u()LX0/p;

    move-result-object v8

    move-object v13, v8

    :cond_1e
    if-nez p16, :cond_1f

    invoke-virtual/range {p0 .. p0}, LM0/C;->p()LT0/h;

    move-result-object v8

    goto :goto_d

    :cond_1f
    move-object/from16 v8, p16

    :goto_d
    cmp-long v16, v11, v17

    if-eqz v16, :cond_20

    goto :goto_e

    :cond_20
    invoke-virtual/range {p0 .. p0}, LM0/C;->d()J

    move-result-wide v11

    :goto_e
    if-nez p19, :cond_21

    invoke-virtual/range {p0 .. p0}, LM0/C;->s()LX0/k;

    move-result-object v16

    goto :goto_f

    :cond_21
    move-object/from16 v16, p19

    :goto_f
    if-nez p20, :cond_22

    invoke-virtual/range {p0 .. p0}, LM0/C;->r()Lo0/c2;

    move-result-object v17

    goto :goto_10

    :cond_22
    move-object/from16 v17, p20

    :goto_10
    invoke-static {v0, v14}, LM0/D;->g(LM0/C;LM0/z;)LM0/z;

    move-result-object v14

    if-nez v15, :cond_23

    invoke-virtual/range {p0 .. p0}, LM0/C;->h()Lq0/h;

    move-result-object v0

    move-object v15, v0

    :cond_23
    new-instance v0, LM0/C;

    move-object/from16 p0, v0

    const/16 v18, 0x0

    move-object/from16 p20, v18

    move-object/from16 p1, v1

    move-wide/from16 p2, v3

    move-object/from16 p4, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v2

    move-object/from16 p8, v9

    move-wide/from16 p9, v19

    move-object/from16 p11, v10

    move-object/from16 p12, v13

    move-object/from16 p13, v8

    move-wide/from16 p14, v11

    move-object/from16 p16, v16

    move-object/from16 p17, v17

    move-object/from16 p18, v14

    move-object/from16 p19, v15

    invoke-direct/range {p0 .. p20}, LM0/C;-><init>(LX0/o;JLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;Ly7/k;)V

    return-object v0
.end method

.method public static final c(LM0/C;LM0/C;F)LM0/C;
    .locals 28

    .prologue
    move/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->t()LX0/o;

    move-result-object v2

    invoke-static {v1, v2, v0}, LX0/m;->b(LX0/o;LX0/o;F)LX0/o;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, LM0/C;->i()LR0/h;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->i()LR0/h;

    move-result-object v2

    invoke-static {v1, v2, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, LR0/h;

    invoke-virtual/range {p0 .. p0}, LM0/C;->k()J

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->k()J

    move-result-wide v5

    invoke-static {v1, v2, v5, v6, v0}, LM0/D;->f(JJF)J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, LM0/C;->n()LR0/q;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, LR0/q;->D:LR0/q$a;

    invoke-virtual {v1}, LR0/q$a;->d()LR0/q;

    move-result-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, LM0/C;->n()LR0/q;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, LR0/q;->D:LR0/q$a;

    invoke-virtual {v2}, LR0/q$a;->d()LR0/q;

    move-result-object v2

    :cond_1
    invoke-static {v1, v2, v0}, LR0/t;->a(LR0/q;LR0/q;F)LR0/q;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LM0/C;->l()LR0/o;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->l()LR0/o;

    move-result-object v2

    invoke-static {v1, v2, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, LR0/o;

    invoke-virtual/range {p0 .. p0}, LM0/C;->m()LR0/p;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->m()LR0/p;

    move-result-object v2

    invoke-static {v1, v2, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, LR0/p;

    invoke-virtual/range {p0 .. p0}, LM0/C;->j()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->j()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, LM0/C;->o()J

    move-result-wide v1

    invoke-virtual/range {p1 .. p1}, LM0/C;->o()J

    move-result-wide v12

    invoke-static {v1, v2, v12, v13, v0}, LM0/D;->f(JJF)J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, LM0/C;->e()LX0/a;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LX0/a;->h()F

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v2}, LX0/a;->c(F)F

    move-result v1

    :goto_0
    invoke-virtual/range {p1 .. p1}, LM0/C;->e()LX0/a;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, LX0/a;->h()F

    move-result v2

    goto :goto_1

    :cond_3
    invoke-static {v2}, LX0/a;->c(F)F

    move-result v2

    :goto_1
    invoke-static {v1, v2, v0}, LX0/b;->a(FFF)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, LM0/C;->u()LX0/p;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, LX0/p;->c:LX0/p$a;

    invoke-virtual {v2}, LX0/p$a;->a()LX0/p;

    move-result-object v2

    :cond_4
    invoke-virtual/range {p1 .. p1}, LM0/C;->u()LX0/p;

    move-result-object v3

    if-nez v3, :cond_5

    sget-object v3, LX0/p;->c:LX0/p$a;

    invoke-virtual {v3}, LX0/p$a;->a()LX0/p;

    move-result-object v3

    :cond_5
    invoke-static {v2, v3, v0}, LX0/q;->a(LX0/p;LX0/p;F)LX0/p;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, LM0/C;->p()LT0/h;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LM0/C;->p()LT0/h;

    move-result-object v3

    invoke-static {v2, v3, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, LT0/h;

    invoke-virtual/range {p0 .. p0}, LM0/C;->d()J

    move-result-wide v2

    move-object/from16 v17, v15

    invoke-virtual/range {p1 .. p1}, LM0/C;->d()J

    move-result-wide v14

    invoke-static {v2, v3, v14, v15, v0}, Lo0/A0;->i(JJF)J

    move-result-wide v18

    invoke-virtual/range {p0 .. p0}, LM0/C;->s()LX0/k;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LM0/C;->s()LX0/k;

    move-result-object v3

    invoke-static {v2, v3, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LX0/k;

    invoke-virtual/range {p0 .. p0}, LM0/C;->r()Lo0/c2;

    move-result-object v3

    if-nez v3, :cond_6

    new-instance v3, Lo0/c2;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v3

    invoke-direct/range {v20 .. v27}, Lo0/c2;-><init>(JJFILy7/k;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, LM0/C;->r()Lo0/c2;

    move-result-object v14

    if-nez v14, :cond_7

    new-instance v14, Lo0/c2;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v20, v14

    invoke-direct/range {v20 .. v27}, Lo0/c2;-><init>(JJFILy7/k;)V

    :cond_7
    invoke-static {v3, v14, v0}, Lo0/d2;->a(Lo0/c2;Lo0/c2;F)Lo0/c2;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, LM0/C;->q()LM0/z;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LM0/C;->q()LM0/z;

    move-result-object v14

    invoke-static {v3, v14, v0}, LM0/D;->e(LM0/z;LM0/z;F)LM0/z;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, LM0/C;->h()Lq0/h;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, LM0/C;->h()Lq0/h;

    move-result-object v14

    invoke-static {v3, v14, v0}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lq0/h;

    new-instance v0, LM0/C;

    move-object v3, v0

    invoke-static {v1}, LX0/a;->b(F)LX0/a;

    move-result-object v14

    const/16 v23, 0x0

    move-object/from16 v15, v17

    move-wide/from16 v17, v18

    move-object/from16 v19, v2

    invoke-direct/range {v3 .. v23}, LM0/C;-><init>(LX0/o;JLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;Ly7/k;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;
    .locals 4

    .prologue
    float-to-double v0, p2

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpg-double p2, v0, v2

    if-gez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p1

    :goto_0
    return-object p0
.end method

.method private static final e(LM0/z;LM0/z;F)LM0/z;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, LM0/z;->a:LM0/z$a;

    invoke-virtual {p0}, LM0/z$a;->a()LM0/z;

    move-result-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LM0/z;->a:LM0/z$a;

    invoke-virtual {p1}, LM0/z$a;->a()LM0/z;

    move-result-object p1

    :cond_2
    invoke-static {p0, p1, p2}, LM0/c;->c(LM0/z;LM0/z;F)LM0/z;

    move-result-object p0

    return-object p0
.end method

.method public static final f(JJF)J
    .locals 1

    .prologue
    invoke-static {p0, p1}, LY0/y;->g(J)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2, p3}, LY0/y;->g(J)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LY0/y;->h(JJF)J

    move-result-wide p0

    return-wide p0

    :cond_1
    :goto_0
    invoke-static {p0, p1}, LY0/x;->b(J)LY0/x;

    move-result-object p0

    invoke-static {p2, p3}, LY0/x;->b(J)LY0/x;

    move-result-object p1

    invoke-static {p0, p1, p4}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/x;

    invoke-virtual {p0}, LY0/x;->k()J

    move-result-wide p0

    return-wide p0
.end method

.method private static final g(LM0/C;LM0/z;)LM0/z;
    .locals 1

    .prologue
    invoke-virtual {p0}, LM0/C;->q()LM0/z;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, LM0/C;->q()LM0/z;

    move-result-object p0

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, LM0/z;->b(LM0/z;)LM0/z;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LM0/C;)LM0/C;
    .locals 23

    .prologue
    invoke-virtual/range {p0 .. p0}, LM0/C;->t()LX0/o;

    move-result-object v0

    sget-object v1, LM0/D$a;->D:LM0/D$a;

    invoke-interface {v0, v1}, LX0/o;->d(Lx7/a;)LX0/o;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LM0/C;->k()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->g(J)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-wide v0, LM0/D;->a:J

    :goto_0
    move-wide v4, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, LM0/C;->k()J

    move-result-wide v0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, LM0/C;->n()LR0/q;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, LR0/q;->D:LR0/q$a;

    invoke-virtual {v0}, LR0/q$a;->d()LR0/q;

    move-result-object v0

    :cond_1
    move-object v6, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->l()LR0/o;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LR0/o;->i()I

    move-result v0

    goto :goto_2

    :cond_2
    sget-object v0, LR0/o;->b:LR0/o$a;

    invoke-virtual {v0}, LR0/o$a;->b()I

    move-result v0

    :goto_2
    invoke-static {v0}, LR0/o;->c(I)LR0/o;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, LM0/C;->m()LR0/p;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LR0/p;->k()I

    move-result v0

    goto :goto_3

    :cond_3
    sget-object v0, LR0/p;->b:LR0/p$a;

    invoke-virtual {v0}, LR0/p$a;->a()I

    move-result v0

    :goto_3
    invoke-static {v0}, LR0/p;->e(I)LR0/p;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, LM0/C;->i()LR0/h;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, LR0/h;->b:LR0/h$a;

    invoke-virtual {v0}, LR0/h$a;->a()LR0/E;

    move-result-object v0

    :cond_4
    move-object v9, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->j()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    const-string v0, ""

    :cond_5
    move-object v10, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->o()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->g(J)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-wide v0, LM0/D;->b:J

    :goto_4
    move-wide v11, v0

    goto :goto_5

    :cond_6
    invoke-virtual/range {p0 .. p0}, LM0/C;->o()J

    move-result-wide v0

    goto :goto_4

    :goto_5
    invoke-virtual/range {p0 .. p0}, LM0/C;->e()LX0/a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, LX0/a;->h()F

    move-result v0

    goto :goto_6

    :cond_7
    sget-object v0, LX0/a;->b:LX0/a$a;

    invoke-virtual {v0}, LX0/a$a;->a()F

    move-result v0

    :goto_6
    invoke-static {v0}, LX0/a;->b(F)LX0/a;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, LM0/C;->u()LX0/p;

    move-result-object v0

    if-nez v0, :cond_8

    sget-object v0, LX0/p;->c:LX0/p$a;

    invoke-virtual {v0}, LX0/p$a;->a()LX0/p;

    move-result-object v0

    :cond_8
    move-object v14, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->p()LT0/h;

    move-result-object v0

    if-nez v0, :cond_9

    sget-object v0, LT0/h;->E:LT0/h$a;

    invoke-virtual {v0}, LT0/h$a;->a()LT0/h;

    move-result-object v0

    :cond_9
    move-object v15, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->d()J

    move-result-wide v0

    const-wide/16 v16, 0x10

    cmp-long v2, v0, v16

    if-eqz v2, :cond_a

    :goto_7
    move-wide/from16 v16, v0

    goto :goto_8

    :cond_a
    sget-wide v0, LM0/D;->c:J

    goto :goto_7

    :goto_8
    invoke-virtual/range {p0 .. p0}, LM0/C;->s()LX0/k;

    move-result-object v0

    if-nez v0, :cond_b

    sget-object v0, LX0/k;->b:LX0/k$a;

    invoke-virtual {v0}, LX0/k$a;->c()LX0/k;

    move-result-object v0

    :cond_b
    move-object/from16 v18, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->r()Lo0/c2;

    move-result-object v0

    if-nez v0, :cond_c

    sget-object v0, Lo0/c2;->d:Lo0/c2$a;

    invoke-virtual {v0}, Lo0/c2$a;->a()Lo0/c2;

    move-result-object v0

    :cond_c
    move-object/from16 v19, v0

    invoke-virtual/range {p0 .. p0}, LM0/C;->q()LM0/z;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, LM0/C;->h()Lq0/h;

    move-result-object v0

    if-nez v0, :cond_d

    sget-object v0, Lq0/l;->a:Lq0/l;

    :cond_d
    move-object/from16 v21, v0

    new-instance v0, LM0/C;

    move-object v2, v0

    const/16 v22, 0x0

    invoke-direct/range {v2 .. v22}, LM0/C;-><init>(LX0/o;JLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;LM0/z;Lq0/h;Ly7/k;)V

    return-object v0
.end method
