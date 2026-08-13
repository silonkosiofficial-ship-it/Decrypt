.class final Landroidx/compose/foundation/k$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/k;->a(ILV/n;II)Landroidx/compose/foundation/m;
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

    iput p1, p0, Landroidx/compose/foundation/k$a;->D:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/compose/foundation/m;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/m;

    iget v1, p0, Landroidx/compose/foundation/k$a;->D:I

    invoke-direct {v0, v1}, Landroidx/compose/foundation/m;-><init>(I)V

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/k$a;->a()Landroidx/compose/foundation/m;

    move-result-object v0

    return-object v0
.end method
