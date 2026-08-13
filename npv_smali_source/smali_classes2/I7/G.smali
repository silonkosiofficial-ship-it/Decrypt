.class public LI7/G;
.super Ly7/Q;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ly7/Q;-><init>()V

    return-void
.end method

.method private static o(Ly7/f;)LI7/n;
    .locals 1

    .prologue
    invoke-virtual {p0}, Ly7/f;->k()LF7/e;

    move-result-object p0

    instance-of v0, p0, LI7/n;

    if-eqz v0, :cond_0

    check-cast p0, LI7/n;

    goto :goto_0

    :cond_0
    sget-object p0, LI7/f;->F:LI7/f;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Ly7/p;)LF7/f;
    .locals 4

    new-instance v0, LI7/o;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ly7/f;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LI7/o;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public b(Ljava/lang/Class;)LF7/c;
    .locals 0

    invoke-static {p1}, LI7/c;->c(Ljava/lang/Class;)LI7/k;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Ljava/lang/String;)LF7/e;
    .locals 0

    invoke-static {p1}, LI7/c;->d(Ljava/lang/Class;)LF7/e;

    move-result-object p1

    return-object p1
.end method

.method public d(LF7/o;)LF7/o;
    .locals 0

    invoke-static {p1}, LI7/K;->a(LF7/o;)LF7/o;

    move-result-object p1

    return-object p1
.end method

.method public e(Ly7/x;)LF7/h;
    .locals 4

    new-instance v0, LI7/p;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ly7/f;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LI7/p;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public f(Ly7/z;)LF7/i;
    .locals 4

    new-instance v0, LI7/q;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ly7/f;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LI7/q;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public g(Ly7/D;)LF7/l;
    .locals 4

    new-instance v0, LI7/v;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ly7/f;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LI7/v;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public h(Ly7/F;)LF7/m;
    .locals 4

    new-instance v0, LI7/w;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ly7/f;->f()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, LI7/w;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method

.method public i(Ly7/H;)LF7/n;
    .locals 3

    new-instance v0, LI7/x;

    invoke-static {p1}, LI7/G;->o(Ly7/f;)LI7/n;

    move-result-object v1

    invoke-virtual {p1}, Ly7/f;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ly7/f;->n()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, LI7/x;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public j(Ly7/o;)Ljava/lang/String;
    .locals 1

    .prologue
    invoke-static {p1}, LH7/d;->a(Li7/i;)LF7/f;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LI7/M;->c(Ljava/lang/Object;)LI7/o;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object p1, LI7/H;->a:LI7/H;

    invoke-virtual {v0}, LI7/o;->P()LO7/y;

    move-result-object v0

    invoke-virtual {p1, v0}, LI7/H;->e(LO7/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-super {p0, p1}, Ly7/Q;->j(Ly7/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public k(Ly7/v;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, LI7/G;->j(Ly7/o;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public l(LF7/p;Ljava/util/List;)V
    .locals 0

    return-void
.end method

.method public m(LF7/d;Ljava/util/List;Z)LF7/o;
    .locals 1

    .prologue
    instance-of v0, p1, Ly7/h;

    if-eqz v0, :cond_0

    check-cast p1, Ly7/h;

    invoke-interface {p1}, Ly7/h;->e()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p2, p3}, LI7/c;->a(Ljava/lang/Class;Ljava/util/List;Z)LF7/o;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, p2, p3, v0}, LG7/c;->b(LF7/d;Ljava/util/List;ZLjava/util/List;)LF7/o;

    move-result-object p1

    return-object p1
.end method

.method public n(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)LF7/p;
    .locals 1

    .prologue
    instance-of p3, p1, LF7/c;

    if-eqz p3, :cond_0

    move-object p3, p1

    check-cast p3, LF7/c;

    invoke-interface {p3}, LF7/c;->g()Ljava/util/List;

    move-result-object p3

    goto :goto_0

    :cond_0
    instance-of p3, p1, LF7/b;

    if-eqz p3, :cond_3

    move-object p3, p1

    check-cast p3, LF7/b;

    invoke-interface {p3}, LF7/b;->g()Ljava/util/List;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LF7/p;

    invoke-interface {p4}, LF7/p;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p4

    :cond_2
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Type parameter "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " is not found in container: "

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Type parameter container must be a class or a callable: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
