.class public final Lb8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h;


# static fields
.field static final synthetic f:[LF7/k;


# instance fields
.field private final b:La8/g;

.field private final c:Lb8/h;

.field private final d:Lb8/i;

.field private final e:LE8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ly7/G;

    const-class v1, Lb8/d;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "kotlinScopes"

    const-string v3, "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    invoke-direct {v0, v1, v2, v3}, Ly7/G;-><init>(LF7/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ly7/P;->j(Ly7/F;)LF7/m;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LF7/k;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lb8/d;->f:[LF7/k;

    return-void
.end method

.method public constructor <init>(La8/g;Le8/u;Lb8/h;)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jPackage"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragment"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/d;->b:La8/g;

    iput-object p3, p0, Lb8/d;->c:Lb8/h;

    new-instance v0, Lb8/i;

    invoke-direct {v0, p1, p2, p3}, Lb8/i;-><init>(La8/g;Le8/u;Lb8/h;)V

    iput-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-virtual {p1}, La8/g;->e()LE8/n;

    move-result-object p1

    new-instance p2, Lb8/d$a;

    invoke-direct {p2, p0}, Lb8/d$a;-><init>(Lb8/d;)V

    invoke-interface {p1, p2}, LE8/n;->d(Lx7/a;)LE8/i;

    move-result-object p1

    iput-object p1, p0, Lb8/d;->e:LE8/i;

    return-void
.end method

.method public static final synthetic h(Lb8/d;)La8/g;
    .locals 0

    iget-object p0, p0, Lb8/d;->b:La8/g;

    return-object p0
.end method

.method public static final synthetic i(Lb8/d;)Lb8/h;
    .locals 0

    iget-object p0, p0, Lb8/d;->c:Lb8/h;

    return-object p0
.end method

.method private final k()[Ly8/h;
    .locals 3

    iget-object v0, p0, Lb8/d;->e:LE8/i;

    sget-object v1, Lb8/d;->f:[LF7/k;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v0, p0, v1}, LE8/m;->a(LE8/i;Ljava/lang/Object;LF7/k;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly8/h;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 5

    .prologue
    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Ly8/h;->a()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-virtual {v0}, Lb8/j;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/d;->l(Ln8/f;LW7/b;)V

    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/d;->l(Ln8/f;LW7/b;)V

    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public d()Ljava/util/Set;
    .locals 5

    .prologue
    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    invoke-interface {v4}, Ly8/h;->d()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-virtual {v0}, Lb8/j;->d()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object v1
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v1

    invoke-interface {v0, p1, p2}, Ly8/k;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object v0

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4, p1, p2}, Ly8/k;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v0, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    :cond_1
    return-object v0
.end method

.method public f()Ljava/util/Set;
    .locals 2

    .prologue
    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v0

    invoke-static {v0}, Lj7/n;->N([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Ly8/j;->a(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lb8/d;->d:Lb8/i;

    invoke-virtual {v1}, Lb8/j;->f()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 6

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lb8/d;->l(Ln8/f;LW7/b;)V

    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    invoke-virtual {v0, p1, p2}, Lb8/i;->Q(Ln8/f;LW7/b;)LO7/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lb8/d;->k()[Ly8/h;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v4

    if-eqz v4, :cond_2

    instance-of v5, v4, LO7/i;

    if-eqz v5, :cond_1

    move-object v5, v4

    check-cast v5, LO7/i;

    invoke-interface {v5}, LO7/C;->R()Z

    move-result v5

    if-eqz v5, :cond_1

    if-nez v2, :cond_2

    move-object v2, v4

    goto :goto_1

    :cond_1
    move-object v2, v4

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-object v2
.end method

.method public final j()Lb8/i;
    .locals 1

    iget-object v0, p0, Lb8/d;->d:Lb8/i;

    return-object v0
.end method

.method public l(Ln8/f;LW7/b;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb8/d;->b:La8/g;

    invoke-virtual {v0}, La8/g;->a()La8/b;

    move-result-object v0

    invoke-virtual {v0}, La8/b;->l()LW7/c;

    move-result-object v0

    iget-object v1, p0, Lb8/d;->c:Lb8/h;

    invoke-static {v0, p2, v1, p1}, LV7/a;->b(LW7/c;LW7/b;LO7/K;Ln8/f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "scope for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb8/d;->c:Lb8/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
