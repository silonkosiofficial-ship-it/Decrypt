.class final Lu3/q;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field final C:Lv3/v;

.field D:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lv3/v;

    invoke-direct {v0, p1, p2}, Lv3/v;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lu3/q;->C:Lv3/v;

    invoke-virtual {v0, p3}, Lv3/v;->o(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lv3/v;->n(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lu3/q;->D:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lu3/q;->C:Lv3/v;

    invoke-virtual {v0, p1}, Lv3/v;->m(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
