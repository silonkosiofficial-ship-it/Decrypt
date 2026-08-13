.class public abstract LI6/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;

.field private static final b:Lfa/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const-class v0, Li7/M;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Lb7/a;

    invoke-direct {v2, v1, v0}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v0, LW6/a;

    const-string v1, "ValidateMark"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LI6/g;->a:LW6/a;

    const-string v0, "io.ktor.client.plugins.DefaultResponseValidation"

    invoke-static {v0}, LZ6/a;->a(Ljava/lang/String;)Lfa/d;

    move-result-object v0

    sput-object v0, LI6/g;->b:Lfa/d;

    return-void
.end method

.method public static synthetic a(LC6/j;LI6/n;)Li7/M;
    .locals 0

    invoke-static {p0, p1}, LI6/g;->e(LC6/j;LI6/n;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Lfa/d;
    .locals 1

    sget-object v0, LI6/g;->b:Lfa/d;

    return-object v0
.end method

.method public static final synthetic c()LW6/a;
    .locals 1

    sget-object v0, LI6/g;->a:LW6/a;

    return-object v0
.end method

.method public static final d(LC6/j;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LI6/f;

    invoke-direct {v0, p0}, LI6/f;-><init>(LC6/j;)V

    invoke-static {p0, v0}, LI6/p;->f(LC6/j;Lx7/l;)V

    return-void
.end method

.method private static final e(LC6/j;LI6/n;)Li7/M;
    .locals 1

    const-string v0, "$this$HttpResponseValidator"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC6/j;->k()Z

    move-result p0

    invoke-virtual {p1, p0}, LI6/n;->d(Z)V

    new-instance p0, LI6/g$a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LI6/g$a;-><init>(Lm7/e;)V

    invoke-virtual {p1, p0}, LI6/n;->e(Lx7/p;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method
