.class final LS/T$n;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->c(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:J

.field final synthetic F:Lx7/l;

.field final synthetic G:Lx7/l;

.field final synthetic H:LT/f;

.field final synthetic I:LE7/i;

.field final synthetic J:LS/Q;

.field final synthetic K:LS/P0;

.field final synthetic L:LS/M;

.field final synthetic M:I


# direct methods
.method constructor <init>(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/T$n;->D:Ljava/lang/Long;

    iput-wide p2, p0, LS/T$n;->E:J

    iput-object p4, p0, LS/T$n;->F:Lx7/l;

    iput-object p5, p0, LS/T$n;->G:Lx7/l;

    iput-object p6, p0, LS/T$n;->H:LT/f;

    iput-object p7, p0, LS/T$n;->I:LE7/i;

    iput-object p8, p0, LS/T$n;->J:LS/Q;

    iput-object p9, p0, LS/T$n;->K:LS/P0;

    iput-object p10, p0, LS/T$n;->L:LS/M;

    iput p11, p0, LS/T$n;->M:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 12

    iget-object v0, p0, LS/T$n;->D:Ljava/lang/Long;

    iget-wide v1, p0, LS/T$n;->E:J

    iget-object v3, p0, LS/T$n;->F:Lx7/l;

    iget-object v4, p0, LS/T$n;->G:Lx7/l;

    iget-object v5, p0, LS/T$n;->H:LT/f;

    iget-object v6, p0, LS/T$n;->I:LE7/i;

    iget-object v7, p0, LS/T$n;->J:LS/Q;

    iget-object v8, p0, LS/T$n;->K:LS/P0;

    iget-object v9, p0, LS/T$n;->L:LS/M;

    iget p2, p0, LS/T$n;->M:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v11

    move-object v10, p1

    invoke-static/range {v0 .. v11}, LS/T;->q(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$n;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
