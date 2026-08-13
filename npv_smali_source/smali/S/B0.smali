.class public abstract LS/B0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:Landroidx/compose/ui/d;

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:Lu/z;

.field private static final g:Lu/z;

.field private static final h:Lu/z;

.field private static final i:Lu/z;

.field private static final j:Lu/z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/B0;->a:F

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v2, LS/B0$e;->D:LS/B0$e;

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/b;->a(Landroidx/compose/ui/d;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object v1

    sget-object v2, LS/B0$f;->D:LS/B0$f;

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v4, v0, v3, v2}, Landroidx/compose/foundation/layout/m;->k(Landroidx/compose/ui/d;FFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    sput-object v0, LS/B0;->b:Landroidx/compose/ui/d;

    const/16 v0, 0xf0

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/B0;->c:F

    sget-object v0, LU/x;->a:LU/x;

    invoke-virtual {v0}, LU/x;->e()F

    move-result v1

    sput v1, LS/B0;->d:F

    invoke-virtual {v0}, LU/x;->c()F

    move-result v1

    invoke-virtual {v0}, LU/x;->e()F

    move-result v0

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sub-float/2addr v1, v0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/B0;->e:F

    new-instance v0, Lu/z;

    const v1, 0x3e4ccccd    # 0.2f

    const v2, 0x3f4ccccd    # 0.8f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v4, v2, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LS/B0;->f:Lu/z;

    new-instance v0, Lu/z;

    const v2, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v2, v4, v3, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LS/B0;->g:Lu/z;

    new-instance v0, Lu/z;

    const v5, 0x3f266666    # 0.65f

    invoke-direct {v0, v4, v4, v5, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LS/B0;->h:Lu/z;

    new-instance v0, Lu/z;

    const v5, 0x3dcccccd    # 0.1f

    const v6, 0x3ee66666    # 0.45f

    invoke-direct {v0, v5, v4, v6, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LS/B0;->i:Lu/z;

    new-instance v0, Lu/z;

    invoke-direct {v0, v2, v4, v1, v3}, Lu/z;-><init>(FFFF)V

    sput-object v0, LS/B0;->j:Lu/z;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;JFJILV/n;II)V
    .locals 36

    .prologue
    move/from16 v8, p8

    const v0, -0x6e80f9f

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-interface {v1, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, p9, 0x2

    move-wide/from16 v9, p1

    if-nez v6, :cond_3

    invoke-interface {v1, v9, v10}, LV/n;->j(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    goto :goto_3

    :cond_4
    move-wide/from16 v9, p1

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move/from16 v11, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v8, 0x180

    if-nez v11, :cond_5

    move/from16 v11, p3

    invoke-interface {v1, v11}, LV/n;->h(F)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v5, v12

    :goto_5
    and-int/lit16 v12, v8, 0xc00

    if-nez v12, :cond_a

    and-int/lit8 v12, p9, 0x8

    if-nez v12, :cond_8

    move-wide/from16 v12, p4

    invoke-interface {v1, v12, v13}, LV/n;->j(J)Z

    move-result v16

    if-eqz v16, :cond_9

    const/16 v16, 0x800

    goto :goto_6

    :cond_8
    move-wide/from16 v12, p4

    :cond_9
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    goto :goto_7

    :cond_a
    move-wide/from16 v12, p4

    :goto_7
    and-int/lit8 v16, p9, 0x10

    if-eqz v16, :cond_c

    or-int/lit16 v5, v5, 0x6000

    :cond_b
    move/from16 v14, p6

    goto :goto_9

    :cond_c
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_b

    move/from16 v14, p6

    invoke-interface {v1, v14}, LV/n;->i(I)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_8

    :cond_d
    const/16 v17, 0x2000

    :goto_8
    or-int v5, v5, v17

    :goto_9
    and-int/lit16 v15, v5, 0x2493

    const/16 v7, 0x2492

    if-ne v15, v7, :cond_f

    invoke-interface {v1}, LV/n;->u()Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {v1}, LV/n;->A()V

    move-wide v2, v9

    move v6, v11

    move v7, v14

    goto/16 :goto_15

    :cond_f
    :goto_a
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v7, v8, 0x1

    if-eqz v7, :cond_13

    invoke-interface {v1}, LV/n;->G()Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_11

    and-int/lit8 v5, v5, -0x71

    :cond_11
    and-int/lit8 v2, p9, 0x8

    if-eqz v2, :cond_12

    and-int/lit16 v5, v5, -0x1c01

    :cond_12
    move-object v2, v4

    move v6, v11

    move v7, v14

    move-wide v14, v12

    move v13, v5

    :goto_b
    move-wide v4, v9

    goto :goto_f

    :cond_13
    :goto_c
    if-eqz v2, :cond_14

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_d

    :cond_14
    move-object v2, v4

    :goto_d
    and-int/lit8 v4, p9, 0x2

    const/4 v7, 0x6

    if-eqz v4, :cond_15

    sget-object v4, LS/A0;->a:LS/A0;

    invoke-virtual {v4, v1, v7}, LS/A0;->a(LV/n;I)J

    move-result-wide v9

    and-int/lit8 v5, v5, -0x71

    :cond_15
    if-eqz v6, :cond_16

    sget-object v4, LS/A0;->a:LS/A0;

    invoke-virtual {v4}, LS/A0;->d()F

    move-result v4

    move v11, v4

    :cond_16
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_17

    sget-object v4, LS/A0;->a:LS/A0;

    invoke-virtual {v4, v1, v7}, LS/A0;->c(LV/n;I)J

    move-result-wide v6

    and-int/lit16 v4, v5, -0x1c01

    move v5, v4

    goto :goto_e

    :cond_17
    move-wide v6, v12

    :goto_e
    if-eqz v16, :cond_18

    sget-object v4, LS/A0;->a:LS/A0;

    invoke-virtual {v4}, LS/A0;->b()I

    move-result v4

    move v13, v5

    move-wide v14, v6

    move v6, v11

    move v7, v4

    goto :goto_b

    :cond_18
    move v13, v5

    move-wide v4, v9

    move-wide/from16 v34, v6

    move v6, v11

    move v7, v14

    move-wide/from16 v14, v34

    :goto_f
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_19

    const/4 v9, -0x1

    const-string v10, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:637)"

    invoke-static {v0, v13, v9, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_19
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {v1, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    new-instance v12, Lq0/m;

    invoke-interface {v0, v6}, LY0/e;->B0(F)F

    move-result v19

    const/16 v24, 0x1a

    const/16 v25, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, v12

    move/from16 v21, v7

    invoke-direct/range {v18 .. v25}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    const/4 v0, 0x0

    const/4 v11, 0x0

    const/4 v10, 0x1

    invoke-static {v0, v1, v11, v10}, Lu/T;->c(Ljava/lang/String;LV/n;II)Lu/S;

    move-result-object v18

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/4 v9, 0x5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    sget-object v9, Ly7/s;->a:Ly7/s;

    invoke-static {v9}, Lu/z0;->j(Ly7/s;)Lu/x0;

    move-result-object v20

    const/16 v9, 0x1a04

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v10

    invoke-static {v9, v11, v10, v3, v0}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v9

    const/4 v10, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    move-object/from16 p1, v9

    move-object/from16 p2, v22

    move-wide/from16 p3, v23

    move/from16 p5, v10

    move-object/from16 p6, v21

    invoke-static/range {p1 .. p6}, Lu/k;->e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;

    move-result-object v21

    sget v10, Lu/S;->f:I

    or-int/lit16 v9, v10, 0x1b0

    sget v22, Lu/Q;->d:I

    shl-int/lit8 v23, v22, 0xc

    or-int v23, v9, v23

    const/16 v24, 0x10

    move-object/from16 v9, v18

    move/from16 v29, v10

    const/16 v26, 0x1

    move-object/from16 v10, v16

    move-object/from16 v11, v19

    move-object/from16 v30, v12

    move-object/from16 v12, v20

    move/from16 v31, v13

    move-object/from16 v13, v21

    move-wide/from16 v32, v14

    const/16 v15, 0x800

    move-object/from16 v14, v25

    move-object v15, v1

    move/from16 v16, v23

    move/from16 v17, v24

    invoke-static/range {v9 .. v17}, Lu/T;->b(Lu/S;Ljava/lang/Object;Ljava/lang/Object;Lu/x0;Lu/Q;Ljava/lang/String;LV/n;II)LV/G1;

    move-result-object v9

    const/16 v10, 0x534

    invoke-static {}, Lu/H;->e()Lu/F;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v10, v12, v11, v3, v0}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v0

    const/4 v3, 0x6

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 p0, v0

    move-object/from16 p1, v11

    move-wide/from16 p2, v13

    move/from16 p4, v3

    move-object/from16 p5, v10

    invoke-static/range {p0 .. p5}, Lu/k;->e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;

    move-result-object v0

    move/from16 v3, v29

    or-int/lit16 v10, v3, 0x1b0

    shl-int/lit8 v11, v22, 0x9

    or-int/2addr v10, v11

    const/16 v11, 0x8

    const/4 v13, 0x0

    const/high16 v14, 0x438f0000    # 286.0f

    const/4 v15, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v13

    move/from16 p2, v14

    move-object/from16 p3, v0

    move-object/from16 p4, v15

    move-object/from16 p5, v1

    move/from16 p6, v10

    move/from16 p7, v11

    invoke-static/range {p0 .. p7}, Lu/T;->a(Lu/S;FFLu/Q;Ljava/lang/String;LV/n;II)LV/G1;

    move-result-object v0

    sget-object v10, LS/B0$c;->D:LS/B0$c;

    invoke-static {v10}, Lu/k;->f(Lx7/l;)Lu/W;

    move-result-object v10

    const/4 v11, 0x6

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 p0, v10

    move-object/from16 p1, v14

    move-wide/from16 p2, v15

    move/from16 p4, v11

    move-object/from16 p5, v13

    invoke-static/range {p0 .. p5}, Lu/k;->e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;

    move-result-object v10

    or-int/lit16 v11, v3, 0x1b0

    shl-int/lit8 v13, v22, 0x9

    or-int/2addr v11, v13

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/high16 v15, 0x43910000    # 290.0f

    const/16 v16, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v14

    move/from16 p2, v15

    move-object/from16 p3, v10

    move-object/from16 p4, v16

    move-object/from16 p5, v1

    move/from16 p6, v11

    move/from16 p7, v13

    invoke-static/range {p0 .. p7}, Lu/T;->a(Lu/S;FFLu/Q;Ljava/lang/String;LV/n;II)LV/G1;

    move-result-object v10

    sget-object v11, LS/B0$d;->D:LS/B0$d;

    invoke-static {v11}, Lu/k;->f(Lx7/l;)Lu/W;

    move-result-object v11

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    move-object/from16 p0, v11

    move-object/from16 p1, v15

    move-wide/from16 p2, v16

    move/from16 p4, v13

    move-object/from16 p5, v14

    invoke-static/range {p0 .. p5}, Lu/k;->e(Lu/E;Lu/f0;JILjava/lang/Object;)Lu/Q;

    move-result-object v11

    or-int/lit16 v3, v3, 0x1b0

    shl-int/lit8 v13, v22, 0x9

    or-int/2addr v3, v13

    const/16 v13, 0x8

    const/4 v14, 0x0

    const/high16 v15, 0x43910000    # 290.0f

    const/16 v16, 0x0

    move-object/from16 p0, v18

    move/from16 p1, v14

    move/from16 p2, v15

    move-object/from16 p3, v11

    move-object/from16 p4, v16

    move-object/from16 p5, v1

    move/from16 p6, v3

    move/from16 p7, v13

    invoke-static/range {p0 .. p7}, Lu/T;->a(Lu/S;FFLu/Q;Ljava/lang/String;LV/n;II)LV/G1;

    move-result-object v3

    invoke-static {v2}, Lv/Z;->a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v11

    sget v13, LS/B0;->e:F

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v11

    move/from16 v13, v31

    and-int/lit16 v14, v13, 0x1c00

    xor-int/lit16 v14, v14, 0xc00

    const/16 v15, 0x800

    move-wide/from16 v12, v32

    if-le v14, v15, :cond_1b

    invoke-interface {v1, v12, v13}, LV/n;->j(J)Z

    move-result v14

    if-nez v14, :cond_1a

    goto :goto_10

    :cond_1a
    move-object/from16 p0, v2

    move/from16 v14, v31

    goto :goto_11

    :cond_1b
    :goto_10
    move-object/from16 p0, v2

    move/from16 v14, v31

    and-int/lit16 v2, v14, 0xc00

    if-ne v2, v15, :cond_1c

    :goto_11
    move/from16 v2, v26

    move-object/from16 v15, v30

    goto :goto_12

    :cond_1c
    move-object/from16 v15, v30

    const/4 v2, 0x0

    :goto_12
    invoke-interface {v1, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    or-int v2, v2, v16

    invoke-interface {v1, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    or-int v2, v2, v16

    invoke-interface {v1, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    or-int v2, v2, v16

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    or-int v2, v2, v16

    invoke-interface {v1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    or-int v2, v2, v16

    move/from16 p1, v7

    and-int/lit16 v7, v14, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_1d

    move/from16 v7, v26

    goto :goto_13

    :cond_1d
    const/4 v7, 0x0

    :goto_13
    or-int/2addr v2, v7

    and-int/lit8 v7, v14, 0x70

    xor-int/lit8 v7, v7, 0x30

    const/16 v8, 0x20

    if-le v7, v8, :cond_1e

    invoke-interface {v1, v4, v5}, LV/n;->j(J)Z

    move-result v7

    if-nez v7, :cond_20

    :cond_1e
    and-int/lit8 v7, v14, 0x30

    if-ne v7, v8, :cond_1f

    goto :goto_14

    :cond_1f
    const/16 v26, 0x0

    :cond_20
    :goto_14
    or-int v2, v2, v26

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_21

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v7, v2, :cond_22

    :cond_21
    new-instance v7, LS/B0$a;

    move-object/from16 v18, v7

    move-wide/from16 v19, v12

    move-object/from16 v21, v15

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v24, v3

    move-object/from16 v25, v0

    move/from16 v26, v6

    move-wide/from16 v27, v4

    invoke-direct/range {v18 .. v28}, LS/B0$a;-><init>(JLq0/m;LV/G1;LV/G1;LV/G1;LV/G1;FJ)V

    invoke-interface {v1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_22
    check-cast v7, Lx7/l;

    const/4 v0, 0x0

    invoke-static {v11, v7, v1, v0}, Lv/i;->a(Landroidx/compose/ui/d;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_23

    invoke-static {}, LV/q;->P()V

    :cond_23
    move/from16 v7, p1

    move-wide v2, v4

    move-object/from16 v4, p0

    :goto_15
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_24

    new-instance v11, LS/B0$b;

    move-object v0, v11

    move-object v1, v4

    move v4, v6

    move-wide v5, v12

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, LS/B0$b;-><init>(Landroidx/compose/ui/d;JFJIII)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_24
    return-void
.end method

.method public static final synthetic b(Lq0/g;JLq0/m;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/B0;->g(Lq0/g;JLq0/m;)V

    return-void
.end method

.method public static final synthetic c(Lq0/g;FFFJLq0/m;)V
    .locals 0

    invoke-static/range {p0 .. p6}, LS/B0;->h(Lq0/g;FFFJLq0/m;)V

    return-void
.end method

.method public static final synthetic d()Lu/z;
    .locals 1

    sget-object v0, LS/B0;->j:Lu/z;

    return-object v0
.end method

.method public static final synthetic e()F
    .locals 1

    sget v0, LS/B0;->a:F

    return v0
.end method

.method private static final f(Lq0/g;FFJLq0/m;)V
    .locals 19

    invoke-virtual/range {p5 .. p5}, Lq0/m;->f()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-interface/range {p0 .. p0}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->i(J)F

    move-result v2

    mul-float/2addr v1, v0

    sub-float/2addr v2, v1

    invoke-static {v0, v0}, Ln0/h;->a(FF)J

    move-result-wide v9

    invoke-static {v2, v2}, Ln0/n;->a(FF)J

    move-result-wide v11

    const/16 v17, 0x340

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v3, p0

    move-wide/from16 v4, p3

    move/from16 v6, p1

    move/from16 v7, p2

    move-object/from16 v14, p5

    invoke-static/range {v3 .. v18}, Lq0/f;->d(Lq0/g;JFFZJJFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method

.method private static final g(Lq0/g;JLq0/m;)V
    .locals 6

    const/4 v1, 0x0

    const/high16 v2, 0x43b40000    # 360.0f

    move-object v0, p0

    move-wide v3, p1

    move-object v5, p3

    invoke-static/range {v0 .. v5}, LS/B0;->f(Lq0/g;FFJLq0/m;)V

    return-void
.end method

.method private static final h(Lq0/g;FFFJLq0/m;)V
    .locals 6

    .prologue
    invoke-virtual {p6}, Lq0/m;->b()I

    move-result v0

    sget-object v1, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v1}, Lo0/g2$a;->a()I

    move-result v1

    invoke-static {v0, v1}, Lo0/g2;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    sget v0, LS/B0;->e:F

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    div-float/2addr p2, v0

    const v0, 0x42652ee1

    mul-float/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    :goto_0
    add-float v1, p1, p2

    const p1, 0x3dcccccd    # 0.1f

    invoke-static {p3, p1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    move-object v0, p0

    move-wide v3, p4

    move-object v5, p6

    invoke-static/range {v0 .. v5}, LS/B0;->f(Lq0/g;FFJLq0/m;)V

    return-void
.end method
