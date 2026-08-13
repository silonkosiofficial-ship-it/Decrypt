.class final Landroidx/compose/foundation/f$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/f;->g2(Lz0/K;Lm7/e;)Ljava/lang/Object;
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

    iput-object p1, p0, Landroidx/compose/foundation/f$b;->D:Landroidx/compose/foundation/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 0

    .prologue
    iget-object p1, p0, Landroidx/compose/foundation/f$b;->D:Landroidx/compose/foundation/f;

    invoke-static {p1}, Landroidx/compose/foundation/f;->s2(Landroidx/compose/foundation/f;)Lx7/a;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/f$b;->a(J)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
