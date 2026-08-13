.class final Landroidx/compose/animation/a$f$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$a;->a(LD0/M;LD0/G;J)LD0/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LD0/X;

.field final synthetic E:Lt/k;


# direct methods
.method constructor <init>(LD0/X;Lt/k;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$a$a;->D:LD0/X;

    iput-object p2, p0, Landroidx/compose/animation/a$f$a$a;->E:Lt/k;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/X$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/compose/animation/a$f$a$a;->D:LD0/X;

    iget-object v1, p0, Landroidx/compose/animation/a$f$a$a;->E:Lt/k;

    invoke-virtual {v1}, Lt/k;->d()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, LD0/X$a;->g(LD0/X;IIF)V

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LD0/X$a;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$f$a$a;->a(LD0/X$a;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
