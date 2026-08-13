.class abstract LR8/r;
.super LR8/m;
.source "SourceFile"


# direct methods
.method public static synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LR8/r;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LR8/h;)Ljava/util/Iterator;
    .locals 0

    invoke-static {p0}, LR8/r;->l(LR8/h;)Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LR8/r;->p(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, LR8/r;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/Iterator;)LR8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/r$a;

    invoke-direct {v0, p0}, LR8/r$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, LR8/r;->h(LR8/h;)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final h(LR8/h;)LR8/h;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LR8/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LR8/a;

    invoke-direct {v0, p0}, LR8/a;-><init>(LR8/h;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static i()LR8/h;
    .locals 1

    sget-object v0, LR8/d;->a:LR8/d;

    return-object v0
.end method

.method public static final j(LR8/h;)LR8/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/p;

    invoke-direct {v0}, LR8/p;-><init>()V

    invoke-static {p0, v0}, LR8/r;->k(LR8/h;Lx7/l;)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method private static final k(LR8/h;Lx7/l;)LR8/h;
    .locals 2

    .prologue
    instance-of v0, p0, LR8/w;

    if-eqz v0, :cond_0

    check-cast p0, LR8/w;

    invoke-virtual {p0, p1}, LR8/w;->d(Lx7/l;)LR8/h;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LR8/f;

    new-instance v1, LR8/q;

    invoke-direct {v1}, LR8/q;-><init>()V

    invoke-direct {v0, p0, v1, p1}, LR8/f;-><init>(LR8/h;Lx7/l;Lx7/l;)V

    return-object v0
.end method

.method private static final l(LR8/h;)Ljava/util/Iterator;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LR8/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static n(Ljava/lang/Object;Lx7/l;)LR8/h;
    .locals 2

    .prologue
    const-string v0, "nextFunction"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, LR8/d;->a:LR8/d;

    goto :goto_0

    :cond_0
    new-instance v0, LR8/g;

    new-instance v1, LR8/n;

    invoke-direct {v1, p0}, LR8/n;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, LR8/g;-><init>(Lx7/a;Lx7/l;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static o(Lx7/a;)LR8/h;
    .locals 2

    const-string v0, "nextFunction"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LR8/g;

    new-instance v1, LR8/o;

    invoke-direct {v1, p0}, LR8/o;-><init>(Lx7/a;)V

    invoke-direct {v0, p0, v1}, LR8/g;-><init>(Lx7/a;Lx7/l;)V

    invoke-static {v0}, LR8/r;->h(LR8/h;)LR8/h;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lx7/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public static final varargs r([Ljava/lang/Object;)LR8/h;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj7/n;->O([Ljava/lang/Object;)LR8/h;

    move-result-object p0

    return-object p0
.end method
