.class public LJ2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI2/m;


# instance fields
.field private final c:Landroidx/lifecycle/z;

.field private final d:Landroidx/work/impl/utils/futures/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/z;

    invoke-direct {v0}, Landroidx/lifecycle/z;-><init>()V

    iput-object v0, p0, LJ2/c;->c:Landroidx/lifecycle/z;

    invoke-static {}, Landroidx/work/impl/utils/futures/c;->u()Landroidx/work/impl/utils/futures/c;

    move-result-object v0

    iput-object v0, p0, LJ2/c;->d:Landroidx/work/impl/utils/futures/c;

    sget-object v0, LI2/m;->b:LI2/m$b$b;

    invoke-virtual {p0, v0}, LJ2/c;->a(LI2/m$b;)V

    return-void
.end method


# virtual methods
.method public a(LI2/m$b;)V
    .locals 1

    .prologue
    iget-object v0, p0, LJ2/c;->c:Landroidx/lifecycle/z;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/z;->l(Ljava/lang/Object;)V

    instance-of v0, p1, LI2/m$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ2/c;->d:Landroidx/work/impl/utils/futures/c;

    check-cast p1, LI2/m$b$c;

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->q(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, LI2/m$b$a;

    if-eqz v0, :cond_1

    check-cast p1, LI2/m$b$a;

    iget-object v0, p0, LJ2/c;->d:Landroidx/work/impl/utils/futures/c;

    invoke-virtual {p1}, LI2/m$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/work/impl/utils/futures/c;->r(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
