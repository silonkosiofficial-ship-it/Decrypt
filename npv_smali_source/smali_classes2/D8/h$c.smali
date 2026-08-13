.class final LD8/h$c;
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
    name = "c"
.end annotation


# static fields
.field static final synthetic j:[LF7/k;


# instance fields
.field private final a:Ljava/util/Map;

.field private final b:Ljava/util/Map;

.field private final c:Ljava/util/Map;

.field private final d:LE8/g;

.field private final e:LE8/g;

.field private final f:LE8/h;

.field private final g:LE8/i;

.field private final h:LE8/i;

.field final synthetic i:LD8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, LD8/h$c;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "functionNames"

    const-string v4, "getFunctionNames()Ljava/util/Set;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "variableNames"

    const-string v4, "getVariableNames()Ljava/util/Set;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, LD8/h$c;->j:[LF7/k;

    return-void
.end method

.method public constructor <init>(LD8/h;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 4

    .prologue
    const-string v0, "functionList"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "propertyList"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeAliasList"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p2, Ljava/util/Collection;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lp8/p;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object v3

    invoke-virtual {v3}, LB8/m;->g()Lk8/c;

    move-result-object v3

    check-cast v2, Li8/i;

    invoke-virtual {v2}, Li8/i;->d0()I

    move-result v2

    invoke-static {v3, v2}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v0}, LD8/h$c;->p(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->a:Ljava/util/Map;

    check-cast p3, Ljava/util/Collection;

    check-cast p3, Ljava/lang/Iterable;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lp8/p;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object v2

    invoke-virtual {v2}, LB8/m;->g()Lk8/c;

    move-result-object v2

    check-cast v1, Li8/n;

    invoke-virtual {v1}, Li8/n;->c0()I

    move-result v1

    invoke-static {v2, v1}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-direct {p0, p2}, LD8/h$c;->p(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->b:Ljava/util/Map;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->c()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->g()LB8/l;

    move-result-object p1

    invoke-interface {p1}, LB8/l;->g()Z

    move-result p1

    if-eqz p1, :cond_6

    check-cast p4, Ljava/util/Collection;

    check-cast p4, Ljava/lang/Iterable;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    move-object v0, p4

    check-cast v0, Lp8/p;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object v1

    invoke-virtual {v1}, LB8/m;->g()Lk8/c;

    move-result-object v1

    check-cast v0, Li8/r;

    invoke-virtual {v0}, Li8/r;->W()I

    move-result v0

    invoke-static {v1, v0}, LB8/y;->b(Lk8/c;I)Ln8/f;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    check-cast v1, Ljava/util/List;

    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-direct {p0, p2}, LD8/h$c;->p(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    goto :goto_3

    :cond_6
    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object p1

    :goto_3
    iput-object p1, p0, LD8/h$c;->c:Ljava/util/Map;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$c$c;

    invoke-direct {p2, p0}, LD8/h$c$c;-><init>(LD8/h$c;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->d:LE8/g;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$c$d;

    invoke-direct {p2, p0}, LD8/h$c$d;-><init>(LD8/h$c;)V

    invoke-interface {p1, p2}, LE8/n;->b(Lx7/l;)LE8/g;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->e:LE8/g;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$c$e;

    invoke-direct {p2, p0}, LD8/h$c$e;-><init>(LD8/h$c;)V

    invoke-interface {p1, p2}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->f:LE8/h;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$c$b;

    iget-object p3, p0, LD8/h$c;->i:LD8/h;

    invoke-direct {p2, p0, p3}, LD8/h$c$b;-><init>(LD8/h$c;LD8/h;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->g:LE8/i;

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->h()LE8/n;

    move-result-object p1

    new-instance p2, LD8/h$c$f;

    iget-object p3, p0, LD8/h$c;->i:LD8/h;

    invoke-direct {p2, p0, p3}, LD8/h$c$f;-><init>(LD8/h$c;LD8/h;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, LD8/h$c;->h:LE8/i;

    return-void
.end method

.method public static final synthetic h(LD8/h$c;Ln8/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, LD8/h$c;->m(Ln8/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(LD8/h$c;Ln8/f;)Ljava/util/Collection;
    .locals 0

    invoke-direct {p0, p1}, LD8/h$c;->n(Ln8/f;)Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(LD8/h$c;Ln8/f;)LO7/e0;
    .locals 0

    invoke-direct {p0, p1}, LD8/h$c;->o(Ln8/f;)LO7/e0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(LD8/h$c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LD8/h$c;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static final synthetic l(LD8/h$c;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, LD8/h$c;->b:Ljava/util/Map;

    return-object p0
.end method

.method private final m(Ln8/f;)Ljava/util/Collection;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$c;->a:Ljava/util/Map;

    sget-object v1, Li8/i;->Y:Lp8/r;

    const-string v2, "PARSER"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LD8/h$c;->i:LD8/h;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_0

    iget-object v3, p0, LD8/h$c;->i:LD8/h;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, LD8/h$c$a;

    invoke-direct {v0, v1, v4, v3}, LD8/h$c$a;-><init>(Lp8/r;Ljava/io/ByteArrayInputStream;LD8/h;)V

    invoke-static {v0}, LR8/k;->o(Lx7/a;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    check-cast v0, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :goto_1
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/i;

    invoke-virtual {v2}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, LB8/x;->j(Li8/i;)LO7/Z;

    move-result-object v1

    invoke-virtual {v2, v1}, LD8/h;->x(LO7/Z;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v2, p1, v3}, LD8/h;->k(Ln8/f;Ljava/util/List;)V

    invoke-static {v3}, LP8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method private final n(Ln8/f;)Ljava/util/Collection;
    .locals 5

    .prologue
    iget-object v0, p0, LD8/h$c;->b:Ljava/util/Map;

    sget-object v1, Li8/n;->Y:Lp8/r;

    const-string v2, "PARSER"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LD8/h$c;->i:LD8/h;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_0

    iget-object v3, p0, LD8/h$c;->i:LD8/h;

    new-instance v4, Ljava/io/ByteArrayInputStream;

    invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v0, LD8/h$c$a;

    invoke-direct {v0, v1, v4, v3}, LD8/h$c$a;-><init>(Lp8/r;Ljava/io/ByteArrayInputStream;LD8/h;)V

    invoke-static {v0}, LR8/k;->o(Lx7/a;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->M(LR8/h;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    check-cast v0, Ljava/util/Collection;

    goto :goto_1

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :goto_1
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li8/n;

    invoke-virtual {v2}, LD8/h;->p()LB8/m;

    move-result-object v4

    invoke-virtual {v4}, LB8/m;->f()LB8/x;

    move-result-object v4

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, LB8/x;->l(Li8/n;)LO7/U;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {v2, p1, v3}, LD8/h;->l(Ln8/f;Ljava/util/List;)V

    invoke-static {v3}, LP8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method private final o(Ln8/f;)LO7/e0;
    .locals 2

    .prologue
    iget-object v0, p0, LD8/h$c;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    iget-object p1, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {p1}, LD8/h;->p()LB8/m;

    move-result-object p1

    invoke-virtual {p1}, LB8/m;->c()LB8/k;

    move-result-object p1

    invoke-virtual {p1}, LB8/k;->k()Lp8/g;

    move-result-object p1

    invoke-static {v1, p1}, Li8/r;->o0(Ljava/io/InputStream;Lp8/g;)Li8/r;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, LD8/h$c;->i:LD8/h;

    invoke-virtual {v0}, LD8/h;->p()LB8/m;

    move-result-object v0

    invoke-virtual {v0}, LB8/m;->f()LB8/x;

    move-result-object v0

    invoke-virtual {v0, p1}, LB8/x;->m(Li8/r;)LO7/e0;

    move-result-object p1

    return-object p1
.end method

.method private final p(Ljava/util/Map;)Ljava/util/Map;
    .locals 6

    .prologue
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lj7/S;->d(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp8/a;

    invoke-virtual {v5, v3}, Lp8/a;->g(Ljava/io/OutputStream;)V

    sget-object v5, Li7/M;->a:Li7/M;

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h$c;->g:LE8/i;

    sget-object v1, LD8/h$c;->j:[LF7/k;

    const/4 v2, 0x0

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

    invoke-virtual {p0}, LD8/h$c;->a()Ljava/util/Set;

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
    iget-object p2, p0, LD8/h$c;->d:LE8/g;

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

    invoke-virtual {p0}, LD8/h$c;->d()Ljava/util/Set;

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
    iget-object p2, p0, LD8/h$c;->e:LE8/g;

    invoke-interface {p2, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0
.end method

.method public d()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, LD8/h$c;->h:LE8/i;

    sget-object v1, LD8/h$c;->j:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public e(Ljava/util/Collection;Ly8/d;Lx7/l;LW7/b;)V
    .locals 5

    .prologue
    const-string v0, "result"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kindFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->i()I

    move-result v0

    invoke-virtual {p2, v0}, Ly8/d;->a(I)Z

    move-result v0

    const-string v1, "INSTANCE"

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LD8/h$c;->d()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln8/f;

    invoke-interface {p3, v3}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0, v3, p4}, LD8/h$c;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Lr8/i;->C:Lr8/i;

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v0}, Lj7/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_2
    sget-object v0, Ly8/d;->c:Ly8/d$a;

    invoke-virtual {v0}, Ly8/d$a;->d()I

    move-result v0

    invoke-virtual {p2, v0}, Ly8/d;->a(I)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p0}, LD8/h$c;->a()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln8/f;

    invoke-interface {p3, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2, p4}, LD8/h$c;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_4
    sget-object p2, Lr8/i;->C:Lr8/i;

    invoke-static {p2, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p2}, Lj7/v;->B(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {p1, v0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    :cond_5
    return-void
.end method

.method public f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LD8/h$c;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(Ln8/f;)LO7/e0;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LD8/h$c;->f:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/e0;

    return-object p1
.end method
