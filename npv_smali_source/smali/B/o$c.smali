.class final LB/o$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/o;->a(LB/D;Lx7/l;LV/n;I)Lx7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LV/G1;

.field final synthetic E:LB/D;

.field final synthetic F:Landroidx/compose/foundation/lazy/a;


# direct methods
.method constructor <init>(LV/G1;LB/D;Landroidx/compose/foundation/lazy/a;)V
    .locals 0

    iput-object p1, p0, LB/o$c;->D:LV/G1;

    iput-object p2, p0, LB/o$c;->E:LB/D;

    iput-object p3, p0, LB/o$c;->F:Landroidx/compose/foundation/lazy/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LB/n;
    .locals 5

    iget-object v0, p0, LB/o$c;->D:LV/G1;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LB/k;

    new-instance v1, LD/J;

    iget-object v2, p0, LB/o$c;->E:LB/D;

    invoke-virtual {v2}, LB/D;->y()LE7/i;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LD/J;-><init>(LE7/i;LD/o;)V

    new-instance v2, LB/n;

    iget-object v3, p0, LB/o$c;->E:LB/D;

    iget-object v4, p0, LB/o$c;->F:Landroidx/compose/foundation/lazy/a;

    invoke-direct {v2, v3, v0, v4, v1}, LB/n;-><init>(LB/D;LB/k;Landroidx/compose/foundation/lazy/a;Landroidx/compose/foundation/lazy/layout/c;)V

    return-object v2
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB/o$c;->a()LB/n;

    move-result-object v0

    return-object v0
.end method
