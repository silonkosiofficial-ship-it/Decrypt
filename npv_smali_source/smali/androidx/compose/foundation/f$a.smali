.class final Landroidx/compose/foundation/f$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/f;->f2(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/f$a;->D:Landroidx/compose/foundation/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/f$a;->D:Landroidx/compose/foundation/f;

    invoke-static {v0}, Landroidx/compose/foundation/f;->t2(Landroidx/compose/foundation/f;)Lx7/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/f$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
