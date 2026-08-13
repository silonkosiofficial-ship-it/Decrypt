.class public abstract LS/L0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/L0;->a:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;LV/n;II)V
    .locals 29

    .prologue
    move/from16 v13, p13

    move/from16 v14, p14

    const v0, -0x48b06cf1

    move-object/from16 v1, p12

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v14, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v13, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v13, 0x6

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
    or-int/2addr v4, v13

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v13

    :goto_1
    and-int/lit8 v5, v14, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v13, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v14, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v13, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v1, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit8 v9, v14, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v13, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-interface {v1, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit8 v11, v14, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v13, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v1, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_8

    :cond_e
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v4, v15

    :goto_9
    and-int/lit8 v15, v14, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_f

    or-int v4, v4, v16

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v16, v13, v16

    move/from16 v0, p5

    if-nez v16, :cond_11

    invoke-interface {v1, v0}, LV/n;->i(I)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v4, v4, v17

    :cond_11
    :goto_b
    const/high16 v17, 0x180000

    and-int v17, v13, v17

    if-nez v17, :cond_13

    and-int/lit8 v17, v14, 0x40

    move/from16 p12, v11

    move-wide/from16 v10, p6

    if-nez v17, :cond_12

    invoke-interface {v1, v10, v11}, LV/n;->j(J)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v17, 0x80000

    :goto_c
    or-int v4, v4, v17

    goto :goto_d

    :cond_13
    move/from16 p12, v11

    move-wide/from16 v10, p6

    :goto_d
    const/high16 v17, 0xc00000

    and-int v18, v13, v17

    if-nez v18, :cond_15

    and-int/lit16 v0, v14, 0x80

    move-wide/from16 v10, p8

    if-nez v0, :cond_14

    invoke-interface {v1, v10, v11}, LV/n;->j(J)Z

    move-result v0

    if-eqz v0, :cond_14

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_14
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v4, v0

    goto :goto_f

    :cond_15
    move-wide/from16 v10, p8

    :goto_f
    const/high16 v0, 0x6000000

    and-int v18, v13, v0

    if-nez v18, :cond_18

    and-int/lit16 v0, v14, 0x100

    if-nez v0, :cond_16

    move-object/from16 v0, p10

    invoke-interface {v1, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_17

    const/high16 v20, 0x4000000

    goto :goto_10

    :cond_16
    move-object/from16 v0, p10

    :cond_17
    const/high16 v20, 0x2000000

    :goto_10
    or-int v4, v4, v20

    goto :goto_11

    :cond_18
    move-object/from16 v0, p10

    :goto_11
    and-int/lit16 v0, v14, 0x200

    const/high16 v20, 0x30000000

    if-eqz v0, :cond_1a

    or-int v4, v4, v20

    :cond_19
    move-object/from16 v0, p11

    goto :goto_13

    :cond_1a
    and-int v0, v13, v20

    if-nez v0, :cond_19

    move-object/from16 v0, p11

    invoke-interface {v1, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_1b

    const/high16 v20, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v20, 0x10000000

    :goto_12
    or-int v4, v4, v20

    :goto_13
    const v20, 0x12492493

    and-int v0, v4, v20

    const v3, 0x12492492

    if-ne v0, v3, :cond_1d

    invoke-interface {v1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_14

    :cond_1c
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v2, p0

    move-object/from16 v4, p3

    move-object/from16 v13, p10

    move-object v3, v8

    move-object v5, v12

    move/from16 v8, p5

    move-wide v11, v10

    move-wide/from16 v9, p6

    goto/16 :goto_22

    :cond_1d
    :goto_14
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v0, v13, 0x1

    const v3, -0xe000001

    const v20, -0x1c00001

    const v21, -0x380001

    if-eqz v0, :cond_23

    invoke-interface {v1}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_15

    :cond_1e
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_1f

    and-int v4, v4, v21

    :cond_1f
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_20

    and-int v4, v4, v20

    :cond_20
    and-int/lit16 v0, v14, 0x100

    if-eqz v0, :cond_21

    and-int/2addr v4, v3

    :cond_21
    move-object/from16 v0, p0

    move v9, v4

    move-object v2, v6

    move-object v5, v8

    move-object v7, v12

    move-object/from16 v6, p3

    move/from16 v8, p5

    move-wide/from16 v3, p6

    :cond_22
    move-object/from16 v12, p10

    goto/16 :goto_1d

    :cond_23
    :goto_15
    if-eqz v2, :cond_24

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_16

    :cond_24
    move-object/from16 v0, p0

    :goto_16
    if-eqz v5, :cond_25

    sget-object v2, LS/E;->a:LS/E;

    invoke-virtual {v2}, LS/E;->a()Lx7/p;

    move-result-object v2

    goto :goto_17

    :cond_25
    move-object v2, v6

    :goto_17
    if-eqz v7, :cond_26

    sget-object v5, LS/E;->a:LS/E;

    invoke-virtual {v5}, LS/E;->b()Lx7/p;

    move-result-object v5

    goto :goto_18

    :cond_26
    move-object v5, v8

    :goto_18
    if-eqz v9, :cond_27

    sget-object v6, LS/E;->a:LS/E;

    invoke-virtual {v6}, LS/E;->c()Lx7/p;

    move-result-object v6

    goto :goto_19

    :cond_27
    move-object/from16 v6, p3

    :goto_19
    if-eqz p12, :cond_28

    sget-object v7, LS/E;->a:LS/E;

    invoke-virtual {v7}, LS/E;->d()Lx7/p;

    move-result-object v7

    goto :goto_1a

    :cond_28
    move-object v7, v12

    :goto_1a
    if-eqz v15, :cond_29

    sget-object v8, LS/c0;->a:LS/c0$a;

    invoke-virtual {v8}, LS/c0$a;->a()I

    move-result v8

    goto :goto_1b

    :cond_29
    move/from16 v8, p5

    :goto_1b
    and-int/lit8 v9, v14, 0x40

    const/4 v12, 0x6

    if-eqz v9, :cond_2a

    sget-object v9, LS/o0;->a:LS/o0;

    invoke-virtual {v9, v1, v12}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v9

    invoke-virtual {v9}, LS/z;->a()J

    move-result-wide v22

    and-int v4, v4, v21

    move v9, v4

    move-wide/from16 v3, v22

    goto :goto_1c

    :cond_2a
    move v9, v4

    move-wide/from16 v3, p6

    :goto_1c
    and-int/lit16 v15, v14, 0x80

    if-eqz v15, :cond_2b

    shr-int/lit8 v10, v9, 0x12

    and-int/lit8 v10, v10, 0xe

    invoke-static {v3, v4, v1, v10}, LS/A;->c(JLV/n;I)J

    move-result-wide v10

    and-int v9, v9, v20

    :cond_2b
    and-int/lit16 v15, v14, 0x100

    if-eqz v15, :cond_22

    sget-object v15, LS/K0;->a:LS/K0;

    invoke-virtual {v15, v1, v12}, LS/K0;->a(LV/n;I)LA/S;

    move-result-object v12

    const v15, -0xe000001

    and-int/2addr v9, v15

    :goto_1d
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v15

    if-eqz v15, :cond_2c

    const/4 v15, -0x1

    const-string v13, "androidx.compose.material3.Scaffold (Scaffold.kt:94)"

    const v14, -0x48b06cf1

    invoke-static {v14, v9, v15, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_2c
    const/high16 v13, 0xe000000

    and-int/2addr v13, v9

    const/high16 v14, 0x6000000

    xor-int/2addr v13, v14

    const/high16 v15, 0x4000000

    if-le v13, v15, :cond_2d

    invoke-interface {v1, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_2e

    :cond_2d
    move-wide/from16 p9, v10

    goto :goto_1e

    :cond_2e
    move-wide/from16 p9, v10

    goto :goto_1f

    :goto_1e
    and-int v10, v9, v14

    if-ne v10, v15, :cond_2f

    :goto_1f
    const/4 v10, 0x1

    goto :goto_20

    :cond_2f
    const/4 v10, 0x0

    :goto_20
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_30

    sget-object v10, LV/n;->a:LV/n$a;

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v11, v10, :cond_31

    :cond_30
    new-instance v11, LT/v;

    invoke-direct {v11, v12}, LT/v;-><init>(LA/S;)V

    invoke-interface {v1, v11}, LV/n;->K(Ljava/lang/Object;)V

    :cond_31
    move-object v10, v11

    check-cast v10, LT/v;

    invoke-interface {v1, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    const/high16 v14, 0x4000000

    if-le v13, v14, :cond_32

    invoke-interface {v1, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_33

    :cond_32
    const/high16 v13, 0x6000000

    and-int/2addr v13, v9

    if-ne v13, v14, :cond_34

    :cond_33
    const/4 v13, 0x1

    goto :goto_21

    :cond_34
    const/4 v13, 0x0

    :goto_21
    or-int/2addr v11, v13

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_35

    sget-object v11, LV/n;->a:LV/n$a;

    invoke-virtual {v11}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v13, v11, :cond_36

    :cond_35
    new-instance v13, LS/L0$a;

    invoke-direct {v13, v10, v12}, LS/L0$a;-><init>(LT/v;LA/S;)V

    invoke-interface {v1, v13}, LV/n;->K(Ljava/lang/Object;)V

    :cond_36
    check-cast v13, Lx7/l;

    invoke-static {v0, v13}, LA/V;->b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v15

    new-instance v11, LS/L0$b;

    move-object/from16 p0, v11

    move/from16 p1, v8

    move-object/from16 p2, v2

    move-object/from16 p3, p11

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v10

    move-object/from16 p7, v5

    invoke-direct/range {p0 .. p7}, LS/L0$b;-><init>(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LT/v;Lx7/p;)V

    const/16 v10, 0x36

    const v13, -0x75f846d6

    const/4 v14, 0x1

    invoke-static {v13, v14, v11, v1, v10}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v24

    shr-int/lit8 v9, v9, 0xc

    and-int/lit16 v10, v9, 0x380

    or-int v10, v10, v17

    and-int/lit16 v9, v9, 0x1c00

    or-int v26, v10, v9

    const/16 v27, 0x72

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-wide/from16 v17, v3

    move-wide/from16 v19, p9

    move-object/from16 v25, v1

    invoke-static/range {v15 .. v27}, LS/c1;->a(Landroidx/compose/ui/d;Lo0/e2;JJFFLv/g;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    if-eqz v9, :cond_37

    invoke-static {}, LV/q;->P()V

    :cond_37
    move-wide v9, v3

    move-object v3, v5

    move-object v4, v6

    move-object v5, v7

    move-object v13, v12

    move-wide/from16 v11, p9

    move-object v6, v2

    move-object v2, v0

    :goto_22
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v15

    if-eqz v15, :cond_38

    new-instance v14, LS/L0$c;

    move-object v0, v14

    move-object v1, v2

    move-object v2, v6

    move v6, v8

    move-wide v7, v9

    move-wide v9, v11

    move-object v11, v13

    move-object/from16 v12, p11

    move/from16 v13, p13

    move-object/from16 v28, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, LS/L0$c;-><init>(Landroidx/compose/ui/d;Lx7/p;Lx7/p;Lx7/p;Lx7/p;IJJLA/S;Lx7/q;II)V

    move-object/from16 v0, v28

    invoke-interface {v15, v0}, LV/e1;->a(Lx7/p;)V

    :cond_38
    return-void
.end method

.method private static final b(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;LV/n;I)V
    .locals 18

    .prologue
    move/from16 v8, p8

    const v0, -0x3a252186

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_1

    move/from16 v2, p0

    invoke-interface {v1, v2}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_1
    move/from16 v2, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, v8, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v6

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_3
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_4

    :cond_4
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    goto :goto_5

    :cond_5
    move-object/from16 v7, p2

    :goto_5
    and-int/lit16 v10, v8, 0xc00

    const/16 v11, 0x800

    move-object/from16 v15, p3

    if-nez v10, :cond_7

    invoke-interface {v1, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    move v10, v11

    goto :goto_6

    :cond_6
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :cond_7
    and-int/lit16 v10, v8, 0x6000

    move-object/from16 v14, p4

    if-nez v10, :cond_9

    invoke-interface {v1, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_7

    :cond_8
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v4, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v8

    const/high16 v13, 0x20000

    if-nez v10, :cond_b

    move-object/from16 v10, p5

    invoke-interface {v1, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    move/from16 v16, v13

    goto :goto_8

    :cond_a
    const/high16 v16, 0x10000

    :goto_8
    or-int v4, v4, v16

    goto :goto_9

    :cond_b
    move-object/from16 v10, p5

    :goto_9
    const/high16 v16, 0x180000

    and-int v16, v8, v16

    move-object/from16 v9, p6

    if-nez v16, :cond_d

    invoke-interface {v1, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_c

    const/high16 v17, 0x100000

    goto :goto_a

    :cond_c
    const/high16 v17, 0x80000

    :goto_a
    or-int v4, v4, v17

    :cond_d
    const v17, 0x92493

    and-int v3, v4, v17

    const v12, 0x92492

    if-ne v3, v12, :cond_f

    invoke-interface {v1}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_b

    :cond_e
    invoke-interface {v1}, LV/n;->A()V

    goto/16 :goto_15

    :cond_f
    :goto_b
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v3, -0x1

    const-string v12, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:138)"

    invoke-static {v0, v4, v3, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_10
    and-int/lit8 v0, v4, 0x70

    const/4 v3, 0x0

    const/4 v12, 0x1

    if-ne v0, v6, :cond_11

    move v0, v12

    goto :goto_c

    :cond_11
    move v0, v3

    :goto_c
    and-int/lit16 v6, v4, 0x1c00

    if-ne v6, v11, :cond_12

    move v6, v12

    goto :goto_d

    :cond_12
    move v6, v3

    :goto_d
    or-int/2addr v0, v6

    const/high16 v6, 0x70000

    and-int/2addr v6, v4

    if-ne v6, v13, :cond_13

    move v6, v12

    goto :goto_e

    :cond_13
    move v6, v3

    :goto_e
    or-int/2addr v0, v6

    const v6, 0xe000

    and-int/2addr v6, v4

    const/16 v11, 0x4000

    if-ne v6, v11, :cond_14

    move v6, v12

    goto :goto_f

    :cond_14
    move v6, v3

    :goto_f
    or-int/2addr v0, v6

    and-int/lit8 v6, v4, 0xe

    const/4 v11, 0x4

    if-ne v6, v11, :cond_15

    move v6, v12

    goto :goto_10

    :cond_15
    move v6, v3

    :goto_10
    or-int/2addr v0, v6

    const/high16 v6, 0x380000

    and-int/2addr v6, v4

    const/high16 v11, 0x100000

    if-ne v6, v11, :cond_16

    move v6, v12

    goto :goto_11

    :cond_16
    move v6, v3

    :goto_11
    or-int/2addr v0, v6

    and-int/lit16 v4, v4, 0x380

    const/16 v6, 0x100

    if-ne v4, v6, :cond_17

    move v4, v12

    goto :goto_12

    :cond_17
    move v4, v3

    :goto_12
    or-int/2addr v0, v4

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_19

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_18

    goto :goto_13

    :cond_18
    move v0, v12

    goto :goto_14

    :cond_19
    :goto_13
    new-instance v4, LS/L0$d;

    move-object v9, v4

    move-object/from16 v10, p1

    move-object/from16 v11, p3

    move v0, v12

    move-object/from16 v12, p4

    move/from16 v13, p0

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v16, p2

    invoke-direct/range {v9 .. v16}, LS/L0$d;-><init>(Lx7/p;Lx7/p;Lx7/p;ILA/S;Lx7/p;Lx7/q;)V

    invoke-interface {v1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :goto_14
    check-cast v4, Lx7/p;

    const/4 v6, 0x0

    invoke-static {v6, v4, v1, v3, v0}, LD0/g0;->b(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-static {}, LV/q;->P()V

    :cond_1a
    :goto_15
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v10, LS/L0$e;

    move-object v0, v10

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS/L0$e;-><init>(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;I)V

    invoke-interface {v9, v10}, LV/e1;->a(Lx7/p;)V

    :cond_1b
    return-void
.end method

.method public static final synthetic c(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p8}, LS/L0;->b(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;LV/n;I)V

    return-void
.end method

.method public static final synthetic d()F
    .locals 1

    sget v0, LS/L0;->a:F

    return v0
.end method
