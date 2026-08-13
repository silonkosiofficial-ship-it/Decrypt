.class public abstract Landroidx/compose/ui/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Landroidx/compose/ui/c;->d(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;
    .locals 1

    new-instance v0, Landroidx/compose/ui/b;

    invoke-direct {v0, p1, p2}, Landroidx/compose/ui/b;-><init>(Lx7/l;Lx7/q;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/d;Lx7/l;Lx7/q;ILjava/lang/Object;)Landroidx/compose/ui/d;
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    invoke-static {}, Landroidx/compose/ui/platform/E0;->a()Lx7/l;

    move-result-object p1

    :cond_0
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/c;->b(Landroidx/compose/ui/d;Lx7/l;Lx7/q;)Landroidx/compose/ui/d;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 2

    .prologue
    sget-object v0, Landroidx/compose/ui/c$a;->D:Landroidx/compose/ui/c$a;

    invoke-interface {p1, v0}, Landroidx/compose/ui/d;->d(Lx7/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const v0, 0x48ae8da7

    invoke-interface {p0, v0}, LV/n;->f(I)V

    sget-object v0, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    new-instance v1, Landroidx/compose/ui/c$b;

    invoke-direct {v1, p0}, Landroidx/compose/ui/c$b;-><init>(LV/n;)V

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/d;->c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/d;

    invoke-interface {p0}, LV/n;->P()V

    return-object p1
.end method

.method public static final e(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 1

    const v0, 0x1a365f2c

    invoke-interface {p0, v0}, LV/n;->T(I)V

    invoke-static {p0, p1}, Landroidx/compose/ui/c;->d(LV/n;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-interface {p0}, LV/n;->J()V

    return-object p1
.end method
