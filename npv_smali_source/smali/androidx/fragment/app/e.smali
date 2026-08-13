.class public Landroidx/fragment/app/e;
.super Landroidx/fragment/app/f;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private F0:Landroid/os/Handler;

.field private G0:Ljava/lang/Runnable;

.field private H0:Landroid/content/DialogInterface$OnCancelListener;

.field private I0:Landroid/content/DialogInterface$OnDismissListener;

.field private J0:I

.field private K0:I

.field private L0:Z

.field private M0:Z

.field private N0:I

.field private O0:Z

.field private P0:Landroidx/lifecycle/A;

.field private Q0:Landroid/app/Dialog;

.field private R0:Z

.field private S0:Z

.field private T0:Z

.field private U0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/f;-><init>()V

    new-instance v0, Landroidx/fragment/app/e$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/e$a;-><init>(Landroidx/fragment/app/e;)V

    iput-object v0, p0, Landroidx/fragment/app/e;->G0:Ljava/lang/Runnable;

    new-instance v0, Landroidx/fragment/app/e$b;

    invoke-direct {v0, p0}, Landroidx/fragment/app/e$b;-><init>(Landroidx/fragment/app/e;)V

    iput-object v0, p0, Landroidx/fragment/app/e;->H0:Landroid/content/DialogInterface$OnCancelListener;

    new-instance v0, Landroidx/fragment/app/e$c;

    invoke-direct {v0, p0}, Landroidx/fragment/app/e$c;-><init>(Landroidx/fragment/app/e;)V

    iput-object v0, p0, Landroidx/fragment/app/e;->I0:Landroid/content/DialogInterface$OnDismissListener;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/e;->J0:I

    iput v0, p0, Landroidx/fragment/app/e;->K0:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/e;->L0:Z

    iput-boolean v1, p0, Landroidx/fragment/app/e;->M0:Z

    const/4 v1, -0x1

    iput v1, p0, Landroidx/fragment/app/e;->N0:I

    new-instance v1, Landroidx/fragment/app/e$d;

    invoke-direct {v1, p0}, Landroidx/fragment/app/e$d;-><init>(Landroidx/fragment/app/e;)V

    iput-object v1, p0, Landroidx/fragment/app/e;->P0:Landroidx/lifecycle/A;

    iput-boolean v0, p0, Landroidx/fragment/app/e;->U0:Z

    return-void
.end method

.method static synthetic D1(Landroidx/fragment/app/e;)Landroid/app/Dialog;
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    return-object p0
.end method

.method static synthetic E1(Landroidx/fragment/app/e;)Landroid/content/DialogInterface$OnDismissListener;
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/e;->I0:Landroid/content/DialogInterface$OnDismissListener;

    return-object p0
.end method

.method static synthetic F1(Landroidx/fragment/app/e;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/fragment/app/e;->M0:Z

    return p0
.end method

.method private G1(ZZZ)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/e;->T0:Z

    iget-object v1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Landroidx/fragment/app/e;->F0:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Landroidx/fragment/app/e;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/fragment/app/e;->F0:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/fragment/app/e;->G0:Ljava/lang/Runnable;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/e;->R0:Z

    iget p2, p0, Landroidx/fragment/app/e;->N0:I

    if-ltz p2, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object p1

    iget p2, p0, Landroidx/fragment/app/e;->N0:I

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/n;->Y0(II)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object p2

    iget p3, p0, Landroidx/fragment/app/e;->N0:I

    invoke-virtual {p2, p3, v0, p1}, Landroidx/fragment/app/n;->W0(IIZ)V

    :goto_1
    const/4 p1, -0x1

    iput p1, p0, Landroidx/fragment/app/e;->N0:I

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/u;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroidx/fragment/app/u;->o(Z)Landroidx/fragment/app/u;

    invoke-virtual {p2, p0}, Landroidx/fragment/app/u;->l(Landroidx/fragment/app/f;)Landroidx/fragment/app/u;

    if-eqz p3, :cond_5

    invoke-virtual {p2}, Landroidx/fragment/app/u;->h()V

    goto :goto_2

    :cond_5
    if-eqz p1, :cond_6

    invoke-virtual {p2}, Landroidx/fragment/app/u;->g()I

    goto :goto_2

    :cond_6
    invoke-virtual {p2}, Landroidx/fragment/app/u;->f()I

    :goto_2
    return-void
.end method

.method private M1(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/e;->M0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Landroidx/fragment/app/e;->U0:Z

    if-nez v0, :cond_3

    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroidx/fragment/app/e;->O0:Z

    invoke-virtual {p0, p1}, Landroidx/fragment/app/e;->J1(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    iget-boolean v2, p0, Landroidx/fragment/app/e;->M0:Z

    if-eqz v2, :cond_2

    iget v2, p0, Landroidx/fragment/app/e;->J0:I

    invoke-virtual {p0, p1, v2}, Landroidx/fragment/app/e;->P1(Landroid/app/Dialog;I)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->t()Landroid/content/Context;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v2, p1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    iget-boolean v2, p0, Landroidx/fragment/app/e;->L0:Z

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    iget-object v2, p0, Landroidx/fragment/app/e;->H0:Landroid/content/DialogInterface$OnCancelListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    iget-object v2, p0, Landroidx/fragment/app/e;->I0:Landroid/content/DialogInterface$OnDismissListener;

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v1, p0, Landroidx/fragment/app/e;->U0:Z

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    iput-boolean v0, p0, Landroidx/fragment/app/e;->O0:Z

    goto :goto_3

    :goto_2
    iput-boolean v0, p0, Landroidx/fragment/app/e;->O0:Z

    throw p1

    :cond_3
    :goto_3
    return-void
.end method


# virtual methods
.method public H1()Landroid/app/Dialog;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    return-object v0
.end method

.method public I1()I
    .locals 1

    iget v0, p0, Landroidx/fragment/app/e;->K0:I

    return v0
.end method

.method public J1(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .prologue
    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/n;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onCreateDialog called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    nop

    :cond_0
    new-instance p1, Le/r;

    invoke-virtual {p0}, Landroidx/fragment/app/f;->p1()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/e;->I1()I

    move-result v1

    invoke-direct {p1, v0, v1}, Le/r;-><init>(Landroid/content/Context;I)V

    return-object p1
.end method

.method public K0(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->K0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Landroidx/fragment/app/e;->J0:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Landroidx/fragment/app/e;->K0:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Landroidx/fragment/app/e;->L0:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Landroidx/fragment/app/e;->M0:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Landroidx/fragment/app/e;->N0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method K1(I)Landroid/view/View;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public L0()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroidx/fragment/app/f;->L0()V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/e;->R0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    invoke-static {v0, p0}, Landroidx/lifecycle/a0;->b(Landroid/view/View;Landroidx/lifecycle/Y;)V

    invoke-static {v0, p0}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    :cond_0
    return-void
.end method

.method L1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/fragment/app/e;->U0:Z

    return v0
.end method

.method public M0()V
    .locals 1

    .prologue
    invoke-super {p0}, Landroidx/fragment/app/f;->M0()V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public final N1()Landroid/app/Dialog;
    .locals 3

    .prologue
    invoke-virtual {p0}, Landroidx/fragment/app/e;->H1()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DialogFragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " does not have a Dialog."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public O0(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->O0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public O1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/fragment/app/e;->M0:Z

    return-void
.end method

.method public P1(Landroid/app/Dialog;I)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    const/16 v1, 0x18

    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    return-void
.end method

.method public Q1(Landroidx/fragment/app/n;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/e;->T0:Z

    invoke-virtual {p1}, Landroidx/fragment/app/n;->m()Landroidx/fragment/app/u;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/fragment/app/u;->o(Z)Landroidx/fragment/app/u;

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/u;->d(Landroidx/fragment/app/f;Ljava/lang/String;)Landroidx/fragment/app/u;

    invoke-virtual {p1}, Landroidx/fragment/app/u;->f()I

    return-void
.end method

.method V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/f;->V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method f()LV1/e;
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/f;->f()LV1/e;

    move-result-object v0

    new-instance v1, Landroidx/fragment/app/e$e;

    invoke-direct {v1, p0, v0}, Landroidx/fragment/app/e$e;-><init>(Landroidx/fragment/app/e;LV1/e;)V

    return-object v1
.end method

.method public i0(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/f;->i0(Landroid/os/Bundle;)V

    return-void
.end method

.method public l0(Landroid/content/Context;)V
    .locals 1

    .prologue
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->l0(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/fragment/app/f;->W()Landroidx/lifecycle/x;

    move-result-object p1

    iget-object v0, p0, Landroidx/fragment/app/e;->P0:Landroidx/lifecycle/A;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/x;->i(Landroidx/lifecycle/A;)V

    iget-boolean p1, p0, Landroidx/fragment/app/e;->T0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/e;->S0:Z

    :cond_0
    return-void
.end method

.method public o0(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->o0(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/e;->F0:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/f;->a0:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/e;->M0:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/e;->J0:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/e;->K0:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/e;->L0:Z

    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Landroidx/fragment/app/e;->M0:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/e;->M0:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/e;->N0:I

    :cond_1
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    iget-boolean p1, p0, Landroidx/fragment/app/e;->R0:Z

    if-nez p1, :cond_1

    const/4 p1, 0x3

    invoke-static {p1}, Landroidx/fragment/app/n;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onDismiss called for DialogFragment "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FragmentManager"

    nop

    :cond_0
    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, v0, v0, p1}, Landroidx/fragment/app/e;->G1(ZZZ)V

    :cond_1
    return-void
.end method

.method public v0()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroidx/fragment/app/f;->v0()V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/e;->R0:Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/e;->U0:Z

    :cond_1
    return-void
.end method

.method public w0()V
    .locals 2

    .prologue
    invoke-super {p0}, Landroidx/fragment/app/f;->w0()V

    iget-boolean v0, p0, Landroidx/fragment/app/e;->T0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/e;->S0:Z

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/f;->W()Landroidx/lifecycle/x;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/e;->P0:Landroidx/lifecycle/A;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->m(Landroidx/lifecycle/A;)V

    return-void
.end method

.method public x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 4

    .prologue
    invoke-super {p0, p1}, Landroidx/fragment/app/f;->x0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/fragment/app/e;->M0:Z

    const/4 v2, 0x2

    const-string v3, "FragmentManager"

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Landroidx/fragment/app/e;->O0:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/fragment/app/e;->M1(Landroid/os/Bundle;)V

    invoke-static {v2}, Landroidx/fragment/app/n;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "get layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from dialog context"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    nop

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/e;->Q0:Landroid/app/Dialog;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    invoke-static {v2}, Landroidx/fragment/app/n;->E0(I)Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getting layout inflater for DialogFragment "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean v1, p0, Landroidx/fragment/app/e;->M0:Z

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mShowsDialog = false: "

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    nop

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCreatingDialog = true: "

    goto :goto_1

    :cond_5
    :goto_2
    return-object v0
.end method
