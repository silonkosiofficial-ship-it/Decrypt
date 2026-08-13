.class public abstract LJ0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(LK0/o;)Z
    .locals 2

    .prologue
    invoke-static {p0}, LJ0/n;->c(LK0/o;)Lx7/p;

    move-result-object v0

    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object p0

    sget-object v1, LK0/r;->a:LK0/r;

    invoke-virtual {v1}, LK0/r;->I()LK0/v;

    move-result-object v1

    invoke-static {p0, v1}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK0/i;

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LK0/i;->a()Lx7/a;

    move-result-object p0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static final b(LK0/o;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0, v0}, LK0/o;->l(ZZZ)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LK0/o;)Lx7/p;
    .locals 1

    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object p0

    sget-object v0, LK0/j;->a:LK0/j;

    invoke-virtual {v0}, LK0/j;->u()LK0/v;

    move-result-object v0

    invoke-static {p0, v0}, LK0/l;->a(LK0/k;LK0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/p;

    return-object p0
.end method

.method private static final d(LK0/o;ILx7/l;)V
    .locals 5

    .prologue
    new-instance v0, LX/b;

    const/16 v1, 0x10

    new-array v1, v1, [LK0/o;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LX/b;-><init>([Ljava/lang/Object;I)V

    :goto_0
    invoke-static {p0}, LJ0/n;->b(LK0/o;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0}, LX/b;->t()I

    move-result v1

    invoke-virtual {v0, v1, p0}, LX/b;->g(ILjava/util/List;)Z

    :cond_0
    :goto_1
    invoke-virtual {v0}, LX/b;->x()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {v0}, LX/b;->t()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {v0, p0}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LK0/o;

    invoke-static {p0}, Landroidx/compose/ui/platform/q1;->g(LK0/o;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LK0/o;->w()LK0/k;

    move-result-object v1

    sget-object v2, LK0/r;->a:LK0/r;

    invoke-virtual {v2}, LK0/r;->f()LK0/v;

    move-result-object v2

    invoke-virtual {v1, v2}, LK0/k;->f(LK0/v;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LK0/o;->e()LF0/d0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LF0/d0;->m1()LD0/t;

    move-result-object v1

    invoke-static {v1}, LD0/u;->c(LD0/t;)Ln0/i;

    move-result-object v2

    invoke-static {v2}, LY0/s;->b(Ln0/i;)LY0/r;

    move-result-object v2

    invoke-virtual {v2}, LY0/r;->l()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, LJ0/n;->a(LK0/o;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, p1, 0x1

    new-instance v4, LJ0/m;

    invoke-direct {v4, p0, v3, v2, v1}, LJ0/m;-><init>(LK0/o;ILY0/r;LD0/t;)V

    invoke-interface {p2, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, v3, p2}, LJ0/n;->d(LK0/o;ILx7/l;)V

    goto :goto_1

    :cond_4
    const-string p0, "Expected semantics node to have a coordinator."

    invoke-static {p0}, LC0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p0, Li7/k;

    invoke-direct {p0}, Li7/k;-><init>()V

    throw p0

    :cond_5
    return-void
.end method

.method static synthetic e(LK0/o;ILx7/l;ILjava/lang/Object;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LJ0/n;->d(LK0/o;ILx7/l;)V

    return-void
.end method
