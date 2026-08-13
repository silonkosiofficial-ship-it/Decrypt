.class public abstract LS/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/compose/ui/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v1, LU/n;->a:LU/n;

    invoke-virtual {v1}, LU/n;->a()F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    sput-object v0, LS/i0;->a:Landroidx/compose/ui/d;

    return-void
.end method

.method public static final a(Lt0/b;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V
    .locals 20

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move/from16 v11, p6

    const v0, -0x7faffaf9

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v12

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    invoke-interface {v12, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v2, p7, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    invoke-interface {v12, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v3

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v12, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x100

    goto :goto_4

    :cond_8
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v1, v5

    :goto_5
    and-int/lit16 v5, v11, 0xc00

    const/16 v6, 0x800

    if-nez v5, :cond_a

    and-int/lit8 v5, p7, 0x8

    move-wide/from16 v7, p3

    if-nez v5, :cond_9

    invoke-interface {v12, v7, v8}, LV/n;->j(J)Z

    move-result v5

    if-eqz v5, :cond_9

    move v5, v6

    goto :goto_6

    :cond_9
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v1, v5

    goto :goto_7

    :cond_a
    move-wide/from16 v7, p3

    :goto_7
    and-int/lit16 v5, v1, 0x493

    const/16 v13, 0x492

    if-ne v5, v13, :cond_c

    invoke-interface {v12}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {v12}, LV/n;->A()V

    move-object v3, v4

    move-wide v4, v7

    goto/16 :goto_f

    :cond_c
    :goto_8
    invoke-interface {v12}, LV/n;->q()V

    and-int/lit8 v5, v11, 0x1

    if-eqz v5, :cond_f

    invoke-interface {v12}, LV/n;->G()Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v12}, LV/n;->A()V

    and-int/lit8 v2, p7, 0x8

    if-eqz v2, :cond_e

    and-int/lit16 v1, v1, -0x1c01

    :cond_e
    move-object v13, v4

    goto :goto_b

    :cond_f
    :goto_9
    if-eqz v2, :cond_10

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_a

    :cond_10
    move-object v2, v4

    :goto_a
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_11

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v4

    invoke-interface {v12, v4}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo0/y0;

    invoke-virtual {v4}, Lo0/y0;->w()J

    move-result-wide v4

    and-int/lit16 v1, v1, -0x1c01

    move-object v13, v2

    move-wide v7, v4

    goto :goto_b

    :cond_11
    move-object v13, v2

    :goto_b
    invoke-interface {v12}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_12

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.Icon (Icon.kt:143)"

    invoke-static {v0, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_12
    and-int/lit16 v0, v1, 0x1c00

    xor-int/lit16 v0, v0, 0xc00

    const/4 v5, 0x0

    const/4 v2, 0x1

    if-le v0, v6, :cond_13

    invoke-interface {v12, v7, v8}, LV/n;->j(J)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    and-int/lit16 v0, v1, 0xc00

    if-ne v0, v6, :cond_15

    :cond_14
    move v0, v2

    goto :goto_c

    :cond_15
    move v0, v5

    :goto_c
    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v0, :cond_16

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_18

    :cond_16
    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v14

    invoke-static {v7, v8, v14, v15}, Lo0/y0;->o(JJ)Z

    move-result v0

    if-eqz v0, :cond_17

    move-object v4, v6

    goto :goto_d

    :cond_17
    sget-object v14, Lo0/z0;->b:Lo0/z0$a;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v17, 0x0

    move-wide v15, v7

    invoke-static/range {v14 .. v19}, Lo0/z0$a;->b(Lo0/z0$a;JIILjava/lang/Object;)Lo0/z0;

    move-result-object v0

    move-object v4, v0

    :goto_d
    invoke-interface {v12, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_18
    move-object v14, v4

    check-cast v14, Lo0/z0;

    const v0, -0x7fd87200

    invoke-interface {v12, v0}, LV/n;->T(I)V

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    if-eqz v10, :cond_1c

    and-int/lit8 v1, v1, 0x70

    if-ne v1, v3, :cond_19

    move v1, v2

    goto :goto_e

    :cond_19
    move v1, v5

    :goto_e
    invoke-interface {v12}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1a

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_1b

    :cond_1a
    new-instance v3, LS/i0$c;

    invoke-direct {v3, v10}, LS/i0$c;-><init>(Ljava/lang/String;)V

    invoke-interface {v12, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lx7/l;

    invoke-static {v0, v5, v3, v2, v6}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    :cond_1c
    move-object v15, v0

    invoke-interface {v12}, LV/n;->J()V

    invoke-static {v13}, Landroidx/compose/ui/graphics/b;->d(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, v9}, LS/i0;->c(Landroidx/compose/ui/d;Lt0/b;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v1, LD0/h;->a:LD0/h$a;

    invoke-virtual {v1}, LD0/h$a;->a()LD0/h;

    move-result-object v4

    const/16 v16, 0x16

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move v5, v6

    move-object v6, v14

    move-wide/from16 v18, v7

    move/from16 v7, v16

    move-object/from16 v8, v17

    invoke-static/range {v0 .. v8}, Landroidx/compose/ui/draw/d;->b(Landroidx/compose/ui/d;Lt0/b;ZLh0/c;LD0/h;FLo0/z0;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-interface {v0, v15}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v12, v1}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LV/q;->P()V

    :cond_1d
    move-object v3, v13

    move-wide/from16 v4, v18

    :goto_f
    invoke-interface {v12}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v12, LS/i0$b;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/i0$b;-><init>(Lt0/b;Ljava/lang/String;Landroidx/compose/ui/d;JII)V

    invoke-interface {v8, v12}, LV/e1;->a(Lx7/p;)V

    :cond_1e
    return-void
.end method

.method public static final b(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    move/from16 v6, p6

    const v0, -0x79033cc

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v2

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_2
    move v3, v6

    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v2, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v2, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_b

    and-int/lit8 v8, p7, 0x8

    if-nez v8, :cond_9

    move-wide/from16 v8, p3

    invoke-interface {v2, v8, v9}, LV/n;->j(J)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    move-wide/from16 v8, p3

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v3, v10

    goto :goto_7

    :cond_b
    move-wide/from16 v8, p3

    :goto_7
    and-int/lit16 v10, v3, 0x493

    const/16 v11, 0x492

    if-ne v10, v11, :cond_d

    invoke-interface {v2}, LV/n;->u()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v2}, LV/n;->A()V

    move-object v3, v7

    goto/16 :goto_c

    :cond_d
    :goto_8
    invoke-interface {v2}, LV/n;->q()V

    and-int/lit8 v10, v6, 0x1

    if-eqz v10, :cond_11

    invoke-interface {v2}, LV/n;->G()Z

    move-result v10

    if-eqz v10, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v2}, LV/n;->A()V

    and-int/lit8 v5, p7, 0x8

    if-eqz v5, :cond_f

    and-int/lit16 v3, v3, -0x1c01

    :cond_f
    move-object v5, v7

    :cond_10
    move-wide v15, v8

    goto :goto_b

    :cond_11
    :goto_9
    if-eqz v5, :cond_12

    sget-object v5, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_a

    :cond_12
    move-object v5, v7

    :goto_a
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_10

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v7

    invoke-interface {v2, v7}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo0/y0;

    invoke-virtual {v7}, Lo0/y0;->w()J

    move-result-wide v7

    and-int/lit16 v3, v3, -0x1c01

    move-wide v15, v7

    :goto_b
    invoke-interface {v2}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_13

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.Icon (Icon.kt:70)"

    invoke-static {v0, v3, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_13
    and-int/lit8 v0, v3, 0xe

    invoke-static {v1, v2, v0}, Lu0/r;->g(Lu0/d;LV/n;I)Lu0/q;

    move-result-object v7

    sget v0, Lu0/q;->n:I

    and-int/lit8 v8, v3, 0x70

    or-int/2addr v0, v8

    and-int/lit16 v8, v3, 0x380

    or-int/2addr v0, v8

    and-int/lit16 v3, v3, 0x1c00

    or-int v13, v0, v3

    const/4 v14, 0x0

    move-object/from16 v8, p1

    move-object v9, v5

    move-wide v10, v15

    move-object v12, v2

    invoke-static/range {v7 .. v14}, LS/i0;->a(Lt0/b;Ljava/lang/String;Landroidx/compose/ui/d;JLV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-static {}, LV/q;->P()V

    :cond_14
    move-object v3, v5

    move-wide v8, v15

    :goto_c
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_15

    new-instance v11, LS/i0$a;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide v4, v8

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/i0$a;-><init>(Lu0/d;Ljava/lang/String;Landroidx/compose/ui/d;JII)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_15
    return-void
.end method

.method private static final c(Landroidx/compose/ui/d;Lt0/b;)Landroidx/compose/ui/d;
    .locals 4

    .prologue
    invoke-virtual {p1}, Lt0/b;->h()J

    move-result-wide v0

    sget-object v2, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v2}, Ln0/m$a;->a()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ln0/m;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lt0/b;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LS/i0;->d(J)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, LS/i0;->a:Landroidx/compose/ui/d;

    :goto_1
    invoke-interface {p0, p1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final d(J)Z
    .locals 1

    .prologue
    invoke-static {p0, p1}, Ln0/m;->i(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ln0/m;->g(J)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
