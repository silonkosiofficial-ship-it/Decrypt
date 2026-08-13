.class public abstract LD0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LD0/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LD0/g0$a;

    invoke-direct {v0}, LD0/g0$a;-><init>()V

    sput-object v0, LD0/g0;->a:LD0/g0$a;

    return-void
.end method

.method public static final a(LD0/i0;Landroidx/compose/ui/d;Lx7/p;LV/n;II)V
    .locals 7

    .prologue
    const v0, -0x1e845847

    invoke-interface {p3, v0}, LV/n;->r(I)LV/n;

    move-result-object p3

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, p4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_2

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_2
    move v1, p4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_5

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

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
    or-int/2addr v1, v3

    :cond_8
    :goto_5
    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_b

    invoke-interface {p3}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_7

    :cond_9
    invoke-interface {p3}, LV/n;->A()V

    :cond_a
    :goto_6
    move-object v3, p1

    goto/16 :goto_b

    :cond_b
    :goto_7
    if-eqz v2, :cond_c

    sget-object p1, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_c
    invoke-static {}, LV/q;->H()Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, -0x1

    const-string v3, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:112)"

    invoke-static {v0, v1, v2, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_d
    const/4 v0, 0x0

    invoke-static {p3, v0}, LV/k;->a(LV/n;I)I

    move-result v1

    invoke-static {p3, v0}, LV/k;->d(LV/n;I)LV/s;

    move-result-object v2

    invoke-static {p3, p1}, Landroidx/compose/ui/c;->e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object v3

    invoke-interface {p3}, LV/n;->F()LV/z;

    move-result-object v4

    sget-object v5, LF0/J;->n0:LF0/J$d;

    invoke-virtual {v5}, LF0/J$d;->a()Lx7/a;

    move-result-object v5

    invoke-interface {p3}, LV/n;->v()LV/g;

    move-result-object v6

    instance-of v6, v6, LV/g;

    if-nez v6, :cond_e

    invoke-static {}, LV/k;->c()V

    :cond_e
    invoke-interface {p3}, LV/n;->t()V

    invoke-interface {p3}, LV/n;->o()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {p3, v5}, LV/n;->B(Lx7/a;)V

    goto :goto_8

    :cond_f
    invoke-interface {p3}, LV/n;->H()V

    :goto_8
    invoke-static {p3}, LV/L1;->a(LV/n;)LV/n;

    move-result-object v5

    invoke-virtual {p0}, LD0/i0;->g()Lx7/p;

    move-result-object v6

    invoke-static {v5, p0, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {p0}, LD0/i0;->e()Lx7/p;

    move-result-object v6

    invoke-static {v5, v2, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {p0}, LD0/i0;->f()Lx7/p;

    move-result-object v2

    invoke-static {v5, p2, v2}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    sget-object v2, LF0/g;->a:LF0/g$a;

    invoke-virtual {v2}, LF0/g$a;->e()Lx7/p;

    move-result-object v6

    invoke-static {v5, v4, v6}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LF0/g$a;->d()Lx7/p;

    move-result-object v4

    invoke-static {v5, v3, v4}, LV/L1;->c(LV/n;Ljava/lang/Object;Lx7/p;)V

    invoke-virtual {v2}, LF0/g$a;->b()Lx7/p;

    move-result-object v2

    invoke-interface {v5}, LV/n;->o()Z

    move-result v3

    if-nez v3, :cond_10

    invoke-interface {v5}, LV/n;->g()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LV/n;->K(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v5, v1, v2}, LV/n;->D(Ljava/lang/Object;Lx7/p;)V

    :cond_11
    invoke-interface {p3}, LV/n;->Q()V

    invoke-interface {p3}, LV/n;->u()Z

    move-result v1

    if-nez v1, :cond_14

    const v1, -0x1959576

    invoke-interface {p3, v1}, LV/n;->T(I)V

    invoke-interface {p3, p0}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_13

    :cond_12
    new-instance v2, LD0/g0$c;

    invoke-direct {v2, p0}, LD0/g0$c;-><init>(LD0/i0;)V

    invoke-interface {p3, v2}, LV/n;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Lx7/a;

    invoke-static {v2, p3, v0}, LV/Q;->f(Lx7/a;LV/n;I)V

    :goto_9
    invoke-interface {p3}, LV/n;->J()V

    goto :goto_a

    :cond_14
    const v0, -0x1946565

    invoke-interface {p3, v0}, LV/n;->T(I)V

    goto :goto_9

    :goto_a
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LV/q;->P()V

    goto/16 :goto_6

    :goto_b
    invoke-interface {p3}, LV/n;->x()LV/e1;

    move-result-object p1

    if-eqz p1, :cond_15

    new-instance p3, LD0/g0$d;

    move-object v1, p3

    move-object v2, p0

    move-object v4, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, LD0/g0$d;-><init>(LD0/i0;Landroidx/compose/ui/d;Lx7/p;II)V

    invoke-interface {p1, p3}, LV/e1;->a(Lx7/p;)V

    :cond_15
    return-void
.end method

.method public static final b(Landroidx/compose/ui/d;Lx7/p;LV/n;II)V
    .locals 7

    .prologue
    const v0, -0x4d634bd0    # -1.824273E-8f

    invoke-interface {p2, v0}, LV/n;->r(I)LV/n;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    invoke-interface {p2, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p3

    goto :goto_1

    :cond_2
    move v2, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_5

    invoke-interface {p2, p1}, LV/n;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    if-ne v3, v4, :cond_7

    invoke-interface {p2}, LV/n;->u()Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LV/n;->A()V

    goto :goto_5

    :cond_7
    :goto_4
    if-eqz v1, :cond_8

    sget-object p0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    :cond_8
    invoke-static {}, LV/q;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v3, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:78)"

    invoke-static {v0, v2, v1, v3}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_9
    invoke-interface {p2}, LV/n;->g()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LV/n;->a:LV/n$a;

    invoke-virtual {v1}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_a

    new-instance v0, LD0/i0;

    invoke-direct {v0}, LD0/i0;-><init>()V

    invoke-interface {p2, v0}, LV/n;->K(Ljava/lang/Object;)V

    :cond_a
    move-object v1, v0

    check-cast v1, LD0/i0;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit16 v5, v0, 0x3f0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, LD0/g0;->a(LD0/i0;Landroidx/compose/ui/d;Lx7/p;LV/n;II)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-static {}, LV/q;->P()V

    :cond_b
    :goto_5
    invoke-interface {p2}, LV/n;->x()LV/e1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, LD0/g0$b;

    invoke-direct {v0, p0, p1, p3, p4}, LD0/g0$b;-><init>(Landroidx/compose/ui/d;Lx7/p;II)V

    invoke-interface {p2, v0}, LV/e1;->a(Lx7/p;)V

    :cond_c
    return-void
.end method

.method public static final synthetic c()LD0/g0$a;
    .locals 1

    sget-object v0, LD0/g0;->a:LD0/g0$a;

    return-object v0
.end method
