.class Lcom/google/android/material/datepicker/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/j;->K1(Landroid/view/View;Lcom/google/android/material/datepicker/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Lcom/google/android/material/datepicker/p;

.field final synthetic D:Lcom/google/android/material/datepicker/j;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/j;Lcom/google/android/material/datepicker/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/j$a;->D:Lcom/google/android/material/datepicker/j;

    iput-object p2, p0, Lcom/google/android/material/datepicker/j$a;->C:Lcom/google/android/material/datepicker/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    iget-object p1, p0, Lcom/google/android/material/datepicker/j$a;->D:Lcom/google/android/material/datepicker/j;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/j;->S1()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->e2()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/datepicker/j$a;->D:Lcom/google/android/material/datepicker/j;

    iget-object v1, p0, Lcom/google/android/material/datepicker/j$a;->C:Lcom/google/android/material/datepicker/p;

    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/p;->v(I)Lcom/google/android/material/datepicker/n;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/j;->V1(Lcom/google/android/material/datepicker/n;)V

    :cond_0
    return-void
.end method
