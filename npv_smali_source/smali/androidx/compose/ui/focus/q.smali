.class final Landroidx/compose/ui/focus/q;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements Lm0/m;


# instance fields
.field private P:Landroidx/compose/ui/focus/n;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/focus/n;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/q;->P:Landroidx/compose/ui/focus/n;

    return-void
.end method


# virtual methods
.method public D1()V
    .locals 1

    invoke-super {p0}, Landroidx/compose/ui/d$c;->D1()V

    iget-object v0, p0, Landroidx/compose/ui/focus/q;->P:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->e()LX/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LX/b;->d(Ljava/lang/Object;)Z

    return-void
.end method

.method public E1()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/q;->P:Landroidx/compose/ui/focus/n;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/n;->e()LX/b;

    move-result-object v0

    invoke-virtual {v0, p0}, LX/b;->A(Ljava/lang/Object;)Z

    invoke-super {p0}, Landroidx/compose/ui/d$c;->E1()V

    return-void
.end method

.method public final T1()Landroidx/compose/ui/focus/n;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/q;->P:Landroidx/compose/ui/focus/n;

    return-object v0
.end method

.method public final U1(Landroidx/compose/ui/focus/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/q;->P:Landroidx/compose/ui/focus/n;

    return-void
.end method
