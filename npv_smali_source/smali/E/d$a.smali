.class final LE/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/d;->b(LF0/j;)LE/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LF0/j;


# direct methods
.method constructor <init>(LF0/j;)V
    .locals 0

    iput-object p1, p0, LE/d$a;->C:LF0/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 2

    .prologue
    iget-object p3, p0, LE/d$a;->C:LF0/j;

    invoke-static {p3}, LF0/l;->a(LF0/j;)Landroid/view/View;

    move-result-object p3

    invoke-static {p1}, LD0/u;->e(LD0/t;)J

    move-result-wide v0

    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/i;

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0, v1}, Ln0/i;->t(J)Ln0/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-static {p1}, LE/d;->a(Ln0/i;)Landroid/graphics/Rect;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p3, p1, p2}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;Z)Z

    :cond_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
