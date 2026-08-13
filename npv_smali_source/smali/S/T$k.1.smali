.class final LS/T$k;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->c(Ljava/lang/Long;JLx7/l;Lx7/l;LT/f;LE7/i;LS/Q;LS/P0;LS/M;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LW8/N;

.field final synthetic E:LB/D;


# direct methods
.method constructor <init>(LW8/N;LB/D;)V
    .locals 0

    iput-object p1, p0, LS/T$k;->D:LW8/N;

    iput-object p2, p0, LS/T$k;->E:LB/D;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, LS/T$k;->D:LW8/N;

    new-instance v3, LS/T$k$a;

    iget-object v1, p0, LS/T$k;->E:LB/D;

    const/4 v2, 0x0

    invoke-direct {v3, v1, v2}, LS/T$k$a;-><init>(LB/D;Lm7/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LS/T$k;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
