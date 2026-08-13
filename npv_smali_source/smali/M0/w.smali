.class public abstract LM0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LY0/x;->b:LY0/x$a;

    invoke-virtual {v0}, LY0/x$a;->a()J

    move-result-wide v0

    sput-wide v0, LM0/w;->a:J

    return-void
.end method

.method public static final a(LM0/v;IIJLX0/r;LM0/y;LX0/h;IILX0/t;)LM0/v;
    .locals 24

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move/from16 v6, p8

    move/from16 v7, p9

    move-object/from16 v8, p10

    sget-object v9, LX0/j;->b:LX0/j$a;

    invoke-virtual {v9}, LX0/j$a;->g()I

    move-result v10

    invoke-static {v1, v10}, LX0/j;->k(II)Z

    move-result v10

    if-nez v10, :cond_1

    invoke-virtual/range {p0 .. p0}, LM0/v;->h()I

    move-result v10

    invoke-static {v1, v10}, LX0/j;->k(II)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_0

    :cond_0
    move-wide/from16 v12, p3

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static/range {p3 .. p4}, LY0/y;->g(J)Z

    move-result v10

    xor-int/lit8 v10, v10, 0x1

    if-eqz v10, :cond_2

    invoke-virtual/range {p0 .. p0}, LM0/v;->e()J

    move-result-wide v10

    move-wide/from16 v12, p3

    invoke-static {v12, v13, v10, v11}, LY0/x;->e(JJ)Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_1

    :cond_2
    move-wide/from16 v12, p3

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual/range {p0 .. p0}, LM0/v;->j()LX0/r;

    move-result-object v10

    invoke-static {v3, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_3
    sget-object v10, LX0/l;->b:LX0/l$a;

    invoke-virtual {v10}, LX0/l$a;->f()I

    move-result v10

    invoke-static {v2, v10}, LX0/l;->j(II)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-virtual/range {p0 .. p0}, LM0/v;->i()I

    move-result v10

    invoke-static {v2, v10}, LX0/l;->j(II)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual/range {p0 .. p0}, LM0/v;->g()LM0/y;

    move-result-object v10

    invoke-static {v4, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_5
    if-eqz v5, :cond_6

    invoke-virtual/range {p0 .. p0}, LM0/v;->f()LX0/h;

    move-result-object v10

    invoke-static {v5, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_6
    sget-object v10, LX0/f;->b:LX0/f$a;

    invoke-virtual {v10}, LX0/f$a;->b()I

    move-result v10

    invoke-static {v6, v10}, LX0/f;->f(II)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual/range {p0 .. p0}, LM0/v;->d()I

    move-result v10

    invoke-static {v6, v10}, LX0/f;->f(II)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_7
    sget-object v10, LX0/e;->b:LX0/e$a;

    invoke-virtual {v10}, LX0/e$a;->c()I

    move-result v10

    invoke-static {v7, v10}, LX0/e;->g(II)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-virtual/range {p0 .. p0}, LM0/v;->c()I

    move-result v10

    invoke-static {v7, v10}, LX0/e;->g(II)Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_8
    if-eqz v8, :cond_12

    invoke-virtual/range {p0 .. p0}, LM0/v;->k()LX0/t;

    move-result-object v10

    invoke-static {v8, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    :cond_9
    :goto_2
    invoke-static/range {p3 .. p4}, LY0/y;->g(J)Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-virtual/range {p0 .. p0}, LM0/v;->e()J

    move-result-wide v10

    move-wide v15, v10

    goto :goto_3

    :cond_a
    move-wide v15, v12

    :goto_3
    if-nez v3, :cond_b

    invoke-virtual/range {p0 .. p0}, LM0/v;->j()LX0/r;

    move-result-object v3

    :cond_b
    move-object/from16 v17, v3

    invoke-virtual {v9}, LX0/j$a;->g()I

    move-result v3

    invoke-static {v1, v3}, LX0/j;->k(II)Z

    move-result v3

    if-nez v3, :cond_c

    :goto_4
    move v13, v1

    goto :goto_5

    :cond_c
    invoke-virtual/range {p0 .. p0}, LM0/v;->h()I

    move-result v1

    goto :goto_4

    :goto_5
    sget-object v1, LX0/l;->b:LX0/l$a;

    invoke-virtual {v1}, LX0/l$a;->f()I

    move-result v1

    invoke-static {v2, v1}, LX0/l;->j(II)Z

    move-result v1

    if-nez v1, :cond_d

    move v14, v2

    goto :goto_6

    :cond_d
    invoke-virtual/range {p0 .. p0}, LM0/v;->i()I

    move-result v1

    move v14, v1

    :goto_6
    invoke-static {v0, v4}, LM0/w;->d(LM0/v;LM0/y;)LM0/y;

    move-result-object v18

    if-nez v5, :cond_e

    invoke-virtual/range {p0 .. p0}, LM0/v;->f()LX0/h;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_7

    :cond_e
    move-object/from16 v19, v5

    :goto_7
    sget-object v1, LX0/f;->b:LX0/f$a;

    invoke-virtual {v1}, LX0/f$a;->b()I

    move-result v1

    invoke-static {v6, v1}, LX0/f;->f(II)Z

    move-result v1

    if-nez v1, :cond_f

    move/from16 v20, v6

    goto :goto_8

    :cond_f
    invoke-virtual/range {p0 .. p0}, LM0/v;->d()I

    move-result v1

    move/from16 v20, v1

    :goto_8
    sget-object v1, LX0/e;->b:LX0/e$a;

    invoke-virtual {v1}, LX0/e$a;->c()I

    move-result v1

    invoke-static {v7, v1}, LX0/e;->g(II)Z

    move-result v1

    if-nez v1, :cond_10

    move/from16 v21, v7

    goto :goto_9

    :cond_10
    invoke-virtual/range {p0 .. p0}, LM0/v;->c()I

    move-result v1

    move/from16 v21, v1

    :goto_9
    if-nez v8, :cond_11

    invoke-virtual/range {p0 .. p0}, LM0/v;->k()LX0/t;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_a

    :cond_11
    move-object/from16 v22, v8

    :goto_a
    new-instance v0, LM0/v;

    const/16 v23, 0x0

    move-object v12, v0

    invoke-direct/range {v12 .. v23}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V

    :cond_12
    return-object v0
.end method

.method public static final b(LM0/v;LM0/v;F)LM0/v;
    .locals 13

    .prologue
    new-instance v12, LM0/v;

    invoke-virtual {p0}, LM0/v;->h()I

    move-result v0

    invoke-static {v0}, LX0/j;->h(I)LX0/j;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->h()I

    move-result v1

    invoke-static {v1}, LX0/j;->h(I)LX0/j;

    move-result-object v1

    invoke-static {v0, v1, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/j;

    invoke-virtual {v0}, LX0/j;->n()I

    move-result v1

    invoke-virtual {p0}, LM0/v;->i()I

    move-result v0

    invoke-static {v0}, LX0/l;->g(I)LX0/l;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->i()I

    move-result v2

    invoke-static {v2}, LX0/l;->g(I)LX0/l;

    move-result-object v2

    invoke-static {v0, v2, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/l;

    invoke-virtual {v0}, LX0/l;->m()I

    move-result v2

    invoke-virtual {p0}, LM0/v;->e()J

    move-result-wide v3

    invoke-virtual {p1}, LM0/v;->e()J

    move-result-wide v5

    invoke-static {v3, v4, v5, v6, p2}, LM0/D;->f(JJF)J

    move-result-wide v3

    invoke-virtual {p0}, LM0/v;->j()LX0/r;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, LX0/r;->c:LX0/r$a;

    invoke-virtual {v0}, LX0/r$a;->a()LX0/r;

    move-result-object v0

    :cond_0
    invoke-virtual {p1}, LM0/v;->j()LX0/r;

    move-result-object v5

    if-nez v5, :cond_1

    sget-object v5, LX0/r;->c:LX0/r$a;

    invoke-virtual {v5}, LX0/r$a;->a()LX0/r;

    move-result-object v5

    :cond_1
    invoke-static {v0, v5, p2}, LX0/s;->a(LX0/r;LX0/r;F)LX0/r;

    move-result-object v5

    invoke-virtual {p0}, LM0/v;->g()LM0/y;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->g()LM0/y;

    move-result-object v6

    invoke-static {v0, v6, p2}, LM0/w;->c(LM0/y;LM0/y;F)LM0/y;

    move-result-object v6

    invoke-virtual {p0}, LM0/v;->f()LX0/h;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->f()LX0/h;

    move-result-object v7

    invoke-static {v0, v7, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LX0/h;

    invoke-virtual {p0}, LM0/v;->d()I

    move-result v0

    invoke-static {v0}, LX0/f;->c(I)LX0/f;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->d()I

    move-result v8

    invoke-static {v8}, LX0/f;->c(I)LX0/f;

    move-result-object v8

    invoke-static {v0, v8, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/f;

    invoke-virtual {v0}, LX0/f;->l()I

    move-result v8

    invoke-virtual {p0}, LM0/v;->c()I

    move-result v0

    invoke-static {v0}, LX0/e;->d(I)LX0/e;

    move-result-object v0

    invoke-virtual {p1}, LM0/v;->c()I

    move-result v9

    invoke-static {v9}, LX0/e;->d(I)LX0/e;

    move-result-object v9

    invoke-static {v0, v9, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX0/e;

    invoke-virtual {v0}, LX0/e;->j()I

    move-result v9

    invoke-virtual {p0}, LM0/v;->k()LX0/t;

    move-result-object p0

    invoke-virtual {p1}, LM0/v;->k()LX0/t;

    move-result-object p1

    invoke-static {p0, p1, p2}, LM0/D;->d(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, LX0/t;

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V

    return-object v12
.end method

.method private static final c(LM0/y;LM0/y;F)LM0/y;
    .locals 0

    .prologue
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    sget-object p0, LM0/y;->c:LM0/y$a;

    invoke-virtual {p0}, LM0/y$a;->a()LM0/y;

    move-result-object p0

    :cond_1
    if-nez p1, :cond_2

    sget-object p1, LM0/y;->c:LM0/y$a;

    invoke-virtual {p1}, LM0/y$a;->a()LM0/y;

    move-result-object p1

    :cond_2
    invoke-static {p0, p1, p2}, LM0/c;->b(LM0/y;LM0/y;F)LM0/y;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LM0/v;LM0/y;)LM0/y;
    .locals 1

    .prologue
    invoke-virtual {p0}, LM0/v;->g()LM0/y;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, LM0/v;->g()LM0/y;

    move-result-object p0

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, LM0/y;->d(LM0/y;)LM0/y;

    move-result-object p0

    return-object p0
.end method

.method public static final e(LM0/v;LY0/v;)LM0/v;
    .locals 13

    .prologue
    new-instance v12, LM0/v;

    invoke-virtual {p0}, LM0/v;->h()I

    move-result v0

    sget-object v1, LX0/j;->b:LX0/j$a;

    invoke-virtual {v1}, LX0/j$a;->g()I

    move-result v2

    invoke-static {v0, v2}, LX0/j;->k(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, LX0/j$a;->f()I

    move-result v0

    :goto_0
    move v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LM0/v;->h()I

    move-result v0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, LM0/v;->i()I

    move-result v0

    invoke-static {p1, v0}, LM0/Q;->e(LY0/v;I)I

    move-result v2

    invoke-virtual {p0}, LM0/v;->e()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/y;->g(J)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-wide v3, LM0/w;->a:J

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, LM0/v;->e()J

    move-result-wide v3

    :goto_2
    invoke-virtual {p0}, LM0/v;->j()LX0/r;

    move-result-object p1

    if-nez p1, :cond_2

    sget-object p1, LX0/r;->c:LX0/r$a;

    invoke-virtual {p1}, LX0/r$a;->a()LX0/r;

    move-result-object p1

    :cond_2
    move-object v5, p1

    invoke-virtual {p0}, LM0/v;->g()LM0/y;

    move-result-object v6

    invoke-virtual {p0}, LM0/v;->f()LX0/h;

    move-result-object v7

    invoke-virtual {p0}, LM0/v;->d()I

    move-result p1

    sget-object v0, LX0/f;->b:LX0/f$a;

    invoke-virtual {v0}, LX0/f$a;->b()I

    move-result v8

    invoke-static {p1, v8}, LX0/f;->f(II)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, LX0/f$a;->a()I

    move-result p1

    :goto_3
    move v8, p1

    goto :goto_4

    :cond_3
    invoke-virtual {p0}, LM0/v;->d()I

    move-result p1

    goto :goto_3

    :goto_4
    invoke-virtual {p0}, LM0/v;->c()I

    move-result p1

    sget-object v0, LX0/e;->b:LX0/e$a;

    invoke-virtual {v0}, LX0/e$a;->c()I

    move-result v9

    invoke-static {p1, v9}, LX0/e;->g(II)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0}, LX0/e$a;->b()I

    move-result p1

    :goto_5
    move v9, p1

    goto :goto_6

    :cond_4
    invoke-virtual {p0}, LM0/v;->c()I

    move-result p1

    goto :goto_5

    :goto_6
    invoke-virtual {p0}, LM0/v;->k()LX0/t;

    move-result-object p0

    if-nez p0, :cond_5

    sget-object p0, LX0/t;->c:LX0/t$a;

    invoke-virtual {p0}, LX0/t$a;->a()LX0/t;

    move-result-object p0

    :cond_5
    move-object v10, p0

    const/4 v11, 0x0

    move-object v0, v12

    invoke-direct/range {v0 .. v11}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V

    return-object v12
.end method
