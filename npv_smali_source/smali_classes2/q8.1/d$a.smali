.class final Lq8/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/d$a$a;
    }
.end annotation


# instance fields
.field final synthetic a:Lq8/d;


# direct methods
.method public constructor <init>(Lq8/d;)V
    .locals 0

    iput-object p1, p0, Lq8/d$a;->a:Lq8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final t(LO7/T;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    .prologue
    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-virtual {v0}, Lq8/d;->k0()Lq8/l;

    move-result-object v0

    sget-object v1, Lq8/d$a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 p3, 0x2

    if-eq v0, p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lq8/d$a;->p(LO7/y;Ljava/lang/StringBuilder;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->z(Lq8/d;LO7/T;Ljava/lang/StringBuilder;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lq8/d$a;->a:Lq8/d;

    invoke-interface {p1}, LO7/T;->K0()LO7/U;

    move-result-object p1

    const-string v0, "getCorrespondingProperty(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p1, p2}, Lq8/d;->G(Lq8/d;LO7/U;Ljava/lang/StringBuilder;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A(LO7/j0;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, p2, v1}, Lq8/d;->J(Lq8/d;LO7/j0;ZLjava/lang/StringBuilder;Z)V

    return-void
.end method

.method public bridge synthetic a(LO7/W;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->w(LO7/W;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic b(LO7/j0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->A(LO7/j0;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic c(LO7/e0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->y(LO7/e0;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic d(LO7/y;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->p(LO7/y;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic e(LO7/l;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->o(LO7/l;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic f(LO7/X;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->x(LO7/X;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic g(LO7/V;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->v(LO7/V;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic h(LO7/U;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->u(LO7/U;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic i(LO7/f0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->z(LO7/f0;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic j(LO7/K;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->r(LO7/K;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic k(LO7/P;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->s(LO7/P;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic l(LO7/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->n(LO7/e;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public bridge synthetic m(LO7/G;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Lq8/d$a;->q(LO7/G;Ljava/lang/StringBuilder;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public n(LO7/e;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->A(Lq8/d;LO7/e;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public o(LO7/l;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "constructorDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->B(Lq8/d;LO7/l;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public p(LO7/y;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->C(Lq8/d;LO7/y;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public q(LO7/G;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lq8/d;->D(Lq8/d;LO7/m;Ljava/lang/StringBuilder;Z)V

    return-void
.end method

.method public r(LO7/K;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->E(Lq8/d;LO7/K;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public s(LO7/P;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->F(Lq8/d;LO7/P;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public u(LO7/U;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->G(Lq8/d;LO7/U;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public v(LO7/V;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getter"

    invoke-direct {p0, p1, p2, v0}, Lq8/d$a;->t(LO7/T;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public w(LO7/W;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "setter"

    invoke-direct {p0, p1, p2, v0}, Lq8/d$a;->t(LO7/T;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public x(LO7/X;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public y(LO7/e0;Ljava/lang/StringBuilder;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    invoke-static {v0, p1, p2}, Lq8/d;->H(Lq8/d;LO7/e0;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public z(LO7/f0;Ljava/lang/StringBuilder;)V
    .locals 2

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq8/d$a;->a:Lq8/d;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1}, Lq8/d;->I(Lq8/d;LO7/f0;Ljava/lang/StringBuilder;Z)V

    return-void
.end method
