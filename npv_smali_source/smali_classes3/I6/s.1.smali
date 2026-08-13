.class public abstract LI6/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LW6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const-class v0, LW6/b;

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

    const-string v1, "ApplicationPluginRegistry"

    invoke-direct {v0, v1, v2}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    sput-object v0, LI6/s;->a:LW6/a;

    return-void
.end method

.method public static final a()LW6/a;
    .locals 1

    sget-object v0, LI6/s;->a:LW6/a;

    return-object v0
.end method

.method public static final b(LC6/c;LI6/r;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plugin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LI6/s;->c(LC6/c;LI6/r;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Plugin "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " is not installed. Consider using `install("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ")` in client config first."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final c(LC6/c;LI6/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plugin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC6/c;->x0()LW6/b;

    move-result-object p0

    sget-object v0, LI6/s;->a:LW6/a;

    invoke-interface {p0, v0}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LW6/b;

    if-eqz p0, :cond_0

    invoke-interface {p1}, LI6/r;->getKey()LW6/a;

    move-result-object p1

    invoke-interface {p0, p1}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
