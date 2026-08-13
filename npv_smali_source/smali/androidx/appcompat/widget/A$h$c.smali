.class Landroidx/appcompat/widget/A$h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/A$h;->n(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field final synthetic D:Landroidx/appcompat/widget/A$h;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/A$h;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/A$h$c;->D:Landroidx/appcompat/widget/A$h;

    iput-object p2, p0, Landroidx/appcompat/widget/A$h$c;->C:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/appcompat/widget/A$h$c;->D:Landroidx/appcompat/widget/A$h;

    iget-object v0, v0, Landroidx/appcompat/widget/A$h;->p0:Landroidx/appcompat/widget/A;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/appcompat/widget/A$h$c;->C:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_0
    return-void
.end method
