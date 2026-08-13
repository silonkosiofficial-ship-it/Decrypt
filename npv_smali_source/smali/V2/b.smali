.class public final LV2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/d;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Landroid/view/Window;

.field private final c:Landroidx/core/view/X0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Landroid/view/Window;)V
    .locals 1

    .prologue
    const-string v0, "view"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV2/b;->a:Landroid/view/View;

    iput-object p2, p0, LV2/b;->b:Landroid/view/Window;

    if-eqz p2, :cond_0

    invoke-static {p2, p1}, Landroidx/core/view/k0;->a(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/X0;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LV2/b;->c:Landroidx/core/view/X0;

    return-void
.end method


# virtual methods
.method public a(JZLx7/l;)V
    .locals 2

    .prologue
    const-string v0, "transformColorForLightContent"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, LV2/b;->e(Z)V

    iget-object v0, p0, LV2/b;->b:Landroid/view/Window;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_2

    iget-object p3, p0, LV2/b;->c:Landroidx/core/view/X0;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroidx/core/view/X0;->b()Z

    move-result p3

    const/4 v1, 0x1

    if-ne p3, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    invoke-interface {p4, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/y0;

    invoke-virtual {p1}, Lo0/y0;->w()J

    move-result-wide p1

    :cond_2
    :goto_0
    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :goto_1
    return-void
.end method

.method public b(JZZLx7/l;)V
    .locals 1

    .prologue
    const-string v0, "transformColorForLightContent"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, LV2/b;->d(Z)V

    invoke-virtual {p0, p4}, LV2/b;->c(Z)V

    iget-object p4, p0, LV2/b;->b:Landroid/view/Window;

    if-nez p4, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p3, :cond_2

    iget-object p3, p0, LV2/b;->c:Landroidx/core/view/X0;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroidx/core/view/X0;->a()Z

    move-result p3

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Lo0/y0;->i(J)Lo0/y0;

    move-result-object p1

    invoke-interface {p5, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo0/y0;

    invoke-virtual {p1}, Lo0/y0;->w()J

    move-result-wide p1

    :cond_2
    :goto_0
    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {p4, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    :goto_1
    return-void
.end method

.method public c(Z)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    iget-object v0, p0, LV2/b;->b:Landroid/view/Window;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, LV2/a;->a(Landroid/view/Window;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, LV2/b;->c:Landroidx/core/view/X0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/core/view/X0;->c(Z)V

    :goto_0
    return-void
.end method

.method public e(Z)V
    .locals 1

    .prologue
    iget-object v0, p0, LV2/b;->c:Landroidx/core/view/X0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/core/view/X0;->d(Z)V

    :goto_0
    return-void
.end method
