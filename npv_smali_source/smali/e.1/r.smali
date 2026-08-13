.class public Le/r;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/r;
.implements Le/A;
.implements Lx2/f;


# instance fields
.field private C:Landroidx/lifecycle/t;

.field private final D:Lx2/e;

.field private final E:Le/x;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    sget-object p1, Lx2/e;->d:Lx2/e$a;

    invoke-virtual {p1, p0}, Lx2/e$a;->a(Lx2/f;)Lx2/e;

    move-result-object p1

    iput-object p1, p0, Le/r;->D:Lx2/e;

    new-instance p1, Le/x;

    new-instance p2, Le/q;

    invoke-direct {p2, p0}, Le/q;-><init>(Le/r;)V

    invoke-direct {p1, p2}, Le/x;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, Le/r;->E:Le/x;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Le/r;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public static synthetic a(Le/r;)V
    .locals 0

    invoke-static {p0}, Le/r;->e(Le/r;)V

    return-void
.end method

.method private final c()Landroidx/lifecycle/t;
    .locals 1

    .prologue
    iget-object v0, p0, Le/r;->C:Landroidx/lifecycle/t;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Le/r;->C:Landroidx/lifecycle/t;

    :cond_0
    return-object v0
.end method

.method private static final e(Le/r;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/r;->d()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Le/x;
    .locals 1

    iget-object v0, p0, Le/r;->E:Le/x;

    return-object v0
.end method

.method public d()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window!!.decorView"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Le/D;->b(Landroid/view/View;Le/A;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    iget-object v0, p0, Le/r;->E:Le/x;

    invoke-virtual {v0}, Le/x;->l()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Le/r;->E:Le/x;

    invoke-static {p0}, Le/p;->a(Le/r;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v1

    const-string v2, "onBackInvokedDispatcher"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le/x;->o(Landroid/window/OnBackInvokedDispatcher;)V

    :cond_0
    iget-object v0, p0, Le/r;->D:Lx2/e;

    invoke-virtual {v0, p1}, Lx2/e;->d(Landroid/os/Bundle;)V

    invoke-direct {p0}, Le/r;->c()Landroidx/lifecycle/t;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Bundle;
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "super.onSaveInstanceState()"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Le/r;->D:Lx2/e;

    invoke-virtual {v1, v0}, Lx2/e;->e(Landroid/os/Bundle;)V

    return-object v0
.end method

.method protected onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-direct {p0}, Le/r;->c()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-direct {p0}, Le/r;->c()Landroidx/lifecycle/t;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le/r;->C:Landroidx/lifecycle/t;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public p()Lx2/d;
    .locals 1

    iget-object v0, p0, Le/r;->D:Lx2/e;

    invoke-virtual {v0}, Lx2/e;->b()Lx2/d;

    move-result-object v0

    return-object v0
.end method

.method public setContentView(I)V
    .locals 0

    invoke-virtual {p0}, Le/r;->d()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/r;->d()V

    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le/r;->d()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public u()Landroidx/lifecycle/k;
    .locals 1

    invoke-direct {p0}, Le/r;->c()Landroidx/lifecycle/t;

    move-result-object v0

    return-object v0
.end method
