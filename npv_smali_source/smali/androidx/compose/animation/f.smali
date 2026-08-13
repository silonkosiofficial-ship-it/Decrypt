.class public abstract Landroidx/compose/animation/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/x0;

.field private static final b:Lu/l0;

.field private static final c:Lu/l0;

.field private static final d:Lu/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Landroidx/compose/animation/f$a;->D:Landroidx/compose/animation/f$a;

    sget-object v1, Landroidx/compose/animation/f$b;->D:Landroidx/compose/animation/f$b;

    invoke-static {v0, v1}, Lu/z0;->a(Lx7/l;Lx7/l;)Lu/x0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/f;->a:Lu/x0;

    const/4 v0, 0x5

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v0, v3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/f;->b:Lu/l0;

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-static {v0}, Lu/Q0;->c(LY0/p$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/p;->b(J)LY0/p;

    move-result-object v0

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v4, v3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/f;->c:Lu/l0;

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-static {v0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v5

    invoke-static {v5, v6}, LY0/t;->b(J)LY0/t;

    move-result-object v0

    invoke-static {v1, v2, v0, v4, v3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Landroidx/compose/animation/f;->d:Lu/l0;

    return-void
.end method

.method public static synthetic A(Lu/I;Lh0/c$c;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->a()Lh0/c$c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$t;->D:Landroidx/compose/animation/f$t;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->z(Lu/I;Lh0/c$c;ZLx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static final B(Lu/I;Lx7/l;)Landroidx/compose/animation/h;
    .locals 11

    new-instance v0, Landroidx/compose/animation/i;

    new-instance v10, Lt/C;

    new-instance v3, Lt/y;

    invoke-direct {v3, p1, p0}, Lt/y;-><init>(Lx7/l;Lu/I;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/i;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static final C(Lu/I;Lx7/l;)Landroidx/compose/animation/h;
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$w;

    invoke-direct {v0, p1}, Landroidx/compose/animation/f$w;-><init>(Lx7/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/f;->B(Lu/I;Lx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lu/I;Lx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .prologue
    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    sget-object p0, LY0/p;->b:LY0/p$a;

    invoke-static {p0}, Lu/Q0;->c(LY0/p$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->b(J)LY0/p;

    move-result-object p0

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2, p3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Landroidx/compose/animation/f$v;->D:Landroidx/compose/animation/f$v;

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->C(Lu/I;Lx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final E(Lu/I;Lx7/l;)Landroidx/compose/animation/j;
    .locals 11

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    new-instance v3, Lt/y;

    invoke-direct {v3, p1, p0}, Lt/y;-><init>(Lx7/l;Lu/I;)V

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static final F(Lu/I;Lx7/l;)Landroidx/compose/animation/j;
    .locals 1

    new-instance v0, Landroidx/compose/animation/f$y;

    invoke-direct {v0, p1}, Landroidx/compose/animation/f$y;-><init>(Lx7/l;)V

    invoke-static {p0, v0}, Landroidx/compose/animation/f;->E(Lu/I;Lx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lu/I;Lx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .prologue
    and-int/lit8 p3, p2, 0x1

    if-eqz p3, :cond_0

    sget-object p0, LY0/p;->b:LY0/p$a;

    invoke-static {p0}, Lu/Q0;->c(LY0/p$a;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/p;->b(J)LY0/p;

    move-result-object p0

    const/4 p3, 0x0

    const/4 v0, 0x0

    const/high16 v1, 0x43c80000    # 400.0f

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2, p3}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object p1, Landroidx/compose/animation/f$x;->D:Landroidx/compose/animation/f$x;

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->F(Lu/I;Lx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method private static final H(Lh0/c$b;)Lh0/c;
    .locals 2

    .prologue
    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->k()Lh0/c$b;

    move-result-object v1

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lh0/c$a;->h()Lh0/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh0/c$a;->j()Lh0/c$b;

    move-result-object v1

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lh0/c$a;->f()Lh0/c;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lh0/c$a;->e()Lh0/c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method private static final I(Lh0/c$c;)Lh0/c;
    .locals 2

    .prologue
    sget-object v0, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {v0}, Lh0/c$a;->l()Lh0/c$c;

    move-result-object v1

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lh0/c$a;->m()Lh0/c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh0/c$a;->a()Lh0/c$c;

    move-result-object v1

    invoke-static {p0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lh0/c$a;->b()Lh0/c;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lh0/c$a;->e()Lh0/c;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final J(Lu/s0;Landroidx/compose/animation/h;LV/n;I)Landroidx/compose/animation/h;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:910)"

    const v2, 0x149cfa6

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LV/w0;

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lt/m;->D:Lt/m;

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v0, p1}, Landroidx/compose/animation/f;->L(LV/w0;Landroidx/compose/animation/h;)V

    goto :goto_2

    :cond_6
    sget-object p0, Landroidx/compose/animation/h;->a:Landroidx/compose/animation/h$a;

    invoke-virtual {p0}, Landroidx/compose/animation/h$a;->a()Landroidx/compose/animation/h;

    move-result-object p0

    :goto_1
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->L(LV/w0;Landroidx/compose/animation/h;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lt/m;->D:Lt/m;

    if-ne p0, p2, :cond_8

    invoke-static {v0}, Landroidx/compose/animation/f;->K(LV/w0;)Landroidx/compose/animation/h;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/animation/h;->c(Landroidx/compose/animation/h;)Landroidx/compose/animation/h;

    move-result-object p0

    goto :goto_1

    :cond_8
    :goto_2
    invoke-static {v0}, Landroidx/compose/animation/f;->K(LV/w0;)Landroidx/compose/animation/h;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object p0
.end method

.method private static final K(LV/w0;)Landroidx/compose/animation/h;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/h;

    return-object p0
.end method

.method private static final L(LV/w0;Landroidx/compose/animation/h;)V
    .locals 0

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final M(Lu/s0;Landroidx/compose/animation/j;LV/n;I)Landroidx/compose/animation/j;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:930)"

    const v2, -0x514aece4

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p3, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v1, :cond_3

    :cond_2
    const/4 p3, 0x1

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    :goto_0
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_4

    sget-object p3, LV/n;->a:LV/n$a;

    invoke-virtual {p3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_5

    :cond_4
    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, v0}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v0

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LV/w0;

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lt/m;->D:Lt/m;

    if-ne p2, p3, :cond_7

    invoke-virtual {p0}, Lu/s0;->u()Z

    move-result p0

    if-eqz p0, :cond_6

    invoke-static {v0, p1}, Landroidx/compose/animation/f;->O(LV/w0;Landroidx/compose/animation/j;)V

    goto :goto_2

    :cond_6
    sget-object p0, Landroidx/compose/animation/j;->a:Landroidx/compose/animation/j$a;

    invoke-virtual {p0}, Landroidx/compose/animation/j$a;->a()Landroidx/compose/animation/j;

    move-result-object p0

    :goto_1
    invoke-static {v0, p0}, Landroidx/compose/animation/f;->O(LV/w0;Landroidx/compose/animation/j;)V

    goto :goto_2

    :cond_7
    invoke-virtual {p0}, Lu/s0;->p()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lt/m;->D:Lt/m;

    if-eq p0, p2, :cond_8

    invoke-static {v0}, Landroidx/compose/animation/f;->N(LV/w0;)Landroidx/compose/animation/j;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroidx/compose/animation/j;->c(Landroidx/compose/animation/j;)Landroidx/compose/animation/j;

    move-result-object p0

    goto :goto_1

    :cond_8
    :goto_2
    invoke-static {v0}, Landroidx/compose/animation/f;->N(LV/w0;)Landroidx/compose/animation/j;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LV/q;->P()V

    :cond_9
    return-object p0
.end method

.method private static final N(LV/w0;)Landroidx/compose/animation/j;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/animation/j;

    return-object p0
.end method

.method private static final O(LV/w0;Landroidx/compose/animation/j;)V
    .locals 0

    invoke-interface {p0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lu/s0$a;Lu/s0$a;Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lu/s0$a;)Lx7/l;
    .locals 0

    invoke-static/range {p0 .. p5}, Landroidx/compose/animation/f;->f(Lu/s0$a;Lu/s0$a;Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lu/s0$a;)Lx7/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lu/l0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/f;->b:Lu/l0;

    return-object v0
.end method

.method public static final synthetic c()Lu/l0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/f;->c:Lu/l0;

    return-object v0
.end method

.method public static final synthetic d()Lu/l0;
    .locals 1

    sget-object v0, Landroidx/compose/animation/f;->d:Lu/l0;

    return-object v0
.end method

.method private static final e(Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LV/n;I)Lt/r;
    .locals 20

    .prologue
    move-object/from16 v0, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:958)"

    const v3, 0x264802d5

    invoke-static {v3, v8, v1, v2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->c()Lt/o;

    move-result-object v1

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v1, :cond_2

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->c()Lt/o;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v10

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v9

    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v2

    invoke-virtual {v2}, Lt/C;->e()Lt/v;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-virtual/range {p2 .. p2}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v2

    invoke-virtual {v2}, Lt/C;->e()Lt/v;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    move v11, v10

    goto :goto_3

    :cond_4
    :goto_2
    move v11, v9

    :goto_3
    const/4 v12, 0x0

    if-eqz v1, :cond_6

    const v1, -0x28419f14

    invoke-interface {v7, v1}, LV/n;->T(I)V

    sget-object v1, Ly7/m;->a:Ly7/m;

    invoke-static {v1}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v2

    invoke-interface/range {p4 .. p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v1, v3, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " alpha"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    and-int/lit8 v1, v8, 0xe

    or-int/lit16 v5, v1, 0x180

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p4

    invoke-static/range {v1 .. v6}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v1

    invoke-interface/range {p4 .. p4}, LV/n;->J()V

    move-object v14, v1

    goto :goto_4

    :cond_6
    const v1, -0x283f88d1

    invoke-interface {v7, v1}, LV/n;->T(I)V

    invoke-interface/range {p4 .. p4}, LV/n;->J()V

    move-object v14, v12

    :goto_4
    if-eqz v11, :cond_8

    const v1, -0x283ea3b4

    invoke-interface {v7, v1}, LV/n;->T(I)V

    sget-object v1, Ly7/m;->a:Ly7/m;

    invoke-static {v1}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v1

    invoke-interface/range {p4 .. p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LV/n;->a:LV/n$a;

    invoke-virtual {v3}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " scale"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v7, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Ljava/lang/String;

    and-int/lit8 v0, v8, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p4

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v0

    invoke-interface/range {p4 .. p4}, LV/n;->J()V

    move-object v15, v0

    goto :goto_5

    :cond_8
    const v0, -0x283c8d71

    invoke-interface {v7, v0}, LV/n;->T(I)V

    invoke-interface/range {p4 .. p4}, LV/n;->J()V

    move-object v15, v12

    :goto_5
    if-eqz v11, :cond_9

    const v0, -0x283b7fa4

    invoke-interface {v7, v0}, LV/n;->T(I)V

    sget-object v1, Landroidx/compose/animation/f;->a:Lu/x0;

    and-int/lit8 v0, v8, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x0

    const-string v2, "TransformOriginInterruptionHandling"

    move-object/from16 v0, p0

    move-object/from16 v3, p4

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v12

    :goto_6
    invoke-interface/range {p4 .. p4}, LV/n;->J()V

    goto :goto_7

    :cond_9
    const v0, -0x28392d51

    invoke-interface {v7, v0}, LV/n;->T(I)V

    goto :goto_6

    :goto_7
    invoke-interface {v7, v14}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v1, v8, 0x70

    xor-int/lit8 v1, v1, 0x30

    const/16 v2, 0x20

    if-le v1, v2, :cond_a

    move-object/from16 v1, p1

    invoke-interface {v7, v1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_8

    :cond_a
    move-object/from16 v1, p1

    :goto_8
    and-int/lit8 v3, v8, 0x30

    if-ne v3, v2, :cond_c

    :cond_b
    move v2, v9

    goto :goto_9

    :cond_c
    move v2, v10

    :goto_9
    or-int/2addr v0, v2

    and-int/lit16 v2, v8, 0x380

    xor-int/lit16 v2, v2, 0x180

    const/16 v3, 0x100

    if-le v2, v3, :cond_d

    move-object/from16 v2, p2

    invoke-interface {v7, v2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    goto :goto_a

    :cond_d
    move-object/from16 v2, p2

    :goto_a
    and-int/lit16 v4, v8, 0x180

    if-ne v4, v3, :cond_f

    :cond_e
    move v3, v9

    goto :goto_b

    :cond_f
    move v3, v10

    :goto_b
    or-int/2addr v0, v3

    invoke-interface {v7, v15}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    and-int/lit8 v3, v8, 0xe

    xor-int/lit8 v3, v3, 0x6

    const/4 v4, 0x4

    if-le v3, v4, :cond_10

    move-object/from16 v3, p0

    invoke-interface {v7, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    goto :goto_c

    :cond_10
    move-object/from16 v3, p0

    :goto_c
    and-int/lit8 v5, v8, 0x6

    if-ne v5, v4, :cond_11

    goto :goto_d

    :cond_11
    move v9, v10

    :cond_12
    :goto_d
    or-int/2addr v0, v9

    invoke-interface {v7, v12}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-interface/range {p4 .. p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_13

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v4, v0, :cond_14

    :cond_13
    new-instance v4, Lt/n;

    move-object v13, v4

    move-object/from16 v16, p0

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    move-object/from16 v19, v12

    invoke-direct/range {v13 .. v19}, Lt/n;-><init>(Lu/s0$a;Lu/s0$a;Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lu/s0$a;)V

    invoke-interface {v7, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lt/r;

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-static {}, LV/q;->P()V

    :cond_15
    return-object v4
.end method

.method private static final f(Lu/s0$a;Lu/s0$a;Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lu/s0$a;)Lx7/l;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-eqz p0, :cond_0

    new-instance v1, Landroidx/compose/animation/f$c;

    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/f$c;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    new-instance v2, Landroidx/compose/animation/f$d;

    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/f$d;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    invoke-virtual {p0, v1, v2}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p1, :cond_1

    new-instance v1, Landroidx/compose/animation/f$f;

    invoke-direct {v1, p3, p4}, Landroidx/compose/animation/f$f;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    new-instance v2, Landroidx/compose/animation/f$g;

    invoke-direct {v2, p3, p4}, Landroidx/compose/animation/f$g;-><init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    invoke-virtual {p1, v1, v2}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    invoke-virtual {p2}, Lu/s0;->i()Ljava/lang/Object;

    move-result-object p2

    sget-object v1, Lt/m;->C:Lt/m;

    if-ne p2, v1, :cond_4

    invoke-virtual {p3}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p2

    invoke-virtual {p2}, Lt/C;->e()Lt/v;

    move-result-object p2

    if-eqz p2, :cond_2

    :goto_2
    invoke-virtual {p2}, Lt/v;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/f;->b(J)Landroidx/compose/ui/graphics/f;

    move-result-object p2

    goto :goto_3

    :cond_2
    invoke-virtual {p4}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p2

    invoke-virtual {p2}, Lt/C;->e()Lt/v;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v0

    goto :goto_3

    :cond_4
    invoke-virtual {p4}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object p2

    invoke-virtual {p2}, Lt/C;->e()Lt/v;

    move-result-object p2

    if-eqz p2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object p2

    invoke-virtual {p2}, Lt/C;->e()Lt/v;

    move-result-object p2

    if-eqz p2, :cond_3

    goto :goto_2

    :goto_3
    if-eqz p5, :cond_6

    sget-object v0, Landroidx/compose/animation/f$h;->D:Landroidx/compose/animation/f$h;

    new-instance v1, Landroidx/compose/animation/f$i;

    invoke-direct {v1, p2, p3, p4}, Landroidx/compose/animation/f$i;-><init>(Landroidx/compose/ui/graphics/f;Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V

    invoke-virtual {p5, v0, v1}, Lu/s0$a;->a(Lx7/l;Lx7/l;)LV/G1;

    move-result-object v0

    :cond_6
    new-instance p2, Landroidx/compose/animation/f$e;

    invoke-direct {p2, p0, p1, v0}, Landroidx/compose/animation/f$e;-><init>(LV/G1;LV/G1;LV/G1;)V

    return-object p2
.end method

.method public static final g(Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Ljava/lang/String;LV/n;II)Landroidx/compose/ui/d;
    .locals 21

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v9, p6

    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_0

    sget-object v0, Landroidx/compose/animation/f$j;->D:Landroidx/compose/animation/f$j;

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, p3

    :goto_0
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:869)"

    const v2, 0x1af3d96

    invoke-static {v2, v9, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 v11, v9, 0xe

    and-int/lit8 v0, v9, 0x7e

    move-object/from16 v1, p1

    invoke-static {v6, v1, v8, v0}, Landroidx/compose/animation/f;->J(Lu/s0;Landroidx/compose/animation/h;LV/n;I)Landroidx/compose/animation/h;

    move-result-object v12

    shr-int/lit8 v13, v9, 0x3

    and-int/lit8 v0, v13, 0x70

    or-int/2addr v0, v11

    move-object/from16 v1, p2

    invoke-static {v6, v1, v8, v0}, Landroidx/compose/animation/f;->M(Lu/s0;Landroidx/compose/animation/j;LV/n;I)Landroidx/compose/animation/j;

    move-result-object v14

    invoke-virtual {v12}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->f()Lt/y;

    move-result-object v0

    const/4 v15, 0x1

    const/16 v16, 0x0

    if-nez v0, :cond_3

    invoke-virtual {v14}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->f()Lt/y;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v0, v16

    goto :goto_2

    :cond_3
    :goto_1
    move v0, v15

    :goto_2
    invoke-virtual {v12}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->a()Lt/i;

    move-result-object v1

    if-nez v1, :cond_5

    invoke-virtual {v14}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v1

    invoke-virtual {v1}, Lt/C;->a()Lt/i;

    move-result-object v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v17, v16

    goto :goto_4

    :cond_5
    :goto_3
    move/from16 v17, v15

    :goto_4
    const/16 v18, 0x0

    if-eqz v0, :cond_7

    const v0, -0x30f533db

    invoke-interface {v8, v0}, LV/n;->T(I)V

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-static {v0}, Lu/z0;->d(LY0/p$a;)Lu/x0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " slide"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object/from16 v19, v0

    goto :goto_5

    :cond_7
    const v0, -0x30f3b590

    invoke-interface {v8, v0}, LV/n;->T(I)V

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object/from16 v19, v18

    :goto_5
    if-eqz v17, :cond_9

    const v0, -0x30f28d01

    invoke-interface {v8, v0}, LV/n;->T(I)V

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-static {v0}, Lu/z0;->e(LY0/t$a;)Lu/x0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " shrink/expand"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object/from16 v20, v0

    goto :goto_6

    :cond_9
    const v0, -0x30f0fa21

    invoke-interface {v8, v0}, LV/n;->T(I)V

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object/from16 v20, v18

    :goto_6
    if-eqz v17, :cond_b

    const v0, -0x30effc12

    invoke-interface {v8, v0}, LV/n;->T(I)V

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-static {v0}, Lu/z0;->d(LY0/p$a;)Lu/x0;

    move-result-object v1

    invoke-interface/range {p5 .. p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LV/n;->a:LV/n$a;

    invoke-virtual {v2}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_a

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " InterruptionHandlingOffset"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    or-int/lit16 v4, v11, 0x180

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v3, p5

    invoke-static/range {v0 .. v5}, Lu/u0;->c(Lu/s0;Lu/x0;Ljava/lang/String;LV/n;II)Lu/s0$a;

    move-result-object v0

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object/from16 v18, v0

    goto :goto_7

    :cond_b
    const v0, -0x30edb141

    invoke-interface {v8, v0}, LV/n;->T(I)V

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    :goto_7
    invoke-virtual {v12}, Landroidx/compose/animation/h;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lt/i;->c()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Landroidx/compose/animation/j;->b()Lt/C;

    move-result-object v0

    invoke-virtual {v0}, Lt/C;->a()Lt/i;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lt/i;->c()Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_8

    :cond_d
    if-nez v17, :cond_e

    :goto_8
    move v5, v15

    goto :goto_9

    :cond_e
    move/from16 v5, v16

    :goto_9
    and-int/lit16 v0, v13, 0x1c00

    or-int/2addr v11, v0

    move-object/from16 v0, p0

    move-object v1, v12

    move-object v2, v14

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move v7, v5

    move v5, v11

    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/f;->e(Lu/s0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LV/n;I)Lt/r;

    move-result-object v11

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    invoke-interface {v8, v7}, LV/n;->d(Z)Z

    move-result v1

    and-int/lit16 v2, v9, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    const/16 v3, 0x800

    if-le v2, v3, :cond_f

    invoke-interface {v8, v10}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_f
    and-int/lit16 v2, v9, 0xc00

    if-ne v2, v3, :cond_10

    goto :goto_a

    :cond_10
    move/from16 v15, v16

    :cond_11
    :goto_a
    or-int/2addr v1, v15

    invoke-interface/range {p5 .. p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_13

    :cond_12
    new-instance v2, Landroidx/compose/animation/f$k;

    invoke-direct {v2, v7, v10}, Landroidx/compose/animation/f$k;-><init>(ZLx7/a;)V

    invoke-interface {v8, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Lx7/l;

    invoke-static {v0, v2}, Landroidx/compose/ui/graphics/b;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object v9

    new-instance v13, Landroidx/compose/animation/EnterExitTransitionElement;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    move-object v5, v12

    move-object v6, v14

    move-object v7, v10

    move-object v8, v11

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/EnterExitTransitionElement;-><init>(Lu/s0;Lu/s0$a;Lu/s0$a;Lu/s0$a;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lx7/a;Lt/r;)V

    invoke-interface {v9, v13}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {}, LV/q;->P()V

    :cond_14
    return-object v0
.end method

.method public static final h(Lu/I;Lh0/c$b;ZLx7/l;)Landroidx/compose/animation/h;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/f;->H(Lh0/c$b;)Lh0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/f$m;

    invoke-direct {v0, p3}, Landroidx/compose/animation/f$m;-><init>(Lx7/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->j(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lu/I;Lh0/c$b;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->j()Lh0/c$b;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$l;->D:Landroidx/compose/animation/f$l;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->h(Lu/I;Lh0/c$b;ZLx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/h;
    .locals 11

    new-instance v0, Landroidx/compose/animation/i;

    new-instance v10, Lt/C;

    new-instance v4, Lt/i;

    invoke-direct {v4, p1, p3, p0, p2}, Lt/i;-><init>(Lh0/c;Lx7/l;Lu/I;Z)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/i;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic k(Lu/I;Lh0/c;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->c()Lh0/c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$n;->D:Landroidx/compose/animation/f$n;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->j(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lu/I;Lh0/c$c;ZLx7/l;)Landroidx/compose/animation/h;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/f;->I(Lh0/c$c;)Lh0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/f$p;

    invoke-direct {v0, p3}, Landroidx/compose/animation/f$p;-><init>(Lx7/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->j(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lu/I;Lh0/c$c;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->a()Lh0/c$c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$o;->D:Landroidx/compose/animation/f$o;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->l(Lu/I;Lh0/c$c;ZLx7/l;)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lu/I;F)Landroidx/compose/animation/h;
    .locals 11

    new-instance v0, Landroidx/compose/animation/i;

    new-instance v10, Lt/C;

    new-instance v2, Lt/o;

    invoke-direct {v2, p1, p0}, Lt/o;-><init>(FLu/I;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/i;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic o(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 2

    .prologue
    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p3, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p3, v1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->n(Lu/I;F)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lu/I;F)Landroidx/compose/animation/j;
    .locals 11

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    new-instance v2, Lt/o;

    invoke-direct {v2, p1, p0}, Lt/o;-><init>(FLu/I;)V

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic q(Lu/I;FILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 2

    .prologue
    and-int/lit8 p3, p2, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p3, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p3, v1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    move p1, v0

    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/animation/f;->p(Lu/I;F)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lu/I;FJ)Landroidx/compose/animation/h;
    .locals 11

    new-instance v0, Landroidx/compose/animation/i;

    new-instance v10, Lt/C;

    new-instance v7, Lt/v;

    const/4 v6, 0x0

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lt/v;-><init>(FJLu/I;Ly7/k;)V

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 p0, 0x0

    move-object v1, v10

    move-object v5, v7

    move-object v7, p0

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/i;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic s(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/h;
    .locals 2

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p5, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p5, v1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p1, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p2

    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->r(Lu/I;FJ)Landroidx/compose/animation/h;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lu/I;FJ)Landroidx/compose/animation/j;
    .locals 11

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    new-instance v7, Lt/v;

    const/4 v6, 0x0

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-object v5, p0

    invoke-direct/range {v1 .. v6}, Lt/v;-><init>(FJLu/I;Ly7/k;)V

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 p0, 0x0

    move-object v1, v10

    move-object v5, v7

    move-object v7, p0

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic u(Lu/I;FJILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 2

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    const/high16 p0, 0x43c80000    # 400.0f

    const/4 p5, 0x5

    const/4 v1, 0x0

    invoke-static {v0, p0, v1, p5, v1}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p1, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p2, Landroidx/compose/ui/graphics/f;->b:Landroidx/compose/ui/graphics/f$a;

    invoke-virtual {p2}, Landroidx/compose/ui/graphics/f$a;->a()J

    move-result-wide p2

    :cond_2
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->t(Lu/I;FJ)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Lu/I;Lh0/c$b;ZLx7/l;)Landroidx/compose/animation/j;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/f;->H(Lh0/c$b;)Lh0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/f$r;

    invoke-direct {v0, p3}, Landroidx/compose/animation/f$r;-><init>(Lx7/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->x(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lu/I;Lh0/c$b;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->j()Lh0/c$b;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$q;->D:Landroidx/compose/animation/f$q;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->v(Lu/I;Lh0/c$b;ZLx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static final x(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/j;
    .locals 11

    new-instance v0, Landroidx/compose/animation/k;

    new-instance v10, Lt/C;

    new-instance v4, Lt/i;

    invoke-direct {v4, p1, p3, p0, p2}, Lt/i;-><init>(Lh0/c;Lx7/l;Lu/I;Z)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v10

    invoke-direct/range {v1 .. v9}, Lt/C;-><init>(Lt/o;Lt/y;Lt/i;Lt/v;ZLjava/util/Map;ILy7/k;)V

    invoke-direct {v0, v10}, Landroidx/compose/animation/k;-><init>(Lt/C;)V

    return-object v0
.end method

.method public static synthetic y(Lu/I;Lh0/c;ZLx7/l;ILjava/lang/Object;)Landroidx/compose/animation/j;
    .locals 3

    .prologue
    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    sget-object p0, LY0/t;->b:LY0/t$a;

    invoke-static {p0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/t;->b(J)LY0/t;

    move-result-object p0

    const/4 p5, 0x0

    const/4 v1, 0x0

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-static {v1, v2, p0, v0, p5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object p0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p1, Lh0/c;->a:Lh0/c$a;

    invoke-virtual {p1}, Lh0/c$a;->c()Lh0/c;

    move-result-object p1

    :cond_1
    and-int/lit8 p5, p4, 0x4

    if-eqz p5, :cond_2

    move p2, v0

    :cond_2
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_3

    sget-object p3, Landroidx/compose/animation/f$s;->D:Landroidx/compose/animation/f$s;

    :cond_3
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/animation/f;->x(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Lu/I;Lh0/c$c;ZLx7/l;)Landroidx/compose/animation/j;
    .locals 1

    invoke-static {p1}, Landroidx/compose/animation/f;->I(Lh0/c$c;)Lh0/c;

    move-result-object p1

    new-instance v0, Landroidx/compose/animation/f$u;

    invoke-direct {v0, p3}, Landroidx/compose/animation/f$u;-><init>(Lx7/l;)V

    invoke-static {p0, p1, p2, v0}, Landroidx/compose/animation/f;->x(Lu/I;Lh0/c;ZLx7/l;)Landroidx/compose/animation/j;

    move-result-object p0

    return-object p0
.end method
