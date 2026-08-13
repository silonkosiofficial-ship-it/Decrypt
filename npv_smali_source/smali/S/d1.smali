.class public abstract LS/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:J

.field private static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LU/w;->a:LU/w;

    invoke-virtual {v0}, LU/w;->e()F

    move-result v0

    sput v0, LS/d1;->a:F

    const/16 v0, 0x48

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/d1;->b:F

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/d1;->c:F

    const/16 v0, 0xe

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/d1;->d:F

    const/4 v0, 0x6

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/d1;->e:F

    const/16 v0, 0x14

    invoke-static {v0}, LY0/y;->f(I)J

    move-result-wide v0

    sput-wide v0, LS/d1;->f:J

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/d1;->g:F

    return-void
.end method

.method public static final a(ZLx7/a;Landroidx/compose/ui/d;ZJJLz/l;Lx7/q;LV/n;II)V
    .locals 27

    .prologue
    move/from16 v11, p11

    move/from16 v12, p12

    const v0, -0xc158108

    move-object/from16 v1, p10

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v9

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    move/from16 v10, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    move/from16 v10, p0

    if-nez v1, :cond_2

    invoke-interface {v9, v10}, LV/n;->d(Z)Z

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
    and-int/lit8 v2, v12, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    move-object/from16 v8, p1

    if-nez v2, :cond_5

    invoke-interface {v9, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, v12, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v9, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_4

    :cond_8
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :goto_5
    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_9

    move/from16 v5, p3

    invoke-interface {v9, v5}, LV/n;->d(Z)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x800

    goto :goto_6

    :cond_b
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    :goto_7
    and-int/lit16 v6, v11, 0x6000

    if-nez v6, :cond_e

    and-int/lit8 v6, v12, 0x10

    if-nez v6, :cond_c

    move-wide/from16 v6, p4

    invoke-interface {v9, v6, v7}, LV/n;->j(J)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    move-wide/from16 v6, p4

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v1, v13

    goto :goto_9

    :cond_e
    move-wide/from16 v6, p4

    :goto_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v11

    if-nez v13, :cond_11

    and-int/lit8 v13, v12, 0x20

    if-nez v13, :cond_f

    move-wide/from16 v13, p6

    invoke-interface {v9, v13, v14}, LV/n;->j(J)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_f
    move-wide/from16 v13, p6

    :cond_10
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v1, v15

    goto :goto_b

    :cond_11
    move-wide/from16 v13, p6

    :goto_b
    and-int/lit8 v15, v12, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_12

    or-int v1, v1, v16

    move-object/from16 v0, p8

    goto :goto_d

    :cond_12
    and-int v16, v11, v16

    move-object/from16 v0, p8

    if-nez v16, :cond_14

    invoke-interface {v9, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x80000

    :goto_c
    or-int v1, v1, v17

    :cond_14
    :goto_d
    and-int/lit16 v0, v12, 0x80

    const/high16 v17, 0xc00000

    if-eqz v0, :cond_16

    or-int v1, v1, v17

    :cond_15
    move-object/from16 v0, p9

    goto :goto_f

    :cond_16
    and-int v0, v11, v17

    if-nez v0, :cond_15

    move-object/from16 v0, p9

    invoke-interface {v9, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_17

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v17, 0x400000

    :goto_e
    or-int v1, v1, v17

    :goto_f
    const v17, 0x492493

    and-int v0, v1, v17

    const v3, 0x492492

    if-ne v0, v3, :cond_19

    invoke-interface {v9}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v9}, LV/n;->A()V

    move-object/from16 v3, p2

    move-object/from16 v26, p8

    move v4, v5

    move-wide v5, v6

    move-wide v7, v13

    goto/16 :goto_15

    :cond_19
    :goto_10
    invoke-interface {v9}, LV/n;->q()V

    and-int/lit8 v0, v11, 0x1

    const v17, -0xe001

    const/4 v3, 0x1

    if-eqz v0, :cond_1e

    invoke-interface {v9}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-interface {v9}, LV/n;->A()V

    and-int/lit8 v0, v12, 0x10

    if-eqz v0, :cond_1b

    and-int v1, v1, v17

    :cond_1b
    and-int/lit8 v0, v12, 0x20

    if-eqz v0, :cond_1c

    const v0, -0x70001

    and-int/2addr v1, v0

    :cond_1c
    move-object/from16 v0, p2

    :cond_1d
    move-object/from16 v26, p8

    :goto_11
    move/from16 v21, v5

    move-wide/from16 v22, v6

    move-wide/from16 v24, v13

    goto :goto_14

    :cond_1e
    :goto_12
    if-eqz v2, :cond_1f

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_13

    :cond_1f
    move-object/from16 v0, p2

    :goto_13
    if-eqz v4, :cond_20

    move v5, v3

    :cond_20
    and-int/lit8 v2, v12, 0x10

    if-eqz v2, :cond_21

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v2

    invoke-interface {v9, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo0/y0;

    invoke-virtual {v2}, Lo0/y0;->w()J

    move-result-wide v6

    and-int v1, v1, v17

    :cond_21
    and-int/lit8 v2, v12, 0x20

    if-eqz v2, :cond_22

    const v2, -0x70001

    and-int/2addr v1, v2

    move-wide v13, v6

    :cond_22
    if-eqz v15, :cond_1d

    const/4 v2, 0x0

    move-object/from16 v26, v2

    goto :goto_11

    :goto_14
    invoke-interface {v9}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_23

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.Tab (Tab.kt:242)"

    const v5, -0xc158108

    invoke-static {v5, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_23
    shr-int/lit8 v2, v1, 0x6

    and-int/lit16 v2, v2, 0x380

    or-int/lit8 v2, v2, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    move/from16 p2, v5

    move/from16 p3, v6

    move-wide/from16 p4, v22

    move-object/from16 p6, v9

    move/from16 p7, v2

    move/from16 p8, v4

    invoke-static/range {p2 .. p8}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v17

    new-instance v2, LS/d1$c;

    move-object v13, v2

    move-object v14, v0

    move/from16 v15, p0

    move-object/from16 v16, v26

    move/from16 v18, v21

    move-object/from16 v19, p1

    move-object/from16 v20, p9

    invoke-direct/range {v13 .. v20}, LS/d1$c;-><init>(Landroidx/compose/ui/d;ZLz/l;Lv/G;ZLx7/a;Lx7/q;)V

    const/16 v4, 0x36

    const v5, -0x20e5444c

    invoke-static {v5, v3, v2, v9, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v6

    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v3, v2, 0xe

    or-int/lit16 v3, v3, 0xc00

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int v13, v2, v1

    move-wide/from16 v1, v22

    move-wide/from16 v3, v24

    move/from16 v5, p0

    move-object v7, v9

    move v8, v13

    invoke-static/range {v1 .. v8}, LS/d1;->d(JJZLx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-static {}, LV/q;->P()V

    :cond_24
    move-object v3, v0

    move/from16 v4, v21

    move-wide/from16 v5, v22

    move-wide/from16 v7, v24

    :goto_15
    invoke-interface {v9}, LV/n;->x()LV/e1;

    move-result-object v13

    if-eqz v13, :cond_25

    new-instance v14, LS/d1$d;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v9, v26

    move-object/from16 v10, p9

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LS/d1$d;-><init>(ZLx7/a;Landroidx/compose/ui/d;ZJJLz/l;Lx7/q;II)V

    invoke-interface {v13, v14}, LV/e1;->a(Lx7/p;)V

    :cond_25
    return-void
.end method

.method public static final b(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;LV/n;II)V
    .locals 29

    .prologue
    move/from16 v12, p12

    move/from16 v13, p13

    const v0, -0x14e6256d

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v13, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v12, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LV/n;->d(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v3, v12

    :goto_1
    and-int/lit8 v4, v13, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v12, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v1, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :goto_3
    and-int/lit8 v5, v13, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v1, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    :goto_5
    and-int/lit8 v7, v13, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move/from16 v8, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v12, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p3

    invoke-interface {v1, v8}, LV/n;->d(Z)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_6

    :cond_b
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :goto_7
    and-int/lit8 v9, v13, 0x10

    if-eqz v9, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v12, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p4

    invoke-interface {v1, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_8

    :cond_e
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v3, v11

    :goto_9
    and-int/lit8 v11, v13, 0x20

    const/high16 v14, 0x30000

    if-eqz v11, :cond_10

    or-int/2addr v3, v14

    :cond_f
    move-object/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int/2addr v14, v12

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-interface {v1, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    :goto_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v12

    if-nez v15, :cond_14

    and-int/lit8 v15, v13, 0x40

    if-nez v15, :cond_12

    move-wide/from16 v14, p6

    invoke-interface {v1, v14, v15}, LV/n;->j(J)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_12
    move-wide/from16 v14, p6

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v3, v3, v16

    goto :goto_d

    :cond_14
    move-wide/from16 v14, p6

    :goto_d
    const/high16 v16, 0xc00000

    and-int v17, v12, v16

    if-nez v17, :cond_16

    and-int/lit16 v0, v13, 0x80

    move-wide/from16 v14, p8

    if-nez v0, :cond_15

    invoke-interface {v1, v14, v15}, LV/n;->j(J)Z

    move-result v0

    if-eqz v0, :cond_15

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_15
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v3, v0

    goto :goto_f

    :cond_16
    move-wide/from16 v14, p8

    :goto_f
    and-int/lit16 v0, v13, 0x100

    const/high16 v18, 0x6000000

    if-eqz v0, :cond_17

    or-int v3, v3, v18

    move-object/from16 v2, p10

    goto :goto_11

    :cond_17
    and-int v18, v12, v18

    move-object/from16 v2, p10

    if-nez v18, :cond_19

    invoke-interface {v1, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/high16 v18, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v18, 0x2000000

    :goto_10
    or-int v3, v3, v18

    :cond_19
    :goto_11
    const v18, 0x2492493

    and-int v2, v3, v18

    const v4, 0x2492492

    if-ne v2, v4, :cond_1b

    invoke-interface {v1}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v11, p10

    move-object v3, v6

    move v4, v8

    move-object v5, v10

    move-wide v9, v14

    move-object/from16 v6, p5

    move-wide/from16 v7, p6

    goto/16 :goto_1a

    :cond_1b
    :goto_12
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v2, v12, 0x1

    const v18, -0x380001

    const/16 v19, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1f

    invoke-interface {v1}, LV/n;->G()Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_13

    :cond_1c
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_1d

    and-int v3, v3, v18

    :cond_1d
    and-int/lit16 v0, v13, 0x80

    if-eqz v0, :cond_1e

    const v0, -0x1c00001

    and-int/2addr v3, v0

    :cond_1e
    move-object/from16 v5, p5

    move-object/from16 v0, p10

    move-object v2, v6

    move-wide/from16 v27, v14

    move-wide/from16 v6, p6

    goto :goto_17

    :cond_1f
    :goto_13
    if-eqz v5, :cond_20

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_14

    :cond_20
    move-object v2, v6

    :goto_14
    if-eqz v7, :cond_21

    move v8, v4

    :cond_21
    if-eqz v9, :cond_22

    move-object/from16 v10, v19

    :cond_22
    if-eqz v11, :cond_23

    move-object/from16 v5, v19

    goto :goto_15

    :cond_23
    move-object/from16 v5, p5

    :goto_15
    and-int/lit8 v6, v13, 0x40

    if-eqz v6, :cond_24

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v6

    invoke-interface {v1, v6}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lo0/y0;

    invoke-virtual {v6}, Lo0/y0;->w()J

    move-result-wide v6

    and-int v3, v3, v18

    goto :goto_16

    :cond_24
    move-wide/from16 v6, p6

    :goto_16
    and-int/lit16 v9, v13, 0x80

    if-eqz v9, :cond_25

    const v9, -0x1c00001

    and-int/2addr v3, v9

    move-wide v14, v6

    :cond_25
    if-eqz v0, :cond_26

    move-wide/from16 v27, v14

    move-object/from16 v0, v19

    goto :goto_17

    :cond_26
    move-object/from16 v0, p10

    move-wide/from16 v27, v14

    :goto_17
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_27

    const/4 v9, -0x1

    const-string v11, "androidx.compose.material3.Tab (Tab.kt:102)"

    const v14, -0x14e6256d

    invoke-static {v14, v3, v9, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_27
    const v9, 0x4be5771

    invoke-interface {v1, v9}, LV/n;->T(I)V

    const/16 v9, 0x36

    if-nez v10, :cond_28

    :goto_18
    move-object/from16 v11, v19

    goto :goto_19

    :cond_28
    new-instance v11, LS/d1$e;

    invoke-direct {v11, v10}, LS/d1$e;-><init>(Lx7/p;)V

    const v14, 0x2a4090bc

    invoke-static {v14, v4, v11, v1, v9}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v19

    goto :goto_18

    :goto_19
    invoke-interface {v1}, LV/n;->J()V

    new-instance v14, LS/d1$a;

    invoke-direct {v14, v11, v5}, LS/d1$a;-><init>(Lx7/p;Lx7/p;)V

    const v11, 0x5bd9bbc6

    invoke-static {v11, v4, v14, v1, v9}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v23

    and-int/lit8 v4, v3, 0xe

    or-int v4, v4, v16

    and-int/lit8 v9, v3, 0x70

    or-int/2addr v4, v9

    and-int/lit16 v9, v3, 0x380

    or-int/2addr v4, v9

    and-int/lit16 v9, v3, 0x1c00

    or-int/2addr v4, v9

    shr-int/lit8 v3, v3, 0x6

    const v9, 0xe000

    and-int/2addr v9, v3

    or-int/2addr v4, v9

    const/high16 v9, 0x70000

    and-int/2addr v9, v3

    or-int/2addr v4, v9

    const/high16 v9, 0x380000

    and-int/2addr v3, v9

    or-int v25, v4, v3

    const/16 v26, 0x0

    move/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v16, v2

    move/from16 v17, v8

    move-wide/from16 v18, v6

    move-wide/from16 v20, v27

    move-object/from16 v22, v0

    move-object/from16 v24, v1

    invoke-static/range {v14 .. v26}, LS/d1;->a(ZLx7/a;Landroidx/compose/ui/d;ZJJLz/l;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_29

    invoke-static {}, LV/q;->P()V

    :cond_29
    move-object v11, v0

    move-object v3, v2

    move v4, v8

    move-wide v7, v6

    move-object v6, v5

    move-object v5, v10

    move-wide/from16 v9, v27

    :goto_1a
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v14

    if-eqz v14, :cond_2a

    new-instance v15, LS/d1$b;

    move-object v0, v15

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, LS/d1$b;-><init>(ZLx7/a;Landroidx/compose/ui/d;ZLx7/p;Lx7/p;JJLz/l;II)V

    invoke-interface {v14, v15}, LV/e1;->a(Lx7/p;)V

    :cond_2a
    return-void
.end method

.method private static final c(Lx7/p;Lx7/p;LV/n;I)V
    .locals 12

    .prologue
    const v0, 0x1ea50644

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit8 v4, v1, 0x13

    const/16 v6, 0x12

    if-ne v4, v6, :cond_5

    invoke-interface {p2}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LV/n;->A()V

    goto/16 :goto_9

    :cond_5
    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, -0x1

    const-string v6, "androidx.compose.material3.TabBaselineLayout (Tab.kt:306)"

    invoke-static {v0, v1, v4, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_6
    and-int/lit8 v0, v1, 0xe

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-ne v0, v3, :cond_7

    move v3, v4

    goto :goto_4

    :cond_7
    move v3, v6

    :goto_4
    and-int/lit8 v7, v1, 0x70

    if-ne v7, v5, :cond_8

    goto :goto_5

    :cond_8
    move v4, v6

    :goto_5
    or-int/2addr v3, v4

    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, LS/d1$f;

    invoke-direct {v4, p0, p1}, LS/d1$f;-><init>(Lx7/p;Lx7/p;)V

    invoke-interface {p2, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, LD0/I;

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {p2, v6}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {p2}, LV/n;->F()LV/z;

    move-result-object v7

    invoke-static {p2, v3}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v8

    sget-object v9, LF0/g;->a:LF0/g$a;

    invoke-virtual {v9}, LF0/g$a;->a()Lx7/a;

    move-result-object v10

    invoke-interface {p2}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_b

    invoke-static {}, LV/k;->c()V

    :cond_b
    invoke-interface {p2}, LV/n;->t()V

    invoke-interface {p2}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {p2, v10}, LV/n;->B(Lx7/a;)V

    goto :goto_6

    :cond_c
    invoke-interface {p2}, LV/n;->H()V

    :goto_6
    invoke-static {p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v10

    invoke-virtual {v9}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v10, v4, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v10, v7, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->b()Lx7/p;

    move-result-object v4

    invoke-interface {v10}, LV/n;->o()Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v10, v5, v4}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_e
    invoke-virtual {v9}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v10, v8, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    const v4, 0x33f30bbf

    invoke-interface {p2, v4}, LV/n;->T(I)V

    if-eqz p0, :cond_13

    const-string v4, "text"

    invoke-static {v3, v4}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v4

    sget v5, LS/d1;->c:F

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v5, v7, v2, v8}, Landroidx/compose/foundation/layout/m;->k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->o()Lh0/c;

    move-result-object v4

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v4

    invoke-static {p2, v6}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {p2}, LV/n;->F()LV/z;

    move-result-object v7

    invoke-static {p2, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual {v9}, LF0/g$a;->a()Lx7/a;

    move-result-object v8

    invoke-interface {p2}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_f

    invoke-static {}, LV/k;->c()V

    :cond_f
    invoke-interface {p2}, LV/n;->t()V

    invoke-interface {p2}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {p2, v8}, LV/n;->B(Lx7/a;)V

    goto :goto_7

    :cond_10
    invoke-interface {p2}, LV/n;->H()V

    :goto_7
    invoke-static {p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v8

    invoke-virtual {v9}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v8, v4, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v8, v7, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->b()Lx7/p;

    move-result-object v4

    invoke-interface {v8}, LV/n;->o()Z

    move-result v7

    if-nez v7, :cond_11

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_12
    invoke-virtual {v9}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v8, v2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LV/n;->Q()V

    :cond_13
    invoke-interface {p2}, LV/n;->J()V

    const v0, 0x33f31c93

    invoke-interface {p2, v0}, LV/n;->T(I)V

    if-eqz p1, :cond_18

    const-string v0, "icon"

    invoke-static {v3, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v2, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v2}, Lh0/c$a;->o()Lh0/c;

    move-result-object v2

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {p2, v6}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {p2}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p2, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-virtual {v9}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p2}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_14

    invoke-static {}, LV/k;->c()V

    :cond_14
    invoke-interface {p2}, LV/n;->t()V

    invoke-interface {p2}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {p2, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_8

    :cond_15
    invoke-interface {p2}, LV/n;->H()V

    :goto_8
    invoke-static {p2}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v9}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v5, v4, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v9}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v5}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_16

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_17
    invoke-virtual {v9}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v5, v0, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, p2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, LV/n;->Q()V

    :cond_18
    invoke-interface {p2}, LV/n;->J()V

    invoke-interface {p2}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, LV/q;->P()V

    :cond_19
    :goto_9
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_1a

    new-instance v0, LS/d1$g;

    invoke-direct {v0, p0, p1, p3}, LS/d1$g;-><init>(Lx7/p;Lx7/p;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_1a
    return-void
.end method

.method private static final d(JJZLx7/p;LV/n;I)V
    .locals 18

    .prologue
    move-object/from16 v6, p5

    move/from16 v7, p7

    const v0, 0x2bda6088

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v7, 0x6

    const/4 v3, 0x2

    move-wide/from16 v4, p0

    if-nez v2, :cond_1

    invoke-interface {v1, v4, v5}, LV/n;->j(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v8, v7, 0x30

    move-wide/from16 v14, p2

    if-nez v8, :cond_3

    invoke-interface {v1, v14, v15}, LV/n;->j(J)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :cond_3
    and-int/lit16 v8, v7, 0x180

    move/from16 v13, p4

    if-nez v8, :cond_5

    invoke-interface {v1, v13}, LV/n;->d(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v2, v8

    :cond_5
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_7

    invoke-interface {v1, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v2, v8

    :cond_7
    and-int/lit16 v8, v2, 0x493

    const/16 v9, 0x492

    if-ne v8, v9, :cond_9

    invoke-interface {v1}, LV/n;->u()Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v1}, LV/n;->A()V

    goto/16 :goto_9

    :cond_9
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v8

    const/4 v9, -0x1

    if-eqz v8, :cond_a

    const-string v8, "androidx.compose.material3.TabTransition (Tab.kt:279)"

    invoke-static {v0, v2, v9, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v8, v2, 0xe

    const/4 v10, 0x0

    invoke-static {v0, v10, v1, v8, v3}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v8

    sget-object v0, LS/d1$i;->D:LS/d1$i;

    invoke-virtual {v8}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const v10, -0x770830db

    invoke-interface {v1, v10}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    const-string v12, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:295)"

    const/4 v4, 0x0

    if-eqz v11, :cond_b

    invoke-static {v10, v4, v9, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_b
    if-eqz v3, :cond_c

    move-wide/from16 v16, p0

    goto :goto_6

    :cond_c
    move-wide/from16 v16, v14

    :goto_6
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-static {}, LV/q;->P()V

    :cond_d
    invoke-interface {v1}, LV/n;->J()V

    invoke-static/range {v16 .. v17}, Lo0/y0;->r(J)Lp0/c;

    move-result-object v3

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_e

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v11, v5, :cond_f

    :cond_e
    sget-object v5, Lo0/y0;->b:Lo0/y0$a;

    invoke-static {v5}, Lt/j;->a(Lo0/y0$a;)Lx7/l;

    move-result-object v5

    invoke-interface {v5, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Lu/x0;

    invoke-interface {v1, v11}, LV/n;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v3, v11

    check-cast v3, Lu/x0;

    invoke-virtual {v8}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-interface {v1, v10}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-static {v10, v4, v9, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_10
    if-eqz v5, :cond_11

    move-wide/from16 v16, p0

    goto :goto_7

    :cond_11
    move-wide/from16 v16, v14

    :goto_7
    invoke-static {}, LV/q;->H()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    invoke-interface {v1}, LV/n;->J()V

    invoke-static/range {v16 .. v17}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v5

    invoke-virtual {v8}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-interface {v1, v10}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v16

    if-eqz v16, :cond_13

    invoke-static {v10, v4, v9, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_13
    if-eqz v11, :cond_14

    move-wide/from16 v9, p0

    goto :goto_8

    :cond_14
    move-wide v9, v14

    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-static {}, LV/q;->P()V

    :cond_15
    invoke-interface {v1}, LV/n;->J()V

    invoke-static {v9, v10}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v10

    invoke-virtual {v8}, Lu/s0;->n()Lu/s0$b;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v9, v1, v4}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lu/I;

    const/4 v0, 0x0

    const-string v4, "ColorAnimation"

    move-object v9, v5

    move-object v12, v3

    move-object v13, v4

    move-object v14, v1

    move v15, v0

    invoke-static/range {v8 .. v15}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v0

    invoke-static {}, LS/J;->a()LV/O0;

    move-result-object v3

    invoke-static {v0}, LS/d1;->e(LV/G1;)J

    move-result-wide v4

    invoke-static {v4, v5}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object v0

    invoke-virtual {v3, v0}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v0

    sget v3, LV/P0;->i:I

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v3

    invoke-static {v0, v6, v1, v2}, LV/y;->a(LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LV/q;->P()V

    :cond_16
    :goto_9
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v9, LS/d1$h;

    move-object v0, v9

    move-wide/from16 v1, p0

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/d1$h;-><init>(JJZLx7/p;I)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_17
    return-void
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

.method public static final synthetic f(Lx7/p;Lx7/p;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/d1;->c(Lx7/p;Lx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic g(JJZLx7/p;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, LS/d1;->d(JJZLx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic h()J
    .locals 2

    sget-wide v0, LS/d1;->f:J

    return-wide v0
.end method

.method public static final synthetic i()F
    .locals 1

    sget v0, LS/d1;->b:F

    return v0
.end method

.method public static final synthetic j()F
    .locals 1

    sget v0, LS/d1;->a:F

    return v0
.end method

.method public static final synthetic k(LD0/X$a;LY0/e;LD0/X;LD0/X;IIII)V
    .locals 0

    invoke-static/range {p0 .. p7}, LS/d1;->n(LD0/X$a;LY0/e;LD0/X;LD0/X;IIII)V

    return-void
.end method

.method public static final synthetic l(LD0/X$a;LD0/X;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LS/d1;->o(LD0/X$a;LD0/X;I)V

    return-void
.end method

.method public static final m()F
    .locals 1

    sget v0, LS/d1;->c:F

    return v0
.end method

.method private static final n(LD0/X$a;LY0/e;LD0/X;LD0/X;IIII)V
    .locals 12

    .prologue
    move-object v0, p1

    move/from16 v1, p6

    move/from16 v2, p7

    if-ne v1, v2, :cond_0

    sget v3, LS/d1;->d:F

    goto :goto_0

    :cond_0
    sget v3, LS/d1;->e:F

    :goto_0
    invoke-interface {p1, v3}, LY0/e;->S0(F)I

    move-result v3

    sget-object v4, LU/w;->a:LU/w;

    invoke-virtual {v4}, LU/w;->b()F

    move-result v4

    invoke-interface {p1, v4}, LY0/e;->S0(F)I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p3}, LD0/X;->w0()I

    move-result v4

    sget-wide v5, LS/d1;->f:J

    invoke-interface {p1, v5, v6}, LY0/e;->K0(J)I

    move-result v0

    add-int/2addr v4, v0

    sub-int/2addr v4, v1

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v0

    sub-int v0, p4, v0

    div-int/lit8 v7, v0, 0x2

    sub-int v0, p5, v2

    sub-int/2addr v0, v3

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p2

    move v8, v0

    invoke-static/range {v5 .. v11}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    invoke-virtual {p3}, LD0/X;->I0()I

    move-result v1

    sub-int v1, p4, v1

    div-int/lit8 v7, v1, 0x2

    sub-int v8, v0, v4

    move-object v6, p3

    invoke-static/range {v5 .. v11}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method

.method private static final o(LD0/X$a;LD0/X;I)V
    .locals 7

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result v0

    sub-int/2addr p2, v0

    div-int/lit8 v3, p2, 0x2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, LD0/X$a;->l(LD0/X$a;LD0/X;IIFILjava/lang/Object;)V

    return-void
.end method
