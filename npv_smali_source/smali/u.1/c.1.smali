.class public abstract Lu/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lu/l0;

.field private static final b:Lu/l0;

.field private static final c:Lu/l0;

.field private static final d:Lu/l0;

.field private static final e:Lu/l0;

.field private static final f:Lu/l0;

.field private static final g:Lu/l0;

.field private static final h:Lu/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, v1, v2, v0, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->a:Lu/l0;

    sget-object v0, LY0/i;->D:LY0/i$a;

    invoke-static {v0}, Lu/Q0;->a(LY0/i$a;)F

    move-result v0

    invoke-static {v0}, LY0/i;->m(F)LY0/i;

    move-result-object v0

    const/4 v3, 0x3

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->b:Lu/l0;

    sget-object v0, Ln0/m;->b:Ln0/m$a;

    invoke-static {v0}, Lu/Q0;->f(Ln0/m$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/m;->c(J)Ln0/m;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->c:Lu/l0;

    sget-object v0, Ln0/g;->b:Ln0/g$a;

    invoke-static {v0}, Lu/Q0;->e(Ln0/g$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, Ln0/g;->d(J)Ln0/g;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->d:Lu/l0;

    sget-object v0, Ln0/i;->e:Ln0/i$a;

    invoke-static {v0}, Lu/Q0;->g(Ln0/i$a;)Ln0/i;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->e:Lu/l0;

    sget-object v0, Ly7/s;->a:Ly7/s;

    invoke-static {v0}, Lu/Q0;->b(Ly7/s;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->f:Lu/l0;

    sget-object v0, LY0/p;->b:LY0/p$a;

    invoke-static {v0}, Lu/Q0;->c(LY0/p$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/p;->b(J)LY0/p;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->g:Lu/l0;

    sget-object v0, LY0/t;->b:LY0/t$a;

    invoke-static {v0}, Lu/Q0;->d(LY0/t$a;)J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/t;->b(J)LY0/t;

    move-result-object v0

    invoke-static {v1, v1, v0, v3, v2}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v0

    sput-object v0, Lu/c;->h:Lu/l0;

    return-void
.end method

.method public static final synthetic a(LV/G1;)Lx7/l;
    .locals 0

    invoke-static {p0}, Lu/c;->f(LV/G1;)Lx7/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LV/G1;)Lu/j;
    .locals 0

    invoke-static {p0}, Lu/c;->g(LV/G1;)Lu/j;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FLu/j;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;
    .locals 9

    .prologue
    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    sget-object p1, Lu/c;->b:Lu/l0;

    :cond_0
    move-object v2, p1

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_1

    const-string p2, "DpAnimation"

    :cond_1
    move-object v4, p2

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_2

    const/4 p3, 0x0

    :cond_2
    move-object v5, p3

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    const-string p2, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)"

    const p3, -0x53df67ee

    invoke-static {p3, p5, p1, p2}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_3
    invoke-static {p0}, LY0/i;->m(F)LY0/i;

    move-result-object v0

    sget-object p0, LY0/i;->D:LY0/i$a;

    invoke-static {p0}, Lu/z0;->b(LY0/i$a;)Lu/x0;

    move-result-object v1

    and-int/lit8 p0, p5, 0xe

    shl-int/lit8 p1, p5, 0x3

    and-int/lit16 p1, p1, 0x380

    or-int/2addr p0, p1

    shl-int/lit8 p1, p5, 0x6

    const p2, 0xe000

    and-int/2addr p2, p1

    or-int/2addr p0, p2

    const/high16 p2, 0x70000

    and-int/2addr p1, p2

    or-int v7, p0, p1

    const/16 v8, 0x8

    const/4 v3, 0x0

    move-object v6, p4

    invoke-static/range {v0 .. v8}, Lu/c;->e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object p0

    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LV/q;->P()V

    :cond_4
    return-object p0
.end method

.method public static final d(FLu/j;FLjava/lang/String;Lx7/l;LV/n;II)LV/G1;
    .locals 11

    .prologue
    move-object/from16 v6, p5

    move/from16 v0, p6

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_0

    sget-object v1, Lu/c;->a:Lu/l0;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_1

    const v2, 0x3c23d70a    # 0.01f

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v3, p7, 0x8

    if-eqz v3, :cond_2

    const-string v3, "FloatAnimation"

    move-object v4, v3

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v3, p7, 0x10

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    move-object v7, v5

    goto :goto_3

    :cond_3
    move-object v7, p4

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v8, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)"

    const v9, 0x27ddbb58

    invoke-static {v9, v0, v3, v8}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object v3, Lu/c;->a:Lu/l0;

    const/4 v8, 0x3

    if-ne v1, v3, :cond_a

    const v1, 0x431745d7

    invoke-interface {v6, v1}, LV/n;->T(I)V

    and-int/lit16 v1, v0, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v3, 0x100

    if-le v1, v3, :cond_5

    invoke-interface {v6, v2}, LV/n;->h(F)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    and-int/lit16 v1, v0, 0x180

    if-ne v1, v3, :cond_7

    :cond_6
    const/4 v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v1, 0x0

    :goto_4
    invoke-interface/range {p5 .. p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_9

    :cond_8
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3, v3, v1, v8, v5}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v3

    invoke-interface {v6, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lu/l0;

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    goto :goto_5

    :cond_a
    const v3, 0x4318f33d

    invoke-interface {v6, v3}, LV/n;->T(I)V

    invoke-interface/range {p5 .. p5}, LV/n;->J()V

    move-object v3, v1

    :goto_5
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    sget-object v5, Ly7/m;->a:Ly7/m;

    invoke-static {v5}, Lu/z0;->i(Ly7/m;)Lu/x0;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    and-int/lit8 v2, v0, 0xe

    shl-int/2addr v0, v8

    and-int/lit16 v8, v0, 0x1c00

    or-int/2addr v2, v8

    const v8, 0xe000

    and-int/2addr v8, v0

    or-int/2addr v2, v8

    const/high16 v8, 0x70000

    and-int/2addr v0, v8

    or-int v8, v2, v0

    const/4 v10, 0x0

    move-object v0, v1

    move-object v1, v5

    move-object v2, v3

    move-object v3, v9

    move-object v5, v7

    move-object/from16 v6, p5

    move v7, v8

    move v8, v10

    invoke-static/range {v0 .. v8}, Lu/c;->e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;

    move-result-object v0

    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    return-object v0
.end method

.method public static final e(Ljava/lang/Object;Lu/x0;Lu/j;Ljava/lang/Object;Ljava/lang/String;Lx7/l;LV/n;II)LV/G1;
    .locals 14

    .prologue
    move-object v0, p0

    move-object/from16 v1, p6

    move/from16 v2, p7

    and-int/lit8 v3, p8, 0x4

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, LV/n;->a:LV/n$a;

    invoke-virtual {v5}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v3, v5, :cond_0

    const/4 v3, 0x7

    const/4 v5, 0x0

    invoke-static {v5, v5, v4, v3, v4}, Lu/k;->j(FFLjava/lang/Object;ILjava/lang/Object;)Lu/l0;

    move-result-object v3

    invoke-interface {v1, v3}, LV/n;->K(Ljava/lang/Object;)V

    :cond_0
    check-cast v3, Lu/l0;

    goto :goto_0

    :cond_1
    move-object/from16 v3, p2

    :goto_0
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_2

    move-object v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_3

    const-string v6, "ValueAnimation"

    goto :goto_2

    :cond_3
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v7, p8, 0x20

    if-eqz v7, :cond_4

    move-object v7, v4

    goto :goto_3

    :cond_4
    move-object/from16 v7, p5

    :goto_3
    invoke-static {}, LV/q;->H()Z

    move-result v8

    const/4 v9, -0x1

    if-eqz v8, :cond_5

    const v8, -0x76dfbb5c

    const-string v10, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)"

    invoke-static {v8, v2, v9, v10}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_5
    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v8

    sget-object v10, LV/n;->a:LV/n$a;

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v11

    if-ne v8, v11, :cond_6

    const/4 v8, 0x2

    invoke-static {v4, v4, v8, v4}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object v8

    invoke-interface {v1, v8}, LV/n;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, LV/w0;

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v11, v12, :cond_7

    new-instance v11, Lu/a;

    move-object v12, p1

    invoke-direct {v11, p0, p1, v5, v6}, Lu/a;-><init>(Ljava/lang/Object;Lu/x0;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, v11}, LV/n;->K(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lu/a;

    shr-int/lit8 v6, v2, 0xf

    and-int/lit8 v6, v6, 0xe

    invoke-static {v7, v1, v6}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v6

    if-eqz v5, :cond_8

    instance-of v7, v3, Lu/l0;

    if-eqz v7, :cond_8

    move-object v7, v3

    check-cast v7, Lu/l0;

    invoke-virtual {v7}, Lu/l0;->h()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    invoke-virtual {v7}, Lu/l0;->f()F

    move-result v3

    invoke-virtual {v7}, Lu/l0;->g()F

    move-result v7

    invoke-static {v3, v7, v5}, Lu/k;->i(FFLjava/lang/Object;)Lu/l0;

    move-result-object v3

    :cond_8
    const/4 v5, 0x0

    invoke-static {v3, v1, v5}, LV/v1;->n(Ljava/lang/Object;LV/n;I)LV/G1;

    move-result-object v3

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x6

    if-ne v7, v12, :cond_9

    invoke-static {v9, v4, v4, v13, v4}, LY8/m;->b(ILY8/d;Lx7/l;ILjava/lang/Object;)LY8/j;

    move-result-object v7

    invoke-interface {v1, v7}, LV/n;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, LY8/j;

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v9, v2, 0xe

    xor-int/2addr v9, v13

    const/4 v12, 0x4

    if-le v9, v12, :cond_a

    invoke-interface {v1, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    and-int/2addr v2, v13

    if-ne v2, v12, :cond_c

    :cond_b
    const/4 v2, 0x1

    goto :goto_4

    :cond_c
    move v2, v5

    :goto_4
    or-int/2addr v2, v4

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_d

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_e

    :cond_d
    new-instance v4, Lu/c$a;

    invoke-direct {v4, v7, p0}, Lu/c$a;-><init>(LY8/j;Ljava/lang/Object;)V

    invoke-interface {v1, v4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lx7/a;

    invoke-static {v4, v1, v5}, LV/Q;->f(Lx7/a;LV/n;I)V

    invoke-interface {v1, v7}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v1, v11}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v1, v3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v1, v6}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface/range {p6 .. p6}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_f

    invoke-virtual {v10}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_10

    :cond_f
    new-instance v2, Lu/c$b;

    const/4 v0, 0x0

    move-object p0, v2

    move-object p1, v7

    move-object/from16 p2, v11

    move-object/from16 p3, v3

    move-object/from16 p4, v6

    move-object/from16 p5, v0

    invoke-direct/range {p0 .. p5}, Lu/c$b;-><init>(LY8/j;Lu/a;LV/G1;LV/G1;Lm7/e;)V

    invoke-interface {v1, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lx7/p;

    invoke-static {v7, v2, v1, v5}, LV/Q;->e(Ljava/lang/Object;Lx7/p;LV/n;I)V

    invoke-interface {v8}, LV/w0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LV/G1;

    if-nez v0, :cond_11

    invoke-virtual {v11}, Lu/a;->g()LV/G1;

    move-result-object v0

    :cond_11
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {}, LV/q;->P()V

    :cond_12
    return-object v0
.end method

.method private static final f(LV/G1;)Lx7/l;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/l;

    return-object p0
.end method

.method private static final g(LV/G1;)Lu/j;
    .locals 0

    invoke-interface {p0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu/j;

    return-object p0
.end method
