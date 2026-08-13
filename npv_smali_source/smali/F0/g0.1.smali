.class public abstract LF0/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lr/H;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lr/O;->b()Lr/H;

    move-result-object v0

    sput-object v0, LF0/g0;->a:Lr/H;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/d$c;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateInsertedNode called on unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, LF0/g0;->b(Landroidx/compose/ui/d$c;II)V

    return-void
.end method

.method public static final b(Landroidx/compose/ui/d$c;II)V
    .locals 2

    .prologue
    instance-of v0, p0, LF0/m;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, LF0/m;

    invoke-virtual {v0}, LF0/m;->V1()I

    move-result v1

    and-int/2addr v1, p1

    invoke-static {p0, v1, p2}, LF0/g0;->c(Landroidx/compose/ui/d$c;II)V

    invoke-virtual {v0}, LF0/m;->V1()I

    move-result p0

    not-int p0, p0

    and-int/2addr p0, p1

    invoke-virtual {v0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1, p0, p2}, LF0/g0;->b(Landroidx/compose/ui/d$c;II)V

    invoke-virtual {p1}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    and-int/2addr p1, v0

    invoke-static {p0, p1, p2}, LF0/g0;->c(Landroidx/compose/ui/d$c;II)V

    :cond_1
    return-void
.end method

.method private static final c(Landroidx/compose/ui/d$c;II)V
    .locals 3

    .prologue
    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->y1()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_1

    instance-of v1, p0, LF0/E;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, LF0/E;

    invoke-static {v1}, LF0/H;->b(LF0/E;)V

    if-ne p2, v0, :cond_1

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v1

    invoke-static {p0, v1}, LF0/k;->h(LF0/j;I)LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->I2()V

    :cond_1
    const/16 v1, 0x80

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_2

    instance-of v1, p0, LF0/C;

    if-eqz v1, :cond_2

    if-eq p2, v0, :cond_2

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->F0()V

    :cond_2
    const/16 v1, 0x100

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_3

    instance-of v1, p0, LF0/u;

    if-eqz v1, :cond_3

    if-eq p2, v0, :cond_3

    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object v1

    invoke-virtual {v1}, LF0/J;->G0()V

    :cond_3
    const/4 v1, 0x4

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_4

    instance-of v1, p0, LF0/s;

    if-eqz v1, :cond_4

    move-object v1, p0

    check-cast v1, LF0/s;

    invoke-static {v1}, LF0/t;->a(LF0/s;)V

    :cond_4
    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_5

    instance-of v1, p0, LF0/z0;

    if-eqz v1, :cond_5

    move-object v1, p0

    check-cast v1, LF0/z0;

    invoke-static {v1}, LF0/A0;->b(LF0/z0;)V

    :cond_5
    const/16 v1, 0x40

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_6

    instance-of v1, p0, LF0/r0;

    if-eqz v1, :cond_6

    move-object v1, p0

    check-cast v1, LF0/r0;

    invoke-static {v1}, LF0/s0;->a(LF0/r0;)V

    :cond_6
    const/16 v1, 0x400

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_7

    instance-of v1, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v1, :cond_7

    if-eq p2, v0, :cond_7

    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v1}, Lm0/r;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    :cond_7
    const/16 v1, 0x800

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    and-int/2addr v1, p1

    if-eqz v1, :cond_9

    instance-of v1, p0, Lm0/j;

    if-eqz v1, :cond_9

    move-object v1, p0

    check-cast v1, Lm0/j;

    invoke-static {v1}, LF0/g0;->k(Lm0/j;)Z

    move-result v2

    if-eqz v2, :cond_9

    if-ne p2, v0, :cond_8

    invoke-static {v1}, LF0/g0;->j(Lm0/j;)V

    goto :goto_0

    :cond_8
    invoke-static {v1}, Lm0/k;->a(Lm0/j;)V

    :cond_9
    :goto_0
    const/16 p2, 0x1000

    invoke-static {p2}, LF0/f0;->a(I)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_a

    instance-of p1, p0, Lm0/b;

    if-eqz p1, :cond_a

    check-cast p0, Lm0/b;

    invoke-static {p0}, Lm0/c;->b(Lm0/b;)V

    :cond_a
    return-void
.end method

.method public static final d(Landroidx/compose/ui/d$c;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateRemovedNode called on unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, LF0/g0;->b(Landroidx/compose/ui/d$c;II)V

    return-void
.end method

.method public static final e(Landroidx/compose/ui/d$c;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "autoInvalidateUpdatedNode called on unattached node"

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, LF0/g0;->b(Landroidx/compose/ui/d$c;II)V

    return-void
.end method

.method public static final f(Landroidx/compose/ui/d$b;)I
    .locals 2

    .prologue
    const/4 v0, 0x1

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    instance-of v1, p0, LD0/A;

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_0
    instance-of v1, p0, Ll0/g;

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_1
    instance-of v1, p0, LK0/m;

    if-eqz v1, :cond_2

    const/16 v1, 0x8

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_2
    instance-of v1, p0, Lz0/I;

    if-eqz v1, :cond_3

    const/16 v1, 0x10

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_3
    instance-of v1, p0, LE0/d;

    if-nez v1, :cond_4

    instance-of v1, p0, LE0/k;

    if-eqz v1, :cond_5

    :cond_4
    const/16 v1, 0x20

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_5
    instance-of v1, p0, LD0/S;

    if-eqz v1, :cond_6

    const/16 v1, 0x100

    invoke-static {v1}, LF0/f0;->a(I)I

    move-result v1

    or-int/2addr v0, v1

    :cond_6
    instance-of p0, p0, LD0/U;

    if-eqz p0, :cond_7

    const/16 p0, 0x40

    invoke-static {p0}, LF0/f0;->a(I)I

    move-result p0

    or-int/2addr v0, p0

    :cond_7
    return v0
.end method

.method public static final g(Landroidx/compose/ui/d$c;)I
    .locals 4

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result p0

    return p0

    :cond_0
    sget-object v0, LF0/g0;->a:Lr/H;

    invoke-static {p0}, Lh0/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lr/N;->b(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_1

    iget-object p0, v0, Lr/N;->c:[I

    aget p0, p0, v2

    goto/16 :goto_1

    :cond_1
    const/4 v2, 0x1

    invoke-static {v2}, LF0/f0;->a(I)I

    move-result v2

    instance-of v3, p0, LF0/E;

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_2
    instance-of v3, p0, LF0/s;

    if-eqz v3, :cond_3

    const/4 v3, 0x4

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_3
    instance-of v3, p0, LF0/z0;

    if-eqz v3, :cond_4

    const/16 v3, 0x8

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_4
    instance-of v3, p0, LF0/v0;

    if-eqz v3, :cond_5

    const/16 v3, 0x10

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_5
    instance-of v3, p0, LE0/i;

    if-eqz v3, :cond_6

    const/16 v3, 0x20

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_6
    instance-of v3, p0, LF0/r0;

    if-eqz v3, :cond_7

    const/16 v3, 0x40

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_7
    instance-of v3, p0, LF0/C;

    if-eqz v3, :cond_8

    const/16 v3, 0x80

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_8
    instance-of v3, p0, LF0/u;

    if-eqz v3, :cond_9

    const/16 v3, 0x100

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_9
    instance-of v3, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v3, :cond_a

    const/16 v3, 0x400

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_a
    instance-of v3, p0, Lm0/j;

    if-eqz v3, :cond_b

    const/16 v3, 0x800

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_b
    instance-of v3, p0, Lm0/b;

    if-eqz v3, :cond_c

    const/16 v3, 0x1000

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_c
    instance-of v3, p0, Lx0/e;

    if-eqz v3, :cond_d

    const/16 v3, 0x2000

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_d
    instance-of v3, p0, LB0/a;

    if-eqz v3, :cond_e

    const/16 v3, 0x4000

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_e
    instance-of v3, p0, LF0/h;

    if-eqz v3, :cond_f

    const v3, 0x8000

    invoke-static {v3}, LF0/f0;->a(I)I

    move-result v3

    or-int/2addr v2, v3

    :cond_f
    instance-of p0, p0, LF0/E0;

    if-eqz p0, :cond_10

    const/high16 p0, 0x40000

    invoke-static {p0}, LF0/f0;->a(I)I

    move-result p0

    or-int/2addr p0, v2

    goto :goto_0

    :cond_10
    move p0, v2

    :goto_0
    invoke-virtual {v0, v1, p0}, Lr/H;->s(Ljava/lang/Object;I)V

    :goto_1
    return p0
.end method

.method public static final h(Landroidx/compose/ui/d$c;)I
    .locals 2

    .prologue
    instance-of v0, p0, LF0/m;

    if-eqz v0, :cond_0

    check-cast p0, LF0/m;

    invoke-virtual {p0}, LF0/m;->V1()I

    move-result v0

    invoke-virtual {p0}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object p0

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, LF0/g0;->h(Landroidx/compose/ui/d$c;)I

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LF0/g0;->g(Landroidx/compose/ui/d$c;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public static final i(I)Z
    .locals 1

    .prologue
    const/16 v0, 0x80

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    and-int/2addr p0, v0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final j(Lm0/j;)V
    .locals 10

    .prologue
    const/16 v0, 0x400

    invoke-static {v0}, LF0/f0;->a(I)I

    move-result v0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-eqz v1, :cond_c

    new-instance v1, LX/b;

    const/16 v2, 0x10

    new-array v3, v2, [Landroidx/compose/ui/d$c;

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object p0

    :goto_0
    invoke-static {v1, p0}, LF0/k;->a(LX/b;Landroidx/compose/ui/d$c;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v3}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_1
    :goto_1
    invoke-virtual {v1}, LX/b;->x()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-virtual {v1}, LX/b;->t()I

    move-result p0

    const/4 v3, 0x1

    sub-int/2addr p0, v3

    invoke-virtual {v1, p0}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/d$c;

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->q1()I

    move-result v5

    and-int/2addr v5, v0

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    :goto_2
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v5

    and-int/2addr v5, v0

    if-eqz v5, :cond_a

    const/4 v5, 0x0

    move-object v6, v5

    :goto_3
    if-eqz p0, :cond_1

    instance-of v7, p0, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v7, :cond_3

    check-cast p0, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {p0}, Lm0/r;->c(Landroidx/compose/ui/focus/FocusTargetNode;)V

    goto :goto_6

    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->v1()I

    move-result v7

    and-int/2addr v7, v0

    if-eqz v7, :cond_9

    instance-of v7, p0, LF0/m;

    if-eqz v7, :cond_9

    move-object v7, p0

    check-cast v7, LF0/m;

    invoke-virtual {v7}, LF0/m;->U1()Landroidx/compose/ui/d$c;

    move-result-object v7

    move v8, v4

    :goto_4
    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->v1()I

    move-result v9

    and-int/2addr v9, v0

    if-eqz v9, :cond_7

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v3, :cond_4

    move-object p0, v7

    goto :goto_5

    :cond_4
    if-nez v6, :cond_5

    new-instance v6, LX/b;

    new-array v9, v2, [Landroidx/compose/ui/d$c;

    invoke-direct {v6, v9, v4}, LX/b;-><init>([Ljava/lang/Object;I)V

    :cond_5
    if-eqz p0, :cond_6

    invoke-virtual {v6, p0}, LX/b;->d(Ljava/lang/Object;)Z

    move-object p0, v5

    :cond_6
    invoke-virtual {v6, v7}, LX/b;->d(Ljava/lang/Object;)Z

    :cond_7
    :goto_5
    invoke-virtual {v7}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object v7

    goto :goto_4

    :cond_8
    if-ne v8, v3, :cond_9

    goto :goto_3

    :cond_9
    :goto_6
    invoke-static {v6}, LF0/k;->b(LX/b;)Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_3

    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->r1()Landroidx/compose/ui/d$c;

    move-result-object p0

    goto :goto_2

    :cond_b
    return-void

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "visitChildren called on an unattached node"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final k(Lm0/j;)Z
    .locals 1

    sget-object v0, LF0/e;->a:LF0/e;

    invoke-virtual {v0}, LF0/e;->b()V

    invoke-interface {p0, v0}, Lm0/j;->Y(Landroidx/compose/ui/focus/j;)V

    invoke-virtual {v0}, LF0/e;->a()Z

    move-result p0

    return p0
.end method
