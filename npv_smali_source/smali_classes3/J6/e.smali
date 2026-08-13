.class final LJ6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ6/b;


# instance fields
.field private final a:Lx7/a;

.field private final b:Lx7/l;

.field private final c:LW6/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lx7/a;Lx7/l;)V
    .locals 5

    .prologue
    const-string v0, "name"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createConfiguration"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LJ6/e;->a:Lx7/a;

    iput-object p3, p0, LJ6/e;->b:Lx7/l;

    const-class p2, LJ6/g;

    invoke-static {p2}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object p3

    :try_start_0
    sget-object v0, LF7/q;->c:LF7/q$a;

    const-class v1, LJ6/e;

    invoke-static {v1}, Ly7/P;->b(Ljava/lang/Class;)LF7/c;

    move-result-object v1

    const-string v2, "PluginConfigT"

    sget-object v3, LF7/r;->C:LF7/r;

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Ly7/P;->s(Ljava/lang/Object;Ljava/lang/String;LF7/r;Z)LF7/p;

    move-result-object v1

    const-class v2, Ljava/lang/Object;

    invoke-static {v2}, Ly7/P;->p(Ljava/lang/Class;)LF7/o;

    move-result-object v2

    invoke-static {v1, v2}, Ly7/P;->n(LF7/p;LF7/o;)V

    invoke-static {v1}, Ly7/P;->o(LF7/d;)LF7/o;

    move-result-object v1

    invoke-virtual {v0, v1}, LF7/q$a;->d(LF7/o;)LF7/q;

    move-result-object v0

    invoke-static {p2, v0}, Ly7/P;->q(Ljava/lang/Class;LF7/q;)LF7/o;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p2, 0x0

    :goto_0
    new-instance v0, Lb7/a;

    invoke-direct {v0, p3, p2}, Lb7/a;-><init>(LF7/c;LF7/o;)V

    new-instance p2, LW6/a;

    invoke-direct {p2, p1, v0}, LW6/a;-><init>(Ljava/lang/String;Lb7/a;)V

    iput-object p2, p0, LJ6/e;->c:LW6/a;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lx7/l;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LJ6/e;->d(Lx7/l;)LJ6/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;LC6/c;)V
    .locals 0

    check-cast p1, LJ6/g;

    invoke-virtual {p0, p1, p2}, LJ6/e;->c(LJ6/g;LC6/c;)V

    return-void
.end method

.method public c(LJ6/g;LC6/c;)V
    .locals 1

    const-string v0, "plugin"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LJ6/g;->A0(LC6/c;)V

    return-void
.end method

.method public d(Lx7/l;)LJ6/g;
    .locals 3

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LJ6/e;->a:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, LJ6/g;

    invoke-virtual {p0}, LJ6/e;->getKey()LW6/a;

    move-result-object v1

    iget-object v2, p0, LJ6/e;->b:Lx7/l;

    invoke-direct {p1, v1, v0, v2}, LJ6/g;-><init>(LW6/a;Ljava/lang/Object;Lx7/l;)V

    return-object p1
.end method

.method public getKey()LW6/a;
    .locals 1

    iget-object v0, p0, LJ6/e;->c:LW6/a;

    return-object v0
.end method
