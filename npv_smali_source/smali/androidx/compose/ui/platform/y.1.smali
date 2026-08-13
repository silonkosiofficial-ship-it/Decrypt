.class public final Landroidx/compose/ui/platform/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field final synthetic C:Ljava/util/Comparator;

.field final synthetic D:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;Ljava/util/Comparator;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/y;->C:Ljava/util/Comparator;

    iput-object p2, p0, Landroidx/compose/ui/platform/y;->D:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->C:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/y;->D:Ljava/util/Comparator;

    check-cast p1, LK0/o;

    invoke-virtual {p1}, LK0/o;->q()LF0/J;

    move-result-object p1

    check-cast p2, LK0/o;

    invoke-virtual {p2}, LK0/o;->q()LF0/J;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    :goto_0
    return v0
.end method
