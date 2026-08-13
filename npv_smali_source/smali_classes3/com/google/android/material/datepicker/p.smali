.class Lcom/google/android/material/datepicker/p;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/p$b;
    }
.end annotation


# instance fields
.field private final d:Lcom/google/android/material/datepicker/a;

.field private final e:Lcom/google/android/material/datepicker/j$m;

.field private final f:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/h;Lcom/google/android/material/datepicker/j$m;)V
    .locals 1

    .prologue
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->h()Lcom/google/android/material/datepicker/n;

    move-result-object p4

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/n;->e(Lcom/google/android/material/datepicker/n;)I

    move-result p2

    if-gtz p2, :cond_2

    invoke-virtual {v0, p4}, Lcom/google/android/material/datepicker/n;->e(Lcom/google/android/material/datepicker/n;)I

    move-result p2

    if-gtz p2, :cond_1

    sget p2, Lcom/google/android/material/datepicker/o;->G:I

    invoke-static {p1}, Lcom/google/android/material/datepicker/j;->Q1(Landroid/content/Context;)I

    move-result p4

    mul-int/2addr p2, p4

    invoke-static {p1}, Lcom/google/android/material/datepicker/l;->b2(Landroid/content/Context;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-static {p1}, Lcom/google/android/material/datepicker/j;->Q1(Landroid/content/Context;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr p2, p1

    iput p2, p0, Lcom/google/android/material/datepicker/p;->f:I

    iput-object p3, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    iput-object p5, p0, Lcom/google/android/material/datepicker/p;->e:Lcom/google/android/material/datepicker/j$m;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$h;->s(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currentPage cannot be after lastPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "firstPage cannot be after currentPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic u(Lcom/google/android/material/datepicker/p;)Lcom/google/android/material/datepicker/j$m;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/p;->e:Lcom/google/android/material/datepicker/j$m;

    return-object p0
.end method


# virtual methods
.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->j()I

    move-result v0

    return v0
.end method

.method public e(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/n;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic j(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lcom/google/android/material/datepicker/p$b;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/p;->y(Lcom/google/android/material/datepicker/p$b;I)V

    return-void
.end method

.method public bridge synthetic l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/p;->z(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/p$b;

    move-result-object p1

    return-object p1
.end method

.method v(I)Lcom/google/android/material/datepicker/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    return-object p1
.end method

.method w(I)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/p;->v(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/n;->u()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method x(Lcom/google/android/material/datepicker/n;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/n;->x(Lcom/google/android/material/datepicker/n;)I

    move-result p1

    return p1
.end method

.method public y(Lcom/google/android/material/datepicker/p$b;I)V
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/n;->w(I)Lcom/google/android/material/datepicker/n;

    move-result-object p2

    iget-object v0, p1, Lcom/google/android/material/datepicker/p$b;->u:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/n;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcom/google/android/material/datepicker/p$b;->v:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    sget v0, Lm4/e;->q:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/material/datepicker/o;->C:Lcom/google/android/material/datepicker/n;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/n;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/o;->o(Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/material/datepicker/o;

    iget-object v1, p0, Lcom/google/android/material/datepicker/p;->d:Lcom/google/android/material/datepicker/a;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2, v1, v2}, Lcom/google/android/material/datepicker/o;-><init>(Lcom/google/android/material/datepicker/n;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/h;)V

    iget p2, p2, Lcom/google/android/material/datepicker/n;->F:I

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_0
    new-instance p2, Lcom/google/android/material/datepicker/p$a;

    invoke-direct {p2, p0, p1}, Lcom/google/android/material/datepicker/p$a;-><init>(Lcom/google/android/material/datepicker/p;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public z(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/p$b;
    .locals 2

    .prologue
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lm4/g;->n:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/material/datepicker/l;->b2(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/recyclerview/widget/RecyclerView$q;

    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/material/datepicker/p;->f:I

    invoke-direct {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$q;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Lcom/google/android/material/datepicker/p$b;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lcom/google/android/material/datepicker/p$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/p$b;

    invoke-direct {p1, p2, v1}, Lcom/google/android/material/datepicker/p$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1
.end method
