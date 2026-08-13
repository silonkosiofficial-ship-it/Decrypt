.class public abstract LS/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroidx/compose/ui/window/s;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Landroidx/compose/ui/window/s;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/window/s;-><init>(ZZZZILy7/k;)V

    sput-object v7, LS/e;->a:Landroidx/compose/ui/window/s;

    return-void
.end method

.method public static final a(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;LV/n;III)V
    .locals 38

    .prologue
    move/from16 v15, p15

    move/from16 v14, p17

    const v0, 0x55597dec

    move-object/from16 v1, p14

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v14, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v15, 0x6

    move v5, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v15, 0x6

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-interface {v1, v2}, LV/n;->d(Z)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v15

    goto :goto_1

    :cond_2
    move/from16 v2, p0

    move v5, v15

    :goto_1
    and-int/lit8 v6, v14, 0x2

    if-eqz v6, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v15, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :goto_3
    and-int/lit8 v9, v14, 0x4

    if-eqz v9, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v15, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-interface {v1, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v5, v11

    :goto_5
    and-int/lit8 v11, v14, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v5, v5, 0xc00

    move-wide/from16 v7, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v15, 0xc00

    move-wide/from16 v7, p3

    if-nez v13, :cond_b

    invoke-interface {v1, v7, v8}, LV/n;->j(J)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    :cond_b
    :goto_7
    and-int/lit16 v3, v15, 0x6000

    if-nez v3, :cond_e

    and-int/lit8 v3, v14, 0x10

    if-nez v3, :cond_c

    move-object/from16 v3, p5

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_d

    const/16 v17, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v3, p5

    :cond_d
    const/16 v17, 0x2000

    :goto_8
    or-int v5, v5, v17

    goto :goto_9

    :cond_e
    move-object/from16 v3, p5

    :goto_9
    and-int/lit8 v17, v14, 0x20

    const/high16 v18, 0x30000

    if-eqz v17, :cond_f

    or-int v5, v5, v18

    move-object/from16 v13, p6

    goto :goto_b

    :cond_f
    and-int v18, v15, v18

    move-object/from16 v13, p6

    if-nez v18, :cond_11

    invoke-interface {v1, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v19, 0x10000

    :goto_a
    or-int v5, v5, v19

    :cond_11
    :goto_b
    const/high16 v19, 0x180000

    and-int v19, v15, v19

    if-nez v19, :cond_13

    and-int/lit8 v19, v14, 0x40

    move-object/from16 v12, p7

    if-nez v19, :cond_12

    invoke-interface {v1, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_12

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v20, 0x80000

    :goto_c
    or-int v5, v5, v20

    goto :goto_d

    :cond_13
    move-object/from16 v12, p7

    :goto_d
    const/high16 v20, 0xc00000

    and-int v20, v15, v20

    if-nez v20, :cond_15

    and-int/lit16 v4, v14, 0x80

    move-wide/from16 v2, p8

    if-nez v4, :cond_14

    invoke-interface {v1, v2, v3}, LV/n;->j(J)Z

    move-result v4

    if-eqz v4, :cond_14

    const/high16 v4, 0x800000

    goto :goto_e

    :cond_14
    const/high16 v4, 0x400000

    :goto_e
    or-int/2addr v5, v4

    goto :goto_f

    :cond_15
    move-wide/from16 v2, p8

    :goto_f
    and-int/lit16 v4, v14, 0x100

    const/high16 v21, 0x6000000

    if-eqz v4, :cond_16

    or-int v5, v5, v21

    move/from16 v0, p10

    goto :goto_11

    :cond_16
    and-int v21, v15, v21

    move/from16 v0, p10

    if-nez v21, :cond_18

    invoke-interface {v1, v0}, LV/n;->h(F)Z

    move-result v22

    if-eqz v22, :cond_17

    const/high16 v22, 0x4000000

    goto :goto_10

    :cond_17
    const/high16 v22, 0x2000000

    :goto_10
    or-int v5, v5, v22

    :cond_18
    :goto_11
    and-int/lit16 v0, v14, 0x200

    const/high16 v22, 0x30000000

    if-eqz v0, :cond_19

    or-int v5, v5, v22

    move/from16 v2, p11

    goto :goto_13

    :cond_19
    and-int v22, v15, v22

    move/from16 v2, p11

    if-nez v22, :cond_1b

    invoke-interface {v1, v2}, LV/n;->h(F)Z

    move-result v3

    if-eqz v3, :cond_1a

    const/high16 v3, 0x20000000

    goto :goto_12

    :cond_1a
    const/high16 v3, 0x10000000

    :goto_12
    or-int/2addr v5, v3

    :cond_1b
    :goto_13
    and-int/lit16 v3, v14, 0x400

    if-eqz v3, :cond_1c

    or-int/lit8 v16, p16, 0x6

    move-object/from16 v2, p12

    goto :goto_15

    :cond_1c
    and-int/lit8 v22, p16, 0x6

    move-object/from16 v2, p12

    if-nez v22, :cond_1e

    invoke-interface {v1, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_1d

    const/16 v16, 0x4

    goto :goto_14

    :cond_1d
    const/16 v16, 0x2

    :goto_14
    or-int v16, p16, v16

    goto :goto_15

    :cond_1e
    move/from16 v16, p16

    :goto_15
    and-int/lit16 v2, v14, 0x800

    if-eqz v2, :cond_1f

    or-int/lit8 v16, v16, 0x30

    :goto_16
    move/from16 v2, v16

    goto :goto_18

    :cond_1f
    and-int/lit8 v2, p16, 0x30

    if-nez v2, :cond_21

    move-object/from16 v2, p13

    invoke-interface {v1, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_20

    const/16 v18, 0x20

    goto :goto_17

    :cond_20
    const/16 v18, 0x10

    :goto_17
    or-int v16, v16, v18

    goto :goto_16

    :cond_21
    move-object/from16 v2, p13

    goto :goto_16

    :goto_18
    const v16, 0x12492493

    and-int v6, v5, v16

    const v7, 0x12492492

    if-ne v6, v7, :cond_23

    and-int/lit8 v6, v2, 0x13

    const/16 v7, 0x12

    if-ne v6, v7, :cond_23

    invoke-interface {v1}, LV/n;->u()Z

    move-result v6

    if-nez v6, :cond_22

    goto :goto_19

    :cond_22
    invoke-interface {v1}, LV/n;->A()V

    move-wide/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v11, p10

    move-object v3, v10

    move-object v8, v12

    move-object v7, v13

    move-wide/from16 v9, p8

    move/from16 v12, p11

    move-object/from16 v13, p12

    goto/16 :goto_28

    :cond_23
    :goto_19
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v6, v15, 0x1

    const v8, -0xe001

    const/4 v7, 0x1

    if-eqz v6, :cond_28

    invoke-interface {v1}, LV/n;->G()Z

    move-result v6

    if-eqz v6, :cond_24

    goto :goto_1a

    :cond_24
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v14, 0x10

    if-eqz v0, :cond_25

    and-int/2addr v5, v8

    :cond_25
    and-int/lit8 v0, v14, 0x40

    if-eqz v0, :cond_26

    const v0, -0x380001

    and-int/2addr v5, v0

    :cond_26
    and-int/lit16 v0, v14, 0x80

    if-eqz v0, :cond_27

    const v0, -0x1c00001

    and-int/2addr v5, v0

    :cond_27
    move-object/from16 v18, p5

    move-wide/from16 v3, p8

    move/from16 v0, p10

    move-object/from16 v9, p12

    move-object v6, v10

    move-object v8, v13

    move-wide/from16 v10, p3

    move v13, v5

    move/from16 v5, p11

    goto/16 :goto_23

    :cond_28
    :goto_1a
    if-eqz v9, :cond_29

    sget-object v6, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_1b

    :cond_29
    move-object v6, v10

    :goto_1b
    const/4 v9, 0x0

    if-eqz v11, :cond_2a

    int-to-float v10, v9

    invoke-static {v10}, LY0/i;->q(F)F

    move-result v11

    invoke-static {v10}, LY0/i;->q(F)F

    move-result v10

    invoke-static {v11, v10}, LY0/j;->a(FF)J

    move-result-wide v10

    goto :goto_1c

    :cond_2a
    move-wide/from16 v10, p3

    :goto_1c
    and-int/lit8 v18, v14, 0x10

    if-eqz v18, :cond_2b

    invoke-static {v9, v1, v9, v7}, Landroidx/compose/foundation/k;->a(ILV/n;II)Landroidx/compose/foundation/m;

    move-result-object v18

    and-int/2addr v5, v8

    goto :goto_1d

    :cond_2b
    move-object/from16 v18, p5

    :goto_1d
    if-eqz v17, :cond_2c

    sget-object v8, LS/e;->a:Landroidx/compose/ui/window/s;

    goto :goto_1e

    :cond_2c
    move-object v8, v13

    :goto_1e
    and-int/lit8 v13, v14, 0x40

    const/4 v9, 0x6

    if-eqz v13, :cond_2d

    sget-object v12, LS/q0;->a:LS/q0;

    invoke-virtual {v12, v1, v9}, LS/q0;->e(LV/n;I)Lo0/e2;

    move-result-object v12

    const v13, -0x380001

    and-int/2addr v5, v13

    :cond_2d
    and-int/lit16 v13, v14, 0x80

    if-eqz v13, :cond_2e

    sget-object v13, LS/q0;->a:LS/q0;

    invoke-virtual {v13, v1, v9}, LS/q0;->a(LV/n;I)J

    move-result-wide v22

    const v9, -0x1c00001

    and-int/2addr v5, v9

    goto :goto_1f

    :cond_2e
    move-wide/from16 v22, p8

    :goto_1f
    if-eqz v4, :cond_2f

    sget-object v4, LS/q0;->a:LS/q0;

    invoke-virtual {v4}, LS/q0;->f()F

    move-result v4

    goto :goto_20

    :cond_2f
    move/from16 v4, p10

    :goto_20
    if-eqz v0, :cond_30

    sget-object v0, LS/q0;->a:LS/q0;

    invoke-virtual {v0}, LS/q0;->d()F

    move-result v0

    goto :goto_21

    :cond_30
    move/from16 v0, p11

    :goto_21
    if-eqz v3, :cond_31

    move v13, v5

    const/4 v9, 0x0

    :goto_22
    move v5, v0

    move v0, v4

    move-wide/from16 v3, v22

    goto :goto_23

    :cond_31
    move-object/from16 v9, p12

    move v13, v5

    goto :goto_22

    :goto_23
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v22

    if-eqz v22, :cond_32

    const-string v7, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)"

    const v14, 0x55597dec

    invoke-static {v14, v13, v2, v7}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_32
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v7, LV/n;->a:LV/n$a;

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v2, v14, :cond_33

    new-instance v2, Lu/Z;

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v2, v14}, Lu/Z;-><init>(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_33
    check-cast v2, Lu/Z;

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual {v2, v14}, Lu/Z;->h(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lu/Z;->a()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-nez v14, :cond_35

    invoke-virtual {v2}, Lu/Z;->b()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_34

    goto :goto_24

    :cond_34
    move-object/from16 p10, v8

    goto/16 :goto_27

    :cond_35
    :goto_24
    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v14, v15, :cond_36

    sget-object v14, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {v14}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide v14

    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object v14

    move-object/from16 p10, v8

    const/4 v8, 0x0

    const/4 v15, 0x2

    invoke-static {v14, v8, v15, v8}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v14

    invoke-interface {v1, v14}, LV/n;->K(Ljava/lang/Object;)V

    goto :goto_25

    :cond_36
    move-object/from16 p10, v8

    :goto_25
    move-object v8, v14

    check-cast v8, LV/w0;

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v14

    invoke-interface {v1, v14}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LY0/e;

    and-int/lit16 v15, v13, 0x1c00

    move/from16 v16, v13

    const/16 v13, 0x800

    if-ne v15, v13, :cond_37

    const/16 v17, 0x1

    goto :goto_26

    :cond_37
    const/16 v17, 0x0

    :goto_26
    invoke-interface {v1, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    or-int v13, v17, v13

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_38

    invoke-virtual {v7}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v15, v7, :cond_39

    :cond_38
    new-instance v15, LT/m;

    new-instance v7, LS/e$c;

    invoke-direct {v7, v8}, LS/e$c;-><init>(LV/w0;)V

    const/4 v13, 0x4

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 p2, v15

    move-wide/from16 p3, v10

    move-object/from16 p5, v14

    move/from16 p6, v19

    move-object/from16 p7, v7

    move/from16 p8, v13

    move-object/from16 p9, v17

    invoke-direct/range {p2 .. p9}, LT/m;-><init>(JLY0/e;ILx7/p;ILy7/k;)V

    invoke-interface {v1, v15}, LV/n;->K(Ljava/lang/Object;)V

    :cond_39
    move-object v7, v15

    check-cast v7, LT/m;

    new-instance v13, LS/e$a;

    move-object/from16 v22, v13

    move-object/from16 v23, v6

    move-object/from16 v24, v2

    move-object/from16 v25, v8

    move-object/from16 v26, v18

    move-object/from16 v27, v12

    move-wide/from16 v28, v3

    move/from16 v30, v0

    move/from16 v31, v5

    move-object/from16 v32, v9

    move-object/from16 v33, p13

    invoke-direct/range {v22 .. v33}, LS/e$a;-><init>(Landroidx/compose/ui/d;Lu/Z;LV/w0;Landroidx/compose/foundation/m;Lo0/e2;JFFLv/g;Lx7/q;)V

    const/16 v2, 0x36

    const v8, 0x7ec6f865

    const/4 v14, 0x1

    invoke-static {v8, v14, v13, v1, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v2

    and-int/lit8 v8, v16, 0x70

    or-int/lit16 v8, v8, 0xc00

    shr-int/lit8 v13, v16, 0x9

    and-int/lit16 v13, v13, 0x380

    or-int/2addr v8, v13

    const/4 v13, 0x0

    move-object/from16 p2, v7

    move-object/from16 p3, p1

    move-object/from16 p4, p10

    move-object/from16 p5, v2

    move-object/from16 p6, v1

    move/from16 p7, v8

    move/from16 p8, v13

    invoke-static/range {p2 .. p8}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/r;Lx7/a;Landroidx/compose/ui/window/s;Lx7/p;LV/n;II)V

    :goto_27
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_3a

    invoke-static {}, LV/q;->P()V

    :cond_3a
    move-object/from16 v7, p10

    move-object v13, v9

    move-object v8, v12

    move v12, v5

    move-wide/from16 v36, v10

    move v11, v0

    move-wide v9, v3

    move-object v3, v6

    move-wide/from16 v4, v36

    move-object/from16 v6, v18

    :goto_28
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v15

    if-eqz v15, :cond_3b

    new-instance v14, LS/e$b;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v34, v14

    move-object/from16 v14, p13

    move-object/from16 v35, v15

    move/from16 v15, p15

    move/from16 v16, p16

    move/from16 v17, p17

    invoke-direct/range {v0 .. v17}, LS/e$b;-><init>(ZLx7/a;Landroidx/compose/ui/d;JLandroidx/compose/foundation/m;Landroidx/compose/ui/window/s;Lo0/e2;JFFLv/g;Lx7/q;III)V

    move-object/from16 v1, v34

    move-object/from16 v0, v35

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_3b
    return-void
.end method

.method public static final b(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;LV/n;II)V
    .locals 23

    .prologue
    move/from16 v10, p10

    move/from16 v11, p11

    const v0, 0x6cdbbe60

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v2, v11, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v10, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v10, 0x6

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
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v10

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v10, 0x30

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
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v10, 0x180

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
    and-int/lit8 v7, v11, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v8, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-interface {v1, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_6

    :cond_b
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :goto_7
    and-int/lit8 v9, v11, 0x10

    if-eqz v9, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v1, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, v11, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v3, v14

    :cond_f
    move/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int/2addr v14, v10

    if-nez v14, :cond_f

    move/from16 v14, p5

    invoke-interface {v1, v14}, LV/n;->d(Z)Z

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

    and-int/2addr v15, v10

    if-nez v15, :cond_14

    and-int/lit8 v15, v11, 0x40

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
    and-int/lit16 v0, v11, 0x80

    const/high16 v17, 0xc00000

    if-eqz v0, :cond_15

    or-int v3, v3, v17

    move-object/from16 v2, p7

    goto :goto_f

    :cond_15
    and-int v17, v10, v17

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
    and-int/lit16 v2, v11, 0x100

    const/high16 v17, 0x6000000

    if-eqz v2, :cond_18

    or-int v3, v3, v17

    move-object/from16 v4, p8

    goto :goto_11

    :cond_18
    and-int v17, v10, v17

    move-object/from16 v4, p8

    if-nez v17, :cond_1a

    invoke-interface {v1, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_19

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v17, 0x2000000

    :goto_10
    or-int v3, v3, v17

    :cond_1a
    :goto_11
    const v17, 0x2492493

    and-int v4, v3, v17

    const v6, 0x2492492

    if-ne v4, v6, :cond_1c

    invoke-interface {v1}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v1}, LV/n;->A()V

    move-object/from16 v3, p2

    move-object/from16 v9, p8

    move-object v4, v8

    move-object v5, v12

    move v6, v14

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_1a

    :cond_1c
    :goto_12
    invoke-interface {v1}, LV/n;->q()V

    and-int/lit8 v4, v10, 0x1

    const v6, -0x380001

    if-eqz v4, :cond_1f

    invoke-interface {v1}, LV/n;->G()Z

    move-result v4

    if-eqz v4, :cond_1d

    goto :goto_13

    :cond_1d
    invoke-interface {v1}, LV/n;->A()V

    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1e

    and-int/2addr v3, v6

    :cond_1e
    move-object/from16 v4, p2

    move-object/from16 v2, p7

    move-object/from16 v5, p8

    move-object v0, v12

    move v7, v14

    move-object v9, v15

    goto :goto_19

    :cond_1f
    :goto_13
    if-eqz v5, :cond_20

    sget-object v4, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_14

    :cond_20
    move-object/from16 v4, p2

    :goto_14
    const/4 v5, 0x0

    if-eqz v7, :cond_21

    move-object v8, v5

    :cond_21
    if-eqz v9, :cond_22

    move-object v12, v5

    :cond_22
    if-eqz v13, :cond_23

    const/4 v7, 0x1

    goto :goto_15

    :cond_23
    move v7, v14

    :goto_15
    and-int/lit8 v9, v11, 0x40

    if-eqz v9, :cond_24

    sget-object v9, LS/q0;->a:LS/q0;

    const/4 v13, 0x6

    invoke-virtual {v9, v1, v13}, LS/q0;->g(LV/n;I)LS/r0;

    move-result-object v9

    and-int/2addr v3, v6

    goto :goto_16

    :cond_24
    move-object v9, v15

    :goto_16
    if-eqz v0, :cond_25

    sget-object v0, LS/q0;->a:LS/q0;

    invoke-virtual {v0}, LS/q0;->c()LA/B;

    move-result-object v0

    goto :goto_17

    :cond_25
    move-object/from16 v0, p7

    :goto_17
    if-eqz v2, :cond_26

    :goto_18
    move-object v2, v0

    move-object v0, v12

    goto :goto_19

    :cond_26
    move-object/from16 v5, p8

    goto :goto_18

    :goto_19
    invoke-interface {v1}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v6

    if-eqz v6, :cond_27

    const/4 v6, -0x1

    const-string v12, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)"

    const v13, 0x6cdbbe60

    invoke-static {v13, v3, v6, v12}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_27
    const v6, 0xffffffe

    and-int v22, v3, v6

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    move-object v14, v4

    move-object v15, v8

    move-object/from16 v16, v0

    move/from16 v17, v7

    move-object/from16 v18, v9

    move-object/from16 v19, v2

    move-object/from16 v20, v5

    move-object/from16 v21, v1

    invoke-static/range {v12 .. v22}, LS/s0;->d(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_28

    invoke-static {}, LV/q;->P()V

    :cond_28
    move-object v3, v4

    move v6, v7

    move-object v4, v8

    move-object v7, v9

    move-object v8, v2

    move-object v9, v5

    move-object v5, v0

    :goto_1a
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v12

    if-eqz v12, :cond_29

    new-instance v13, LS/e$d;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LS/e$d;-><init>(Lx7/p;Lx7/a;Landroidx/compose/ui/d;Lx7/p;Lx7/p;ZLS/r0;LA/B;Lz/l;II)V

    invoke-interface {v12, v13}, LV/e1;->a(Lx7/p;)V

    :cond_29
    return-void
.end method
