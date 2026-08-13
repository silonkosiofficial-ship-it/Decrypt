.class public final LI7/t;
.super LI7/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI7/t$a;
    }
.end annotation


# instance fields
.field private final F:Ljava/lang/Class;

.field private final G:Li7/n;


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1

    const-string v0, "jClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/n;-><init>()V

    iput-object p1, p0, LI7/t;->F:Ljava/lang/Class;

    sget-object p1, Li7/r;->D:Li7/r;

    new-instance v0, LI7/t$b;

    invoke-direct {v0, p0}, LI7/t$b;-><init>(LI7/t;)V

    invoke-static {p1, v0}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, LI7/t;->G:Li7/n;

    return-void
.end method

.method private final D()Ly8/h;
    .locals 1

    iget-object v0, p0, LI7/t;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/t$a;

    invoke-virtual {v0}, LI7/t$a;->f()Ly8/h;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, LI7/t;->F:Ljava/lang/Class;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    instance-of v0, p1, LI7/t;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v0

    check-cast p1, LI7/t;

    invoke-virtual {p1}, LI7/t;->e()Ljava/lang/Class;

    move-result-object p1

    invoke-static {v0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public q()Ljava/util/Collection;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public r(Ln8/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/t;->D()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->J:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public t(I)LO7/U;
    .locals 9

    .prologue
    iget-object v0, p0, LI7/t;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/t$a;

    invoke-virtual {v0}, LI7/t$a;->d()Li7/A;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/A;->a()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lm8/f;

    invoke-virtual {v0}, Li7/A;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li8/l;

    invoke-virtual {v0}, Li7/A;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lm8/e;

    sget-object v0, Ll8/a;->n:Lp8/i$f;

    const-string v3, "packageLocalVariable"

    invoke-static {v0, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0, p1}, Lk8/e;->b(Lp8/i$d;Lp8/i$f;I)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Li8/n;

    if-eqz v4, :cond_0

    invoke-virtual {p0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v3

    new-instance v6, Lk8/g;

    invoke-virtual {v2}, Li8/l;->V()Li8/t;

    move-result-object p1

    const-string v0, "getTypeTable(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, p1}, Lk8/g;-><init>(Li8/t;)V

    sget-object v8, LI7/t$c;->L:LI7/t$c;

    invoke-static/range {v3 .. v8}, LI7/M;->h(Ljava/lang/Class;Lp8/p;Lk8/c;Lk8/g;Lk8/a;Lx7/p;)LO7/a;

    move-result-object p1

    move-object v1, p1

    check-cast v1, LO7/U;

    :cond_0
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LU7/d;->a(Ljava/lang/Class;)Ln8/b;

    move-result-object v1

    invoke-virtual {v1}, Ln8/b;->b()Ln8/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected v()Ljava/lang/Class;
    .locals 1

    .prologue
    iget-object v0, p0, LI7/t;->G:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI7/t$a;

    invoke-virtual {v0}, LI7/t$a;->e()Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LI7/t;->e()Ljava/lang/Class;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public w(Ln8/f;)Ljava/util/Collection;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LI7/t;->D()Ly8/h;

    move-result-object v0

    sget-object v1, LW7/d;->J:LW7/d;

    invoke-interface {v0, p1, v1}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
