.class public abstract LS/q1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F

.field private static final j:Lr/l;

.field private static final k:Lr/l;

.field private static final l:Lr/l;

.field private static final m:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/16 v0, 0x65

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->a:F

    const/16 v0, 0x45

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->b:F

    const/16 v0, 0x24

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->c:F

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/q1;->d:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/q1;->e:F

    const/4 v1, 0x7

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    sput v1, LS/q1;->f:F

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->g:F

    const/16 v0, 0x4a

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->h:F

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->i:F

    const/4 v0, 0x0

    const/16 v1, 0xc

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    invoke-static {v2}, Lr/m;->a([I)Lr/l;

    move-result-object v2

    sput-object v2, LS/q1;->j:Lr/l;

    new-array v2, v1, [I

    fill-array-data v2, :array_1

    invoke-static {v2}, Lr/m;->a([I)Lr/l;

    move-result-object v2

    sput-object v2, LS/q1;->k:Lr/l;

    new-instance v3, Lr/B;

    invoke-virtual {v2}, Lr/l;->b()I

    move-result v4

    invoke-direct {v3, v4}, Lr/B;-><init>(I)V

    iget-object v4, v2, Lr/l;->a:[I

    iget v2, v2, Lr/l;->b:I

    :goto_0
    if-ge v0, v2, :cond_0

    aget v5, v4, v0

    rem-int/2addr v5, v1

    add-int/2addr v5, v1

    invoke-virtual {v3, v5}, Lr/B;->g(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sput-object v3, LS/q1;->l:Lr/l;

    int-to-float v0, v1

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    sput v0, LS/q1;->m:F

    return-void

    :array_0
    .array-data 4
        0x0
        0x5
        0xa
        0xf
        0x14
        0x19
        0x1e
        0x23
        0x28
        0x2d
        0x32
        0x37
    .end array-data

    :array_1
    .array-data 4
        0xc
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
    .end array-data
.end method

.method public static final synthetic A(LV/w0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LS/q1;->h(LV/w0;J)V

    return-void
.end method

.method public static final synthetic B(Landroidx/compose/ui/d;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2}, LS/q1;->i(Landroidx/compose/ui/d;LV/n;I)V

    return-void
.end method

.method public static final synthetic C(LS/t1;LS/o1;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/q1;->j(LS/t1;LS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic D(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LS/q1;->k(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic E(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, LS/q1;->m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V

    return-void
.end method

.method public static final synthetic F(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, LS/q1;->p(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic G(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p6}, LS/q1;->q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V

    return-void
.end method

.method public static final synthetic H(LS/t1;LS/o1;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/q1;->r(LS/t1;LS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic I(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LS/q1;->s(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic J(FF)F
    .locals 0

    invoke-static {p0, p1}, LS/q1;->T(FF)F

    move-result p0

    return p0
.end method

.method public static final synthetic K()F
    .locals 1

    sget v0, LS/q1;->e:F

    return v0
.end method

.method public static final synthetic L()Lr/l;
    .locals 1

    sget-object v0, LS/q1;->l:Lr/l;

    return-object v0
.end method

.method public static final synthetic M()Lr/l;
    .locals 1

    sget-object v0, LS/q1;->k:Lr/l;

    return-object v0
.end method

.method public static final synthetic N()F
    .locals 1

    sget v0, LS/q1;->b:F

    return v0
.end method

.method public static final synthetic O()F
    .locals 1

    sget v0, LS/q1;->h:F

    return v0
.end method

.method public static final synthetic P()Lr/l;
    .locals 1

    sget-object v0, LS/q1;->j:Lr/l;

    return-object v0
.end method

.method public static final synthetic Q()F
    .locals 1

    sget v0, LS/q1;->a:F

    return v0
.end method

.method public static final synthetic R(LS/t1;FFFJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, LS/q1;->Y(LS/t1;FFFJ)V

    return-void
.end method

.method public static final synthetic S(LS/c;FFFZJLm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-static/range {p0 .. p7}, LS/q1;->a0(LS/c;FFFZJLm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final T(FF)F
    .locals 2

    .prologue
    float-to-double v0, p0

    float-to-double p0, p1

    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p0

    double-to-float p0, p0

    const p1, 0x3fc90fdb

    sub-float/2addr p0, p1

    const/4 p1, 0x0

    cmpg-float p1, p0, p1

    if-gez p1, :cond_0

    const p1, 0x40c90fdb

    add-float/2addr p0, p1

    :cond_0
    return p0
.end method

.method private static final U(FFII)F
    .locals 2

    int-to-float p2, p2

    sub-float/2addr p2, p0

    int-to-float p0, p3

    sub-float/2addr p0, p1

    float-to-double p1, p2

    float-to-double v0, p0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide p0

    double-to-float p0, p0

    return p0
.end method

.method private static final V(Landroidx/compose/ui/d;LS/c;LS/o1;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, LS/q1$G;

    invoke-direct {v0, p1, p2}, LS/q1$G;-><init>(LS/c;LS/o1;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/b;->d(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final W(LS/t1;)I
    .locals 2

    .prologue
    invoke-interface {p0}, LS/t1;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, LS/t1;->b()I

    move-result p0

    rem-int/lit8 p0, p0, 0x18

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LS/t1;->b()I

    move-result v0

    const/16 v1, 0xc

    rem-int/2addr v0, v1

    if-nez v0, :cond_1

    move p0, v1

    goto :goto_0

    :cond_1
    invoke-interface {p0}, LS/t1;->i()Z

    move-result v0

    invoke-interface {p0}, LS/t1;->b()I

    move-result p0

    if-eqz v0, :cond_2

    sub-int/2addr p0, v1

    :cond_2
    :goto_0
    return p0
.end method

.method public static final X(LS/c;)J
    .locals 6

    .prologue
    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->g()F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-virtual {p0}, LS/c;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LS/c;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, LS/c;->g()I

    move-result v3

    sget-object v4, LS/s1;->b:LS/s1$a;

    invoke-virtual {v4}, LS/s1$a;->a()I

    move-result v4

    invoke-static {v3, v4}, LS/s1;->f(II)Z

    move-result v3

    if-eqz v3, :cond_0

    sget v3, LS/q1;->b:F

    goto :goto_0

    :cond_0
    sget v3, LS/q1;->a:F

    :goto_0
    sub-float/2addr v3, v1

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    add-float/2addr v3, v1

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v1

    invoke-virtual {p0}, LS/c;->v()F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    invoke-virtual {v0}, LU/E;->b()F

    move-result v4

    div-float/2addr v4, v2

    invoke-static {v4}, LY0/i;->q(F)F

    move-result v4

    add-float/2addr v3, v4

    invoke-static {v3}, LY0/i;->q(F)F

    move-result v3

    invoke-virtual {p0}, LS/c;->v()F

    move-result p0

    float-to-double v4, p0

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float p0, v4

    mul-float/2addr v1, p0

    invoke-static {v1}, LY0/i;->q(F)F

    move-result p0

    invoke-virtual {v0}, LU/E;->b()F

    move-result v0

    div-float/2addr v0, v2

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    add-float/2addr p0, v0

    invoke-static {p0}, LY0/i;->q(F)F

    move-result p0

    invoke-static {v3, p0}, LY0/j;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final Y(LS/t1;FFFJ)V
    .locals 2

    .prologue
    invoke-interface {p0}, LS/t1;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, LS/t1;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p4, p5}, LY0/p;->h(J)I

    move-result v0

    invoke-static {p4, p5}, LY0/p;->i(J)I

    move-result p4

    invoke-static {p1, p2, v0, p4}, LS/q1;->U(FFII)F

    move-result p1

    cmpg-float p1, p1, p3

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, LS/t1;->c(Z)V

    :cond_1
    return-void
.end method

.method public static final Z(IZILV/n;I)Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v0, 0x0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1914)"

    const v3, 0xb93d3b4

    invoke-static {v3, p4, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p4, LS/s1;->b:LS/s1$a;

    invoke-virtual {p4}, LS/s1$a;->b()I

    move-result p4

    invoke-static {p0, p4}, LS/s1;->f(II)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, LT/x;->a:LT/x$a;

    sget p0, LS/C0;->H:I

    :goto_0
    invoke-static {p0}, LT/x;->a(I)I

    move-result p0

    goto :goto_1

    :cond_1
    sget-object p0, LT/x;->a:LT/x$a;

    if-eqz p1, :cond_2

    sget p0, LS/C0;->D:I

    goto :goto_0

    :cond_2
    sget p0, LS/C0;->F:I

    goto :goto_0

    :goto_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v0

    invoke-static {p0, p2, p3, v0}, LT/y;->b(I[Ljava/lang/Object;LV/n;I)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object p0
.end method

.method private static final a(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V
    .locals 8

    .prologue
    const v0, 0x5c474950

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_2
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LV/n;->h(F)Z

    move-result v3

    if-eqz v3, :cond_4

    move v3, v4

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v3, p4, 0x180

    if-nez v3, :cond_8

    invoke-interface {p3, p2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    const/16 v3, 0x100

    goto :goto_4

    :cond_7
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v2, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v2, 0x93

    const/16 v5, 0x92

    if-ne v3, v5, :cond_b

    invoke-interface {p3}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LV/n;->A()V

    :cond_a
    :goto_6
    move-object v2, p0

    goto/16 :goto_a

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_c
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const-string v3, "androidx.compose.material3.CircularLayout (TimePicker.kt:1870)"

    invoke-static {v0, v2, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_d
    and-int/lit8 v0, v2, 0x70

    const/4 v1, 0x0

    if-ne v0, v4, :cond_e

    const/4 v0, 0x1

    goto :goto_8

    :cond_e
    move v0, v1

    :goto_8
    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_f

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v3, v0, :cond_10

    :cond_f
    new-instance v3, LS/q1$a;

    invoke-direct {v3, p1}, LS/q1$a;-><init>(F)V

    invoke-interface {p3, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, LD0/I;

    shr-int/lit8 v0, v2, 0x6

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    invoke-static {p3, v1}, LV/k;->a(LV/n;I)I

    move-result v1

    invoke-interface {p3}, LV/n;->F()LV/z;

    move-result-object v2

    invoke-static {p3, p0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v4

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v6

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-interface {p3}, LV/n;->v()LV/g;

    move-result-object v7

    instance-of v7, v7, LV/g;

    if-nez v7, :cond_11

    invoke-static {}, LV/k;->c()V

    :cond_11
    invoke-interface {p3}, LV/n;->t()V

    invoke-interface {p3}, LV/n;->o()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-interface {p3, v6}, LV/n;->B(Lx7/a;)V

    goto :goto_9

    :cond_12
    invoke-interface {p3}, LV/n;->H()V

    :goto_9
    invoke-static {p3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v6

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v7

    invoke-static {v6, v3, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v6, v2, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v6}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-interface {v6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v1, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_14
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v6, v4, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    goto/16 :goto_6

    :goto_a
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p0

    if-eqz p0, :cond_15

    new-instance p3, LS/q1$b;

    move-object v1, p3

    move v3, p1

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LS/q1$b;-><init>(Landroidx/compose/ui/d;FLx7/p;II)V

    invoke-interface {p0, p3}, LV/e1;->a(Lx7/p;)V

    :cond_15
    return-void
.end method

.method private static final a0(LS/c;FFFZJLm7/e;)Ljava/lang/Object;
    .locals 12

    .prologue
    move-object v6, p0

    move-object/from16 v0, p7

    instance-of v1, v0, LS/q1$H;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, LS/q1$H;

    iget v2, v1, LS/q1$H;->I:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, LS/q1$H;->I:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, LS/q1$H;

    invoke-direct {v1, v0}, LS/q1$H;-><init>(Lm7/e;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, LS/q1$H;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v8

    iget v1, v7, LS/q1$H;->I:I

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v10, :cond_2

    if-ne v1, v9, :cond_1

    iget-boolean v1, v7, LS/q1$H;->G:Z

    iget-object v2, v7, LS/q1$H;->F:Ljava/lang/Object;

    check-cast v2, LS/c;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v1, v7, LS/q1$H;->G:Z

    iget-object v2, v7, LS/q1$H;->F:Ljava/lang/Object;

    check-cast v2, LS/c;

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    move v0, v1

    goto :goto_4

    :cond_3
    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-static/range {p5 .. p6}, LY0/p;->i(J)I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p2, v0

    invoke-static/range {p5 .. p6}, LY0/p;->h(J)I

    move-result v1

    int-to-float v1, v1

    sub-float v1, p1, v1

    invoke-static {v0, v1}, LS/q1;->T(FF)F

    move-result v0

    invoke-virtual {p0}, LS/c;->g()I

    move-result v1

    sget-object v2, LS/s1;->b:LS/s1$a;

    invoke-virtual {v2}, LS/s1$a;->b()I

    move-result v2

    invoke-static {v1, v2}, LS/s1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, 0x3dd67750

    div-float/2addr v0, v1

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v0, v2

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->rint(D)D

    move-result-wide v3

    double-to-float v0, v3

    mul-float/2addr v0, v2

    :goto_2
    mul-float/2addr v0, v1

    move v11, v0

    goto :goto_3

    :cond_4
    const v1, 0x3f060a92

    div-float/2addr v0, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->rint(D)D

    move-result-wide v2

    double-to-float v0, v2

    goto :goto_2

    :goto_3
    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide/from16 v4, p5

    invoke-static/range {v0 .. v5}, LS/q1;->Y(LS/t1;FFFJ)V

    iput-object v6, v7, LS/q1$H;->F:Ljava/lang/Object;

    move/from16 v0, p4

    iput-boolean v0, v7, LS/q1$H;->G:Z

    iput v10, v7, LS/q1$H;->I:I

    invoke-virtual {p0, v11, v10, v7}, LS/c;->B(FZLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_5

    return-object v8

    :cond_5
    move-object v2, v6

    :goto_4
    invoke-virtual {v2}, LS/c;->g()I

    move-result v1

    sget-object v3, LS/s1;->b:LS/s1$a;

    invoke-virtual {v3}, LS/s1$a;->a()I

    move-result v3

    invoke-static {v1, v3}, LS/s1;->f(II)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz v0, :cond_7

    iput-object v2, v7, LS/q1$H;->F:Ljava/lang/Object;

    iput-boolean v0, v7, LS/q1$H;->G:Z

    iput v9, v7, LS/q1$H;->I:I

    const-wide/16 v3, 0x64

    invoke-static {v3, v4, v7}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_6

    return-object v8

    :cond_6
    move v1, v0

    :goto_5
    move v0, v1

    :cond_7
    if-eqz v0, :cond_8

    sget-object v0, LS/s1;->b:LS/s1$a;

    invoke-virtual {v0}, LS/s1$a;->b()I

    move-result v0

    invoke-virtual {v2, v0}, LS/c;->f(I)V

    :cond_8
    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method

.method private static final b(LS/t1;LS/o1;LV/n;I)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x2

    const v2, -0x37b44575

    invoke-interface {p2, v2}, LV/n;->r(I)LV/n;

    move-result-object p2

    const/4 v3, 0x6

    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, p3, 0x8

    if-nez v4, :cond_0

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    or-int/2addr v4, p3

    goto :goto_2

    :cond_2
    move v4, p3

    :goto_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-interface {p2, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_6

    invoke-interface {p2}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {p2}, LV/n;->A()V

    goto :goto_5

    :cond_6
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, -0x1

    const-string v6, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1126)"

    invoke-static {v2, v4, v5, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object v2

    sget-object v4, LU/E;->a:LU/E;

    invoke-virtual {v4}, LU/E;->x()LU/L;

    move-result-object v4

    invoke-static {v4, p2, v3}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v3

    invoke-virtual {v2, v3}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v2

    invoke-static {}, Landroidx/compose/ui/platform/p0;->k()LV/O0;

    move-result-object v3

    sget-object v4, LY0/v;->C:LY0/v;

    invoke-virtual {v3, v4}, LV/O0;->d(Ljava/lang/Object;)LV/P0;

    move-result-object v3

    new-array v1, v1, [LV/P0;

    const/4 v4, 0x0

    aput-object v2, v1, v4

    aput-object v3, v1, v0

    new-instance v2, LS/q1$c;

    invoke-direct {v2, p0, p1}, LS/q1$c;-><init>(LS/t1;LS/o1;)V

    const/16 v3, 0x36

    const v4, -0x1c7c60b5

    invoke-static {v4, v0, v2, p2, v3}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v0

    sget v2, LV/P0;->i:I

    or-int/lit8 v2, v2, 0x30

    invoke-static {v1, v0, p2, v2}, LV/y;->b([LV/P0;Lx7/p;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-static {}, LV/q;->P()V

    :cond_8
    :goto_5
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, LS/q1$d;

    invoke-direct {v0, p0, p1, p3}, LS/q1$d;-><init>(LS/t1;LS/o1;I)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_9
    return-void
.end method

.method public static final b0(IIZLV/n;II)LS/t1;
    .locals 12

    .prologue
    move-object v4, p3

    move/from16 v0, p4

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, p0

    :goto_0
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_1

    :cond_1
    move v3, p1

    :goto_1
    const/4 v5, 0x4

    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_2

    invoke-static {p3, v2}, LS/n1;->a(LV/n;I)Z

    move-result v6

    goto :goto_2

    :cond_2
    move v6, p2

    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_3

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:573)"

    const v9, 0x49c6094d

    invoke-static {v9, v0, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    new-array v7, v2, [Ljava/lang/Object;

    sget-object v8, LS/u1;->f:LS/u1$a;

    invoke-virtual {v8}, LS/u1$a;->a()Le0/j;

    move-result-object v8

    and-int/lit8 v9, v0, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v10, 0x1

    if-le v9, v5, :cond_4

    invoke-interface {p3, v1}, LV/n;->i(I)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    and-int/lit8 v9, v0, 0x6

    if-ne v9, v5, :cond_6

    :cond_5
    move v5, v10

    goto :goto_3

    :cond_6
    move v5, v2

    :goto_3
    and-int/lit8 v9, v0, 0x70

    xor-int/lit8 v9, v9, 0x30

    const/16 v11, 0x20

    if-le v9, v11, :cond_7

    invoke-interface {p3, v3}, LV/n;->i(I)Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    and-int/lit8 v9, v0, 0x30

    if-ne v9, v11, :cond_9

    :cond_8
    move v9, v10

    goto :goto_4

    :cond_9
    move v9, v2

    :goto_4
    or-int/2addr v5, v9

    and-int/lit16 v9, v0, 0x380

    xor-int/lit16 v9, v9, 0x180

    const/16 v11, 0x100

    if-le v9, v11, :cond_a

    invoke-interface {p3, v6}, LV/n;->d(Z)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    and-int/lit16 v0, v0, 0x180

    if-ne v0, v11, :cond_c

    :cond_b
    move v2, v10

    :cond_c
    or-int v0, v5, v2

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_d

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_e

    :cond_d
    new-instance v2, LS/q1$I;

    invoke-direct {v2, v1, v3, v6}, LS/q1$I;-><init>(IIZ)V

    invoke-interface {p3, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    move-object v3, v2

    check-cast v3, Lx7/a;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v2, 0x0

    move-object v0, v7

    move-object v1, v8

    move-object v4, p3

    invoke-static/range {v0 .. v6}, Le0/b;->e([Ljava/lang/Object;Le0/j;Ljava/lang/String;Lx7/a;LV/n;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LS/u1;

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, LV/q;->P()V

    :cond_f
    return-object v0
.end method

.method public static final c(LS/c;LS/o1;ZLV/n;I)V
    .locals 9

    .prologue
    const v0, -0x45bf2dec

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LV/n;->d(Z)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.ClockFace (TimePicker.kt:1512)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_8
    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-static {}, LG/g;->e()LG/f;

    move-result-object v1

    invoke-virtual {p1}, LS/o1;->b()J

    move-result-wide v2

    invoke-static {v0, v2, v3, v1}, Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/d;JLo0/e2;)Landroidx/compose/ui/d;

    move-result-object v0

    new-instance v1, Landroidx/compose/material3/ClockDialModifier;

    invoke-virtual {p0}, LS/c;->g()I

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v1, p0, p2, v2, v3}, Landroidx/compose/material3/ClockDialModifier;-><init>(LS/c;ZILy7/k;)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v1, LU/E;->a:LU/E;

    invoke-virtual {v1}, LU/E;->b()F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, p0, p1}, LS/q1;->V(Landroidx/compose/ui/d;LS/c;LS/o1;)Landroidx/compose/ui/d;

    move-result-object v2

    invoke-virtual {p0}, LS/c;->u()Lr/l;

    move-result-object v1

    const/16 v0, 0xc8

    const/4 v4, 0x0

    const/4 v5, 0x6

    invoke-static {v0, v4, v3, v5, v3}, Lu/k;->l(IILu/F;ILjava/lang/Object;)Lu/w0;

    move-result-object v3

    new-instance v0, LS/q1$e;

    invoke-direct {v0, p1, p0, p2}, LS/q1$e;-><init>(LS/o1;LS/c;Z)V

    const/16 v4, 0x36

    const v5, -0x3cea9528

    const/4 v6, 0x1

    invoke-static {v5, v6, v0, p3, v4}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v5

    const/16 v7, 0x6180

    const/16 v8, 0x8

    const/4 v4, 0x0

    move-object v6, p3

    invoke-static/range {v1 .. v8}, Lt/l;->a(Ljava/lang/Object;Landroidx/compose/ui/d;Lu/I;Ljava/lang/String;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_5
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, LS/q1$f;

    invoke-direct {v0, p0, p1, p2, p4}, LS/q1$f;-><init>(LS/c;LS/o1;ZI)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method

.method private static final d(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V
    .locals 39

    .prologue
    move-object/from16 v8, p1

    move/from16 v9, p2

    move/from16 v10, p5

    const v0, -0xc53485f

    move-object/from16 v1, p4

    invoke-interface {v1, v0}, LV/n;->r(I)LV/n;

    move-result-object v11

    const/4 v1, 0x6

    and-int/lit8 v2, v10, 0x6

    const/4 v3, 0x2

    move-object/from16 v15, p0

    if-nez v2, :cond_1

    invoke-interface {v11, v15}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v10

    goto :goto_1

    :cond_1
    move v2, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_3

    invoke-interface {v11, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v10, 0x180

    if-nez v4, :cond_5

    invoke-interface {v11, v9}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v10, 0xc00

    move/from16 v13, p3

    if-nez v4, :cond_7

    invoke-interface {v11, v13}, LV/n;->d(Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v2, v4

    :cond_7
    move v7, v2

    and-int/lit16 v2, v7, 0x493

    const/16 v4, 0x492

    if-ne v2, v4, :cond_9

    invoke-interface {v11}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v11}, LV/n;->A()V

    move-object v0, v11

    goto/16 :goto_d

    :cond_9
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, -0x1

    const-string v4, "androidx.compose.material3.ClockText (TimePicker.kt:1638)"

    invoke-static {v0, v7, v2, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->c()LU/L;

    move-result-object v0

    invoke-static {v0, v11, v1}, LS/B1;->c(LU/L;LV/n;I)LM0/P;

    move-result-object v31

    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object v0

    invoke-interface {v11, v0}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/e;

    sget v1, LS/q1;->h:F

    invoke-interface {v0, v1}, LY0/e;->B0(F)F

    move-result v12

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v14, LV/n;->a:LV/n$a;

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    const/4 v5, 0x0

    if-ne v0, v1, :cond_b

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v0}, Ln0/g$a;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-static {v0, v5, v3, v5}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {v11, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_b
    move-object v4, v0

    check-cast v4, LV/w0;

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_c

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-virtual {v0}, LY0/p$a;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->b(J)LY0/p;

    move-result-object v0

    invoke-static {v0, v5, v3, v5}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {v11, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_c
    move-object v3, v0

    check-cast v3, LV/w0;

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_d

    sget-object v0, Lm7/j;->C:Lm7/j;

    invoke-static {v0, v11}, LV/Q;->h(Lm7/i;LV/n;)LW8/N;

    move-result-object v0

    new-instance v1, LV/C;

    invoke-direct {v1, v0}, LV/C;-><init>(LW8/N;)V

    invoke-interface {v11, v1}, LV/n;->K(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_d
    check-cast v0, LV/C;

    invoke-virtual {v0}, LV/C;->a()LW8/N;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, LS/c;->g()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, LS/c;->h()Z

    move-result v1

    and-int/lit16 v5, v7, 0x380

    invoke-static {v0, v1, v9, v11, v5}, LS/q1;->Z(IZILV/n;I)Ljava/lang/String;

    move-result-object v5

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v1, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v0, p2

    move-object v6, v2

    move/from16 v2, v18

    move-object/from16 v36, v3

    move/from16 v3, v19

    move-object/from16 v37, v4

    move/from16 v4, v16

    move-object/from16 v38, v5

    const/4 v9, 0x0

    move-object/from16 v5, v17

    invoke-static/range {v0 .. v5}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, LS/c;->g()I

    move-result v0

    sget-object v1, LS/s1;->b:LS/s1$a;

    invoke-virtual {v1}, LS/s1$a;->b()I

    move-result v1

    invoke-static {v0, v1}, LS/s1;->f(II)Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual/range {p1 .. p1}, LS/c;->a()I

    move-result v21

    :goto_6
    const/16 v25, 0x7

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, LS/p;->c(IIIZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    move v1, v0

    goto :goto_7

    :cond_e
    invoke-virtual/range {p1 .. p1}, LS/c;->b()I

    move-result v21

    goto :goto_6

    :goto_7
    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->e()Lh0/c;

    move-result-object v4

    invoke-static/range {p0 .. p0}, LS/k0;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget v2, LS/q1;->i:F

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/p;->p(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_f

    new-instance v2, LS/q1$g;

    move-object/from16 v9, v36

    move-object/from16 v3, v37

    invoke-direct {v2, v9, v3}, LS/q1$g;-><init>(LV/w0;LV/w0;)V

    invoke-interface {v11, v2}, LV/n;->K(Ljava/lang/Object;)V

    goto :goto_8

    :cond_f
    move-object/from16 v9, v36

    move-object/from16 v3, v37

    :goto_8
    check-cast v2, Lx7/l;

    invoke-static {v0, v2}, Landroidx/compose/ui/layout/c;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v2, 0x3

    const/4 v10, 0x0

    move-object/from16 v37, v3

    const/4 v3, 0x0

    invoke-static {v0, v10, v3, v2, v3}, Landroidx/compose/foundation/FocusableKt;->b(Landroidx/compose/ui/d;ZLz/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-interface {v11, v6}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v11, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v11, v12}, LV/n;->h(F)Z

    move-result v2

    or-int/2addr v0, v2

    and-int/lit16 v2, v7, 0x1c00

    const/16 v7, 0x800

    if-ne v2, v7, :cond_10

    const/4 v2, 0x1

    goto :goto_9

    :cond_10
    move v2, v10

    :goto_9
    or-int/2addr v0, v2

    invoke-interface {v11, v1}, LV/n;->d(Z)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_12

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_11

    goto :goto_a

    :cond_11
    move-object v10, v3

    move-object v8, v4

    move-object/from16 v32, v5

    goto :goto_b

    :cond_12
    :goto_a
    new-instance v7, LS/q1$h;

    move-object v0, v7

    move-object v2, v6

    move-object v10, v3

    move-object/from16 v6, v37

    move-object/from16 v3, p1

    move-object v8, v4

    move v4, v12

    move-object/from16 v32, v5

    move/from16 v5, p3

    move-object v12, v7

    move-object v7, v9

    invoke-direct/range {v0 .. v7}, LS/q1$h;-><init>(ZLW8/N;LS/c;FZLV/w0;LV/w0;)V

    invoke-interface {v11, v12}, LV/n;->K(Ljava/lang/Object;)V

    move-object v2, v12

    :goto_b
    check-cast v2, Lx7/l;

    const/4 v0, 0x1

    invoke-static {v10, v0, v2}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v2

    invoke-static {v11, v1}, LV/k;->a(LV/n;I)I

    move-result v1

    invoke-interface {v11}, LV/n;->F()LV/z;

    move-result-object v3

    invoke-static {v11, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v4, LF0/g;->a:LF0/g$a;

    invoke-virtual {v4}, LF0/g$a;->a()Lx7/a;

    move-result-object v5

    invoke-interface {v11}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_13

    invoke-static {}, LV/k;->c()V

    :cond_13
    invoke-interface {v11}, LV/n;->t()V

    invoke-interface {v11}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v11, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_c

    :cond_14
    invoke-interface {v11}, LV/n;->H()V

    :goto_c
    invoke-static {v11}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {v4}, LF0/g$a;->c()Lx7/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v5, v3, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v4}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_15

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_16
    invoke-virtual {v4}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v5, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object/from16 v1, v38

    invoke-interface {v11, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v11}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_17

    invoke-virtual {v14}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_18

    :cond_17
    new-instance v3, LS/q1$i;

    invoke-direct {v3, v1}, LS/q1$i;-><init>(Ljava/lang/String;)V

    invoke-interface {v11, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lx7/l;

    invoke-static {v0, v3}, LK0/n;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v12

    const/16 v34, 0x0

    const v35, 0xfffc

    const-wide/16 v0, 0x0

    move-wide v13, v0

    move-wide v15, v0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    move-object v0, v11

    move-object/from16 v11, v32

    move-object/from16 v32, v0

    invoke-static/range {v11 .. v35}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    invoke-interface {v0}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {}, LV/q;->P()V

    :cond_19
    :goto_d
    invoke-interface {v0}, LV/n;->x()LV/e1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v7, LS/q1$j;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LS/q1$j;-><init>(Landroidx/compose/ui/d;LS/c;IZI)V

    invoke-interface {v6, v7}, LV/e1;->a(Lx7/p;)V

    :cond_1a
    return-void
.end method

.method private static final e(LV/w0;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/g;

    invoke-virtual {p0}, Ln0/g;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final f(LV/w0;J)V
    .locals 0

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(LV/w0;)J
    .locals 2

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LY0/p;

    invoke-virtual {p0}, LY0/p;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final h(LV/w0;J)V
    .locals 0

    invoke-static {p1, p2}, LY0/p;->b(J)LY0/p;

    move-result-object p1

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Landroidx/compose/ui/d;LV/n;I)V
    .locals 48

    .prologue
    move-object/from16 v0, p0

    move/from16 v1, p2

    const v2, 0x7d35befe

    move-object/from16 v3, p1

    invoke-interface {v3, v2}, LV/n;->r(I)LV/n;

    move-result-object v15

    const/4 v3, 0x6

    and-int/lit8 v4, v1, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-interface {v15, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    and-int/lit8 v6, v4, 0x3

    if-ne v6, v5, :cond_3

    invoke-interface {v15}, LV/n;->u()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v15}, LV/n;->A()V

    move-object/from16 v28, v15

    goto/16 :goto_4

    :cond_3
    :goto_2
    invoke-static {}, LV/q;->H()Z

    move-result v5

    if-eqz v5, :cond_4

    const/4 v5, -0x1

    const-string v6, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1324)"

    invoke-static {v2, v4, v5, v6}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-static {}, LS/m1;->c()LV/O0;

    move-result-object v2

    invoke-interface {v15, v2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, LM0/P;

    sget-object v2, LX0/j;->b:LX0/j$a;

    invoke-virtual {v2}, LX0/j$a;->a()I

    move-result v36

    new-instance v2, LX0/h;

    move-object/from16 v42, v2

    sget-object v4, LX0/h$a;->a:LX0/h$a$a;

    invoke-virtual {v4}, LX0/h$a$a;->a()F

    move-result v4

    sget-object v5, LX0/h$c;->a:LX0/h$c$a;

    invoke-virtual {v5}, LX0/h$c$a;->a()I

    move-result v5

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v6}, LX0/h;-><init>(FILy7/k;)V

    const v46, 0xef7fff

    const/16 v47, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-static/range {v16 .. v47}, LM0/P;->c(LM0/P;JJLR0/q;LR0/o;LR0/p;LR0/h;Ljava/lang/String;JLX0/a;LX0/p;LT0/h;JLX0/k;Lo0/c2;Lq0/h;IIJLX0/r;LM0/A;LX0/h;IILX0/t;ILjava/lang/Object;)LM0/P;

    move-result-object v23

    sget-object v2, LS/q1$k;->D:LS/q1$k;

    invoke-static {v0, v2}, LK0/n;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v4, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v4}, Lh0/c$a;->e()Lh0/c;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v4

    invoke-static {v15, v5}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {v15}, LV/n;->F()LV/z;

    move-result-object v6

    invoke-static {v15, v2}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v2

    sget-object v7, LF0/g;->a:LF0/g$a;

    invoke-virtual {v7}, LF0/g$a;->a()Lx7/a;

    move-result-object v8

    invoke-interface {v15}, LV/n;->v()LV/g;

    move-result-object v9

    instance-of v9, v9, LV/g;

    if-nez v9, :cond_5

    invoke-static {}, LV/k;->c()V

    :cond_5
    invoke-interface {v15}, LV/n;->t()V

    invoke-interface {v15}, LV/n;->o()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v15, v8}, LV/n;->B(Lx7/a;)V

    goto :goto_3

    :cond_6
    invoke-interface {v15}, LV/n;->H()V

    :goto_3
    invoke-static {v15}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v8

    invoke-virtual {v7}, LF0/g$a;->c()Lx7/p;

    move-result-object v9

    invoke-static {v8, v4, v9}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v7}, LF0/g$a;->e()Lx7/p;

    move-result-object v4

    invoke-static {v8, v6, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v7}, LF0/g$a;->b()Lx7/p;

    move-result-object v4

    invoke-interface {v8}, LV/n;->o()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-interface {v8}, LV/n;->g()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v4}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_8
    invoke-virtual {v7}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v8, v2, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v2, LU/D;->a:LU/D;

    invoke-virtual {v2}, LU/D;->a()LU/e;

    move-result-object v2

    invoke-static {v2, v15, v3}, LS/A;->h(LU/e;LV/n;I)J

    move-result-wide v5

    const/16 v26, 0x0

    const v27, 0xfffa

    const-string v3, ":"

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v2, 0x0

    move-object/from16 v28, v15

    move-object v15, v2

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x6

    move-object/from16 v24, v28

    invoke-static/range {v3 .. v27}, LS/m1;->b(Ljava/lang/String;Landroidx/compose/ui/d;JJLR0/o;LR0/q;LR0/h;JLX0/k;LX0/j;JIZIILx7/l;LM0/P;LV/n;III)V

    invoke-interface/range {v28 .. v28}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    :goto_4
    invoke-interface/range {v28 .. v28}, LV/n;->x()LV/e1;

    move-result-object v2

    if-eqz v2, :cond_a

    new-instance v3, LS/q1$l;

    invoke-direct {v3, v0, v1}, LS/q1$l;-><init>(Landroidx/compose/ui/d;I)V

    invoke-interface {v2, v3}, LV/e1;->a(Lx7/p;)V

    :cond_a
    return-void
.end method

.method private static final j(LS/t1;LS/o1;LV/n;I)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x2d089e69

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LV/n;->r(I)LV/n;

    move-result-object v4

    const/4 v5, 0x6

    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_2

    and-int/lit8 v6, v2, 0x8

    if-nez v6, :cond_0

    invoke-interface {v4, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_0

    :cond_0
    invoke-interface {v4, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    :goto_0
    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    :goto_1
    or-int/2addr v6, v2

    goto :goto_2

    :cond_2
    move v6, v2

    :goto_2
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_4

    invoke-interface {v4, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_6

    invoke-interface {v4}, LV/n;->u()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v4}, LV/n;->A()V

    goto/16 :goto_7

    :cond_6
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1086)"

    invoke-static {v3, v6, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v3, LA/b;->a:LA/b;

    invoke-virtual {v3}, LA/b;->b()LA/b$f;

    move-result-object v3

    sget-object v14, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v15, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v15}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v7

    invoke-static {v3, v7, v4, v5}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v3

    const/4 v13, 0x0

    invoke-static {v4, v13}, LV/k;->a(LV/n;I)I

    move-result v7

    invoke-interface {v4}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v4, v14}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    sget-object v16, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v10

    invoke-interface {v4}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_8

    invoke-static {}, LV/k;->c()V

    :cond_8
    invoke-interface {v4}, LV/n;->t()V

    invoke-interface {v4}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v4, v10}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_9
    invoke-interface {v4}, LV/n;->H()V

    :goto_5
    invoke-static {v4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v10}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-interface {v10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_b
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v10, v9, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v3, LA/l;->a:LA/l;

    and-int/lit8 v3, v6, 0x7e

    invoke-static {v0, v1, v4, v3}, LS/q1;->b(LS/t1;LS/o1;LV/n;I)V

    const v3, 0x36d091dc

    invoke-interface {v4, v3}, LV/n;->T(I)V

    invoke-interface/range {p0 .. p0}, LS/t1;->h()Z

    move-result v3

    if-nez v3, :cond_10

    sget v9, LS/q1;->m:F

    const/16 v12, 0xd

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v14

    move v5, v13

    move-object v13, v3

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-virtual {v15}, Lh0/c$a;->o()Lh0/c;

    move-result-object v7

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v7

    invoke-static {v4, v5}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {v4}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v4, v3}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface {v4}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_c

    invoke-static {}, LV/k;->c()V

    :cond_c
    invoke-interface {v4}, LV/n;->t()V

    invoke-interface {v4}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v4, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_6

    :cond_d
    invoke-interface {v4}, LV/n;->H()V

    :goto_6
    invoke-static {v4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v9, v7, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v7

    invoke-static {v9, v8, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v7

    invoke-interface {v9}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v7}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_f
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v5

    invoke-static {v9, v3, v5}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v3, LU/E;->a:LU/E;

    invoke-virtual {v3}, LU/E;->m()F

    move-result v5

    invoke-virtual {v3}, LU/E;->l()F

    move-result v3

    invoke-static {v14, v5, v3}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    shl-int/lit8 v5, v6, 0x3

    and-int/lit8 v6, v5, 0x70

    const/4 v7, 0x6

    or-int/2addr v6, v7

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v6

    invoke-static {v3, v0, v1, v4, v5}, LS/q1;->k(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V

    invoke-interface {v4}, LV/n;->Q()V

    :cond_10
    invoke-interface {v4}, LV/n;->J()V

    invoke-interface {v4}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_7
    invoke-interface {v4}, LV/n;->x()LV/e1;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, LS/q1$m;

    invoke-direct {v4, v0, v1, v2}, LS/q1$m;-><init>(LS/t1;LS/o1;I)V

    invoke-interface {v3, v4}, LV/e1;->a(Lx7/p;)V

    :cond_12
    return-void
.end method

.method private static final k(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V
    .locals 9

    .prologue
    const v0, 0x4b2ca0b7    # 1.1313335E7f

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p4, 0x40

    if-nez v2, :cond_2

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_6

    invoke-interface {p3, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_8

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_6

    :cond_8
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1159)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_a

    sget-object v0, LS/q1$o;->a:LS/q1$o;

    invoke-interface {p3, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v0

    check-cast v4, LD0/I;

    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->k()LU/z;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, p3, v2}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LG/a;

    invoke-static {v0}, LS/T0;->f(LG/a;)LG/a;

    move-result-object v5

    invoke-static {v0}, LS/T0;->b(LG/a;)LG/a;

    move-result-object v6

    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v0, v0, 0xc00

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x380

    or-int v8, v0, v1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-static/range {v1 .. v8}, LS/q1;->m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_6
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LS/q1$n;

    invoke-direct {v0, p0, p1, p2, p4}, LS/q1$n;-><init>(Landroidx/compose/ui/d;LS/t1;LS/o1;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_c
    return-void
.end method

.method public static final l(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V
    .locals 18

    .prologue
    move-object/from16 v1, p0

    move/from16 v4, p3

    move/from16 v5, p5

    const/4 v0, 0x2

    const/16 v2, 0x30

    const/4 v3, 0x6

    const/4 v6, 0x4

    const v7, 0x555f4751

    move-object/from16 v8, p4

    invoke-interface {v8, v7}, LV/n;->r(I)LV/n;

    move-result-object v8

    and-int/lit8 v9, p6, 0x1

    if-eqz v9, :cond_0

    or-int/lit8 v9, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v9, v5, 0x6

    if-nez v9, :cond_2

    invoke-interface {v8, v1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    move v9, v6

    goto :goto_0

    :cond_1
    move v9, v0

    :goto_0
    or-int/2addr v9, v5

    goto :goto_1

    :cond_2
    move v9, v5

    :goto_1
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_4

    or-int/2addr v9, v2

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v5, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-interface {v8, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v9, v11

    :goto_3
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_8

    and-int/lit8 v11, p6, 0x4

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v8, v11}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v11, p2

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v9, v12

    goto :goto_5

    :cond_8
    move-object/from16 v11, p2

    :goto_5
    and-int/lit8 v12, p6, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v9, v9, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_b

    invoke-interface {v8, v4}, LV/n;->d(Z)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v9, v12

    :cond_b
    :goto_7
    and-int/lit16 v12, v9, 0x493

    const/16 v13, 0x492

    if-ne v12, v13, :cond_d

    invoke-interface {v8}, LV/n;->u()Z

    move-result v12

    if-nez v12, :cond_c

    goto :goto_8

    :cond_c
    invoke-interface {v8}, LV/n;->A()V

    move-object v2, v10

    move-object v3, v11

    goto/16 :goto_c

    :cond_d
    :goto_8
    invoke-interface {v8}, LV/n;->q()V

    and-int/lit8 v12, v5, 0x1

    if-eqz v12, :cond_10

    invoke-interface {v8}, LV/n;->G()Z

    move-result v12

    if-eqz v12, :cond_e

    goto :goto_9

    :cond_e
    invoke-interface {v8}, LV/n;->A()V

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_f

    and-int/lit16 v9, v9, -0x381

    :cond_f
    move-object v0, v11

    goto :goto_a

    :cond_10
    :goto_9
    if-eqz v0, :cond_11

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    move-object v10, v0

    :cond_11
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_f

    sget-object v0, LS/p1;->a:LS/p1;

    invoke-virtual {v0, v8, v3}, LS/p1;->a(LV/n;I)LS/o1;

    move-result-object v0

    and-int/lit16 v9, v9, -0x381

    :goto_a
    invoke-interface {v8}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v6

    if-eqz v6, :cond_12

    const/4 v6, -0x1

    const-string v11, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:947)"

    invoke-static {v7, v9, v6, v11}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_12
    sget v15, LS/q1;->d:F

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v11, v10

    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v6

    sget-object v7, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v7}, Lh0/c$a;->i()Lh0/c$c;

    move-result-object v7

    sget-object v11, LA/b;->a:LA/b;

    invoke-virtual {v11}, LA/b;->f()LA/b$e;

    move-result-object v11

    invoke-static {v11, v7, v8, v2}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v8, v7}, LV/k;->a(LV/n;I)I

    move-result v7

    invoke-interface {v8}, LV/n;->F()LV/z;

    move-result-object v11

    invoke-static {v8, v6}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v6

    sget-object v12, LF0/g;->a:LF0/g$a;

    invoke-virtual {v12}, LF0/g$a;->a()Lx7/a;

    move-result-object v13

    invoke-interface {v8}, LV/n;->v()LV/g;

    move-result-object v14

    instance-of v14, v14, LV/g;

    if-nez v14, :cond_13

    invoke-static {}, LV/k;->c()V

    :cond_13
    invoke-interface {v8}, LV/n;->t()V

    invoke-interface {v8}, LV/n;->o()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v8, v13}, LV/n;->B(Lx7/a;)V

    goto :goto_b

    :cond_14
    invoke-interface {v8}, LV/n;->H()V

    :goto_b
    invoke-static {v8}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v13

    invoke-virtual {v12}, LF0/g$a;->c()Lx7/p;

    move-result-object v14

    invoke-static {v13, v2, v14}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->e()Lx7/p;

    move-result-object v2

    invoke-static {v13, v11, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v12}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v13}, LV/n;->o()Z

    move-result v11

    if-nez v11, :cond_15

    invoke-interface {v13}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_16

    :cond_15
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v13, v7, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_16
    invoke-virtual {v12}, LF0/g$a;->d()Lx7/p;

    move-result-object v2

    invoke-static {v13, v6, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, LA/M;->a:LA/M;

    and-int/lit8 v2, v9, 0xe

    shr-int/lit8 v6, v9, 0x3

    and-int/lit8 v7, v6, 0x70

    or-int/2addr v2, v7

    invoke-static {v1, v0, v8, v2}, LS/q1;->j(LS/t1;LS/o1;LV/n;I)V

    sget-object v7, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget v9, LS/q1;->c:F

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/p;->t(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v7

    invoke-static {v7, v8, v3}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    and-int/lit16 v3, v6, 0x380

    or-int/2addr v2, v3

    invoke-static {v1, v0, v4, v8, v2}, LS/q1;->c(LS/c;LS/o1;ZLV/n;I)V

    invoke-interface {v8}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-static {}, LV/q;->P()V

    :cond_17
    move-object v3, v0

    move-object v2, v10

    :goto_c
    invoke-interface {v8}, LV/n;->x()LV/e1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v8, LS/q1$p;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v4, p3

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LS/q1$p;-><init>(LS/c;Landroidx/compose/ui/d;LS/o1;ZII)V

    invoke-interface {v7, v8}, LV/e1;->a(Lx7/p;)V

    :cond_18
    return-void
.end method

.method private static final m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V
    .locals 25

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v7, p7

    const v0, 0x51e9446d

    move-object/from16 v3, p6

    invoke-interface {v3, v0}, LV/n;->r(I)LV/n;

    move-result-object v3

    const/4 v5, 0x6

    and-int/lit8 v6, v7, 0x6

    if-nez v6, :cond_1

    invoke-interface {v3, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v7

    goto :goto_1

    :cond_1
    move v6, v7

    :goto_1
    and-int/lit8 v8, v7, 0x30

    if-nez v8, :cond_4

    and-int/lit8 v8, v7, 0x40

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
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v6, v8

    :cond_4
    and-int/lit16 v8, v7, 0x180

    move-object/from16 v14, p2

    if-nez v8, :cond_6

    invoke-interface {v3, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v6, v8

    :cond_6
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_8

    invoke-interface {v3, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_5

    :cond_7
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v6, v8

    :cond_8
    and-int/lit16 v8, v7, 0x6000

    move-object/from16 v13, p4

    if-nez v8, :cond_a

    invoke-interface {v3, v13}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x4000

    goto :goto_6

    :cond_9
    const/16 v8, 0x2000

    :goto_6
    or-int/2addr v6, v8

    :cond_a
    const/high16 v8, 0x30000

    and-int/2addr v8, v7

    move-object/from16 v12, p5

    if-nez v8, :cond_c

    invoke-interface {v3, v12}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/high16 v8, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v8, 0x10000

    :goto_7
    or-int/2addr v6, v8

    :cond_c
    const v8, 0x12493

    and-int/2addr v8, v6

    const v9, 0x12492

    if-ne v8, v9, :cond_e

    invoke-interface {v3}, LV/n;->u()Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_8

    :cond_d
    invoke-interface {v3}, LV/n;->A()V

    goto/16 :goto_e

    :cond_e
    :goto_8
    invoke-static {}, LV/q;->H()Z

    move-result v8

    if-eqz v8, :cond_f

    const/4 v8, -0x1

    const-string v9, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1254)"

    invoke-static {v0, v6, v8, v9}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_f
    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->o()F

    move-result v8

    invoke-virtual/range {p2 .. p2}, LS/o1;->c()J

    move-result-wide v9

    invoke-static {v8, v9, v10}, Lv/h;->a(FJ)Lv/g;

    move-result-object v8

    invoke-virtual {v0}, LU/E;->k()LU/z;

    move-result-object v0

    invoke-static {v0, v3, v5}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v0

    const-string v5, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    invoke-static {v0, v5}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LG/a;

    sget-object v5, LT/x;->a:LT/x$a;

    sget v5, LS/C0;->I:I

    invoke-static {v5}, LT/x;->a(I)I

    move-result v5

    const/4 v11, 0x0

    invoke-static {v5, v3, v11}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v9

    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_10

    sget-object v9, LV/n;->a:LV/n$a;

    invoke-virtual {v9}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_11

    :cond_10
    new-instance v10, LS/q1$q;

    invoke-direct {v10, v5}, LS/q1$q;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lx7/l;

    const/4 v5, 0x1

    const/4 v9, 0x0

    invoke-static {v1, v11, v10, v5, v9}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-static {v10}, LF/a;->a(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v10

    invoke-static {v10, v8, v0}, Lv/e;->e(Landroidx/compose/ui/d;Lv/g;Lo0/e2;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v3, v11}, LV/k;->a(LV/n;I)I

    move-result v8

    invoke-interface {v3}, LV/n;->F()LV/z;

    move-result-object v10

    invoke-static {v3, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v16, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface {v3}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_12

    invoke-static {}, LV/k;->c()V

    :cond_12
    invoke-interface {v3}, LV/n;->t()V

    invoke-interface {v3}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_13

    invoke-interface {v3, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_9

    :cond_13
    invoke-interface {v3}, LV/n;->H()V

    :goto_9
    invoke-static {v3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v9, v4, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v11

    invoke-static {v9, v10, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v10

    invoke-interface {v9}, LV/n;->o()Z

    move-result v11

    if-nez v11, :cond_14

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_15

    :cond_14
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v9, v11}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8, v10}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_15
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v8

    invoke-static {v9, v0, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-interface/range {p1 .. p1}, LS/t1;->i()Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    and-int/lit8 v0, v6, 0x70

    const/16 v9, 0x20

    if-eq v0, v9, :cond_17

    and-int/lit8 v9, v6, 0x40

    if-eqz v9, :cond_16

    invoke-interface {v3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_16

    goto :goto_a

    :cond_16
    const/4 v9, 0x0

    goto :goto_b

    :cond_17
    :goto_a
    move v9, v5

    :goto_b
    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_18

    sget-object v9, LV/n;->a:LV/n$a;

    invoke-virtual {v9}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_19

    :cond_18
    new-instance v10, LS/q1$r;

    invoke-direct {v10, v2}, LS/q1$r;-><init>(LS/t1;)V

    invoke-interface {v3, v10}, LV/n;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v10, Lx7/a;

    sget-object v15, LS/I;->a:LS/I;

    invoke-virtual {v15}, LS/I;->a()Lx7/q;

    move-result-object v16

    shr-int/lit8 v9, v6, 0x9

    and-int/lit8 v9, v9, 0x70

    or-int/lit16 v9, v9, 0x6000

    shl-int/lit8 v11, v6, 0x3

    and-int/lit16 v11, v11, 0x1c00

    or-int v18, v9, v11

    const/4 v1, 0x0

    move-object/from16 v9, p4

    move/from16 v17, v11

    move-object/from16 v11, p2

    move-object/from16 v12, v16

    move-object v13, v3

    move/from16 v14, v18

    invoke-static/range {v8 .. v14}, LS/q1;->q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V

    sget-object v8, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const-string v9, "Spacer"

    invoke-static {v8, v9}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/d;Ljava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v8

    const/high16 v9, 0x40000000    # 2.0f

    invoke-static {v8, v9}, Lh0/p;->a(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9, v5, v1}, Landroidx/compose/foundation/layout/p;->d(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v19

    invoke-virtual/range {p2 .. p2}, LS/o1;->c()J

    move-result-wide v20

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/d;JLo0/e2;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v1

    const/4 v8, 0x0

    invoke-static {v1, v3, v8}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-interface/range {p1 .. p1}, LS/t1;->i()Z

    move-result v1

    const/16 v9, 0x20

    if-eq v0, v9, :cond_1b

    and-int/lit8 v0, v6, 0x40

    if-eqz v0, :cond_1a

    invoke-interface {v3, v2}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_c

    :cond_1a
    move v11, v8

    goto :goto_d

    :cond_1b
    :goto_c
    move v11, v5

    :goto_d
    invoke-interface {v3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_1c

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v0, v5, :cond_1d

    :cond_1c
    new-instance v0, LS/q1$s;

    invoke-direct {v0, v2}, LS/q1$s;-><init>(LS/t1;)V

    invoke-interface {v3, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_1d
    move-object v10, v0

    check-cast v10, Lx7/a;

    invoke-virtual {v15}, LS/I;->b()Lx7/q;

    move-result-object v12

    shr-int/lit8 v0, v6, 0xc

    and-int/lit8 v0, v0, 0x70

    or-int/lit16 v0, v0, 0x6000

    or-int v14, v0, v17

    move v8, v1

    move-object/from16 v9, p5

    move-object/from16 v11, p2

    move-object v13, v3

    invoke-static/range {v8 .. v14}, LS/q1;->q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V

    invoke-interface {v3}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-static {}, LV/q;->P()V

    :cond_1e
    :goto_e
    invoke-interface {v3}, LV/n;->x()LV/e1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v9, LS/q1$t;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LS/q1$t;-><init>(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;I)V

    invoke-interface {v8, v9}, LV/e1;->a(Lx7/p;)V

    :cond_1f
    return-void
.end method

.method public static final n(LS/t1;Landroidx/compose/ui/d;LS/o1;ILV/n;II)V
    .locals 8

    .prologue
    const v0, -0x24e98fb4

    invoke-interface {p4, v0}, LV/n;->r(I)LV/n;

    move-result-object p4

    and-int/lit8 v1, p6, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v1, p5, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v1, p5, 0x6

    if-nez v1, :cond_3

    and-int/lit8 v1, p5, 0x8

    if-nez v1, :cond_1

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {p4, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, p5

    goto :goto_2

    :cond_3
    move v1, p5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p5, 0x30

    if-nez v4, :cond_6

    invoke-interface {p4, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v1, v4

    :cond_6
    :goto_4
    and-int/lit16 v4, p5, 0x180

    if-nez v4, :cond_8

    and-int/lit8 v4, p6, 0x4

    if-nez v4, :cond_7

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_5

    :cond_7
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v1, v4

    :cond_8
    and-int/lit16 v4, p5, 0xc00

    if-nez v4, :cond_a

    and-int/lit8 v4, p6, 0x8

    if-nez v4, :cond_9

    invoke-interface {p4, p3}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v4, 0x800

    goto :goto_6

    :cond_9
    const/16 v4, 0x400

    :goto_6
    or-int/2addr v1, v4

    :cond_a
    and-int/lit16 v4, v1, 0x493

    const/16 v5, 0x492

    if-ne v4, v5, :cond_d

    invoke-interface {p4}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {p4}, LV/n;->A()V

    :cond_c
    :goto_7
    move-object v3, p1

    move-object v4, p2

    move v5, p3

    goto/16 :goto_e

    :cond_d
    :goto_8
    invoke-interface {p4}, LV/n;->q()V

    and-int/lit8 v4, p5, 0x1

    if-eqz v4, :cond_10

    invoke-interface {p4}, LV/n;->G()Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {p4}, LV/n;->A()V

    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_f

    and-int/lit16 v1, v1, -0x381

    :cond_f
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_13

    :goto_9
    and-int/lit16 v1, v1, -0x1c01

    goto :goto_b

    :cond_10
    :goto_a
    if-eqz v3, :cond_11

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_11
    and-int/lit8 v3, p6, 0x4

    const/4 v4, 0x6

    if-eqz v3, :cond_12

    sget-object p2, LS/p1;->a:LS/p1;

    invoke-virtual {p2, p4, v4}, LS/p1;->a(LV/n;I)LS/o1;

    move-result-object p2

    and-int/lit16 v1, v1, -0x381

    :cond_12
    and-int/lit8 v3, p6, 0x8

    if-eqz v3, :cond_13

    sget-object p3, LS/p1;->a:LS/p1;

    invoke-virtual {p3, p4, v4}, LS/p1;->c(LV/n;I)I

    move-result p3

    goto :goto_9

    :cond_13
    :goto_b
    invoke-interface {p4}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_14

    const/4 v3, -0x1

    const-string v4, "androidx.compose.material3.TimePicker (TimePicker.kt:220)"

    invoke-static {v0, v1, v3, v4}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_14
    const/4 v0, 0x3

    const/4 v3, 0x0

    invoke-static {v3, v3, p4, v3, v0}, LT/a;->c(ZZLV/n;II)LV/G1;

    move-result-object v0

    and-int/lit8 v4, v1, 0xe

    const/4 v5, 0x1

    if-eq v4, v2, :cond_15

    and-int/lit8 v2, v1, 0x8

    if-eqz v2, :cond_16

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    :cond_15
    move v3, v5

    :cond_16
    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v3, :cond_17

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_18

    :cond_17
    new-instance v2, LS/c;

    invoke-direct {v2, p0}, LS/c;-><init>(LS/t1;)V

    invoke-interface {p4, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_18
    check-cast v2, LS/c;

    sget-object v3, LS/r1;->a:LS/r1$a;

    invoke-virtual {v3}, LS/r1$a;->b()I

    move-result v3

    invoke-static {p3, v3}, LS/r1;->d(II)Z

    move-result v3

    if-eqz v3, :cond_19

    const v3, -0x1419cdde

    invoke-interface {p4, v3}, LV/n;->T(I)V

    invoke-static {v0}, LS/q1;->o(LV/G1;)Z

    move-result v0

    xor-int/lit8 v4, v0, 0x1

    and-int/lit16 v6, v1, 0x3f0

    const/4 v7, 0x0

    move-object v1, v2

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-static/range {v1 .. v7}, LS/q1;->t(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V

    :goto_c
    invoke-interface {p4}, LV/n;->J()V

    goto :goto_d

    :cond_19
    const v3, -0x1416c6a0

    invoke-interface {p4, v3}, LV/n;->T(I)V

    invoke-static {v0}, LS/q1;->o(LV/G1;)Z

    move-result v0

    xor-int/lit8 v4, v0, 0x1

    and-int/lit16 v6, v1, 0x3f0

    const/4 v7, 0x0

    move-object v1, v2

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-static/range {v1 .. v7}, LS/q1;->l(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V

    goto :goto_c

    :goto_d
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LV/q;->P()V

    goto/16 :goto_7

    :goto_e
    invoke-interface {p4}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_1a

    new-instance p2, LS/q1$u;

    move-object v1, p2

    move-object v2, p0

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, LS/q1$u;-><init>(LS/t1;Landroidx/compose/ui/d;LS/o1;III)V

    invoke-interface {p1, p2}, LV/e1;->a(Lx7/p;)V

    :cond_1a
    return-void
.end method

.method private static final o(LV/G1;)Z
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final p(Landroidx/compose/ui/d;ILS/t1;ILS/o1;LV/n;I)V
    .locals 31

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v10, p4

    move/from16 v11, p6

    const v0, -0x446df151

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v14

    const/4 v2, 0x6

    and-int/lit8 v3, v11, 0x6

    if-nez v3, :cond_1

    invoke-interface {v14, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v11

    goto :goto_1

    :cond_1
    move v3, v11

    :goto_1
    and-int/lit8 v4, v11, 0x30

    move/from16 v12, p1

    if-nez v4, :cond_3

    invoke-interface {v14, v12}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v11, 0x180

    const/16 v5, 0x100

    if-nez v4, :cond_6

    and-int/lit16 v4, v11, 0x200

    if-nez v4, :cond_4

    invoke-interface {v14, v8}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_4
    invoke-interface {v14, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_5

    move v4, v5

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v3, v4

    :cond_6
    and-int/lit16 v4, v11, 0xc00

    const/16 v6, 0x800

    if-nez v4, :cond_8

    invoke-interface {v14, v9}, LV/n;->i(I)Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v6

    goto :goto_5

    :cond_7
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v3, v4

    :cond_8
    and-int/lit16 v4, v11, 0x6000

    if-nez v4, :cond_a

    invoke-interface {v14, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v4, 0x4000

    goto :goto_6

    :cond_9
    const/16 v4, 0x2000

    :goto_6
    or-int/2addr v3, v4

    :cond_a
    and-int/lit16 v4, v3, 0x2493

    const/16 v7, 0x2492

    if-ne v4, v7, :cond_c

    invoke-interface {v14}, LV/n;->u()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_7

    :cond_b
    invoke-interface {v14}, LV/n;->A()V

    move-object v0, v14

    goto/16 :goto_d

    :cond_c
    :goto_7
    invoke-static {}, LV/q;->H()Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, -0x1

    const-string v7, "androidx.compose.material3.TimeSelector (TimePicker.kt:1348)"

    invoke-static {v0, v3, v4, v7}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_d
    invoke-interface/range {p2 .. p2}, LS/t1;->g()I

    move-result v0

    invoke-static {v0, v9}, LS/s1;->f(II)Z

    move-result v0

    sget-object v4, LS/s1;->b:LS/s1$a;

    invoke-virtual {v4}, LS/s1$a;->a()I

    move-result v4

    invoke-static {v9, v4}, LS/s1;->f(II)Z

    move-result v4

    if-eqz v4, :cond_e

    sget-object v4, LT/x;->a:LT/x$a;

    sget v4, LS/C0;->E:I

    :goto_8
    invoke-static {v4}, LT/x;->a(I)I

    move-result v4

    goto :goto_9

    :cond_e
    sget-object v4, LT/x;->a:LT/x$a;

    sget v4, LS/C0;->G:I

    goto :goto_8

    :goto_9
    const/4 v7, 0x0

    invoke-static {v4, v14, v7}, LT/y;->a(ILV/n;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v0}, LS/o1;->g(Z)J

    move-result-wide v17

    invoke-virtual {v10, v0}, LS/o1;->h(Z)J

    move-result-wide v15

    invoke-interface {v14, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v13

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v13, :cond_f

    sget-object v13, LV/n;->a:LV/n$a;

    invoke-virtual {v13}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v7, v13, :cond_10

    :cond_f
    new-instance v7, LS/q1$v;

    invoke-direct {v7, v4}, LS/q1$v;-><init>(Ljava/lang/String;)V

    invoke-interface {v14, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lx7/l;

    const/4 v4, 0x1

    invoke-static {v1, v4, v7}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object v26

    sget-object v7, LU/E;->a:LU/E;

    invoke-virtual {v7}, LU/E;->v()LU/z;

    move-result-object v7

    invoke-static {v7, v14, v2}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v30

    and-int/lit16 v2, v3, 0x1c00

    if-ne v2, v6, :cond_11

    move v2, v4

    goto :goto_a

    :cond_11
    const/4 v2, 0x0

    :goto_a
    and-int/lit16 v6, v3, 0x380

    if-eq v6, v5, :cond_13

    and-int/lit16 v3, v3, 0x200

    if-eqz v3, :cond_12

    invoke-interface {v14, v8}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_b

    :cond_12
    const/4 v7, 0x0

    goto :goto_c

    :cond_13
    :goto_b
    move v7, v4

    :goto_c
    or-int/2addr v2, v7

    invoke-interface {v14}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_14

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_15

    :cond_14
    new-instance v3, LS/q1$w;

    invoke-direct {v3, v9, v8}, LS/q1$w;-><init>(ILS/t1;)V

    invoke-interface {v14, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_15
    move-object v13, v3

    check-cast v13, Lx7/a;

    new-instance v6, LS/q1$x;

    move-object v2, v6

    move/from16 v3, p3

    move v7, v4

    move-object/from16 v4, p2

    move/from16 v5, p1

    move-object v8, v6

    move v1, v7

    move-wide v6, v15

    invoke-direct/range {v2 .. v7}, LS/q1$x;-><init>(ILS/t1;IJ)V

    const/16 v2, 0x36

    const v3, -0x580d8aa7

    invoke-static {v3, v1, v8, v14, v2}, Ld0/c;->e(IZLjava/lang/Object;LV/n;I)Ld0/a;

    move-result-object v25

    const/16 v28, 0x30

    const/16 v29, 0x7c8

    const/4 v15, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    move v12, v0

    move-object v0, v14

    move-object/from16 v14, v26

    move-object/from16 v16, v30

    move-object/from16 v26, v0

    invoke-static/range {v12 .. v29}, LS/c1;->b(ZLx7/a;Landroidx/compose/ui/d;ZLo0/e2;JJFFLv/g;Lz/l;Lx7/p;LV/n;III)V

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {}, LV/q;->P()V

    :cond_16
    :goto_d
    invoke-interface {v0}, LV/n;->x()LV/e1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v8, LS/q1$y;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LS/q1$y;-><init>(Landroidx/compose/ui/d;ILS/t1;ILS/o1;I)V

    invoke-interface {v7, v8}, LV/e1;->a(Lx7/p;)V

    :cond_17
    return-void
.end method

.method private static final q(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;LV/n;I)V
    .locals 23

    .prologue
    move/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v6, p6

    const v0, -0x737a8062

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LV/n;->r(I)LV/n;

    move-result-object v2

    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_1

    invoke-interface {v2, v1}, LV/n;->d(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    move-object/from16 v14, p1

    if-nez v7, :cond_3

    invoke-interface {v2, v14}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    move-object/from16 v15, p2

    if-nez v7, :cond_5

    invoke-interface {v2, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    invoke-interface {v2, v4}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v3, v7

    :cond_7
    and-int/lit16 v7, v6, 0x6000

    move-object/from16 v12, p4

    if-nez v7, :cond_9

    invoke-interface {v2, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v3, v7

    :cond_9
    and-int/lit16 v7, v3, 0x2493

    const/16 v8, 0x2492

    if-ne v7, v8, :cond_b

    invoke-interface {v2}, LV/n;->u()Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v2}, LV/n;->A()V

    goto/16 :goto_9

    :cond_b
    :goto_6
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_c

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.ToggleItem (TimePicker.kt:1304)"

    invoke-static {v0, v3, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_c
    invoke-virtual {v4, v1}, LS/o1;->f(Z)J

    move-result-wide v10

    invoke-virtual {v4, v1}, LS/o1;->e(Z)J

    move-result-wide v8

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    const/4 v7, 0x0

    if-eqz v1, :cond_d

    move v13, v7

    goto :goto_7

    :cond_d
    const/high16 v13, 0x3f800000    # 1.0f

    :goto_7
    invoke-static {v0, v13}, Lh0/p;->a(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    const/4 v13, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v7, v13, v5}, Landroidx/compose/foundation/layout/p;->d(Landroidx/compose/ui/d;FILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    and-int/lit8 v7, v3, 0xe

    const/4 v5, 0x4

    if-ne v7, v5, :cond_e

    move v5, v13

    goto :goto_8

    :cond_e
    const/4 v5, 0x0

    :goto_8
    invoke-interface {v2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_f

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_10

    :cond_f
    new-instance v7, LS/q1$z;

    invoke-direct {v7, v1}, LS/q1$z;-><init>(Z)V

    invoke-interface {v2, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lx7/l;

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static {v0, v1, v7, v13, v5}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    int-to-float v1, v1

    invoke-static {v1}, LY0/i;->q(F)F

    move-result v1

    invoke-static {v1}, Landroidx/compose/foundation/layout/m;->a(F)LA/B;

    move-result-object v1

    sget-object v7, LS/l;->a:LS/l;

    const/16 v17, 0x6000

    const/16 v18, 0xc

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    move-wide/from16 v12, v19

    move-wide/from16 v14, v21

    move-object/from16 v16, v2

    invoke-virtual/range {v7 .. v18}, LS/l;->s(JJJJLV/n;II)LS/k;

    move-result-object v11

    shr-int/lit8 v5, v3, 0x6

    and-int/lit8 v5, v5, 0xe

    const/high16 v7, 0xc00000

    or-int/2addr v5, v7

    shl-int/lit8 v7, v3, 0x6

    and-int/lit16 v7, v7, 0x1c00

    or-int/2addr v5, v7

    shl-int/lit8 v3, v3, 0xf

    const/high16 v7, 0x70000000

    and-int/2addr v3, v7

    or-int v18, v5, v3

    const/16 v19, 0x164

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v7, p2

    move-object v8, v0

    move-object/from16 v10, p1

    move-object v14, v1

    move-object/from16 v16, p4

    move-object/from16 v17, v2

    invoke-static/range {v7 .. v19}, LS/n;->c(Lx7/a;Landroidx/compose/ui/d;ZLo0/e2;LS/k;LS/m;Lv/g;LA/B;Lz/l;Lx7/q;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_9
    invoke-interface {v2}, LV/n;->x()LV/e1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v8, LS/q1$A;

    move-object v0, v8

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, LS/q1$A;-><init>(ZLo0/e2;Lx7/a;LS/o1;Lx7/q;I)V

    invoke-interface {v7, v8}, LV/e1;->a(Lx7/p;)V

    :cond_12
    return-void
.end method

.method private static final r(LS/t1;LS/o1;LV/n;I)V
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const v3, 0x7a77dc3b

    move-object/from16 v4, p2

    invoke-interface {v4, v3}, LV/n;->r(I)LV/n;

    move-result-object v4

    const/4 v5, 0x6

    and-int/lit8 v6, v2, 0x6

    if-nez v6, :cond_2

    and-int/lit8 v6, v2, 0x8

    if-nez v6, :cond_0

    invoke-interface {v4, v0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_0

    :cond_0
    invoke-interface {v4, v0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    :goto_0
    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    :goto_1
    or-int/2addr v6, v2

    goto :goto_2

    :cond_2
    move v6, v2

    :goto_2
    and-int/lit8 v7, v2, 0x30

    if-nez v7, :cond_4

    invoke-interface {v4, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    if-ne v7, v8, :cond_6

    invoke-interface {v4}, LV/n;->u()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v4}, LV/n;->A()V

    goto/16 :goto_7

    :cond_6
    :goto_4
    invoke-static {}, LV/q;->H()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v7, -0x1

    const-string v8, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1106)"

    invoke-static {v3, v6, v7, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_7
    sget-object v3, LA/b;->a:LA/b;

    invoke-virtual {v3}, LA/b;->b()LA/b$f;

    move-result-object v3

    sget-object v14, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget-object v15, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v15}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v7

    invoke-static {v3, v7, v4, v5}, LA/I;->b(LA/b$e;Lh0/c$c;LV/n;I)LD0/I;

    move-result-object v3

    const/4 v13, 0x0

    invoke-static {v4, v13}, LV/k;->a(LV/n;I)I

    move-result v7

    invoke-interface {v4}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v4, v14}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v9

    sget-object v16, LF0/g;->a:LF0/g$a;

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v10

    invoke-interface {v4}, LV/n;->v()LV/g;

    move-result-object v11

    instance-of v11, v11, LV/g;

    if-nez v11, :cond_8

    invoke-static {}, LV/k;->c()V

    :cond_8
    invoke-interface {v4}, LV/n;->t()V

    invoke-interface {v4}, LV/n;->o()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v4, v10}, LV/n;->B(Lx7/a;)V

    goto :goto_5

    :cond_9
    invoke-interface {v4}, LV/n;->H()V

    :goto_5
    invoke-static {v4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v10

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v11

    invoke-static {v10, v3, v11}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v3

    invoke-static {v10, v8, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v3

    invoke-interface {v10}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-interface {v10}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v10, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v10, v7, v3}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_b
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v3

    invoke-static {v10, v9, v3}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v3, LA/M;->a:LA/M;

    and-int/lit8 v3, v6, 0x7e

    invoke-static {v0, v1, v4, v3}, LS/q1;->b(LS/t1;LS/o1;LV/n;I)V

    const v3, -0x2a49e1d6

    invoke-interface {v4, v3}, LV/n;->T(I)V

    invoke-interface/range {p0 .. p0}, LS/t1;->h()Z

    move-result v3

    if-nez v3, :cond_10

    sget v8, LS/q1;->m:F

    const/16 v12, 0xe

    const/4 v3, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v14

    move v5, v13

    move-object v13, v3

    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/layout/m;->m(Landroidx/compose/ui/d;FFFFILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-virtual {v15}, Lh0/c$a;->o()Lh0/c;

    move-result-object v7

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(Lh0/c;Z)LD0/I;

    move-result-object v7

    invoke-static {v4, v5}, LV/k;->a(LV/n;I)I

    move-result v5

    invoke-interface {v4}, LV/n;->F()LV/z;

    move-result-object v8

    invoke-static {v4, v3}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->a()Lx7/a;

    move-result-object v9

    invoke-interface {v4}, LV/n;->v()LV/g;

    move-result-object v10

    instance-of v10, v10, LV/g;

    if-nez v10, :cond_c

    invoke-static {}, LV/k;->c()V

    :cond_c
    invoke-interface {v4}, LV/n;->t()V

    invoke-interface {v4}, LV/n;->o()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v4, v9}, LV/n;->B(Lx7/a;)V

    goto :goto_6

    :cond_d
    invoke-interface {v4}, LV/n;->H()V

    :goto_6
    invoke-static {v4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v9

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->c()Lx7/p;

    move-result-object v10

    invoke-static {v9, v7, v10}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->e()Lx7/p;

    move-result-object v7

    invoke-static {v9, v8, v7}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual/range {v16 .. v16}, LF0/g$a;->b()Lx7/p;

    move-result-object v7

    invoke-interface {v9}, LV/n;->o()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-interface {v9}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v9, v8}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v9, v5, v7}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_f
    invoke-virtual/range {v16 .. v16}, LF0/g$a;->d()Lx7/p;

    move-result-object v5

    invoke-static {v9, v3, v5}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v3, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object v3, LU/E;->a:LU/E;

    invoke-virtual {v3}, LU/E;->t()F

    move-result v5

    invoke-virtual {v3}, LU/E;->s()F

    move-result v3

    invoke-static {v14, v5, v3}, Landroidx/compose/foundation/layout/p;->q(Landroidx/compose/ui/d;FF)Landroidx/compose/ui/d;

    move-result-object v3

    shl-int/lit8 v5, v6, 0x3

    and-int/lit8 v6, v5, 0x70

    const/4 v7, 0x6

    or-int/2addr v6, v7

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v5, v6

    invoke-static {v3, v0, v1, v4, v5}, LS/q1;->s(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V

    invoke-interface {v4}, LV/n;->Q()V

    :cond_10
    invoke-interface {v4}, LV/n;->J()V

    invoke-interface {v4}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, LV/q;->P()V

    :cond_11
    :goto_7
    invoke-interface {v4}, LV/n;->x()LV/e1;

    move-result-object v3

    if-eqz v3, :cond_12

    new-instance v4, LS/q1$B;

    invoke-direct {v4, v0, v1, v2}, LS/q1$B;-><init>(LS/t1;LS/o1;I)V

    invoke-interface {v3, v4}, LV/e1;->a(Lx7/p;)V

    :cond_12
    return-void
.end method

.method private static final s(Landroidx/compose/ui/d;LS/t1;LS/o1;LV/n;I)V
    .locals 9

    .prologue
    const v0, -0x712f30db

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p4, 0x40

    if-nez v2, :cond_2

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-interface {p3, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_6

    invoke-interface {p3, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_8

    invoke-interface {p3}, LV/n;->u()Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {p3}, LV/n;->A()V

    goto :goto_6

    :cond_8
    :goto_5
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_9

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1205)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_a

    sget-object v0, LS/q1$D;->a:LS/q1$D;

    invoke-interface {p3, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v0

    check-cast v4, LD0/I;

    sget-object v0, LU/E;->a:LU/E;

    invoke-virtual {v0}, LU/E;->k()LU/z;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {v0, p3, v2}, LS/T0;->e(LU/z;LV/n;I)Lo0/e2;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape"

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, LG/a;

    invoke-static {v0}, LS/T0;->g(LG/a;)LG/a;

    move-result-object v5

    invoke-static {v0}, LS/T0;->a(LG/a;)LG/a;

    move-result-object v6

    and-int/lit8 v0, v1, 0xe

    or-int/lit16 v0, v0, 0xc00

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v1, v1, 0x380

    or-int v8, v0, v1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v7, p3

    invoke-static/range {v1 .. v8}, LS/q1;->m(Landroidx/compose/ui/d;LS/t1;LS/o1;LD0/I;Lo0/e2;Lo0/e2;LV/n;I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_6
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p3

    if-eqz p3, :cond_c

    new-instance v0, LS/q1$C;

    invoke-direct {v0, p0, p1, p2, p4}, LS/q1$C;-><init>(Landroidx/compose/ui/d;LS/t1;LS/o1;I)V

    invoke-interface {p3, v0}, LV/e1;->a(Lx7/p;)V

    :cond_c
    return-void
.end method

.method public static final t(LS/c;Landroidx/compose/ui/d;LS/o1;ZLV/n;II)V
    .locals 9

    .prologue
    const/4 v0, 0x2

    const/16 v1, 0x30

    const/4 v2, 0x6

    const/4 v3, 0x4

    const v4, 0x4a7b40bf    # 4116527.8f

    invoke-interface {p4, v4}, LV/n;->r(I)LV/n;

    move-result-object p4

    const/4 v5, 0x1

    and-int/lit8 v6, p6, 0x1

    if-eqz v6, :cond_0

    or-int/lit8 v6, p5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v6, p5, 0x6

    if-nez v6, :cond_2

    invoke-interface {p4, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v0

    :goto_0
    or-int/2addr v6, p5

    goto :goto_1

    :cond_2
    move v6, p5

    :goto_1
    and-int/2addr v0, p6

    if-eqz v0, :cond_3

    or-int/2addr v6, v1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, p5, 0x30

    if-nez v7, :cond_5

    invoke-interface {p4, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_5
    :goto_3
    and-int/lit16 v7, p5, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_6

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit8 v7, p6, 0x8

    if-eqz v7, :cond_8

    or-int/lit16 v6, v6, 0xc00

    goto :goto_6

    :cond_8
    and-int/lit16 v7, p5, 0xc00

    if-nez v7, :cond_a

    invoke-interface {p4, p3}, LV/n;->d(Z)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_5

    :cond_9
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v6, v7

    :cond_a
    :goto_6
    and-int/lit16 v7, v6, 0x493

    const/16 v8, 0x492

    if-ne v7, v8, :cond_d

    invoke-interface {p4}, LV/n;->u()Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_8

    :cond_b
    invoke-interface {p4}, LV/n;->A()V

    :cond_c
    :goto_7
    move-object v3, p1

    move-object v4, p2

    goto/16 :goto_d

    :cond_d
    :goto_8
    invoke-interface {p4}, LV/n;->q()V

    and-int/lit8 v7, p5, 0x1

    if-eqz v7, :cond_f

    invoke-interface {p4}, LV/n;->G()Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_a

    :cond_e
    invoke-interface {p4}, LV/n;->A()V

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_11

    :goto_9
    and-int/lit16 v6, v6, -0x381

    goto :goto_b

    :cond_f
    :goto_a
    if-eqz v0, :cond_10

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_10
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_11

    sget-object p2, LS/p1;->a:LS/p1;

    invoke-virtual {p2, p4, v2}, LS/p1;->a(LV/n;I)LS/o1;

    move-result-object p2

    goto :goto_9

    :cond_11
    :goto_b
    invoke-interface {p4}, LV/n;->R()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    const/4 v0, -0x1

    const-string v3, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:929)"

    invoke-static {v4, v6, v0, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_12
    sget-object v0, LS/q1$E;->D:LS/q1$E;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {p1, v4, v0, v5, v3}, LK0/n;->d(Landroidx/compose/ui/d;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v3, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v3}, Lh0/c$a;->g()Lh0/c$b;

    move-result-object v3

    sget-object v5, LA/b;->a:LA/b;

    invoke-virtual {v5}, LA/b;->g()LA/b$m;

    move-result-object v5

    invoke-static {v5, v3, p4, v1}, LA/i;->a(LA/b$m;Lh0/c$b;LV/n;I)LD0/I;

    move-result-object v1

    invoke-static {p4, v4}, LV/k;->a(LV/n;I)I

    move-result v3

    invoke-interface {p4}, LV/n;->F()LV/z;

    move-result-object v4

    invoke-static {p4, v0}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    sget-object v5, LF0/g;->a:LF0/g$a;

    invoke-virtual {v5}, LF0/g$a;->a()Lx7/a;

    move-result-object v7

    invoke-interface {p4}, LV/n;->v()LV/g;

    move-result-object v8

    instance-of v8, v8, LV/g;

    if-nez v8, :cond_13

    invoke-static {}, LV/k;->c()V

    :cond_13
    invoke-interface {p4}, LV/n;->t()V

    invoke-interface {p4}, LV/n;->o()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {p4, v7}, LV/n;->B(Lx7/a;)V

    goto :goto_c

    :cond_14
    invoke-interface {p4}, LV/n;->H()V

    :goto_c
    invoke-static {p4}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v7

    invoke-virtual {v5}, LF0/g$a;->c()Lx7/p;

    move-result-object v8

    invoke-static {v7, v1, v8}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->e()Lx7/p;

    move-result-object v1

    invoke-static {v7, v4, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v5}, LF0/g$a;->b()Lx7/p;

    move-result-object v1

    invoke-interface {v7}, LV/n;->o()Z

    move-result v4

    if-nez v4, :cond_15

    invoke-interface {v7}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v1}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_16
    invoke-virtual {v5}, LF0/g$a;->d()Lx7/p;

    move-result-object v1

    invoke-static {v7, v0, v1}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v0, LA/l;->a:LA/l;

    and-int/lit8 v0, v6, 0xe

    shr-int/lit8 v1, v6, 0x3

    and-int/lit8 v3, v1, 0x70

    or-int/2addr v0, v3

    invoke-static {p0, p2, p4, v0}, LS/q1;->r(LS/t1;LS/o1;LV/n;I)V

    sget-object v3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    sget v4, LS/q1;->c:F

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/p;->g(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v4

    invoke-static {v4, p4, v2}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    and-int/lit16 v1, v1, 0x380

    or-int/2addr v0, v1

    invoke-static {p0, p2, p3, p4, v0}, LS/q1;->c(LS/c;LS/o1;ZLV/n;I)V

    sget v0, LS/q1;->d:F

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/p;->g(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {v0, p4, v2}, LA/N;->a(Landroidx/compose/ui/d;LV/n;I)V

    invoke-interface {p4}, LV/n;->Q()V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LV/q;->P()V

    goto/16 :goto_7

    :goto_d
    invoke-interface {p4}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_17

    new-instance p2, LS/q1$F;

    move-object v1, p2

    move-object v2, p0

    move v5, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, LS/q1$F;-><init>(LS/c;Landroidx/compose/ui/d;LS/o1;ZII)V

    invoke-interface {p1, p2}, LV/e1;->a(Lx7/p;)V

    :cond_17
    return-void
.end method

.method public static final synthetic u(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, LS/q1;->a(Landroidx/compose/ui/d;FLx7/p;LV/n;II)V

    return-void
.end method

.method public static final synthetic v(LS/t1;LS/o1;LV/n;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LS/q1;->b(LS/t1;LS/o1;LV/n;I)V

    return-void
.end method

.method public static final synthetic w(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, LS/q1;->d(Landroidx/compose/ui/d;LS/c;IZLV/n;I)V

    return-void
.end method

.method public static final synthetic x(LV/w0;)J
    .locals 2

    invoke-static {p0}, LS/q1;->e(LV/w0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic y(LV/w0;J)V
    .locals 0

    invoke-static {p0, p1, p2}, LS/q1;->f(LV/w0;J)V

    return-void
.end method

.method public static final synthetic z(LV/w0;)J
    .locals 2

    invoke-static {p0}, LS/q1;->g(LV/w0;)J

    move-result-wide v0

    return-wide v0
.end method
