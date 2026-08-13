.class final Landroidx/compose/ui/platform/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/k;


# instance fields
.field private final C:LV/q0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, LV/J0;->a(F)LV/q0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/L0;->C:LV/q0;

    return-void
.end method


# virtual methods
.method public D(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/k$a;->a(Lh0/k;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public a(F)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/L0;->C:LV/q0;

    invoke-interface {v0, p1}, LV/q0;->h(F)V

    return-void
.end method

.method public synthetic getKey()Lm7/i$c;
    .locals 1

    invoke-static {p0}, Lh0/j;->a(Lh0/k;)Lm7/i$c;

    move-result-object v0

    return-object v0
.end method

.method public i(Lm7/i$c;)Lm7/i$b;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->b(Lh0/k;Lm7/i$c;)Lm7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public n0()F
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/platform/L0;->C:LV/q0;

    invoke-interface {v0}, LV/S;->b()F

    move-result v0

    return v0
.end method

.method public o0(Lm7/i;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->d(Lh0/k;Lm7/i;)Lm7/i;

    move-result-object p1

    return-object p1
.end method

.method public y0(Lm7/i$c;)Lm7/i;
    .locals 0

    invoke-static {p0, p1}, Lh0/k$a;->c(Lh0/k;Lm7/i$c;)Lm7/i;

    move-result-object p1

    return-object p1
.end method
