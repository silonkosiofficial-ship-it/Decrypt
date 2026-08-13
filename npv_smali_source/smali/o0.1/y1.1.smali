.class final Lo0/y1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo0/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo0/y1;

    invoke-direct {v0}, Lo0/y1;-><init>()V

    sput-object v0, Lo0/y1;->a:Lo0/y1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/graphics/ColorSpace;D)D
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/y1;->j(Landroid/graphics/ColorSpace;D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic b(Lx7/l;D)D
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/y1;->f(Lx7/l;D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic c(Lx7/l;D)D
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/y1;->g(Lx7/l;D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic d(Landroid/graphics/ColorSpace;D)D
    .locals 0

    invoke-static {p0, p1, p2}, Lo0/y1;->i(Landroid/graphics/ColorSpace;D)D

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(Lp0/c;)Landroid/graphics/ColorSpace;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    sget-object v1, Lp0/g;->a:Lp0/g;

    invoke-virtual {v1}, Lp0/g;->w()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    invoke-static {}, Lo0/p1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lo0/r1;->a(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object v0

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v1}, Lp0/g;->e()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Lo0/K0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lp0/g;->f()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lo0/O0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lp0/g;->g()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {}, Lo0/P0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Lp0/g;->h()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Lo0/Q0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Lp0/g;->i()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-static {}, Lo0/q1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Lp0/g;->j()Lp0/c;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {}, Lo0/s1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_7
    invoke-virtual {v1}, Lp0/g;->k()Lp0/c;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, Lo0/t1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_8
    invoke-virtual {v1}, Lp0/g;->m()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, Lo0/D0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto :goto_0

    :cond_9
    invoke-virtual {v1}, Lp0/g;->n()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {}, Lo0/E0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v1}, Lp0/g;->o()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Lo0/F0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_b
    invoke-virtual {v1}, Lp0/g;->p()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-static {}, Lo0/G0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_c
    invoke-virtual {v1}, Lp0/g;->q()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-static {}, Lo0/H0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v1}, Lp0/g;->r()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static {}, Lo0/I0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_e
    invoke-virtual {v1}, Lp0/g;->u()Lp0/x;

    move-result-object v2

    invoke-static {v0, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-static {}, Lo0/J0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_f
    invoke-virtual {v1}, Lp0/g;->v()Lp0/x;

    move-result-object v1

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {}, Lo0/L0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v0

    goto/16 :goto_0

    :cond_10
    instance-of v1, v0, Lp0/x;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lp0/x;

    invoke-virtual {v1}, Lp0/x;->N()Lp0/z;

    move-result-object v2

    invoke-virtual {v2}, Lp0/z;->c()[F

    move-result-object v5

    invoke-virtual {v1}, Lp0/x;->L()Lp0/y;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {}, Lo0/j1;->a()V

    invoke-virtual {v2}, Lp0/y;->a()D

    move-result-wide v6

    invoke-virtual {v2}, Lp0/y;->b()D

    move-result-wide v8

    invoke-virtual {v2}, Lp0/y;->c()D

    move-result-wide v10

    invoke-virtual {v2}, Lp0/y;->d()D

    move-result-wide v12

    invoke-virtual {v2}, Lp0/y;->e()D

    move-result-wide v14

    invoke-virtual {v2}, Lp0/y;->f()D

    move-result-wide v16

    invoke-virtual {v2}, Lp0/y;->g()D

    move-result-wide v18

    invoke-static/range {v6 .. v19}, Lo0/C0;->a(DDDDDDD)Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    move-result-object v2

    goto :goto_1

    :cond_11
    const/4 v2, 0x0

    :goto_1
    invoke-static {}, Lo0/o1;->a()V

    if-eqz v2, :cond_12

    invoke-virtual/range {p0 .. p0}, Lp0/c;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lp0/x;->K()[F

    move-result-object v1

    invoke-static {v0, v1, v5, v2}, Lo0/N0;->a(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v0

    goto :goto_2

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lp0/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lp0/x;->K()[F

    move-result-object v4

    invoke-virtual {v1}, Lp0/x;->H()Lx7/l;

    move-result-object v2

    new-instance v6, Lo0/u1;

    invoke-direct {v6, v2}, Lo0/u1;-><init>(Lx7/l;)V

    invoke-virtual {v1}, Lp0/x;->D()Lx7/l;

    move-result-object v1

    new-instance v7, Lo0/v1;

    invoke-direct {v7, v1}, Lo0/v1;-><init>(Lx7/l;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp0/c;->d(I)F

    move-result v8

    invoke-virtual {v0, v1}, Lp0/c;->c(I)F

    move-result v9

    invoke-static/range {v3 .. v9}, Lo0/Y0;->a(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lo0/M0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace;

    move-result-object v0

    :goto_3
    return-object v0
.end method

.method private static final f(Lx7/l;D)D
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method private static final g(Lx7/l;D)D
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p0

    return-wide p0
.end method

.method public static final h(Landroid/graphics/ColorSpace;)Lp0/c;
    .locals 25

    .prologue
    move-object/from16 v0, p0

    invoke-static/range {p0 .. p0}, Lo0/R0;->a(Landroid/graphics/ColorSpace;)I

    move-result v1

    invoke-static {}, Lo0/p1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_1

    :cond_0
    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->w()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_1
    invoke-static {}, Lo0/K0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_2

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->e()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_2
    invoke-static {}, Lo0/O0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_3

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->f()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_3
    invoke-static {}, Lo0/P0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_4

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->g()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_4
    invoke-static {}, Lo0/Q0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_5

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->h()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_5
    invoke-static {}, Lo0/q1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_6

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->i()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_6
    invoke-static {}, Lo0/s1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_7

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->j()Lp0/c;

    move-result-object v0

    goto/16 :goto_3

    :cond_7
    invoke-static {}, Lo0/t1;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_8

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->k()Lp0/c;

    move-result-object v0

    goto/16 :goto_3

    :cond_8
    invoke-static {}, Lo0/D0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_9

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->m()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_9
    invoke-static {}, Lo0/E0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_a

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->n()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_a
    invoke-static {}, Lo0/F0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_b

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->o()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_b
    invoke-static {}, Lo0/G0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_c

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->p()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_c
    invoke-static {}, Lo0/H0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_d

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->q()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_d
    invoke-static {}, Lo0/I0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_e

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->r()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_e
    invoke-static {}, Lo0/J0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_f

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->u()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_f
    invoke-static {}, Lo0/L0;->a()Landroid/graphics/ColorSpace$Named;

    move-result-object v2

    invoke-static {v2}, Lo0/S0;->a(Landroid/graphics/ColorSpace$Named;)I

    move-result v2

    if-ne v1, v2, :cond_10

    sget-object v0, Lp0/g;->a:Lp0/g;

    invoke-virtual {v0}, Lp0/g;->v()Lp0/x;

    move-result-object v0

    goto/16 :goto_3

    :cond_10
    invoke-static/range {p0 .. p0}, Lo0/T0;->a(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v1

    invoke-static {v1}, Lo0/V0;->a(Landroid/graphics/ColorSpace$Rgb;)Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v2

    invoke-static {v2}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v2

    array-length v2, v2

    const/4 v3, 0x3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v3, :cond_11

    new-instance v2, Lp0/z;

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v3

    invoke-static {v3}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v3

    aget v3, v3, v5

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v6

    invoke-static {v6}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v6

    aget v4, v6, v4

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v6

    invoke-static {v6}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v6

    const/4 v7, 0x2

    aget v6, v6, v7

    invoke-direct {v2, v3, v4, v6}, Lp0/z;-><init>(FFF)V

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_11
    new-instance v2, Lp0/z;

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v3

    invoke-static {v3}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v3

    aget v3, v3, v5

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v6

    invoke-static {v6}, Lo0/W0;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v6

    aget v4, v6, v4

    invoke-direct {v2, v3, v4}, Lp0/z;-><init>(FF)V

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_12

    new-instance v2, Lp0/y;

    invoke-static {v1}, Lo0/X0;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v11

    invoke-static {v1}, Lo0/Z0;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v13

    invoke-static {v1}, Lo0/a1;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v15

    invoke-static {v1}, Lo0/b1;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v17

    invoke-static {v1}, Lo0/c1;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v19

    invoke-static {v1}, Lo0/d1;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v21

    invoke-static {v1}, Lo0/e1;->a(Landroid/graphics/ColorSpace$Rgb$TransferParameters;)D

    move-result-wide v23

    move-object v10, v2

    invoke-direct/range {v10 .. v24}, Lp0/y;-><init>(DDDDDDD)V

    move-object v15, v2

    goto :goto_2

    :cond_12
    const/4 v1, 0x0

    move-object v15, v1

    :goto_2
    new-instance v1, Lp0/x;

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v2

    invoke-static {v2}, Lo0/f1;->a(Landroid/graphics/ColorSpace$Rgb;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v2

    invoke-static {v2}, Lo0/g1;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v2

    invoke-static {v2}, Lo0/h1;->a(Landroid/graphics/ColorSpace$Rgb;)[F

    move-result-object v10

    new-instance v11, Lo0/w1;

    invoke-direct {v11, v0}, Lo0/w1;-><init>(Landroid/graphics/ColorSpace;)V

    new-instance v12, Lo0/x1;

    invoke-direct {v12, v0}, Lo0/x1;-><init>(Landroid/graphics/ColorSpace;)V

    invoke-static {v0, v5}, Lo0/i1;->a(Landroid/graphics/ColorSpace;I)F

    move-result v13

    invoke-static {v0, v5}, Lo0/k1;->a(Landroid/graphics/ColorSpace;I)F

    move-result v14

    invoke-static/range {p0 .. p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object v0

    invoke-static {v0}, Lo0/l1;->a(Landroid/graphics/ColorSpace$Rgb;)I

    move-result v16

    move-object v6, v1

    invoke-direct/range {v6 .. v16}, Lp0/x;-><init>(Ljava/lang/String;[FLp0/z;[FLp0/j;Lp0/j;FFLp0/y;I)V

    move-object v0, v1

    :goto_3
    return-object v0
.end method

.method private static final i(Landroid/graphics/ColorSpace;D)D
    .locals 0

    invoke-static {p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object p0

    invoke-static {p0}, Lo0/n1;->a(Landroid/graphics/ColorSpace$Rgb;)Ljava/util/function/DoubleUnaryOperator;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Ljava/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p0

    return-wide p0
.end method

.method private static final j(Landroid/graphics/ColorSpace;D)D
    .locals 0

    invoke-static {p0}, Lo0/U0;->a(Ljava/lang/Object;)Landroid/graphics/ColorSpace$Rgb;

    move-result-object p0

    invoke-static {p0}, Lo0/m1;->a(Landroid/graphics/ColorSpace$Rgb;)Ljava/util/function/DoubleUnaryOperator;

    move-result-object p0

    invoke-interface {p0, p1, p2}, Ljava/util/function/DoubleUnaryOperator;->applyAsDouble(D)D

    move-result-wide p0

    return-wide p0
.end method
