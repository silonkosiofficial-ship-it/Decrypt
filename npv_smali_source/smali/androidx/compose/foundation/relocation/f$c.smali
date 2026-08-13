.class final Landroidx/compose/foundation/relocation/f$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f;->j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/relocation/f;

.field final synthetic E:LD0/t;

.field final synthetic F:Lx7/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$c;->D:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$c;->E:LD0/t;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$c;->F:Lx7/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ln0/i;
    .locals 3

    .prologue
    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$c;->D:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->E:LD0/t;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$c;->F:Lx7/a;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->T1(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)Ln0/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$c;->D:Landroidx/compose/foundation/relocation/f;

    invoke-virtual {v1}, Landroidx/compose/foundation/relocation/f;->V1()LE/c;

    move-result-object v1

    invoke-interface {v1, v0}, LE/c;->T(Ln0/i;)Ln0/i;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$c;->a()Ln0/i;

    move-result-object v0

    return-object v0
.end method
