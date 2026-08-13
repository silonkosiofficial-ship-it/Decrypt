.class public abstract LI6/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfa/d;

.field private static final b:LJ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "io.ktor.client.plugins.HttpPlainText"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/v;->a:Lfa/d;

    sget-object v0, LI6/v$a;->L:LI6/v$a;

    new-instance v1, LI6/u;

    invoke-direct {v1}, LI6/u;-><init>()V

    const-string v2, "HttpPlainText"

    invoke-static {v2, v0, v1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/v;->b:LJ6/b;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/v;->b(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LJ6/d;)Li7/M;
    .locals 12

    .prologue
    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/t;

    invoke-virtual {v0}, LI6/t;->a()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lj7/S;->v(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, LI6/v$e;

    invoke-direct {v1}, LI6/v$e;-><init>()V

    invoke-static {v0, v1}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LI6/t;

    invoke-virtual {v1}, LI6/t;->c()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LI6/t;

    invoke-virtual {v2}, LI6/t;->b()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/nio/charset/Charset;

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LI6/t;

    invoke-virtual {v6}, LI6/t;->a()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_0

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v2, LI6/v$d;

    invoke-direct {v2}, LI6/v$d;-><init>()V

    invoke-static {v3, v2}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v6, ","

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/charset/Charset;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-lez v7, :cond_2

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-static {v5}, Lc7/a;->g(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    move-object v4, v0

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li7/u;

    invoke-virtual {v5}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/nio/charset/Charset;

    invoke-virtual {v5}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_4

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    float-to-double v8, v5

    const-wide/16 v10, 0x0

    cmpg-double v10, v10, v8

    if-gtz v10, :cond_5

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    cmpg-double v8, v8, v10

    if-gtz v8, :cond_5

    const/16 v8, 0x64

    int-to-float v8, v8

    mul-float/2addr v8, v5

    invoke-static {v8}, LA7/a;->d(F)I

    move-result v5

    int-to-double v8, v5

    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    div-double/2addr v8, v10

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v7}, Lc7/a;->g(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ";q="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_7

    invoke-static {v1}, Lc7/a;->g(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LI6/t;

    invoke-virtual {v4}, LI6/t;->d()Ljava/nio/charset/Charset;

    move-result-object v4

    const/4 v5, 0x0

    if-nez v4, :cond_9

    invoke-static {v2}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/nio/charset/Charset;

    if-nez v4, :cond_9

    invoke-static {v0}, Lj7/v;->k0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li7/u;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Li7/u;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/charset/Charset;

    move-object v4, v0

    goto :goto_3

    :cond_8
    move-object v4, v5

    :goto_3
    if-nez v4, :cond_9

    sget-object v4, LS8/d;->b:Ljava/nio/charset/Charset;

    :cond_9
    sget-object v0, LI6/M;->a:LI6/M;

    new-instance v2, LI6/v$b;

    invoke-direct {v2, v3, v4, v5}, LI6/v$b;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Lm7/e;)V

    invoke-virtual {p0, v0, v2}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    new-instance v0, LI6/v$c;

    invoke-direct {v0, v1, v5}, LI6/v$c;-><init>(Ljava/nio/charset/Charset;Lm7/e;)V

    invoke-virtual {p0, v0}, LJ6/d;->h(Lx7/s;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method private static final c(Ljava/lang/String;LO6/d;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, LO6/d;->a()LT6/q;

    move-result-object v0

    sget-object v1, LT6/v;->a:LT6/v;

    invoke-virtual {v1}, LT6/v;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LW6/B;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LI6/v;->a:Lfa/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Adding Accept-Charset="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LO6/d;->j()LT6/M;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lfa/d;->g(Ljava/lang/String;)V

    invoke-virtual {p1}, LO6/d;->a()LT6/q;

    move-result-object p1

    invoke-virtual {v1}, LT6/v;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p0}, LW6/B;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final d(Ljava/nio/charset/Charset;LD6/b;Lo9/q;)Ljava/lang/String;
    .locals 3

    .prologue
    invoke-virtual {p1}, LD6/b;->e()LQ6/c;

    move-result-object v0

    invoke-static {v0}, LT6/z;->a(LT6/x;)Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    sget-object v0, LI6/v;->a:Lfa/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Reading response body for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LD6/b;->d()LO6/b;

    move-result-object p1

    invoke-interface {p1}, LO6/b;->r()LT6/g0;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as String with charset "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfa/d;->g(Ljava/lang/String;)V

    const/4 p1, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p0, v1, p1, v0}, Ld7/e;->b(Lo9/q;Ljava/nio/charset/Charset;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljava/nio/charset/Charset;LO6/d;Ljava/lang/String;LT6/h;)LU6/b;
    .locals 7

    .prologue
    if-nez p3, :cond_0

    sget-object v0, LT6/h$d;->a:LT6/h$d;

    invoke-virtual {v0}, LT6/h$d;->b()LT6/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p3

    :goto_0
    if-eqz p3, :cond_2

    invoke-static {p3}, LT6/i;->a(LT6/n;)Ljava/nio/charset/Charset;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, p3

    :cond_2
    :goto_1
    sget-object p3, LI6/v;->a:Lfa/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending request body to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LO6/d;->j()LT6/M;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " as text/plain with charset "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lfa/d;->g(Ljava/lang/String;)V

    new-instance p1, LU6/f;

    invoke-static {v0, p0}, LT6/i;->b(LT6/h;Ljava/nio/charset/Charset;)LT6/h;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v1 .. v6}, LU6/f;-><init>(Ljava/lang/String;LT6/h;LT6/C;ILy7/k;)V

    return-object p1
.end method

.method public static final synthetic f(Ljava/lang/String;LO6/d;)V
    .locals 0

    invoke-static {p0, p1}, LI6/v;->c(Ljava/lang/String;LO6/d;)V

    return-void
.end method

.method public static final synthetic g(Ljava/nio/charset/Charset;LD6/b;Lo9/q;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, LI6/v;->d(Ljava/nio/charset/Charset;LD6/b;Lo9/q;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Ljava/nio/charset/Charset;LO6/d;Ljava/lang/String;LT6/h;)LU6/b;
    .locals 0

    invoke-static {p0, p1, p2, p3}, LI6/v;->e(Ljava/nio/charset/Charset;LO6/d;Ljava/lang/String;LT6/h;)LU6/b;

    move-result-object p0

    return-object p0
.end method

.method public static final i()LJ6/b;
    .locals 1

    sget-object v0, LI6/v;->b:LJ6/b;

    return-object v0
.end method
