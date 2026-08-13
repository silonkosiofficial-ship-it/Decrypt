.class Landroidx/transition/v$b;
.super Landroidx/transition/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Landroidx/transition/v;


# direct methods
.method constructor <init>(Landroidx/transition/v;)V
    .locals 0

    invoke-direct {p0}, Landroidx/transition/s;-><init>()V

    iput-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    return-void
.end method


# virtual methods
.method public a(Landroidx/transition/k;)V
    .locals 1

    .prologue
    iget-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    iget-boolean v0, p1, Landroidx/transition/v;->r0:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/transition/k;->m0()V

    iget-object p1, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/transition/v;->r0:Z

    :cond_0
    return-void
.end method

.method public d(Landroidx/transition/k;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/transition/v$b;->a:Landroidx/transition/v;

    iget v1, v0, Landroidx/transition/v;->q0:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Landroidx/transition/v;->q0:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/v;->r0:Z

    invoke-virtual {v0}, Landroidx/transition/k;->t()V

    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/k;->Z(Landroidx/transition/k$f;)Landroidx/transition/k;

    return-void
.end method
