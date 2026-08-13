.class public final Landroidx/lifecycle/O;
.super Landroidx/lifecycle/V$e;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/V$c;


# instance fields
.field private a:Landroid/app/Application;

.field private final b:Landroidx/lifecycle/V$c;

.field private c:Landroid/os/Bundle;

.field private d:Landroidx/lifecycle/k;

.field private e:Lx2/d;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lx2/f;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    const-string v0, "owner"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/V$e;-><init>()V

    invoke-interface {p2}, Lx2/f;->p()Lx2/d;

    move-result-object v0

    iput-object v0, p0, Landroidx/lifecycle/O;->e:Lx2/d;

    invoke-interface {p2}, Landroidx/lifecycle/r;->u()Landroidx/lifecycle/k;

    move-result-object p2

    iput-object p2, p0, Landroidx/lifecycle/O;->d:Landroidx/lifecycle/k;

    iput-object p3, p0, Landroidx/lifecycle/O;->c:Landroid/os/Bundle;

    iput-object p1, p0, Landroidx/lifecycle/O;->a:Landroid/app/Application;

    if-eqz p1, :cond_0

    sget-object p2, Landroidx/lifecycle/V$a;->e:Landroidx/lifecycle/V$a$b;

    invoke-virtual {p2, p1}, Landroidx/lifecycle/V$a$b;->a(Landroid/app/Application;)Landroidx/lifecycle/V$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/lifecycle/V$a;

    invoke-direct {p1}, Landroidx/lifecycle/V$a;-><init>()V

    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/O;->b:Landroidx/lifecycle/V$c;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 1

    .prologue
    const-string v0, "modelClass"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/O;->e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic b(LF7/c;Lc2/a;)Landroidx/lifecycle/T;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/lifecycle/W;->a(Landroidx/lifecycle/V$c;LF7/c;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "modelClass"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "extras"

    invoke-static {p2, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Landroidx/lifecycle/V$d;->c:Lc2/a$b;

    invoke-virtual {p2, v2}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5

    sget-object v3, Landroidx/lifecycle/L;->a:Lc2/a$b;

    invoke-virtual {p2, v3}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v3, Landroidx/lifecycle/L;->b:Lc2/a$b;

    invoke-virtual {p2, v3}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v2, Landroidx/lifecycle/V$a;->g:Lc2/a$b;

    invoke-virtual {p2, v2}, Lc2/a;->a(Lc2/a$b;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    const-class v3, Landroidx/lifecycle/a;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    if-eqz v2, :cond_0

    invoke-static {}, Landroidx/lifecycle/P;->a()Ljava/util/List;

    move-result-object v4

    :goto_0
    invoke-static {p1, v4}, Landroidx/lifecycle/P;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    goto :goto_1

    :cond_0
    invoke-static {}, Landroidx/lifecycle/P;->b()Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :goto_1
    if-nez v4, :cond_1

    iget-object v0, p0, Landroidx/lifecycle/O;->b:Landroidx/lifecycle/V$c;

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/V$c;->c(Ljava/lang/Class;Lc2/a;)Landroidx/lifecycle/T;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v3, :cond_2

    if-eqz v2, :cond_2

    invoke-static {p2}, Landroidx/lifecycle/L;->a(Lc2/a;)Landroidx/lifecycle/I;

    move-result-object p2

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v1

    aput-object p2, v3, v0

    invoke-static {p1, v4, v3}, Landroidx/lifecycle/P;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/T;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-static {p2}, Landroidx/lifecycle/L;->a(Lc2/a;)Landroidx/lifecycle/I;

    move-result-object p2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p2, v0, v1

    invoke-static {p1, v4, v0}, Landroidx/lifecycle/P;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/T;

    move-result-object p1

    goto :goto_2

    :cond_3
    iget-object p2, p0, Landroidx/lifecycle/O;->d:Landroidx/lifecycle/k;

    if-eqz p2, :cond_4

    invoke-virtual {p0, v2, p1}, Landroidx/lifecycle/O;->e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Landroidx/lifecycle/T;)V
    .locals 2

    .prologue
    const-string v0, "viewModel"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/O;->d:Landroidx/lifecycle/k;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/O;->e:Lx2/d;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/O;->d:Landroidx/lifecycle/k;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p1, v0, v1}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/T;Lx2/d;Landroidx/lifecycle/k;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/T;
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "key"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "modelClass"

    invoke-static {p2, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Landroidx/lifecycle/O;->d:Landroidx/lifecycle/k;

    if-eqz v2, :cond_4

    const-class v3, Landroidx/lifecycle/a;

    invoke-virtual {v3, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Landroidx/lifecycle/O;->a:Landroid/app/Application;

    if-eqz v4, :cond_0

    invoke-static {}, Landroidx/lifecycle/P;->a()Ljava/util/List;

    move-result-object v4

    :goto_0
    invoke-static {p2, v4}, Landroidx/lifecycle/P;->c(Ljava/lang/Class;Ljava/util/List;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    goto :goto_1

    :cond_0
    invoke-static {}, Landroidx/lifecycle/P;->b()Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :goto_1
    if-nez v4, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/O;->a:Landroid/app/Application;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/lifecycle/O;->b:Landroidx/lifecycle/V$c;

    invoke-interface {p1, p2}, Landroidx/lifecycle/V$c;->a(Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    goto :goto_2

    :cond_1
    sget-object p1, Landroidx/lifecycle/V$d;->a:Landroidx/lifecycle/V$d$a;

    invoke-virtual {p1}, Landroidx/lifecycle/V$d$a;->a()Landroidx/lifecycle/V$d;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/V$d;->a(Ljava/lang/Class;)Landroidx/lifecycle/T;

    move-result-object p1

    :goto_2
    return-object p1

    :cond_2
    iget-object v5, p0, Landroidx/lifecycle/O;->e:Lx2/d;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-object v6, p0, Landroidx/lifecycle/O;->c:Landroid/os/Bundle;

    invoke-static {v5, v2, p1, v6}, Landroidx/lifecycle/j;->b(Lx2/d;Landroidx/lifecycle/k;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/K;

    move-result-object p1

    if-eqz v3, :cond_3

    iget-object v2, p0, Landroidx/lifecycle/O;->a:Landroid/app/Application;

    if-eqz v2, :cond_3

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/lifecycle/K;->r()Landroidx/lifecycle/I;

    move-result-object v3

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v2, v5, v1

    aput-object v3, v5, v0

    invoke-static {p2, v4, v5}, Landroidx/lifecycle/P;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/T;

    move-result-object p2

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Landroidx/lifecycle/K;->r()Landroidx/lifecycle/I;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v2, v0, v1

    invoke-static {p2, v4, v0}, Landroidx/lifecycle/P;->d(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/T;

    move-result-object p2

    :goto_3
    const-string v0, "androidx.lifecycle.savedstate.vm.tag"

    invoke-virtual {p2, v0, p1}, Landroidx/lifecycle/T;->d(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-object p2

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
