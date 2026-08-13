.class public final LI/b;
.super LI/a;
.source "SourceFile"

# interfaces
.implements LF0/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lx7/a;)V
    .locals 0

    invoke-direct {p0, p1}, LI/a;-><init>(Lx7/a;)V

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->d(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->b(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public Y0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 11

    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->b()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->S0(F)I

    move-result v0

    invoke-static {}, Landroidx/compose/foundation/text/handwriting/a;->a()F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->S0(F)I

    move-result v1

    mul-int/lit8 v2, v1, 0x2

    mul-int/lit8 v3, v0, 0x2

    invoke-static {p3, p4, v2, v3}, LY0/c;->n(JII)J

    move-result-wide p3

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result p3

    sub-int v6, p3, v3

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result p3

    sub-int v5, p3, v2

    new-instance v8, LI/b$a;

    invoke-direct {v8, p2, v1, v0}, LI/b$a;-><init>(LD0/X;II)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v4 .. v10}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->a(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LF0/D;->c(LF0/E;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method
