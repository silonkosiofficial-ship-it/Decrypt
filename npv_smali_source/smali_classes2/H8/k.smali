.class public final LH8/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH8/k;

.field private static final b:LO7/G;

.field private static final c:LH8/a;

.field private static final d:LF8/E;

.field private static final e:LF8/E;

.field private static final f:LO7/U;

.field private static final g:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, LH8/k;

    invoke-direct {v0}, LH8/k;-><init>()V

    sput-object v0, LH8/k;->a:LH8/k;

    sget-object v0, LH8/d;->C:LH8/d;

    sput-object v0, LH8/k;->b:LO7/G;

    new-instance v0, LH8/a;

    sget-object v1, LH8/b;->D:LH8/b;

    invoke-virtual {v1}, LH8/b;->g()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "unknown class"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "format(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ln8/f;->s(Ljava/lang/String;)Ln8/f;

    move-result-object v1

    const-string v2, "special(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LH8/a;-><init>(Ln8/f;)V

    sput-object v0, LH8/k;->c:LH8/a;

    sget-object v0, LH8/j;->X:LH8/j;

    new-array v1, v5, [Ljava/lang/String;

    invoke-static {v0, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v0

    sput-object v0, LH8/k;->d:LF8/E;

    sget-object v0, LH8/j;->U0:LH8/j;

    new-array v1, v5, [Ljava/lang/String;

    invoke-static {v0, v1}, LH8/k;->d(LH8/j;[Ljava/lang/String;)LH8/h;

    move-result-object v0

    sput-object v0, LH8/k;->e:LF8/E;

    new-instance v0, LH8/e;

    invoke-direct {v0}, LH8/e;-><init>()V

    sput-object v0, LH8/k;->f:LO7/U;

    invoke-static {v0}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LH8/k;->g:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final varargs a(LH8/g;Z[Ljava/lang/String;)LH8/f;
    .locals 1

    .prologue
    const-string v0, "kind"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    new-instance p1, LH8/l;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, LH8/l;-><init>(LH8/g;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, LH8/f;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {p1, p0, p2}, LH8/f;-><init>(LH8/g;[Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method public static final varargs b(LH8/g;[Ljava/lang/String;)LH8/f;
    .locals 1

    const-string v0, "kind"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p0, v0, p1}, LH8/k;->a(LH8/g;Z[Ljava/lang/String;)LH8/f;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs d(LH8/j;[Ljava/lang/String;)LH8/h;
    .locals 3

    const-string v0, "kind"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v1

    array-length v2, p1

    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {v0, p0, v1, p1}, LH8/k;->g(LH8/j;Ljava/util/List;[Ljava/lang/String;)LH8/h;

    move-result-object p0

    return-object p0
.end method

.method public static final m(LO7/m;)Z
    .locals 2

    .prologue
    if-eqz p0, :cond_1

    sget-object v0, LH8/k;->a:LH8/k;

    invoke-direct {v0, p0}, LH8/k;->n(LO7/m;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, LO7/m;->b()LO7/m;

    move-result-object v1

    invoke-direct {v0, v1}, LH8/k;->n(LO7/m;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, LH8/k;->b:LO7/G;

    if-ne p0, v0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private final n(LO7/m;)Z
    .locals 0

    instance-of p1, p1, LH8/a;

    return p1
.end method

.method public static final o(LF8/E;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LF8/E;->W0()LF8/e0;

    move-result-object p0

    instance-of v1, p0, LH8/i;

    if-eqz v1, :cond_1

    check-cast p0, LH8/i;

    invoke-virtual {p0}, LH8/i;->b()LH8/j;

    move-result-object p0

    sget-object v1, LH8/j;->a0:LH8/j;

    if-ne p0, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method


# virtual methods
.method public final varargs c(LH8/j;LF8/e0;[Ljava/lang/String;)LH8/h;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeConstructor"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p0, p1, v0, p2, p3}, LH8/k;->f(LH8/j;Ljava/util/List;LF8/e0;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public final varargs e(LH8/j;[Ljava/lang/String;)LH8/i;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH8/i;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-direct {v0, p1, p2}, LH8/i;-><init>(LH8/j;[Ljava/lang/String;)V

    return-object v0
.end method

.method public final varargs f(LH8/j;Ljava/util/List;LF8/e0;[Ljava/lang/String;)LH8/h;
    .locals 8

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeConstructor"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LH8/h;

    sget-object v1, LH8/g;->J:LH8/g;

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LH8/k;->b(LH8/g;[Ljava/lang/String;)LH8/f;

    move-result-object v3

    array-length v1, p4

    invoke-static {p4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p4

    move-object v7, p4

    check-cast v7, [Ljava/lang/String;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, LH8/h;-><init>(LF8/e0;Ly8/h;LH8/j;Ljava/util/List;Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public final varargs g(LH8/j;Ljava/util/List;[Ljava/lang/String;)LH8/h;
    .locals 2

    const-string v0, "kind"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p3

    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, p1, v0}, LH8/k;->e(LH8/j;[Ljava/lang/String;)LH8/i;

    move-result-object v0

    array-length v1, p3

    invoke-static {p3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/String;

    invoke-virtual {p0, p1, p2, v0, p3}, LH8/k;->f(LH8/j;Ljava/util/List;LF8/e0;[Ljava/lang/String;)LH8/h;

    move-result-object p1

    return-object p1
.end method

.method public final h()LH8/a;
    .locals 1

    sget-object v0, LH8/k;->c:LH8/a;

    return-object v0
.end method

.method public final i()LO7/G;
    .locals 1

    sget-object v0, LH8/k;->b:LO7/G;

    return-object v0
.end method

.method public final j()Ljava/util/Set;
    .locals 1

    sget-object v0, LH8/k;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final k()LF8/E;
    .locals 1

    sget-object v0, LH8/k;->e:LF8/E;

    return-object v0
.end method

.method public final l()LF8/E;
    .locals 1

    sget-object v0, LH8/k;->d:LF8/E;

    return-object v0
.end method

.method public final p(LF8/E;)Ljava/lang/String;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LK8/a;->u(LF8/E;)Z

    invoke-virtual {p1}, LF8/E;->W0()LF8/e0;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LH8/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LH8/i;->c(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
