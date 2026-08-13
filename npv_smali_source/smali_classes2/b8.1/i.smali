.class public final Lb8/i;
.super Lb8/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/i$a;,
        Lb8/i$b;
    }
.end annotation


# instance fields
.field private final n:Le8/u;

.field private final o:Lb8/h;

.field private final p:LE8/j;

.field private final q:LE8/h;


# direct methods
.method public constructor <init>(La8/g;Le8/u;Lb8/h;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownerDescriptor"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lb8/m;-><init>(La8/g;)V

    iput-object p2, p0, Lb8/i;->n:Le8/u;

    iput-object p3, p0, Lb8/i;->o:Lb8/h;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/i$d;

    invoke-direct {p3, p1, p0}, Lb8/i$d;-><init>(La8/g;Lb8/i;)V

    invoke-interface {p2, p3}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p2

    iput-object p2, p0, Lb8/i;->p:LE8/j;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance p3, Lb8/i$c;

    invoke-direct {p3, p0, p1}, Lb8/i$c;-><init>(Lb8/i;La8/g;)V

    invoke-interface {p2, p3}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, Lb8/i;->q:LE8/h;

    return-void
.end method

.method public static final synthetic M(Lb8/i;)Lm8/e;
    .locals 0

    invoke-direct {p0}, Lb8/i;->R()Lm8/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lb8/i;Lg8/t;)Lb8/i$b;
    .locals 0

    invoke-direct {p0, p1}, Lb8/i;->T(Lg8/t;)Lb8/i$b;

    move-result-object p0

    return-object p0
.end method

.method private final O(Ln8/f;Le8/g;)LO7/e;
    .locals 3

    .prologue
    sget-object v0, Ln8/h;->a:Ln8/h;

    invoke-virtual {v0, p1}, Ln8/h;->a(Ln8/f;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lb8/i;->p:LE8/j;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez p2, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Lb8/i;->q:LE8/h;

    new-instance v1, Lb8/i$a;

    invoke-direct {v1, p1, p2}, Lb8/i$a;-><init>(Ln8/f;Le8/g;)V

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e;

    return-object p1
.end method

.method private final R()Lm8/e;
    .locals 1

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->b()Lg8/j;

    move-result-object v0

    invoke-virtual {v0}, Lg8/j;->d()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-static {v0}, LP8/c;->a(LB8/l;)Lm8/e;

    move-result-object v0

    return-object v0
.end method

.method private final T(Lg8/t;)Lb8/i$b;
    .locals 2

    .prologue
    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lb8/i$b$b;->a:Lb8/i$b$b;

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lg8/t;->b()Lh8/a;

    move-result-object v0

    invoke-virtual {v0}, Lh8/a;->c()Lh8/a$a;

    move-result-object v0

    sget-object v1, Lh8/a$a;->G:Lh8/a$a;

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lb8/j;->w()La8/g;

    move-result-object v0

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->b()Lg8/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg8/j;->l(Lg8/t;)LO7/e;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lb8/i$b$a;

    invoke-direct {v0, p1}, Lb8/i$b$a;-><init>(LO7/e;)V

    move-object p1, v0

    goto :goto_0

    :cond_2
    sget-object p1, Lb8/i$b$c;->a:Lb8/i$b$c;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public bridge synthetic C()LO7/m;
    .locals 1

    invoke-virtual {p0}, Lb8/i;->S()Lb8/h;

    move-result-object v0

    return-object v0
.end method

.method public final P(Le8/g;)LO7/e;
    .locals 1

    const-string v0, "javaClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/t;->getName()Ln8/f;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lb8/i;->O(Ln8/f;Le8/g;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method public Q(Ln8/f;LW7/b;)LO7/e;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lb8/i;->O(Ln8/f;Le8/g;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method protected S()Lb8/h;
    .locals 1

    iget-object v0, p0, Lb8/i;->o:Lb8/h;

    return-object v0
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 4

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->c()I

    move-result v1

    invoke-virtual {v0}, Ly8/d$a;->e()I

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Ly8/d;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lb8/j;->v()LE8/i;

    move-result-object p1

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/m;

    instance-of v3, v2, LO7/e;

    if-eqz v3, :cond_1

    check-cast v2, LO7/e;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public bridge synthetic g(Ln8/f;LW7/b;)LO7/h;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb8/i;->Q(Ln8/f;LW7/b;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method protected l(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 3

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Ly8/d;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lb8/i;->p:LE8/j;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    iget-object p1, p0, Lb8/i;->n:Le8/u;

    if-nez p2, :cond_3

    invoke-static {}, LP8/e;->a()Lx7/l;

    move-result-object p2

    :cond_3
    invoke-interface {p1, p2}, Le8/u;->x(Lx7/l;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/LinkedHashSet;

    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8/g;

    invoke-interface {v0}, Le8/g;->O()Le8/D;

    move-result-object v1

    sget-object v2, Le8/D;->C:Le8/D;

    if-ne v1, v2, :cond_5

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    invoke-interface {v0}, Le8/t;->getName()Ln8/f;

    move-result-object v0

    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object p2
.end method

.method protected n(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method protected p()Lb8/b;
    .locals 1

    sget-object v0, Lb8/b$a;->a:Lb8/b$a;

    return-object v0
.end method

.method protected r(Ljava/util/Collection;Ln8/f;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected t(Ly8/d;Lx7/l;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
