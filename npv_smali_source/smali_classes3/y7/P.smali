.class public abstract Ly7/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ly7/Q;

.field private static final b:[LF7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    :try_start_0
    const-class v1, LI7/G;

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly7/Q;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    :catch_0
    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ly7/Q;

    invoke-direct {v0}, Ly7/Q;-><init>()V

    :goto_0
    sput-object v0, Ly7/P;->a:Ly7/Q;

    const/4 v0, 0x0

    new-array v0, v0, [LF7/c;

    sput-object v0, Ly7/P;->b:[LF7/c;

    return-void
.end method

.method public static a(Ly7/p;)LF7/f;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->a(Ly7/p;)LF7/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)LF7/c;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;)LF7/e;
    .locals 2

    sget-object v0, Ly7/P;->a:Ly7/Q;

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Ly7/Q;->c(Ljava/lang/Class;Ljava/lang/String;)LF7/e;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/String;)LF7/e;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0, p1}, Ly7/Q;->c(Ljava/lang/Class;Ljava/lang/String;)LF7/e;

    move-result-object p0

    return-object p0
.end method

.method public static e(LF7/o;)LF7/o;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->d(LF7/o;)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ly7/x;)LF7/h;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->e(Ly7/x;)LF7/h;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ly7/z;)LF7/i;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->f(Ly7/z;)LF7/i;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/Class;)LF7/o;
    .locals 3

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ly7/Q;->m(LF7/d;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ly7/D;)LF7/l;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->g(Ly7/D;)LF7/l;

    move-result-object p0

    return-object p0
.end method

.method public static j(Ly7/F;)LF7/m;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->h(Ly7/F;)LF7/m;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ly7/H;)LF7/n;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->i(Ly7/H;)LF7/n;

    move-result-object p0

    return-object p0
.end method

.method public static l(Ly7/o;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->j(Ly7/o;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ly7/v;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0}, Ly7/Q;->k(Ly7/v;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static n(LF7/p;LF7/o;)V
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ly7/Q;->l(LF7/p;Ljava/util/List;)V

    return-void
.end method

.method public static o(LF7/d;)LF7/o;
    .locals 3

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Ly7/Q;->m(LF7/d;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/lang/Class;)LF7/o;
    .locals 3

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Ly7/Q;->m(LF7/d;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Class;LF7/q;)LF7/o;
    .locals 2

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p0, p1, v1}, Ly7/Q;->m(LF7/d;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static r(Ljava/lang/Class;LF7/q;LF7/q;)LF7/o;
    .locals 3

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-static {p0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p0

    const/4 v1, 0x2

    new-array v1, v1, [LF7/q;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p2, v1, p1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p0, p1, v2}, Ly7/Q;->m(LF7/d;Ljava/util/List;Z)LF7/o;

    move-result-object p0

    return-object p0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)LF7/p;
    .locals 1

    sget-object v0, Ly7/P;->a:Ly7/Q;

    invoke-virtual {v0, p0, p1, p2, p3}, Ly7/Q;->n(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)LF7/p;

    move-result-object p0

    return-object p0
.end method
