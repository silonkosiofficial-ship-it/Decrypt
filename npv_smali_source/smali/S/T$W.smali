.class final LS/T$W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/T;->L(LB/D;Lx7/l;LT/f;LE7/i;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LB/D;

.field final synthetic D:Lx7/l;

.field final synthetic E:LT/f;

.field final synthetic F:LE7/i;


# direct methods
.method constructor <init>(LB/D;Lx7/l;LT/f;LE7/i;)V
    .locals 0

    iput-object p1, p0, LS/T$W;->C:LB/D;

    iput-object p2, p0, LS/T$W;->D:Lx7/l;

    iput-object p3, p0, LS/T$W;->E:LT/f;

    iput-object p4, p0, LS/T$W;->F:LE7/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, LS/T$W;->b(ILm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(ILm7/e;)Ljava/lang/Object;
    .locals 3

    iget-object p1, p0, LS/T$W;->C:LB/D;

    invoke-virtual {p1}, LB/D;->r()I

    move-result p1

    div-int/lit8 p1, p1, 0xc

    iget-object p2, p0, LS/T$W;->C:LB/D;

    invoke-virtual {p2}, LB/D;->r()I

    move-result p2

    rem-int/lit8 p2, p2, 0xc

    add-int/lit8 p2, p2, 0x1

    iget-object v0, p0, LS/T$W;->D:Lx7/l;

    iget-object v1, p0, LS/T$W;->E:LT/f;

    iget-object v2, p0, LS/T$W;->F:LE7/i;

    invoke-virtual {v2}, LE7/g;->f()I

    move-result v2

    add-int/2addr v2, p1

    invoke-virtual {v1, v2, p2}, LT/f;->f(II)LT/j;

    move-result-object p1

    invoke-virtual {p1}, LT/j;->d()J

    move-result-wide p1

    invoke-static {p1, p2}, Lo7/b;->d(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
