.class public abstract LI6/d;
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
    const-class v0, LE6/a;

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

    const-string v3, "UploadProgressListenerAttributeKey"

    invoke-direct {v1, v3, v4}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LI6/d;->a:LW6/a;

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

    const-string v2, "DownloadProgressListenerAttributeKey"

    invoke-direct {v1, v2, v0}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v1, LI6/d;->b:LW6/a;

    new-instance v0, LI6/c;

    invoke-direct {v0}, LI6/c;-><init>()V

    const-string v1, "BodyProgress"

    invoke-static {v1, v0}, LJ6/i;->c(Ljava/lang/String;Lx7/l;)LJ6/b;

    move-result-object v0

    sput-object v0, LI6/d;->c:LJ6/b;

    return-void
.end method

.method public static synthetic a(LJ6/d;)Li7/M;
    .locals 0

    invoke-static {p0}, LI6/d;->b(LJ6/d;)Li7/M;

    move-result-object p0

    return-object p0
.end method

.method private static final b(LJ6/d;)Li7/M;
    .locals 3

    const-string v0, "$this$createClientPlugin"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LI6/b;->a:LI6/b;

    new-instance v1, LI6/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LI6/d$a;-><init>(Lm7/e;)V

    invoke-virtual {p0, v0, v1}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object v0, LI6/a;->a:LI6/a;

    new-instance v1, LI6/d$b;

    invoke-direct {v1, v2}, LI6/d$b;-><init>(Lm7/e;)V

    invoke-virtual {p0, v0, v1}, LJ6/d;->f(LJ6/a;Ljava/lang/Object;)V

    sget-object p0, Li7/M;->a:Li7/M;

    return-object p0
.end method

.method public static final synthetic c()LW6/a;
    .locals 1

    sget-object v0, LI6/d;->b:LW6/a;

    return-object v0
.end method

.method public static final synthetic d()LW6/a;
    .locals 1

    sget-object v0, LI6/d;->a:LW6/a;

    return-object v0
.end method

.method public static final e()LJ6/b;
    .locals 1

    sget-object v0, LI6/d;->c:LJ6/b;

    return-object v0
.end method
