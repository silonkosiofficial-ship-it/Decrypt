.class final LS/T$m$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T$m;->a(Lt/e;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LW8/N;

.field final synthetic E:LV/w0;

.field final synthetic F:LB/D;

.field final synthetic G:LE7/i;

.field final synthetic H:LT/j;


# direct methods
.method constructor <init>(LW8/N;LV/w0;LB/D;LE7/i;LT/j;)V
    .locals 0

    iput-object p1, p0, LS/T$m$b;->D:LW8/N;

    iput-object p2, p0, LS/T$m$b;->E:LV/w0;

    iput-object p3, p0, LS/T$m$b;->F:LB/D;

    iput-object p4, p0, LS/T$m$b;->G:LE7/i;

    iput-object p5, p0, LS/T$m$b;->H:LT/j;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 9

    iget-object v0, p0, LS/T$m$b;->E:LV/w0;

    invoke-static {v0}, LS/T;->r(LV/w0;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, LS/T;->s(LV/w0;Z)V

    iget-object v2, p0, LS/T$m$b;->D:LW8/N;

    new-instance v0, LS/T$m$b$a;

    iget-object v4, p0, LS/T$m$b;->F:LB/D;

    iget-object v6, p0, LS/T$m$b;->G:LE7/i;

    iget-object v7, p0, LS/T$m$b;->H:LT/j;

    const/4 v8, 0x0

    move-object v3, v0

    move v5, p1

    invoke-direct/range {v3 .. v8}, LS/T$m$b$a;-><init>(LB/D;ILE7/i;LT/j;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v0

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LS/T$m$b;->a(I)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
