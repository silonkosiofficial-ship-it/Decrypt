.class public final LO6/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT6/g0;

.field private final b:LT6/A;

.field private final c:LT6/p;

.field private final d:LU6/b;

.field private final e:LW8/z0;

.field private final f:LW6/b;

.field private final g:Ljava/util/Set;


# direct methods
.method public constructor <init>(LT6/g0;LT6/A;LT6/p;LU6/b;LW8/z0;LW6/b;)V
    .locals 1

    .prologue
    const-string v0, "url"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executionContext"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p6, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO6/e;->a:LT6/g0;

    iput-object p2, p0, LO6/e;->b:LT6/A;

    iput-object p3, p0, LO6/e;->c:LT6/p;

    iput-object p4, p0, LO6/e;->d:LU6/b;

    iput-object p5, p0, LO6/e;->e:LW8/z0;

    iput-object p6, p0, LO6/e;->f:LW6/b;

    invoke-static {}, LF6/i;->a()LW6/a;

    move-result-object p1

    invoke-interface {p6, p1}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    :cond_1
    iput-object p1, p0, LO6/e;->g:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()LW6/b;
    .locals 1

    iget-object v0, p0, LO6/e;->f:LW6/b;

    return-object v0
.end method

.method public final b()LU6/b;
    .locals 1

    iget-object v0, p0, LO6/e;->d:LU6/b;

    return-object v0
.end method

.method public final c(LF6/h;)Ljava/lang/Object;
    .locals 2

    .prologue
    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LO6/e;->f:LW6/b;

    invoke-static {}, LF6/i;->a()LW6/a;

    move-result-object v1

    invoke-interface {v0, v1}, LW6/b;->c(LW6/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final d()LW8/z0;
    .locals 1

    iget-object v0, p0, LO6/e;->e:LW8/z0;

    return-object v0
.end method

.method public final e()LT6/p;
    .locals 1

    iget-object v0, p0, LO6/e;->c:LT6/p;

    return-object v0
.end method

.method public final f()LT6/A;
    .locals 1

    iget-object v0, p0, LO6/e;->b:LT6/A;

    return-object v0
.end method

.method public final g()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, LO6/e;->g:Ljava/util/Set;

    return-object v0
.end method

.method public final h()LT6/g0;
    .locals 1

    iget-object v0, p0, LO6/e;->a:LT6/g0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HttpRequestData(url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LO6/e;->a:LT6/g0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LO6/e;->b:LT6/A;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
