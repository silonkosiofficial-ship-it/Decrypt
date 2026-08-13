.class public abstract Landroidx/fragment/app/k;
.super LV1/e;
.source "SourceFile"


# instance fields
.field private final C:Landroid/app/Activity;

.field private final D:Landroid/content/Context;

.field private final E:Landroid/os/Handler;

.field private final F:I

.field final G:Landroidx/fragment/app/n;


# direct methods
.method constructor <init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 1

    invoke-direct {p0}, LV1/e;-><init>()V

    new-instance v0, Landroidx/fragment/app/o;

    invoke-direct {v0}, Landroidx/fragment/app/o;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/k;->G:Landroidx/fragment/app/n;

    iput-object p1, p0, Landroidx/fragment/app/k;->C:Landroid/app/Activity;

    const-string p1, "context == null"

    invoke-static {p2, p1}, LB1/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Landroidx/fragment/app/k;->D:Landroid/content/Context;

    const-string p1, "handler == null"

    invoke-static {p3, p1}, LB1/i;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    iput-object p1, p0, Landroidx/fragment/app/k;->E:Landroid/os/Handler;

    iput p4, p0, Landroidx/fragment/app/k;->F:I

    return-void
.end method

.method constructor <init>(Landroidx/fragment/app/g;)V
    .locals 2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, p1, v0, v1}, Landroidx/fragment/app/k;-><init>(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V

    return-void
.end method


# virtual methods
.method public abstract A()V
.end method

.method k()Landroid/app/Activity;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k;->C:Landroid/app/Activity;

    return-object v0
.end method

.method o()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k;->D:Landroid/content/Context;

    return-object v0
.end method

.method public r()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/k;->E:Landroid/os/Handler;

    return-object v0
.end method

.method public abstract w(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
.end method

.method public abstract x()Ljava/lang/Object;
.end method

.method public abstract y()Landroid/view/LayoutInflater;
.end method

.method public z(Landroidx/fragment/app/f;Landroid/content/Intent;ILandroid/os/Bundle;)V
    .locals 0

    .prologue
    const/4 p1, -0x1

    if-ne p3, p1, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/k;->D:Landroid/content/Context;

    invoke-static {p1, p2, p4}, Landroidx/core/content/a;->j(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
