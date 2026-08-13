.class public abstract Lz9/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz9/z$a;

.field private static final b:Lz9/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz9/z$a;

    invoke-direct {v0}, Lz9/z$a;-><init>()V

    sput-object v0, Lz9/I;->a:Lz9/z$a;

    new-instance v0, Lz9/z$a;

    invoke-direct {v0}, Lz9/z$a;-><init>()V

    sput-object v0, Lz9/I;->b:Lz9/z$a;

    return-void
.end method

.method public static synthetic a(Lv9/f;Ly9/b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lz9/I;->f(Lv9/f;Ly9/b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lv9/f;Ly9/b;)Ljava/util/Map;
    .locals 10

    .prologue
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1, p0}, Lz9/I;->d(Ly9/b;Lv9/f;)Z

    move-result v1

    invoke-static {p0, p1}, Lz9/I;->n(Lv9/f;Ly9/b;)Ly9/z;

    invoke-interface {p0}, Lv9/f;->e()I

    move-result p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p1, :cond_6

    invoke-interface {p0, v3}, Lv9/f;->g(I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ly9/y;

    if-eqz v7, :cond_0

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v5}, Lj7/v;->I0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly9/y;

    const-string v5, "toLowerCase(...)"

    if-eqz v4, :cond_3

    invoke-interface {v4}, Ly9/y;->names()[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    array-length v6, v4

    move v7, v2

    :goto_2
    if-ge v7, v6, :cond_3

    aget-object v8, v4, v7

    if-eqz v1, :cond_2

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-static {v0, p0, v8, v3}, Lz9/I;->c(Ljava/util/Map;Lv9/f;Ljava/lang/String;I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {p0, v3}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    if-eqz v4, :cond_5

    invoke-static {v0, p0, v4, v3}, Lz9/I;->c(Ljava/util/Map;Lv9/f;Ljava/lang/String;I)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_7

    invoke-static {}, Lj7/S;->h()Ljava/util/Map;

    move-result-object v0

    :cond_7
    return-object v0
.end method

.method private static final c(Ljava/util/Map;Lv9/f;Ljava/lang/String;I)V
    .locals 4

    .prologue
    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object v0

    sget-object v1, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "enum value"

    goto :goto_0

    :cond_0
    const-string v0, "property"

    :goto_0
    invoke-interface {p0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    new-instance v1, Lz9/F;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The suggested name \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p1, p3}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " is already one of the names for "

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0, p2}, Lj7/S;->i(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-interface {p1, p0}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lz9/F;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private static final d(Ly9/b;Lv9/f;)Z
    .locals 0

    .prologue
    invoke-virtual {p0}, Ly9/b;->e()Ly9/g;

    move-result-object p0

    invoke-virtual {p0}, Ly9/g;->h()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lv9/f;->j()Lv9/m;

    move-result-object p0

    sget-object p1, Lv9/m$b;->a:Lv9/m$b;

    invoke-static {p0, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(Ly9/b;Lv9/f;)Ljava/util/Map;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ly9/H;->a(Ly9/b;)Lz9/z;

    move-result-object v0

    sget-object v1, Lz9/I;->a:Lz9/z$a;

    new-instance v2, Lz9/H;

    invoke-direct {v2, p1, p0}, Lz9/H;-><init>(Lv9/f;Ly9/b;)V

    invoke-virtual {v0, p1, v1, v2}, Lz9/z;->b(Lv9/f;Lz9/z$a;Lx7/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    return-object p0
.end method

.method private static final f(Lv9/f;Ly9/b;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lz9/I;->b(Lv9/f;Ly9/b;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Lz9/z$a;
    .locals 1

    sget-object v0, Lz9/I;->a:Lz9/z$a;

    return-object v0
.end method

.method public static final h(Lv9/f;Ly9/b;I)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lz9/I;->n(Lv9/f;Ly9/b;)Ly9/z;

    invoke-interface {p0, p2}, Lv9/f;->f(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lv9/f;Ly9/b;Ljava/lang/String;)I
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p0}, Lz9/I;->d(Ly9/b;Lv9/f;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "toLowerCase(...)"

    invoke-static {p2, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lz9/I;->l(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_0
    invoke-static {p0, p1}, Lz9/I;->n(Lv9/f;Ly9/b;)Ly9/z;

    invoke-interface {p0, p2}, Lv9/f;->d(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x3

    if-eq v0, v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object v1

    invoke-virtual {v1}, Ly9/g;->o()Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-static {p0, p1, p2}, Lz9/I;->l(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final j(Lv9/f;Ly9/b;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffix"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lz9/I;->i(Lv9/f;Ly9/b;Ljava/lang/String;)I

    move-result p1

    const/4 v0, -0x3

    if-eq p1, v0, :cond_0

    return p1

    :cond_0
    new-instance p1, Lt9/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p0}, Lv9/f;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " does not contain element with name \'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lt9/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic k(Lv9/f;Ly9/b;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)I
    .locals 0

    .prologue
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const-string p3, ""

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lz9/I;->j(Lv9/f;Ly9/b;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private static final l(Lv9/f;Ly9/b;Ljava/lang/String;)I
    .locals 0

    .prologue
    invoke-static {p1, p0}, Lz9/I;->e(Ly9/b;Lv9/f;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, -0x3

    :goto_0
    return p0
.end method

.method public static final m(Lv9/f;Ly9/b;)Z
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p1

    invoke-virtual {p1}, Ly9/g;->k()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-interface {p0}, Lv9/f;->k()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of p1, p0, Ljava/util/Collection;

    if-eqz p1, :cond_0

    move-object p1, p0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/annotation/Annotation;

    instance-of p1, p1, Ly9/t;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p0, 0x1

    :goto_2
    return p0
.end method

.method public static final n(Lv9/f;Ly9/b;)Ly9/z;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lv9/f;->j()Lv9/m;

    move-result-object p0

    sget-object v0, Lv9/n$a;->a:Lv9/n$a;

    invoke-static {p0, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Ly9/b;->e()Ly9/g;

    move-result-object p0

    invoke-virtual {p0}, Ly9/g;->l()Ly9/z;

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
