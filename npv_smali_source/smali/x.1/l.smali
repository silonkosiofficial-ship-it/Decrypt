.class public abstract Lx/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x3fc0000000000000L    # 0.125

    double-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, Lx/l;->a:F

    const/16 v1, 0x12

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, Lx/l;->b:F

    div-float/2addr v0, v1

    sput v0, Lx/l;->c:F

    return-void
.end method

.method public static final synthetic a(Lz0/p;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lx/l;->h(Lz0/p;J)Z

    move-result p0

    return p0
.end method

.method public static final b(Lz0/c;JLm7/e;)Ljava/lang/Object;
    .locals 17

    .prologue
    move-wide/from16 v0, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lx/l$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lx/l$a;

    iget v4, v3, Lx/l$a;->I:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lx/l$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v3, Lx/l$a;

    invoke-direct {v3, v2}, Lx/l$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object v2, v3, Lx/l$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v4

    iget v5, v3, Lx/l$a;->I:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v0, v3, Lx/l$a;->G:Ljava/lang/Object;

    check-cast v0, Ly7/N;

    iget-object v1, v3, Lx/l$a;->F:Ljava/lang/Object;

    check-cast v1, Lz0/c;

    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v1

    move-object v1, v0

    move-object/from16 v0, v16

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v2}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-interface/range {p0 .. p0}, Lz0/c;->L()Lz0/p;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lx/l;->h(Lz0/p;J)Z

    move-result v2

    if-eqz v2, :cond_3

    return-object v7

    :cond_3
    new-instance v2, Ly7/N;

    invoke-direct {v2}, Ly7/N;-><init>()V

    iput-wide v0, v2, Ly7/N;->C:J

    move-object/from16 v0, p0

    :goto_1
    iput-object v0, v3, Lx/l$a;->F:Ljava/lang/Object;

    iput-object v2, v3, Lx/l$a;->G:Ljava/lang/Object;

    iput v6, v3, Lx/l$a;->I:I

    invoke-static {v0, v7, v3, v6, v7}, Lz0/b;->a(Lz0/c;Lz0/r;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_4

    return-object v4

    :cond_4
    move-object/from16 v16, v2

    move-object v2, v1

    move-object/from16 v1, v16

    :goto_2
    check-cast v2, Lz0/p;

    invoke-virtual {v2}, Lz0/p;->c()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_3
    if-ge v10, v8, :cond_6

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lz0/B;

    invoke-virtual {v12}, Lz0/B;->f()J

    move-result-wide v12

    iget-wide v14, v1, Ly7/N;->C:J

    invoke-static {v12, v13, v14, v15}, Lz0/A;->d(JJ)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move-object v11, v7

    :goto_4
    check-cast v11, Lz0/B;

    if-nez v11, :cond_7

    move-object v11, v7

    goto :goto_7

    :cond_7
    invoke-static {v11}, Lz0/q;->d(Lz0/B;)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2}, Lz0/p;->c()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_5
    if-ge v9, v5, :cond_9

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lz0/B;

    invoke-virtual {v10}, Lz0/B;->i()Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_9
    move-object v8, v7

    :goto_6
    check-cast v8, Lz0/B;

    if-nez v8, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Lz0/B;->f()J

    move-result-wide v8

    iput-wide v8, v1, Ly7/N;->C:J

    goto :goto_8

    :cond_b
    invoke-static {v11}, Lz0/q;->j(Lz0/B;)Z

    move-result v2

    if-eqz v2, :cond_d

    :goto_7
    if-eqz v11, :cond_c

    invoke-virtual {v11}, Lz0/B;->p()Z

    move-result v0

    if-nez v0, :cond_c

    move-object v7, v11

    :cond_c
    return-object v7

    :cond_d
    :goto_8
    move-object v2, v1

    goto :goto_1
.end method

.method public static final c(Lz0/c;JLm7/e;)Ljava/lang/Object;
    .locals 9

    .prologue
    instance-of v0, p3, Lx/l$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lx/l$b;

    iget v1, v0, Lx/l$b;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/l$b;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/l$b;

    invoke-direct {v0, p3}, Lx/l$b;-><init>(Lm7/e;)V

    :goto_0
    iget-object p3, v0, Lx/l$b;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/l$b;->I:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lx/l$b;->G:Ljava/lang/Object;

    check-cast p0, Ly7/O;

    iget-object p1, v0, Lx/l$b;->F:Ljava/lang/Object;

    check-cast p1, Lz0/B;

    :try_start_0
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lz0/s; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p3

    invoke-static {p3, p1, p2}, Lx/l;->h(Lz0/p;J)Z

    move-result p3

    if-eqz p3, :cond_3

    return-object v4

    :cond_3
    invoke-interface {p0}, Lz0/c;->L()Lz0/p;

    move-result-object p3

    invoke-virtual {p3}, Lz0/p;->c()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v2, :cond_5

    invoke-interface {p3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lz0/B;

    invoke-virtual {v7}, Lz0/B;->f()J

    move-result-wide v7

    invoke-static {v7, v8, p1, p2}, Lz0/A;->d(JJ)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_5
    move-object v6, v4

    :goto_2
    move-object p1, v6

    check-cast p1, Lz0/B;

    if-nez p1, :cond_6

    return-object v4

    :cond_6
    new-instance p2, Ly7/O;

    invoke-direct {p2}, Ly7/O;-><init>()V

    new-instance p3, Ly7/O;

    invoke-direct {p3}, Ly7/O;-><init>()V

    iput-object p1, p3, Ly7/O;->C:Ljava/lang/Object;

    invoke-interface {p0}, Lz0/c;->getViewConfiguration()Landroidx/compose/ui/platform/A1;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/platform/A1;->c()J

    move-result-wide v5

    :try_start_1
    new-instance v2, Lx/l$c;

    invoke-direct {v2, p3, p2, v4}, Lx/l$c;-><init>(Ly7/O;Ly7/O;Lm7/e;)V

    iput-object p1, v0, Lx/l$b;->F:Ljava/lang/Object;

    iput-object p2, v0, Lx/l$b;->G:Ljava/lang/Object;

    iput v3, v0, Lx/l$b;->I:I

    invoke-interface {p0, v5, v6, v2, v0}, Lz0/c;->G0(JLx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lz0/s; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_8

    return-object v1

    :catch_0
    move-object p0, p2

    :catch_1
    iget-object p0, p0, Ly7/O;->C:Ljava/lang/Object;

    check-cast p0, Lz0/B;

    if-nez p0, :cond_7

    move-object v4, p1

    goto :goto_3

    :cond_7
    move-object v4, p0

    :cond_8
    :goto_3
    return-object v4
.end method

.method public static final d(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    new-instance v1, Lx/l$g;

    invoke-direct {v1, p1}, Lx/l$g;-><init>(Lx7/l;)V

    new-instance v2, Lx/l$h;

    invoke-direct {v2, p2}, Lx/l$h;-><init>(Lx7/a;)V

    sget-object v4, Lx/l$i;->D:Lx/l$i;

    const/4 v5, 0x0

    move-object v0, p0

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    invoke-static/range {v0 .. v7}, Lx/l;->e(Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx/s;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final e(Lz0/K;Lx7/q;Lx7/l;Lx7/a;Lx7/a;Lx/s;Lx7/p;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    new-instance v2, Ly7/N;

    invoke-direct {v2}, Ly7/N;-><init>()V

    new-instance v9, Lx/l$j;

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p4

    move-object v3, p5

    move-object v4, p1

    move-object/from16 v5, p6

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lx/l$j;-><init>(Lx7/a;Ly7/N;Lx/s;Lx7/q;Lx7/p;Lx7/a;Lx7/l;Lm7/e;)V

    move-object v0, p0

    move-object/from16 v1, p7

    invoke-static {p0, v9, v1}, Lx/q;->c(Lz0/K;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method public static synthetic f(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, Lx/l$d;->D:Lx/l$d;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    sget-object p2, Lx/l$e;->D:Lx/l$e;

    :cond_1
    move-object v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, Lx/l$f;->D:Lx/l$f;

    :cond_2
    move-object v3, p3

    move-object v0, p0

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lx/l;->d(Lz0/K;Lx7/l;Lx7/a;Lx7/a;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lz0/c;JLx7/l;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p4, Lx/l$k;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lx/l$k;

    iget v1, v0, Lx/l$k;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx/l$k;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx/l$k;

    invoke-direct {v0, p4}, Lx/l$k;-><init>(Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lx/l$k;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lx/l$k;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lx/l$k;->G:Ljava/lang/Object;

    check-cast p0, Lx7/l;

    iget-object p1, v0, Lx/l$k;->F:Ljava/lang/Object;

    check-cast p1, Lz0/c;

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    move-object p3, p0

    move-object p0, p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lx/l$k;->F:Ljava/lang/Object;

    iput-object p3, v0, Lx/l$k;->G:Ljava/lang/Object;

    iput v3, v0, Lx/l$k;->I:I

    invoke-static {p0, p1, p2, v0}, Lx/l;->b(Lz0/c;JLm7/e;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p4, Lz0/B;

    if-nez p4, :cond_4

    const/4 p0, 0x0

    invoke-static {p0}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p4}, Lz0/q;->d(Lz0/B;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v3}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-interface {p3, p4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4}, Lz0/B;->f()J

    move-result-wide p1

    goto :goto_1
.end method

.method private static final h(Lz0/p;J)Z
    .locals 6

    .prologue
    invoke-virtual {p0}, Lz0/p;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lz0/B;

    invoke-virtual {v4}, Lz0/B;->f()J

    move-result-wide v4

    invoke-static {v4, v5, p1, p2}, Lz0/A;->d(JJ)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Lz0/B;

    const/4 p0, 0x1

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lz0/B;->i()Z

    move-result p1

    if-ne p1, p0, :cond_2

    move v1, p0

    :cond_2
    xor-int/2addr p0, v1

    return p0
.end method

.method public static final i(Landroidx/compose/ui/platform/A1;I)F
    .locals 1

    .prologue
    sget-object v0, Lz0/P;->a:Lz0/P$a;

    invoke-virtual {v0}, Lz0/P$a;->b()I

    move-result v0

    invoke-static {p1, v0}, Lz0/P;->g(II)Z

    move-result p1

    invoke-interface {p0}, Landroidx/compose/ui/platform/A1;->g()F

    move-result p0

    if-eqz p1, :cond_0

    sget p1, Lx/l;->c:F

    mul-float/2addr p0, p1

    :cond_0
    return p0
.end method
