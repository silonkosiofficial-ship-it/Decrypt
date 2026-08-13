.class final LS/T$I;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->l(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:J

.field final synthetic F:I

.field final synthetic G:Lx7/l;

.field final synthetic H:Lx7/l;

.field final synthetic I:LT/f;

.field final synthetic J:LE7/i;

.field final synthetic K:LS/Q;

.field final synthetic L:LS/P0;

.field final synthetic M:LS/M;

.field final synthetic N:I


# direct methods
.method constructor <init>(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/T$I;->D:Ljava/lang/Long;

    iput-wide p2, p0, LS/T$I;->E:J

    iput p4, p0, LS/T$I;->F:I

    iput-object p5, p0, LS/T$I;->G:Lx7/l;

    iput-object p6, p0, LS/T$I;->H:Lx7/l;

    iput-object p7, p0, LS/T$I;->I:LT/f;

    iput-object p8, p0, LS/T$I;->J:LE7/i;

    iput-object p9, p0, LS/T$I;->K:LS/Q;

    iput-object p10, p0, LS/T$I;->L:LS/P0;

    iput-object p11, p0, LS/T$I;->M:LS/M;

    iput p12, p0, LS/T$I;->N:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 13

    iget-object v0, p0, LS/T$I;->D:Ljava/lang/Long;

    iget-wide v1, p0, LS/T$I;->E:J

    iget v3, p0, LS/T$I;->F:I

    iget-object v4, p0, LS/T$I;->G:Lx7/l;

    iget-object v5, p0, LS/T$I;->H:Lx7/l;

    iget-object v6, p0, LS/T$I;->I:LT/f;

    iget-object v7, p0, LS/T$I;->J:LE7/i;

    iget-object v8, p0, LS/T$I;->K:LS/Q;

    iget-object v9, p0, LS/T$I;->L:LS/P0;

    iget-object v10, p0, LS/T$I;->M:LS/M;

    iget p2, p0, LS/T$I;->N:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v12

    move-object v11, p1

    invoke-static/range {v0 .. v12}, LS/T;->w(Ljava/lang/Long;JILx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/T$I;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
