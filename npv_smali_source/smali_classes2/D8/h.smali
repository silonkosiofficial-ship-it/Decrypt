.class public abstract LD8/h;
.super Ly8/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD8/h$a;,
        LD8/h$b;,
        LD8/h$c;
    }
.end annotation


# static fields
.field static final synthetic f:[LF7/k;


# instance fields
.field private final b:LB8/m;

.field private final c:LD8/h$a;

.field private final d:LE8/i;

.field private final e:LE8/j;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, LD8/h;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "classNames"

    const-string v4, "getClassNames$deserialization()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "classifierNamesLazy"

    const-string v4, "getClassifierNamesLazy()Ljava/util/Set;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LD8/h;->f:[LF7/k;

    return-void
.end method

.method protected constructor <init>(LB8/m;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lx7/a;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "functionList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "classNames"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/i;-><init>()V

    iput-object p1, p0, LD8/h;->b:LB8/m;

    invoke-direct {p0, p2, p3, p4}, LD8/h;->n(Ljava/util/List;Ljava/util/List;Ljava/util/List;)LD8/h$a;

    move-result-object p2

    iput-object p2, p0, LD8/h;->c:LD8/h$a;

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$d;

    invoke-direct {p3, p5}, LD8/h$d;-><init>(Lx7/a;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h;->d:LE8/i;

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$e;

    invoke-direct {p2, p0}, LD8/h$e;-><init>(LD8/h;)V

    invoke-interface {p1, p2}, LE8/n;->f(Lx7/a;)LE8/j;

    move-result-object p1

    iput-object p1, p0, LD8/h;->e:LE8/j;

    return-void
.end method

.method public static final synthetic h(LD8/h;)LD8/h$a;
    .locals 0

    iget-object p0, p0, LD8/h;->c:LD8/h$a;

    return-object p0
.end method

.method private final n(Ljava/util/List;Ljava/util/List;Ljava/util/List;)LD8/h$a;
    .locals 1

    .prologue
    iget-object v0, p0, LD8/h;->b:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {v0}, LB8/k;->g()LB8/l;

    move-result-object v0

    invoke-interface {v0}, LB8/l;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LD8/h$b;

    invoke-direct {v0, p0, p1, p2, p3}, LD8/h$b;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance v0, LD8/h$c;

    invoke-direct {v0, p0, p1, p2, p3}, LD8/h$c;-><init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    :goto_0
    return-object v0
.end method

.method private final o(Ln8/f;)LO7/e;
    .locals 1

    iget-object v0, p0, LD8/h;->b:LB8/m;

    invoke-virtual {v0}, LB8/m;->c()LB8/k;

    move-result-object v0

    invoke-virtual {p0, p1}, LD8/h;->m(Ln8/f;)Ln8/b;

    move-result-object p1

    invoke-virtual {v0, p1}, LB8/k;->b(Ln8/b;)LO7/e;

    move-result-object p1

    return-object p1
.end method

.method private final r()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h;->e:LE8/j;

    sget-object v1, LD8/h;->f:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->b(LE8/j;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final v(Ln8/f;)LO7/e0;
    .locals 1

    iget-object v0, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v0, p1}, LD8/h$a;->g(Ln8/f;)LO7/e0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v0}, LD8/h$a;->a()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v0, p1, p2}, LD8/h$a;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v0, p1, p2}, LD8/h$a;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v0}, LD8/h$a;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, LD8/h;->r()Ljava/util/Set;

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

    invoke-virtual {p0, p1}, LD8/h;->w(Ln8/f;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, LD8/h;->o(Ln8/f;)LO7/e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {p2}, LD8/h$a;->f()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0, p1}, LD8/h;->v(Ln8/f;)LO7/e0;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected abstract i(Ljava/util/Collection;Lx7/l;)V
.end method

.method protected final j(Ly8/d;Lx7/l;LW7/b;)Ljava/util/Collection;
    .locals 3

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v1, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v1}, Ly8/d$a;->g()I

    move-result v2

    invoke-virtual {p1, v2}, Ly8/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, p2}, LD8/h;->i(Ljava/util/Collection;Lx7/l;)V

    :cond_0
    iget-object v2, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v2, v0, p1, p2, p3}, LD8/h$a;->e(Ljava/util/Collection;Ly8/d;Lx7/l;LW7/b;)V

    invoke-virtual {v1}, Ly8/d$a;->c()I

    move-result p3

    invoke-virtual {p1, p3}, Ly8/d;->a(I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, LD8/h;->q()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln8/f;

    invoke-interface {p2, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v1}, LD8/h;->o(Ln8/f;)LO7/e;

    move-result-object v1

    invoke-static {v0, v1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object p3, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {p3}, Ly8/d$a;->h()I

    move-result p3

    invoke-virtual {p1, p3}, Ly8/d;->a(I)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {p1}, LD8/h$a;->f()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ln8/f;

    invoke-interface {p2, p3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, LD8/h;->c:LD8/h$a;

    invoke-interface {v1, p3}, LD8/h$a;->g(Ln8/f;)LO7/e0;

    move-result-object p3

    invoke-static {v0, p3}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, LP8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method protected k(Ln8/f;Ljava/util/List;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "functions"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected l(Ln8/f;Ljava/util/List;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "descriptors"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract m(Ln8/f;)Ln8/b;
.end method

.method protected final p()LB8/m;
    .locals 1

    iget-object v0, p0, LD8/h;->b:LB8/m;

    return-object v0
.end method

.method public final q()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h;->d:LE8/i;

    sget-object v1, LD8/h;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method protected abstract s()Ljava/util/Set;
.end method

.method protected abstract t()Ljava/util/Set;
.end method

.method protected abstract u()Ljava/util/Set;
.end method

.method protected w(Ln8/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LD8/h;->q()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method protected x(LO7/Z;)Z
    .locals 1

    const-string v0, "function"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
