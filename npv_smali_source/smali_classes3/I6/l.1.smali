.class public abstract LI6/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;

.field private static final b:LW6/a;

.field private static final c:LJ6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const-class v0, Li7/M;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v3, v2

    :goto_0
    new-instance v4, Lb7/a;

    invoke-direct {v4, v1, v3}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v1, LW6/a;

    const-string v3, "SkipSaveBody"

    invoke-direct {v1, v3, v4}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LI6/l;->a:LW6/a;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_1
    invoke-static {v0}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    new-instance v0, Lb7/a;

    invoke-direct {v0, v1, v2}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance v1, LW6/a;

    const-string v2, "ResponseBodySaved"

    invoke-direct {v1, v2, v0}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LI6/l;->b:LW6/a;

    sget-object v0, LI6/l$a;->L:LI6/l$a;

    new-instance v1, LI6/k;

    invoke-direct {v1}, LI6/k;-><init>()V

    const-string v2, "DoubleReceivePlugin"

    invoke-static {v2, v0, v1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/l;->c:LJ6/b;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/l;->b(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LJ6/d;)Li7/M;
    .locals 4

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LJ6/d;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LI6/P;

    invoke-virtual {v0}, LI6/P;->a()Z

    move-result v0

    invoke-virtual {p0}, LJ6/d;->b()LC6/c;

    move-result-object p0

    invoke-virtual {p0}, LC6/c;->y()LQ6/b;

    move-result-object p0

    sget-object v1, LQ6/b;->g:LQ6/b$a;

    invoke-virtual {v1}, LQ6/b$a;->b()La7/i;

    move-result-object v1

    new-instance v2, LI6/l$b;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, LI6/l$b;-><init>(ZLm7/e;)V

    invoke-virtual {p0, v1, v2}, La7/d;->l(La7/i;Lx7/q;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic c()LW6/a;
    .locals 1

    sget-object v0, LI6/l;->b:LW6/a;

    return-object v0
.end method

.method public static final synthetic d()LW6/a;
    .locals 1

    sget-object v0, LI6/l;->a:LW6/a;

    return-object v0
.end method

.method public static final e()LJ6/b;
    .locals 1

    sget-object v0, LI6/l;->c:LJ6/b;

    return-object v0
.end method

.method public static final f(LQ6/c;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LQ6/c;->H0()LD6/b;

    move-result-object p0

    invoke-virtual {p0}, LD6/b;->x0()LW6/b;

    move-result-object p0

    sget-object v0, LI6/l;->b:LW6/a;

    invoke-interface {p0, v0}, LW6/b;->e(LW6/a;)Z

    move-result p0

    return p0
.end method
