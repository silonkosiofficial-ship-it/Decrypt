.class public LI7/w;
.super LI7/y;
.source "SourceFile"

# interfaces
.implements LF7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/w$a;
    }
.end annotation


# instance fields
.field private final Q:Li7/n;

.field private final R:Li7/n;


# direct methods
.method public constructor <init>(LI7/n;LO7/U;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LI7/y;-><init>(LI7/n;LO7/U;)V

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/w$b;

    invoke-direct {p2, p0}, LI7/w$b;-><init>(LI7/w;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LI7/w;->Q:Li7/n;

    new-instance p2, LI7/w$c;

    invoke-direct {p2, p0}, LI7/w$c;-><init>(LI7/w;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/w;->R:Li7/n;

    return-void
.end method

.method public constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/w$b;

    invoke-direct {p2, p0}, LI7/w$b;-><init>(LI7/w;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LI7/w;->Q:Li7/n;

    new-instance p2, LI7/w$c;

    invoke-direct {p2, p0}, LI7/w$c;-><init>(LI7/w;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/w;->R:Li7/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic J()LI7/y$c;
    .locals 1

    invoke-virtual {p0}, LI7/w;->M()LI7/w$a;

    move-result-object v0

    return-object v0
.end method

.method public M()LI7/w$a;
    .locals 1

    iget-object v0, p0, LI7/w;->Q:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/w$a;

    return-object v0
.end method

.method public bridge synthetic d()LF7/k$b;
    .locals 1

    invoke-virtual {p0}, LI7/w;->M()LI7/w$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()LF7/m$a;
    .locals 1

    invoke-virtual {p0}, LI7/w;->M()LI7/w$a;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LI7/w;->M()LI7/w$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, LI7/j;->z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LI7/w;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
