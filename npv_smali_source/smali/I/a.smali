.class public abstract LI/a;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/v0;
.implements Lm0/b;


# instance fields
.field private R:Lx7/a;

.field private S:Z

.field private final T:Lz0/W;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 1

    invoke-direct {p0}, LF0/m;-><init>()V

    iput-object p1, p0, LI/a;->R:Lx7/a;

    new-instance p1, LI/a$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LI/a$a;-><init>(LI/a;Lm7/e;)V

    invoke-static {p1}, Lz0/U;->a(Lx7/p;)Lz0/W;

    move-result-object p1

    invoke-virtual {p0, p1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object p1

    check-cast p1, Lz0/W;

    iput-object p1, p0, LI/a;->T:Lz0/W;

    return-void
.end method

.method public static final synthetic Z1(LI/a;)Z
    .locals 0

    iget-boolean p0, p0, LI/a;->S:Z

    return p0
.end method


# virtual methods
.method public R0(Lm0/n;)V
    .locals 0

    invoke-interface {p1}, Lm0/n;->g()Z

    move-result p1

    iput-boolean p1, p0, LI/a;->S:Z

    return-void
.end method

.method public final a2()Lx7/a;
    .locals 1

    iget-object v0, p0, LI/a;->R:Lx7/a;

    return-object v0
.end method

.method public final b2(Lx7/a;)V
    .locals 0

    iput-object p1, p0, LI/a;->R:Lx7/a;

    return-void
.end method

.method public synthetic f1()V
    .locals 0

    invoke-static {p0}, LF0/u0;->c(LF0/v0;)V

    return-void
.end method

.method public g0()V
    .locals 1

    iget-object v0, p0, LI/a;->T:Lz0/W;

    invoke-interface {v0}, LF0/v0;->g0()V

    return-void
.end method

.method public synthetic n0()Z
    .locals 1

    invoke-static {p0}, LF0/u0;->a(LF0/v0;)Z

    move-result v0

    return v0
.end method

.method public synthetic t0()V
    .locals 0

    invoke-static {p0}, LF0/u0;->b(LF0/v0;)V

    return-void
.end method

.method public w0(Lz0/p;Lz0/r;J)V
    .locals 1

    iget-object v0, p0, LI/a;->T:Lz0/W;

    invoke-interface {v0, p1, p2, p3, p4}, LF0/v0;->w0(Lz0/p;Lz0/r;J)V

    return-void
.end method
