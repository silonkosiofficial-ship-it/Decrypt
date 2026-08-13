.class public abstract LF6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;

.field private static final b:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const-class v0, Ljava/util/Map;

    invoke-static {v0}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    :try_start_0
    sget-object v2, LF7/q;->c:LF7/q$a;

    const-class v3, LF6/h;

    invoke-virtual {v2}, LF7/q$a;->c()LF7/q;

    move-result-object v4

    invoke-static {v3, v4}, Ly7/P;->q(Ljava/lang/Class;LF7/q;)LF7/o;

    move-result-object v3

    invoke-virtual {v2, v3}, LF7/q$a;->d(LF7/o;)LF7/q;

    move-result-object v3

    const-class v4, Ljava/lang/Object;

    invoke-static {v4}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v4

    invoke-virtual {v2, v4}, LF7/q$a;->d(LF7/o;)LF7/q;

    move-result-object v2

    invoke-static {v0, v3, v2}, Ly7/P;->r(Ljava/lang/Class;LF7/q;LF7/q;)LF7/o;

    move-result-object v0

    invoke-static {v0}, Ly7/P;->e(LF7/o;)LF7/o;

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

    const-string v1, "EngineCapabilities"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LF6/i;->a:LW6/a;

    sget-object v0, LI6/F;->a:LI6/F;

    invoke-static {v0}, Lj7/Z;->c(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, LF6/i;->b:Ljava/util/Set;

    return-void
.end method

.method public static final a()LW6/a;
    .locals 1

    sget-object v0, LF6/i;->a:LW6/a;

    return-object v0
.end method
