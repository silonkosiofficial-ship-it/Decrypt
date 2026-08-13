.class final LS/T$P;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->o(Landroidx/compose/ui/d;JLx7/l;LS/P0;LT/f;LE7/i;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Landroidx/compose/ui/d;

.field final synthetic E:J

.field final synthetic F:Lx7/l;

.field final synthetic G:LS/P0;

.field final synthetic H:LT/f;

.field final synthetic I:LE7/i;

.field final synthetic J:LS/M;

.field final synthetic K:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/d;JLx7/l;LS/P0;LT/f;LE7/i;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/T$P;->D:Landroidx/compose/ui/d;

    iput-wide p2, p0, LS/T$P;->E:J

    iput-object p4, p0, LS/T$P;->F:Lx7/l;

    iput-object p5, p0, LS/T$P;->G:LS/P0;

    iput-object p6, p0, LS/T$P;->H:LT/f;

    iput-object p7, p0, LS/T$P;->I:LE7/i;

    iput-object p8, p0, LS/T$P;->J:LS/M;

    iput p9, p0, LS/T$P;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 10

    iget-object v0, p0, LS/T$P;->D:Landroidx/compose/ui/d;

    iget-wide v1, p0, LS/T$P;->E:J

    iget-object v3, p0, LS/T$P;->F:Lx7/l;

    iget-object v4, p0, LS/T$P;->G:LS/P0;

    iget-object v5, p0, LS/T$P;->H:LT/f;

    iget-object v6, p0, LS/T$P;->I:LE7/i;

    iget-object v7, p0, LS/T$P;->J:LS/M;

    iget p2, p0, LS/T$P;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v9

    move-object v8, p1

    invoke-static/range {v0 .. v9}, LS/T;->y(Landroidx/compose/ui/d;JLx7/l;LS/P0;LT/f;LE7/i;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$P;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
