.class public LI7/e;
.super LR7/l;
.source "SourceFile"


# instance fields
.field private final a:LI7/n;


# direct methods
.method public constructor <init>(LI7/n;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LR7/l;-><init>()V

    iput-object p1, p0, LI7/e;->a:LI7/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic d(LO7/y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, LI7/e;->p(LO7/y;Li7/M;)LI7/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic h(LO7/U;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Li7/M;

    invoke-virtual {p0, p1, p2}, LI7/e;->q(LO7/U;Li7/M;)LI7/j;

    move-result-object p1

    return-object p1
.end method

.method public p(LO7/y;Li7/M;)LI7/j;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LI7/o;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/o;-><init>(LI7/n;LO7/y;)V

    return-object p2
.end method

.method public q(LO7/U;Li7/M;)LI7/j;
    .locals 3

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/a;->m0()LO7/X;

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-interface {p1}, LO7/a;->v0()LO7/X;

    move-result-object v2

    if-eqz v2, :cond_1

    move v0, v1

    :cond_1
    add-int/2addr p2, v0

    invoke-interface {p1}, LO7/k0;->t0()Z

    move-result v0

    const/4 v2, 0x2

    if-eqz v0, :cond_4

    if-eqz p2, :cond_3

    if-eq p2, v1, :cond_2

    if-ne p2, v2, :cond_5

    new-instance p2, LI7/r;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/r;-><init>(LI7/n;LO7/U;)V

    return-object p2

    :cond_2
    new-instance p2, LI7/q;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/q;-><init>(LI7/n;LO7/U;)V

    return-object p2

    :cond_3
    new-instance p2, LI7/p;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/p;-><init>(LI7/n;LO7/U;)V

    return-object p2

    :cond_4
    if-eqz p2, :cond_7

    if-eq p2, v1, :cond_6

    if-ne p2, v2, :cond_5

    new-instance p2, LI7/x;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/x;-><init>(LI7/n;LO7/U;)V

    return-object p2

    :cond_5
    new-instance p2, LI7/D;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported property: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, LI7/D;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    new-instance p2, LI7/w;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/w;-><init>(LI7/n;LO7/U;)V

    return-object p2

    :cond_7
    new-instance p2, LI7/v;

    iget-object v0, p0, LI7/e;->a:LI7/n;

    invoke-direct {p2, v0, p1}, LI7/v;-><init>(LI7/n;LO7/U;)V

    return-object p2
.end method
