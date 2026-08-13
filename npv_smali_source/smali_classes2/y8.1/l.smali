.class public final Ly8/l;
.super Ly8/i;
.source "SourceFile"


# static fields
.field static final synthetic f:[LF7/k;


# instance fields
.field private final b:LO7/e;

.field private final c:Z

.field private final d:LE8/i;

.field private final e:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly7/G;

    const-class v1, Ly8/l;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v2

    const-string v3, "functions"

    const-string v4, "getFunctions()Ljava/util/List;"

    invoke-direct {v0, v2, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    new-instance v2, Ly7/G;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v3, "properties"

    const-string v4, "getProperties()Ljava/util/List;"

    invoke-direct {v2, v1, v3, v4}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [LF7/k;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Ly8/l;->f:[LF7/k;

    return-void
.end method

.method public constructor <init>(LE8/n;LO7/e;Z)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingClass"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/i;-><init>()V

    iput-object p2, p0, Ly8/l;->b:LO7/e;

    iput-boolean p3, p0, Ly8/l;->c:Z

    invoke-interface {p2}, LO7/e;->j()LO7/f;

    sget-object p2, LO7/f;->D:LO7/f;

    new-instance p2, Ly8/l$a;

    invoke-direct {p2, p0}, Ly8/l$a;-><init>(Ly8/l;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p2

    iput-object p2, p0, Ly8/l;->d:LE8/i;

    new-instance p2, Ly8/l$b;

    invoke-direct {p2, p0}, Ly8/l$b;-><init>(Ly8/l;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Ly8/l;->e:LE8/i;

    return-void
.end method

.method public static final synthetic h(Ly8/l;)LO7/e;
    .locals 0

    iget-object p0, p0, Ly8/l;->b:LO7/e;

    return-object p0
.end method

.method public static final synthetic i(Ly8/l;)Z
    .locals 0

    iget-boolean p0, p0, Ly8/l;->c:Z

    return p0
.end method

.method private final m()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ly8/l;->d:LE8/i;

    sget-object v1, Ly8/l;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final n()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Ly8/l;->e:LE8/i;

    sget-object v1, Ly8/l;->f:[LF7/k;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly8/l;->l(Ln8/f;LW7/b;)LP8/f;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 3

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/l;->n()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, LP8/f;

    invoke-direct {v0}, LP8/f;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/U;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly8/l;->k(Ly8/d;Lx7/l;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public bridge synthetic g(Ln8/f;LW7/b;)LO7/h;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ly8/l;->j(Ln8/f;LW7/b;)Ljava/lang/Void;

    move-result-object p1

    check-cast p1, LO7/h;

    return-object p1
.end method

.method public j(Ln8/f;LW7/b;)Ljava/lang/Void;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public k(Ly8/d;Lx7/l;)Ljava/util/List;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/l;->m()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0}, Ly8/l;->n()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public l(Ln8/f;LW7/b;)LP8/f;
    .locals 3

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ly8/l;->m()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, LP8/f;

    invoke-direct {v0}, LP8/f;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LO7/Z;

    invoke-interface {v2}, LO7/I;->getName()Ln8/f;

    move-result-object v2

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
