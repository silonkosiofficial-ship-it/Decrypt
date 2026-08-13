.class abstract Ln7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lx7/l;Lm7/e;)Lm7/e;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lo7/h;->a(Lm7/e;)Lm7/e;

    move-result-object p1

    instance-of v0, p0, Lo7/a;

    if-eqz v0, :cond_0

    check-cast p0, Lo7/a;

    invoke-virtual {p0, p1}, Lo7/a;->y(Lm7/e;)Lm7/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Lm7/j;->C:Lm7/j;

    if-ne v0, v1, :cond_1

    new-instance v0, Ln7/c$a;

    invoke-direct {v0, p1, p0}, Ln7/c$a;-><init>(Lm7/e;Lx7/l;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ln7/c$b;

    invoke-direct {v1, p1, v0, p0}, Ln7/c$b;-><init>(Lm7/e;Lm7/i;Lx7/l;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lo7/h;->a(Lm7/e;)Lm7/e;

    move-result-object p2

    instance-of v0, p0, Lo7/a;

    if-eqz v0, :cond_0

    check-cast p0, Lo7/a;

    invoke-virtual {p0, p1, p2}, Lo7/a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Lm7/j;->C:Lm7/j;

    if-ne v0, v1, :cond_1

    new-instance v0, Ln7/c$c;

    invoke-direct {v0, p2, p0, p1}, Ln7/c$c;-><init>(Lm7/e;Lx7/p;Ljava/lang/Object;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ln7/c$d;

    invoke-direct {v1, p2, v0, p0, p1}, Ln7/c$d;-><init>(Lm7/e;Lm7/i;Lx7/p;Ljava/lang/Object;)V

    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method private static final c(Lm7/e;)Lm7/e;
    .locals 2

    .prologue
    invoke-interface {p0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v0

    sget-object v1, Lm7/j;->C:Lm7/j;

    if-ne v0, v1, :cond_0

    new-instance v0, Ln7/c$e;

    invoke-direct {v0, p0}, Ln7/c$e;-><init>(Lm7/e;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ln7/c$f;

    invoke-direct {v1, p0, v0}, Ln7/c$f;-><init>(Lm7/e;Lm7/i;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public static d(Lm7/e;)Lm7/e;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lo7/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lo7/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lo7/d;->E()Lm7/e;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static e(Lx7/p;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lo7/h;->a(Lm7/e;)Lm7/e;

    move-result-object p2

    invoke-static {p2}, Ln7/c;->c(Lm7/e;)Lm7/e;

    move-result-object p2

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/p;

    invoke-interface {p0, p1, p2}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lx7/q;Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lo7/h;->a(Lm7/e;)Lm7/e;

    move-result-object p3

    invoke-static {p3}, Ln7/c;->c(Lm7/e;)Lm7/e;

    move-result-object p3

    const/4 v0, 0x3

    invoke-static {p0, v0}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx7/q;

    invoke-interface {p0, p1, p2, p3}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
