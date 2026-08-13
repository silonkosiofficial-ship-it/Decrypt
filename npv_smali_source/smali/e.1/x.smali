.class public final Le/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/x$f;,
        Le/x$g;,
        Le/x$h;,
        Le/x$i;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Runnable;

.field private final b:LB1/a;

.field private final c:Lj7/m;

.field private d:Le/w;

.field private e:Landroid/window/OnBackInvokedCallback;

.field private f:Landroid/window/OnBackInvokedDispatcher;

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/x;-><init>(Ljava/lang/Runnable;LB1/a;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;LB1/a;)V
    .locals 3

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/x;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Le/x;->b:LB1/a;

    new-instance p1, Lj7/m;

    invoke-direct {p1}, Lj7/m;-><init>()V

    iput-object p1, p0, Le/x;->c:Lj7/m;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_1

    const/16 p2, 0x22

    if-lt p1, p2, :cond_0

    sget-object p1, Le/x$g;->a:Le/x$g;

    new-instance p2, Le/x$a;

    invoke-direct {p2, p0}, Le/x$a;-><init>(Le/x;)V

    new-instance v0, Le/x$b;

    invoke-direct {v0, p0}, Le/x$b;-><init>(Le/x;)V

    new-instance v1, Le/x$c;

    invoke-direct {v1, p0}, Le/x$c;-><init>(Le/x;)V

    new-instance v2, Le/x$d;

    invoke-direct {v2, p0}, Le/x$d;-><init>(Le/x;)V

    invoke-virtual {p1, p2, v0, v1, v2}, Le/x$g;->a(Lx7/l;Lx7/l;Lx7/a;Lx7/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Le/x$f;->a:Le/x$f;

    new-instance p2, Le/x$e;

    invoke-direct {p2, p0}, Le/x$e;-><init>(Le/x;)V

    invoke-virtual {p1, p2}, Le/x$f;->b(Lx7/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Le/x;->e:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method

.method public static final synthetic a(Le/x;)Le/w;
    .locals 0

    iget-object p0, p0, Le/x;->d:Le/w;

    return-object p0
.end method

.method public static final synthetic b(Le/x;)Lj7/m;
    .locals 0

    iget-object p0, p0, Le/x;->c:Lj7/m;

    return-object p0
.end method

.method public static final synthetic c(Le/x;)V
    .locals 0

    invoke-direct {p0}, Le/x;->k()V

    return-void
.end method

.method public static final synthetic d(Le/x;Le/b;)V
    .locals 0

    invoke-direct {p0, p1}, Le/x;->m(Le/b;)V

    return-void
.end method

.method public static final synthetic e(Le/x;Le/b;)V
    .locals 0

    invoke-direct {p0, p1}, Le/x;->n(Le/b;)V

    return-void
.end method

.method public static final synthetic f(Le/x;Le/w;)V
    .locals 0

    iput-object p1, p0, Le/x;->d:Le/w;

    return-void
.end method

.method public static final synthetic g(Le/x;)V
    .locals 0

    invoke-direct {p0}, Le/x;->q()V

    return-void
.end method

.method private final k()V
    .locals 4

    .prologue
    iget-object v0, p0, Le/x;->d:Le/w;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Le/x;->c:Lj7/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Le/w;

    invoke-virtual {v3}, Le/w;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Le/w;

    :cond_2
    iput-object v1, p0, Le/x;->d:Le/w;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Le/w;->c()V

    :cond_3
    return-void
.end method

.method private final m(Le/b;)V
    .locals 3

    .prologue
    iget-object v0, p0, Le/x;->d:Le/w;

    if-nez v0, :cond_2

    iget-object v0, p0, Le/x;->c:Lj7/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Le/w;

    invoke-virtual {v2}, Le/w;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    move-object v0, v1

    check-cast v0, Le/w;

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Le/w;->e(Le/b;)V

    :cond_3
    return-void
.end method

.method private final n(Le/b;)V
    .locals 3

    .prologue
    iget-object v0, p0, Le/x;->c:Lj7/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Le/w;

    invoke-virtual {v2}, Le/w;->g()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Le/w;

    iget-object v0, p0, Le/x;->d:Le/w;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Le/x;->k()V

    :cond_2
    iput-object v1, p0, Le/x;->d:Le/w;

    if-eqz v1, :cond_3

    invoke-virtual {v1, p1}, Le/w;->f(Le/b;)V

    :cond_3
    return-void
.end method

.method private final p(Z)V
    .locals 4

    .prologue
    iget-object v0, p0, Le/x;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Le/x;->e:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    iget-boolean v3, p0, Le/x;->g:Z

    if-nez v3, :cond_0

    sget-object p1, Le/x$f;->a:Le/x$f;

    invoke-virtual {p1, v0, v2, v1}, Le/x$f;->d(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Le/x;->g:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Le/x;->g:Z

    if-eqz p1, :cond_1

    sget-object p1, Le/x$f;->a:Le/x$f;

    invoke-virtual {p1, v0, v1}, Le/x$f;->e(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Le/x;->g:Z

    :cond_1
    :goto_0
    return-void
.end method

.method private final q()V
    .locals 4

    .prologue
    iget-boolean v0, p0, Le/x;->h:Z

    iget-object v1, p0, Le/x;->c:Lj7/m;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/w;

    invoke-virtual {v2}, Le/w;->g()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Le/x;->h:Z

    if-eq v3, v0, :cond_4

    iget-object v0, p0, Le/x;->b:LB1/a;

    if-eqz v0, :cond_3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, LB1/a;->accept(Ljava/lang/Object;)V

    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_4

    invoke-direct {p0, v3}, Le/x;->p(Z)V

    :cond_4
    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/r;Le/w;)V
    .locals 2

    .prologue
    const-string v0, "owner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->C:Landroidx/lifecycle/k$b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Le/x$h;

    invoke-direct {v0, p0, p1, p2}, Le/x$h;-><init>(Le/x;Landroidx/lifecycle/k;Le/w;)V

    invoke-virtual {p2, v0}, Le/w;->a(Le/c;)V

    invoke-direct {p0}, Le/x;->q()V

    new-instance p1, Le/x$j;

    invoke-direct {p1, p0}, Le/x$j;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p2, p1}, Le/w;->k(Lx7/a;)V

    return-void
.end method

.method public final i(Le/w;)V
    .locals 1

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Le/x;->j(Le/w;)Le/c;

    return-void
.end method

.method public final j(Le/w;)Le/c;
    .locals 2

    const-string v0, "onBackPressedCallback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/x;->c:Lj7/m;

    invoke-virtual {v0, p1}, Lj7/m;->add(Ljava/lang/Object;)Z

    new-instance v0, Le/x$i;

    invoke-direct {v0, p0, p1}, Le/x$i;-><init>(Le/x;Le/w;)V

    invoke-virtual {p1, v0}, Le/w;->a(Le/c;)V

    invoke-direct {p0}, Le/x;->q()V

    new-instance v1, Le/x$k;

    invoke-direct {v1, p0}, Le/x$k;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Le/w;->k(Lx7/a;)V

    return-object v0
.end method

.method public final l()V
    .locals 4

    .prologue
    iget-object v0, p0, Le/x;->d:Le/w;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Le/x;->c:Lj7/m;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Le/w;

    invoke-virtual {v3}, Le/w;->g()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Le/w;

    :cond_2
    iput-object v1, p0, Le/x;->d:Le/w;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Le/w;->d()V

    return-void

    :cond_3
    iget-object v0, p0, Le/x;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_4
    return-void
.end method

.method public final o(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 1

    const-string v0, "invoker"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Le/x;->f:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p1, p0, Le/x;->h:Z

    invoke-direct {p0, p1}, Le/x;->p(Z)V

    return-void
.end method
