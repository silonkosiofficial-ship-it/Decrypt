.class public final LL6/a;
.super LD6/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(LC6/c;Lx7/a;LD6/b;LT6/p;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originCall"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responseHeaders"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LD6/b;-><init>(LC6/c;)V

    new-instance p1, LL6/c;

    invoke-virtual {p3}, LD6/b;->d()LO6/b;

    move-result-object v0

    invoke-direct {p1, p0, v0}, LL6/c;-><init>(LD6/b;LO6/b;)V

    invoke-virtual {p0, p1}, LD6/b;->h(LO6/b;)V

    new-instance p1, LL6/d;

    invoke-virtual {p3}, LD6/b;->e()LQ6/c;

    move-result-object p3

    invoke-direct {p1, p0, p2, p3, p4}, LL6/d;-><init>(LD6/b;Lx7/a;LQ6/c;LT6/p;)V

    invoke-virtual {p0, p1}, LD6/b;->i(LQ6/c;)V

    return-void
.end method

.method public synthetic constructor <init>(LC6/c;Lx7/a;LD6/b;LT6/p;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    invoke-virtual {p3}, LD6/b;->e()LQ6/c;

    move-result-object p4

    invoke-interface {p4}, LT6/x;->a()LT6/p;

    move-result-object p4

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LL6/a;-><init>(LC6/c;Lx7/a;LD6/b;LT6/p;)V

    return-void
.end method
