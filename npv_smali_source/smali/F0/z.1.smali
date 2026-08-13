.class public final LF0/z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LF0/J;

.field private final b:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LF0/J;LD0/I;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0/z;->a:LF0/J;

    const/4 p1, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p1, v0, p1}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LF0/z;->b:LV/w0;

    return-void
.end method

.method private final a()LD0/I;
    .locals 1

    iget-object v0, p0, LF0/z;->b:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/I;

    return-object v0
.end method

.method private final j(LD0/I;)V
    .locals 1

    iget-object v0, p0, LF0/z;->b:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->j(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final c(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->a(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final d(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->j(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final e(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->a(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final f(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->e(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final g(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->G()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->c(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final h(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->e(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final i(I)I
    .locals 3

    invoke-direct {p0}, LF0/z;->a()LD0/I;

    move-result-object v0

    iget-object v1, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v1}, LF0/J;->m0()LF0/d0;

    move-result-object v1

    iget-object v2, p0, LF0/z;->a:LF0/J;

    invoke-virtual {v2}, LF0/J;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v1, v2, p1}, LD0/I;->c(LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final k(LD0/I;)V
    .locals 0

    invoke-direct {p0, p1}, LF0/z;->j(LD0/I;)V

    return-void
.end method
