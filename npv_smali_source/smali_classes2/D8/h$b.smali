.class final LD8/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# static fields
.field static final synthetic o:[LF7/k;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Ljava/util/List;

.field private final c:Ljava/util/List;

.field private final d:LE8/i;

.field private final e:LE8/i;

.field private final f:LE8/i;

.field private final g:LE8/i;

.field private final h:LE8/i;

.field private final i:LE8/i;

.field private final j:LE8/i;

.field private final k:LE8/i;

.field private final l:LE8/i;

.field private final m:LE8/i;

.field final synthetic n:LD8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Ly7/G;

    const-class v1, LD8/h$b;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "declaredFunctions"

    const-string v4, "getDeclaredFunctions()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v3

    const-string v4, "declaredProperties"

    const-string v5, "getDeclaredProperties()Ljava/util/List;"

    invoke-direct {v2, v3, v4, v5}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v2

    new-instance v3, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v4

    const-string v5, "allTypeAliases"

    const-string v6, "getAllTypeAliases()Ljava/util/List;"

    invoke-direct {v3, v4, v5, v6}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v3

    new-instance v4, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v5

    const-string v6, "allFunctions"

    const-string v7, "getAllFunctions()Ljava/util/List;"

    invoke-direct {v4, v5, v6, v7}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v4

    new-instance v5, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v6

    const-string v7, "allProperties"

    const-string v8, "getAllProperties()Ljava/util/List;"

    invoke-direct {v5, v6, v7, v8}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v5}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v5

    new-instance v6, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v7

    const-string v8, "typeAliasesByName"

    const-string v9, "getTypeAliasesByName()Ljava/util/Map;"

    invoke-direct {v6, v7, v8, v9}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v6

    new-instance v7, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v8

    const-string v9, "functionsByName"

    const-string v10, "getFunctionsByName()Ljava/util/Map;"

    invoke-direct {v7, v8, v9, v10}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v7}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v7

    new-instance v8, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v9

    const-string v10, "propertiesByName"

    const-string v11, "getPropertiesByName()Ljava/util/Map;"

    invoke-direct {v8, v9, v10, v11}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v8}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v8

    new-instance v9, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v10

    const-string v11, "functionNames"

    const-string v12, "getFunctionNames()Ljava/util/Set;"

    invoke-direct {v9, v10, v11, v12}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v9

    new-instance v10, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v11, "variableNames"

    const-string v12, "getVariableNames()Ljava/util/Set;"

    invoke-direct {v10, v1, v11, v12}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v10}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/16 v10, 0xa

    new-array v10, v10, [LF7/k;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const/4 v0, 0x1

    aput-object v2, v10, v0

    const/4 v0, 0x2

    aput-object v3, v10, v0

    const/4 v0, 0x3

    aput-object v4, v10, v0

    const/4 v0, 0x4

    aput-object v5, v10, v0

    const/4 v0, 0x5

    aput-object v6, v10, v0

    const/4 v0, 0x6

    aput-object v7, v10, v0

    const/4 v0, 0x7

    aput-object v8, v10, v0

    const/16 v0, 0x8

    aput-object v9, v10, v0

    const/16 v0, 0x9

    aput-object v1, v10, v0

    sput-object v10, LD8/h$b;->o:[LF7/k;

    return-void
.end method

.method public constructor <init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 1

    .prologue
    const-string v0, "functionList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/h$b;->n:LD8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LD8/h$b;->a:Ljava/util/List;

    iput-object p3, p0, LD8/h$b;->b:Ljava/util/List;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->c()LB8/k;

    move-result-object p2

    invoke-virtual {p2}, LB8/k;->g()LB8/l;

    move-result-object p2

    invoke-interface {p2}, LB8/l;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p4

    :goto_0
    iput-object p4, p0, LD8/h$b;->c:Ljava/util/List;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$d;

    invoke-direct {p3, p0}, LD8/h$b$d;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->d:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$e;

    invoke-direct {p3, p0}, LD8/h$b$e;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->e:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$c;

    invoke-direct {p3, p0}, LD8/h$b$c;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->f:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$a;

    invoke-direct {p3, p0}, LD8/h$b$a;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->g:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$b;

    invoke-direct {p3, p0}, LD8/h$b$b;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->h:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$i;

    invoke-direct {p3, p0}, LD8/h$b$i;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->i:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$g;

    invoke-direct {p3, p0}, LD8/h$b$g;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->j:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$h;

    invoke-direct {p3, p0}, LD8/h$b$h;-><init>(LD8/h$b;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->k:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$f;

    invoke-direct {p3, p0, p1}, LD8/h$b$f;-><init>(LD8/h$b;LD8/h;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, LD8/h$b;->l:LE8/i;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p2

    invoke-virtual {p2}, LB8/m;->h()LE8/n;

    move-result-object p2

    new-instance p3, LD8/h$b$j;

    invoke-direct {p3, p0, p1}, LD8/h$b$j;-><init>(LD8/h$b;LD8/h;)V

    invoke-interface {p2, p3}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/h$b;->m:LE8/i;

    return-void
.end method

.method private final A()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/h$b;->g:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final B()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/h$b;->h:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final C()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/h$b;->f:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final D()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/h$b;->d:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final E()Ljava/util/List;
    .locals 3

    iget-object v0, p0, LD8/h$b;->e:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final F()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LD8/h$b;->j:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final G()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LD8/h$b;->k:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final H()Ljava/util/Map;
    .locals 3

    iget-object v0, p0, LD8/h$b;->i:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public static final synthetic h(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->t()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->u()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->v()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->y()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->z()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->A()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->B()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->C()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->D()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(LD8/h$b;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LD8/h$b;->E()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(LD8/h$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LD8/h$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic s(LD8/h$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, LD8/h$b;->b:Ljava/util/List;

    return-object p0
.end method

.method private final t()Ljava/util/List;
    .locals 3

    .prologue
    iget-object v0, p0, LD8/h$b;->n:LD8/h;

    invoke-virtual {v0}, LD8/h;->t()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-direct {p0, v2}, LD8/h$b;->w(Ln8/f;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final u()Ljava/util/List;
    .locals 3

    .prologue
    iget-object v0, p0, LD8/h$b;->n:LD8/h;

    invoke-virtual {v0}, LD8/h;->u()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-direct {p0, v2}, LD8/h$b;->x(Ln8/f;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final v()Ljava/util/List;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$b;->a:Ljava/util/List;

    iget-object v1, p0, LD8/h$b;->n:LD8/h;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {v1}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    check-cast v3, Li8/i;

    invoke-virtual {v4, v3}, LB8/x;->j(Li8/i;)LO7/Z;

    move-result-object v3

    invoke-virtual {v1, v3}, LD8/h;->x(LO7/Z;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final w(Ln8/f;)Ljava/util/List;
    .locals 5

    .prologue
    invoke-direct {p0}, LD8/h$b;->D()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LD8/h$b;->n:LD8/h;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/m;

    invoke-interface {v4}, LO7/I;->getName()Ln8/f;

    move-result-object v4

    invoke-static {v4, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, p1, v2}, LD8/h;->k(Ln8/f;Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v2, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final x(Ln8/f;)Ljava/util/List;
    .locals 5

    .prologue
    invoke-direct {p0}, LD8/h$b;->E()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LD8/h$b;->n:LD8/h;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LO7/m;

    invoke-interface {v4}, LO7/I;->getName()Ln8/f;

    move-result-object v4

    invoke-static {v4, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, p1, v2}, LD8/h;->l(Ln8/f;Ljava/util/List;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    invoke-interface {v2, v0, p1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final y()Ljava/util/List;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$b;->b:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LD8/h$b;->n:LD8/h;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {v1}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    check-cast v3, Li8/n;

    invoke-virtual {v4, v3}, LB8/x;->l(Li8/n;)LO7/U;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method

.method private final z()Ljava/util/List;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$b;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LD8/h$b;->n:LD8/h;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {v1}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    check-cast v3, Li8/r;

    invoke-virtual {v4, v3}, LB8/x;->m(Li8/r;)LO7/e0;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v2
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h$b;->l:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LD8/h$b;->a()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    invoke-direct {p0}, LD8/h$b;->F()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :cond_1
    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 1

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LD8/h$b;->d()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    invoke-direct {p0}, LD8/h$b;->G()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    if-nez p1, :cond_1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    :cond_1
    return-object p1
.end method

.method public d()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h$b;->m:LE8/i;

    sget-object v1, LD8/h$b;->o:[LF7/k;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public e(Ljava/util/Collection;Ly8/d;Lx7/l;LW7/b;)V
    .locals 3

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kindFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {p4}, Ly8/d$a;->i()I

    move-result p4

    invoke-virtual {p2, p4}, Ly8/d;->a(I)Z

    move-result p4

    const-string v0, "getName(...)"

    if-eqz p4, :cond_1

    invoke-direct {p0}, LD8/h$b;->B()Ljava/util/List;

    move-result-object p4

    check-cast p4, Ljava/lang/Iterable;

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/U;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p4, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {p4}, Ly8/d$a;->d()I

    move-result p4

    invoke-virtual {p2, p4}, Ly8/d;->a(I)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0}, LD8/h$b;->A()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v1, p4

    check-cast v1, LO7/Z;

    invoke-interface {v1}, LO7/I;->getName()Ln8/f;

    move-result-object v1

    invoke-static {v1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-void
.end method

.method public f()Ljava/util/Set;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$b;->c:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v2, p0, LD8/h$b;->n:LD8/h;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp8/p;

    invoke-virtual {v2}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->g()Lk8/c;

    move-result-object v4

    check-cast v3, Li8/r;

    invoke-virtual {v3}, Li8/r;->W()I

    move-result v3

    invoke-static {v4, v3}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public g(Ln8/f;)LO7/e0;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LD8/h$b;->H()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e0;

    return-object p1
.end method
