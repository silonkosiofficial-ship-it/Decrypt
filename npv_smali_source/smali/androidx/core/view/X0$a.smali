.class abstract Landroidx/core/view/X0$a;
.super Landroidx/core/view/X0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/view/X0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field protected final a:Landroid/view/Window;

.field private final b:Landroidx/core/view/L;


# direct methods
.method constructor <init>(Landroid/view/Window;Landroidx/core/view/L;)V
    .locals 0

    invoke-direct {p0}, Landroidx/core/view/X0$e;-><init>()V

    iput-object p1, p0, Landroidx/core/view/X0$a;->a:Landroid/view/Window;

    iput-object p2, p0, Landroidx/core/view/X0$a;->b:Landroidx/core/view/L;

    return-void
.end method

.method private h(I)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Landroidx/core/view/X0$a;->b:Landroidx/core/view/L;

    invoke-virtual {p1}, Landroidx/core/view/L;->b()V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/core/view/X0$a;->i(I)V

    return-void

    :cond_2
    const/4 p1, 0x4

    invoke-virtual {p0, p1}, Landroidx/core/view/X0$a;->i(I)V

    const/16 p1, 0x400

    invoke-virtual {p0, p1}, Landroidx/core/view/X0$a;->j(I)V

    return-void
.end method


# virtual methods
.method e(I)V
    .locals 2

    .prologue
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_1

    and-int v1, p1, v0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, v0}, Landroidx/core/view/X0$a;->h(I)V

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method protected f(I)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/X0$a;->a:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    or-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method protected g(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/X0$a;->a:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->addFlags(I)V

    return-void
.end method

.method protected i(I)V
    .locals 2

    iget-object v0, p0, Landroidx/core/view/X0$a;->a:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method protected j(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/view/X0$a;->a:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method
