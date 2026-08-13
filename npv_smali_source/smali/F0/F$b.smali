.class final LF0/F$b;
.super LF0/U;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF0/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic X:LF0/F;


# direct methods
.method public constructor <init>(LF0/F;)V
    .locals 0

    iput-object p1, p0, LF0/F$b;->X:LF0/F;

    invoke-direct {p0, p1}, LF0/U;-><init>(LF0/d0;)V

    return-void
.end method


# virtual methods
.method public S(I)I
    .locals 2

    iget-object v0, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v0}, LF0/F;->i3()LF0/E;

    move-result-object v0

    iget-object v1, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v1}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->j2()LF0/U;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LF0/E;->C(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public T(I)I
    .locals 2

    iget-object v0, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v0}, LF0/F;->i3()LF0/E;

    move-result-object v0

    iget-object v1, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v1}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->j2()LF0/U;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LF0/E;->F(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public U(J)LD0/X;
    .locals 2

    iget-object v0, p0, LF0/F$b;->X:LF0/F;

    invoke-static {p0, p1, p2}, LF0/U;->E1(LF0/U;J)V

    invoke-static {p1, p2}, LY0/b;->a(J)LY0/b;

    move-result-object v1

    invoke-virtual {v0, v1}, LF0/F;->m3(LY0/b;)V

    invoke-virtual {v0}, LF0/F;->i3()LF0/E;

    move-result-object v1

    invoke-virtual {v0}, LF0/F;->j3()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v1, p0, v0, p1, p2}, LF0/E;->f(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    invoke-static {p0, p1}, LF0/U;->F1(LF0/U;LD0/K;)V

    return-object p0
.end method

.method public f1(LD0/a;)I
    .locals 3

    invoke-static {p0, p1}, LF0/G;->a(LF0/T;LD0/a;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, LF0/U;->I1()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v0
.end method

.method public n0(I)I
    .locals 2

    iget-object v0, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v0}, LF0/F;->i3()LF0/E;

    move-result-object v0

    iget-object v1, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v1}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->j2()LF0/U;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LF0/E;->t(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public t(I)I
    .locals 2

    iget-object v0, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v0}, LF0/F;->i3()LF0/E;

    move-result-object v0

    iget-object v1, p0, LF0/F$b;->X:LF0/F;

    invoke-virtual {v1}, LF0/F;->j3()LF0/d0;

    move-result-object v1

    invoke-virtual {v1}, LF0/d0;->j2()LF0/U;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0, p0, v1, p1}, LF0/E;->k(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
