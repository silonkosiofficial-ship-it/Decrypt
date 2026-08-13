.class final Landroidx/compose/foundation/l$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/l;->M0(LK0/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/l;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/l$a;->D:Landroidx/compose/foundation/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/l$a;->D:Landroidx/compose/foundation/l;

    invoke-virtual {v0}, Landroidx/compose/foundation/l;->T1()Landroidx/compose/foundation/m;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/m;->l()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/l$a;->a()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
