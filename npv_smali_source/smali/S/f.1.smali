.class public abstract LS/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:Lu/z;

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v3

    sub-float/2addr v1, v3

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->a:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v4

    sub-float/2addr v3, v4

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    sput v3, LS/f;->b:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v4

    sub-float/2addr v4, v1

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->c:F

    invoke-static {v2}, LY0/i;->q(F)F

    move-result v1

    sub-float/2addr v1, v3

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->d:F

    new-instance v1, Lu/z;

    const/4 v2, 0x0

    const v3, 0x3e19999a    # 0.15f

    const v4, 0x3f4ccccd    # 0.8f

    invoke-direct {v1, v4, v2, v4, v3}, Lu/z;-><init>(FFFF)V

    sput-object v1, LS/f;->e:Lu/z;

    const/16 v1, 0x18

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->f:F

    const/16 v1, 0x1c

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->g:F

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/f;->h:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sub-float/2addr v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/f;->i:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;JJFLA/B;LA/S;Lx7/q;LV/n;II)V
    .locals 24

    .prologue
    move/from16 v10, p10

    const v0, -0x52f3ab6d

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, p11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v10, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v10

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p11, 0x2

    if-nez v5, :cond_3

    move-wide/from16 v5, p1

    invoke-interface {v1, v5, v6}, LV/n;->j(J)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v5, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move-wide/from16 v5, p1

    :goto_3
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p11, 0x4

    if-nez v7, :cond_6

    move-wide/from16 v7, p3

    invoke-interface {v1, v7, v8}, LV/n;->j(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v7, p3

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_8
    move-wide/from16 v7, p3

    :goto_5
    and-int/lit8 v9, p11, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v11, p5

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v10, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p5

    invoke-interface {v1, v11}, LV/n;->h(F)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p11, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v13, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_c

    move-object/from16 v13, p6

    invoke-interface {v1, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v10

    if-nez v14, :cond_11

    and-int/lit8 v14, p11, 0x20

    if-nez v14, :cond_f

    move-object/from16 v14, p7

    invoke-interface {v1, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v14, p7

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v4, v15

    goto :goto_b

    :cond_11
    move-object/from16 v14, p7

    :goto_b
    and-int/lit8 v15, p11, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_13

    or-int v4, v4, v16

    :cond_12
    move-object/from16 v15, p8

    goto :goto_d

    :cond_13
    and-int v15, v10, v16

    if-nez v15, :cond_12

    move-object/from16 v15, p8

    invoke-interface {v1, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_14

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v17, 0x80000

    :goto_c
    or-int v4, v4, v17

    :goto_d
    const v17, 0x92493

    and-int v0, v4, v17

    const v3, 0x92492

    if-ne v0, v3, :cond_16

    invoke-interface {v1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v2, p0

    goto/16 :goto_12

    :cond_16
    :goto_e
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v0, v10, 0x1

    const v3, -0x70001

    if-eqz v0, :cond_1c

    invoke-interface {v1}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_f

    :cond_17
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, p11, 0x2

    if-eqz v0, :cond_18

    and-int/lit8 v4, v4, -0x71

    :cond_18
    and-int/lit8 v0, p11, 0x4

    if-eqz v0, :cond_19

    and-int/lit16 v4, v4, -0x381

    :cond_19
    and-int/lit8 v0, p11, 0x20

    if-eqz v0, :cond_1a

    and-int/2addr v4, v3

    :cond_1a
    move-object/from16 v0, p0

    :cond_1b
    move v9, v4

    move v2, v11

    move-object v3, v13

    move-object v4, v14

    goto :goto_11

    :cond_1c
    :goto_f
    if-eqz v2, :cond_1d

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_10

    :cond_1d
    move-object/from16 v0, p0

    :goto_10
    and-int/lit8 v2, p11, 0x2

    const/4 v3, 0x6

    if-eqz v2, :cond_1e

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2, v1, v3}, LS/i;->a(LV/n;I)J

    move-result-wide v5

    and-int/lit8 v4, v4, -0x71

    :cond_1e
    and-int/lit8 v2, p11, 0x4

    if-eqz v2, :cond_1f

    shr-int/lit8 v2, v4, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v5, v6, v1, v2}, LS/A;->c(JLV/n;I)J

    move-result-wide v7

    and-int/lit16 v2, v4, -0x381

    move v4, v2

    :cond_1f
    if-eqz v9, :cond_20

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2}, LS/i;->b()F

    move-result v2

    move v11, v2

    :cond_20
    if-eqz v12, :cond_21

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2}, LS/i;->c()LA/B;

    move-result-object v2

    move-object v13, v2

    :cond_21
    and-int/lit8 v2, p11, 0x20

    if-eqz v2, :cond_1b

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2, v1, v3}, LS/i;->d(LV/n;I)LA/S;

    move-result-object v2

    const v3, -0x70001

    and-int/2addr v4, v3

    move v9, v4

    move-object v3, v13

    move-object v4, v2

    move v2, v11

    :goto_11
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_22

    const/4 v11, -0x1

    const-string v12, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)"

    const v13, -0x52f3ab6d

    invoke-static {v13, v9, v11, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_22
    and-int/lit8 v11, v9, 0xe

    or-int v11, v11, v16

    and-int/lit8 v12, v9, 0x70

    or-int/2addr v11, v12

    and-int/lit16 v12, v9, 0x380

    or-int/2addr v11, v12

    and-int/lit16 v12, v9, 0x1c00

    or-int/2addr v11, v12

    const v12, 0xe000

    and-int/2addr v12, v9

    or-int/2addr v11, v12

    const/high16 v12, 0x70000

    and-int/2addr v12, v9

    or-int/2addr v11, v12

    const/high16 v12, 0x1c00000

    shl-int/lit8 v9, v9, 0x3

    and-int/2addr v9, v12

    or-int v22, v11, v9

    const/16 v23, 0x0

    const/16 v19, 0x0

    move-object v11, v0

    move-wide v12, v5

    move-wide v14, v7

    move/from16 v16, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v20, p8

    move-object/from16 v21, v1

    invoke-static/range {v11 .. v23}, LS/f;->b(Landroidx/compose/ui/d;JJFLA/B;LA/S;LS/j;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-static {}, LV/q;->P()V

    :cond_23
    move v11, v2

    move-object v13, v3

    move-object v14, v4

    move-object v2, v0

    :goto_12
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v12

    if-eqz v12, :cond_24

    new-instance v15, LS/f$a;

    move-object v0, v15

    move-object v1, v2

    move-wide v2, v5

    move-wide v4, v7

    move v6, v11

    move-object v7, v13

    move-object v8, v14

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LS/f$a;-><init>(Landroidx/compose/ui/d;JJFLA/B;LA/S;Lx7/q;II)V

    invoke-interface {v12, v15}, LV/e1;->a(Lx7/p;)V

    :cond_24
    return-void
.end method

.method public static final b(Landroidx/compose/ui/d;JJFLA/B;LA/S;LS/j;Lx7/q;LV/n;II)V
    .locals 35

    .prologue
    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    const v0, 0x192de775

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v12, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v11, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v11

    :goto_1
    and-int/lit8 v5, v11, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v12, 0x2

    if-nez v5, :cond_3

    move-wide/from16 v5, p1

    invoke-interface {v1, v5, v6}, LV/n;->j(J)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-wide/from16 v5, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move-wide/from16 v5, p1

    :goto_3
    and-int/lit16 v7, v11, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, v12, 0x4

    if-nez v7, :cond_6

    move-wide/from16 v7, p3

    invoke-interface {v1, v7, v8}, LV/n;->j(J)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    move-wide/from16 v7, p3

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    goto :goto_5

    :cond_8
    move-wide/from16 v7, p3

    :goto_5
    and-int/lit8 v9, v12, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v13, p5

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v11, 0xc00

    if-nez v13, :cond_9

    move/from16 v13, p5

    invoke-interface {v1, v13}, LV/n;->h(F)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit8 v14, v12, 0x10

    if-eqz v14, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v15, p6

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v11, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    const/high16 v16, 0x30000

    and-int v16, v11, v16

    if-nez v16, :cond_10

    and-int/lit8 v16, v12, 0x20

    move-object/from16 v0, p7

    if-nez v16, :cond_f

    invoke-interface {v1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v17, 0x10000

    :goto_a
    or-int v4, v4, v17

    goto :goto_b

    :cond_10
    move-object/from16 v0, p7

    :goto_b
    and-int/lit8 v17, v12, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_11

    or-int v4, v4, v18

    move-object/from16 v0, p8

    goto :goto_d

    :cond_11
    and-int v18, v11, v18

    move-object/from16 v0, p8

    if-nez v18, :cond_13

    invoke-interface {v1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_12

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_13
    :goto_d
    and-int/lit16 v0, v12, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_14

    or-int v4, v4, v18

    goto :goto_f

    :cond_14
    and-int v0, v11, v18

    if-nez v0, :cond_16

    invoke-interface {v1, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v4, v0

    :cond_16
    :goto_f
    const v0, 0x492493

    and-int/2addr v0, v4

    const v3, 0x492492

    if-ne v0, v3, :cond_18

    invoke-interface {v1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_10

    :cond_17
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v26, p0

    move-object/from16 v9, p8

    move-wide v2, v5

    move-wide v4, v7

    move v6, v13

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_19

    :cond_18
    :goto_10
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v0, v11, 0x1

    const v19, -0x70001

    const/4 v3, 0x6

    if-eqz v0, :cond_1e

    invoke-interface {v1}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_19

    goto :goto_11

    :cond_19
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v12, 0x2

    if-eqz v0, :cond_1a

    and-int/lit8 v4, v4, -0x71

    :cond_1a
    and-int/lit8 v0, v12, 0x4

    if-eqz v0, :cond_1b

    and-int/lit16 v4, v4, -0x381

    :cond_1b
    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_1c

    and-int v4, v4, v19

    :cond_1c
    move-object/from16 v0, p0

    move-object/from16 v9, p7

    move v2, v13

    move v13, v4

    move-object v4, v15

    :cond_1d
    move-object/from16 v15, p8

    goto :goto_14

    :cond_1e
    :goto_11
    if-eqz v2, :cond_1f

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_12

    :cond_1f
    move-object/from16 v0, p0

    :goto_12
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_20

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2, v1, v3}, LS/i;->a(LV/n;I)J

    move-result-wide v5

    and-int/lit8 v4, v4, -0x71

    :cond_20
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_21

    shr-int/lit8 v2, v4, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v5, v6, v1, v2}, LS/A;->c(JLV/n;I)J

    move-result-wide v7

    and-int/lit16 v4, v4, -0x381

    :cond_21
    if-eqz v9, :cond_22

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2}, LS/i;->b()F

    move-result v2

    move v13, v2

    :cond_22
    if-eqz v14, :cond_23

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2}, LS/i;->c()LA/B;

    move-result-object v2

    move-object v15, v2

    :cond_23
    and-int/lit8 v2, v12, 0x20

    if-eqz v2, :cond_24

    sget-object v2, LS/i;->a:LS/i;

    invoke-virtual {v2, v1, v3}, LS/i;->d(LV/n;I)LA/S;

    move-result-object v2

    and-int v4, v4, v19

    goto :goto_13

    :cond_24
    move-object/from16 v2, p7

    :goto_13
    move-object v9, v2

    move v2, v13

    move v13, v4

    move-object v4, v15

    if-eqz v17, :cond_1d

    const/4 v15, 0x0

    :goto_14
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v14

    if-eqz v14, :cond_25

    const/4 v14, -0x1

    const-string v3, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)"

    const v11, 0x192de775

    invoke-static {v11, v13, v14, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_25
    const v3, 0x531009c9

    invoke-interface {v1, v3}, LV/n;->T(I)V

    const/high16 v3, 0x380000

    if-eqz v15, :cond_2c

    invoke-interface {v15}, LS/j;->a()Z

    move-result v16

    if-nez v16, :cond_2c

    sget-object v21, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v23, Lx/s;->C:Lx/s;

    and-int v14, v13, v3

    const/high16 v3, 0x100000

    if-ne v14, v3, :cond_26

    const/4 v3, 0x1

    goto :goto_15

    :cond_26
    const/4 v3, 0x0

    :goto_15
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_27

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v11, v3, :cond_28

    :cond_27
    new-instance v11, LS/f$e;

    invoke-direct {v11, v15}, LS/f$e;-><init>(LS/j;)V

    invoke-interface {v1, v11}, LV/n;->K(Ljava/lang/Object;)V

    :cond_28
    check-cast v11, Lx7/l;

    const/4 v3, 0x0

    invoke-static {v11, v1, v3}, Lx/n;->i(Lx7/l;LV/n;I)Lx/o;

    move-result-object v22

    const/high16 v11, 0x100000

    if-ne v14, v11, :cond_29

    const/4 v11, 0x1

    goto :goto_16

    :cond_29
    move v11, v3

    :goto_16
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_2a

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v14, v11, :cond_2b

    :cond_2a
    new-instance v14, LS/f$f;

    const/4 v11, 0x0

    invoke-direct {v14, v15, v11}, LS/f$f;-><init>(LS/j;Lm7/e;)V

    invoke-interface {v1, v14}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2b
    move-object/from16 v28, v14

    check-cast v28, Lx7/q;

    const/16 v30, 0xbc

    const/16 v31, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v21 .. v31}, Lx/n;->h(Landroidx/compose/ui/d;Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v11

    goto :goto_17

    :cond_2c
    const/4 v3, 0x0

    sget-object v11, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_17
    invoke-interface {v1}, LV/n;->J()V

    sget-object v14, LU/a;->a:LU/a;

    invoke-virtual {v14}, LU/a;->c()LU/z;

    move-result-object v14

    const/4 v3, 0x6

    invoke-static {v14, v1, v3}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v14

    const/high16 v3, 0x380000

    and-int/2addr v3, v13

    const/high16 v12, 0x100000

    if-ne v3, v12, :cond_2d

    const/4 v3, 0x1

    goto :goto_18

    :cond_2d
    const/4 v3, 0x0

    :goto_18
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    if-nez v3, :cond_2e

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v12, v3, :cond_2f

    :cond_2e
    new-instance v12, LS/f$b;

    invoke-direct {v12, v15}, LS/f$b;-><init>(LS/j;)V

    invoke-interface {v1, v12}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2f
    check-cast v12, Lx7/q;

    invoke-static {v0, v12}, Landroidx/compose/ui/layout/b;->a(Landroidx/compose/ui/d;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-interface {v3, v11}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v3

    new-instance v11, LS/f$c;

    invoke-direct {v11, v9, v4, v10}, LS/f$c;-><init>(LA/S;LA/B;Lx7/q;)V

    const/16 v12, 0x36

    move-object/from16 v26, v0

    const v0, 0x4a177dd0    # 2482036.0f

    move-object/from16 v27, v4

    const/4 v4, 0x1

    invoke-static {v0, v4, v11, v1, v12}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v22

    shl-int/lit8 v0, v13, 0x3

    and-int/lit16 v4, v0, 0x380

    or-int v4, v4, v18

    and-int/lit16 v11, v0, 0x1c00

    or-int/2addr v4, v11

    const v11, 0xe000

    and-int/2addr v0, v11

    or-int v24, v4, v0

    const/16 v25, 0x60

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object v13, v3

    move-object v0, v15

    move-wide v15, v5

    move-wide/from16 v17, v7

    move/from16 v19, v2

    move-object/from16 v23, v1

    invoke-static/range {v13 .. v25}, LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_30

    invoke-static {}, LV/q;->P()V

    :cond_30
    move-object/from16 v32, v9

    move-object v9, v0

    move-wide/from16 v33, v5

    move v6, v2

    move-wide/from16 v2, v33

    move-wide v4, v7

    move-object/from16 v8, v32

    move-object/from16 v7, v27

    :goto_19
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_31

    new-instance v14, LS/f$d;

    move-object v0, v14

    move-object/from16 v1, v26

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LS/f$d;-><init>(Landroidx/compose/ui/d;JJFLA/B;LA/S;LS/j;Lx7/q;II)V

    invoke-interface {v13, v14}, LV/e1;->a(Lx7/p;)V

    :cond_31
    return-void
.end method

.method public static final c(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
    .locals 24

    .prologue
    move/from16 v9, p9

    move/from16 v10, p10

    const v0, 0x74683b90

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v9, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v9

    :goto_1
    and-int/lit8 v4, v10, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, v10, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v9, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit8 v8, v10, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v9, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v3, v12

    :goto_7
    and-int/lit8 v12, v10, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-interface {v1, v13}, LV/n;->h(F)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v3, v14

    :goto_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v9

    if-nez v14, :cond_11

    and-int/lit8 v14, v10, 0x20

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-interface {v1, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v14, p5

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    goto :goto_b

    :cond_11
    move-object/from16 v14, p5

    :goto_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v9

    if-nez v15, :cond_14

    and-int/lit8 v15, v10, 0x40

    if-nez v15, :cond_12

    move-object/from16 v15, p6

    invoke-interface {v1, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v15, p6

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    goto :goto_d

    :cond_14
    move-object/from16 v15, p6

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v0, :cond_15

    or-int v3, v3, v17

    move-object/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v17, v9, v17

    move-object/from16 v2, p7

    if-nez v17, :cond_17

    invoke-interface {v1, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v3, v3, v17

    :cond_17
    :goto_f
    const v17, 0x492493

    and-int v2, v3, v17

    const v5, 0x492492

    if-ne v2, v5, :cond_19

    invoke-interface {v1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v2, p1

    move-object/from16 v8, p7

    move-object v3, v7

    move-object v4, v11

    move v5, v13

    move-object v6, v14

    move-object v7, v15

    goto/16 :goto_17

    :cond_19
    :goto_10
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v2, v9, 0x1

    const v17, -0x70001

    const/4 v5, 0x6

    if-eqz v2, :cond_1e

    invoke-interface {v1}, LV/n;->G()Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v10, 0x20

    if-eqz v0, :cond_1b

    and-int v3, v3, v17

    :cond_1b
    and-int/lit8 v0, v10, 0x40

    if-eqz v0, :cond_1c

    const v0, -0x380001

    and-int/2addr v3, v0

    :cond_1c
    move-object/from16 v2, p1

    :cond_1d
    move-object/from16 v8, p7

    :goto_11
    move-object v0, v11

    move-object v4, v14

    move-object v6, v15

    move v11, v3

    move v3, v13

    goto :goto_14

    :cond_1e
    :goto_12
    if-eqz v4, :cond_1f

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_13

    :cond_1f
    move-object/from16 v2, p1

    :goto_13
    if-eqz v6, :cond_20

    sget-object v4, LS/C;->a:LS/C;

    invoke-virtual {v4}, LS/C;->a()Lx7/p;

    move-result-object v4

    move-object v7, v4

    :cond_20
    if-eqz v8, :cond_21

    sget-object v4, LS/C;->a:LS/C;

    invoke-virtual {v4}, LS/C;->b()Lx7/q;

    move-result-object v4

    move-object v11, v4

    :cond_21
    if-eqz v12, :cond_22

    sget-object v4, LS/x1;->a:LS/x1;

    invoke-virtual {v4}, LS/x1;->c()F

    move-result v4

    move v13, v4

    :cond_22
    and-int/lit8 v4, v10, 0x20

    if-eqz v4, :cond_23

    sget-object v4, LS/x1;->a:LS/x1;

    invoke-virtual {v4, v1, v5}, LS/x1;->d(LV/n;I)LA/S;

    move-result-object v4

    and-int v3, v3, v17

    move-object v14, v4

    :cond_23
    and-int/lit8 v4, v10, 0x40

    if-eqz v4, :cond_24

    sget-object v4, LS/x1;->a:LS/x1;

    invoke-virtual {v4, v1, v5}, LS/x1;->a(LV/n;I)LS/w1;

    move-result-object v4

    const v6, -0x380001

    and-int/2addr v3, v6

    move-object v15, v4

    :cond_24
    if-eqz v0, :cond_1d

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_11

    :goto_14
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v12

    if-eqz v12, :cond_25

    const/4 v12, -0x1

    const-string v13, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)"

    const v14, 0x74683b90

    invoke-static {v14, v11, v12, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_25
    sget-object v12, LU/I;->a:LU/I;

    invoke-virtual {v12}, LU/I;->b()LU/L;

    move-result-object v12

    invoke-static {v12, v1, v5}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v13

    sget-object v12, LY0/i;->D:LY0/i$a;

    invoke-virtual {v12}, LY0/i$a;->c()F

    move-result v14

    invoke-static {v3, v14}, LY0/i;->s(FF)Z

    move-result v14

    if-nez v14, :cond_27

    invoke-virtual {v12}, LY0/i$a;->b()F

    move-result v12

    invoke-static {v3, v12}, LY0/i;->s(FF)Z

    move-result v12

    if-eqz v12, :cond_26

    goto :goto_15

    :cond_26
    move/from16 v17, v3

    goto :goto_16

    :cond_27
    :goto_15
    sget-object v12, LS/x1;->a:LS/x1;

    invoke-virtual {v12}, LS/x1;->c()F

    move-result v12

    move/from16 v17, v12

    :goto_16
    shr-int/lit8 v12, v11, 0x3

    and-int/lit8 v12, v12, 0xe

    or-int/lit16 v12, v12, 0xc00

    shl-int/lit8 v14, v11, 0x3

    and-int/lit8 v14, v14, 0x70

    or-int/2addr v12, v14

    shl-int/lit8 v5, v11, 0x6

    const v11, 0xe000

    and-int/2addr v11, v5

    or-int/2addr v11, v12

    const/high16 v12, 0x70000

    and-int/2addr v12, v5

    or-int/2addr v11, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v12, v5

    or-int/2addr v11, v12

    const/high16 v12, 0xe000000

    and-int/2addr v12, v5

    or-int/2addr v11, v12

    const/high16 v12, 0x70000000

    and-int/2addr v5, v12

    or-int v22, v11, v5

    const/16 v23, 0x0

    const/4 v14, 0x1

    move-object v11, v2

    move-object/from16 v12, p0

    move-object v15, v7

    move-object/from16 v16, v0

    move-object/from16 v18, v4

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    move-object/from16 v21, v1

    invoke-static/range {v11 .. v23}, LS/f;->d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v5

    if-eqz v5, :cond_28

    invoke-static {}, LV/q;->P()V

    :cond_28
    move v5, v3

    move-object v3, v7

    move-object v7, v6

    move-object v6, v4

    move-object v4, v0

    :goto_17
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v12, LS/f$g;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, LS/f$g;-><init>(Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;II)V

    invoke-interface {v11, v12}, LV/e1;->a(Lx7/p;)V

    :cond_29
    return-void
.end method

.method private static final d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
    .locals 33

    .prologue
    move-object/from16 v6, p5

    move/from16 v5, p6

    move-object/from16 v4, p8

    move-object/from16 v3, p9

    move/from16 v2, p11

    move/from16 v1, p12

    const v0, -0x14657adf

    move-object/from16 v7, p10

    invoke-interface {v7, v0}, LV/n;->r(I)LV/n;

    move-result-object v15

    and-int/lit8 v7, v1, 0x1

    if-eqz v7, :cond_0

    or-int/lit8 v8, v2, 0x6

    move v9, v8

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v8, v2, 0x6

    if-nez v8, :cond_2

    move-object/from16 v8, p0

    invoke-interface {v15, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v2

    goto :goto_1

    :cond_2
    move-object/from16 v8, p0

    move v9, v2

    :goto_1
    and-int/lit8 v10, v1, 0x2

    if-eqz v10, :cond_3

    or-int/lit8 v9, v9, 0x30

    move-object/from16 v14, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v10, v2, 0x30

    move-object/from16 v14, p1

    if-nez v10, :cond_5

    invoke-interface {v15, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    :cond_5
    :goto_3
    and-int/lit8 v10, v1, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v9, v9, 0x180

    move-object/from16 v13, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v2, 0x180

    move-object/from16 v13, p2

    if-nez v10, :cond_8

    invoke-interface {v15, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v9, v10

    :cond_8
    :goto_5
    and-int/lit8 v10, v1, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v9, v9, 0xc00

    move/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v2, 0xc00

    move/from16 v12, p3

    if-nez v10, :cond_b

    invoke-interface {v15, v12}, LV/n;->d(Z)Z

    move-result v10

    if-eqz v10, :cond_a

    const/16 v10, 0x800

    goto :goto_6

    :cond_a
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v9, v10

    :cond_b
    :goto_7
    and-int/lit8 v10, v1, 0x10

    if-eqz v10, :cond_c

    or-int/lit16 v9, v9, 0x6000

    move-object/from16 v11, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v10, v2, 0x6000

    move-object/from16 v11, p4

    if-nez v10, :cond_e

    invoke-interface {v15, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_8

    :cond_d
    const/16 v10, 0x2000

    :goto_8
    or-int/2addr v9, v10

    :cond_e
    :goto_9
    and-int/lit8 v10, v1, 0x20

    const/high16 v16, 0x30000

    if-eqz v10, :cond_f

    or-int v9, v9, v16

    goto :goto_b

    :cond_f
    and-int v10, v2, v16

    if-nez v10, :cond_11

    invoke-interface {v15, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v9, v10

    :cond_11
    :goto_b
    and-int/lit8 v10, v1, 0x40

    const/high16 v16, 0x180000

    if-eqz v10, :cond_12

    or-int v9, v9, v16

    goto :goto_d

    :cond_12
    and-int v10, v2, v16

    if-nez v10, :cond_14

    invoke-interface {v15, v5}, LV/n;->h(F)Z

    move-result v10

    if-eqz v10, :cond_13

    const/high16 v10, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v10, 0x80000

    :goto_c
    or-int/2addr v9, v10

    :cond_14
    :goto_d
    and-int/lit16 v10, v1, 0x80

    const/high16 v16, 0xc00000

    if-eqz v10, :cond_16

    or-int v9, v9, v16

    :cond_15
    move-object/from16 v10, p7

    goto :goto_f

    :cond_16
    and-int v10, v2, v16

    if-nez v10, :cond_15

    move-object/from16 v10, p7

    invoke-interface {v15, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_17

    const/high16 v16, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v16, 0x400000

    :goto_e
    or-int v9, v9, v16

    :goto_f
    and-int/lit16 v0, v1, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_18

    or-int v9, v9, v17

    goto :goto_11

    :cond_18
    and-int v0, v2, v17

    if-nez v0, :cond_1a

    invoke-interface {v15, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/high16 v0, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v0, 0x2000000

    :goto_10
    or-int/2addr v9, v0

    :cond_1a
    :goto_11
    and-int/lit16 v0, v1, 0x200

    const/high16 v17, 0x30000000

    if-eqz v0, :cond_1b

    or-int v9, v9, v17

    goto :goto_13

    :cond_1b
    and-int v0, v2, v17

    if-nez v0, :cond_1d

    invoke-interface {v15, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    const/high16 v0, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v0, 0x10000000

    :goto_12
    or-int/2addr v9, v0

    :cond_1d
    :goto_13
    const v0, 0x12492493

    and-int/2addr v0, v9

    const v14, 0x12492492

    if-ne v0, v14, :cond_1f

    invoke-interface {v15}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_14

    :cond_1e
    invoke-interface {v15}, LV/n;->A()V

    move-object v1, v8

    move-object v3, v15

    goto/16 :goto_1c

    :cond_1f
    :goto_14
    if-eqz v7, :cond_20

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_15

    :cond_20
    move-object v0, v8

    :goto_15
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_21

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)"

    const v14, -0x14657adf

    invoke-static {v14, v9, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_21
    invoke-static/range {p6 .. p6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v7

    const/4 v14, 0x1

    xor-int/2addr v7, v14

    if-eqz v7, :cond_32

    const/high16 v7, 0x7f800000    # Float.POSITIVE_INFINITY

    cmpg-float v7, v5, v7

    if-nez v7, :cond_22

    move v7, v14

    goto :goto_16

    :cond_22
    const/4 v7, 0x0

    :goto_16
    xor-int/2addr v7, v14

    if-eqz v7, :cond_32

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v7

    invoke-interface {v15, v7}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LY0/e;

    invoke-interface {v7, v5}, LY0/e;->B0(F)F

    move-result v7

    const/4 v14, 0x0

    invoke-static {v7, v14}, LE7/j;->c(FF)F

    move-result v7

    const/high16 v16, 0x70000000

    and-int v9, v9, v16

    const/high16 v14, 0x20000000

    if-ne v9, v14, :cond_23

    const/4 v14, 0x1

    goto :goto_17

    :cond_23
    const/4 v14, 0x0

    :goto_17
    invoke-interface {v15, v7}, LV/n;->h(F)Z

    move-result v17

    or-int v14, v14, v17

    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    if-nez v14, :cond_24

    sget-object v14, LV/n;->a:LV/n$a;

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v8, v14, :cond_25

    :cond_24
    new-instance v8, LS/f$h;

    invoke-direct {v8, v3, v7}, LS/f$h;-><init>(LS/y1;F)V

    invoke-interface {v15, v8}, LV/n;->K(Ljava/lang/Object;)V

    :cond_25
    check-cast v8, Lx7/a;

    const/4 v7, 0x0

    invoke-static {v8, v15, v7}, LV/Q;->f(Lx7/a;LV/n;I)V

    const/high16 v14, 0x20000000

    if-ne v9, v14, :cond_26

    const/4 v8, 0x1

    goto :goto_18

    :cond_26
    move v8, v7

    :goto_18
    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v8, :cond_27

    sget-object v8, LV/n;->a:LV/n$a;

    invoke-virtual {v8}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v7, v8, :cond_28

    :cond_27
    new-instance v7, LS/f$n;

    invoke-direct {v7, v3}, LS/f$n;-><init>(LS/y1;)V

    invoke-static {v7}, LV/v1;->e(Lx7/a;)LV/G1;

    move-result-object v7

    invoke-interface {v15, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_28
    check-cast v7, LV/G1;

    invoke-static {v7}, LS/f;->f(LV/G1;)F

    move-result v7

    invoke-virtual {v4, v7}, LS/w1;->a(F)J

    move-result-wide v7

    const/high16 v14, 0x43c80000    # 400.0f

    const/4 v1, 0x5

    const/4 v13, 0x0

    const/4 v2, 0x0

    invoke-static {v2, v14, v13, v1, v13}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v1

    const/16 v2, 0x30

    const/16 v14, 0xc

    const/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v21, v9

    move-object v9, v1

    move-object/from16 v10, v16

    move-object/from16 v11, v18

    move-object v12, v15

    move-object v1, v13

    move v13, v2

    const/high16 v1, 0x20000000

    const/4 v2, 0x1

    invoke-static/range {v7 .. v14}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v7

    new-instance v8, LS/f$k;

    invoke-direct {v8, v6}, LS/f$k;-><init>(Lx7/q;)V

    const/16 v9, 0x36

    const v10, 0x51ac10ea

    invoke-static {v10, v2, v8, v15, v9}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v17

    const v8, -0x4724f825

    invoke-interface {v15, v8}, LV/n;->T(I)V

    if-eqz v3, :cond_2f

    invoke-interface/range {p9 .. p9}, LS/y1;->a()Z

    move-result v8

    if-nez v8, :cond_2f

    sget-object v22, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v24, Lx/s;->C:Lx/s;

    move/from16 v8, v21

    if-ne v8, v1, :cond_29

    move v14, v2

    goto :goto_19

    :cond_29
    const/4 v14, 0x0

    :goto_19
    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v9

    if-nez v14, :cond_2a

    sget-object v10, LV/n;->a:LV/n$a;

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_2b

    :cond_2a
    new-instance v9, LS/f$l;

    invoke-direct {v9, v3}, LS/f$l;-><init>(LS/y1;)V

    invoke-interface {v15, v9}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2b
    check-cast v9, Lx7/l;

    const/4 v10, 0x0

    invoke-static {v9, v15, v10}, Lx/n;->i(Lx7/l;LV/n;I)Lx/o;

    move-result-object v23

    if-ne v8, v1, :cond_2c

    move v14, v2

    goto :goto_1a

    :cond_2c
    move v14, v10

    :goto_1a
    invoke-interface {v15}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_2d

    sget-object v8, LV/n;->a:LV/n$a;

    invoke-virtual {v8}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v1, v8, :cond_2e

    :cond_2d
    new-instance v1, LS/f$m;

    const/4 v8, 0x0

    invoke-direct {v1, v3, v8}, LS/f$m;-><init>(LS/y1;Lm7/e;)V

    invoke-interface {v15, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2e
    move-object/from16 v29, v1

    check-cast v29, Lx7/q;

    const/16 v31, 0xbc

    const/16 v32, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v22 .. v32}, Lx/n;->h(Landroidx/compose/ui/d;Lx/o;Lx/s;ZLz/l;ZLx7/q;Lx7/q;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    goto :goto_1b

    :cond_2f
    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_1b
    invoke-interface {v15}, LV/n;->J()V

    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-static {v7}, LS/f;->e(LV/G1;)J

    move-result-wide v18

    new-instance v14, LS/f$i;

    move-object v7, v14

    move-object/from16 v8, p7

    move/from16 v9, p6

    move-object/from16 v10, p9

    move-object/from16 v11, p8

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v20, v0

    move-object v0, v14

    move/from16 v14, p3

    move-object v3, v15

    move-object/from16 v15, p4

    move-object/from16 v16, v17

    invoke-direct/range {v7 .. v16}, LS/f$i;-><init>(LA/S;FLS/y1;LS/w1;Lx7/p;LM0/P;ZLx7/p;Lx7/p;)V

    const/16 v7, 0x36

    const v8, -0x73db1c9a

    invoke-static {v8, v2, v0, v3, v7}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v16

    const/high16 v0, 0xc00000

    const/16 v2, 0x7a

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v7, v1

    move-wide/from16 v9, v18

    move-object/from16 v17, v3

    move/from16 v18, v0

    move/from16 v19, v2

    invoke-static/range {v7 .. v19}, LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_30

    invoke-static {}, LV/q;->P()V

    :cond_30
    move-object/from16 v1, v20

    :goto_1c
    invoke-interface {v3}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_31

    new-instance v14, LS/f$j;

    move-object v0, v14

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LS/f$j;-><init>(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;II)V

    invoke-interface {v13, v14}, LV/e1;->a(Lx7/p;)V

    :cond_31
    return-void

    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The expandedHeight is expected to be specified and finite"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final e(LV/G1;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo0/y0;

    invoke-virtual {p0}, Lo0/y0;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(LV/G1;)F
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final g(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V
    .locals 50

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v11, p15

    move-object/from16 v10, p16

    move/from16 v9, p18

    move/from16 v7, p19

    const v0, -0x2c40c538

    move-object/from16 v3, p17

    invoke-interface {v3, v0}, LV/n;->r(I)LV/n;

    move-result-object v3

    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_1

    invoke-interface {v3, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_1
    move v4, v9

    :goto_1
    and-int/lit8 v8, v9, 0x30

    const/16 v16, 0x10

    if-nez v8, :cond_4

    and-int/lit8 v8, v9, 0x40

    if-nez v8, :cond_2

    invoke-interface {v3, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_2
    invoke-interface {v3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_3

    :cond_3
    move/from16 v8, v16

    :goto_3
    or-int/2addr v4, v8

    :cond_4
    and-int/lit16 v8, v9, 0x180

    const/16 v17, 0x80

    const/16 v18, 0x100

    move-wide/from16 v5, p2

    if-nez v8, :cond_6

    invoke-interface {v3, v5, v6}, LV/n;->j(J)Z

    move-result v20

    if-eqz v20, :cond_5

    move/from16 v20, v18

    goto :goto_4

    :cond_5
    move/from16 v20, v17

    :goto_4
    or-int v4, v4, v20

    :cond_6
    and-int/lit16 v8, v9, 0xc00

    const/16 v21, 0x400

    const/16 v22, 0x800

    move-wide/from16 v0, p4

    if-nez v8, :cond_8

    invoke-interface {v3, v0, v1}, LV/n;->j(J)Z

    move-result v23

    if-eqz v23, :cond_7

    move/from16 v23, v22

    goto :goto_5

    :cond_7
    move/from16 v23, v21

    :goto_5
    or-int v4, v4, v23

    :cond_8
    and-int/lit16 v8, v9, 0x6000

    move-wide/from16 v5, p6

    if-nez v8, :cond_a

    invoke-interface {v3, v5, v6}, LV/n;->j(J)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v4, v8

    :cond_a
    const/high16 v8, 0x30000

    and-int/2addr v8, v9

    if-nez v8, :cond_c

    move-object/from16 v8, p8

    invoke-interface {v3, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_b

    const/high16 v24, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v24, 0x10000

    :goto_7
    or-int v4, v4, v24

    goto :goto_8

    :cond_c
    move-object/from16 v8, p8

    :goto_8
    const/high16 v24, 0x180000

    and-int v24, v9, v24

    move-object/from16 v8, p9

    if-nez v24, :cond_e

    invoke-interface {v3, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    const/high16 v24, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v24, 0x80000

    :goto_9
    or-int v4, v4, v24

    :cond_e
    const/high16 v24, 0xc00000

    and-int v24, v9, v24

    move/from16 v8, p10

    if-nez v24, :cond_10

    invoke-interface {v3, v8}, LV/n;->h(F)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x800000

    goto :goto_a

    :cond_f
    const/high16 v24, 0x400000

    :goto_a
    or-int v4, v4, v24

    :cond_10
    const/high16 v24, 0x6000000

    and-int v24, v9, v24

    if-nez v24, :cond_12

    invoke-interface {v3, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    const/high16 v1, 0x4000000

    goto :goto_b

    :cond_11
    const/high16 v1, 0x2000000

    :goto_b
    or-int/2addr v4, v1

    :cond_12
    const/high16 v1, 0x30000000

    and-int/2addr v1, v9

    if-nez v1, :cond_14

    invoke-interface {v3, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_13

    const/high16 v1, 0x20000000

    goto :goto_c

    :cond_13
    const/high16 v1, 0x10000000

    :goto_c
    or-int/2addr v4, v1

    :cond_14
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_16

    invoke-interface {v3, v14}, LV/n;->i(I)Z

    move-result v1

    if-eqz v1, :cond_15

    const/4 v1, 0x4

    goto :goto_d

    :cond_15
    const/4 v1, 0x2

    :goto_d
    or-int/2addr v1, v7

    goto :goto_e

    :cond_16
    move v1, v7

    :goto_e
    and-int/lit8 v25, v7, 0x30

    if-nez v25, :cond_18

    invoke-interface {v3, v15}, LV/n;->d(Z)Z

    move-result v25

    if-eqz v25, :cond_17

    const/16 v16, 0x20

    :cond_17
    or-int v1, v1, v16

    :cond_18
    and-int/lit16 v0, v7, 0x180

    if-nez v0, :cond_1a

    invoke-interface {v3, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    move/from16 v17, v18

    :cond_19
    or-int v1, v1, v17

    :cond_1a
    and-int/lit16 v0, v7, 0xc00

    if-nez v0, :cond_1c

    invoke-interface {v3, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    move/from16 v21, v22

    :cond_1b
    or-int v1, v1, v21

    :cond_1c
    const v0, 0x12492493

    and-int/2addr v0, v4

    const v5, 0x12492492

    if-ne v0, v5, :cond_1e

    and-int/lit16 v0, v1, 0x493

    const/16 v5, 0x492

    if-ne v0, v5, :cond_1e

    invoke-interface {v3}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_f

    :cond_1d
    invoke-interface {v3}, LV/n;->A()V

    goto/16 :goto_1a

    :cond_1e
    :goto_f
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1f

    const-string v0, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)"

    const v5, -0x2c40c538

    invoke-static {v5, v4, v1, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1f
    and-int/lit8 v0, v4, 0x70

    const/16 v5, 0x20

    if-eq v0, v5, :cond_21

    and-int/lit8 v0, v4, 0x40

    if-eqz v0, :cond_20

    invoke-interface {v3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    goto :goto_10

    :cond_20
    const/4 v0, 0x0

    goto :goto_11

    :cond_21
    :goto_10
    const/4 v0, 0x1

    :goto_11
    const/high16 v5, 0x70000000

    and-int/2addr v5, v4

    const/high16 v6, 0x20000000

    if-ne v5, v6, :cond_22

    const/4 v5, 0x1

    goto :goto_12

    :cond_22
    const/4 v5, 0x0

    :goto_12
    or-int/2addr v0, v5

    const/high16 v5, 0xe000000

    and-int/2addr v5, v4

    const/high16 v6, 0x4000000

    if-ne v5, v6, :cond_23

    const/4 v5, 0x1

    goto :goto_13

    :cond_23
    const/4 v5, 0x0

    :goto_13
    or-int/2addr v0, v5

    and-int/lit8 v5, v1, 0xe

    const/4 v6, 0x4

    if-ne v5, v6, :cond_24

    const/4 v5, 0x1

    goto :goto_14

    :cond_24
    const/4 v5, 0x0

    :goto_14
    or-int/2addr v0, v5

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_25

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v5, v0, :cond_26

    :cond_25
    new-instance v5, LS/f$p;

    invoke-direct {v5, v2, v13, v12, v14}, LS/f$p;-><init>(LS/N0;LA/b$e;LA/b$m;I)V

    invoke-interface {v3, v5}, LV/n;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v5, LD0/I;

    const/4 v0, 0x0

    invoke-static {v3, v0}, LV/k;->a(LV/n;I)I

    move-result v6

    invoke-interface {v3}, LV/n;->F()LV/z;

    move-result-object v0

    move-object/from16 v2, p0

    invoke-static {v3, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v7

    sget-object v23, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->a()Lx7/a;

    move-result-object v2

    invoke-interface {v3}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_27

    invoke-static {}, LV/k;->c()V

    :cond_27
    invoke-interface {v3}, LV/n;->t()V

    invoke-interface {v3}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_28

    invoke-interface {v3, v2}, LV/n;->B(Lx7/a;)V

    goto :goto_15

    :cond_28
    invoke-interface {v3}, LV/n;->H()V

    :goto_15
    invoke-static {v3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v2

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->c()Lx7/p;

    move-result-object v8

    invoke-static {v2, v5, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->e()Lx7/p;

    move-result-object v5

    invoke-static {v2, v0, v5}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->b()Lx7/p;

    move-result-object v0

    invoke-interface {v2}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_29

    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2a

    :cond_29
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v5, v0}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_2a
    invoke-virtual/range {v23 .. v23}, LF0/g$a;->d()Lx7/p;

    move-result-object v0

    invoke-static {v2, v7, v0}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v2, "navigationIcon"

    invoke-static {v0, v2}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v24

    sget v2, LS/f;->h:F

    const/16 v29, 0xe

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v25, v2

    invoke-static/range {v24 .. v30}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v5

    sget-object v6, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v7

    invoke-static {v3, v8}, LV/k;->a(LV/n;I)I

    move-result v16

    invoke-interface {v3}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v3, v5}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v5

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface {v3}, LV/n;->v()LV/g;

    move-result-object v12

    instance-of v12, v12, LV/g;

    if-nez v12, :cond_2b

    invoke-static {}, LV/k;->c()V

    :cond_2b
    invoke-interface {v3}, LV/n;->t()V

    invoke-interface {v3}, LV/n;->o()Z

    move-result v12

    if-eqz v12, :cond_2c

    invoke-interface {v3, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_16

    :cond_2c
    invoke-interface {v3}, LV/n;->H()V

    :goto_16
    invoke-static {v3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->c()Lx7/p;

    move-result-object v12

    invoke-static {v9, v7, v12}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->e()Lx7/p;

    move-result-object v7

    invoke-static {v9, v8, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->b()Lx7/p;

    move-result-object v7

    invoke-interface {v9}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_2d

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2e

    :cond_2d
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8, v7}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_2e
    invoke-virtual/range {v23 .. v23}, LF0/g$a;->d()Lx7/p;

    move-result-object v7

    invoke-static {v9, v5, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v5, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v5

    invoke-static/range {p2 .. p3}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v7

    invoke-virtual {v5, v7}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v5

    sget v7, LV/P0;->i:I

    shr-int/lit8 v8, v1, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/2addr v8, v7

    invoke-static {v5, v11, v3, v8}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-interface {v3}, LV/n;->Q()V

    const-string v5, "title"

    invoke-static {v0, v5}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x2

    invoke-static {v5, v2, v8, v12, v9}, Landroidx/compose/foundation/layout/m;->k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v5

    if-eqz v15, :cond_2f

    sget-object v8, LS/f$o;->D:LS/f$o;

    invoke-static {v0, v8}, LK0/n;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v8

    goto :goto_17

    :cond_2f
    move-object v8, v0

    :goto_17
    invoke-interface {v5, v8}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v25

    const v46, 0x1fffb

    const/16 v47, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const/16 v45, 0x0

    move/from16 v28, p10

    invoke-static/range {v25 .. v47}, Landroidx/compose/ui/graphics/b;->c(Landroidx/compose/ui/d;FFFFFFFFFFJLo0/e2;ZLo0/Z1;JJIILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v5

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v8

    invoke-static {v3, v9}, LV/k;->a(LV/n;I)I

    move-result v12

    invoke-interface {v3}, LV/n;->F()LV/z;

    move-result-object v9

    invoke-static {v3, v5}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v5

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->a()Lx7/a;

    move-result-object v11

    invoke-interface {v3}, LV/n;->v()LV/g;

    move-result-object v13

    instance-of v13, v13, LV/g;

    if-nez v13, :cond_30

    invoke-static {}, LV/k;->c()V

    :cond_30
    invoke-interface {v3}, LV/n;->t()V

    invoke-interface {v3}, LV/n;->o()Z

    move-result v13

    if-eqz v13, :cond_31

    invoke-interface {v3, v11}, LV/n;->B(Lx7/a;)V

    goto :goto_18

    :cond_31
    invoke-interface {v3}, LV/n;->H()V

    :goto_18
    invoke-static {v3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v11

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->c()Lx7/p;

    move-result-object v13

    invoke-static {v11, v8, v13}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->e()Lx7/p;

    move-result-object v8

    invoke-static {v11, v9, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->b()Lx7/p;

    move-result-object v8

    invoke-interface {v11}, LV/n;->o()Z

    move-result v9

    if-nez v9, :cond_32

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_33

    :cond_32
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v11, v9, v8}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_33
    invoke-virtual/range {v23 .. v23}, LF0/g$a;->d()Lx7/p;

    move-result-object v8

    invoke-static {v11, v5, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    shr-int/lit8 v5, v4, 0x9

    and-int/lit8 v8, v5, 0xe

    shr-int/lit8 v4, v4, 0xf

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v8

    and-int/lit16 v5, v5, 0x380

    or-int v21, v4, v5

    move-wide/from16 v16, p4

    move-object/from16 v18, p9

    move-object/from16 v19, p8

    move-object/from16 v20, v3

    invoke-static/range {v16 .. v21}, LT/w;->a(JLM0/P;Lx7/p;LV/n;I)V

    invoke-interface {v3}, LV/n;->Q()V

    const-string v4, "actionIcons"

    invoke-static {v0, v4}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v25

    const/16 v30, 0xb

    const/16 v31, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual {v6}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {v3, v4}, LV/k;->a(LV/n;I)I

    move-result v4

    invoke-interface {v3}, LV/n;->F()LV/z;

    move-result-object v5

    invoke-static {v3, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    invoke-interface {v3}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_34

    invoke-static {}, LV/k;->c()V

    :cond_34
    invoke-interface {v3}, LV/n;->t()V

    invoke-interface {v3}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v3, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_19

    :cond_35
    invoke-interface {v3}, LV/n;->H()V

    :goto_19
    invoke-static {v3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->c()Lx7/p;

    move-result-object v8

    invoke-static {v6, v2, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v6, v5, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v23 .. v23}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v6}, LV/n;->o()Z

    move-result v5

    if-nez v5, :cond_36

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_37

    :cond_36
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v6, v5}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_37
    invoke-virtual/range {v23 .. v23}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v6, v0, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v0

    invoke-static/range {p6 .. p7}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v2

    invoke-virtual {v0, v2}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v0

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v7

    invoke-static {v0, v10, v3, v1}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-interface {v3}, LV/n;->Q()V

    invoke-interface {v3}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, LV/q;->P()V

    :cond_38
    :goto_1a
    invoke-interface {v3}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_39

    new-instance v12, LS/f$q;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    move-wide/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v48, v12

    move-object/from16 v12, p11

    move-object/from16 v49, v13

    move-object/from16 v13, p12

    move/from16 v14, p13

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    invoke-direct/range {v0 .. v19}, LS/f$q;-><init>(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;II)V

    move-object/from16 v1, v48

    move-object/from16 v0, v49

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_39
    return-void
.end method

.method public static final synthetic h(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V
    .locals 0

    invoke-static/range {p0 .. p12}, LS/f;->d(Landroidx/compose/ui/d;Lx7/p;LM0/P;ZLx7/p;Lx7/q;FLA/S;LS/w1;LS/y1;LV/n;II)V

    return-void
.end method

.method public static final synthetic i(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V
    .locals 0

    invoke-static/range {p0 .. p19}, LS/f;->g(Landroidx/compose/ui/d;LS/N0;JJJLx7/p;LM0/P;FLA/b$m;LA/b$e;IZLx7/p;Lx7/p;LV/n;II)V

    return-void
.end method

.method public static final synthetic j()F
    .locals 1

    sget v0, LS/f;->a:F

    return v0
.end method

.method public static final synthetic k()F
    .locals 1

    sget v0, LS/f;->i:F

    return v0
.end method

.method public static final l()F
    .locals 1

    sget v0, LS/f;->b:F

    return v0
.end method
