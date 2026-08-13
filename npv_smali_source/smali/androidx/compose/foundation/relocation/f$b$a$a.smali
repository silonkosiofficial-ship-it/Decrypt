.class final synthetic Landroidx/compose/foundation/relocation/f$b$a$a;
.super Ly7/q;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/relocation/f$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# instance fields
.field final synthetic L:Landroidx/compose/foundation/relocation/f;

.field final synthetic M:LD0/t;

.field final synthetic N:Lx7/a;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)V
    .locals 6

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->L:Landroidx/compose/foundation/relocation/f;

    iput-object p2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->M:LD0/t;

    iput-object p3, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->N:Lx7/a;

    const-string v4, "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-class v2, Ly7/t$a;

    const-string v3, "localRect"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Ly7/q;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/relocation/f$b$a$a;->s()Ln0/i;

    move-result-object v0

    return-object v0
.end method

.method public final s()Ln0/i;
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->L:Landroidx/compose/foundation/relocation/f;

    iget-object v1, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->M:LD0/t;

    iget-object v2, p0, Landroidx/compose/foundation/relocation/f$b$a$a;->N:Lx7/a;

    invoke-static {v0, v1, v2}, Landroidx/compose/foundation/relocation/f;->T1(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)Ln0/i;

    move-result-object v0

    return-object v0
.end method
