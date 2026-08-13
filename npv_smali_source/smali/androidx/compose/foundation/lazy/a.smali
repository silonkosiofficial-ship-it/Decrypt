.class public final Landroidx/compose/foundation/lazy/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/d;


# instance fields
.field private a:LV/s0;

.field private b:LV/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    invoke-static {v0}, LV/l1;->a(I)LV/s0;

    move-result-object v1

    iput-object v1, p0, Landroidx/compose/foundation/lazy/a;->a:LV/s0;

    invoke-static {v0}, LV/l1;->a(I)LV/s0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/foundation/lazy/a;->b:LV/s0;

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/d;F)Landroidx/compose/ui/d;
    .locals 8

    iget-object v2, p0, Landroidx/compose/foundation/lazy/a;->a:LV/s0;

    new-instance v7, Landroidx/compose/foundation/lazy/ParentSizeElement;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const-string v4, "fillParentMaxWidth"

    move-object v0, v7

    move v1, p2

    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/lazy/ParentSizeElement;-><init>(FLV/G1;LV/G1;Ljava/lang/String;ILy7/k;)V

    invoke-interface {p1, v7}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(II)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/a;->a:LV/s0;

    invoke-interface {v0, p1}, LV/s0;->i(I)V

    iget-object p1, p0, Landroidx/compose/foundation/lazy/a;->b:LV/s0;

    invoke-interface {p1, p2}, LV/s0;->i(I)V

    return-void
.end method
