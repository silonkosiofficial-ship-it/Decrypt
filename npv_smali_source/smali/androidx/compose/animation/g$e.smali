.class final Landroidx/compose/animation/g$e;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/g;->f(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/animation/g;

.field final synthetic E:J


# direct methods
.method constructor <init>(Landroidx/compose/animation/g;J)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/g$e;->D:Landroidx/compose/animation/g;

    iput-wide p2, p0, Landroidx/compose/animation/g$e;->E:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt/m;)J
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/g$e;->D:Landroidx/compose/animation/g;

    iget-wide v1, p0, Landroidx/compose/animation/g$e;->E:J

    invoke-virtual {v0, p1, v1, v2}, Landroidx/compose/animation/g;->f2(Lt/m;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lt/m;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/g$e;->a(Lt/m;)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/t;->b(J)LY0/t;

    move-result-object p1

    return-object p1
.end method
