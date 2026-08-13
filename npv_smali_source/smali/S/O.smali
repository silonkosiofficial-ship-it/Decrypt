.class public abstract LS/O;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LA/B;

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x8

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v4

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v3

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/m;->e(FFFFILjava/lang/Object;)LA/B;

    move-result-object v1

    sput-object v1, LS/O;->a:LA/B;

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/O;->b:F

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/O;->c:F

    return-void
.end method

.method public static final a(Lx7/a;Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lo0/e2;FLS/M;Landroidx/compose/ui/window/i;Lx7/q;LV/n;II)V
    .locals 24

    .prologue
    move/from16 v10, p10

    move/from16 v11, p11

    const v0, -0x22d35dc

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v8

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v10, 0x6

    move-object/from16 v9, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v10, 0x6

    move-object/from16 v9, p0

    if-nez v1, :cond_2

    invoke-interface {v8, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_2
    move v1, v10

    :goto_1
    and-int/lit8 v2, v11, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v10, 0x30

    move-object/from16 v7, p1

    if-nez v2, :cond_5

    invoke-interface {v8, v7}, LV/n;->l(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v11, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v10, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v8, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_4

    :cond_8
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :goto_5
    and-int/lit8 v4, v11, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v10, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-interface {v8, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x800

    goto :goto_6

    :cond_b
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    :goto_7
    and-int/lit16 v6, v10, 0x6000

    if-nez v6, :cond_e

    and-int/lit8 v6, v11, 0x10

    if-nez v6, :cond_c

    move-object/from16 v6, p4

    invoke-interface {v8, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v6, p4

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v1, v12

    goto :goto_9

    :cond_e
    move-object/from16 v6, p4

    :goto_9
    and-int/lit8 v12, v11, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v1, v13

    :cond_f
    move/from16 v13, p5

    goto :goto_b

    :cond_10
    and-int/2addr v13, v10

    if-nez v13, :cond_f

    move/from16 v13, p5

    invoke-interface {v8, v13}, LV/n;->h(F)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v1, v14

    :goto_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v10

    if-nez v14, :cond_14

    and-int/lit8 v14, v11, 0x40

    if-nez v14, :cond_12

    move-object/from16 v14, p6

    invoke-interface {v8, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_13

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_12
    move-object/from16 v14, p6

    :cond_13
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v1, v15

    goto :goto_d

    :cond_14
    move-object/from16 v14, p6

    :goto_d
    and-int/lit16 v15, v11, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_15

    or-int v1, v1, v16

    move-object/from16 v0, p7

    goto :goto_f

    :cond_15
    and-int v16, v10, v16

    move-object/from16 v0, p7

    if-nez v16, :cond_17

    invoke-interface {v8, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v1, v1, v17

    :cond_17
    :goto_f
    and-int/lit16 v0, v11, 0x100

    const/high16 v17, 0x6000000

    if-eqz v0, :cond_19

    or-int v1, v1, v17

    :cond_18
    move-object/from16 v0, p8

    goto :goto_11

    :cond_19
    and-int v0, v10, v17

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1a

    const/high16 v17, 0x4000000

    goto :goto_10

    :cond_1a
    const/high16 v17, 0x2000000

    :goto_10
    or-int v1, v1, v17

    :goto_11
    const v17, 0x2492493

    and-int v0, v1, v17

    const v3, 0x2492492

    if-ne v0, v3, :cond_1c

    invoke-interface {v8}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v8}, LV/n;->A()V

    move-object/from16 v3, p2

    move-object/from16 v23, p7

    move-object v4, v5

    move-object v5, v6

    move v6, v13

    move-object v7, v14

    goto/16 :goto_17

    :cond_1c
    :goto_12
    invoke-interface {v8}, LV/n;->q()V

    and-int/lit8 v0, v10, 0x1

    const v17, -0xe001

    const/4 v3, 0x0

    if-eqz v0, :cond_21

    invoke-interface {v8}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-interface {v8}, LV/n;->A()V

    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_1e

    and-int v1, v1, v17

    :cond_1e
    and-int/lit8 v0, v11, 0x40

    if-eqz v0, :cond_1f

    const v0, -0x380001

    and-int/2addr v1, v0

    :cond_1f
    move-object/from16 v0, p2

    :cond_20
    move-object/from16 v23, p7

    :goto_13
    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move/from16 v21, v13

    move-object/from16 v22, v14

    goto :goto_16

    :cond_21
    :goto_14
    if-eqz v2, :cond_22

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_15

    :cond_22
    move-object/from16 v0, p2

    :goto_15
    if-eqz v4, :cond_23

    move-object v5, v3

    :cond_23
    and-int/lit8 v2, v11, 0x10

    const/4 v4, 0x6

    if-eqz v2, :cond_24

    sget-object v2, LS/N;->a:LS/N;

    invoke-virtual {v2, v8, v4}, LS/N;->h(LV/n;I)Lo0/e2;

    move-result-object v2

    and-int v1, v1, v17

    move-object v6, v2

    :cond_24
    if-eqz v12, :cond_25

    sget-object v2, LS/N;->a:LS/N;

    invoke-virtual {v2}, LS/N;->i()F

    move-result v2

    move v13, v2

    :cond_25
    and-int/lit8 v2, v11, 0x40

    if-eqz v2, :cond_26

    sget-object v2, LS/N;->a:LS/N;

    invoke-virtual {v2, v8, v4}, LS/N;->c(LV/n;I)LS/M;

    move-result-object v2

    const v4, -0x380001

    and-int/2addr v1, v4

    move-object v14, v2

    :cond_26
    if-eqz v15, :cond_20

    new-instance v2, Landroidx/compose/ui/window/i;

    const/4 v4, 0x3

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 p2, v2

    move/from16 p3, v15

    move/from16 p4, v17

    move/from16 p5, v18

    move/from16 p6, v4

    move-object/from16 p7, v12

    invoke-direct/range {p2 .. p7}, Landroidx/compose/ui/window/i;-><init>(ZZZILy7/k;)V

    move-object/from16 v23, v2

    goto :goto_13

    :goto_16
    invoke-interface {v8}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_27

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:76)"

    const v5, -0x22d35dc

    invoke-static {v5, v1, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_27
    const/4 v2, 0x0

    const/4 v4, 0x3

    invoke-static {v0, v3, v2, v4, v3}, Landroidx/compose/foundation/layout/p;->x(Landroidx/compose/ui/d;Lh0/c$c;ZILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    new-instance v3, LS/O$a;

    move-object v12, v3

    move-object/from16 v13, v20

    move-object/from16 v14, v22

    move/from16 v15, v21

    move-object/from16 v16, p8

    move-object/from16 v17, v19

    move-object/from16 v18, p1

    invoke-direct/range {v12 .. v18}, LS/O$a;-><init>(Lo0/e2;LS/M;FLx7/q;Lx7/p;Lx7/p;)V

    const/16 v4, 0x36

    const v5, -0xa22256

    const/4 v6, 0x1

    invoke-static {v5, v6, v3, v8, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v4

    and-int/lit8 v3, v1, 0xe

    or-int/lit16 v3, v3, 0xc00

    shr-int/lit8 v1, v1, 0xf

    and-int/lit16 v1, v1, 0x380

    or-int v6, v3, v1

    const/4 v12, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, v23

    move-object v5, v8

    move v7, v12

    invoke-static/range {v1 .. v7}, LS/b;->d(Lx7/a;Landroidx/compose/ui/d;Landroidx/compose/ui/window/i;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-static {}, LV/q;->P()V

    :cond_28
    move-object v3, v0

    move-object/from16 v4, v19

    move-object/from16 v5, v20

    move/from16 v6, v21

    move-object/from16 v7, v22

    :goto_17
    invoke-interface {v8}, LV/n;->x()LV/e1;

    move-result-object v12

    if-eqz v12, :cond_29

    new-instance v13, LS/O$b;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v8, v23

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LS/O$b;-><init>(Lx7/a;Lx7/p;Landroidx/compose/ui/d;Lx7/p;Lo0/e2;FLS/M;Landroidx/compose/ui/window/i;Lx7/q;II)V

    invoke-interface {v12, v13}, LV/e1;->a(Lx7/p;)V

    :cond_29
    return-void
.end method

.method public static final synthetic b()F
    .locals 1

    sget v0, LS/O;->c:F

    return v0
.end method

.method public static final synthetic c()F
    .locals 1

    sget v0, LS/O;->b:F

    return v0
.end method

.method public static final synthetic d()LA/B;
    .locals 1

    sget-object v0, LS/O;->a:LA/B;

    return-object v0
.end method
