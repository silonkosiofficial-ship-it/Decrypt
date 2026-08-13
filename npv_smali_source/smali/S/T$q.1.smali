.class final LS/T$q;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->f(Landroidx/compose/ui/d;Lx7/p;JJFLx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:Lx7/p;

.field final synthetic F:J

.field final synthetic G:J

.field final synthetic H:F

.field final synthetic I:Lx7/p;

.field final synthetic J:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;Lx7/p;JJFLx7/p;I)V
    .locals 0

    iput-object p1, p0, LS/T$q;->D:Landroidx/compose/ui/d;

    iput-object p2, p0, LS/T$q;->E:Lx7/p;

    iput-wide p3, p0, LS/T$q;->F:J

    iput-wide p5, p0, LS/T$q;->G:J

    iput p7, p0, LS/T$q;->H:F

    iput-object p8, p0, LS/T$q;->I:Lx7/p;

    iput p9, p0, LS/T$q;->J:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/T$q;->D:Landroidx/compose/ui/d;

    iget-object v1, p0, LS/T$q;->E:Lx7/p;

    iget-wide v2, p0, LS/T$q;->F:J

    iget-wide v4, p0, LS/T$q;->G:J

    iget v6, p0, LS/T$q;->H:F

    iget-object v7, p0, LS/T$q;->I:Lx7/p;

    iget p2, p0, LS/T$q;->J:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/T;->f(Landroidx/compose/ui/d;Lx7/p;JJFLx7/p;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$q;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
