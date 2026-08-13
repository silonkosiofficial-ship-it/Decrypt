.class abstract Landroidx/lifecycle/x$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x402
    name = "d"
.end annotation


# instance fields
.field final C:Landroidx/lifecycle/A;

.field D:Z

.field E:I

.field final synthetic F:Landroidx/lifecycle/x;


# direct methods
.method constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/A;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/x$d;->F:Landroidx/lifecycle/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/lifecycle/x$d;->E:I

    iput-object p2, p0, Landroidx/lifecycle/x$d;->C:Landroidx/lifecycle/A;

    return-void
.end method


# virtual methods
.method a(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Landroidx/lifecycle/x$d;->D:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/lifecycle/x$d;->D:Z

    iget-object v0, p0, Landroidx/lifecycle/x$d;->F:Landroidx/lifecycle/x;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->c(I)V

    iget-boolean p1, p0, Landroidx/lifecycle/x$d;->D:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Landroidx/lifecycle/x$d;->F:Landroidx/lifecycle/x;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/x;->e(Landroidx/lifecycle/x$d;)V

    :cond_2
    return-void
.end method

.method b()V
    .locals 0

    return-void
.end method

.method c(Landroidx/lifecycle/r;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method abstract d()Z
.end method
