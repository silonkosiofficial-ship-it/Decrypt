.class public abstract LR2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final C:LJ2/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LJ2/c;

    invoke-direct {v0}, LJ2/c;-><init>()V

    iput-object v0, p0, LR2/a;->C:LJ2/c;

    return-void
.end method

.method public static b(Ljava/util/UUID;LJ2/j;)LR2/a;
    .locals 1

    new-instance v0, LR2/a$a;

    invoke-direct {v0, p1, p0}, LR2/a$a;-><init>(LJ2/j;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;LJ2/j;Z)LR2/a;
    .locals 1

    new-instance v0, LR2/a$c;

    invoke-direct {v0, p1, p0, p2}, LR2/a$c;-><init>(LJ2/j;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static d(Ljava/lang/String;LJ2/j;)LR2/a;
    .locals 1

    new-instance v0, LR2/a$b;

    invoke-direct {v0, p1, p0}, LR2/a$b;-><init>(LJ2/j;Ljava/lang/String;)V

    return-object v0
.end method

.method private f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 4

    .prologue
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->Q()LQ2/b;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2}, LQ2/q;->m(Ljava/lang/String;)LI2/s;

    move-result-object v2

    sget-object v3, LI2/s;->E:LI2/s;

    if-eq v2, v3, :cond_0

    sget-object v3, LI2/s;->F:LI2/s;

    if-eq v2, v3, :cond_0

    sget-object v2, LI2/s;->H:LI2/s;

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v2, v3}, LQ2/q;->b(LI2/s;[Ljava/lang/String;)I

    :cond_0
    invoke-interface {p1, p2}, LQ2/b;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method a(LJ2/j;Ljava/lang/String;)V
    .locals 1

    .prologue
    invoke-virtual {p1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-direct {p0, v0, p2}, LR2/a;->f(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p1}, LJ2/j;->m()LJ2/d;

    move-result-object v0

    invoke-virtual {v0, p2}, LJ2/d;->l(Ljava/lang/String;)Z

    invoke-virtual {p1}, LJ2/j;->n()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LJ2/e;

    invoke-interface {v0, p2}, LJ2/e;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e()LI2/m;
    .locals 1

    iget-object v0, p0, LR2/a;->C:LJ2/c;

    return-object v0
.end method

.method g(LJ2/j;)V
    .locals 2

    invoke-virtual {p1}, LJ2/j;->i()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p1}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p1}, LJ2/j;->n()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, LJ2/f;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method abstract h()V
.end method

.method public run()V
    .locals 3

    .prologue
    :try_start_0
    invoke-virtual {p0}, LR2/a;->h()V

    iget-object v0, p0, LR2/a;->C:LJ2/c;

    sget-object v1, LI2/m;->a:LI2/m$b$c;

    invoke-virtual {v0, v1}, LJ2/c;->a(LI2/m$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LR2/a;->C:LJ2/c;

    new-instance v2, LI2/m$b$a;

    invoke-direct {v2, v0}, LI2/m$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, LJ2/c;->a(LI2/m$b;)V

    :goto_0
    return-void
.end method
