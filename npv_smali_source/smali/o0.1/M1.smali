.class public abstract Lo0/M1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lq0/g;Lo0/L1;Lo0/n0;FLq0/h;Lo0/z0;I)V
    .locals 14

    .prologue
    move-object v0, p1

    instance-of v1, v0, Lo0/L1$b;

    if-eqz v1, :cond_0

    check-cast v0, Lo0/L1$b;

    invoke-virtual {v0}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v0

    invoke-static {v0}, Lo0/M1;->g(Ln0/i;)J

    move-result-wide v3

    invoke-static {v0}, Lo0/M1;->e(Ln0/i;)J

    move-result-wide v5

    move-object v1, p0

    move-object/from16 v2, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-interface/range {v1 .. v10}, Lq0/g;->C0(Lo0/n0;JJFLq0/h;Lo0/z0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lo0/L1$c;

    if-eqz v1, :cond_2

    check-cast v0, Lo0/L1$c;

    invoke-virtual {v0}, Lo0/L1$c;->c()Lo0/Q1;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    invoke-interface/range {v1 .. v7}, Lq0/g;->p1(Lo0/Q1;Lo0/n0;FLq0/h;Lo0/z0;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lo0/L1$c;->b()Ln0/k;

    move-result-object v0

    invoke-virtual {v0}, Ln0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    invoke-static {v0}, Lo0/M1;->h(Ln0/k;)J

    move-result-wide v4

    invoke-static {v0}, Lo0/M1;->f(Ln0/k;)J

    move-result-wide v6

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v8

    move-object v2, p0

    move-object/from16 v3, p2

    move/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move/from16 v13, p6

    invoke-interface/range {v2 .. v13}, Lq0/g;->d1(Lo0/n0;JJJFLq0/h;Lo0/z0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lo0/L1$a;

    if-eqz v1, :cond_3

    check-cast v0, Lo0/L1$a;

    invoke-virtual {v0}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object v2

    goto :goto_0

    :goto_1
    return-void

    :cond_3
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0
.end method

.method public static synthetic b(Lq0/g;Lo0/L1;Lo0/n0;FLq0/h;Lo0/z0;IILjava/lang/Object;)V
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    if-eqz p3, :cond_1

    sget-object p4, Lq0/l;->a:Lq0/l;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v5, p5

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    sget-object p3, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {p3}, Lq0/g$a;->a()I

    move-result p6

    :cond_3
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v6}, Lo0/M1;->a(Lq0/g;Lo0/L1;Lo0/n0;FLq0/h;Lo0/z0;I)V

    return-void
.end method

.method public static final c(Lq0/g;Lo0/L1;JFLq0/h;Lo0/z0;I)V
    .locals 15

    .prologue
    move-object/from16 v0, p1

    instance-of v1, v0, Lo0/L1$b;

    if-eqz v1, :cond_0

    check-cast v0, Lo0/L1$b;

    invoke-virtual {v0}, Lo0/L1$b;->b()Ln0/i;

    move-result-object v0

    invoke-static {v0}, Lo0/M1;->g(Ln0/i;)J

    move-result-wide v4

    invoke-static {v0}, Lo0/M1;->e(Ln0/i;)J

    move-result-wide v6

    move-object v1, p0

    move-wide/from16 v2, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-interface/range {v1 .. v11}, Lq0/g;->U0(JJJFLq0/h;Lo0/z0;I)V

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lo0/L1$c;

    if-eqz v1, :cond_2

    check-cast v0, Lo0/L1$c;

    invoke-virtual {v0}, Lo0/L1$c;->c()Lo0/Q1;

    move-result-object v2

    if-eqz v2, :cond_1

    :goto_0
    move-object v1, p0

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    invoke-interface/range {v1 .. v8}, Lq0/g;->Q0(Lo0/Q1;JFLq0/h;Lo0/z0;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lo0/L1$c;->b()Ln0/k;

    move-result-object v0

    invoke-virtual {v0}, Ln0/k;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/a;->d(J)F

    move-result v1

    invoke-static {v0}, Lo0/M1;->h(Ln0/k;)J

    move-result-wide v5

    invoke-static {v0}, Lo0/M1;->f(Ln0/k;)J

    move-result-wide v7

    const/4 v0, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v3, v0, v2}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v9

    move-object v2, p0

    move-wide/from16 v3, p2

    move-object/from16 v11, p5

    move/from16 v12, p4

    move-object/from16 v13, p6

    move/from16 v14, p7

    invoke-interface/range {v2 .. v14}, Lq0/g;->a0(JJJJLq0/h;FLo0/z0;I)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lo0/L1$a;

    if-eqz v1, :cond_3

    check-cast v0, Lo0/L1$a;

    invoke-virtual {v0}, Lo0/L1$a;->b()Lo0/Q1;

    move-result-object v2

    goto :goto_0

    :goto_1
    return-void

    :cond_3
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0
.end method

.method public static synthetic d(Lq0/g;Lo0/L1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V
    .locals 9

    .prologue
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/high16 v0, 0x3f800000    # 1.0f

    move v5, v0

    goto :goto_0

    :cond_0
    move v5, p4

    :goto_0
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_1

    sget-object v0, Lq0/l;->a:Lq0/l;

    move-object v6, v0

    goto :goto_1

    :cond_1
    move-object v6, p5

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v7, v0

    goto :goto_2

    :cond_2
    move-object v7, p6

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    sget-object v0, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v0}, Lq0/g$a;->a()I

    move-result v0

    move v8, v0

    goto :goto_3

    :cond_3
    move/from16 v8, p7

    :goto_3
    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-static/range {v1 .. v8}, Lo0/M1;->c(Lq0/g;Lo0/L1;JFLq0/h;Lo0/z0;I)V

    return-void
.end method

.method private static final e(Ln0/i;)J
    .locals 2

    invoke-virtual {p0}, Ln0/i;->n()F

    move-result v0

    invoke-virtual {p0}, Ln0/i;->h()F

    move-result p0

    invoke-static {v0, p0}, Ln0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(Ln0/k;)J
    .locals 2

    invoke-virtual {p0}, Ln0/k;->j()F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->d()F

    move-result p0

    invoke-static {v0, p0}, Ln0/n;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final g(Ln0/i;)J
    .locals 2

    invoke-virtual {p0}, Ln0/i;->i()F

    move-result v0

    invoke-virtual {p0}, Ln0/i;->l()F

    move-result p0

    invoke-static {v0, p0}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final h(Ln0/k;)J
    .locals 2

    invoke-virtual {p0}, Ln0/k;->e()F

    move-result v0

    invoke-virtual {p0}, Ln0/k;->g()F

    move-result p0

    invoke-static {v0, p0}, Ln0/h;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method
