.class Lcom/google/android/material/datepicker/A;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/A$a;
    }
.end annotation


# instance fields
.field private final d:Lcom/google/android/material/datepicker/j;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/j;)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    return-void
.end method


# virtual methods
.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/j;->M1()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->m()I

    move-result v0

    return v0
.end method

.method public bridge synthetic j(Landroidx/recyclerview/widget/RecyclerView$D;I)V
    .locals 0

    check-cast p1, Lcom/google/android/material/datepicker/A$a;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/A;->w(Lcom/google/android/material/datepicker/A$a;I)V

    return-void
.end method

.method public bridge synthetic l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$D;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/A;->x(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/A$a;

    move-result-object p1

    return-object p1
.end method

.method u(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/j;->M1()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/n;->E:I

    sub-int/2addr p1, v0

    return p1
.end method

.method v(I)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/j;->M1()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->l()Lcom/google/android/material/datepicker/n;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/n;->E:I

    add-int/2addr v0, p1

    return v0
.end method

.method public w(Lcom/google/android/material/datepicker/A$a;I)V
    .locals 6

    .prologue
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/A;->v(I)I

    move-result p2

    iget-object v0, p1, Lcom/google/android/material/datepicker/A$a;->u:Landroid/widget/TextView;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const-string v2, "%d"

    invoke-static {v1, v2, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcom/google/android/material/datepicker/A$a;->u:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/android/material/datepicker/f;->e(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/j;->N1()Lcom/google/android/material/datepicker/c;

    move-result-object p1

    invoke-static {}, Lcom/google/android/material/datepicker/z;->i()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    if-ne v0, p2, :cond_0

    iget-object p1, p1, Lcom/google/android/material/datepicker/c;->f:Lcom/google/android/material/datepicker/b;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lcom/google/android/material/datepicker/c;->d:Lcom/google/android/material/datepicker/b;

    :goto_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/A;->d:Lcom/google/android/material/datepicker/j;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/j;->P1()Lcom/google/android/material/datepicker/d;

    const/4 p1, 0x0

    throw p1
.end method

.method public x(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/A$a;
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lm4/g;->p:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance p2, Lcom/google/android/material/datepicker/A$a;

    invoke-direct {p2, p1}, Lcom/google/android/material/datepicker/A$a;-><init>(Landroid/widget/TextView;)V

    return-object p2
.end method
