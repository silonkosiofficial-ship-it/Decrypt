.class final Landroidx/compose/ui/input/rotary/b;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LB0/a;


# instance fields
.field private P:Lx7/l;

.field private Q:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/l;Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->P:Lx7/l;

    iput-object p2, p0, Landroidx/compose/ui/input/rotary/b;->Q:Lx7/l;

    return-void
.end method


# virtual methods
.method public final T1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->P:Lx7/l;

    return-void
.end method

.method public final U1(Lx7/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/input/rotary/b;->Q:Lx7/l;

    return-void
.end method

.method public W(LB0/b;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/b;->P:Lx7/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public r0(LB0/b;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/input/rotary/b;->Q:Lx7/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
