.class public final LL7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LL7/n;

.field private static final b:Ljava/util/Set;

.field private static final c:Ljava/util/Set;

.field private static final d:Ljava/util/HashMap;

.field private static final e:Ljava/util/HashMap;

.field private static final f:Ljava/util/HashMap;

.field private static final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v0, 0x1

    new-instance v1, LL7/n;

    invoke-direct {v1}, LL7/n;-><init>()V

    sput-object v1, LL7/n;->a:LL7/n;

    invoke-static {}, LL7/m;->values()[LL7/m;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_0

    aget-object v6, v1, v5

    invoke-virtual {v6}, LL7/m;->m()Ln8/f;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v0

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LL7/n;->b:Ljava/util/Set;

    invoke-static {}, LL7/l;->values()[LL7/l;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    array-length v3, v1

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_1

    aget-object v6, v1, v5

    invoke-virtual {v6}, LL7/l;->g()Ln8/f;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v0

    goto :goto_1

    :cond_1
    invoke-static {v2}, Lj7/v;->Y0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, LL7/n;->c:Ljava/util/Set;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LL7/n;->d:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, LL7/n;->e:Ljava/util/HashMap;

    sget-object v1, LL7/l;->E:LL7/l;

    const-string v2, "ubyteArrayOf"

    invoke-static {v2}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v2

    invoke-static {v1, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v1

    sget-object v2, LL7/l;->F:LL7/l;

    const-string v3, "ushortArrayOf"

    invoke-static {v3}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v3

    invoke-static {v2, v3}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v2

    sget-object v3, LL7/l;->G:LL7/l;

    const-string v5, "uintArrayOf"

    invoke-static {v5}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v5

    invoke-static {v3, v5}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v3

    sget-object v5, LL7/l;->H:LL7/l;

    const-string v6, "ulongArrayOf"

    invoke-static {v6}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v6

    invoke-static {v5, v6}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v5

    const/4 v6, 0x4

    new-array v6, v6, [Li7/u;

    aput-object v1, v6, v4

    aput-object v2, v6, v0

    const/4 v1, 0x2

    aput-object v3, v6, v1

    const/4 v1, 0x3

    aput-object v5, v6, v1

    invoke-static {v6}, Lj7/S;->j([Li7/u;)Ljava/util/HashMap;

    move-result-object v1

    sput-object v1, LL7/n;->f:Ljava/util/HashMap;

    invoke-static {}, LL7/m;->values()[LL7/m;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v3, v1

    move v5, v4

    :goto_2
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    invoke-virtual {v6}, LL7/m;->g()Ln8/b;

    move-result-object v6

    invoke-virtual {v6}, Ln8/b;->j()Ln8/f;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, v0

    goto :goto_2

    :cond_2
    sput-object v2, LL7/n;->g:Ljava/util/Set;

    invoke-static {}, LL7/m;->values()[LL7/m;

    move-result-object v1

    array-length v2, v1

    :goto_3
    if-ge v4, v2, :cond_3

    aget-object v3, v1, v4

    sget-object v5, LL7/n;->d:Ljava/util/HashMap;

    invoke-virtual {v3}, LL7/m;->g()Ln8/b;

    move-result-object v6

    invoke-virtual {v3}, LL7/m;->i()Ln8/b;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, LL7/n;->e:Ljava/util/HashMap;

    invoke-virtual {v3}, LL7/m;->i()Ln8/b;

    move-result-object v6

    invoke-virtual {v3}, LL7/m;->g()Ln8/b;

    move-result-object v3

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr v4, v0

    goto :goto_3

    :cond_3
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final d(LF8/E;)Z
    .locals 2

    .prologue
    const-string v0, "type"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LF8/q0;->w(LF8/E;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    invoke-interface {p0}, LF8/e0;->w()LO7/h;

    move-result-object p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    sget-object v0, LL7/n;->a:LL7/n;

    invoke-virtual {v0, p0}, LL7/n;->c(LO7/m;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ln8/b;)Ln8/b;
    .locals 1

    const-string v0, "arrayClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/n;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln8/b;

    return-object p1
.end method

.method public final b(Ln8/f;)Z
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LL7/n;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c(LO7/m;)Z
    .locals 2

    .prologue
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LO7/m;->b()LO7/m;

    move-result-object v0

    instance-of v1, v0, LO7/K;

    if-eqz v1, :cond_0

    check-cast v0, LO7/K;

    invoke-interface {v0}, LO7/K;->e()Ln8/c;

    move-result-object v0

    sget-object v1, LL7/j;->y:Ln8/c;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LL7/n;->b:Ljava/util/Set;

    invoke-interface {p1}, LO7/I;->getName()Ln8/f;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
