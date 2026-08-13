.class final Landroidx/compose/animation/a$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;LV/n;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Object;

.field final synthetic E:Landroidx/compose/ui/d;

.field final synthetic F:Lx7/l;

.field final synthetic G:Lh0/c;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lx7/l;

.field final synthetic J:Lx7/r;

.field final synthetic K:I

.field final synthetic L:I


# direct methods
.method constructor <init>(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;II)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/a$c;->D:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/compose/animation/a$c;->E:Landroidx/compose/ui/d;

    iput-object p3, p0, Landroidx/compose/animation/a$c;->F:Lx7/l;

    iput-object p4, p0, Landroidx/compose/animation/a$c;->G:Lh0/c;

    iput-object p5, p0, Landroidx/compose/animation/a$c;->H:Ljava/lang/String;

    iput-object p6, p0, Landroidx/compose/animation/a$c;->I:Lx7/l;

    iput-object p7, p0, Landroidx/compose/animation/a$c;->J:Lx7/r;

    iput p8, p0, Landroidx/compose/animation/a$c;->K:I

    iput p9, p0, Landroidx/compose/animation/a$c;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, Landroidx/compose/animation/a$c;->D:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/compose/animation/a$c;->E:Landroidx/compose/ui/d;

    iget-object v2, p0, Landroidx/compose/animation/a$c;->F:Lx7/l;

    iget-object v3, p0, Landroidx/compose/animation/a$c;->G:Lh0/c;

    iget-object v4, p0, Landroidx/compose/animation/a$c;->H:Ljava/lang/String;

    iget-object v5, p0, Landroidx/compose/animation/a$c;->I:Lx7/l;

    iget-object v6, p0, Landroidx/compose/animation/a$c;->J:Lx7/r;

    iget p2, p0, Landroidx/compose/animation/a$c;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    iget v9, p0, Landroidx/compose/animation/a$c;->L:I

    move-object v7, p1

    invoke-static/range {v0 .. v9}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/d;Lx7/l;Lh0/c;Ljava/lang/String;Lx7/l;Lx7/r;LV/n;II)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/a$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
