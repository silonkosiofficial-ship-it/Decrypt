.class public abstract Lm1/m;
.super Lm1/e;
.source "SourceFile"


# instance fields
.field private G0:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm1/e;-><init>(II)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public W0()V
    .locals 1

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, Lm1/e;->W0()V

    return-void
.end method

.method public Z0(Le1/c;)V
    .locals 4

    .prologue
    invoke-super {p0, p1}, Lm1/e;->Z0(Le1/c;)V

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    invoke-virtual {v2, p1}, Lm1/e;->Z0(Le1/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a2(Lm1/e;)V
    .locals 2

    .prologue
    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.WidgetContainer"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/m;

    invoke-virtual {v0, p1}, Lm1/m;->f2(Lm1/e;)V

    :cond_0
    invoke-virtual {p1, p0}, Lm1/e;->I1(Lm1/e;)V

    return-void
.end method

.method public final varargs b2([Lm1/e;)V
    .locals 3

    .prologue
    const-string v0, "widgets"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {p0, v2}, Lm1/m;->a2(Lm1/e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c2()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final d2()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public abstract e2()V
.end method

.method public final f2(Lm1/e;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lm1/e;->W0()V

    return-void
.end method

.method public final g2()V
    .locals 1

    iget-object v0, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final h2(Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lm1/m;->G0:Ljava/util/ArrayList;

    return-void
.end method
