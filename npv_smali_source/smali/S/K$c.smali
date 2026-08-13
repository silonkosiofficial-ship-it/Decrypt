.class final LS/K$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/K;->a(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Ljava/lang/Long;

.field final synthetic E:Lx7/l;

.field final synthetic F:LT/f;

.field final synthetic G:LE7/i;

.field final synthetic H:LS/Q;

.field final synthetic I:LS/P0;

.field final synthetic J:LS/M;

.field final synthetic K:I


# direct methods
.method constructor <init>(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;I)V
    .locals 0

    iput-object p1, p0, LS/K$c;->D:Ljava/lang/Long;

    iput-object p2, p0, LS/K$c;->E:Lx7/l;

    iput-object p3, p0, LS/K$c;->F:LT/f;

    iput-object p4, p0, LS/K$c;->G:LE7/i;

    iput-object p5, p0, LS/K$c;->H:LS/Q;

    iput-object p6, p0, LS/K$c;->I:LS/P0;

    iput-object p7, p0, LS/K$c;->J:LS/M;

    iput p8, p0, LS/K$c;->K:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LV/n;I)V
    .locals 9

    iget-object v0, p0, LS/K$c;->D:Ljava/lang/Long;

    iget-object v1, p0, LS/K$c;->E:Lx7/l;

    iget-object v2, p0, LS/K$c;->F:LT/f;

    iget-object v3, p0, LS/K$c;->G:LE7/i;

    iget-object v4, p0, LS/K$c;->H:LS/Q;

    iget-object v5, p0, LS/K$c;->I:LS/P0;

    iget-object v6, p0, LS/K$c;->J:LS/M;

    iget p2, p0, LS/K$c;->K:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LV/S0;->a(I)I

    move-result v8

    move-object v7, p1

    invoke-static/range {v0 .. v8}, LS/K;->a(Ljava/lang/Long;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V

    return-void
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LV/n;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LS/K$c;->a(LV/n;I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
