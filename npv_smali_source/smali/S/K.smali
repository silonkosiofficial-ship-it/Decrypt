.class public abstract LS/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LA/B;

.field private static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v3

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v2

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/m;->e(FFFFILjava/lang/Object;)LA/B;

    move-result-object v0

    sput-object v0, LS/K;->a:LA/B;

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/K;->b:F

    return-void
.end method

.method public static final a(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
    .locals 28

    .prologue
    move-object/from16 v14, p0

    move-object/from16 v15, p2

    move-object/from16 v13, p4

    move/from16 v12, p8

    const v0, 0x26585ea9

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v11

    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_1

    invoke-interface {v11, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_1
    move v1, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    move-object/from16 v10, p1

    if-nez v2, :cond_3

    invoke-interface {v11, v10}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v12, 0x180

    if-nez v2, :cond_5

    invoke-interface {v11, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v12, 0xc00

    move-object/from16 v9, p3

    if-nez v2, :cond_7

    invoke-interface {v11, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v12, 0x6000

    const/16 v3, 0x4000

    const v4, 0x8000

    if-nez v2, :cond_a

    and-int v2, v12, v4

    if-nez v2, :cond_8

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_5

    :cond_8
    invoke-interface {v11, v13}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_5
    if-eqz v2, :cond_9

    move v2, v3

    goto :goto_6

    :cond_9
    const/16 v2, 0x2000

    :goto_6
    or-int/2addr v1, v2

    :cond_a
    const/high16 v2, 0x30000

    and-int/2addr v2, v12

    move-object/from16 v8, p5

    if-nez v2, :cond_c

    invoke-interface {v11, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v2, 0x10000

    :goto_7
    or-int/2addr v1, v2

    :cond_c
    const/high16 v2, 0x180000

    and-int/2addr v2, v12

    move-object/from16 v7, p6

    if-nez v2, :cond_e

    invoke-interface {v11, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/high16 v2, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v2, 0x80000

    :goto_8
    or-int/2addr v1, v2

    :cond_e
    move v6, v1

    const v1, 0x92493

    and-int/2addr v1, v6

    const v2, 0x92492

    if-ne v1, v2, :cond_10

    invoke-interface {v11}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_9

    :cond_f
    invoke-interface {v11}, LV/n;->A()V

    move-object/from16 v17, v11

    goto/16 :goto_e

    :cond_10
    :goto_9
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_11

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.DateInputContent (DateInput.kt:60)"

    invoke-static {v0, v6, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_11
    const/4 v5, 0x0

    invoke-static {v11, v5}, LS/o;->a(LV/n;I)Ljava/util/Locale;

    move-result-object v2

    invoke-interface {v11, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_12

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_13

    :cond_12
    invoke-virtual {v15, v2}, LT/f;->c(Ljava/util/Locale;)LT/k;

    move-result-object v1

    invoke-interface {v11, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v1, LT/k;

    sget-object v0, LT/x;->a:LT/x$a;

    sget v0, LS/C0;->c:I

    invoke-static {v0}, LT/x;->a(I)I

    move-result v0

    invoke-static {v0, v11, v5}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v16

    sget v0, LS/C0;->e:I

    invoke-static {v0}, LT/x;->a(I)I

    move-result v0

    invoke-static {v0, v11, v5}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v17

    sget v0, LS/C0;->d:I

    invoke-static {v0}, LT/x;->a(I)I

    move-result v0

    invoke-static {v0, v11, v5}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v18

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    const v19, 0xe000

    and-int v5, v6, v19

    const/4 v12, 0x1

    if-eq v5, v3, :cond_15

    and-int v3, v6, v4

    if-eqz v3, :cond_14

    invoke-interface {v11, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_a

    :cond_14
    const/4 v3, 0x0

    goto :goto_b

    :cond_15
    :goto_a
    move v3, v12

    :goto_b
    or-int/2addr v0, v3

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_17

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_16

    goto :goto_c

    :cond_16
    move-object/from16 v24, v1

    move-object/from16 v25, v2

    move/from16 v16, v6

    move v13, v12

    move-object v12, v11

    goto :goto_d

    :cond_17
    :goto_c
    new-instance v5, LS/L;

    const/16 v19, 0x300

    const/16 v20, 0x0

    const-string v21, ""

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object v0, v5

    move-object/from16 v24, v1

    move-object/from16 v1, p3

    move-object/from16 v25, v2

    move-object/from16 v2, p5

    move-object/from16 v3, v24

    move-object/from16 v4, p4

    move-object/from16 v26, v5

    move-object/from16 v5, v16

    move/from16 v16, v6

    move-object/from16 v6, v17

    move-object/from16 v7, v18

    move-object/from16 v8, v21

    move-object/from16 v9, v22

    move-object/from16 v10, v23

    move-object/from16 v27, v11

    move/from16 v11, v19

    move v13, v12

    move-object/from16 v12, v20

    invoke-direct/range {v0 .. v12}, LS/L;-><init>(LE7/i;LS/P0;LT/k;LS/Q;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILy7/k;)V

    move-object/from16 v0, v26

    move-object/from16 v12, v27

    invoke-interface {v12, v0}, LV/n;->K(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_d
    move-object v7, v3

    check-cast v7, LS/L;

    invoke-virtual/range {v24 .. v24}, LT/k;->b()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, LS/C0;->f:I

    invoke-static {v1}, LT/x;->a(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v12, v2}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v3, v13, v4}, Landroidx/compose/foundation/layout/p;->f(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v3, LS/K;->a:LA/B;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/m;->h(Landroidx/compose/ui/d;LA/B;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v3, LS/j0;->a:LS/j0$a;

    invoke-virtual {v3}, LS/j0$a;->b()I

    move-result v6

    invoke-virtual {v7, v14}, LS/L;->a(Ljava/lang/Long;)V

    new-instance v3, LS/K$a;

    invoke-direct {v3, v1, v0}, LS/K$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const v1, -0x6c6bf7d5

    const/16 v4, 0x36

    invoke-static {v1, v13, v3, v12, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v5

    new-instance v1, LS/K$b;

    invoke-direct {v1, v0}, LS/K$b;-><init>(Ljava/lang/String;)V

    const v0, -0x21a18394

    invoke-static {v0, v13, v1, v12, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v8

    shl-int/lit8 v0, v16, 0x3

    and-int/lit8 v1, v0, 0x70

    const v3, 0x1b6006

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v1, v3

    and-int/lit16 v0, v0, 0x1c00

    or-int v13, v1, v0

    shr-int/lit8 v0, v16, 0x12

    and-int/lit8 v16, v0, 0xe

    move-object v0, v2

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v5

    move-object v5, v8

    move-object/from16 v8, v24

    move-object/from16 v9, v25

    move-object/from16 v10, p6

    move-object v11, v12

    move-object/from16 v17, v12

    move v12, v13

    move/from16 v13, v16

    invoke-static/range {v0 .. v13}, LS/K;->b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, LV/q;->P()V

    :cond_18
    :goto_e
    invoke-interface/range {v17 .. v17}, LV/n;->x()LV/e1;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v10, LS/K$c;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS/K$c;-><init>(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;I)V

    invoke-interface {v9, v10}, LV/e1;->a(Lx7/p;)V

    :cond_19
    return-void
.end method

.method public static final b(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;LV/n;II)V
    .locals 48

    .prologue
    move-object/from16 v2, p1

    move-object/from16 v12, p3

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move/from16 v15, p12

    const v0, -0x3314e9cd

    move-object/from16 v1, p11

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v1

    and-int/lit8 v3, v15, 0x6

    const/4 v4, 0x4

    move-object/from16 v11, p0

    if-nez v3, :cond_1

    invoke-interface {v1, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_1
    move v3, v15

    :goto_1
    and-int/lit8 v6, v15, 0x30

    if-nez v6, :cond_3

    invoke-interface {v1, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v15, 0x180

    move-object/from16 v8, p2

    if-nez v6, :cond_5

    invoke-interface {v1, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit16 v6, v15, 0xc00

    if-nez v6, :cond_7

    invoke-interface {v1, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v3, v6

    :cond_7
    and-int/lit16 v6, v15, 0x6000

    move-object/from16 v7, p4

    if-nez v6, :cond_9

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v3, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v15

    if-nez v6, :cond_b

    move-object/from16 v6, p5

    invoke-interface {v1, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/high16 v16, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v16, 0x10000

    :goto_6
    or-int v3, v3, v16

    goto :goto_7

    :cond_b
    move-object/from16 v6, p5

    :goto_7
    const/high16 v16, 0x180000

    and-int v16, v15, v16

    move/from16 v10, p6

    if-nez v16, :cond_d

    invoke-interface {v1, v10}, LV/n;->i(I)Z

    move-result v17

    if-eqz v17, :cond_c

    const/high16 v17, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v17, 0x80000

    :goto_8
    or-int v3, v3, v17

    :cond_d
    const/high16 v17, 0xc00000

    and-int v17, v15, v17

    move-object/from16 v9, p7

    if-nez v17, :cond_f

    invoke-interface {v1, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_e

    const/high16 v19, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v19, 0x400000

    :goto_9
    or-int v3, v3, v19

    :cond_f
    const/high16 v19, 0x6000000

    and-int v19, v15, v19

    if-nez v19, :cond_11

    invoke-interface {v1, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_10

    const/high16 v19, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v19, 0x2000000

    :goto_a
    or-int v3, v3, v19

    :cond_11
    const/high16 v19, 0x30000000

    and-int v19, v15, v19

    if-nez v19, :cond_13

    invoke-interface {v1, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_12

    const/high16 v19, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v19, 0x10000000

    :goto_b
    or-int v3, v3, v19

    :cond_13
    and-int/lit8 v19, p13, 0x6

    move-object/from16 v9, p10

    if-nez v19, :cond_15

    invoke-interface {v1, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_14

    goto :goto_c

    :cond_14
    const/4 v4, 0x2

    :goto_c
    or-int v4, p13, v4

    goto :goto_d

    :cond_15
    move/from16 v4, p13

    :goto_d
    const v20, 0x12492493

    and-int v0, v3, v20

    const v5, 0x12492492

    if-ne v0, v5, :cond_17

    and-int/lit8 v0, v4, 0x3

    const/4 v5, 0x2

    if-ne v0, v5, :cond_17

    invoke-interface {v1}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_e

    :cond_16
    invoke-interface {v1}, LV/n;->A()V

    goto/16 :goto_19

    :cond_17
    :goto_e
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "androidx.compose.material3.DateInputTextField (DateInput.kt:121)"

    const v5, -0x3314e9cd

    invoke-static {v5, v3, v4, v0}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_18
    const/4 v0, 0x0

    new-array v4, v0, [Ljava/lang/Object;

    sget-object v20, LS/K$h;->D:LS/K$h;

    const/16 v21, 0xc00

    const/16 v22, 0x6

    const/4 v5, 0x0

    const/16 v23, 0x0

    move/from16 v44, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v5, v23

    move-object/from16 v6, v20

    move-object v7, v1

    move/from16 v8, v21

    move/from16 v9, v22

    invoke-static/range {v3 .. v9}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, LV/w0;

    new-array v3, v0, [Ljava/lang/Object;

    sget-object v4, LS0/V;->d:LS0/V$c;

    invoke-virtual {v4}, LS0/V$c;->a()Le0/j;

    move-result-object v4

    move/from16 v8, v44

    and-int/lit8 v5, v8, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_19

    const/4 v5, 0x1

    goto :goto_f

    :cond_19
    move v5, v0

    :goto_f
    invoke-interface {v1, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    const/high16 v6, 0xe000000

    and-int/2addr v6, v8

    const/high16 v0, 0x4000000

    if-ne v6, v0, :cond_1a

    const/16 v17, 0x1

    goto :goto_10

    :cond_1a
    const/16 v17, 0x0

    :goto_10
    or-int v5, v5, v17

    invoke-interface {v1, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1b

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_1c

    :cond_1b
    new-instance v7, LS/K$i;

    invoke-direct {v7, v2, v12, v13, v14}, LS/K$i;-><init>(Ljava/lang/Long;LT/f;LT/k;Ljava/util/Locale;)V

    invoke-interface {v1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1c
    check-cast v7, Lx7/a;

    const/16 v18, 0x0

    const/16 v19, 0x4

    const/4 v5, 0x0

    move/from16 v45, v6

    move-object v6, v7

    move-object v7, v1

    move/from16 v46, v8

    move/from16 v8, v18

    move-object/from16 v47, v9

    move/from16 v9, v19

    invoke-static/range {v3 .. v9}, Le0/b;->d([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)LV/w0;

    move-result-object v9

    invoke-static {v9}, LS/K;->c(LV/w0;)LS0/V;

    move-result-object v23

    move/from16 v3, v45

    if-ne v3, v0, :cond_1d

    const/4 v7, 0x1

    goto :goto_11

    :cond_1d
    const/4 v7, 0x0

    :goto_11
    invoke-interface {v1, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v7

    move-object/from16 v8, v47

    invoke-interface {v1, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    move/from16 v7, v46

    and-int/lit16 v3, v7, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_1e

    const/4 v3, 0x1

    goto :goto_12

    :cond_1e
    const/4 v3, 0x0

    :goto_12
    or-int/2addr v0, v3

    invoke-interface {v1, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v7

    const/high16 v4, 0x800000

    if-ne v3, v4, :cond_1f

    const/4 v3, 0x1

    goto :goto_13

    :cond_1f
    const/4 v3, 0x0

    :goto_13
    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v3, v7

    const/high16 v4, 0x100000

    if-ne v3, v4, :cond_20

    const/4 v3, 0x1

    goto :goto_14

    :cond_20
    const/4 v3, 0x0

    :goto_14
    or-int/2addr v0, v3

    invoke-interface {v1, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_22

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_21

    goto :goto_15

    :cond_21
    move/from16 v24, v7

    move-object/from16 v47, v8

    goto :goto_16

    :cond_22
    :goto_15
    new-instance v0, LS/K$d;

    move-object v3, v0

    move-object/from16 v4, p8

    move-object v5, v8

    move-object/from16 v6, p2

    move/from16 v24, v7

    move-object/from16 v7, p3

    move-object/from16 v47, v8

    move-object/from16 v8, p7

    move-object/from16 v16, v9

    move/from16 v9, p6

    move-object/from16 v10, p9

    move-object/from16 v11, v16

    invoke-direct/range {v3 .. v11}, LS/K$d;-><init>(LT/k;LV/w0;Lx7/l;LT/f;LS/L;ILjava/util/Locale;LV/w0;)V

    invoke-interface {v1, v0}, LV/n;->K(Ljava/lang/Object;)V

    :goto_16
    move-object v0, v3

    check-cast v0, Lx7/l;

    invoke-interface/range {v47 .. v47}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x1

    xor-int/2addr v3, v4

    if-eqz v3, :cond_23

    const/4 v3, 0x0

    int-to-float v5, v3

    invoke-static {v5}, LY0/i;->q(F)F

    move-result v3

    :goto_17
    move/from16 v20, v3

    goto :goto_18

    :cond_23
    sget v3, LS/K;->b:F

    goto :goto_17

    :goto_18
    const/16 v21, 0x7

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, p0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    move-object/from16 v5, v47

    invoke-interface {v1, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {v1}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_24

    sget-object v6, LV/n;->a:LV/n$a;

    invoke-virtual {v6}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_25

    :cond_24
    new-instance v7, LS/K$e;

    invoke-direct {v7, v5}, LS/K$e;-><init>(LV/w0;)V

    invoke-interface {v1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_25
    check-cast v7, Lx7/l;

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static {v3, v8, v7, v4, v6}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v18

    new-instance v3, LS/K$f;

    invoke-direct {v3, v5}, LS/K$f;-><init>(LV/w0;)V

    const/16 v6, 0x36

    const v7, -0x234914a6

    invoke-static {v7, v4, v3, v1, v6}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v28

    invoke-interface {v5}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, LS8/r;->s0(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v29, v3, 0x1

    new-instance v3, LS/W;

    move-object/from16 v30, v3

    invoke-direct {v3, v13}, LS/W;-><init>(LT/k;)V

    new-instance v32, LH/v;

    move-object/from16 v31, v32

    sget-object v34, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v3, LS0/y;->b:LS0/y$a;

    invoke-virtual {v3}, LS0/y$a;->d()I

    move-result v35

    sget-object v3, LS0/r;->b:LS0/r$a;

    invoke-virtual {v3}, LS0/r$a;->b()I

    move-result v36

    const/16 v40, 0x71

    const/16 v41, 0x0

    const/16 v33, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v32 .. v41}, LH/v;-><init>(ILjava/lang/Boolean;IILS0/O;Ljava/lang/Boolean;LT0/h;ILy7/k;)V

    invoke-virtual/range {p10 .. p10}, LS/M;->d()LS/i1;

    move-result-object v38

    shl-int/lit8 v3, v24, 0x6

    const/high16 v4, 0x1f80000

    and-int v40, v3, v4

    const/16 v42, 0x0

    const v43, 0x3d0f38

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x1

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const v41, 0xc30180

    move-object/from16 v16, v23

    move-object/from16 v17, v0

    move-object/from16 v22, p4

    move-object/from16 v23, p5

    move-object/from16 v39, v1

    invoke-static/range {v16 .. v43}, LS/y0;->a(LS0/V;Lx7/l;Landroidx/compose/ui/d;ZZLM0/P;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZLS0/g0;LH/v;LH/u;ZIILz/l;Lo0/e2;LS/i1;LV/n;IIII)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_26

    invoke-static {}, LV/q;->P()V

    :cond_26
    :goto_19
    invoke-interface {v1}, LV/n;->x()LV/e1;

    move-result-object v11

    if-eqz v11, :cond_27

    new-instance v10, LS/K$g;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object v13, v10

    move-object/from16 v10, p9

    move-object v14, v11

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object v15, v13

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, LS/K$g;-><init>(Landroidx/compose/ui/d;Ljava/lang/Long;Lx7/l;LT/f;Lx7/p;Lx7/p;ILS/L;LT/k;Ljava/util/Locale;LS/M;II)V

    invoke-interface {v14, v15}, LV/e1;->a(Lx7/p;)V

    :cond_27
    return-void
.end method

.method private static final c(LV/w0;)LS0/V;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LS0/V;

    return-object p0
.end method

.method private static final d(LV/w0;LS0/V;)V
    .locals 0

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic e(LV/w0;LS0/V;)V
    .locals 0

    invoke-static {p0, p1}, LS/K;->d(LV/w0;LS0/V;)V

    return-void
.end method
