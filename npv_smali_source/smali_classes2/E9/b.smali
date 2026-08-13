.class public abstract LE9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FF)LE9/a;
    .locals 8

    const-string v0, "createTransition"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destroyTransition"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pauseTransition"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resumeTransition"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LE9/b$a;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    invoke-direct/range {v1 .. v7}, LE9/b$a;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FF)V

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FFILjava/lang/Object;)LE9/a;
    .locals 12

    .prologue
    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {v3, v2, v1, v3}, Landroidx/compose/animation/f;->o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v0

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v4, 0x0

    const v5, 0x3f666666    # 0.9f

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/animation/f;->s(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_1

    invoke-static {v3, v2, v1, v3}, Landroidx/compose/animation/f;->q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v4

    const/4 v9, 0x5

    const/4 v10, 0x0

    const/4 v5, 0x0

    const v6, 0x3f666666    # 0.9f

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/animation/f;->u(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, p1

    :goto_1
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_2

    invoke-static {v3, v2, v1, v3}, Landroidx/compose/animation/f;->q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v5

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/4 v6, 0x0

    const v7, 0x3f8ccccd    # 1.1f

    const-wide/16 v8, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/f;->u(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/j;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, p2

    :goto_2
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_3

    invoke-static {v3, v2, v1, v3}, Landroidx/compose/animation/f;->o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v1

    const/4 v10, 0x5

    const/4 v11, 0x0

    const/4 v6, 0x0

    const v7, 0x3f8ccccd    # 1.1f

    const-wide/16 v8, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/f;->s(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, p3

    :goto_3
    and-int/lit8 v3, p6, 0x10

    if-eqz v3, :cond_4

    move v3, v2

    goto :goto_4

    :cond_4
    move/from16 v3, p4

    :goto_4
    and-int/lit8 v6, p6, 0x20

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v2, p5

    :goto_5
    move-object p0, v0

    move-object p1, v4

    move-object p2, v5

    move-object p3, v1

    move/from16 p4, v3

    move/from16 p5, v2

    invoke-static/range {p0 .. p5}, LE9/b;->a(Landroidx/compose/animation/h;Landroidx/compose/animation/j;Landroidx/compose/animation/j;Landroidx/compose/animation/h;FF)LE9/a;

    move-result-object v0

    return-object v0
.end method
