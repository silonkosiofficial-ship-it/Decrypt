.class public abstract Landroidx/fragment/app/g;
.super Le/j;
.source "SourceFile"

# interfaces
.implements Landroidx/core/app/b$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/g$a;
    }
.end annotation


# instance fields
.field final Y:Landroidx/fragment/app/i;

.field final Z:Landroidx/lifecycle/t;

.field a0:Z

.field b0:Z

.field c0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le/j;-><init>()V

    new-instance v0, Landroidx/fragment/app/g$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/g$a;-><init>(Landroidx/fragment/app/g;)V

    invoke-static {v0}, Landroidx/fragment/app/i;->b(Landroidx/fragment/app/k;)Landroidx/fragment/app/i;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    new-instance v0, Landroidx/lifecycle/t;

    invoke-direct {v0, p0}, Landroidx/lifecycle/t;-><init>(Landroidx/lifecycle/r;)V

    iput-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g;->c0:Z

    invoke-direct {p0}, Landroidx/fragment/app/g;->g0()V

    return-void
.end method

.method public static synthetic Z(Landroidx/fragment/app/g;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;->k0(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a0(Landroidx/fragment/app/g;Landroid/content/res/Configuration;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;->i0(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public static synthetic b0(Landroidx/fragment/app/g;)Landroid/os/Bundle;
    .locals 0

    invoke-direct {p0}, Landroidx/fragment/app/g;->h0()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Landroidx/fragment/app/g;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/fragment/app/g;->j0(Landroid/content/Intent;)V

    return-void
.end method

.method private g0()V
    .locals 3

    invoke-virtual {p0}, Le/j;->p()Lx2/d;

    move-result-object v0

    new-instance v1, LV1/a;

    invoke-direct {v1, p0}, LV1/a;-><init>(Landroidx/fragment/app/g;)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Lx2/d;->h(Ljava/lang/String;Lx2/d$c;)V

    new-instance v0, LV1/b;

    invoke-direct {v0, p0}, LV1/b;-><init>(Landroidx/fragment/app/g;)V

    invoke-virtual {p0, v0}, Le/j;->i(LB1/a;)V

    new-instance v0, LV1/c;

    invoke-direct {v0, p0}, LV1/c;-><init>(Landroidx/fragment/app/g;)V

    invoke-virtual {p0, v0}, Le/j;->P(LB1/a;)V

    new-instance v0, LV1/d;

    invoke-direct {v0, p0}, LV1/d;-><init>(Landroidx/fragment/app/g;)V

    invoke-virtual {p0, v0}, Le/j;->O(Lg/b;)V

    return-void
.end method

.method private synthetic h0()Landroid/os/Bundle;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/g;->l0()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method private synthetic i0(Landroid/content/res/Configuration;)V
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->m()V

    return-void
.end method

.method private synthetic j0(Landroid/content/Intent;)V
    .locals 0

    iget-object p1, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->m()V

    return-void
.end method

.method private synthetic k0(Landroid/content/Context;)V
    .locals 1

    iget-object p1, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i;->a(Landroidx/fragment/app/f;)V

    return-void
.end method

.method private static m0(Landroidx/fragment/app/n;Landroidx/lifecycle/k$b;)Z
    .locals 5

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/n;->q0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/f;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/fragment/app/f;->C()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/f;->s()Landroidx/fragment/app/n;

    move-result-object v2

    invoke-static {v2, p1}, Landroidx/fragment/app/g;->m0(Landroidx/fragment/app/n;Landroidx/lifecycle/k$b;)Z

    move-result v2

    or-int/2addr v0, v2

    :cond_2
    iget-object v2, v1, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroidx/fragment/app/y;->u()Landroidx/lifecycle/k;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/k;->b()Landroidx/lifecycle/k$b;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v1, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/y;->g(Landroidx/lifecycle/k$b;)V

    move v0, v3

    :cond_3
    iget-object v2, v1, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    invoke-virtual {v2}, Landroidx/lifecycle/t;->b()Landroidx/lifecycle/k$b;

    move-result-object v2

    sget-object v4, Landroidx/lifecycle/k$b;->F:Landroidx/lifecycle/k$b;

    invoke-virtual {v2, v4}, Landroidx/lifecycle/k$b;->g(Landroidx/lifecycle/k$b;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v1, Landroidx/fragment/app/f;->v0:Landroidx/lifecycle/t;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/t;->n(Landroidx/lifecycle/k$b;)V

    move v0, v3

    goto :goto_0

    :cond_4
    return v0
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    return-void
.end method

.method final d0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/i;->n(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    .prologue
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p0, p4}, Landroidx/core/app/f;->w([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g;->a0:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g;->b0:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, Landroidx/fragment/app/g;->c0:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/r;)Landroidx/loader/app/a;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, Landroidx/loader/app/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->l()Landroidx/fragment/app/n;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/fragment/app/n;->U(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public e0()Landroidx/fragment/app/n;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->l()Landroidx/fragment/app/n;

    move-result-object v0

    return-object v0
.end method

.method public f0()Landroidx/loader/app/a;
    .locals 1

    invoke-static {p0}, Landroidx/loader/app/a;->b(Landroidx/lifecycle/r;)Landroidx/loader/app/a;

    move-result-object v0

    return-object v0
.end method

.method l0()V
    .locals 2

    .prologue
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/g;->e0()Landroidx/fragment/app/n;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/k$b;->E:Landroidx/lifecycle/k$b;

    invoke-static {v0, v1}, Landroidx/fragment/app/g;->m0(Landroidx/fragment/app/n;Landroidx/lifecycle/k$b;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method public n0(Landroidx/fragment/app/f;)V
    .locals 0

    return-void
.end method

.method protected o0()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_RESUME:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->h()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Le/j;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v0, Landroidx/lifecycle/k$a;->ON_CREATE:Landroidx/lifecycle/k$a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object p1, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->e()V

    return-void
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/fragment/app/g;->d0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .prologue
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/g;->d0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method protected onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->f()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_DESTROY:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    invoke-super {p0, p1, p2}, Le/j;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/i;->d(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/g;->b0:Z

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->g()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_PAUSE:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method

.method protected onPostResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/g;->o0()V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->m()V

    invoke-super {p0, p1, p2, p3}, Le/j;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method protected onResume()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g;->b0:Z

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->k()Z

    return-void
.end method

.method protected onStart()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->m()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/g;->c0:Z

    iget-boolean v0, p0, Landroidx/fragment/app/g;->a0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g;->a0:Z

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->c()V

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->k()Z

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_START:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->i()V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->m()V

    return-void
.end method

.method protected onStop()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/g;->c0:Z

    invoke-virtual {p0}, Landroidx/fragment/app/g;->l0()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Y:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->j()V

    iget-object v0, p0, Landroidx/fragment/app/g;->Z:Landroidx/lifecycle/t;

    sget-object v1, Landroidx/lifecycle/k$a;->ON_STOP:Landroidx/lifecycle/k$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/t;->i(Landroidx/lifecycle/k$a;)V

    return-void
.end method
