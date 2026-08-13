.class final LS/T$A;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->j(LT/j;Lx7/l;JLjava/lang/Long;Ljava/lang/Long;LS/Q0;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/l;

.field final synthetic E:J


# direct methods
.method constructor <init>(Lx7/l;J)V
    .locals 0

    iput-object p1, p0, LS/T$A;->D:Lx7/l;

    iput-wide p2, p0, LS/T$A;->E:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LS/T$A;->D:Lx7/l;

    iget-wide v1, p0, LS/T$A;->E:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$A;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
