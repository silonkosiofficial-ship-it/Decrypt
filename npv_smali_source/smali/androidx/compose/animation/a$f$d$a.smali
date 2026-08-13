.class final Landroidx/compose/animation/a$f$d$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a$f$d;->a(Lt/e;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lf0/r;

.field final synthetic E:Ljava/lang/Object;

.field final synthetic F:Landroidx/compose/animation/e;


# direct methods
.method constructor <init>(Lf0/r;Ljava/lang/Object;Landroidx/compose/animation/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$f$d$a;->D:Lf0/r;

    iput-object p2, p0, Landroidx/compose/animation/a$f$d$a;->E:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/compose/animation/a$f$d$a;->F:Landroidx/compose/animation/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 3

    iget-object p1, p0, Landroidx/compose/animation/a$f$d$a;->D:Lf0/r;

    iget-object v0, p0, Landroidx/compose/animation/a$f$d$a;->E:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$f$d$a;->F:Landroidx/compose/animation/e;

    new-instance v2, Landroidx/compose/animation/a$f$d$a$a;

    invoke-direct {v2, p1, v0, v1}, Landroidx/compose/animation/a$f$d$a$a;-><init>(Lf0/r;Ljava/lang/Object;Landroidx/compose/animation/e;)V

    return-object v2
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/a$f$d$a;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
