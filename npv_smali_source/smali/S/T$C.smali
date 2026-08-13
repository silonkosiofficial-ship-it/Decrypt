.class final LS/T$C;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->j(LT/j;Lx7/l;JLjava/lang/Long;Ljava/lang/Long;LS/Q0;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LT/j;

.field final synthetic E:Lx7/l;

.field final synthetic F:J

.field final synthetic G:Ljava/lang/Long;

.field final synthetic H:Ljava/lang/Long;

.field final synthetic I:LS/Q;

.field final synthetic J:LS/P0;

.field final synthetic K:LS/M;

.field final synthetic L:I


# direct methods
.method constructor <init>(LT/j;Lx7/l;JLjava/lang/Long;Ljava/lang/Long;LS/Q0;LS/Q;LS/P0;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/T$C;->D:LT/j;

    iput-object p2, p0, LS/T$C;->E:Lx7/l;

    iput-wide p3, p0, LS/T$C;->F:J

    iput-object p5, p0, LS/T$C;->G:Ljava/lang/Long;

    iput-object p6, p0, LS/T$C;->H:Ljava/lang/Long;

    iput-object p8, p0, LS/T$C;->I:LS/Q;

    iput-object p9, p0, LS/T$C;->J:LS/P0;

    iput-object p10, p0, LS/T$C;->K:LS/M;

    iput p11, p0, LS/T$C;->L:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LS/T$C;->D:LT/j;

    iget-object v1, p0, LS/T$C;->E:Lx7/l;

    iget-wide v2, p0, LS/T$C;->F:J

    iget-object v4, p0, LS/T$C;->G:Ljava/lang/Long;

    iget-object v5, p0, LS/T$C;->H:Ljava/lang/Long;

    iget-object v7, p0, LS/T$C;->I:LS/Q;

    iget-object v8, p0, LS/T$C;->J:LS/P0;

    iget-object v9, p0, LS/T$C;->K:LS/M;

    iget p2, p0, LS/T$C;->L:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v11

    const/4 v6, 0x0

    move-object v10, p1

    invoke-static/range {v0 .. v11}, LS/T;->j(LT/j;Lx7/l;JLjava/lang/Long;Ljava/lang/Long;LS/Q0;LS/Q;LS/P0;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$C;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
