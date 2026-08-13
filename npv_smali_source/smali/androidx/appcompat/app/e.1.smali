.class public abstract Landroidx/appcompat/app/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static C:Landroidx/appcompat/app/w;

.field private static D:I

.field private static E:Landroidx/core/os/i;

.field private static F:Landroidx/core/os/i;

.field private static G:Ljava/lang/Boolean;

.field private static H:Z

.field private static final I:Lr/b;

.field private static final J:Ljava/lang/Object;

.field private static final K:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/appcompat/app/w;

    new-instance v1, Landroidx/appcompat/app/x;

    invoke-direct {v1}, Landroidx/appcompat/app/x;-><init>()V

    invoke-direct {v0, v1}, Landroidx/appcompat/app/w;-><init>(Ljava/util/concurrent/Executor;)V

    sput-object v0, Landroidx/appcompat/app/e;->C:Landroidx/appcompat/app/w;

    const/16 v0, -0x64

    sput v0, Landroidx/appcompat/app/e;->D:I

    const/4 v0, 0x0

    sput-object v0, Landroidx/appcompat/app/e;->E:Landroidx/core/os/i;

    sput-object v0, Landroidx/appcompat/app/e;->F:Landroidx/core/os/i;

    sput-object v0, Landroidx/appcompat/app/e;->G:Ljava/lang/Boolean;

    const/4 v0, 0x0

    sput-boolean v0, Landroidx/appcompat/app/e;->H:Z

    new-instance v0, Lr/b;

    invoke-direct {v0}, Lr/b;-><init>()V

    sput-object v0, Landroidx/appcompat/app/e;->I:Lr/b;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/e;->J:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/appcompat/app/e;->K:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static c(Landroidx/appcompat/app/e;)V
    .locals 3

    .prologue
    sget-object v0, Landroidx/appcompat/app/e;->J:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/e;->o(Landroidx/appcompat/app/e;)V

    sget-object v1, Landroidx/appcompat/app/e;->I:Lr/b;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lr/b;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static e(Landroid/app/Dialog;Landroidx/appcompat/app/d;)Landroidx/appcompat/app/e;
    .locals 1

    new-instance v0, Landroidx/appcompat/app/f;

    invoke-direct {v0, p0, p1}, Landroidx/appcompat/app/f;-><init>(Landroid/app/Dialog;Landroidx/appcompat/app/d;)V

    return-object v0
.end method

.method public static g()I
    .locals 1

    sget v0, Landroidx/appcompat/app/e;->D:I

    return v0
.end method

.method static h()Landroidx/core/os/i;
    .locals 1

    sget-object v0, Landroidx/appcompat/app/e;->E:Landroidx/core/os/i;

    return-object v0
.end method

.method static n(Landroidx/appcompat/app/e;)V
    .locals 1

    .prologue
    sget-object v0, Landroidx/appcompat/app/e;->J:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Landroidx/appcompat/app/e;->o(Landroidx/appcompat/app/e;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private static o(Landroidx/appcompat/app/e;)V
    .locals 3

    .prologue
    sget-object v0, Landroidx/appcompat/app/e;->J:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/appcompat/app/e;->I:Lr/b;

    invoke-virtual {v1}, Lr/b;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/e;

    if-eq v2, p0, :cond_1

    if-nez v2, :cond_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public abstract d(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public abstract f(I)Landroid/view/View;
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract k(Landroid/os/Bundle;)V
.end method

.method public abstract l()V
.end method

.method public abstract m()V
.end method

.method public abstract p(I)Z
.end method

.method public abstract q(I)V
.end method

.method public abstract r(Landroid/view/View;)V
.end method

.method public abstract s(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method public t(Landroid/window/OnBackInvokedDispatcher;)V
    .locals 0

    return-void
.end method

.method public abstract u(I)V
.end method

.method public abstract v(Ljava/lang/CharSequence;)V
.end method
