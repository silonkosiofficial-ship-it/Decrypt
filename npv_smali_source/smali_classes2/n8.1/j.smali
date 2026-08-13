.class public abstract Ln8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ln8/c;

.field private static final b:Ln8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln8/c;

    const-string v1, "java.lang"

    invoke-direct {v0, v1}, Ln8/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Ln8/j;->a:Ln8/c;

    const-string v1, "annotation"

    invoke-static {v1}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln8/c;->c(Ln8/f;)Ln8/c;

    move-result-object v0

    const-string v1, "child(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Ln8/j;->b:Ln8/c;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->k(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->l(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->m(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->n(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->o(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Ln8/j;->p(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ln8/f;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->q(Ln8/f;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->r(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Ljava/lang/String;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->s(Ljava/lang/String;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ln8/b;)Ln8/b;
    .locals 0

    invoke-static {p0}, Ln8/j;->t(Ln8/b;)Ln8/b;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->b()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final l(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->f()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final m(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->c()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final n(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->d()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final o(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->e()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final p(Ljava/util/Map;)Ljava/util/Map;
    .locals 3

    .prologue
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lj7/v;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lj7/S;->d(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, LE7/j;->d(II)I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object v0

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Li7/u;->d()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static final q(Ln8/f;)Ln8/b;
    .locals 4

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->a()Ln8/b;

    move-result-object v2

    invoke-virtual {v2}, Ln8/b;->h()Ln8/c;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ln8/f;->m()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ln8/i;->a()Ln8/b;

    move-result-object p0

    invoke-virtual {p0}, Ln8/b;->j()Ln8/f;

    move-result-object p0

    invoke-virtual {p0}, Ln8/f;->m()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final r(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->g()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final s(Ljava/lang/String;)Ln8/b;
    .locals 2

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->h()Ln8/c;

    move-result-object v1

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method

.method private static final t(Ln8/b;)Ln8/b;
    .locals 4

    new-instance v0, Ln8/b;

    sget-object v1, Ln8/i;->a:Ln8/i;

    invoke-virtual {v1}, Ln8/i;->f()Ln8/c;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v3, 0x55

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln8/b;->j()Ln8/f;

    move-result-object p0

    invoke-virtual {p0}, Ln8/f;->m()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ln8/f;->o(Ljava/lang/String;)Ln8/f;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ln8/b;-><init>(Ln8/c;Ln8/f;)V

    return-object v0
.end method
