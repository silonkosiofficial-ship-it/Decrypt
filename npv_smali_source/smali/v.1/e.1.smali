.class public abstract Lv/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lo0/Q1;Ln0/k;FZ)Lo0/Q1;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv/e;->h(Lo0/Q1;Ln0/k;FZ)Lo0/Q1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ll0/d;)Ll0/h;
    .locals 0

    invoke-static {p0}, Lv/e;->i(Ll0/d;)Ll0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ll0/d;Lo0/n0;JJZF)Ll0/h;
    .locals 0

    invoke-static/range {p0 .. p7}, Lv/e;->j(Ll0/d;Lo0/n0;JJZF)Ll0/h;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(JF)J
    .locals 0

    invoke-static {p0, p1, p2}, Lv/e;->k(JF)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(Landroidx/compose/ui/d;Lv/g;Lo0/e2;)Landroidx/compose/ui/d;
    .locals 1

    invoke-virtual {p1}, Lv/g;->b()F

    move-result v0

    invoke-virtual {p1}, Lv/g;->a()Lo0/n0;

    move-result-object p1

    invoke-static {p0, v0, p1, p2}, Lv/e;->f(Landroidx/compose/ui/d;FLo0/n0;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/d;FLo0/n0;Lo0/e2;)Landroidx/compose/ui/d;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/BorderModifierNodeElement;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/compose/foundation/BorderModifierNodeElement;-><init>(FLo0/n0;Lo0/e2;Ly7/k;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final g(FLn0/k;)Ln0/k;
    .locals 15

    move v2, p0

    invoke-virtual/range {p1 .. p1}, Ln0/k;->j()F

    move-result v0

    sub-float v3, v0, v2

    invoke-virtual/range {p1 .. p1}, Ln0/k;->d()F

    move-result v0

    sub-float v4, v0, v2

    invoke-virtual/range {p1 .. p1}, Ln0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lv/e;->k(JF)J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Ln0/k;->i()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lv/e;->k(JF)J

    move-result-wide v7

    invoke-virtual/range {p1 .. p1}, Ln0/k;->b()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lv/e;->k(JF)J

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Ln0/k;->c()J

    move-result-wide v0

    invoke-static {v0, v1, p0}, Lv/e;->k(JF)J

    move-result-wide v9

    new-instance v14, Ln0/k;

    const/4 v13, 0x0

    move-object v0, v14

    move v1, p0

    invoke-direct/range {v0 .. v13}, Ln0/k;-><init>(FFFFJJJJLy7/k;)V

    return-object v14
.end method

.method private static final h(Lo0/Q1;Ln0/k;FZ)Lo0/Q1;
    .locals 2

    .prologue
    invoke-interface {p0}, Lo0/Q1;->a()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lo0/P1;->c(Lo0/Q1;Ln0/k;Lo0/Q1$b;ILjava/lang/Object;)V

    if-nez p3, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p3

    invoke-static {p2, p1}, Lv/e;->g(FLn0/k;)Ln0/k;

    move-result-object p1

    invoke-static {p3, p1, v0, v1, v0}, Lo0/P1;->c(Lo0/Q1;Ln0/k;Lo0/Q1$b;ILjava/lang/Object;)V

    sget-object p1, Lo0/U1;->a:Lo0/U1$a;

    invoke-virtual {p1}, Lo0/U1$a;->a()I

    move-result p1

    invoke-interface {p0, p0, p3, p1}, Lo0/Q1;->j(Lo0/Q1;Lo0/Q1;I)Z

    :cond_0
    return-object p0
.end method

.method private static final i(Ll0/d;)Ll0/h;
    .locals 1

    sget-object v0, Lv/e$a;->D:Lv/e$a;

    invoke-virtual {p0, v0}, Ll0/d;->s(Lx7/l;)Ll0/h;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ll0/d;Lo0/n0;JJZF)Ll0/h;
    .locals 16

    .prologue
    if-eqz p6, :cond_0

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v0

    move-wide v4, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p2

    :goto_0
    if-eqz p6, :cond_1

    invoke-virtual/range {p0 .. p0}, Ll0/d;->i()J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p4

    :goto_1
    if-eqz p6, :cond_2

    sget-object v0, Lq0/l;->a:Lq0/l;

    move-object v8, v0

    goto :goto_2

    :cond_2
    new-instance v0, Lq0/m;

    const/16 v14, 0x1e

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v8, v0

    move/from16 v9, p7

    invoke-direct/range {v8 .. v15}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    :goto_2
    new-instance v0, Lv/e$b;

    move-object v2, v0

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v8}, Lv/e$b;-><init>(Lo0/n0;JJLq0/h;)V

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ll0/d;->s(Lx7/l;)Ll0/h;

    move-result-object v0

    return-object v0
.end method

.method private static final k(JF)J
    .locals 2

    invoke-static {p0, p1}, Ln0/a;->d(J)F

    move-result v0

    sub-float/2addr v0, p2

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p0, p1}, Ln0/a;->e(J)F

    move-result p0

    sub-float/2addr p0, p2

    invoke-static {v1, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {v0, p0}, Ln0/b;->a(FF)J

    move-result-wide p0

    return-wide p0
.end method
