.class public final Ly8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/b$a;
    }
.end annotation


# static fields
.field public static final d:Ly8/b$a;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:[Ly8/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly8/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly8/b$a;-><init>(Ly7/k;)V

    sput-object v0, Ly8/b;->d:Ly8/b$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;[Ly8/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/b;->b:Ljava/lang/String;

    iput-object p2, p0, Ly8/b;->c:[Ly8/h;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;[Ly8/h;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly8/b;-><init>(Ljava/lang/String;[Ly8/h;)V

    return-void
.end method

.method public static final synthetic h(Ly8/b;)[Ly8/h;
    .locals 0

    iget-object p0, p0, Ly8/b;->c:[Ly8/h;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 5

    .prologue
    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

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
    return-object v1
.end method

.method public b(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

    array-length v1, v0

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_3

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_1
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    goto :goto_2

    :cond_1
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Ly8/h;->b(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v3

    goto :goto_2

    :cond_2
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v3
.end method

.method public c(Ln8/f;LW7/b;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

    array-length v1, v0

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_3

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_1
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    goto :goto_2

    :cond_1
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Ly8/h;->c(Ln8/f;LW7/b;)Ljava/util/Collection;

    move-result-object v3

    goto :goto_2

    :cond_2
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v3
.end method

.method public d()Ljava/util/Set;
    .locals 5

    .prologue
    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

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
    return-object v1
.end method

.method public e(Ly8/d;Lx7/l;)Ljava/util/Collection;
    .locals 5

    .prologue
    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameFilter"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

    array-length v1, v0

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Ly8/k;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, LO8/a;->a(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_3

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :goto_1
    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    goto :goto_2

    :cond_1
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Ly8/k;->e(Ly8/d;Lx7/l;)Ljava/util/Collection;

    move-result-object v3

    goto :goto_2

    :cond_2
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_3
    :goto_2
    return-object v3
.end method

.method public f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

    invoke-static {v0}, Lj7/n;->N([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Ly8/j;->a(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public g(Ln8/f;LW7/b;)LO7/h;
    .locals 6

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly8/b;->c:[Ly8/h;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Ly8/k;->g(Ln8/f;LW7/b;)LO7/h;

    move-result-object v4

    if-eqz v4, :cond_1

    instance-of v5, v4, LO7/i;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, LO7/i;

    invoke-interface {v5}, LO7/C;->R()Z

    move-result v5

    if-eqz v5, :cond_0

    if-nez v2, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_0
    move-object v2, v4

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly8/b;->b:Ljava/lang/String;

    return-object v0
.end method
