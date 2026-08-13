.class public abstract Laa/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;
    .locals 2

    .prologue
    const-string v0, "key1"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key2"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key3"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDefault"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "block"

    invoke-static {p4, p3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, -0x428f765b

    invoke-interface {p5, p3}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:41)"

    invoke-static {p3, p6, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/o;->e()LV/O0;

    move-result-object p3

    invoke-interface {p5, p3}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Laa/b;

    const/4 p6, 0x0

    invoke-interface {p3, p5, p6}, Laa/b;->a(LV/n;I)Laa/n;

    move-result-object p3

    const p6, 0x1834016f

    invoke-interface {p5, p6}, LV/n;->T(I)V

    invoke-interface {p5, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p5, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p5, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p5, p3}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p5}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p0, Laa/u$c;

    const/4 p1, 0x0

    invoke-direct {p0, p4, p3, p1}, Laa/u$c;-><init>(Lx7/p;Laa/n;Lm7/e;)V

    const/4 p2, 0x1

    invoke-static {p1, p0, p2, p1}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    invoke-interface {p5, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LV/w0;

    invoke-interface {p5}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p5}, LV/n;->J()V

    return-object p1
.end method

.method public static final b(Ljava/lang/Object;Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;
    .locals 2

    .prologue
    const-string v0, "key1"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key2"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDefault"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "block"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x45783d85

    invoke-interface {p4, p2}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:25)"

    invoke-static {p2, p5, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/o;->e()LV/O0;

    move-result-object p2

    invoke-interface {p4, p2}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Laa/b;

    const/4 p5, 0x0

    invoke-interface {p2, p4, p5}, Laa/b;->a(LV/n;I)Laa/n;

    move-result-object p2

    const p5, 0x1833cf29

    invoke-interface {p4, p5}, LV/n;->T(I)V

    invoke-interface {p4, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p4, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p4, p2}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p0, p1

    invoke-interface {p4}, LV/n;->g()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_2

    :cond_1
    new-instance p0, Laa/u$b;

    const/4 p1, 0x0

    invoke-direct {p0, p3, p2, p1}, Laa/u$b;-><init>(Lx7/p;Laa/n;Lm7/e;)V

    const/4 p2, 0x1

    invoke-static {p1, p0, p2, p1}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 p2, 0x2

    invoke-static {p0, p1, p2, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    invoke-interface {p4, p1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p1, LV/w0;

    invoke-interface {p4}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p4}, LV/n;->J()V

    return-object p1
.end method

.method public static final c(Ljava/lang/Object;Lx7/a;Lx7/p;LV/n;I)LV/G1;
    .locals 2

    .prologue
    const-string v0, "key1"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDefault"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "block"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, -0x79cb1e9b

    invoke-interface {p3, p1}, LV/n;->T(I)V

    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "org.jetbrains.compose.resources.rememberResourceState (ResourceState.blocking.kt:10)"

    invoke-static {p1, p4, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Laa/o;->e()LV/O0;

    move-result-object p1

    invoke-interface {p3, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/b;

    const/4 p4, 0x0

    invoke-interface {p1, p3, p4}, Laa/b;->a(LV/n;I)Laa/n;

    move-result-object p1

    const p4, 0x18339f83

    invoke-interface {p3, p4}, LV/n;->T(I)V

    invoke-interface {p3, p0}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p3, p1}, LV/n;->S(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p0, p4

    invoke-interface {p3}, LV/n;->g()Ljava/lang/Object;

    move-result-object p4

    if-nez p0, :cond_1

    sget-object p0, LV/n;->a:LV/n$a;

    invoke-virtual {p0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p4, p0, :cond_2

    :cond_1
    new-instance p0, Laa/u$a;

    const/4 p4, 0x0

    invoke-direct {p0, p2, p1, p4}, Laa/u$a;-><init>(Lx7/p;Laa/n;Lm7/e;)V

    const/4 p1, 0x1

    invoke-static {p4, p0, p1, p4}, LW8/g;->f(Lm7/i;Lx7/p;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 p1, 0x2

    invoke-static {p0, p4, p1, p4}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p4

    invoke-interface {p3, p4}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p4, LV/w0;

    invoke-interface {p3}, LV/n;->J()V

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    invoke-interface {p3}, LV/n;->J()V

    return-object p4
.end method
