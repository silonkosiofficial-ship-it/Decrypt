.class public final LJ6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final C:LW6/a;

.field private final D:Ljava/lang/Object;

.field private final E:Lx7/l;

.field private F:Lx7/a;


# direct methods
.method public constructor <init>(LW6/a;Ljava/lang/Object;Lx7/l;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ6/g;->C:LW6/a;

    iput-object p2, p0, LJ6/g;->D:Ljava/lang/Object;

    iput-object p3, p0, LJ6/g;->E:Lx7/l;

    new-instance p1, LJ6/f;

    invoke-direct {p1}, LJ6/f;-><init>()V

    iput-object p1, p0, LJ6/g;->F:Lx7/a;

    return-void
.end method

.method public static synthetic a()Li7/M;
    .locals 1

    invoke-static {}, LJ6/g;->f()Li7/M;

    move-result-object v0

    return-object v0
.end method

.method private static final f()Li7/M;
    .locals 1

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method


# virtual methods
.method public final A0(LC6/c;)V
    .locals 3

    .prologue
    const-string v0, "scope"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LJ6/d;

    iget-object v1, p0, LJ6/g;->C:LW6/a;

    iget-object v2, p0, LJ6/g;->D:Ljava/lang/Object;

    invoke-direct {v0, v1, p1, v2}, LJ6/d;-><init>(LW6/a;LC6/c;Ljava/lang/Object;)V

    iget-object v1, p0, LJ6/g;->E:Lx7/l;

    invoke-interface {v1, v0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LJ6/d;->d()Lx7/a;

    move-result-object v1

    iput-object v1, p0, LJ6/g;->F:Lx7/a;

    invoke-virtual {v0}, LJ6/d;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ6/j;

    invoke-virtual {v1, p1}, LJ6/j;->a(LC6/c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, LJ6/g;->F:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method
