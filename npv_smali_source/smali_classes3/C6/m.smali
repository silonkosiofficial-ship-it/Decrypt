.class public abstract LC6/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF6/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const-class v0, LC6/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, LR8/k;->g(Ljava/util/Iterator;)LR8/h;

    move-result-object v0

    invoke-static {v0}, LR8/k;->A(LR8/h;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LC6/k;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC6/k;->a()LF6/k;

    move-result-object v0

    if-eqz v0, :cond_0

    sput-object v0, LC6/m;->a:LF6/k;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic a(LC6/j;)Li7/M;
    .locals 0

    invoke-static {p0}, LC6/m;->d(LC6/j;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lx7/l;)LC6/c;
    .locals 1

    const-string v0, "block"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LC6/m;->a:LF6/k;

    invoke-static {v0, p0}, LC6/o;->b(LF6/k;Lx7/l;)LC6/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx7/l;ILjava/lang/Object;)LC6/c;
    .locals 0

    .prologue
    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    new-instance p0, LC6/l;

    invoke-direct {p0}, LC6/l;-><init>()V

    :cond_0
    invoke-static {p0}, LC6/m;->b(Lx7/l;)LC6/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(LC6/j;)Li7/M;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
