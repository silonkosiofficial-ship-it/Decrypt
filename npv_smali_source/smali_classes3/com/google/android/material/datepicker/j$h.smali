.class Lcom/google/android/material/datepicker/j$h;
.super Landroidx/core/view/a;
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
.field final synthetic d:Lcom/google/android/material/datepicker/j;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/j;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/j$h;->d:Lcom/google/android/material/datepicker/j;

    invoke-direct {p0}, Landroidx/core/view/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;LC1/B;)V
    .locals 1

    .prologue
    invoke-super {p0, p1, p2}, Landroidx/core/view/a;->g(Landroid/view/View;LC1/B;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/j$h;->d:Lcom/google/android/material/datepicker/j;

    invoke-static {p1}, Lcom/google/android/material/datepicker/j;->I1(Lcom/google/android/material/datepicker/j;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/j$h;->d:Lcom/google/android/material/datepicker/j;

    sget v0, Lm4/h;->u:I

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/fragment/app/f;->T(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/j$h;->d:Lcom/google/android/material/datepicker/j;

    sget v0, Lm4/h;->s:I

    goto :goto_0

    :goto_1
    invoke-virtual {p2, p1}, LC1/B;->y0(Ljava/lang/CharSequence;)V

    return-void
.end method
