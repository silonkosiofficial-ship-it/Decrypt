.class public abstract LS/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS/x$h;
    }
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x2

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/x;->a:F

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/x;->b:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/x;->c:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/x;->d:F

    return-void
.end method

.method public static final a(ZLx7/l;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V
    .locals 20

    .prologue
    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p7

    const v0, -0x53d92a91

    move-object/from16 v3, p6

    invoke-interface {v3, v0}, LV/n;->r(I)LV/n;

    move-result-object v3

    and-int/lit8 v4, p8, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v7, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, LV/n;->d(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v7

    goto :goto_1

    :cond_2
    move v4, v7

    :goto_1
    and-int/lit8 v6, p8, 0x2

    const/16 v8, 0x20

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_5

    invoke-interface {v3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v8

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, p8, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v3, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p8, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p3

    invoke-interface {v3, v11}, LV/n;->d(Z)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit16 v12, v7, 0x6000

    if-nez v12, :cond_e

    and-int/lit8 v12, p8, 0x10

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v3, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v12, p4

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v4, v13

    goto :goto_9

    :cond_e
    move-object/from16 v12, p4

    :goto_9
    and-int/lit8 v13, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v13, :cond_10

    or-int/2addr v4, v14

    :cond_f
    move-object/from16 v14, p5

    goto :goto_b

    :cond_10
    and-int/2addr v14, v7

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-interface {v3, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v4, v15

    :goto_b
    const v15, 0x12493

    and-int/2addr v15, v4

    const v5, 0x12492

    if-ne v15, v5, :cond_13

    invoke-interface {v3}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v3}, LV/n;->A()V

    move v4, v11

    move-object v5, v12

    move-object v6, v14

    goto/16 :goto_13

    :cond_13
    :goto_c
    invoke-interface {v3}, LV/n;->q()V

    and-int/lit8 v5, v7, 0x1

    const/4 v15, 0x0

    const v16, -0xe001

    const/16 v17, 0x1

    if-eqz v5, :cond_16

    invoke-interface {v3}, LV/n;->G()Z

    move-result v5

    if-eqz v5, :cond_14

    goto :goto_e

    :cond_14
    invoke-interface {v3}, LV/n;->A()V

    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_15

    and-int v4, v4, v16

    :cond_15
    move v5, v11

    move-object v6, v12

    move-object/from16 v18, v14

    :goto_d
    move-object/from16 v19, v9

    move v9, v4

    move-object/from16 v4, v19

    goto :goto_f

    :cond_16
    :goto_e
    if-eqz v6, :cond_17

    sget-object v5, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v9, v5

    :cond_17
    if-eqz v10, :cond_18

    move/from16 v11, v17

    :cond_18
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_19

    sget-object v5, LS/w;->a:LS/w;

    const/4 v6, 0x6

    invoke-virtual {v5, v3, v6}, LS/w;->a(LV/n;I)LS/v;

    move-result-object v5

    and-int v4, v4, v16

    move-object v12, v5

    :cond_19
    if-eqz v13, :cond_15

    move v5, v11

    move-object v6, v12

    move-object/from16 v18, v15

    goto :goto_d

    :goto_f
    invoke-interface {v3}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v10

    if-eqz v10, :cond_1a

    const/4 v10, -0x1

    const-string v11, "androidx.compose.material3.Checkbox (Checkbox.kt:98)"

    invoke-static {v0, v9, v10, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1a
    invoke-static/range {p0 .. p0}, LL0/b;->a(Z)LL0/a;

    move-result-object v0

    const v10, 0x3e66fb2a

    invoke-interface {v3, v10}, LV/n;->T(I)V

    if-eqz v2, :cond_1f

    and-int/lit8 v10, v9, 0x70

    const/4 v11, 0x0

    if-ne v10, v8, :cond_1b

    move/from16 v8, v17

    goto :goto_10

    :cond_1b
    move v8, v11

    :goto_10
    and-int/lit8 v10, v9, 0xe

    const/4 v12, 0x4

    if-ne v10, v12, :cond_1c

    goto :goto_11

    :cond_1c
    move/from16 v17, v11

    :goto_11
    or-int v8, v8, v17

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1d

    sget-object v8, LV/n;->a:LV/n$a;

    invoke-virtual {v8}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v10, v8, :cond_1e

    :cond_1d
    new-instance v10, LS/x$a;

    invoke-direct {v10, v2, v1}, LS/x$a;-><init>(Lx7/l;Z)V

    invoke-interface {v3, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lx7/a;

    goto :goto_12

    :cond_1f
    move-object v10, v15

    :goto_12
    invoke-interface {v3}, LV/n;->J()V

    const v8, 0x7ff80

    and-int v15, v9, v8

    const/16 v16, 0x0

    move-object v8, v0

    move-object v9, v10

    move-object v10, v4

    move v11, v5

    move-object v12, v6

    move-object/from16 v13, v18

    move-object v14, v3

    invoke-static/range {v8 .. v16}, LS/x;->c(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LV/q;->P()V

    :cond_20
    move-object v9, v4

    move v4, v5

    move-object v5, v6

    move-object/from16 v6, v18

    :goto_13
    invoke-interface {v3}, LV/n;->x()LV/e1;

    move-result-object v10

    if-eqz v10, :cond_21

    new-instance v11, LS/x$b;

    move-object v0, v11

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS/x$b;-><init>(ZLx7/l;Landroidx/compose/ui/d;ZLS/v;Lz/l;II)V

    invoke-interface {v10, v11}, LV/e1;->a(Lx7/p;)V

    :cond_21
    return-void
.end method

.method private static final b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V
    .locals 34

    .prologue
    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const v0, 0x77a265e0

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, LV/n;->r(I)LV/n;

    move-result-object v14

    and-int/lit8 v6, v5, 0x6

    const/4 v15, 0x2

    if-nez v6, :cond_1

    invoke-interface {v14, v1}, LV/n;->d(Z)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move v6, v15

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-interface {v14, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-interface {v14, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-interface {v14, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    move v13, v6

    and-int/lit16 v6, v13, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_9

    invoke-interface {v14}, LV/n;->u()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v14}, LV/n;->A()V

    goto/16 :goto_a

    :cond_9
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v6

    const/4 v12, -0x1

    if-eqz v6, :cond_a

    const-string v6, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:271)"

    invoke-static {v0, v13, v12, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_a
    shr-int/lit8 v0, v13, 0x3

    and-int/lit8 v11, v0, 0xe

    const/4 v10, 0x0

    invoke-static {v2, v10, v14, v11, v15}, Lu/u0;->g(Ljava/lang/Object;Ljava/lang/String;LV/n;II)Lu/s0;

    move-result-object v16

    sget-object v6, LS/x$f;->D:LS/x$f;

    sget-object v17, Ly7/m;->a:Ly7/m;

    invoke-static/range {v17 .. v17}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v18

    invoke-virtual/range {v16 .. v16}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LL0/a;

    const v8, 0x6b4ad266

    invoke-interface {v14, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    const-string v10, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:283)"

    move/from16 v19, v13

    const/4 v13, 0x0

    if-eqz v9, :cond_b

    invoke-static {v8, v13, v12, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_b
    sget-object v20, LS/x$h;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v20, v7

    const/4 v9, 0x1

    const/4 v12, 0x3

    const/16 v22, 0x0

    const/high16 v23, 0x3f800000    # 1.0f

    if-eq v7, v9, :cond_c

    if-eq v7, v15, :cond_e

    if-ne v7, v12, :cond_d

    :cond_c
    move/from16 v7, v23

    goto :goto_6

    :cond_d
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_e
    move/from16 v7, v22

    :goto_6
    invoke-static {}, LV/q;->H()Z

    move-result v24

    if-eqz v24, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    invoke-interface {v14}, LV/n;->J()V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v24

    check-cast v24, LL0/a;

    invoke-interface {v14, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v25

    const/4 v12, -0x1

    if-eqz v25, :cond_10

    invoke-static {v8, v13, v12, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_10
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v20, v8

    const/4 v10, 0x3

    if-eq v8, v9, :cond_11

    if-eq v8, v15, :cond_13

    if-ne v8, v10, :cond_12

    :cond_11
    move/from16 v8, v23

    goto :goto_7

    :cond_12
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_13
    move/from16 v8, v22

    :goto_7
    invoke-static {}, LV/q;->H()Z

    move-result v21

    if-eqz v21, :cond_14

    invoke-static {}, LV/q;->P()V

    :cond_14
    invoke-interface {v14}, LV/n;->J()V

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lu/s0;->n()Lu/s0$b;

    move-result-object v9

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v6, v9, v14, v10}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lu/I;

    const-string v24, "FloatAnimation"

    const/16 v26, 0x0

    move-object/from16 v6, v16

    const/4 v10, 0x1

    move v15, v10

    const/16 v21, 0x3

    move-object/from16 v10, v18

    move/from16 v18, v11

    move-object/from16 v11, v24

    move v15, v12

    move-object v12, v14

    move v5, v13

    move/from16 v13, v26

    invoke-static/range {v6 .. v13}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v13

    sget-object v6, LS/x$e;->D:LS/x$e;

    invoke-static/range {v17 .. v17}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LL0/a;

    const v8, -0x550dd391

    invoke-interface {v14, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v9

    const-string v11, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:300)"

    if-eqz v9, :cond_15

    invoke-static {v8, v5, v15, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_15
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v20, v7

    const/4 v9, 0x1

    if-eq v7, v9, :cond_17

    const/4 v9, 0x2

    if-eq v7, v9, :cond_17

    const/4 v9, 0x3

    if-ne v7, v9, :cond_16

    move/from16 v7, v23

    goto :goto_8

    :cond_16
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_17
    const/4 v9, 0x3

    move/from16 v7, v22

    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v12

    if-eqz v12, :cond_18

    invoke-static {}, LV/q;->P()V

    :cond_18
    invoke-interface {v14}, LV/n;->J()V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual/range {v16 .. v16}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LL0/a;

    invoke-interface {v14, v8}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-static {v8, v5, v15, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_19
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v20, v8

    const/4 v11, 0x1

    if-eq v8, v11, :cond_1b

    const/4 v11, 0x2

    if-eq v8, v11, :cond_1b

    if-ne v8, v9, :cond_1a

    move/from16 v22, v23

    goto :goto_9

    :cond_1a
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_1b
    :goto_9
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_1c

    invoke-static {}, LV/q;->P()V

    :cond_1c
    invoke-interface {v14}, LV/n;->J()V

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual/range {v16 .. v16}, Lu/s0;->n()Lu/s0$b;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v6, v9, v14, v11}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lu/I;

    const-string v11, "FloatAnimation"

    move-object/from16 v6, v16

    move-object v12, v14

    move-object v15, v13

    move/from16 v13, v26

    invoke-static/range {v6 .. v13}, Lu/u0;->d(Lu/s0;Ljava/lang/Object;Ljava/lang/Object;Lu/I;Lu/x0;Ljava/lang/String;LV/n;I)LV/G1;

    move-result-object v6

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, LV/n;->a:LV/n$a;

    invoke-virtual {v8}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_1d

    new-instance v7, LS/u;

    const/16 v24, 0x7

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v7

    invoke-direct/range {v20 .. v25}, LS/u;-><init>(Lo0/Q1;Lo0/T1;Lo0/Q1;ILy7/k;)V

    invoke-interface {v14, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v33, v7

    check-cast v33, LS/u;

    shr-int/lit8 v7, v19, 0x6

    and-int/lit8 v7, v7, 0x70

    or-int v7, v18, v7

    invoke-virtual {v4, v2, v14, v7}, LS/v;->c(LL0/a;LV/n;I)LV/G1;

    move-result-object v7

    and-int/lit8 v9, v19, 0x7e

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v9

    invoke-virtual {v4, v1, v2, v14, v0}, LS/v;->b(ZLL0/a;LV/n;I)LV/G1;

    move-result-object v9

    invoke-virtual {v4, v1, v2, v14, v0}, LS/v;->a(ZLL0/a;LV/n;I)LV/G1;

    move-result-object v0

    sget-object v10, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v10}, Lh0/c$a;->e()Lh0/c;

    move-result-object v10

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v3, v10, v5, v11, v12}, Landroidx/compose/foundation/layout/p;->z(Landroidx/compose/ui/d;Lh0/c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v10

    sget v11, LS/x;->b:F

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/p;->k(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-interface {v14, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    invoke-interface {v14, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v12

    if-nez v11, :cond_1e

    invoke-virtual {v8}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v12, v8, :cond_1f

    :cond_1e
    new-instance v12, LS/x$c;

    move-object/from16 v27, v12

    move-object/from16 v28, v9

    move-object/from16 v29, v0

    move-object/from16 v30, v7

    move-object/from16 v31, v15

    move-object/from16 v32, v6

    invoke-direct/range {v27 .. v33}, LS/x$c;-><init>(LV/G1;LV/G1;LV/G1;LV/G1;LV/G1;LS/u;)V

    invoke-interface {v14, v12}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1f
    check-cast v12, Lx7/l;

    invoke-static {v10, v12, v14, v5}, Lv/i;->a(Landroidx/compose/ui/d;Lx7/l;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LV/q;->P()V

    :cond_20
    :goto_a
    invoke-interface {v14}, LV/n;->x()LV/e1;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v7, LS/x$d;

    move-object v0, v7

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LS/x$d;-><init>(ZLL0/a;Landroidx/compose/ui/d;LS/v;I)V

    invoke-interface {v6, v7}, LV/e1;->a(Lx7/p;)V

    :cond_21
    return-void
.end method

.method public static final c(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;LV/n;II)V
    .locals 19

    .prologue
    move-object/from16 v7, p1

    move/from16 v8, p7

    const v0, -0x5fdd98b1

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v6

    and-int/lit8 v1, p8, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x6

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x6

    move-object/from16 v5, p0

    if-nez v1, :cond_2

    invoke-interface {v6, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_5

    invoke-interface {v6, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v4, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_6

    move-object/from16 v4, p2

    invoke-interface {v6, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v1, v9

    :goto_5
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-interface {v6, v10}, LV/n;->d(Z)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v1, v11

    :goto_7
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_e

    and-int/lit8 v11, p8, 0x10

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v6, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v11, p4

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v1, v12

    goto :goto_9

    :cond_e
    move-object/from16 v11, p4

    :goto_9
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v1, v13

    :cond_f
    move-object/from16 v13, p5

    goto :goto_b

    :cond_10
    and-int/2addr v13, v8

    if-nez v13, :cond_f

    move-object/from16 v13, p5

    invoke-interface {v6, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v1, v14

    :goto_b
    const v14, 0x12493

    and-int/2addr v14, v1

    const v15, 0x12492

    if-ne v14, v15, :cond_13

    invoke-interface {v6}, LV/n;->u()Z

    move-result v14

    if-nez v14, :cond_12

    goto :goto_c

    :cond_12
    invoke-interface {v6}, LV/n;->A()V

    move-object v3, v4

    move v4, v10

    move-object v5, v11

    move-object v10, v6

    move-object v6, v13

    goto/16 :goto_12

    :cond_13
    :goto_c
    invoke-interface {v6}, LV/n;->q()V

    and-int/lit8 v14, v8, 0x1

    const v15, -0xe001

    if-eqz v14, :cond_16

    invoke-interface {v6}, LV/n;->G()Z

    move-result v14

    if-eqz v14, :cond_14

    goto :goto_d

    :cond_14
    invoke-interface {v6}, LV/n;->A()V

    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_15

    and-int/2addr v1, v15

    :cond_15
    move v3, v1

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v18, v13

    goto :goto_10

    :cond_16
    :goto_d
    if-eqz v3, :cond_17

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_e

    :cond_17
    move-object v3, v4

    :goto_e
    if-eqz v9, :cond_18

    const/4 v4, 0x1

    move v10, v4

    :cond_18
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_19

    sget-object v4, LS/w;->a:LS/w;

    const/4 v9, 0x6

    invoke-virtual {v4, v6, v9}, LS/w;->a(LV/n;I)LS/v;

    move-result-object v4

    and-int/2addr v1, v15

    move-object v11, v4

    :cond_19
    if-eqz v12, :cond_1a

    const/4 v4, 0x0

    move-object/from16 v18, v4

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object v4, v3

    :goto_f
    move v3, v1

    goto :goto_10

    :cond_1a
    move-object v4, v3

    move/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v18, v13

    goto :goto_f

    :goto_10
    invoke-interface {v6}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_1b

    const/4 v1, -0x1

    const-string v9, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:151)"

    invoke-static {v0, v3, v1, v9}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1b
    const v0, -0x5cbc2c2

    invoke-interface {v6, v0}, LV/n;->T(I)V

    if-eqz v7, :cond_1c

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v1, LK0/h;->b:LK0/h$a;

    invoke-virtual {v1}, LK0/h$a;->b()I

    move-result v1

    sget-object v9, LU/b;->a:LU/b;

    invoke-virtual {v9}, LU/b;->d()F

    move-result v9

    int-to-float v2, v2

    div-float/2addr v9, v2

    invoke-static {v9}, LY0/i;->q(F)F

    move-result v10

    const/16 v14, 0x36

    const/4 v15, 0x4

    const/4 v9, 0x0

    const-wide/16 v11, 0x0

    move-object v13, v6

    invoke-static/range {v9 .. v15}, LS/I0;->c(ZFJLV/n;II)Lv/G;

    move-result-object v9

    invoke-static {v1}, LK0/h;->h(I)LK0/h;

    move-result-object v10

    move-object/from16 v1, p0

    move-object/from16 v2, v18

    move v11, v3

    move-object v3, v9

    move-object v9, v4

    move/from16 v4, v16

    move-object v5, v10

    move-object v10, v6

    move-object/from16 v6, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/selection/c;->a(Landroidx/compose/ui/d;LL0/a;Lz/l;Lv/G;ZLK0/h;Lx7/a;)Landroidx/compose/ui/d;

    move-result-object v0

    goto :goto_11

    :cond_1c
    move v11, v3

    move-object v9, v4

    move-object v10, v6

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :goto_11
    invoke-interface {v10}, LV/n;->J()V

    sget-object v1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    if-eqz v7, :cond_1d

    invoke-static {v1}, LS/k0;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    :cond_1d
    invoke-interface {v9, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget v1, LS/x;->a:F

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/m;->i(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v3

    shr-int/lit8 v0, v11, 0x9

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v1, v11, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    shr-int/lit8 v1, v11, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int v6, v0, v1

    move/from16 v1, v16

    move-object/from16 v2, p0

    move-object/from16 v4, v17

    move-object v5, v10

    invoke-static/range {v1 .. v6}, LS/x;->b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LV/q;->P()V

    :cond_1e
    move-object v3, v9

    move/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    :goto_12
    invoke-interface {v10}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_1f

    new-instance v10, LS/x$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS/x$g;-><init>(LL0/a;Lx7/a;Landroidx/compose/ui/d;ZLS/v;Lz/l;II)V

    invoke-interface {v9, v10}, LV/e1;->a(Lx7/p;)V

    :cond_1f
    return-void
.end method

.method public static final synthetic d(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LS/x;->b(ZLL0/a;Landroidx/compose/ui/d;LS/v;LV/n;I)V

    return-void
.end method

.method public static final synthetic e(Lq0/g;JJFF)V
    .locals 0

    invoke-static/range {p0 .. p6}, LS/x;->i(Lq0/g;JJFF)V

    return-void
.end method

.method public static final synthetic f(Lq0/g;JFFFLS/u;)V
    .locals 0

    invoke-static/range {p0 .. p6}, LS/x;->j(Lq0/g;JFFFLS/u;)V

    return-void
.end method

.method public static final synthetic g()F
    .locals 1

    sget v0, LS/x;->d:F

    return v0
.end method

.method public static final synthetic h()F
    .locals 1

    sget v0, LS/x;->c:F

    return v0
.end method

.method private static final i(Lq0/g;JJFF)V
    .locals 51

    .prologue
    move/from16 v0, p5

    move/from16 v9, p6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v10, v9, v1

    new-instance v20, Lq0/m;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v20

    move/from16 v2, p6

    invoke-direct/range {v1 .. v8}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    invoke-interface/range {p0 .. p0}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result v1

    invoke-static/range {p1 .. p4}, Lo0/y0;->o(JJ)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    invoke-static {v1, v1}, Ln0/n;->a(FF)J

    move-result-wide v26

    invoke-static {v0, v5, v4, v3}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v28

    sget-object v30, Lq0/l;->a:Lq0/l;

    const/16 v34, 0xe2

    const/16 v35, 0x0

    const-wide/16 v24, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v21, p0

    move-wide/from16 v22, p1

    invoke-static/range {v21 .. v35}, Lq0/f;->o(Lq0/g;JJJJLq0/h;FLo0/z0;IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v9, v9}, Ln0/h;->a(FF)J

    move-result-wide v39

    int-to-float v2, v4

    mul-float/2addr v2, v9

    sub-float v2, v1, v2

    invoke-static {v2, v2}, Ln0/n;->a(FF)J

    move-result-wide v41

    sub-float v2, v0, v9

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    invoke-static {v2, v5, v4, v3}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v43

    sget-object v45, Lq0/l;->a:Lq0/l;

    const/16 v49, 0xe0

    const/16 v50, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 v36, p0

    move-wide/from16 v37, p1

    invoke-static/range {v36 .. v50}, Lq0/f;->o(Lq0/g;JJJJLq0/h;FLo0/z0;IILjava/lang/Object;)V

    invoke-static {v10, v10}, Ln0/h;->a(FF)J

    move-result-wide v14

    sub-float/2addr v1, v9

    invoke-static {v1, v1}, Ln0/n;->a(FF)J

    move-result-wide v16

    sub-float/2addr v0, v10

    invoke-static {v0, v5, v4, v3}, Ln0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v18

    const/16 v24, 0xe0

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v11, p0

    move-wide/from16 v12, p3

    invoke-static/range {v11 .. v25}, Lq0/f;->o(Lq0/g;JJJJLq0/h;FLo0/z0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method private static final j(Lq0/g;JFFFLS/u;)V
    .locals 11

    move v0, p4

    new-instance v9, Lq0/m;

    sget-object v1, Lo0/g2;->a:Lo0/g2$a;

    invoke-virtual {v1}, Lo0/g2$a;->c()I

    move-result v4

    const/16 v7, 0x1a

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v9

    move/from16 v2, p5

    invoke-direct/range {v1 .. v8}, Lq0/m;-><init>(FFIILo0/R1;ILy7/k;)V

    invoke-interface {p0}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result v1

    const v2, 0x3ecccccd    # 0.4f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v2, v3, p4}, La1/b;->b(FFF)F

    move-result v2

    const v4, 0x3f333333    # 0.7f

    invoke-static {v4, v3, p4}, La1/b;->b(FFF)F

    move-result v4

    invoke-static {v3, v3, p4}, La1/b;->b(FFF)F

    move-result v5

    const v6, 0x3e99999a    # 0.3f

    invoke-static {v6, v3, p4}, La1/b;->b(FFF)F

    move-result v0

    invoke-virtual/range {p6 .. p6}, LS/u;->a()Lo0/Q1;

    move-result-object v3

    invoke-interface {v3}, Lo0/Q1;->a()V

    invoke-virtual/range {p6 .. p6}, LS/u;->a()Lo0/Q1;

    move-result-object v3

    const v6, 0x3e4ccccd    # 0.2f

    mul-float/2addr v6, v1

    mul-float/2addr v5, v1

    invoke-interface {v3, v6, v5}, Lo0/Q1;->l(FF)V

    invoke-virtual/range {p6 .. p6}, LS/u;->a()Lo0/Q1;

    move-result-object v3

    mul-float/2addr v2, v1

    mul-float/2addr v4, v1

    invoke-interface {v3, v2, v4}, Lo0/Q1;->r(FF)V

    invoke-virtual/range {p6 .. p6}, LS/u;->a()Lo0/Q1;

    move-result-object v2

    const v3, 0x3f4ccccd    # 0.8f

    mul-float/2addr v3, v1

    mul-float/2addr v1, v0

    invoke-interface {v2, v3, v1}, Lo0/Q1;->r(FF)V

    invoke-virtual/range {p6 .. p6}, LS/u;->b()Lo0/T1;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, LS/u;->a()Lo0/Q1;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo0/T1;->b(Lo0/Q1;Z)V

    invoke-virtual/range {p6 .. p6}, LS/u;->c()Lo0/Q1;

    move-result-object v0

    invoke-interface {v0}, Lo0/Q1;->a()V

    invoke-virtual/range {p6 .. p6}, LS/u;->b()Lo0/T1;

    move-result-object v0

    invoke-virtual/range {p6 .. p6}, LS/u;->b()Lo0/T1;

    move-result-object v1

    invoke-interface {v1}, Lo0/T1;->a()F

    move-result v1

    mul-float/2addr v1, p3

    invoke-virtual/range {p6 .. p6}, LS/u;->c()Lo0/Q1;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-interface {v0, v4, v1, v2, v3}, Lo0/T1;->c(FFLo0/Q1;Z)Z

    invoke-virtual/range {p6 .. p6}, LS/u;->c()Lo0/Q1;

    move-result-object v1

    const/16 v8, 0x34

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, v9

    move-object v9, v10

    invoke-static/range {v0 .. v9}, Lq0/f;->k(Lq0/g;Lo0/Q1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    return-void
.end method
