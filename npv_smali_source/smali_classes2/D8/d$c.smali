.class final LD8/d$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:LE8/h;

.field private final c:LE8/i;

.field final synthetic d:LD8/d;


# direct methods
.method public constructor <init>(LD8/d;)V
    .locals 5

    .prologue
    iput-object p1, p0, LD8/d$c;->d:LD8/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LD8/d;->j1()Li8/c;

    move-result-object v0

    invoke-virtual {v0}, Li8/c;->D0()Ljava/util/List;

    move-result-object v0

    const-string v1, "getEnumEntryList(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, LE7/j;->d(II)I

    move-result v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Li8/g;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    invoke-virtual {v3}, Li8/g;->F()I

    move-result v3

    invoke-static {v4, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object v2, p0, LD8/d$c;->a:Ljava/util/Map;

    iget-object p1, p0, LD8/d$c;->d:LD8/d;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance v0, LD8/d$c$a;

    iget-object v1, p0, LD8/d$c;->d:LD8/d;

    invoke-direct {v0, p0, v1}, LD8/d$c$a;-><init>(LD8/d$c;LD8/d;)V

    invoke-interface {p1, v0}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, LD8/d$c;->b:LE8/h;

    iget-object p1, p0, LD8/d$c;->d:LD8/d;

    invoke-virtual {p1}, LD8/d;->i1()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance v0, LD8/d$c$b;

    invoke-direct {v0, p0}, LD8/d$c$b;-><init>(LD8/d$c;)V

    invoke-interface {p1, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/d$c;->c:LE8/i;

    return-void
.end method

.method public static final synthetic a(LD8/d$c;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, LD8/d$c;->e()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LD8/d$c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LD8/d$c;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic c(LD8/d$c;)LE8/i;
    .locals 0

    iget-object p0, p0, LD8/d$c;->c:LE8/i;

    return-object p0
.end method

.method private final e()Ljava/util/Set;
    .locals 5

    .prologue
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, LD8/d$c;->d:LD8/d;

    invoke-virtual {v1}, LD8/d;->p()LF8/e0;

    move-result-object v1

    invoke-interface {v1}, LF8/e0;->u()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LF8/E;

    invoke-virtual {v2}, LF8/E;->u()Ly8/h;

    move-result-object v2

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-static {v2, v4, v4, v3, v4}, Ly8/k$a;->a(Ly8/k;Ly8/d;Lx7/l;ILjava/lang/Object;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LO7/m;

    instance-of v4, v3, LO7/Z;

    if-nez v4, :cond_2

    instance-of v4, v3, LO7/U;

    if-eqz v4, :cond_1

    :cond_2
    invoke-interface {v3}, LO7/I;->getName()Ln8/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object v1, p0, LD8/d$c;->d:LD8/d;

    invoke-virtual {v1}, LD8/d;->j1()Li8/c;

    move-result-object v1

    invoke-virtual {v1}, Li8/c;->I0()Ljava/util/List;

    move-result-object v1

    const-string v2, "getFunctionList(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, LD8/d$c;->d:LD8/d;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/i;

    invoke-virtual {v2}, LD8/d;->i1()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    invoke-virtual {v3}, Li8/i;->d0()I

    move-result v3

    invoke-static {v4, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v1, p0, LD8/d$c;->d:LD8/d;

    invoke-virtual {v1}, LD8/d;->j1()Li8/c;

    move-result-object v1

    invoke-virtual {v1}, Li8/c;->W0()Ljava/util/List;

    move-result-object v1

    const-string v2, "getPropertyList(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, p0, LD8/d$c;->d:LD8/d;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li8/n;

    invoke-virtual {v2}, LD8/d;->i1()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    invoke-virtual {v3}, Li8/n;->c0()I

    move-result v3

    invoke-static {v4, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v0, v0}, Lj7/Z;->j(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final d()Ljava/util/Collection;
    .locals 3

    .prologue
    iget-object v0, p0, LD8/d$c;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-virtual {p0, v2}, LD8/d$c;->f(Ln8/f;)LO7/e;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final f(Ln8/f;)LO7/e;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/d$c;->b:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e;

    return-object p1
.end method
