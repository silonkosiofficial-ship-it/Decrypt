.class Landroidx/core/view/X0$d;
.super Landroidx/core/view/X0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/X0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field final a:Landroidx/core/view/X0;

.field final b:Landroid/view/WindowInsetsController;

.field final c:Landroidx/core/view/L;

.field private final d:Lr/Y;

.field protected e:Landroid/view/Window;


# direct methods
.method constructor <init>(Landroid/view/Window;Landroidx/core/view/X0;Landroidx/core/view/L;)V
    .locals 1

    invoke-static {p1}, Landroidx/core/view/Y0;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroidx/core/view/X0$d;-><init>(Landroid/view/WindowInsetsController;Landroidx/core/view/X0;Landroidx/core/view/L;)V

    iput-object p1, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    return-void
.end method

.method constructor <init>(Landroid/view/WindowInsetsController;Landroidx/core/view/X0;Landroidx/core/view/L;)V
    .locals 1

    invoke-direct {p0}, Landroidx/core/view/X0$e;-><init>()V

    new-instance v0, Lr/Y;

    invoke-direct {v0}, Lr/Y;-><init>()V

    iput-object v0, p0, Landroidx/core/view/X0$d;->d:Lr/Y;

    iput-object p1, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    iput-object p2, p0, Landroidx/core/view/X0$d;->a:Landroidx/core/view/X0;

    iput-object p3, p0, Landroidx/core/view/X0$d;->c:Landroidx/core/view/L;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    iget-object v0, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {v0}, Landroidx/core/view/a1;->a(Landroid/view/WindowInsetsController;)I

    move-result v0

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public b()Z
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    iget-object v0, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {v0}, Landroidx/core/view/a1;->a(Landroid/view/WindowInsetsController;)I

    move-result v0

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public c(Z)V
    .locals 2

    .prologue
    const/16 v0, 0x10

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/core/view/X0$d;->f(I)V

    :cond_0
    iget-object p1, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {p1, v0, v0}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Landroidx/core/view/X0$d;->g(I)V

    :cond_2
    iget-object p1, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method public d(Z)V
    .locals 2

    .prologue
    const/16 v0, 0x2000

    const/16 v1, 0x8

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/core/view/X0$d;->f(I)V

    :cond_0
    iget-object p1, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    invoke-static {p1, v1, v1}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    if-eqz p1, :cond_2

    invoke-virtual {p0, v0}, Landroidx/core/view/X0$d;->g(I)V

    :cond_2
    iget-object p1, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, Landroidx/core/view/Z0;->a(Landroid/view/WindowInsetsController;II)V

    :goto_0
    return-void
.end method

.method e(I)V
    .locals 1

    .prologue
    and-int/lit8 v0, p1, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/view/X0$d;->c:Landroidx/core/view/L;

    invoke-virtual {v0}, Landroidx/core/view/L;->b()V

    :cond_0
    iget-object v0, p0, Landroidx/core/view/X0$d;->b:Landroid/view/WindowInsetsController;

    and-int/lit8 p1, p1, -0x9

    invoke-static {v0, p1}, Landroidx/core/view/O;->a(Landroid/view/WindowInsetsController;I)V

    return-void
.end method

.method protected f(I)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method protected g(I)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/X0$d;->e:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
