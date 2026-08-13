.class public abstract Lu/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lu/i;JFLu/e;Lu/l;Lx7/l;)V
    .locals 0

    invoke-static/range {p0 .. p6}, Lu/q0;->m(Lu/i;JFLu/e;Lu/l;Lx7/l;)V

    return-void
.end method

.method public static final b(FFFLu/j;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    sget-object v0, Ly7/m;->a:Ly7/m;

    invoke-static {v0}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v1

    invoke-static {p0}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p1}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {p2}, Lo7/b;->b(F)Ljava/lang/Float;

    move-result-object v4

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v1 .. v7}, Lu/q0;->d(Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lu/j;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 25

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p5

    instance-of v2, v1, Lu/q0$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lu/q0$b;

    iget v3, v2, Lu/q0$b;->K:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lu/q0$b;->K:I

    :goto_0
    move-object v10, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lu/q0$b;

    invoke-direct {v2, v1}, Lu/q0$b;-><init>(Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object v1, v10, Lu/q0$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v11

    iget v2, v10, Lu/q0$b;->K:I

    const/4 v12, 0x2

    const/4 v13, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v13, :cond_2

    if-ne v2, v12, :cond_1

    iget-object v0, v10, Lu/q0$b;->I:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly7/O;

    iget-object v0, v10, Lu/q0$b;->H:Ljava/lang/Object;

    check-cast v0, Lx7/l;

    iget-object v3, v10, Lu/q0$b;->G:Ljava/lang/Object;

    check-cast v3, Lu/e;

    iget-object v4, v10, Lu/q0$b;->F:Ljava/lang/Object;

    check-cast v4, Lu/l;

    :goto_2
    :try_start_0
    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v9, v4

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v10, Lu/q0$b;->I:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly7/O;

    iget-object v0, v10, Lu/q0$b;->H:Ljava/lang/Object;

    check-cast v0, Lx7/l;

    iget-object v3, v10, Lu/q0$b;->G:Ljava/lang/Object;

    check-cast v3, Lu/e;

    iget-object v4, v10, Lu/q0$b;->F:Ljava/lang/Object;

    check-cast v4, Lu/l;

    goto :goto_2

    :goto_3
    move-object v8, v0

    move-object v0, v3

    goto/16 :goto_5

    :cond_3
    invoke-static {v1}, Li7/x;->b(Ljava/lang/Object;)V

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Lu/e;->f(J)Ljava/lang/Object;

    move-result-object v15

    invoke-interface {v0, v1, v2}, Lu/e;->d(J)Lu/r;

    move-result-object v17

    new-instance v14, Ly7/O;

    invoke-direct {v14}, Ly7/O;-><init>()V

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v1, p2, v1

    if-nez v1, :cond_4

    :try_start_1
    invoke-interface {v10}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, Lu/q0;->n(Lm7/i;)F

    move-result v7

    new-instance v8, Lu/q0$d;

    move-object v1, v8

    move-object v2, v14

    move-object v3, v15

    move-object/from16 v4, p1

    move-object/from16 v5, v17

    move-object/from16 v6, p0

    move-object v15, v8

    move-object/from16 v8, p4

    invoke-direct/range {v1 .. v8}, Lu/q0$d;-><init>(Ly7/O;Ljava/lang/Object;Lu/e;Lu/r;Lu/l;FLx7/l;)V

    iput-object v9, v10, Lu/q0$b;->F:Ljava/lang/Object;

    iput-object v0, v10, Lu/q0$b;->G:Ljava/lang/Object;

    move-object/from16 v8, p4

    iput-object v8, v10, Lu/q0$b;->H:Ljava/lang/Object;

    iput-object v14, v10, Lu/q0$b;->I:Ljava/lang/Object;

    iput v13, v10, Lu/q0$b;->K:I

    invoke-static {v0, v15, v10}, Lu/q0;->k(Lu/e;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_5

    return-object v11

    :catch_1
    move-exception v0

    :goto_4
    move-object v2, v14

    goto/16 :goto_6

    :cond_4
    move-object/from16 v8, p4

    new-instance v13, Lu/i;

    invoke-interface/range {p1 .. p1}, Lu/e;->c()Lu/x0;

    move-result-object v16

    invoke-interface/range {p1 .. p1}, Lu/e;->g()Ljava/lang/Object;

    move-result-object v20

    new-instance v1, Lu/q0$e;

    invoke-direct {v1, v9}, Lu/q0$e;-><init>(Lu/l;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v23, 0x1

    move-object v7, v14

    move-object v14, v13

    move-wide/from16 v18, p2

    move-wide/from16 v21, p2

    move-object/from16 v24, v1

    :try_start_2
    invoke-direct/range {v14 .. v24}, Lu/i;-><init>(Ljava/lang/Object;Lu/x0;Lu/r;JLjava/lang/Object;JZLx7/a;)V

    invoke-interface {v10}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, Lu/q0;->n(Lm7/i;)F

    move-result v4
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    move-object v1, v13

    move-wide/from16 v2, p2

    move-object/from16 v5, p1

    move-object/from16 v6, p0

    move-object v14, v7

    move-object/from16 v7, p4

    :try_start_3
    invoke-static/range {v1 .. v7}, Lu/q0;->m(Lu/i;JFLu/e;Lu/l;Lx7/l;)V

    iput-object v13, v14, Ly7/O;->C:Ljava/lang/Object;
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_5
    move-object v4, v9

    move-object v2, v14

    :cond_6
    :goto_5
    :try_start_4
    iget-object v1, v2, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v1, Lu/i;

    invoke-virtual {v1}, Lu/i;->h()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v10}, Lm7/e;->getContext()Lm7/i;

    move-result-object v1

    invoke-static {v1}, Lu/q0;->n(Lm7/i;)F

    move-result v1

    new-instance v3, Lu/q0$f;

    move-object/from16 p0, v3

    move-object/from16 p1, v2

    move/from16 p2, v1

    move-object/from16 p3, v0

    move-object/from16 p4, v4

    move-object/from16 p5, v8

    invoke-direct/range {p0 .. p5}, Lu/q0$f;-><init>(Ly7/O;FLu/e;Lu/l;Lx7/l;)V

    iput-object v4, v10, Lu/q0$b;->F:Ljava/lang/Object;

    iput-object v0, v10, Lu/q0$b;->G:Ljava/lang/Object;

    iput-object v8, v10, Lu/q0$b;->H:Ljava/lang/Object;

    iput-object v2, v10, Lu/q0$b;->I:Ljava/lang/Object;

    iput v12, v10, Lu/q0$b;->K:I

    invoke-static {v0, v3, v10}, Lu/q0;->k(Lu/e;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    if-ne v1, v11, :cond_6

    return-object v11

    :cond_7
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0

    :catch_2
    move-exception v0

    move-object v14, v7

    goto :goto_4

    :goto_6
    iget-object v1, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lu/i;

    const/4 v3, 0x0

    if-nez v1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v1, v3}, Lu/i;->k(Z)V

    :goto_7
    iget-object v1, v2, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, Lu/i;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lu/i;->c()J

    move-result-wide v1

    invoke-virtual {v9}, Lu/l;->g()J

    move-result-wide v4

    cmp-long v1, v1, v4

    if-nez v1, :cond_9

    invoke-virtual {v9, v3}, Lu/l;->u(Z)V

    :cond_9
    throw v0
.end method

.method public static final d(Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lu/j;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 15

    .prologue
    move-object/from16 v0, p3

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lu/x0;->a()Lx7/l;

    move-result-object v1

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/r;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object/from16 v7, p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p0}, Lu/x0;->a()Lx7/l;

    move-result-object v0

    move-object/from16 v7, p1

    invoke-interface {v0, v7}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu/r;

    invoke-static {v0}, Lu/s;->g(Lu/r;)Lu/r;

    move-result-object v0

    :goto_1
    new-instance v12, Lu/r0;

    move-object v1, v12

    move-object/from16 v2, p4

    move-object v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    new-instance v13, Lu/l;

    const/16 v10, 0x38

    const/4 v11, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v14, 0x0

    move-object v1, v13

    move-object v2, p0

    move-object/from16 v3, p1

    move-object v4, v0

    move-wide v7, v8

    move v9, v14

    invoke-direct/range {v1 .. v11}, Lu/l;-><init>(Lu/x0;Ljava/lang/Object;Lu/r;JJZILy7/k;)V

    new-instance v5, Lu/q0$a;

    move-object v0, p0

    move-object/from16 v1, p5

    invoke-direct {v5, v1, p0}, Lu/q0$a;-><init>(Lx7/p;Lu/x0;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    move-object v1, v13

    move-object v2, v12

    move-object/from16 v6, p6

    invoke-static/range {v1 .. v8}, Lu/q0;->f(Lu/l;Lu/e;JLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public static synthetic e(FFFLu/j;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_1

    const/4 p2, 0x7

    const/4 p3, 0x0

    invoke-static {v0, v0, p3, p2, p3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p3

    :cond_1
    move-object v4, p3

    move v1, p0

    move v2, p1

    move-object v5, p4

    move-object v6, p5

    invoke-static/range {v1 .. v6}, Lu/q0;->b(FFFLu/j;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lu/l;Lu/e;JLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-wide/high16 p2, -0x8000000000000000L

    :cond_0
    move-wide v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    sget-object p4, Lu/q0$c;->D:Lu/q0$c;

    :cond_1
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lu/q0;->c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lu/l;Lu/B;ZLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    invoke-virtual {p0}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lu/l;->q()Lu/r;

    move-result-object v1

    invoke-virtual {p0}, Lu/l;->n()Lu/x0;

    move-result-object v2

    new-instance v4, Lu/A;

    invoke-direct {v4, p1, v2, v0, v1}, Lu/A;-><init>(Lu/B;Lu/x0;Ljava/lang/Object;Lu/r;)V

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lu/l;->g()J

    move-result-wide p1

    :goto_0
    move-wide v5, p1

    goto :goto_1

    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    goto :goto_0

    :goto_1
    move-object v3, p0

    move-object v7, p3

    move-object v8, p4

    invoke-static/range {v3 .. v8}, Lu/q0;->c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static synthetic h(Lu/l;Lu/B;ZLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    sget-object p3, Lu/q0$g;->D:Lu/q0$g;

    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Lu/q0;->g(Lu/l;Lu/B;ZLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lu/l;Ljava/lang/Object;Lu/j;ZLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    invoke-virtual {p0}, Lu/l;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Lu/l;->n()Lu/x0;

    move-result-object v2

    invoke-virtual {p0}, Lu/l;->q()Lu/r;

    move-result-object v5

    new-instance v7, Lu/r0;

    move-object v0, v7

    move-object v1, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lu/r0;-><init>(Lu/j;Lu/x0;Ljava/lang/Object;Ljava/lang/Object;Lu/r;)V

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lu/l;->g()J

    move-result-wide v0

    :goto_0
    move-wide v8, v0

    goto :goto_1

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    goto :goto_0

    :goto_1
    move-object v6, p0

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-static/range {v6 .. v11}, Lu/q0;->c(Lu/l;Lu/e;JLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public static synthetic j(Lu/l;Ljava/lang/Object;Lu/j;ZLx7/l;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x7

    const/4 p7, 0x0

    const/4 v0, 0x0

    invoke-static {p7, p7, v0, p2, v0}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    sget-object p4, Lu/q0$h;->D:Lu/q0$h;

    :cond_2
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lu/q0;->i(Lu/l;Ljava/lang/Object;Lu/j;ZLx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lu/e;Lx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-interface {p0}, Lu/e;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Lu/P;->a(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lu/q0$i;

    invoke-direct {p0, p1}, Lu/q0$i;-><init>(Lx7/l;)V

    invoke-static {p0, p2}, LV/l0;->c(Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lu/i;JJLu/e;Lu/l;Lx7/l;)V
    .locals 0

    .prologue
    invoke-virtual {p0, p1, p2}, Lu/i;->j(J)V

    invoke-interface {p5, p3, p4}, Lu/e;->f(J)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu/i;->l(Ljava/lang/Object;)V

    invoke-interface {p5, p3, p4}, Lu/e;->d(J)Lu/r;

    move-result-object p1

    invoke-virtual {p0, p1}, Lu/i;->m(Lu/r;)V

    invoke-interface {p5, p3, p4}, Lu/e;->e(J)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lu/i;->c()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lu/i;->i(J)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lu/i;->k(Z)V

    :cond_0
    invoke-static {p0, p6}, Lu/q0;->o(Lu/i;Lu/l;)V

    invoke-interface {p7, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final m(Lu/i;JFLu/e;Lu/l;Lx7/l;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    invoke-interface {p4}, Lu/e;->b()J

    move-result-wide v0

    :goto_0
    move-wide v5, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lu/i;->d()J

    move-result-wide v0

    sub-long v0, p1, v0

    long-to-float v0, v0

    div-float/2addr v0, p3

    float-to-long v0, v0

    goto :goto_0

    :goto_1
    move-object v2, p0

    move-wide v3, p1

    move-object v7, p4

    move-object v8, p5

    move-object/from16 v9, p6

    invoke-static/range {v2 .. v9}, Lu/q0;->l(Lu/i;JJLu/e;Lu/l;Lx7/l;)V

    return-void
.end method

.method public static final n(Lm7/i;)F
    .locals 1

    .prologue
    sget-object v0, Lh0/k;->y:Lh0/k$b;

    invoke-interface {p0, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p0

    check-cast p0, Lh0/k;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lh0/k;->n0()F

    move-result p0

    goto :goto_0

    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    :goto_0
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "negative scale factor"

    invoke-static {v0}, Lu/e0;->b(Ljava/lang/String;)V

    :cond_2
    return p0
.end method

.method public static final o(Lu/i;Lu/l;)V
    .locals 2

    invoke-virtual {p0}, Lu/i;->e()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lu/l;->v(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lu/l;->q()Lu/r;

    move-result-object v0

    invoke-virtual {p0}, Lu/i;->g()Lu/r;

    move-result-object v1

    invoke-static {v0, v1}, Lu/s;->f(Lu/r;Lu/r;)V

    invoke-virtual {p0}, Lu/i;->b()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lu/l;->s(J)V

    invoke-virtual {p0}, Lu/i;->c()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lu/l;->t(J)V

    invoke-virtual {p0}, Lu/i;->h()Z

    move-result p0

    invoke-virtual {p1, p0}, Lu/l;->u(Z)V

    return-void
.end method
