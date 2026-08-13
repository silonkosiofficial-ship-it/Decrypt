.class final LS/g1$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/g1;->a(ILandroidx/compose/ui/d;JJLx7/q;Lx7/p;Lx7/p;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    iput p1, p0, LS/g1$a;->D:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;LV/n;I)V
    .locals 9

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:306)"

    const v2, -0x7a5029ff

    invoke-static {v2, p3, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    iget p3, p0, LS/g1$a;->D:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p3, v0, :cond_1

    sget-object v1, LS/f1;->a:LS/f1;

    sget-object p3, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iget v0, p0, LS/g1$a;->D:I

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LS/e1;

    invoke-virtual {v1, p3, p1}, LS/f1;->d(Landroidx/compose/ui/d;LS/e1;)Landroidx/compose/ui/d;

    move-result-object v2

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v6, p2

    invoke-virtual/range {v1 .. v8}, LS/f1;->a(Landroidx/compose/ui/d;FJLV/n;II)V

    :cond_1
    invoke-static {}, LV/q;->H()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, LV/q;->P()V

    :cond_2
    return-void
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, LV/n;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LS/g1$a;->a(Ljava/util/List;LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
