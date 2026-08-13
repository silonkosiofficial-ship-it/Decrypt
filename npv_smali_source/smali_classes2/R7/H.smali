.class public LR7/H;
.super Ly8/i;
.source "SourceFile"


# instance fields
.field private final b:LO7/G;

.field private final c:Ln8/c;


# direct methods
.method public constructor <init>(LO7/G;Ln8/c;)V
    .locals 1

    const-string v0, "moduleDescriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/i;-><init>()V

    iput-object p1, p0, LR7/H;->b:LO7/G;

    iput-object p2, p0, LR7/H;->c:Ln8/c;

    return-void
.end method


# virtual methods
.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 3

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Ly8/d;->a(I)Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object v0, p0, LR7/H;->c:Ln8/c;

    invoke-virtual {v0}, Ln8/c;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ly8/d;->l()Ljava/util/List;

    move-result-object p1

    sget-object v0, Ly8/c$b;->a:Ly8/c$b;

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, LR7/H;->b:LO7/G;

    iget-object v0, p0, LR7/H;->c:Ln8/c;

    invoke-interface {p1, v0, p2}, LO7/G;->x(Ln8/c;Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/c;

    invoke-virtual {v1}, Ln8/c;->g()Ln8/f;

    move-result-object v1

    const-string v2, "shortName(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v1}, LR7/H;->h(Ln8/f;)LO7/P;

    move-result-object v1

    invoke-static {v0, v1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected final h(Ln8/f;)LO7/P;
    .locals 3

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/f;->q()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, LR7/H;->b:LO7/G;

    iget-object v2, p0, LR7/H;->c:Ln8/c;

    invoke-virtual {v2, p1}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object p1

    const-string v2, "child(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, LO7/G;->s0(Ln8/c;)LO7/P;

    move-result-object p1

    invoke-interface {p1}, LO7/P;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "subpackages of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR7/H;->c:Ln8/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LR7/H;->b:LO7/G;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
