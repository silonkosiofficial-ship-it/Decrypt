.class Lcom/google/android/material/datepicker/p$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/p;->y(Lcom/google/android/material/datepicker/p$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

.field final synthetic D:Lcom/google/android/material/datepicker/p;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/p;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/p$a;->D:Lcom/google/android/material/datepicker/p;

    iput-object p2, p0, Lcom/google/android/material/datepicker/p$a;->C:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .prologue
    iget-object p1, p0, Lcom/google/android/material/datepicker/p$a;->C:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object p1

    invoke-virtual {p1, p3}, Lcom/google/android/material/datepicker/o;->p(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/p$a;->D:Lcom/google/android/material/datepicker/p;

    invoke-static {p1}, Lcom/google/android/material/datepicker/p;->u(Lcom/google/android/material/datepicker/p;)Lcom/google/android/material/datepicker/j$m;

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/material/datepicker/p$a;->C:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/o;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/google/android/material/datepicker/o;->d(I)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-interface {p1, p2, p3}, Lcom/google/android/material/datepicker/j$m;->a(J)V

    :cond_0
    return-void
.end method
