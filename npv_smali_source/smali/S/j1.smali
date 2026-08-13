.class public final LS/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS/j1;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS/j1;

    invoke-direct {v0}, LS/j1;-><init>()V

    sput-object v0, LS/j1;->a:LS/j1;

    const/16 v0, 0x38

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/j1;->b:F

    const/16 v0, 0x118

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/j1;->c:F

    const/4 v0, 0x1

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/j1;->d:F

    const/4 v1, 0x2

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/j1;->e:F

    sput v0, LS/j1;->f:F

    sput v1, LS/j1;->g:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic e(LS/j1;FFFFILjava/lang/Object;)LA/B;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    invoke-static {}, LT/A;->r()F

    move-result p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {}, LT/A;->r()F

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-static {}, LS/k1;->k()F

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, LS/k1;->k()F

    move-result p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LS/j1;->d(FFFF)LA/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LS/j1;FFFFILjava/lang/Object;)LA/B;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    invoke-static {}, LT/A;->r()F

    move-result p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {}, LT/A;->r()F

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-static {}, LT/A;->r()F

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    invoke-static {}, LT/A;->r()F

    move-result p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LS/j1;->f(FFFF)LA/B;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(LS/j1;FFFFILjava/lang/Object;)LA/B;
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    invoke-static {}, LT/A;->r()F

    move-result p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    invoke-static {}, LT/A;->q()F

    move-result p2

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    invoke-static {}, LT/A;->r()F

    move-result p3

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/4 p4, 0x0

    int-to-float p4, p4

    invoke-static {p4}, LY0/i;->q(F)F

    move-result p4

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LS/j1;->o(FFFF)LA/B;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFLV/n;II)V
    .locals 25

    .prologue
    move-object/from16 v12, p0

    move/from16 v8, p1

    move/from16 v9, p2

    move-object/from16 v10, p3

    move/from16 v11, p10

    move/from16 v13, p11

    const v0, -0x30cbc77a    # -3.0236032E9f

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v7

    and-int/lit8 v1, v13, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_2

    invoke-interface {v7, v8}, LV/n;->d(Z)Z

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
    and-int/lit8 v2, v13, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_5

    invoke-interface {v7, v9}, LV/n;->d(Z)Z

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
    and-int/lit8 v2, v13, 0x4

    if-eqz v2, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_8

    invoke-interface {v7, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/16 v2, 0x100

    goto :goto_4

    :cond_7
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_8
    :goto_5
    and-int/lit8 v2, v13, 0x8

    if-eqz v2, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v3, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v3, v11, 0xc00

    if-nez v3, :cond_9

    move-object/from16 v3, p4

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    const/16 v4, 0x800

    goto :goto_6

    :cond_b
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v1, v4

    :goto_7
    and-int/lit16 v4, v11, 0x6000

    if-nez v4, :cond_e

    and-int/lit8 v4, v13, 0x10

    if-nez v4, :cond_c

    move-object/from16 v4, p5

    invoke-interface {v7, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v5, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v4, p5

    :cond_d
    const/16 v5, 0x2000

    :goto_8
    or-int/2addr v1, v5

    goto :goto_9

    :cond_e
    move-object/from16 v4, p5

    :goto_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v11

    if-nez v5, :cond_11

    and-int/lit8 v5, v13, 0x20

    if-nez v5, :cond_f

    move-object/from16 v5, p6

    invoke-interface {v7, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    const/high16 v6, 0x20000

    goto :goto_a

    :cond_f
    move-object/from16 v5, p6

    :cond_10
    const/high16 v6, 0x10000

    :goto_a
    or-int/2addr v1, v6

    goto :goto_b

    :cond_11
    move-object/from16 v5, p6

    :goto_b
    const/high16 v6, 0x180000

    and-int/2addr v6, v11

    if-nez v6, :cond_14

    and-int/lit8 v6, v13, 0x40

    if-nez v6, :cond_12

    move/from16 v6, p7

    invoke-interface {v7, v6}, LV/n;->h(F)Z

    move-result v14

    if-eqz v14, :cond_13

    const/high16 v14, 0x100000

    goto :goto_c

    :cond_12
    move/from16 v6, p7

    :cond_13
    const/high16 v14, 0x80000

    :goto_c
    or-int/2addr v1, v14

    goto :goto_d

    :cond_14
    move/from16 v6, p7

    :goto_d
    const/high16 v14, 0xc00000

    and-int/2addr v14, v11

    if-nez v14, :cond_17

    and-int/lit16 v14, v13, 0x80

    if-nez v14, :cond_15

    move/from16 v14, p8

    invoke-interface {v7, v14}, LV/n;->h(F)Z

    move-result v15

    if-eqz v15, :cond_16

    const/high16 v15, 0x800000

    goto :goto_e

    :cond_15
    move/from16 v14, p8

    :cond_16
    const/high16 v15, 0x400000

    :goto_e
    or-int/2addr v1, v15

    goto :goto_f

    :cond_17
    move/from16 v14, p8

    :goto_f
    and-int/lit16 v15, v13, 0x100

    const/high16 v16, 0x6000000

    if-eqz v15, :cond_18

    or-int v1, v1, v16

    goto :goto_11

    :cond_18
    and-int v15, v11, v16

    if-nez v15, :cond_1a

    invoke-interface {v7, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_19

    const/high16 v15, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v15, 0x2000000

    :goto_10
    or-int/2addr v1, v15

    :cond_1a
    :goto_11
    const v15, 0x2492493

    and-int/2addr v15, v1

    const v0, 0x2492492

    if-ne v15, v0, :cond_1c

    invoke-interface {v7}, LV/n;->u()Z

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    :cond_1b
    invoke-interface {v7}, LV/n;->A()V

    move/from16 v22, v6

    move-object v8, v7

    move/from16 v23, v14

    move-object v6, v4

    move-object v7, v5

    move-object v5, v3

    goto/16 :goto_18

    :cond_1c
    :goto_12
    invoke-interface {v7}, LV/n;->q()V

    and-int/lit8 v0, v11, 0x1

    const v17, -0x380001

    const v18, -0x70001

    const v19, -0xe001

    const/4 v15, 0x6

    if-eqz v0, :cond_22

    invoke-interface {v7}, LV/n;->G()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_14

    :cond_1d
    invoke-interface {v7}, LV/n;->A()V

    and-int/lit8 v0, v13, 0x10

    if-eqz v0, :cond_1e

    and-int v1, v1, v19

    :cond_1e
    and-int/lit8 v0, v13, 0x20

    if-eqz v0, :cond_1f

    and-int v1, v1, v18

    :cond_1f
    and-int/lit8 v0, v13, 0x40

    if-eqz v0, :cond_20

    and-int v1, v1, v17

    :cond_20
    and-int/lit16 v0, v13, 0x80

    if-eqz v0, :cond_21

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_21
    move/from16 v22, v6

    move/from16 v23, v14

    move-object v6, v3

    :goto_13
    move-object/from16 v24, v5

    move-object v5, v4

    move-object/from16 v4, v24

    goto :goto_17

    :cond_22
    :goto_14
    if-eqz v2, :cond_23

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    goto :goto_15

    :cond_23
    move-object v0, v3

    :goto_15
    and-int/lit8 v2, v13, 0x10

    if-eqz v2, :cond_24

    shr-int/lit8 v2, v1, 0x18

    and-int/lit8 v2, v2, 0xe

    invoke-virtual {v12, v7, v2}, LS/j1;->c(LV/n;I)LS/i1;

    move-result-object v2

    and-int v1, v1, v19

    move-object v4, v2

    :cond_24
    and-int/lit8 v2, v13, 0x20

    if-eqz v2, :cond_25

    sget-object v2, LS/j1;->a:LS/j1;

    invoke-virtual {v2, v7, v15}, LS/j1;->l(LV/n;I)Lo0/e2;

    move-result-object v2

    and-int v1, v1, v18

    move-object v5, v2

    :cond_25
    and-int/lit8 v2, v13, 0x40

    if-eqz v2, :cond_26

    sget v2, LS/j1;->e:F

    and-int v1, v1, v17

    move v6, v2

    :cond_26
    and-int/lit16 v2, v13, 0x80

    if-eqz v2, :cond_27

    sget v2, LS/j1;->d:F

    const v3, -0x1c00001

    and-int/2addr v1, v3

    move/from16 v23, v2

    move/from16 v22, v6

    :goto_16
    move-object v6, v0

    goto :goto_13

    :cond_27
    move/from16 v22, v6

    move/from16 v23, v14

    goto :goto_16

    :goto_17
    invoke-interface {v7}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_28

    const/4 v0, -0x1

    const-string v2, "androidx.compose.material3.TextFieldDefaults.Container (TextFieldDefaults.kt:109)"

    const v3, -0x30cbc77a    # -3.0236032E9f

    invoke-static {v3, v1, v0, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_28
    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v10, v7, v0}, Lz/f;->a(Lz/j;LV/n;I)LV/G1;

    move-result-object v0

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v5, v8, v9, v0}, LS/i1;->a(ZZZ)J

    move-result-wide v0

    const/16 v2, 0x96

    const/4 v3, 0x0

    const/4 v14, 0x0

    invoke-static {v2, v3, v14, v15, v14}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v16

    const/16 v20, 0x30

    const/16 v21, 0xc

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide v14, v0

    move-object/from16 v19, v7

    invoke-static/range {v14 .. v21}, Lt/w;->a(JLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v0

    new-instance v1, LS/j1$a;

    invoke-direct {v1, v0}, LS/j1$a;-><init>(Ljava/lang/Object;)V

    new-instance v0, LS/j1$g;

    invoke-direct {v0, v1}, LS/j1$g;-><init>(Lx7/a;)V

    invoke-static {v6, v0, v4}, LT/A;->u(Landroidx/compose/ui/d;Lo0/B0;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v1

    move-object/from16 v0, p0

    move/from16 v2, p1

    move v14, v3

    move/from16 v3, p2

    move-object v15, v4

    move-object/from16 v4, p3

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move/from16 v6, v22

    move-object v8, v7

    move/from16 v7, v23

    invoke-virtual/range {v0 .. v7}, LS/j1;->n(Landroidx/compose/ui/d;ZZLz/j;LS/i1;FF)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, v8, v14}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_29

    invoke-static {}, LV/q;->P()V

    :cond_29
    move-object v7, v15

    move-object/from16 v6, v16

    move-object/from16 v5, v17

    :goto_18
    invoke-interface {v8}, LV/n;->x()LV/e1;

    move-result-object v14

    if-eqz v14, :cond_2a

    new-instance v15, LS/j1$b;

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v8, v22

    move/from16 v9, v23

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LS/j1$b;-><init>(LS/j1;ZZLz/j;Landroidx/compose/ui/d;LS/i1;Lo0/e2;FFII)V

    invoke-interface {v14, v15}, LV/e1;->a(Lx7/p;)V

    :cond_2a
    return-void
.end method

.method public final b(Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;LA/B;Lx7/p;LV/n;III)V
    .locals 42

    .prologue
    move-object/from16 v15, p0

    move/from16 v14, p20

    move/from16 v13, p21

    move/from16 v12, p22

    const v0, 0x11438ffc

    move-object/from16 v1, p19

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v0

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v14, 0x6

    move-object/from16 v4, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v14, 0x6

    move-object/from16 v4, p1

    if-nez v1, :cond_2

    invoke-interface {v0, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v14

    goto :goto_1

    :cond_2
    move v1, v14

    :goto_1
    and-int/lit8 v5, v12, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move-object/from16 v5, p2

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p2

    invoke-interface {v0, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_2

    :cond_5
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :goto_3
    and-int/lit8 v8, v12, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move/from16 v8, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v14, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p3

    invoke-interface {v0, v8}, LV/n;->d(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v1, v11

    :goto_5
    and-int/lit8 v11, v12, 0x8

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-eqz v11, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move/from16 v11, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v14, 0xc00

    if-nez v11, :cond_9

    move/from16 v11, p4

    invoke-interface {v0, v11}, LV/n;->d(Z)Z

    move-result v18

    if-eqz v18, :cond_b

    move/from16 v18, v17

    goto :goto_6

    :cond_b
    move/from16 v18, v16

    :goto_6
    or-int v1, v1, v18

    :goto_7
    and-int/lit8 v18, v12, 0x10

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-eqz v18, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v2, p5

    goto :goto_9

    :cond_d
    and-int/lit16 v2, v14, 0x6000

    if-nez v2, :cond_c

    move-object/from16 v2, p5

    invoke-interface {v0, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_e

    move/from16 v18, v20

    goto :goto_8

    :cond_e
    move/from16 v18, v19

    :goto_8
    or-int v1, v1, v18

    :goto_9
    and-int/lit8 v18, v12, 0x20

    const/high16 v21, 0x30000

    const/high16 v22, 0x10000

    if-eqz v18, :cond_f

    or-int v1, v1, v21

    move-object/from16 v7, p6

    goto :goto_b

    :cond_f
    and-int v18, v14, v21

    move-object/from16 v7, p6

    if-nez v18, :cond_11

    invoke-interface {v0, v7}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x20000

    goto :goto_a

    :cond_10
    move/from16 v23, v22

    :goto_a
    or-int v1, v1, v23

    :cond_11
    :goto_b
    and-int/lit8 v23, v12, 0x40

    const/high16 v24, 0x180000

    if-eqz v23, :cond_12

    or-int v1, v1, v24

    move/from16 v3, p7

    goto :goto_d

    :cond_12
    and-int v24, v14, v24

    move/from16 v3, p7

    if-nez v24, :cond_14

    invoke-interface {v0, v3}, LV/n;->d(Z)Z

    move-result v25

    if-eqz v25, :cond_13

    const/high16 v25, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v25, 0x80000

    :goto_c
    or-int v1, v1, v25

    :cond_14
    :goto_d
    and-int/lit16 v6, v12, 0x80

    const/high16 v26, 0xc00000

    if-eqz v6, :cond_15

    or-int v1, v1, v26

    move-object/from16 v9, p8

    goto :goto_f

    :cond_15
    and-int v27, v14, v26

    move-object/from16 v9, p8

    if-nez v27, :cond_17

    invoke-interface {v0, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_16

    const/high16 v28, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v28, 0x400000

    :goto_e
    or-int v1, v1, v28

    :cond_17
    :goto_f
    and-int/lit16 v10, v12, 0x100

    const/high16 v29, 0x6000000

    if-eqz v10, :cond_18

    or-int v1, v1, v29

    move-object/from16 v2, p9

    goto :goto_11

    :cond_18
    and-int v30, v14, v29

    move-object/from16 v2, p9

    if-nez v30, :cond_1a

    invoke-interface {v0, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_19

    const/high16 v30, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v30, 0x2000000

    :goto_10
    or-int v1, v1, v30

    :cond_1a
    :goto_11
    and-int/lit16 v2, v12, 0x200

    const/high16 v30, 0x30000000

    if-eqz v2, :cond_1b

    or-int v1, v1, v30

    move-object/from16 v3, p10

    goto :goto_13

    :cond_1b
    and-int v30, v14, v30

    move-object/from16 v3, p10

    if-nez v30, :cond_1d

    invoke-interface {v0, v3}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1c

    const/high16 v30, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v30, 0x10000000

    :goto_12
    or-int v1, v1, v30

    :cond_1d
    :goto_13
    and-int/lit16 v3, v12, 0x400

    if-eqz v3, :cond_1e

    or-int/lit8 v24, v13, 0x6

    move-object/from16 v4, p11

    goto :goto_15

    :cond_1e
    and-int/lit8 v30, v13, 0x6

    move-object/from16 v4, p11

    if-nez v30, :cond_20

    invoke-interface {v0, v4}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1f

    const/16 v24, 0x4

    goto :goto_14

    :cond_1f
    const/16 v24, 0x2

    :goto_14
    or-int v24, v13, v24

    goto :goto_15

    :cond_20
    move/from16 v24, v13

    :goto_15
    and-int/lit16 v4, v12, 0x800

    if-eqz v4, :cond_22

    or-int/lit8 v24, v24, 0x30

    :cond_21
    :goto_16
    move/from16 v5, v24

    goto :goto_18

    :cond_22
    and-int/lit8 v30, v13, 0x30

    move-object/from16 v5, p12

    if-nez v30, :cond_21

    invoke-interface {v0, v5}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_23

    const/16 v25, 0x20

    goto :goto_17

    :cond_23
    const/16 v25, 0x10

    :goto_17
    or-int v24, v24, v25

    goto :goto_16

    :goto_18
    and-int/lit16 v7, v12, 0x1000

    if-eqz v7, :cond_25

    or-int/lit16 v5, v5, 0x180

    :cond_24
    move-object/from16 v8, p13

    goto :goto_1a

    :cond_25
    and-int/lit16 v8, v13, 0x180

    if-nez v8, :cond_24

    move-object/from16 v8, p13

    invoke-interface {v0, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_26

    const/16 v27, 0x100

    goto :goto_19

    :cond_26
    const/16 v27, 0x80

    :goto_19
    or-int v5, v5, v27

    :goto_1a
    and-int/lit16 v8, v12, 0x2000

    if-eqz v8, :cond_28

    or-int/lit16 v5, v5, 0xc00

    :cond_27
    move-object/from16 v9, p14

    goto :goto_1b

    :cond_28
    and-int/lit16 v9, v13, 0xc00

    if-nez v9, :cond_27

    move-object/from16 v9, p14

    invoke-interface {v0, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_29

    move/from16 v16, v17

    :cond_29
    or-int v5, v5, v16

    :goto_1b
    and-int/lit16 v9, v13, 0x6000

    if-nez v9, :cond_2c

    and-int/lit16 v9, v12, 0x4000

    if-nez v9, :cond_2a

    move-object/from16 v9, p15

    invoke-interface {v0, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2b

    move/from16 v19, v20

    goto :goto_1c

    :cond_2a
    move-object/from16 v9, p15

    :cond_2b
    :goto_1c
    or-int v5, v5, v19

    goto :goto_1d

    :cond_2c
    move-object/from16 v9, p15

    :goto_1d
    and-int v16, v13, v21

    if-nez v16, :cond_2e

    const v16, 0x8000

    and-int v16, v12, v16

    move-object/from16 v9, p16

    if-nez v16, :cond_2d

    invoke-interface {v0, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2d

    const/high16 v16, 0x20000

    goto :goto_1e

    :cond_2d
    move/from16 v16, v22

    :goto_1e
    or-int v5, v5, v16

    goto :goto_1f

    :cond_2e
    move-object/from16 v9, p16

    :goto_1f
    const/high16 v16, 0x180000

    and-int v16, v13, v16

    if-nez v16, :cond_30

    and-int v16, v12, v22

    move-object/from16 v9, p17

    if-nez v16, :cond_2f

    invoke-interface {v0, v9}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2f

    const/high16 v16, 0x100000

    goto :goto_20

    :cond_2f
    const/high16 v16, 0x80000

    :goto_20
    or-int v5, v5, v16

    goto :goto_21

    :cond_30
    move-object/from16 v9, p17

    :goto_21
    const/high16 v16, 0x20000

    and-int v16, v12, v16

    if-eqz v16, :cond_31

    or-int v5, v5, v26

    move-object/from16 v9, p18

    goto :goto_23

    :cond_31
    and-int v17, v13, v26

    move-object/from16 v9, p18

    if-nez v17, :cond_33

    invoke-interface {v0, v9}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_32

    const/high16 v17, 0x800000

    goto :goto_22

    :cond_32
    const/high16 v17, 0x400000

    :goto_22
    or-int v5, v5, v17

    :cond_33
    :goto_23
    const/high16 v17, 0x40000

    and-int v17, v12, v17

    if-eqz v17, :cond_34

    or-int v5, v5, v29

    goto :goto_25

    :cond_34
    and-int v17, v13, v29

    if-nez v17, :cond_36

    invoke-interface {v0, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_35

    const/high16 v17, 0x4000000

    goto :goto_24

    :cond_35
    const/high16 v17, 0x2000000

    :goto_24
    or-int v5, v5, v17

    :cond_36
    :goto_25
    const v17, 0x12492493

    and-int v9, v1, v17

    const v11, 0x12492492

    if-ne v9, v11, :cond_38

    const v9, 0x2492493

    and-int/2addr v9, v5

    const v11, 0x2492492

    if-ne v9, v11, :cond_38

    invoke-interface {v0}, LV/n;->u()Z

    move-result v9

    if-nez v9, :cond_37

    goto :goto_26

    :cond_37
    invoke-interface {v0}, LV/n;->A()V

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v18, p16

    move-object/from16 v38, p17

    move-object/from16 v19, p18

    goto/16 :goto_36

    :cond_38
    :goto_26
    invoke-interface {v0}, LV/n;->q()V

    and-int/lit8 v9, v14, 0x1

    const/4 v11, 0x6

    if-eqz v9, :cond_3d

    invoke-interface {v0}, LV/n;->G()Z

    move-result v9

    if-eqz v9, :cond_39

    goto :goto_27

    :cond_39
    invoke-interface {v0}, LV/n;->A()V

    and-int/lit16 v2, v12, 0x4000

    if-eqz v2, :cond_3a

    const v2, -0xe001

    and-int/2addr v5, v2

    :cond_3a
    const v2, 0x8000

    and-int/2addr v2, v12

    if-eqz v2, :cond_3b

    const v2, -0x70001

    and-int/2addr v5, v2

    :cond_3b
    and-int v2, v12, v22

    if-eqz v2, :cond_3c

    const v2, -0x380001

    and-int/2addr v5, v2

    :cond_3c
    move/from16 v9, p7

    move-object/from16 v6, p8

    move-object/from16 v10, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v7, p13

    move-object/from16 p7, p15

    move-object/from16 v11, p16

    move-object/from16 v38, p17

    move-object/from16 v39, p18

    move v8, v5

    move-object/from16 v5, p14

    goto/16 :goto_35

    :cond_3d
    :goto_27
    if-eqz v23, :cond_3e

    const/4 v9, 0x0

    goto :goto_28

    :cond_3e
    move/from16 v9, p7

    :goto_28
    const/16 v17, 0x0

    if-eqz v6, :cond_3f

    move-object/from16 v6, v17

    goto :goto_29

    :cond_3f
    move-object/from16 v6, p8

    :goto_29
    if-eqz v10, :cond_40

    move-object/from16 v10, v17

    goto :goto_2a

    :cond_40
    move-object/from16 v10, p9

    :goto_2a
    if-eqz v2, :cond_41

    move-object/from16 v2, v17

    goto :goto_2b

    :cond_41
    move-object/from16 v2, p10

    :goto_2b
    if-eqz v3, :cond_42

    move-object/from16 v3, v17

    goto :goto_2c

    :cond_42
    move-object/from16 v3, p11

    :goto_2c
    if-eqz v4, :cond_43

    move-object/from16 v4, v17

    goto :goto_2d

    :cond_43
    move-object/from16 v4, p12

    :goto_2d
    if-eqz v7, :cond_44

    move-object/from16 v7, v17

    goto :goto_2e

    :cond_44
    move-object/from16 v7, p13

    :goto_2e
    if-eqz v8, :cond_45

    goto :goto_2f

    :cond_45
    move-object/from16 v17, p14

    :goto_2f
    and-int/lit16 v8, v12, 0x4000

    if-eqz v8, :cond_46

    sget-object v8, LS/j1;->a:LS/j1;

    invoke-virtual {v8, v0, v11}, LS/j1;->l(LV/n;I)Lo0/e2;

    move-result-object v8

    const v18, -0xe001

    and-int v5, v5, v18

    goto :goto_30

    :cond_46
    move-object/from16 v8, p15

    :goto_30
    const v18, 0x8000

    and-int v18, v12, v18

    if-eqz v18, :cond_47

    shr-int/lit8 v18, v5, 0x18

    and-int/lit8 v11, v18, 0xe

    invoke-virtual {v15, v0, v11}, LS/j1;->c(LV/n;I)LS/i1;

    move-result-object v11

    const v18, -0x70001

    and-int v5, v5, v18

    goto :goto_31

    :cond_47
    move-object/from16 v11, p16

    :goto_31
    and-int v18, v12, v22

    if-eqz v18, :cond_49

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p7, p0

    move/from16 p8, v20

    move/from16 p9, v21

    move/from16 p10, v22

    move/from16 p11, v23

    move/from16 p12, v18

    move-object/from16 p13, v19

    if-nez v6, :cond_48

    invoke-static/range {p7 .. p13}, LS/j1;->g(LS/j1;FFFFILjava/lang/Object;)LA/B;

    move-result-object v18

    goto :goto_32

    :cond_48
    invoke-static/range {p7 .. p13}, LS/j1;->e(LS/j1;FFFFILjava/lang/Object;)LA/B;

    move-result-object v18

    :goto_32
    const v19, -0x380001

    and-int v5, v5, v19

    goto :goto_33

    :cond_49
    move-object/from16 v18, p17

    :goto_33
    if-eqz v16, :cond_4a

    move-object/from16 v16, v2

    new-instance v2, LS/j1$c;

    move-object/from16 p7, v2

    move/from16 p8, p3

    move/from16 p9, v9

    move-object/from16 p10, p6

    move-object/from16 p11, v11

    move-object/from16 p12, v8

    invoke-direct/range {p7 .. p12}, LS/j1$c;-><init>(ZZLz/j;LS/i1;Lo0/e2;)V

    move-object/from16 p7, v3

    const/16 v3, 0x36

    move-object/from16 p8, v4

    const v4, -0x19f590cf

    move/from16 p9, v5

    const/4 v5, 0x1

    invoke-static {v4, v5, v2, v0, v3}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v2

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move-object/from16 v39, v2

    move-object/from16 p7, v8

    move-object/from16 v2, v16

    :goto_34
    move-object/from16 v5, v17

    move-object/from16 v38, v18

    move/from16 v8, p9

    goto :goto_35

    :cond_4a
    move-object/from16 v16, v2

    move-object/from16 p7, v3

    move-object/from16 p8, v4

    move/from16 p9, v5

    move-object/from16 v39, p18

    move-object/from16 p7, v8

    goto :goto_34

    :goto_35
    invoke-interface {v0}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v16

    if-eqz v16, :cond_4b

    const v12, 0x11438ffc

    const-string v13, "androidx.compose.material3.TextFieldDefaults.DecorationBox (TextFieldDefaults.kt:276)"

    invoke-static {v12, v1, v8, v13}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4b
    sget-object v16, LT/G;->C:LT/G;

    shl-int/lit8 v12, v1, 0x3

    and-int/lit8 v13, v12, 0x70

    const/16 v17, 0x6

    or-int/lit8 v13, v13, 0x6

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v12, v13

    shr-int/lit8 v13, v1, 0x3

    and-int/lit16 v14, v13, 0x1c00

    or-int/2addr v12, v14

    shr-int/lit8 v14, v1, 0x9

    const v17, 0xe000

    and-int v17, v14, v17

    or-int v12, v12, v17

    const/high16 v17, 0x70000

    and-int v17, v14, v17

    or-int v12, v12, v17

    const/high16 v17, 0x380000

    and-int v17, v14, v17

    or-int v12, v12, v17

    shl-int/lit8 v17, v8, 0x15

    const/high16 v18, 0x1c00000

    and-int v18, v17, v18

    or-int v12, v12, v18

    const/high16 v18, 0xe000000

    and-int v18, v17, v18

    or-int v12, v12, v18

    const/high16 v18, 0x70000000

    and-int v17, v17, v18

    or-int v35, v12, v17

    shr-int/lit8 v12, v8, 0x9

    and-int/lit8 v12, v12, 0xe

    shr-int/lit8 v17, v1, 0x6

    and-int/lit8 v17, v17, 0x70

    or-int v12, v12, v17

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v1, v12

    and-int/lit16 v12, v14, 0x1c00

    or-int/2addr v1, v12

    const v12, 0xe000

    and-int/2addr v12, v13

    or-int/2addr v1, v12

    shr-int/lit8 v12, v8, 0x3

    const/high16 v13, 0x70000

    and-int/2addr v12, v13

    or-int/2addr v1, v12

    const/high16 v12, 0x380000

    shl-int/lit8 v13, v8, 0x3

    and-int/2addr v12, v13

    or-int/2addr v1, v12

    const/high16 v12, 0x1c00000

    and-int/2addr v8, v12

    or-int v36, v1, v8

    const/16 v37, 0x0

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v19, p5

    move-object/from16 v20, v6

    move-object/from16 v21, v10

    move-object/from16 v22, v2

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move-object/from16 v25, v7

    move-object/from16 v26, v5

    move/from16 v27, p4

    move/from16 v28, p3

    move/from16 v29, v9

    move-object/from16 v30, p6

    move-object/from16 v31, v38

    move-object/from16 v32, v11

    move-object/from16 v33, v39

    move-object/from16 v34, v0

    invoke-static/range {v16 .. v37}, LT/A;->a(LT/G;Ljava/lang/String;Lx7/p;LS0/g0;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;ZZZLz/j;LA/B;LS/i1;Lx7/p;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_4c

    invoke-static {}, LV/q;->P()V

    :cond_4c
    move-object/from16 v17, p7

    move-object v12, v3

    move-object v13, v4

    move-object/from16 v16, v5

    move-object v14, v7

    move v8, v9

    move-object/from16 v18, v11

    move-object/from16 v19, v39

    move-object v11, v2

    move-object v9, v6

    :goto_36
    invoke-interface {v0}, LV/n;->x()LV/e1;

    move-result-object v7

    if-eqz v7, :cond_4d

    new-instance v6, LS/j1$d;

    move-object v0, v6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v40, v6

    move-object/from16 v6, p5

    move-object/from16 v41, v7

    move-object/from16 v7, p6

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v38

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    invoke-direct/range {v0 .. v22}, LS/j1$d;-><init>(LS/j1;Ljava/lang/String;Lx7/p;ZZLS0/g0;Lz/j;ZLx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lx7/p;Lo0/e2;LS/i1;LA/B;Lx7/p;III)V

    move-object/from16 v1, v40

    move-object/from16 v0, v41

    invoke-interface {v0, v1}, LV/e1;->a(Lx7/p;)V

    :cond_4d
    return-void
.end method

.method public final c(LV/n;I)LS/i1;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)"

    const v2, 0x3193361c

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object v0, LS/o0;->a:LS/o0;

    const/4 v1, 0x6

    invoke-virtual {v0, p1, v1}, LS/o0;->a(LV/n;I)LS/z;

    move-result-object v0

    shl-int/lit8 p2, p2, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-virtual {p0, v0, p1, p2}, LS/j1;->h(LS/z;LV/n;I)LS/i1;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final d(FFFF)LA/B;
    .locals 0

    invoke-static {p1, p3, p2, p4}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object p1

    return-object p1
.end method

.method public final f(FFFF)LA/B;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object p1

    return-object p1
.end method

.method public final h(LS/z;LV/n;I)LS/i1;
    .locals 94

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)"

    const v4, 0x4ffcd785    # 8.4839654E9f

    move/from16 v5, p3

    invoke-static {v4, v5, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, LS/z;->p()LS/i1;

    move-result-object v2

    const v3, 0x19d4a8d

    invoke-interface {v1, v3}, LV/n;->T(I)V

    if-nez v2, :cond_1

    new-instance v2, LS/i1;

    move-object v4, v2

    sget-object v3, LU/m;->a:LU/m;

    invoke-virtual {v3}, LU/m;->y()LU/e;

    move-result-object v5

    invoke-static {v0, v5}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v5

    invoke-virtual {v3}, LU/m;->D()LU/e;

    move-result-object v7

    invoke-static {v0, v7}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v7

    invoke-virtual {v3}, LU/m;->g()LU/e;

    move-result-object v9

    invoke-static {v0, v9}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v10

    invoke-virtual {v3}, LU/m;->h()F

    move-result v12

    const/16 v16, 0xe

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v3}, LU/m;->s()LU/e;

    move-result-object v11

    invoke-static {v0, v11}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v11

    invoke-virtual {v3}, LU/m;->c()LU/e;

    move-result-object v13

    invoke-static {v0, v13}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v13

    invoke-virtual {v3}, LU/m;->c()LU/e;

    move-result-object v15

    invoke-static {v0, v15}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v15

    move-object/from16 p3, v2

    invoke-virtual {v3}, LU/m;->c()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v17

    invoke-virtual {v3}, LU/m;->c()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v19

    invoke-virtual {v3}, LU/m;->b()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v21

    invoke-virtual {v3}, LU/m;->r()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v23

    invoke-static {}, LN/K;->b()LV/O0;

    move-result-object v2

    invoke-interface {v1, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v2

    check-cast v25, LN/J;

    invoke-virtual {v3}, LU/m;->x()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v26

    invoke-virtual {v3}, LU/m;->a()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v28

    invoke-virtual {v3}, LU/m;->e()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v30

    invoke-virtual {v3}, LU/m;->f()F

    move-result v32

    const/16 v36, 0xe

    const/16 v37, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-static/range {v30 .. v37}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v30

    invoke-virtual {v3}, LU/m;->q()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v32

    invoke-virtual {v3}, LU/m;->A()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v34

    invoke-virtual {v3}, LU/m;->I()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v36

    invoke-virtual {v3}, LU/m;->k()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v38

    invoke-virtual {v3}, LU/m;->l()F

    move-result v40

    const/16 v44, 0xe

    const/16 v45, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    invoke-static/range {v38 .. v45}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v38

    invoke-virtual {v3}, LU/m;->u()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v40

    invoke-virtual {v3}, LU/m;->C()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v42

    invoke-virtual {v3}, LU/m;->K()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v44

    invoke-virtual {v3}, LU/m;->o()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v46

    invoke-virtual {v3}, LU/m;->p()F

    move-result v48

    const/16 v52, 0xe

    const/16 v53, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    invoke-static/range {v46 .. v53}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v46

    invoke-virtual {v3}, LU/m;->w()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v48

    invoke-virtual {v3}, LU/m;->z()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v50

    invoke-virtual {v3}, LU/m;->H()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v52

    invoke-virtual {v3}, LU/m;->i()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v54

    invoke-virtual {v3}, LU/m;->j()F

    move-result v56

    const/16 v60, 0xe

    const/16 v61, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    invoke-static/range {v54 .. v61}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v54

    invoke-virtual {v3}, LU/m;->t()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v56

    invoke-virtual {v3}, LU/m;->E()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v58

    invoke-virtual {v3}, LU/m;->E()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v60

    invoke-virtual {v3}, LU/m;->g()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v62

    invoke-virtual {v3}, LU/m;->h()F

    move-result v64

    const/16 v68, 0xe

    const/16 v69, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    invoke-static/range {v62 .. v69}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v62

    invoke-virtual {v3}, LU/m;->E()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v64

    invoke-virtual {v3}, LU/m;->B()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v66

    invoke-virtual {v3}, LU/m;->J()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v68

    invoke-virtual {v3}, LU/m;->m()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v70

    invoke-virtual {v3}, LU/m;->n()F

    move-result v72

    const/16 v76, 0xe

    const/16 v77, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v75, 0x0

    invoke-static/range {v70 .. v77}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v70

    invoke-virtual {v3}, LU/m;->v()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v72

    invoke-virtual {v3}, LU/m;->F()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v74

    invoke-virtual {v3}, LU/m;->F()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v76

    invoke-virtual {v3}, LU/m;->F()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v78

    invoke-virtual {v3}, LU/m;->h()F

    move-result v80

    const/16 v84, 0xe

    const/16 v85, 0x0

    const/16 v81, 0x0

    const/16 v82, 0x0

    const/16 v83, 0x0

    invoke-static/range {v78 .. v85}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v78

    invoke-virtual {v3}, LU/m;->F()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v80

    invoke-virtual {v3}, LU/m;->G()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v82

    invoke-virtual {v3}, LU/m;->G()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v84

    invoke-virtual {v3}, LU/m;->G()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v86

    invoke-virtual {v3}, LU/m;->h()F

    move-result v88

    const/16 v92, 0xe

    const/16 v93, 0x0

    const/16 v89, 0x0

    const/16 v90, 0x0

    const/16 v91, 0x0

    invoke-static/range {v86 .. v93}, Lo0/y0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v86

    invoke-virtual {v3}, LU/m;->G()LU/e;

    move-result-object v2

    invoke-static {v0, v2}, LS/A;->f(LS/z;LU/e;)J

    move-result-wide v88

    const/16 v90, 0x0

    invoke-direct/range {v4 .. v90}, LS/i1;-><init>(JJJJJJJJJJLN/J;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLy7/k;)V

    move-object/from16 v2, p3

    invoke-virtual {v0, v2}, LS/z;->o0(LS/i1;)V

    :cond_1
    invoke-interface/range {p2 .. p2}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-object v2
.end method

.method public final i()F
    .locals 1

    sget v0, LS/j1;->e:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, LS/j1;->b:F

    return v0
.end method

.method public final k()F
    .locals 1

    sget v0, LS/j1;->c:F

    return v0
.end method

.method public final l(LV/n;I)Lo0/e2;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)"

    const v2, -0x73b64e63

    invoke-static {v2, p2, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LU/m;->a:LU/m;

    invoke-virtual {p2}, LU/m;->d()LU/z;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object p1

    invoke-static {}, LV/q;->H()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LV/q;->P()V

    :cond_1
    return-object p1
.end method

.method public final m()F
    .locals 1

    sget v0, LS/j1;->d:F

    return v0
.end method

.method public final n(Landroidx/compose/ui/d;ZZLz/j;LS/i1;FF)Landroidx/compose/ui/d;
    .locals 9

    .prologue
    invoke-static {}, Landroidx/compose/ui/platform/E0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LS/j1$f;

    move-object v1, v0

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v1 .. v7}, LS/j1$f;-><init>(ZZLz/j;LS/i1;FF)V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object v0

    :goto_0
    new-instance v8, LS/j1$e;

    move-object v1, v8

    move-object v2, p4

    move v3, p2

    move v4, p3

    move-object v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v1 .. v7}, LS/j1$e;-><init>(Lz/j;ZZLS/i1;FF)V

    move-object v1, p1

    invoke-static {p1, v0, v8}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object v0

    return-object v0
.end method

.method public final o(FFFF)LA/B;
    .locals 0

    invoke-static {p1, p2, p3, p4}, Landroidx/compose/foundation/layout/m;->d(FFFF)LA/B;

    move-result-object p1

    return-object p1
.end method
