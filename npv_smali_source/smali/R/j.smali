.class public final LR/j;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field private final C:I

.field private final D:Ljava/util/List;

.field private final E:Ljava/util/List;

.field private final F:LR/l;

.field private G:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x5

    iput v0, p0, LR/j;->C:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LR/j;->D:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LR/j;->E:Ljava/util/List;

    new-instance v2, LR/l;

    invoke-direct {v2}, LR/l;-><init>()V

    iput-object v2, p0, LR/j;->F:LR/l;

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    new-instance v2, LR/n;

    invoke-direct {v2, p1}, LR/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput p1, p0, LR/j;->G:I

    sget p1, Lh0/l;->J:I

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(LR/k;)V
    .locals 2

    .prologue
    invoke-interface {p1}, LR/k;->i0()V

    iget-object v0, p0, LR/j;->F:LR/l;

    invoke-virtual {v0, p1}, LR/l;->b(LR/k;)LR/n;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LR/n;->d()V

    iget-object v1, p0, LR/j;->F:LR/l;

    invoke-virtual {v1, p1}, LR/l;->c(LR/k;)V

    iget-object p1, p0, LR/j;->E:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b(LR/k;)LR/n;
    .locals 3

    .prologue
    iget-object v0, p0, LR/j;->F:LR/l;

    invoke-virtual {v0, p1}, LR/l;->b(LR/k;)LR/n;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LR/j;->E:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->K(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/n;

    if-nez v0, :cond_4

    iget v0, p0, LR/j;->G:I

    iget-object v1, p0, LR/j;->D:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    if-le v0, v1, :cond_1

    new-instance v0, LR/n;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LR/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, LR/j;->D:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, LR/j;->D:Ljava/util/List;

    iget v1, p0, LR/j;->G:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LR/n;

    iget-object v1, p0, LR/j;->F:LR/l;

    invoke-virtual {v1, v0}, LR/l;->a(LR/n;)LR/k;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1}, LR/k;->i0()V

    iget-object v2, p0, LR/j;->F:LR/l;

    invoke-virtual {v2, v1}, LR/l;->c(LR/k;)V

    invoke-virtual {v0}, LR/n;->d()V

    :cond_2
    :goto_0
    iget v1, p0, LR/j;->G:I

    iget v2, p0, LR/j;->C:I

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_3

    add-int/lit8 v1, v1, 0x1

    :goto_1
    iput v1, p0, LR/j;->G:I

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    goto :goto_1

    :cond_4
    :goto_2
    iget-object v1, p0, LR/j;->F:LR/l;

    invoke-virtual {v1, p1, v0}, LR/l;->d(LR/k;LR/n;)V

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public requestLayout()V
    .locals 0

    return-void
.end method
