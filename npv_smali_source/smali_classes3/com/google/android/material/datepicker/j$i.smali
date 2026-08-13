.class Lcom/google/android/material/datepicker/j$i;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/j;->K1(Landroid/view/View;Lcom/google/android/material/datepicker/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/material/datepicker/p;

.field final synthetic b:Lcom/google/android/material/button/MaterialButton;

.field final synthetic c:Lcom/google/android/material/datepicker/j;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/j;Lcom/google/android/material/datepicker/p;Lcom/google/android/material/button/MaterialButton;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/j$i;->c:Lcom/google/android/material/datepicker/j;

    iput-object p2, p0, Lcom/google/android/material/datepicker/j$i;->a:Lcom/google/android/material/datepicker/p;

    iput-object p3, p0, Lcom/google/android/material/datepicker/j$i;->b:Lcom/google/android/material/button/MaterialButton;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .prologue
    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/google/android/material/datepicker/j$i;->b:Lcom/google/android/material/button/MaterialButton;

    invoke-virtual {p2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/material/datepicker/j$i;->c:Lcom/google/android/material/datepicker/j;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/j;->S1()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    if-gez p2, :cond_0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->c2()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e2()I

    move-result p1

    :goto_0
    iget-object p2, p0, Lcom/google/android/material/datepicker/j$i;->c:Lcom/google/android/material/datepicker/j;

    iget-object p3, p0, Lcom/google/android/material/datepicker/j$i;->a:Lcom/google/android/material/datepicker/p;

    invoke-virtual {p3, p1}, Lcom/google/android/material/datepicker/p;->v(I)Lcom/google/android/material/datepicker/n;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/google/android/material/datepicker/j;->J1(Lcom/google/android/material/datepicker/j;Lcom/google/android/material/datepicker/n;)Lcom/google/android/material/datepicker/n;

    iget-object p2, p0, Lcom/google/android/material/datepicker/j$i;->b:Lcom/google/android/material/button/MaterialButton;

    iget-object p3, p0, Lcom/google/android/material/datepicker/j$i;->a:Lcom/google/android/material/datepicker/p;

    invoke-virtual {p3, p1}, Lcom/google/android/material/datepicker/p;->w(I)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
