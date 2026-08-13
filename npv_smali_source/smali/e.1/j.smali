.class public abstract Le/j;
.super Landroidx/core/app/f;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Landroidx/lifecycle/Y;
.implements Landroidx/lifecycle/i;
.implements Lx2/f;
.implements Le/A;
.implements Lh/f;
.implements Landroidx/core/content/b;
.implements Landroidx/core/content/c;
.implements Landroidx/core/app/n;
.implements Landroidx/core/app/o;
.implements Landroidx/core/view/w;
.implements Le/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/j$b;,
        Le/j$c;,
        Le/j$d;,
        Le/j$e;,
        Le/j$f;
    }
.end annotation


# static fields
.field private static final X:Le/j$c;


# instance fields
.field private final E:Lg/a;

.field private final F:Landroidx/core/view/x;

.field private final G:Lx2/e;

.field private H:Landroidx/lifecycle/X;

.field private final I:Le/j$e;

.field private final J:Li7/n;

.field private K:I

.field private final L:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final M:Lh/e;

.field private final N:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final O:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final P:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final Q:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final R:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private final S:Ljava/util/concurrent/CopyOnWriteArrayList;

.field private T:Z

.field private U:Z

.field private final V:Li7/n;

.field private final W:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/j$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/j$c;-><init>(Ly7/k;)V

    sput-object v0, Le/j;->X:Le/j$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    invoke-direct {p0}, Landroidx/core/app/f;-><init>()V

    new-instance v0, Lg/a;

    invoke-direct {v0}, Lg/a;-><init>()V

    iput-object v0, p0, Le/j;->E:Lg/a;

    new-instance v0, Landroidx/core/view/x;

    new-instance v1, Le/d;

    invoke-direct {v1, p0}, Le/d;-><init>(Le/j;)V

    invoke-direct {v0, v1}, Landroidx/core/view/x;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Le/j;->F:Landroidx/core/view/x;

    sget-object v0, Lx2/e;->d:Lx2/e$a;

    invoke-virtual {v0, p0}, Lx2/e$a;->a(Lx2/f;)Lx2/e;

    move-result-object v0

    iput-object v0, p0, Le/j;->G:Lx2/e;

    invoke-direct {p0}, Le/j;->Q()Le/j$e;

    move-result-object v1

    iput-object v1, p0, Le/j;->I:Le/j$e;

    new-instance v1, Le/j$i;

    invoke-direct {v1, p0}, Le/j$i;-><init>(Le/j;)V

    invoke-static {v1}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v1

    iput-object v1, p0, Le/j;->J:Li7/n;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Le/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v1, Le/j$g;

    invoke-direct {v1, p0}, Le/j$g;-><init>(Le/j;)V

    iput-object v1, p0, Le/j;->M:Lh/e;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->N:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->O:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->P:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->Q:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->R:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v1, p0, Le/j;->S:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Le/e;

    invoke-direct {v2, p0}, Le/e;-><init>(Le/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Le/f;

    invoke-direct {v2, p0}, Le/f;-><init>(Le/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v1

    new-instance v2, Le/j$a;

    invoke-direct {v2, p0}, Le/j$a;-><init>(Le/j;)V

    invoke-virtual {v1, v2}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    invoke-virtual {v0}, Lx2/e;->c()V

    invoke-static {p0}, Landroidx/lifecycle/L;->c(Lx2/f;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-gt v0, v1, :cond_0

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v0

    new-instance v1, Le/v;

    invoke-direct {v1, p0}, Le/v;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    :cond_0
    invoke-virtual {p0}, Le/j;->p()Lx2/d;

    move-result-object v0

    new-instance v1, Le/g;

    invoke-direct {v1, p0}, Le/g;-><init>(Le/j;)V

    const-string v2, "android:support:activity-result"

    invoke-virtual {v0, v2, v1}, Lx2/d;->h(Ljava/lang/String;Lx2/d$c;)V

    new-instance v0, Le/h;

    invoke-direct {v0, p0}, Le/h;-><init>(Le/j;)V

    invoke-virtual {p0, v0}, Le/j;->O(Lg/b;)V

    new-instance v0, Le/j$h;

    invoke-direct {v0, p0}, Le/j$h;-><init>(Le/j;)V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, Le/j;->V:Li7/n;

    new-instance v0, Le/j$j;

    invoke-direct {v0, p0}, Le/j$j;-><init>(Le/j;)V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, Le/j;->W:Li7/n;

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getLifecycle() returned null in ComponentActivity\'s constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic A(Le/j;)V
    .locals 0

    invoke-static {p0}, Le/j;->V(Le/j;)V

    return-void
.end method

.method public static synthetic B(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le/j;->E(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic C(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le/j;->F(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic D(Le/j;)Landroid/os/Bundle;
    .locals 0

    invoke-static {p0}, Le/j;->G(Le/j;)Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method private static final E(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_0
    return-void
.end method

.method private static final F(Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, Le/j;->E:Lg/a;

    invoke-virtual {p1}, Lg/a;->b()V

    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Le/j;->n()Landroidx/lifecycle/X;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/X;->a()V

    :cond_0
    iget-object p0, p0, Le/j;->I:Le/j$e;

    invoke-interface {p0}, Le/j$e;->s()V

    :cond_1
    return-void
.end method

.method private static final G(Le/j;)Landroid/os/Bundle;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object p0, p0, Le/j;->M:Lh/e;

    invoke-virtual {p0, v0}, Lh/e;->k(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private static final H(Le/j;Landroid/content/Context;)V
    .locals 1

    .prologue
    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/j;->p()Lx2/d;

    move-result-object p1

    const-string v0, "android:support:activity-result"

    invoke-virtual {p1, v0}, Lx2/d;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Le/j;->M:Lh/e;

    invoke-virtual {p0, p1}, Lh/e;->j(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public static final synthetic I(Le/j;Le/x;)V
    .locals 0

    invoke-direct {p0, p1}, Le/j;->M(Le/x;)V

    return-void
.end method

.method public static final synthetic J(Le/j;)V
    .locals 0

    invoke-direct {p0}, Le/j;->R()V

    return-void
.end method

.method public static final synthetic K(Le/j;)Le/j$e;
    .locals 0

    iget-object p0, p0, Le/j;->I:Le/j$e;

    return-object p0
.end method

.method public static final synthetic L(Le/j;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method private final M(Le/x;)V
    .locals 2

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v0

    new-instance v1, Le/i;

    invoke-direct {v1, p1, p0}, Le/i;-><init>(Le/x;Le/j;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/q;)V

    return-void
.end method

.method private static final N(Le/x;Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 1

    .prologue
    const-string v0, "$dispatcher"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    if-ne p3, p2, :cond_0

    sget-object p2, Le/j$b;->a:Le/j$b;

    invoke-virtual {p2, p1}, Le/j$b;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/x;->o(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    return-void
.end method

.method private final Q()Le/j$e;
    .locals 1

    new-instance v0, Le/j$f;

    invoke-direct {v0, p0}, Le/j$f;-><init>(Le/j;)V

    return-object v0
.end method

.method private final R()V
    .locals 1

    .prologue
    iget-object v0, p0, Le/j;->H:Landroidx/lifecycle/X;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/j$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le/j$d;->a()Landroidx/lifecycle/X;

    move-result-object v0

    iput-object v0, p0, Le/j;->H:Landroidx/lifecycle/X;

    :cond_0
    iget-object v0, p0, Le/j;->H:Landroidx/lifecycle/X;

    if-nez v0, :cond_1

    new-instance v0, Landroidx/lifecycle/X;

    invoke-direct {v0}, Landroidx/lifecycle/X;-><init>()V

    iput-object v0, p0, Le/j;->H:Landroidx/lifecycle/X;

    :cond_1
    return-void
.end method

.method private static final V(Le/j;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/j;->U()V

    return-void
.end method

.method public static synthetic y(Le/x;Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le/j;->N(Le/x;Le/j;Landroidx/lifecycle/r;Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public static synthetic z(Le/j;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1}, Le/j;->H(Le/j;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final O(Lg/b;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->E:Lg/a;

    invoke-virtual {v0, p1}, Lg/a;->a(Lg/b;)V

    return-void
.end method

.method public final P(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->P:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public S()Le/t;
    .locals 1

    iget-object v0, p0, Le/j;->J:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/t;

    return-object v0
.end method

.method public T()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window.decorView"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Le/D;->b(Landroid/view/View;Le/A;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Le/C;->a(Landroid/view/View;Le/u;)V

    return-void
.end method

.method public U()V
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final X(Li/a;Lh/b;)Lh/c;
    .locals 1

    const-string v0, "contract"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->M:Lh/e;

    invoke-virtual {p0, p1, v0, p2}, Le/j;->Y(Li/a;Lh/e;Lh/b;)Lh/c;

    move-result-object p1

    return-object p1
.end method

.method public final Y(Li/a;Lh/e;Lh/b;)Lh/c;
    .locals 2

    const-string v0, "contract"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "registry"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "activity_rq#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p0, p1, p3}, Lh/e;->l(Ljava/lang/String;Landroidx/lifecycle/r;Li/a;Lh/b;)Lh/c;

    move-result-object p1

    return-object p1
.end method

.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Le/j;->T()V

    iget-object v0, p0, Le/j;->I:Le/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Le/j$e;->s0(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Le/x;
    .locals 1

    iget-object v0, p0, Le/j;->W:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le/x;

    return-object v0
.end method

.method public final c(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->Q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Landroidx/core/view/z;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {v0, p1}, Landroidx/core/view/x;->f(Landroidx/core/view/z;)V

    return-void
.end method

.method public final e(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->O:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->R:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->N:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public j()Landroidx/lifecycle/V$c;
    .locals 1

    iget-object v0, p0, Le/j;->V:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/V$c;

    return-object v0
.end method

.method public k()Lc2/a;
    .locals 5

    .prologue
    new-instance v0, Lc2/d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lc2/d;-><init>(Lc2/a;ILy7/k;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v1, Landroidx/lifecycle/V$a;->g:Lc2/a$b;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v3

    const-string v4, "application"

    invoke-static {v3, v4}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_0
    sget-object v1, Landroidx/lifecycle/L;->a:Lc2/a$b;

    invoke-virtual {v0, v1, p0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    sget-object v1, Landroidx/lifecycle/L;->b:Lc2/a$b;

    invoke-virtual {v0, v1, p0}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    sget-object v1, Landroidx/lifecycle/L;->c:Lc2/a$b;

    invoke-virtual {v0, v1, v2}, Lc2/d;->c(Lc2/a$b;Ljava/lang/Object;)V

    :cond_2
    return-object v0
.end method

.method public final l(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->R:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final m()Lh/e;
    .locals 1

    iget-object v0, p0, Le/j;->M:Lh/e;

    return-object v0
.end method

.method public n()Landroidx/lifecycle/X;
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Le/j;->R()V

    iget-object v0, p0, Le/j;->H:Landroidx/lifecycle/X;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    iget-object v0, p0, Le/j;->M:Lh/e;

    invoke-virtual {v0, p1, p2, p3}, Lh/e;->e(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Le/j;->b()Le/x;

    move-result-object v0

    invoke-virtual {v0}, Le/x;->l()V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    const-string v0, "newConfig"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Le/j;->N:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    invoke-interface {v1, p1}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    iget-object v0, p0, Le/j;->G:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->d(Landroid/os/Bundle;)V

    iget-object v0, p0, Le/j;->E:Lg/a;

    invoke-virtual {v0, p0}, Lg/a;->c(Landroid/content/Context;)V

    invoke-super {p0, p1}, Landroidx/core/app/f;->onCreate(Landroid/os/Bundle;)V

    sget-object p1, Landroidx/lifecycle/F;->D:Landroidx/lifecycle/F$b;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/F$b;->c(Landroid/app/Activity;)V

    iget p1, p0, Le/j;->K:I

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Le/j;->setContentView(I)V

    :cond_0
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    const-string v0, "menu"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    iget-object p1, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroidx/core/view/x;->b(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    const-string v0, "item"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {p1, p2}, Landroidx/core/view/x;->d(Landroid/view/MenuItem;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Le/j;->T:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/j;->Q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    new-instance v2, Landroidx/core/app/g;

    invoke-direct {v2, p1}, Landroidx/core/app/g;-><init>(Z)V

    invoke-interface {v1, v2}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    .prologue
    const-string v0, "newConfig"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/j;->T:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMultiWindowModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Le/j;->T:Z

    iget-object v0, p0, Le/j;->Q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    new-instance v2, Landroidx/core/app/g;

    invoke-direct {v2, p1, p2}, Landroidx/core/app/g;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Le/j;->T:Z

    throw p1
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    iget-object v0, p0, Le/j;->P:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    invoke-interface {v1, p1}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    const-string v0, "menu"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {v0, p2}, Landroidx/core/view/x;->c(Landroid/view/Menu;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Le/j;->U:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Le/j;->R:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    new-instance v2, Landroidx/core/app/p;

    invoke-direct {v2, p1}, Landroidx/core/app/p;-><init>(Z)V

    invoke-interface {v1, v2}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    .locals 3

    .prologue
    const-string v0, "newConfig"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Le/j;->U:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPictureInPictureModeChanged(ZLandroid/content/res/Configuration;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Le/j;->U:Z

    iget-object v0, p0, Le/j;->R:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    new-instance v2, Landroidx/core/app/p;

    invoke-direct {v2, p1, p2}, Landroidx/core/app/p;-><init>(ZLandroid/content/res/Configuration;)V

    invoke-interface {v1, v2}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Le/j;->U:Z

    throw p1
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    const-string v0, "menu"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    iget-object p1, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {p1, p3}, Landroidx/core/view/x;->e(Landroid/view/Menu;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 3

    .prologue
    const-string v0, "permissions"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->M:Lh/e;

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "androidx.activity.result.contract.extra.PERMISSIONS"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[I)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, p1, v2, v1}, Lh/e;->e(IILandroid/content/Intent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    :cond_0
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-virtual {p0}, Le/j;->W()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Le/j;->H:Landroidx/lifecycle/X;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le/j$d;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Le/j$d;->a()Landroidx/lifecycle/X;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v2, Le/j$d;

    invoke-direct {v2}, Le/j$d;-><init>()V

    invoke-virtual {v2, v0}, Le/j$d;->b(Ljava/lang/Object;)V

    invoke-virtual {v2, v1}, Le/j$d;->c(Landroidx/lifecycle/X;)V

    return-object v2
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const-string v0, "outState"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v0

    instance-of v0, v0, Landroidx/lifecycle/t;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le/j;->u()Landroidx/lifecycle/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$b;->E:Landroidx/lifecycle/k$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->n(Landroidx/lifecycle/k$b;)V

    :cond_0
    invoke-super {p0, p1}, Landroidx/core/app/f;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Le/j;->G:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->e(Landroid/os/Bundle;)V

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 3

    .prologue
    invoke-super {p0, p1}, Landroid/app/Activity;->onTrimMemory(I)V

    iget-object v0, p0, Le/j;->O:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LB1/a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, LB1/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onUserLeaveHint()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V

    iget-object v0, p0, Le/j;->S:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p()Lx2/d;
    .locals 1

    iget-object v0, p0, Le/j;->G:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->b()Lx2/d;

    move-result-object v0

    return-object v0
.end method

.method public final q(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->O:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public reportFullyDrawn()V
    .locals 1

    .prologue
    :try_start_0
    invoke-static {}, LE2/b;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "reportFullyDrawn() for ComponentActivity"

    invoke-static {v0}, LE2/b;->a(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-super {p0}, Landroid/app/Activity;->reportFullyDrawn()V

    invoke-virtual {p0}, Le/j;->S()Le/t;

    move-result-object v0

    invoke-virtual {v0}, Le/t;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, LE2/b;->b()V

    return-void

    :goto_1
    invoke-static {}, LE2/b;->b()V

    throw v0
.end method

.method public s(Landroidx/core/view/z;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->F:Landroidx/core/view/x;

    invoke-virtual {v0, p1}, Landroidx/core/view/x;->a(Landroidx/core/view/z;)V

    return-void
.end method

.method public setContentView(I)V
    .locals 3

    invoke-virtual {p0}, Le/j;->T()V

    iget-object v0, p0, Le/j;->I:Le/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Le/j$e;->s0(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p0}, Le/j;->T()V

    iget-object v0, p0, Le/j;->I:Le/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Le/j$e;->s0(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/app/Activity;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Le/j;->T()V

    iget-object v0, p0, Le/j;->I:Le/j$e;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    const-string v2, "window.decorView"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Le/j$e;->s0(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p6}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;III)V

    return-void
.end method

.method public startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super/range {p0 .. p7}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V

    return-void
.end method

.method public final t(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->N:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    invoke-super {p0}, Landroidx/core/app/f;->u()Landroidx/lifecycle/k;

    move-result-object v0

    return-object v0
.end method

.method public final v(LB1/a;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le/j;->Q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
