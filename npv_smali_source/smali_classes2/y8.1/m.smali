.class public final Ly8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h;


# instance fields
.field private final b:Ly8/h;

.field private final c:Li7/n;

.field private final d:LF8/n0;

.field private e:Ljava/util/Map;

.field private final f:Li7/n;


# direct methods
.method public constructor <init>(Ly8/h;LF8/n0;)V
    .locals 2

    const-string v0, "workerScope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "givenSubstitutor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/m;->b:Ly8/h;

    new-instance p1, Ly8/m$b;

    invoke-direct {p1, p2}, Ly8/m$b;-><init>(LF8/n0;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Ly8/m;->c:Li7/n;

    invoke-virtual {p2}, LF8/n0;->j()LF8/l0;

    move-result-object p1

    const-string p2, "getSubstitution(...)"

    invoke-static {p1, p2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0}, Ls8/d;->f(LF8/l0;ZILjava/lang/Object;)LF8/l0;

    move-result-object p1

    invoke-virtual {p1}, LF8/l0;->c()LF8/n0;

    move-result-object p1

    iput-object p1, p0, Ly8/m;->d:LF8/n0;

    new-instance p1, Ly8/m$a;

    invoke-direct {p1, p0}, Ly8/m$a;-><init>(Ly8/m;)V

    invoke-static {p1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object p1

    iput-object p1, p0, Ly8/m;->f:Li7/n;

    return-void
.end method

.method public static final synthetic h(Ly8/m;)Ly8/h;
    .locals 0

    iget-object p0, p0, Ly8/m;->b:Ly8/h;

    return-object p0
.end method

.method public static final synthetic i(Ly8/m;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, Ly8/m;->l(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method private final j()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Ly8/m;->f:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method private final k(LO7/m;)LO7/m;
    .locals 3

    .prologue
    iget-object v0, p0, Ly8/m;->d:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Ly8/m;->e:Ljava/util/Map;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ly8/m;->e:Ljava/util/Map;

    :cond_1
    iget-object v0, p0, Ly8/m;->e:Ljava/util/Map;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    instance-of v1, p1, LO7/c0;

    if-eqz v1, :cond_3

    move-object v1, p1

    check-cast v1, LO7/c0;

    iget-object v2, p0, Ly8/m;->d:LF8/n0;

    invoke-interface {v1, v2}, LO7/c0;->c(LF8/n0;)LO7/n;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " substitution fails"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown descriptor in scope: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    check-cast v1, LO7/m;

    const-string p1, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute"

    invoke-static {v1, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method private final l(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 2

    .prologue
    iget-object v0, p0, Ly8/m;->d:LF8/n0;

    invoke-virtual {v0}, LF8/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, LP8/a;->g(I)Ljava/util/LinkedHashSet;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LO7/m;

    invoke-direct {p0, v1}, Ly8/m;->k(LO7/m;)LO7/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0}, Ly8/h;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ly8/m;->l(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    invoke-direct {p0, p1}, Ly8/m;->l(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0}, Ly8/h;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/m;->j()Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0}, Ly8/h;->f()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/m;->b:Ly8/h;

    invoke-interface {v0, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Ly8/m;->k(LO7/m;)LO7/m;

    move-result-object p1

    check-cast p1, LO7/h;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
