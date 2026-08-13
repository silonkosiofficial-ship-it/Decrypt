.class public final LL6/d;
.super LQ6/c;
.source "SourceFile"


# instance fields
.field private final C:LD6/b;

.field private final D:Lx7/a;

.field private final E:LQ6/c;

.field private final F:LT6/p;

.field private final G:Lm7/i;


# direct methods
.method public constructor <init>(LD6/b;Lx7/a;LQ6/c;LT6/p;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LQ6/c;-><init>()V

    iput-object p1, p0, LL6/d;->C:LD6/b;

    iput-object p2, p0, LL6/d;->D:Lx7/a;

    iput-object p3, p0, LL6/d;->E:LQ6/c;

    iput-object p4, p0, LL6/d;->F:LT6/p;

    invoke-interface {p3}, LW8/N;->getCoroutineContext()Lm7/i;

    move-result-object p1

    iput-object p1, p0, LL6/d;->G:Lm7/i;

    return-void
.end method


# virtual methods
.method public H0()LD6/b;
    .locals 1

    iget-object v0, p0, LL6/d;->C:LD6/b;

    return-object v0
.end method

.method public a()LT6/p;
    .locals 1

    iget-object v0, p0, LL6/d;->F:LT6/p;

    return-object v0
.end method

.method public b()Lio/ktor/utils/io/d;
    .locals 1

    iget-object v0, p0, LL6/d;->D:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/d;

    return-object v0
.end method

.method public c()LY6/b;
    .locals 1

    iget-object v0, p0, LL6/d;->E:LQ6/c;

    invoke-virtual {v0}, LQ6/c;->c()LY6/b;

    move-result-object v0

    return-object v0
.end method

.method public d()LY6/b;
    .locals 1

    iget-object v0, p0, LL6/d;->E:LQ6/c;

    invoke-virtual {v0}, LQ6/c;->d()LY6/b;

    move-result-object v0

    return-object v0
.end method

.method public e()LT6/C;
    .locals 1

    iget-object v0, p0, LL6/d;->E:LQ6/c;

    invoke-virtual {v0}, LQ6/c;->e()LT6/C;

    move-result-object v0

    return-object v0
.end method

.method public f()LT6/B;
    .locals 1

    iget-object v0, p0, LL6/d;->E:LQ6/c;

    invoke-virtual {v0}, LQ6/c;->f()LT6/B;

    move-result-object v0

    return-object v0
.end method

.method public getCoroutineContext()Lm7/i;
    .locals 1

    iget-object v0, p0, LL6/d;->G:Lm7/i;

    return-object v0
.end method
