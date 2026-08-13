.class Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/fragment/app/m;

.field private final b:Landroidx/fragment/app/t;

.field private final c:Landroidx/fragment/app/f;

.field private d:Z

.field private e:I


# direct methods
.method constructor <init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Landroidx/fragment/app/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/s;->e:I

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iput-object p2, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iput-object p3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    return-void
.end method

.method constructor <init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Landroidx/fragment/app/f;Landroidx/fragment/app/r;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    const/4 v1, -0x1

    iput v1, p0, Landroidx/fragment/app/s;->e:I

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iput-object p2, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iput-object p3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 p1, 0x0

    iput-object p1, p3, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    iput-object p1, p3, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    iput v0, p3, Landroidx/fragment/app/f;->U:I

    iput-boolean v0, p3, Landroidx/fragment/app/f;->R:Z

    iput-boolean v0, p3, Landroidx/fragment/app/f;->N:Z

    iget-object p2, p3, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    if-eqz p2, :cond_0

    iget-object p2, p2, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    iput-object p1, p3, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    iget-object p1, p4, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    :goto_1
    iput-object p1, p3, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    goto :goto_2

    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    goto :goto_1

    :goto_2
    return-void
.end method

.method constructor <init>(Landroidx/fragment/app/m;Landroidx/fragment/app/t;Ljava/lang/ClassLoader;Landroidx/fragment/app/j;Landroidx/fragment/app/r;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/s;->e:I

    iput-object p1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iput-object p2, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {p5, p4, p3}, Landroidx/fragment/app/r;->a(Landroidx/fragment/app/j;Ljava/lang/ClassLoader;)Landroidx/fragment/app/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 p2, 0x2

    invoke-static {p2}, Landroidx/fragment/app/n;->E0(I)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Instantiated fragment "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    nop

    :cond_0
    return-void
.end method

.method private l(Landroid/view/View;)Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-ne p1, v0, :cond_1

    return v1

    :cond_1
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private q()Landroid/os/Bundle;
    .locals 4

    .prologue
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/f;->j1(Landroid/os/Bundle;)V

    iget-object v1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Landroidx/fragment/app/m;->j(Landroidx/fragment/app/f;Landroid/os/Bundle;Z)V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/s;->s()V

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_2
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    const-string v2, "android:view_state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_3
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    if-eqz v1, :cond_5

    if-nez v0, :cond_4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_4
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    const-string v2, "android:view_registry_state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_5
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v1, Landroidx/fragment/app/f;->m0:Z

    if-nez v1, :cond_7

    if-nez v0, :cond_6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :cond_6
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v1, Landroidx/fragment/app/f;->m0:Z

    const-string v2, "android:user_visible_hint"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_7
    return-object v0
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ACTIVITY_CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f;->P0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/m;->a(Landroidx/fragment/app/f;Landroid/os/Bundle;Z)V

    return-void
.end method

.method b()V
    .locals 3

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->j(Landroidx/fragment/app/f;)I

    move-result v0

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v1, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    iget-object v1, v1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method c()V
    .locals 6

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto ATTACHED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    const-string v3, " that does not belong to this FragmentManager!"

    const-string v4, " declared target fragment "

    const-string v5, "Fragment "

    if-eqz v1, :cond_2

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iget-object v1, v1, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/t;->n(Ljava/lang/String;)Landroidx/fragment/app/s;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v3, v1, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    iget-object v3, v3, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iput-object v3, v1, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    iput-object v2, v1, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    move-object v2, v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v0, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->n(Ljava/lang/String;)Landroidx/fragment/app/s;

    move-result-object v2

    if-eqz v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Landroidx/fragment/app/s;->m()V

    :cond_5
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->r0()Landroidx/fragment/app/k;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->u0()Landroidx/fragment/app/f;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->g(Landroidx/fragment/app/f;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->Q0()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->b(Landroidx/fragment/app/f;Z)V

    return-void
.end method

.method d()I
    .locals 9

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-nez v1, :cond_0

    iget v0, v0, Landroidx/fragment/app/f;->C:I

    return v0

    :cond_0
    iget v1, p0, Landroidx/fragment/app/s;->e:I

    sget-object v2, Landroidx/fragment/app/s$b;->a:[I

    iget-object v0, v0, Landroidx/fragment/app/f;->u0:Landroidx/lifecycle/k$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    const/4 v2, 0x5

    const/4 v3, -0x1

    const/4 v4, 0x3

    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v0, v7, :cond_4

    if-eq v0, v6, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v5, :cond_1

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_2
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_0

    :cond_3
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_4
    :goto_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v8, v0, Landroidx/fragment/app/f;->Q:Z

    if-eqz v8, :cond_7

    iget-boolean v8, v0, Landroidx/fragment/app/f;->R:Z

    if-eqz v8, :cond_5

    iget v0, p0, Landroidx/fragment/app/s;->e:I

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_7

    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_5
    iget v8, p0, Landroidx/fragment/app/s;->e:I

    if-ge v8, v5, :cond_6

    iget v0, v0, Landroidx/fragment/app/f;->C:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_1

    :cond_6
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_7
    :goto_1
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v0, v0, Landroidx/fragment/app/f;->N:Z

    if-nez v0, :cond_8

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v8, v0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v8, :cond_9

    invoke-virtual {v0}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v0

    invoke-static {v8, v0}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/fragment/app/A;->l(Landroidx/fragment/app/s;)Landroidx/fragment/app/A$e$b;

    move-result-object v0

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    :goto_2
    sget-object v8, Landroidx/fragment/app/A$e$b;->D:Landroidx/fragment/app/A$e$b;

    if-ne v0, v8, :cond_a

    const/4 v0, 0x6

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_a
    sget-object v8, Landroidx/fragment/app/A$e$b;->E:Landroidx/fragment/app/A$e$b;

    if-ne v0, v8, :cond_b

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v4, v0, Landroidx/fragment/app/f;->O:Z

    if-eqz v4, :cond_d

    invoke-virtual {v0}, Landroidx/fragment/app/f;->c0()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    goto :goto_3

    :cond_c
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_d
    :goto_3
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v3, v0, Landroidx/fragment/app/f;->l0:Z

    if-eqz v3, :cond_e

    iget v0, v0, Landroidx/fragment/app/f;->C:I

    if-ge v0, v2, :cond_e

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_e
    invoke-static {v6}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_f

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "computeExpectedState() of "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " for "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "FragmentManager"

    nop

    :cond_f
    return v1
.end method

.method e()V
    .locals 4

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v0, Landroidx/fragment/app/f;->s0:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v2, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroidx/fragment/app/m;->h(Landroidx/fragment/app/f;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f;->T0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v1, v2, v3}, Landroidx/fragment/app/m;->c(Landroidx/fragment/app/f;Landroid/os/Bundle;Z)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f;->r1(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v1, 0x1

    iput v1, v0, Landroidx/fragment/app/f;->C:I

    :goto_0
    return-void
.end method

.method f()V
    .locals 7

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v0, v0, Landroidx/fragment/app/f;->Q:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto CREATE_VIEW: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v2}, Landroidx/fragment/app/f;->Z0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v3, v2, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v3, :cond_2

    goto/16 :goto_1

    :cond_2
    iget v3, v2, Landroidx/fragment/app/f;->a0:I

    if-eqz v3, :cond_6

    const/4 v4, -0x1

    if-eq v3, v4, :cond_5

    iget-object v2, v2, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    invoke-virtual {v2}, Landroidx/fragment/app/n;->n0()LV1/e;

    move-result-object v2

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v3, v3, Landroidx/fragment/app/f;->a0:I

    invoke-virtual {v2, v3}, LV1/e;->h(I)Landroid/view/View;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    if-nez v3, :cond_4

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v4, v2, Landroidx/fragment/app/f;->S:Z

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    :try_start_0
    invoke-virtual {v2}, Landroidx/fragment/app/f;->N()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v1, v1, Landroidx/fragment/app/f;->a0:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "unknown"

    :goto_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No view found for id 0x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v3, v3, Landroidx/fragment/app/f;->a0:I

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") for fragment "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    instance-of v2, v3, Landroidx/fragment/app/FragmentContainerView;

    if-nez v2, :cond_7

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-static {v2, v3}, LW1/c;->i(Landroidx/fragment/app/f;Landroid/view/ViewGroup;)V

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot create fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for a container view with no id"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v3, 0x0

    :cond_7
    :goto_1
    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v3, v2, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    iget-object v4, v2, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v3, v4}, Landroidx/fragment/app/f;->V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    const/4 v2, 0x2

    if-eqz v0, :cond_c

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v5, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    sget v6, LU1/b;->a:I

    invoke-virtual {v5, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-eqz v3, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/s;->b()V

    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v3, v0, Landroidx/fragment/app/f;->c0:Z

    if-eqz v3, :cond_9

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/X;->Q(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-static {v0}, Landroidx/core/view/X;->k0(Landroid/view/View;)V

    goto :goto_2

    :cond_a
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    new-instance v3, Landroidx/fragment/app/s$a;

    invoke-direct {v3, p0, v0}, Landroidx/fragment/app/s$a;-><init>(Landroidx/fragment/app/s;Landroid/view/View;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :goto_2
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->m1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v5, v3, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object v6, v3, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v3, v5, v6, v4}, Landroidx/fragment/app/m;->m(Landroidx/fragment/app/f;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v3, v3, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    move-result v3

    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v4, v3}, Landroidx/fragment/app/f;->z1(F)V

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v4, v3, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v4, :cond_c

    if-nez v0, :cond_c

    iget-object v0, v3, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v3, v0}, Landroidx/fragment/app/f;->w1(Landroid/view/View;)V

    invoke-static {v2}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v3

    if-eqz v3, :cond_b

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestFocus: Saved focused view "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " for Fragment "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_b
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput v2, v0, Landroidx/fragment/app/f;->C:I

    return-void
.end method

.method g()V
    .locals 6

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v0, Landroidx/fragment/app/f;->O:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/f;->c0()Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v5, v4, Landroidx/fragment/app/f;->P:Z

    if-nez v5, :cond_2

    iget-object v5, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iget-object v4, v4, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v5, v4, v1}, Landroidx/fragment/app/t;->B(Ljava/lang/String;Landroidx/fragment/app/r;)Landroidx/fragment/app/r;

    :cond_2
    if-nez v0, :cond_5

    iget-object v4, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v4}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v4, v5}, Landroidx/fragment/app/q;->t(Landroidx/fragment/app/f;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v0, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/t;->f(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v1, v0, Landroidx/fragment/app/f;->e0:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v0, v1, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    :cond_4
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput v2, v0, Landroidx/fragment/app/f;->C:I

    goto/16 :goto_4

    :cond_5
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v4, v4, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    instance-of v5, v4, Landroidx/lifecycle/Y;

    if-eqz v5, :cond_6

    iget-object v3, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v3}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/fragment/app/q;->q()Z

    move-result v3

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v5

    instance-of v5, v5, Landroid/app/Activity;

    if-eqz v5, :cond_7

    invoke-virtual {v4}, Landroidx/fragment/app/k;->o()Landroid/content/Context;

    move-result-object v4

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v4

    xor-int/2addr v3, v4

    :cond_7
    :goto_2
    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v0, v0, Landroidx/fragment/app/f;->P:Z

    if-eqz v0, :cond_9

    :cond_8
    if-eqz v3, :cond_a

    :cond_9
    iget-object v0, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v0

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v3}, Landroidx/fragment/app/q;->i(Landroidx/fragment/app/f;)V

    :cond_a
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->W0()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v3, v2}, Landroidx/fragment/app/m;->d(Landroidx/fragment/app/f;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v0}, Landroidx/fragment/app/t;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/s;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v2

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v3, v3, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    iget-object v4, v2, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v3, v2, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    iput-object v1, v2, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    goto :goto_3

    :cond_c
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v1, :cond_d

    iget-object v2, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v2, v1}, Landroidx/fragment/app/t;->f(Ljava/lang/String;)Landroidx/fragment/app/f;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/f;->J:Landroidx/fragment/app/f;

    :cond_d
    iget-object v0, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v0, p0}, Landroidx/fragment/app/t;->s(Landroidx/fragment/app/s;)V

    :goto_4
    return-void
.end method

.method h()V
    .locals 3

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v1, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->X0()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->n(Landroidx/fragment/app/f;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v1, 0x0

    iput-object v1, v0, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    iput-object v1, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iput-object v1, v0, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    iget-object v0, v0, Landroidx/fragment/app/f;->x0:Landroidx/lifecycle/z;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->n(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-boolean v2, v0, Landroidx/fragment/app/f;->R:Z

    return-void
.end method

.method i()V
    .locals 5

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    const-string v2, "FragmentManager"

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "movefrom ATTACHED: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1}, Landroidx/fragment/app/f;->Y0()V

    iget-object v1, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroidx/fragment/app/m;->e(Landroidx/fragment/app/f;Z)V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v3, -0x1

    iput v3, v1, Landroidx/fragment/app/f;->C:I

    const/4 v3, 0x0

    iput-object v3, v1, Landroidx/fragment/app/f;->W:Landroidx/fragment/app/k;

    iput-object v3, v1, Landroidx/fragment/app/f;->Y:Landroidx/fragment/app/f;

    iput-object v3, v1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    iget-boolean v3, v1, Landroidx/fragment/app/f;->O:Z

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Landroidx/fragment/app/f;->c0()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v1}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v1

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/q;->t(Landroidx/fragment/app/f;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "initState called for fragment: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->Y()V

    :cond_3
    return-void
.end method

.method j()V
    .locals 5

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v0, Landroidx/fragment/app/f;->Q:Z

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Landroidx/fragment/app/f;->R:Z

    if-eqz v1, :cond_2

    iget-boolean v0, v0, Landroidx/fragment/app/f;->T:Z

    if-nez v0, :cond_2

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto CREATE_VIEW: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f;->Z0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Landroidx/fragment/app/f;->V0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    sget v3, LU1/b;->a:I

    invoke-virtual {v2, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v2, v0, Landroidx/fragment/app/f;->c0:Z

    if-eqz v2, :cond_1

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->m1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v3, v2, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    iget-object v4, v2, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/fragment/app/m;->m(Landroidx/fragment/app/f;Landroid/view/View;Landroid/os/Bundle;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v1, 0x2

    iput v1, v0, Landroidx/fragment/app/f;->C:I

    :cond_2
    return-void
.end method

.method k()Landroidx/fragment/app/f;
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    return-object v0
.end method

.method m()V
    .locals 9

    .prologue
    iget-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    const/4 v1, 0x2

    const-string v2, "FragmentManager"

    if-eqz v0, :cond_1

    invoke-static {v1}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/s;->k()Landroidx/fragment/app/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Landroidx/fragment/app/s;->d:Z

    move v4, v0

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/s;->d()I

    move-result v5

    iget-object v6, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v7, v6, Landroidx/fragment/app/f;->C:I

    const/4 v8, 0x3

    if-eq v5, v7, :cond_9

    if-le v5, v7, :cond_3

    add-int/lit8 v7, v7, 0x1

    packed-switch v7, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    invoke-virtual {p0}, Landroidx/fragment/app/s;->p()V

    goto/16 :goto_2

    :catchall_0
    move-exception v1

    goto/16 :goto_4

    :pswitch_1
    const/4 v4, 0x6

    iput v4, v6, Landroidx/fragment/app/f;->C:I

    goto/16 :goto_2

    :pswitch_2
    invoke-virtual {p0}, Landroidx/fragment/app/s;->u()V

    goto/16 :goto_2

    :pswitch_3
    iget-object v4, v6, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v4, :cond_2

    iget-object v4, v6, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v4, :cond_2

    invoke-virtual {v6}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v4

    iget-object v5, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v5, v5, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v5

    invoke-static {v5}, Landroidx/fragment/app/A$e$c;->g(I)Landroidx/fragment/app/A$e$c;

    move-result-object v5

    invoke-virtual {v4, v5, p0}, Landroidx/fragment/app/A;->b(Landroidx/fragment/app/A$e$c;Landroidx/fragment/app/s;)V

    :cond_2
    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v5, 0x4

    iput v5, v4, Landroidx/fragment/app/f;->C:I

    goto/16 :goto_2

    :pswitch_4
    invoke-virtual {p0}, Landroidx/fragment/app/s;->a()V

    goto/16 :goto_2

    :pswitch_5
    invoke-virtual {p0}, Landroidx/fragment/app/s;->j()V

    invoke-virtual {p0}, Landroidx/fragment/app/s;->f()V

    goto/16 :goto_2

    :pswitch_6
    invoke-virtual {p0}, Landroidx/fragment/app/s;->e()V

    goto/16 :goto_2

    :pswitch_7
    invoke-virtual {p0}, Landroidx/fragment/app/s;->c()V

    goto/16 :goto_2

    :cond_3
    add-int/lit8 v7, v7, -0x1

    packed-switch v7, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {p0}, Landroidx/fragment/app/s;->n()V

    goto/16 :goto_2

    :pswitch_9
    const/4 v4, 0x5

    iput v4, v6, Landroidx/fragment/app/f;->C:I

    goto/16 :goto_2

    :pswitch_a
    invoke-virtual {p0}, Landroidx/fragment/app/s;->v()V

    goto/16 :goto_2

    :pswitch_b
    invoke-static {v8}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "movefrom ACTIVITY_CREATED: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    nop

    :cond_4
    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v5, v4, Landroidx/fragment/app/f;->P:Z

    if-eqz v5, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/s;->r()V

    goto :goto_1

    :cond_5
    iget-object v5, v4, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v5, :cond_6

    iget-object v4, v4, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    if-nez v4, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/s;->s()V

    :cond_6
    :goto_1
    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v5, v4, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v5, :cond_7

    iget-object v5, v4, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v5, :cond_7

    invoke-virtual {v4}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v4

    invoke-static {v5, v4}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v4

    invoke-virtual {v4, p0}, Landroidx/fragment/app/A;->d(Landroidx/fragment/app/s;)V

    :cond_7
    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput v8, v4, Landroidx/fragment/app/f;->C:I

    goto :goto_2

    :pswitch_c
    iput-boolean v0, v6, Landroidx/fragment/app/f;->R:Z

    iput v1, v6, Landroidx/fragment/app/f;->C:I

    goto :goto_2

    :pswitch_d
    invoke-virtual {p0}, Landroidx/fragment/app/s;->h()V

    iget-object v4, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput v3, v4, Landroidx/fragment/app/f;->C:I

    goto :goto_2

    :pswitch_e
    iget-boolean v4, v6, Landroidx/fragment/app/f;->P:Z

    if-eqz v4, :cond_8

    iget-object v4, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iget-object v5, v6, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroidx/fragment/app/t;->q(Ljava/lang/String;)Landroidx/fragment/app/r;

    move-result-object v4

    if-nez v4, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/s;->r()V

    :cond_8
    invoke-virtual {p0}, Landroidx/fragment/app/s;->g()V

    goto :goto_2

    :pswitch_f
    invoke-virtual {p0}, Landroidx/fragment/app/s;->i()V

    :goto_2
    move v4, v3

    goto/16 :goto_0

    :cond_9
    if-nez v4, :cond_c

    const/4 v1, -0x1

    if-ne v7, v1, :cond_c

    iget-boolean v1, v6, Landroidx/fragment/app/f;->O:Z

    if-eqz v1, :cond_c

    invoke-virtual {v6}, Landroidx/fragment/app/f;->c0()Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v1, v1, Landroidx/fragment/app/f;->P:Z

    if-nez v1, :cond_c

    invoke-static {v8}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cleaning up state of never attached fragment: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_a
    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v1}, Landroidx/fragment/app/t;->p()Landroidx/fragment/app/q;

    move-result-object v1

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v3}, Landroidx/fragment/app/q;->i(Landroidx/fragment/app/f;)V

    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    invoke-virtual {v1, p0}, Landroidx/fragment/app/t;->s(Landroidx/fragment/app/s;)V

    invoke-static {v8}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initState called for fragment: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    :cond_b
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v1}, Landroidx/fragment/app/f;->Y()V

    :cond_c
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v2, v1, Landroidx/fragment/app/f;->q0:Z

    if-eqz v2, :cond_10

    iget-object v2, v1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-eqz v2, :cond_e

    iget-object v2, v1, Landroidx/fragment/app/f;->j0:Landroid/view/ViewGroup;

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Landroidx/fragment/app/f;->H()Landroidx/fragment/app/n;

    move-result-object v1

    invoke-static {v2, v1}, Landroidx/fragment/app/A;->n(Landroid/view/ViewGroup;Landroidx/fragment/app/n;)Landroidx/fragment/app/A;

    move-result-object v1

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v2, v2, Landroidx/fragment/app/f;->c0:Z

    if-eqz v2, :cond_d

    invoke-virtual {v1, p0}, Landroidx/fragment/app/A;->c(Landroidx/fragment/app/s;)V

    goto :goto_3

    :cond_d
    invoke-virtual {v1, p0}, Landroidx/fragment/app/A;->e(Landroidx/fragment/app/s;)V

    :cond_e
    :goto_3
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v1, Landroidx/fragment/app/f;->V:Landroidx/fragment/app/n;

    if-eqz v2, :cond_f

    invoke-virtual {v2, v1}, Landroidx/fragment/app/n;->C0(Landroidx/fragment/app/f;)V

    :cond_f
    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-boolean v0, v1, Landroidx/fragment/app/f;->q0:Z

    iget-boolean v2, v1, Landroidx/fragment/app/f;->c0:Z

    invoke-virtual {v1, v2}, Landroidx/fragment/app/f;->y0(Z)V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->X:Landroidx/fragment/app/n;

    invoke-virtual {v1}, Landroidx/fragment/app/n;->G()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_10
    iput-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    return-void

    :goto_4
    iput-boolean v0, p0, Landroidx/fragment/app/s;->d:Z

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method n()V
    .locals 3

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom RESUMED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->e1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->f(Landroidx/fragment/app/f;Z)V

    return-void
.end method

.method o(Ljava/lang/ClassLoader;)V
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const-string v1, "android:view_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const-string v1, "android:view_registry_state"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const-string v1, "android:target_state"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, p1, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const-string v1, "android:target_req_state"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p1, Landroidx/fragment/app/f;->L:I

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, p1, Landroidx/fragment/app/f;->G:Ljava/lang/Boolean;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p1, Landroidx/fragment/app/f;->m0:Z

    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v0, 0x0

    iput-object v0, p1, Landroidx/fragment/app/f;->G:Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    iget-object v0, p1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    const-string v2, "android:user_visible_hint"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Landroidx/fragment/app/f;->m0:Z

    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-boolean v0, p1, Landroidx/fragment/app/f;->m0:Z

    if-nez v0, :cond_3

    iput-boolean v1, p1, Landroidx/fragment/app/f;->l0:Z

    :cond_3
    return-void
.end method

.method p()V
    .locals 5

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    const-string v1, "FragmentManager"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "moveto RESUMED: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->B()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Landroidx/fragment/app/s;->l(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    move-result v2

    const/4 v3, 0x2

    invoke-static {v3}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "requestFocus: Restoring focused view "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_1

    const-string v0, "succeeded"

    goto :goto_0

    :cond_1
    const-string v0, "failed"

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " on Fragment "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " resulting in focused view "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    nop

    :cond_2
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/f;->w1(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->i1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroidx/fragment/app/m;->i(Landroidx/fragment/app/f;Z)V

    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v1, v0, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    iput-object v1, v0, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    iput-object v1, v0, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    return-void
.end method

.method r()V
    .locals 4

    .prologue
    new-instance v0, Landroidx/fragment/app/r;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-direct {v0, v1}, Landroidx/fragment/app/r;-><init>(Landroidx/fragment/app/f;)V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v2, v1, Landroidx/fragment/app/f;->C:I

    const/4 v3, -0x1

    if-le v2, v3, :cond_1

    iget-object v2, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    if-nez v2, :cond_1

    invoke-direct {p0}, Landroidx/fragment/app/s;->q()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    if-eqz v2, :cond_2

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    :cond_0
    iget-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->K:Ljava/lang/String;

    const-string v3, "android:target_state"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget v1, v1, Landroidx/fragment/app/f;->L:I

    if-eqz v1, :cond_2

    iget-object v2, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    const-string v3, "android:target_req_state"

    invoke-virtual {v2, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    iget-object v1, v1, Landroidx/fragment/app/f;->D:Landroid/os/Bundle;

    iput-object v1, v0, Landroidx/fragment/app/r;->O:Landroid/os/Bundle;

    :cond_2
    :goto_0
    iget-object v1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/t;

    iget-object v2, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v2, v2, Landroidx/fragment/app/f;->H:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/t;->B(Ljava/lang/String;Landroidx/fragment/app/r;)Landroidx/fragment/app/r;

    return-void
.end method

.method s()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v0, v0, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Saving view state for fragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " with view "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_1
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->k0:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-lez v1, :cond_2

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v0, v1, Landroidx/fragment/app/f;->E:Landroid/util/SparseArray;

    :cond_2
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iget-object v1, v1, Landroidx/fragment/app/f;->w0:Landroidx/fragment/app/y;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/y;->f(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    iput-object v0, v1, Landroidx/fragment/app/f;->F:Landroid/os/Bundle;

    :cond_3
    return-void
.end method

.method t(I)V
    .locals 0

    iput p1, p0, Landroidx/fragment/app/s;->e:I

    return-void
.end method

.method u()V
    .locals 3

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "moveto STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->k1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->k(Landroidx/fragment/app/f;Z)V

    return-void
.end method

.method v()V
    .locals 3

    .prologue
    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/n;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "movefrom STARTED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    nop

    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    invoke-virtual {v0}, Landroidx/fragment/app/f;->l1()V

    iget-object v0, p0, Landroidx/fragment/app/s;->a:Landroidx/fragment/app/m;

    iget-object v1, p0, Landroidx/fragment/app/s;->c:Landroidx/fragment/app/f;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/m;->l(Landroidx/fragment/app/f;Z)V

    return-void
.end method
