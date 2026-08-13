.class final LH/P$c$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH/P$c;->a(Landroidx/compose/ui/d;LV/n;I)Landroidx/compose/ui/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LH/Q;


# direct methods
.method constructor <init>(LH/Q;)V
    .locals 0

    iput-object p1, p0, LH/P$c$a;->D:LH/Q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(F)Ljava/lang/Float;
    .locals 2

    .prologue
    iget-object v0, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {v0}, LH/Q;->d()F

    move-result v0

    add-float/2addr v0, p1

    iget-object v1, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {v1}, LH/Q;->c()F

    move-result v1

    cmpl-float v1, v0, v1

    if-lez v1, :cond_0

    iget-object p1, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {p1}, LH/Q;->c()F

    move-result p1

    iget-object v0, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {v0}, LH/Q;->d()F

    move-result v0

    sub-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    iget-object p1, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {p1}, LH/Q;->d()F

    move-result p1

    neg-float p1, p1

    :cond_1
    :goto_0
    iget-object v0, p0, LH/P$c$a;->D:LH/Q;

    invoke-virtual {v0}, LH/Q;->d()F

    move-result v1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, LH/Q;->h(F)V

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, LH/P$c$a;->a(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
