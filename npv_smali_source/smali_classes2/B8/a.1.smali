.class public abstract LB8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/O;


# instance fields
.field private final a:LE8/n;

.field private final b:LB8/v;

.field private final c:LO7/G;

.field protected d:LB8/k;

.field private final e:LE8/h;


# direct methods
.method public constructor <init>(LE8/n;LB8/v;LO7/G;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleDescriptor"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB8/a;->a:LE8/n;

    iput-object p2, p0, LB8/a;->b:LB8/v;

    iput-object p3, p0, LB8/a;->c:LO7/G;

    new-instance p2, LB8/a$a;

    invoke-direct {p2, p0}, LB8/a$a;-><init>(LB8/a;)V

    invoke-interface {p1, p2}, LE8/n;->h(Lx7/l;)LE8/h;

    move-result-object p1

    iput-object p1, p0, LB8/a;->e:LE8/h;

    return-void
.end method


# virtual methods
.method public a(Ln8/c;)Z
    .locals 1

    .prologue
    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/a;->e:LE8/h;

    invoke-interface {v0, p1}, LE8/h;->q(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LB8/a;->e:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LO7/K;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LB8/a;->d(Ln8/c;)LB8/o;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public b(Ln8/c;)Ljava/util/List;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/a;->e:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lj7/v;->q(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Ln8/c;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packageFragments"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LB8/a;->e:LE8/h;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, LP8/a;->a(Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method protected abstract d(Ln8/c;)LB8/o;
.end method

.method protected final e()LB8/k;
    .locals 1

    .prologue
    iget-object v0, p0, LB8/a;->d:LB8/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "components"

    invoke-static {v0}, Ly7/t;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method protected final f()LB8/v;
    .locals 1

    iget-object v0, p0, LB8/a;->b:LB8/v;

    return-object v0
.end method

.method protected final g()LO7/G;
    .locals 1

    iget-object v0, p0, LB8/a;->c:LO7/G;

    return-object v0
.end method

.method protected final h()LE8/n;
    .locals 1

    iget-object v0, p0, LB8/a;->a:LE8/n;

    return-object v0
.end method

.method protected final i(LB8/k;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LB8/a;->d:LB8/k;

    return-void
.end method

.method public x(Ln8/c;Lx7/l;)Ljava/util/Collection;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "nameFilter"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method
