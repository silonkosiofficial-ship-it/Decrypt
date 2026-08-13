.class public final LT7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LX7/p;


# instance fields
.field private final a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 1

    const-string v0, "classLoader"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT7/d;->a:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public a(Ln8/c;Z)Le8/u;
    .locals 0

    const-string p2, "fqName"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LU7/w;

    invoke-direct {p2, p1}, LU7/w;-><init>(Ln8/c;)V

    return-object p2
.end method

.method public b(LX7/p$a;)Le8/g;
    .locals 7

    .prologue
    const-string v0, "request"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LX7/p$a;->a()Ln8/b;

    move-result-object p1

    invoke-virtual {p1}, Ln8/b;->h()Ln8/c;

    move-result-object v0

    const-string v1, "getPackageFqName(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln8/b;->i()Ln8/c;

    move-result-object p1

    invoke-virtual {p1}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v1

    const-string p1, "asString(...)"

    invoke-static {v1, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x2e

    const/16 v3, 0x24

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LS8/r;->Q(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Ln8/c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ln8/c;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2e

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object v0, p0, LT7/d;->a:Ljava/lang/ClassLoader;

    invoke-static {v0, p1}, LT7/e;->a(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, LU7/l;

    invoke-direct {v0, p1}, LU7/l;-><init>(Ljava/lang/Class;)V

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public c(Ln8/c;)Ljava/util/Set;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
