.class final LD8/d$a;
.super LD8/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final g:LG8/g;

.field private final h:LE8/i;

.field private final i:LE8/i;

.field final synthetic j:LD8/d;


# direct methods
.method public constructor <init>(LD8/d;LG8/g;)V
    .locals 7

    .prologue
    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/d$a;->j:LD8/d;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object v2

    invoke-virtual {p1}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->I0()Ljava/util/List;

    move-result-object v3

    const-string v0, "getFunctionList(...)"

    invoke-static {v3, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->W0()Ljava/util/List;

    move-result-object v4

    const-string v0, "getPropertyList(...)"

    invoke-static {v4, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->e1()Ljava/util/List;

    move-result-object v5

    const-string v0, "getTypeAliasList(...)"

    invoke-static {v5, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->T0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getNestedClassNameList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->g()Lk8/c;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {p1, v6}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v6, LD8/d$a$a;

    invoke-direct {v6, v1}, LD8/d$a$a;-><init>(Ljava/util/List;)V

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, LD8/h;-><init>(LB8/m;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx7/a;)V

    iput-object p2, p0, LD8/d$a;->g:LG8/g;

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/d$a$b;

    invoke-direct {p2, p0}, LD8/d$a$b;-><init>(LD8/d$a;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/d$a;->h:LE8/i;

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/d$a$d;

    invoke-direct {p2, p0}, LD8/d$a$d;-><init>(LD8/d$a;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/d$a;->i:LE8/i;

    return-void
.end method

.method private final A(Ln8/f;Ljava/util/Collection;Ljava/util/List;)V
    .locals 6

    new-instance v3, Ljava/util/ArrayList;

    move-object v0, p3

    check-cast v0, Ljava/util/Collection;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->n()LG8/l;

    move-result-object v0

    invoke-interface {v0}, LG8/l;->a()Lr8/l;

    move-result-object v0

    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v4

    new-instance v5, LD8/d$a$c;

    invoke-direct {v5, p3}, LD8/d$a$c;-><init>(Ljava/util/List;)V

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lr8/l;->v(Ln8/f;Ljava/util/Collection;Ljava/util/Collection;LO7/e;Lr8/k;)V

    return-void
.end method

.method private final B()LD8/d;
    .locals 1

    iget-object v0, p0, LD8/d$a;->j:LD8/d;

    return-object v0
.end method

.method public static final synthetic y(LD8/d$a;)LD8/d;
    .locals 0

    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic z(LD8/d$a;)LG8/g;
    .locals 0

    iget-object p0, p0, LD8/d$a;->g:LG8/g;

    return-object p0
.end method


# virtual methods
.method public C(Ln8/f;LW7/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->p()LW7/c;

    move-result-object v0

    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v1

    invoke-static {v0, p2, v1, p1}, LV7/a;->a(LW7/c;LW7/b;LO7/e;Ln8/f;)V

    return-void
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LD8/d$a;->C(Ln8/f;LW7/b;)V

    invoke-super {p0, p1, p2}, LD8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LD8/d$a;->C(Ln8/f;LW7/b;)V

    invoke-super {p0, p1, p2}, LD8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LD8/d$a;->h:LE8/i;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LD8/d$a;->C(Ln8/f;LW7/b;)V

    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v0

    invoke-static {v0}, LD8/d;->Z0(LD8/d;)LD8/d$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LD8/d$c;->f(Ln8/f;)LO7/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, LD8/h;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object p1

    return-object p1
.end method

.method protected i(Ljava/util/Collection;Lx7/l;)V
    .locals 1

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object p2

    invoke-static {p2}, LD8/d;->Z0(LD8/d;)LD8/d$c;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LD8/d$c;->d()Ljava/util/Collection;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    :cond_1
    invoke-interface {p1, p2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method protected k(Ln8/f;Ljava/util/List;)V
    .locals 4

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functions"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LD8/d$a;->i:LE8/i;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    sget-object v3, LW7/d;->N:LW7/d;

    invoke-interface {v2, p1, v3}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->c()LB8/k;

    move-result-object v1

    invoke-virtual {v1}, LB8/k;->c()LQ7/a;

    move-result-object v1

    iget-object v2, p0, LD8/d$a;->j:LD8/d;

    invoke-interface {v1, p1, v2}, LQ7/a;->c(Ln8/f;LO7/e;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-direct {p0, p1, v0, p2}, LD8/d$a;->A(Ln8/f;Ljava/util/Collection;Ljava/util/List;)V

    return-void
.end method

.method protected l(Ln8/f;Ljava/util/List;)V
    .locals 4

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptors"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LD8/d$a;->i:LE8/i;

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    sget-object v3, LW7/d;->N:LW7/d;

    invoke-interface {v2, p1, v3}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, v0, p2}, LD8/d$a;->A(Ln8/f;Ljava/util/Collection;Ljava/util/List;)V

    return-void
.end method

.method protected m(Ln8/f;)Ln8/b;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/d$a;->j:LD8/d;

    invoke-static {v0}, LD8/d;->Y0(LD8/d;)Ln8/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln8/b;->d(Ln8/f;)Ln8/b;

    move-result-object p1

    const-string v0, "createNestedClassId(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method protected s()Ljava/util/Set;
    .locals 3

    .prologue
    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v0

    invoke-static {v0}, LD8/d;->a1(LD8/d;)LD8/d$b;

    move-result-object v0

    invoke-virtual {v0}, LF8/f;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    invoke-interface {v2}, Ly8/h;->f()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method protected t()Ljava/util/Set;
    .locals 3

    .prologue
    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v0

    invoke-static {v0}, LD8/d;->a1(LD8/d;)LD8/d$b;

    move-result-object v0

    invoke-virtual {v0}, LF8/f;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    invoke-interface {v2}, Ly8/h;->a()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LD8/d$a;->j:LD8/d;

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->c()LB8/k;

    move-result-object v2

    invoke-virtual {v2}, LB8/k;->c()LQ7/a;

    move-result-object v2

    invoke-interface {v2, v0}, LQ7/a;->b(LO7/e;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method protected u()Ljava/util/Set;
    .locals 3

    .prologue
    invoke-direct {p0}, LD8/d$a;->B()LD8/d;

    move-result-object v0

    invoke-static {v0}, LD8/d;->a1(LD8/d;)LD8/d$b;

    move-result-object v0

    invoke-virtual {v0}, LF8/f;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    invoke-interface {v2}, Ly8/h;->d()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method protected x(LO7/Z;)Z
    .locals 2

    const-string v0, "function"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LD8/h;->p()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->t()LQ7/c;

    move-result-object v0

    iget-object v1, p0, LD8/d$a;->j:LD8/d;

    invoke-interface {v0, v1, p1}, LQ7/c;->d(LO7/e;LO7/Z;)Z

    move-result p1

    return p1
.end method
