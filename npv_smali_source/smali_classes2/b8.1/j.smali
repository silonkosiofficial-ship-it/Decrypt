.class public abstract Lb8/j;
.super Ly8/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/j$a;,
        Lb8/j$b;
    }
.end annotation


# static fields
.field static final synthetic m:[LF7/k;


# instance fields
.field private final b:La8/g;

.field private final c:Lb8/j;

.field private final d:LE8/i;

.field private final e:LE8/i;

.field private final f:LE8/g;

.field private final g:LE8/h;

.field private final h:LE8/g;

.field private final i:LE8/i;

.field private final j:LE8/i;

.field private final k:LE8/i;

.field private final l:LE8/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ly7/G;

    const-class v1, Lb8/j;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "functionNamesLazy"

    const-string v4, "getFunctionNamesLazy()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "propertyNamesLazy"

    const-string v5, "getPropertyNamesLazy()Ljava/util/Set;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v4, "classNamesLazy"

    const-string v5, "getClassNamesLazy()Ljava/util/Set;"

    invoke-direct {v3, v1, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v3, 0x3

    new-array v3, v3, [LF7/k;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const/4 v0, 0x2

    aput-object v1, v3, v0

    sput-object v3, Lb8/j;->m:[LF7/k;

    return-void
.end method

.method public constructor <init>(La8/g;Lb8/j;)V
    .locals 2

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/i;-><init>()V

    iput-object p1, p0, Lb8/j;->b:La8/g;

    iput-object p2, p0, Lb8/j;->c:Lb8/j;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$c;

    invoke-direct {v0, p0}, Lb8/j$c;-><init>(Lb8/j;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, LE8/n;->e(Lx7/a;Ljava/lang/Object;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->d:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$g;

    invoke-direct {v0, p0}, Lb8/j$g;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->e:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$f;

    invoke-direct {v0, p0}, Lb8/j$f;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->f:LE8/g;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$e;

    invoke-direct {v0, p0}, Lb8/j$e;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->g:LE8/h;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$i;

    invoke-direct {v0, p0}, Lb8/j$i;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->h:LE8/g;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$h;

    invoke-direct {v0, p0}, Lb8/j$h;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->i:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$k;

    invoke-direct {v0, p0}, Lb8/j$k;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->j:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p2

    new-instance v0, Lb8/j$d;

    invoke-direct {v0, p0}, Lb8/j$d;-><init>(Lb8/j;)V

    invoke-interface {p2, v0}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Lb8/j;->k:LE8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance p2, Lb8/j$j;

    invoke-direct {p2, p0}, Lb8/j$j;-><init>(Lb8/j;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, Lb8/j;->l:LE8/g;

    return-void
.end method

.method public synthetic constructor <init>(La8/g;Lb8/j;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lb8/j;-><init>(La8/g;Lb8/j;)V

    return-void
.end method

.method private final A()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lb8/j;->i:LE8/i;

    sget-object v1, Lb8/j;->m:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final D()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lb8/j;->j:LE8/i;

    sget-object v1, Lb8/j;->m:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method private final E(Le8/n;)LF8/E;
    .locals 8

    .prologue
    iget-object v0, p0, Lb8/j;->b:La8/g;

    invoke-virtual {v0}, La8/g;->g()Lc8/d;

    move-result-object v0

    invoke-interface {p1}, Le8/n;->getType()Le8/x;

    move-result-object v1

    sget-object v2, LF8/p0;->D:LF8/p0;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v0

    invoke-static {v0}, LL7/g;->s0(LF8/E;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, LL7/g;->v0(LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-direct {p0, p1}, Lb8/j;->F(Le8/n;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Le8/n;->U()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, LF8/q0;->n(LF8/E;)LF8/E;

    move-result-object p1

    const-string v0, "makeNotNullable(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    return-object v0
.end method

.method private final F(Le8/n;)Z
    .locals 1

    .prologue
    invoke-interface {p1}, Le8/s;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Le8/s;->W()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final J(Le8/n;)LO7/U;
    .locals 9

    .prologue
    new-instance v0, Ly7/O;

    invoke-direct {v0}, Ly7/O;-><init>()V

    invoke-direct {p0, p1}, Lb8/j;->u(Le8/n;)LR7/C;

    move-result-object v1

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, LR7/C;->e1(LR7/D;LO7/W;LO7/w;LO7/w;)V

    invoke-direct {p0, p1}, Lb8/j;->E(Le8/n;)LF8/E;

    move-result-object v4

    iget-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, LR7/C;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lb8/j;->z()LO7/X;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {v3 .. v8}, LR7/C;->k1(LF8/E;Ljava/util/List;LO7/X;LO7/X;Ljava/util/List;)V

    invoke-virtual {p0}, Lb8/j;->C()LO7/m;

    move-result-object v1

    instance-of v3, v1, LO7/e;

    if-eqz v3, :cond_0

    move-object v2, v1

    check-cast v2, LO7/e;

    :cond_0
    if-eqz v2, :cond_1

    iget-object v1, p0, Lb8/j;->b:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->w()Lw8/f;

    move-result-object v3

    iget-object v4, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v4, LR7/C;

    invoke-interface {v3, v1, v2, v4}, Lw8/f;->g(La8/g;LO7/e;LR7/C;)LR7/C;

    move-result-object v1

    iput-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    :cond_1
    iget-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, LO7/k0;

    check-cast v1, LR7/C;

    invoke-virtual {v1}, LR7/M;->getType()LF8/E;

    move-result-object v1

    invoke-static {v2, v1}, Lr8/f;->K(LO7/k0;LF8/E;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, LR7/C;

    new-instance v2, Lb8/j$l;

    invoke-direct {v2, p0, p1, v0}, Lb8/j$l;-><init>(Lb8/j;Le8/n;Ly7/O;)V

    invoke-virtual {v1, v2}, LR7/N;->U0(Lx7/a;)V

    :cond_2
    iget-object v1, p0, Lb8/j;->b:La8/g;

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->h()LY7/g;

    move-result-object v1

    iget-object v2, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast v2, LO7/U;

    invoke-interface {v1, p1, v2}, LY7/g;->e(Le8/n;LO7/U;)V

    iget-object p1, v0, Ly7/O;->C:Ljava/lang/Object;

    check-cast p1, LO7/U;

    return-object p1
.end method

.method private final L(Ljava/util/Set;)V
    .locals 7

    .prologue
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LO7/Z;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v3, v6, v6, v4, v5}, Lg8/y;->c(LO7/y;ZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    check-cast v1, Ljava/util/Collection;

    sget-object v2, Lb8/j$m;->D:Lb8/j$m;

    invoke-static {v1, v2}, Lr8/n;->a(Ljava/util/Collection;Lx7/l;)Ljava/util/Collection;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method public static final synthetic h(Lb8/j;)LE8/h;
    .locals 0

    iget-object p0, p0, Lb8/j;->g:LE8/h;

    return-object p0
.end method

.method public static final synthetic i(Lb8/j;)LE8/g;
    .locals 0

    iget-object p0, p0, Lb8/j;->f:LE8/g;

    return-object p0
.end method

.method public static final synthetic j(Lb8/j;Le8/n;)LO7/U;
    .locals 0

    invoke-direct {p0, p1}, Lb8/j;->J(Le8/n;)LO7/U;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lb8/j;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lb8/j;->L(Ljava/util/Set;)V

    return-void
.end method

.method private final u(Le8/n;)LR7/C;
    .locals 9

    invoke-interface {p1}, Le8/s;->q()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    iget-object v0, p0, Lb8/j;->b:La8/g;

    invoke-static {v0, p1}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v2

    invoke-virtual {p0}, Lb8/j;->C()LO7/m;

    move-result-object v1

    sget-object v3, LO7/D;->D:LO7/D;

    invoke-interface {p1}, Le8/s;->h()LO7/n0;

    move-result-object v0

    invoke-static {v0}, LX7/J;->d(LO7/n0;)LO7/u;

    move-result-object v4

    invoke-interface {p1}, Le8/t;->getName()Ln8/f;

    move-result-object v6

    iget-object v0, p0, Lb8/j;->b:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->t()Ld8/b;

    move-result-object v0

    invoke-interface {v0, p1}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v7

    invoke-direct {p0, p1}, Lb8/j;->F(Le8/n;)Z

    move-result v8

    invoke-static/range {v1 .. v8}, LZ7/f;->o1(LO7/m;LP7/g;LO7/D;LO7/u;ZLn8/f;LO7/a0;Z)LZ7/f;

    move-result-object p1

    const-string v0, "create(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final x()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lb8/j;->k:LE8/i;

    sget-object v1, Lb8/j;->m:[LF7/k;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method protected final B()Lb8/j;
    .locals 1

    iget-object v0, p0, Lb8/j;->c:Lb8/j;

    return-object v0
.end method

.method protected abstract C()LO7/m;
.end method

.method protected G(LZ7/e;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method protected abstract H(Le8/r;Ljava/util/List;LF8/E;Ljava/util/List;)Lb8/j$a;
.end method

.method protected final I(Le8/r;)LZ7/e;
    .locals 20

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "method"

    invoke-static {v7, v1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lb8/j;->b:La8/g;

    invoke-static {v1, v7}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lb8/j;->C()LO7/m;

    move-result-object v2

    invoke-interface/range {p1 .. p1}, Le8/t;->getName()Ln8/f;

    move-result-object v3

    iget-object v4, v0, Lb8/j;->b:La8/g;

    invoke-virtual {v4}, La8/g;->a()La8/b;

    move-result-object v4

    invoke-virtual {v4}, La8/b;->t()Ld8/b;

    move-result-object v4

    invoke-interface {v4, v7}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v4

    iget-object v5, v0, Lb8/j;->e:LE8/i;

    invoke-interface {v5}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb8/b;

    invoke-interface/range {p1 .. p1}, Le8/t;->getName()Ln8/f;

    move-result-object v6

    invoke-interface {v5, v6}, Lb8/b;->b(Ln8/f;)Le8/w;

    move-result-object v5

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v5, :cond_0

    invoke-interface/range {p1 .. p1}, Le8/r;->n()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v9

    goto :goto_0

    :cond_0
    move v5, v8

    :goto_0
    invoke-static {v2, v1, v3, v4, v5}, LZ7/e;->y1(LO7/m;LP7/g;Ln8/f;LO7/a0;Z)LZ7/e;

    move-result-object v15

    const-string v1, "createJavaMethod(...)"

    invoke-static {v15, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lb8/j;->b:La8/g;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v15

    move-object/from16 v3, p1

    invoke-static/range {v1 .. v6}, La8/a;->f(La8/g;LO7/m;Le8/z;IILjava/lang/Object;)La8/g;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, Le8/z;->g()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/y;

    invoke-virtual {v1}, La8/g;->f()La8/k;

    move-result-object v5

    invoke-interface {v5, v4}, La8/k;->a(Le8/y;)LO7/f0;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Le8/r;->n()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v15, v2}, Lb8/j;->K(La8/g;LO7/y;Ljava/util/List;)Lb8/j$b;

    move-result-object v2

    invoke-virtual {v0, v7, v1}, Lb8/j;->q(Le8/r;La8/g;)LF8/E;

    move-result-object v4

    invoke-virtual {v2}, Lb8/j$b;->a()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0, v7, v3, v4, v5}, Lb8/j;->H(Le8/r;Ljava/util/List;LF8/E;Ljava/util/List;)Lb8/j$a;

    move-result-object v3

    invoke-virtual {v3}, Lb8/j$a;->c()LF8/E;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v5, LP7/g;->d:LP7/g$a;

    invoke-virtual {v5}, LP7/g$a;->b()LP7/g;

    move-result-object v5

    invoke-static {v15, v4, v5}, Lr8/e;->i(LO7/a;LF8/E;LP7/g;)LO7/X;

    move-result-object v4

    :goto_2
    move-object v11, v4

    goto :goto_3

    :cond_2
    const/4 v4, 0x0

    goto :goto_2

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lb8/j;->z()LO7/X;

    move-result-object v12

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v3}, Lb8/j$a;->e()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v3}, Lb8/j$a;->f()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Lb8/j$a;->d()LF8/E;

    move-result-object v16

    sget-object v5, LO7/D;->C:LO7/D$a;

    invoke-interface/range {p1 .. p1}, Le8/s;->N()Z

    move-result v6

    invoke-interface/range {p1 .. p1}, Le8/s;->q()Z

    move-result v10

    xor-int/2addr v10, v9

    invoke-virtual {v5, v8, v6, v10}, LO7/D$a;->a(ZZZ)LO7/D;

    move-result-object v17

    invoke-interface/range {p1 .. p1}, Le8/s;->h()LO7/n0;

    move-result-object v5

    invoke-static {v5}, LX7/J;->d(LO7/n0;)LO7/u;

    move-result-object v18

    invoke-virtual {v3}, Lb8/j$a;->c()LF8/E;

    move-result-object v5

    if-eqz v5, :cond_3

    sget-object v5, LZ7/e;->i0:LO7/a$a;

    invoke-virtual {v2}, Lb8/j$b;->a()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lj7/v;->i0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    invoke-static {v5}, Lj7/S;->e(Li7/u;)Ljava/util/Map;

    move-result-object v5

    :goto_4
    move-object/from16 v19, v5

    goto :goto_5

    :cond_3
    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v5

    goto :goto_4

    :goto_5
    move-object v10, v15

    move-object v5, v15

    move-object v15, v4

    invoke-virtual/range {v10 .. v19}, LZ7/e;->x1(LO7/X;LO7/X;Ljava/util/List;Ljava/util/List;Ljava/util/List;LF8/E;LO7/D;LO7/u;Ljava/util/Map;)LR7/G;

    invoke-virtual {v3}, Lb8/j$a;->b()Z

    move-result v4

    invoke-virtual {v2}, Lb8/j$b;->b()Z

    move-result v2

    invoke-virtual {v5, v4, v2}, LZ7/e;->B1(ZZ)V

    invoke-virtual {v3}, Lb8/j$a;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v9

    if-eqz v2, :cond_4

    invoke-virtual {v1}, La8/g;->a()La8/b;

    move-result-object v1

    invoke-virtual {v1}, La8/b;->s()LY7/j;

    move-result-object v1

    invoke-virtual {v3}, Lb8/j$a;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v5, v2}, LY7/j;->a(LO7/b;Ljava/util/List;)V

    :cond_4
    return-object v5
.end method

.method protected final K(La8/g;LO7/y;Ljava/util/List;)Lb8/j$b;
    .locals 20

    .prologue
    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "c"

    invoke-static {v0, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "function"

    move-object/from16 v15, p2

    invoke-static {v15, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "jValueParameters"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lj7/v;->a1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v2

    new-instance v14, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v14, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj7/L;

    invoke-virtual {v4}, Lj7/L;->a()I

    move-result v6

    invoke-virtual {v4}, Lj7/L;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Le8/B;

    invoke-static {v0, v4}, La8/e;->a(La8/g;Le8/d;)LP7/g;

    move-result-object v7

    sget-object v8, LF8/p0;->D:LF8/p0;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v5

    invoke-interface {v4}, Le8/B;->m()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v8, :cond_2

    invoke-interface {v4}, Le8/B;->getType()Le8/x;

    move-result-object v8

    instance-of v11, v8, Le8/f;

    if-eqz v11, :cond_0

    move-object v9, v8

    check-cast v9, Le8/f;

    :cond_0
    if-eqz v9, :cond_1

    invoke-virtual/range {p1 .. p1}, La8/g;->g()Lc8/d;

    move-result-object v8

    invoke-virtual {v8, v9, v5, v10}, Lc8/d;->k(Le8/f;Lc8/a;Z)LF8/E;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, La8/g;->d()LO7/G;

    move-result-object v8

    invoke-interface {v8}, LO7/G;->t()LL7/g;

    move-result-object v8

    invoke-virtual {v8, v5}, LL7/g;->k(LF8/E;)LF8/E;

    move-result-object v8

    invoke-static {v5, v8}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Vararg parameter should be an array: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual/range {p1 .. p1}, La8/g;->g()Lc8/d;

    move-result-object v8

    invoke-interface {v4}, Le8/B;->getType()Le8/x;

    move-result-object v11

    invoke-virtual {v8, v11, v5}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object v5

    invoke-static {v5, v9}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    :goto_1
    invoke-virtual {v5}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LF8/E;

    invoke-virtual {v5}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, LF8/E;

    invoke-interface/range {p2 .. p2}, LO7/I;->getName()Ln8/f;

    move-result-object v5

    invoke-virtual {v5}, Ln8/f;->g()Ljava/lang/String;

    move-result-object v5

    const-string v8, "equals"

    invoke-static {v5, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v10, :cond_4

    invoke-virtual/range {p1 .. p1}, La8/g;->d()LO7/G;

    move-result-object v5

    invoke-interface {v5}, LO7/G;->t()LL7/g;

    move-result-object v5

    invoke-virtual {v5}, LL7/g;->I()LF8/M;

    move-result-object v5

    invoke-static {v5, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const-string v5, "other"

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    :cond_3
    :goto_2
    move/from16 v16, v3

    move-object v8, v5

    goto :goto_3

    :cond_4
    invoke-interface {v4}, Le8/B;->getName()Ln8/f;

    move-result-object v5

    if-nez v5, :cond_5

    move v3, v10

    :cond_5
    if-nez v5, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x70

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    const-string v8, "identifier(...)"

    invoke-static {v5, v8}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :goto_3
    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    new-instance v12, LR7/L;

    invoke-virtual/range {p1 .. p1}, La8/g;->a()La8/b;

    move-result-object v3

    invoke-virtual {v3}, La8/b;->t()Ld8/b;

    move-result-object v3

    invoke-interface {v3, v4}, Ld8/b;->a(Le8/l;)Ld8/a;

    move-result-object v17

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v18, 0x0

    move-object v3, v12

    move-object/from16 v4, p2

    move-object/from16 v19, v12

    move/from16 v12, v18

    move-object v0, v14

    move-object/from16 v14, v17

    invoke-direct/range {v3 .. v14}, LR7/L;-><init>(LO7/a;LO7/j0;ILP7/g;Ln8/f;LF8/E;ZZZLF8/E;LO7/a0;)V

    move-object/from16 v3, v19

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v14, v0

    move/from16 v3, v16

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_6
    move-object v0, v14

    invoke-static {v0}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lb8/j$b;

    invoke-direct {v1, v0, v3}, Lb8/j$b;-><init>(Ljava/util/List;Z)V

    return-object v1
.end method

.method public a()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, Lb8/j;->A()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->a()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, Lb8/j;->h:LE8/g;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb8/j;->d()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    iget-object p2, p0, Lb8/j;->l:LE8/g;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method public d()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, Lb8/j;->D()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lb8/j;->d:LE8/i;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public f()Ljava/util/Set;
    .locals 1

    invoke-direct {p0}, Lb8/j;->x()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected abstract l(Ly8/d;Lx7/l;)Ljava/util/Set;
.end method

.method protected final m(Ly8/d;Lx7/l;)Ljava/util/List;
    .locals 5

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LW7/d;->O:LW7/d;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v2, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v2}, Ly8/d$a;->c()I

    move-result v2

    invoke-virtual {p1, v2}, Ly8/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1, p2}, Lb8/j;->l(Ly8/d;Lx7/l;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-interface {p2, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3, v0}, Ly8/i;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v3

    invoke-static {v1, v3}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object v2, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v2}, Ly8/d$a;->d()I

    move-result v2

    invoke-virtual {p1, v2}, Ly8/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ly8/d;->l()Ljava/util/List;

    move-result-object v2

    sget-object v3, Ly8/c$a;->a:Ly8/c$a;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {p0, p1, p2}, Lb8/j;->n(Ly8/d;Lx7/l;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-interface {p2, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v3, v0}, Lb8/j;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_3
    sget-object v2, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v2}, Ly8/d$a;->i()I

    move-result v2

    invoke-virtual {p1, v2}, Ly8/d;->a(I)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Ly8/d;->l()Ljava/util/List;

    move-result-object v2

    sget-object v3, Ly8/c$a;->a:Ly8/c$a;

    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0, p1, p2}, Lb8/j;->t(Ly8/d;Lx7/l;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-interface {p2, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v2, v0}, Lb8/j;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lj7/v;->T0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected abstract n(Ly8/d;Lx7/l;)Ljava/util/Set;
.end method

.method protected o(Ljava/util/Collection;Ln8/f;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "name"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method protected abstract p()Lb8/b;
.end method

.method protected final q(Le8/r;La8/g;)LF8/E;
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Le8/q;->V()Le8/g;

    move-result-object v0

    invoke-interface {v0}, Le8/g;->t()Z

    move-result v2

    sget-object v1, LF8/p0;->D:LF8/p0;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lc8/b;->b(LF8/p0;ZZLO7/f0;ILjava/lang/Object;)Lc8/a;

    move-result-object v0

    invoke-virtual {p2}, La8/g;->g()Lc8/d;

    move-result-object p2

    invoke-interface {p1}, Le8/r;->l()Le8/x;

    move-result-object p1

    invoke-virtual {p2, p1, v0}, Lc8/d;->o(Le8/x;Lc8/a;)LF8/E;

    move-result-object p1

    return-object p1
.end method

.method protected abstract r(Ljava/util/Collection;Ln8/f;)V
.end method

.method protected abstract s(Ln8/f;Ljava/util/Collection;)V
.end method

.method protected abstract t(Ly8/d;Lx7/l;)Ljava/util/Set;
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Lazy scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lb8/j;->C()LO7/m;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final v()LE8/i;
    .locals 1

    iget-object v0, p0, Lb8/j;->d:LE8/i;

    return-object v0
.end method

.method protected final w()La8/g;
    .locals 1

    iget-object v0, p0, Lb8/j;->b:La8/g;

    return-object v0
.end method

.method protected final y()LE8/i;
    .locals 1

    iget-object v0, p0, Lb8/j;->e:LE8/i;

    return-object v0
.end method

.method protected abstract z()LO7/X;
.end method
