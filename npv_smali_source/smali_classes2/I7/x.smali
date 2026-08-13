.class public LI7/x;
.super LI7/y;
.source "SourceFile"

# interfaces
.implements LF7/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/x$a;
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

    new-instance p2, LI7/x$b;

    invoke-direct {p2, p0}, LI7/x$b;-><init>(LI7/x;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LI7/x;->Q:Li7/n;

    new-instance p2, LI7/x$c;

    invoke-direct {p2, p0}, LI7/x$c;-><init>(LI7/x;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/x;->R:Li7/n;

    return-void
.end method

.method public constructor <init>(LI7/n;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "container"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly7/f;->I:Ljava/lang/Object;

    invoke-direct {p0, p1, p2, p3, v0}, LI7/y;-><init>(LI7/n;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance p2, LI7/x$b;

    invoke-direct {p2, p0}, LI7/x$b;-><init>(LI7/x;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p2

    iput-object p2, p0, LI7/x;->Q:Li7/n;

    new-instance p2, LI7/x$c;

    invoke-direct {p2, p0}, LI7/x$c;-><init>(LI7/x;)V

    invoke-static {p1, p2}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/x;->R:Li7/n;

    return-void
.end method


# virtual methods
.method public bridge synthetic J()LI7/y$c;
    .locals 1

    invoke-virtual {p0}, LI7/x;->M()LI7/x$a;

    move-result-object v0

    return-object v0
.end method

.method public M()LI7/x$a;
    .locals 1

    iget-object v0, p0, LI7/x;->Q:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/x$a;

    return-object v0
.end method

.method public bridge synthetic d()LF7/k$b;
    .locals 1

    invoke-virtual {p0}, LI7/x;->M()LI7/x$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d()LF7/n$a;
    .locals 1

    invoke-virtual {p0}, LI7/x;->M()LI7/x$a;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI7/x;->w(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public w(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, LI7/x;->M()LI7/x$a;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-virtual {v0, v1}, LI7/j;->z([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
