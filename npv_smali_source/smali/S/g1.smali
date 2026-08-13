.class public abstract LS/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:Lu/j;

.field private static final c:Lu/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x5a

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/g1;->a:F

    invoke-static {}, Lu/H;->d()Lu/F;

    move-result-object v0

    const/16 v1, 0xfa

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v0, v3, v4}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    sput-object v0, LS/g1;->b:Lu/j;

    invoke-static {}, Lu/H;->d()Lu/F;

    move-result-object v0

    invoke-static {v1, v2, v0, v3, v4}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    sput-object v0, LS/g1;->c:Lu/j;

    return-void
.end method

.method public static final a(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;II)V
    .locals 21

    .prologue
    move/from16 v1, p0

    move/from16 v10, p10

    const v0, -0x477a035a

    move-object/from16 v2, p9

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v2

    and-int/lit8 v3, p11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LV/n;->i(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move v3, v10

    :goto_1
    and-int/lit8 v4, p11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit16 v6, v10, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p11, 0x4

    if-nez v6, :cond_6

    move-wide/from16 v6, p2

    invoke-interface {v2, v6, v7}, LV/n;->j(J)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v6, p2

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    goto :goto_5

    :cond_8
    move-wide/from16 v6, p2

    :goto_5
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_b

    and-int/lit8 v8, p11, 0x8

    if-nez v8, :cond_9

    move-wide/from16 v8, p4

    invoke-interface {v2, v8, v9}, LV/n;->j(J)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    move-wide/from16 v8, p4

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    goto :goto_7

    :cond_b
    move-wide/from16 v8, p4

    :goto_7
    and-int/lit8 v11, p11, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p6

    invoke-interface {v2, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, p11, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v3, v14

    :cond_f
    move-object/from16 v14, p7

    goto :goto_b

    :cond_10
    and-int/2addr v14, v10

    if-nez v14, :cond_f

    move-object/from16 v14, p7

    invoke-interface {v2, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    :goto_b
    and-int/lit8 v15, p11, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_13

    or-int v3, v3, v16

    :cond_12
    move-object/from16 v15, p8

    goto :goto_d

    :cond_13
    and-int v15, v10, v16

    if-nez v15, :cond_12

    move-object/from16 v15, p8

    invoke-interface {v2, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    :goto_d
    const v16, 0x92493

    and-int v0, v3, v16

    const v5, 0x92492

    if-ne v0, v5, :cond_16

    invoke-interface {v2}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v2}, LV/n;->A()V

    move-object/from16 v3, p1

    goto/16 :goto_14

    :cond_16
    :goto_e
    invoke-interface {v2}, LV/n;->q()V

    and-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_1b

    invoke-interface {v2}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_f

    :cond_17
    invoke-interface {v2}, LV/n;->A()V

    and-int/lit8 v0, p11, 0x4

    if-eqz v0, :cond_18

    and-int/lit16 v3, v3, -0x381

    :cond_18
    and-int/lit8 v0, p11, 0x8

    if-eqz v0, :cond_19

    and-int/lit16 v3, v3, -0x1c01

    :cond_19
    move-object/from16 v0, p1

    move-wide v4, v8

    move-object v8, v12

    :cond_1a
    move-object v9, v14

    goto :goto_13

    :cond_1b
    :goto_f
    if-eqz v4, :cond_1c

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_10

    :cond_1c
    move-object/from16 v0, p1

    :goto_10
    and-int/lit8 v4, p11, 0x4

    const/4 v5, 0x6

    if-eqz v4, :cond_1d

    sget-object v4, LS/f1;->a:LS/f1;

    invoke-virtual {v4, v2, v5}, LS/f1;->b(LV/n;I)J

    move-result-wide v6

    and-int/lit16 v3, v3, -0x381

    :cond_1d
    and-int/lit8 v4, p11, 0x8

    if-eqz v4, :cond_1e

    sget-object v4, LS/f1;->a:LS/f1;

    invoke-virtual {v4, v2, v5}, LS/f1;->c(LV/n;I)J

    move-result-wide v4

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_11

    :cond_1e
    move-wide v4, v8

    :goto_11
    if-eqz v11, :cond_1f

    new-instance v8, LS/g1$a;

    invoke-direct {v8, v1}, LS/g1$a;-><init>(I)V

    const/16 v9, 0x36

    const v11, -0x7a5029ff

    const/4 v12, 0x1

    invoke-static {v11, v12, v8, v2, v9}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v8

    goto :goto_12

    :cond_1f
    move-object v8, v12

    :goto_12
    if-eqz v13, :cond_1a

    sget-object v9, LS/H;->a:LS/H;

    invoke-virtual {v9}, LS/H;->a()Lx7/p;

    move-result-object v9

    :goto_13
    invoke-interface {v2}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_20

    const/4 v11, -0x1

    const-string v12, "androidx.compose.material3.TabRow (TabRow.kt:314)"

    const v13, -0x477a035a

    invoke-static {v13, v3, v11, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_20
    shr-int/lit8 v3, v3, 0x3

    const v11, 0x7fffe

    and-int v20, v3, v11

    move-object v11, v0

    move-wide v12, v6

    move-wide v14, v4

    move-object/from16 v16, v8

    move-object/from16 v17, v9

    move-object/from16 v18, p8

    move-object/from16 v19, v2

    invoke-static/range {v11 .. v20}, LS/g1;->b(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-static {}, LV/q;->P()V

    :cond_21
    move-object v3, v0

    move-object v12, v8

    move-object v14, v9

    move-wide v8, v4

    :goto_14
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_22

    new-instance v15, LS/g1$b;

    move-object v0, v15

    move/from16 v1, p0

    move-object v2, v3

    move-wide v3, v6

    move-wide v5, v8

    move-object v7, v12

    move-object v8, v14

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LS/g1$b;-><init>(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;II)V

    invoke-interface {v13, v15}, LV/e1;->a(Lx7/p;)V

    :cond_22
    return-void
.end method

.method private static final b(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V
    .locals 23

    .prologue
    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    const v0, -0x9971f65

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move-object/from16 v2, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    move-wide/from16 v4, p1

    invoke-interface {v1, v4, v5}, LV/n;->j(J)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v3, v10

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p1

    :goto_3
    and-int/lit16 v10, v9, 0x180

    move-wide/from16 v14, p3

    if-nez v10, :cond_5

    invoke-interface {v1, v14, v15}, LV/n;->j(J)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_4

    :cond_4
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v3, v10

    :cond_5
    and-int/lit16 v10, v9, 0xc00

    if-nez v10, :cond_7

    invoke-interface {v1, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_5

    :cond_6
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v3, v10

    :cond_7
    and-int/lit16 v10, v9, 0x6000

    if-nez v10, :cond_9

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_6

    :cond_8
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v3, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v9

    if-nez v10, :cond_b

    invoke-interface {v1, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v3, v10

    :cond_b
    const v10, 0x12493

    and-int/2addr v10, v3

    const v11, 0x12492

    if-ne v10, v11, :cond_d

    invoke-interface {v1}, LV/n;->u()Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v1}, LV/n;->A()V

    goto :goto_9

    :cond_d
    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_e

    const/4 v10, -0x1

    const-string v11, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)"

    invoke-static {v0, v3, v10, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_e
    invoke-static/range {p0 .. p0}, LF/a;->a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v10

    new-instance v0, LS/g1$c;

    invoke-direct {v0, v8, v7, v6}, LS/g1$c;-><init>(Lx7/p;Lx7/p;Lx7/q;)V

    const/16 v11, 0x36

    const v12, -0x606c2e20

    const/4 v13, 0x1

    invoke-static {v12, v13, v0, v1, v11}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v19

    shl-int/lit8 v0, v3, 0x3

    and-int/lit16 v3, v0, 0x380

    const/high16 v11, 0xc00000

    or-int/2addr v3, v11

    and-int/lit16 v0, v0, 0x1c00

    or-int v21, v3, v0

    const/16 v22, 0x72

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide/from16 v12, p1

    move-wide/from16 v14, p3

    move-object/from16 v20, v1

    invoke-static/range {v10 .. v22}, LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    :goto_9
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_10

    new-instance v11, LS/g1$d;

    move-object v0, v11

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LS/g1$d;-><init>(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;I)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_10
    return-void
.end method

.method public static final synthetic c(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, LS/g1;->b(Landroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic d()Lu/j;
    .locals 1

    sget-object v0, LS/g1;->c:Lu/j;

    return-object v0
.end method
