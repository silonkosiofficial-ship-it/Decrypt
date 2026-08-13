.class public abstract Landroidx/compose/foundation/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;
    .locals 10

    .prologue
    move-object v1, p1

    move-object v2, p2

    instance-of v0, v2, Lv/I;

    if-eqz v0, :cond_0

    check-cast v2, Lv/I;

    new-instance v8, Landroidx/compose/foundation/ClickableElement;

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    :goto_0
    move-object v0, p0

    goto :goto_1

    :cond_0
    if-nez v2, :cond_1

    new-instance v8, Landroidx/compose/foundation/ClickableElement;

    const/4 v7, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    move-object v1, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v0, p1, p2}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;

    move-result-object v8

    new-instance v9, Landroidx/compose/foundation/ClickableElement;

    const/4 v7, 0x0

    const/4 v2, 0x0

    move-object v0, v9

    move-object v1, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/ClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ly7/k;)V

    invoke-interface {v8, v9}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v8

    goto :goto_0

    :cond_2
    sget-object v6, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v7, Landroidx/compose/foundation/d$b;

    move-object v0, v7

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/d$b;-><init>(Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v6, v1, v7, v0, v1}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v8

    goto :goto_0

    :goto_1
    invoke-interface {p0, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 7

    .prologue
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p3, 0x1

    :cond_0
    move v3, p3

    and-int/lit8 p3, p7, 0x8

    const/4 p8, 0x0

    if-eqz p3, :cond_1

    move-object v4, p8

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    move-object v5, p8

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p6

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/d$c;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/d$c;-><init>(ZLjava/lang/String;LK0/h;Lx7/a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v1, Landroidx/compose/foundation/d$a;

    invoke-direct {v1, p1, p2, p3, p4}, Landroidx/compose/foundation/d$a;-><init>(ZLjava/lang/String;LK0/h;Lx7/a;)V

    invoke-static {p0, v0, v1}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 1

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/d;->c(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/d;Lz/l;Lv/G;ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;)Landroidx/compose/ui/d;
    .locals 13

    .prologue
    move-object v1, p1

    move-object v2, p2

    instance-of v0, v2, Lv/I;

    if-eqz v0, :cond_0

    check-cast v2, Lv/I;

    new-instance v11, Landroidx/compose/foundation/CombinedClickableElement;

    const/4 v10, 0x0

    move-object v0, v11

    move-object v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p9

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Ly7/k;)V

    :goto_0
    move-object v0, p0

    goto/16 :goto_1

    :cond_0
    if-nez v2, :cond_1

    new-instance v11, Landroidx/compose/foundation/CombinedClickableElement;

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object v0, v11

    move-object v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p9

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Ly7/k;)V

    goto :goto_0

    :cond_1
    if-eqz v1, :cond_2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {v0, p1, p2}, Landroidx/compose/foundation/h;->b(Landroidx/compose/ui/d;Lz/j;Lv/G;)Landroidx/compose/ui/d;

    move-result-object v11

    new-instance v12, Landroidx/compose/foundation/CombinedClickableElement;

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object v0, v12

    move-object v1, p1

    move/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p9

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/CombinedClickableElement;-><init>(Lz/l;Lv/I;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;Ly7/k;)V

    invoke-interface {v11, v12}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v11

    goto :goto_0

    :cond_2
    sget-object v9, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v10, Landroidx/compose/foundation/d$e;

    move-object v0, v10

    move-object v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p9

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/d$e;-><init>(Lv/G;ZLjava/lang/String;LK0/h;Lx7/a;Ljava/lang/String;Lx7/a;Lx7/a;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v9, v1, v10, v0, v1}, Landroidx/compose/ui/c;->c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v11

    goto :goto_0

    :goto_1
    invoke-interface {p0, v11}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;)Landroidx/compose/ui/d;
    .locals 10

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/compose/foundation/d$f;

    move-object v1, v0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p7

    move-object/from16 v6, p6

    move-object v7, p5

    move-object v8, p4

    invoke-direct/range {v1 .. v8}, Landroidx/compose/foundation/d$f;-><init>(ZLjava/lang/String;LK0/h;Lx7/a;Lx7/a;Lx7/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v9, Landroidx/compose/foundation/d$d;

    move-object v1, v9

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Landroidx/compose/foundation/d$d;-><init>(ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;)V

    move-object v1, p0

    invoke-static {p0, v0, v9}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 9

    .prologue
    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v0, p8, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v3, v1

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_2

    move-object v4, v1

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v0, p8, 0x8

    if-eqz v0, :cond_3

    move-object v5, v1

    goto :goto_3

    :cond_3
    move-object v5, p4

    :goto_3
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_4

    move-object v6, v1

    goto :goto_4

    :cond_4
    move-object v6, p5

    :goto_4
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_5

    move-object v7, v1

    goto :goto_5

    :cond_5
    move-object v7, p6

    :goto_5
    move-object v1, p0

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, Landroidx/compose/foundation/d;->f(Landroidx/compose/ui/d;ZLjava/lang/String;LK0/h;Ljava/lang/String;Lx7/a;Lx7/a;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public static final h(LF0/E0;)Z
    .locals 3

    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    sget-object v1, Lx/x;->R:Lx/x$a;

    new-instance v2, Landroidx/compose/foundation/d$g;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/d$g;-><init>(Ly7/K;)V

    invoke-static {p0, v1, v2}, LF0/F0;->c(LF0/j;Ljava/lang/Object;Lx7/l;)V

    iget-boolean p0, v0, Ly7/K;->C:Z

    return p0
.end method
