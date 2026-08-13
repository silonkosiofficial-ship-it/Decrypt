.class public abstract Lio/ktor/utils/io/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;JLm7/e;)Ljava/lang/Object;
    .locals 17

    .prologue
    move-object/from16 v0, p4

    instance-of v1, v0, Lio/ktor/utils/io/f$b;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/ktor/utils/io/f$b;

    iget v2, v1, Lio/ktor/utils/io/f$b;->K:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/ktor/utils/io/f$b;->K:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/ktor/utils/io/f$b;

    invoke-direct {v1, v0}, Lio/ktor/utils/io/f$b;-><init>(Lm7/e;)V

    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/f$b;->J:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lio/ktor/utils/io/f$b;->K:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_6

    if-eq v3, v7, :cond_5

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, v1, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    iget-wide v2, v1, Lio/ktor/utils/io/f$b;->I:J

    iget-wide v4, v1, Lio/ktor/utils/io/f$b;->H:J

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-wide v9, v1, Lio/ktor/utils/io/f$b;->I:J

    iget-wide v11, v1, Lio/ktor/utils/io/f$b;->H:J

    iget-object v3, v1, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/g;

    iget-object v13, v1, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    check-cast v13, Lio/ktor/utils/io/d;

    :try_start_0
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    move-object/from16 v16, v13

    move-object v13, v1

    move-object/from16 v1, v16

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :cond_5
    iget-wide v9, v1, Lio/ktor/utils/io/f$b;->I:J

    iget-wide v11, v1, Lio/ktor/utils/io/f$b;->H:J

    iget-object v3, v1, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/g;

    iget-object v13, v1, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    check-cast v13, Lio/ktor/utils/io/d;

    :try_start_1
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_6
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-wide/from16 v9, p2

    move-wide v11, v9

    move-object v13, v1

    move-object/from16 v1, p0

    :goto_1
    :try_start_2
    invoke-interface {v1}, Lio/ktor/utils/io/d;->h()Z

    move-result v0

    if-nez v0, :cond_8

    const-wide/16 v14, 0x0

    cmp-long v0, v9, v14

    if-lez v0, :cond_8

    invoke-interface {v1}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v0}, Lo9/q;->j()Z

    move-result v0

    if-eqz v0, :cond_7

    iput-object v1, v13, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    iput-object v3, v13, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    iput-wide v11, v13, Lio/ktor/utils/io/f$b;->H:J

    iput-wide v9, v13, Lio/ktor/utils/io/f$b;->I:J

    iput v7, v13, Lio/ktor/utils/io/f$b;->K:I

    const/4 v0, 0x0

    invoke-static {v1, v0, v13, v7, v8}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v2, :cond_7

    return-object v2

    :catchall_1
    move-exception v0

    move-object/from16 v16, v13

    move-object v13, v1

    move-object/from16 v1, v16

    goto :goto_5

    :cond_7
    move-object/from16 v16, v13

    move-object v13, v1

    move-object/from16 v1, v16

    :goto_2
    :try_start_3
    invoke-interface {v13}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-static {v0}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v14

    invoke-static {v9, v10, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    invoke-interface {v13}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v3}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v7

    invoke-interface {v0, v7, v14, v15}, Lo9/q;->s1(Lo9/g;J)V

    sub-long/2addr v9, v14

    iput-object v13, v1, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    iput-object v3, v1, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    iput-wide v11, v1, Lio/ktor/utils/io/f$b;->H:J

    iput-wide v9, v1, Lio/ktor/utils/io/f$b;->I:J

    iput v6, v1, Lio/ktor/utils/io/f$b;->K:I

    invoke-interface {v3, v1}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v2, :cond_4

    return-object v2

    :goto_3
    const/4 v7, 0x1

    goto :goto_1

    :cond_8
    iput-object v8, v13, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    iput-object v8, v13, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    iput-wide v11, v13, Lio/ktor/utils/io/f$b;->H:J

    iput-wide v9, v13, Lio/ktor/utils/io/f$b;->I:J

    iput v5, v13, Lio/ktor/utils/io/f$b;->K:I

    invoke-interface {v3, v13}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    return-object v2

    :cond_9
    move-wide v2, v9

    move-wide v4, v11

    :goto_4
    sub-long/2addr v4, v2

    invoke-static {v4, v5}, Lo7/b;->d(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :goto_5
    :try_start_4
    invoke-interface {v13, v0}, Lio/ktor/utils/io/d;->k(Ljava/lang/Throwable;)V

    invoke-static {v3, v0}, Lio/ktor/utils/io/k;->c(Lio/ktor/utils/io/g;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    iput-object v0, v1, Lio/ktor/utils/io/f$b;->F:Ljava/lang/Object;

    iput-object v8, v1, Lio/ktor/utils/io/f$b;->G:Ljava/lang/Object;

    iput v4, v1, Lio/ktor/utils/io/f$b;->K:I

    invoke-interface {v3, v1}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_a

    return-object v2

    :cond_a
    move-object v1, v0

    :goto_6
    throw v1
.end method

.method public static final b(Lio/ktor/utils/io/d;Lio/ktor/utils/io/g;Lm7/e;)Ljava/lang/Object;
    .locals 16

    .prologue
    move-object/from16 v0, p2

    instance-of v1, v0, Lio/ktor/utils/io/f$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/ktor/utils/io/f$a;

    iget v2, v1, Lio/ktor/utils/io/f$a;->J:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/ktor/utils/io/f$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/ktor/utils/io/f$a;

    invoke-direct {v1, v0}, Lio/ktor/utils/io/f$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object v0, v1, Lio/ktor/utils/io/f$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lio/ktor/utils/io/f$a;->J:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_6

    if-eq v3, v7, :cond_5

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, v1, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    iget-wide v1, v1, Lio/ktor/utils/io/f$a;->H:J

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    iget-wide v9, v1, Lio/ktor/utils/io/f$a;->H:J

    iget-object v3, v1, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/g;

    iget-object v11, v1, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    check-cast v11, Lio/ktor/utils/io/d;

    :try_start_0
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    move-wide v14, v9

    move-object v9, v1

    move-object v1, v11

    move-wide v10, v14

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_5
    iget-wide v9, v1, Lio/ktor/utils/io/f$a;->H:J

    iget-object v3, v1, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    check-cast v3, Lio/ktor/utils/io/g;

    iget-object v11, v1, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    check-cast v11, Lio/ktor/utils/io/d;

    :try_start_1
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_6
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    const-wide/16 v9, 0x0

    move-object/from16 v3, p1

    move-wide v10, v9

    move-object v9, v1

    move-object/from16 v1, p0

    :goto_1
    :try_start_2
    invoke-interface {v1}, Lio/ktor/utils/io/d;->h()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-interface {v1}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v0

    invoke-interface {v3}, Lio/ktor/utils/io/g;->c()Lo9/p;

    move-result-object v12

    invoke-interface {v0, v12}, Lo9/q;->t(Lo9/g;)J

    move-result-wide v12

    add-long/2addr v10, v12

    iput-object v1, v9, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    iput-object v3, v9, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    iput-wide v10, v9, Lio/ktor/utils/io/f$a;->H:J

    iput v7, v9, Lio/ktor/utils/io/f$a;->J:I

    invoke-interface {v3, v9}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v0, v2, :cond_7

    return-object v2

    :cond_7
    move-wide v14, v10

    move-object v11, v1

    move-object v1, v9

    move-wide v9, v14

    :goto_2
    :try_start_3
    iput-object v11, v1, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    iput-object v3, v1, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    iput-wide v9, v1, Lio/ktor/utils/io/f$a;->H:J

    iput v6, v1, Lio/ktor/utils/io/f$a;->J:I

    const/4 v0, 0x0

    invoke-static {v11, v0, v1, v7, v8}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v2, :cond_4

    return-object v2

    :catchall_1
    move-exception v0

    move-object v11, v1

    move-object v1, v9

    goto :goto_4

    :cond_8
    iput-object v8, v9, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    iput-object v8, v9, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    iput-wide v10, v9, Lio/ktor/utils/io/f$a;->H:J

    iput v5, v9, Lio/ktor/utils/io/f$a;->J:I

    invoke-interface {v3, v9}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    return-object v2

    :cond_9
    move-wide v1, v10

    :goto_3
    invoke-static {v1, v2}, Lo7/b;->d(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :goto_4
    :try_start_4
    invoke-interface {v11, v0}, Lio/ktor/utils/io/d;->k(Ljava/lang/Throwable;)V

    invoke-static {v3, v0}, Lio/ktor/utils/io/k;->c(Lio/ktor/utils/io/g;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    iput-object v0, v1, Lio/ktor/utils/io/f$a;->F:Ljava/lang/Object;

    iput-object v8, v1, Lio/ktor/utils/io/f$a;->G:Ljava/lang/Object;

    iput v4, v1, Lio/ktor/utils/io/f$a;->J:I

    invoke-interface {v3, v1}, Lio/ktor/utils/io/g;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_a

    return-object v2

    :cond_a
    move-object v1, v0

    :goto_5
    throw v1
.end method

.method public static final c(Lio/ktor/utils/io/d;)I
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object p0

    invoke-interface {p0}, Lo9/q;->d()Lo9/a;

    move-result-object p0

    invoke-virtual {p0}, Lo9/a;->r()J

    move-result-wide v0

    long-to-int p0, v0

    return p0
.end method

.method public static final d(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, Lio/ktor/utils/io/f$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/f$c;

    iget v1, v0, Lio/ktor/utils/io/f$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/f$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/f$c;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/f$c;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/f$c;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/f$c;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/ktor/utils/io/f$c;->G:Ljava/lang/Object;

    check-cast p0, Lo9/a;

    iget-object v2, v0, Lio/ktor/utils/io/f$c;->F:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/d;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, p0

    move-object p0, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p1, Lo9/a;

    invoke-direct {p1}, Lo9/a;-><init>()V

    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/d;->h()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-virtual {p1, v2}, Lo9/a;->X(Lo9/h;)J

    iput-object p0, v0, Lio/ktor/utils/io/f$c;->F:Ljava/lang/Object;

    iput-object p1, v0, Lio/ktor/utils/io/f$c;->G:Ljava/lang/Object;

    iput v3, v0, Lio/ktor/utils/io/f$c;->I:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v2, v0, v3, v4}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/d;->a()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_5

    return-object p1

    :cond_5
    throw p0
.end method

.method public static final e(Lio/ktor/utils/io/d;ILm7/e;)Ljava/lang/Object;
    .locals 11

    .prologue
    instance-of v0, p2, Lio/ktor/utils/io/f$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/ktor/utils/io/f$d;

    iget v1, v0, Lio/ktor/utils/io/f$d;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/f$d;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/f$d;

    invoke-direct {v0, p2}, Lio/ktor/utils/io/f$d;-><init>(Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/f$d;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/f$d;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Lio/ktor/utils/io/f$d;->H:I

    iget-object p1, v0, Lio/ktor/utils/io/f$d;->G:Ljava/lang/Object;

    check-cast p1, Lo9/a;

    iget-object v2, v0, Lio/ktor/utils/io/f$d;->F:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/d;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance p2, Lo9/a;

    invoke-direct {p2}, Lo9/a;-><init>()V

    move-object v10, p2

    move p2, p1

    move-object p1, v10

    :goto_1
    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide v4

    int-to-long v6, p2

    cmp-long v2, v4, v6

    if-gez v2, :cond_6

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-interface {v2}, Lo9/q;->j()Z

    move-result v2

    if-eqz v2, :cond_4

    iput-object p0, v0, Lio/ktor/utils/io/f$d;->F:Ljava/lang/Object;

    iput-object p1, v0, Lio/ktor/utils/io/f$d;->G:Ljava/lang/Object;

    iput p2, v0, Lio/ktor/utils/io/f$d;->H:I

    iput v3, v0, Lio/ktor/utils/io/f$d;->J:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v2, v0, v3, v4}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v2, p0

    move p0, p2

    :goto_2
    move p2, p0

    move-object p0, v2

    :cond_4
    invoke-interface {p0}, Lio/ktor/utils/io/d;->h()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-static {v2}, Ld7/d;->d(Lo9/q;)J

    move-result-wide v4

    int-to-long v6, p2

    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide v8

    sub-long v8, v6, v8

    cmp-long v2, v4, v8

    if-lez v2, :cond_5

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide v4

    sub-long/2addr v6, v4

    invoke-interface {v2, p1, v6, v7}, Lo9/q;->s1(Lo9/g;J)V

    goto :goto_1

    :cond_5
    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-interface {v2, p1}, Lo9/q;->t(Lo9/g;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lo7/b;->d(J)Ljava/lang/Long;

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide v0

    int-to-long v2, p2

    cmp-long p0, v0, v2

    if-ltz p0, :cond_7

    return-object p1

    :cond_7
    new-instance p0, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not enough data available, required "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " bytes but only "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lo9/a;->r()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " available"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final f(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, Lio/ktor/utils/io/f$e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/f$e;

    iget v1, v0, Lio/ktor/utils/io/f$e;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/f$e;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/f$e;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/f$e;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/f$e;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/f$e;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/ktor/utils/io/f$e;->G:Ljava/lang/Object;

    check-cast p0, Lo9/p;

    iget-object v2, v0, Lio/ktor/utils/io/f$e;->F:Ljava/lang/Object;

    check-cast v2, Lio/ktor/utils/io/d;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p1, p0

    move-object p0, v2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static {}, Ld7/c;->a()Lo9/p;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/utils/io/d;->h()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {p0}, Lio/ktor/utils/io/d;->d()Lo9/q;

    move-result-object v2

    invoke-interface {p1, v2}, Lo9/p;->X(Lo9/h;)J

    iput-object p0, v0, Lio/ktor/utils/io/f$e;->F:Ljava/lang/Object;

    iput-object p1, v0, Lio/ktor/utils/io/f$e;->G:Ljava/lang/Object;

    iput v3, v0, Lio/ktor/utils/io/f$e;->I:I

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {p0, v2, v0, v3, v4}, Lio/ktor/utils/io/d$b;->a(Lio/ktor/utils/io/d;ILm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    return-object v1

    :cond_4
    invoke-static {p0}, Lio/ktor/utils/io/f;->h(Lio/ktor/utils/io/d;)V

    invoke-interface {p1}, Lo9/p;->d()Lo9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lio/ktor/utils/io/a;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/ktor/utils/io/a;->a()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    throw p0
.end method

.method public static final h(Lio/ktor/utils/io/d;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/ktor/utils/io/d;->a()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    throw p0
.end method

.method public static final i(Lio/ktor/utils/io/g;)V
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/ktor/utils/io/g;->a()Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    throw p0
.end method

.method public static final j(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p1, Lio/ktor/utils/io/f$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/ktor/utils/io/f$f;

    iget v1, v0, Lio/ktor/utils/io/f$f;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/ktor/utils/io/f$f;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/ktor/utils/io/f$f;

    invoke-direct {v0, p1}, Lio/ktor/utils/io/f$f;-><init>(Lm7/e;)V

    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/f$f;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lio/ktor/utils/io/f$f;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iput v3, v0, Lio/ktor/utils/io/f$f;->G:I

    invoke-static {p0, v0}, Lio/ktor/utils/io/f;->d(Lio/ktor/utils/io/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lo9/a;

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p0, v3, v0}, Ld7/b;->b(Lo9/a;IILjava/lang/Object;)[B

    move-result-object p0

    return-object p0
.end method
