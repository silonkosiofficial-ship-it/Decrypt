.class public abstract LJ6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()Li7/M;
    .locals 1

    invoke-static {}, LJ6/i;->d()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method public static final b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createConfiguration"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ6/e;

    invoke-direct {v0, p0, p1, p2}, LJ6/e;-><init>(Ljava/lang/String;Lx7/a;Lx7/l;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Lx7/l;)LJ6/b;
    .locals 1

    const-string v0, "name"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ6/h;

    invoke-direct {v0}, LJ6/h;-><init>()V

    invoke-static {p0, v0, p1}, LJ6/i;->b(Ljava/lang/String;Lx7/a;Lx7/l;)LJ6/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
