.class public abstract Lk0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Lk0/d;J)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lk0/f;->d(Lk0/d;J)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lk0/g;Lk0/b;)V
    .locals 0

    invoke-static {p0, p1}, Lk0/f;->e(Lk0/g;Lk0/b;)V

    return-void
.end method

.method public static final synthetic c(LF0/E0;Lx7/l;)V
    .locals 0

    invoke-static {p0, p1}, Lk0/f;->f(LF0/E0;Lx7/l;)V

    return-void
.end method

.method private static final d(Lk0/d;J)Z
    .locals 5

    .prologue
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, LF0/k;->m(LF0/j;)LF0/J;

    move-result-object p0

    invoke-virtual {p0}, LF0/J;->l()LD0/t;

    move-result-object p0

    invoke-interface {p0}, LD0/t;->K()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p0}, LD0/t;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v0

    invoke-static {v2, v3}, LY0/t;->f(J)I

    move-result v2

    invoke-static {p0}, LD0/u;->e(LD0/t;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ln0/g;->m(J)F

    move-result p0

    invoke-static {v3, v4}, Ln0/g;->n(J)F

    move-result v3

    int-to-float v0, v0

    add-float/2addr v0, p0

    int-to-float v2, v2

    add-float/2addr v2, v3

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v4

    cmpg-float p0, p0, v4

    if-gtz p0, :cond_2

    cmpg-float p0, v4, v0

    if-gtz p0, :cond_2

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p0

    cmpg-float p1, v3, p0

    if-gtz p1, :cond_2

    cmpg-float p0, p0, v2

    if-gtz p0, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private static final e(Lk0/g;Lk0/b;)V
    .locals 0

    invoke-interface {p0, p1}, Lk0/g;->x0(Lk0/b;)V

    invoke-interface {p0, p1}, Lk0/g;->U(Lk0/b;)V

    return-void
.end method

.method private static final f(LF0/E0;Lx7/l;)V
    .locals 2

    .prologue
    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LF0/D0;->C:LF0/D0;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, LF0/F0;->f(LF0/E0;Lx7/l;)V

    return-void
.end method
