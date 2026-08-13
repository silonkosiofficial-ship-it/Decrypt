.class final LD/v$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD/v$a;->a(Le0/d;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic E:LD/q;

.field final synthetic F:LD0/i0;

.field final synthetic G:LD/P;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/lazy/layout/d;LD/q;LD0/i0;LD/P;)V
    .locals 0

    iput-object p1, p0, LD/v$a$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    iput-object p2, p0, LD/v$a$a;->E:LD/q;

    iput-object p3, p0, LD/v$a$a;->F:LD0/i0;

    iput-object p4, p0, LD/v$a$a;->G:LD/P;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/N;)LV/M;
    .locals 4

    iget-object p1, p0, LD/v$a$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    new-instance v0, Landroidx/compose/foundation/lazy/layout/h;

    iget-object v1, p0, LD/v$a$a;->E:LD/q;

    iget-object v2, p0, LD/v$a$a;->F:LD0/i0;

    iget-object v3, p0, LD/v$a$a;->G:LD/P;

    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/layout/h;-><init>(LD/q;LD0/i0;LD/P;)V

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/lazy/layout/d;->f(Landroidx/compose/foundation/lazy/layout/h;)V

    iget-object p1, p0, LD/v$a$a;->D:Landroidx/compose/foundation/lazy/layout/d;

    new-instance v0, LD/v$a$a$a;

    invoke-direct {v0, p1}, LD/v$a$a$a;-><init>(Landroidx/compose/foundation/lazy/layout/d;)V

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/N;

    invoke-virtual {p0, p1}, LD/v$a$a;->a(LV/N;)LV/M;

    move-result-object p1

    return-object p1
.end method
