.class public final Landroidx/compose/ui/e;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E;


# instance fields
.field private P:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput p1, p0, Landroidx/compose/ui/e;->P:F

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

.method public final T1()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/e;->P:F

    return v0
.end method

.method public final U1(F)V
    .locals 0

    iput p1, p0, Landroidx/compose/ui/e;->P:F

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 7

    invoke-interface {p2, p3, p4}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v1

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v2

    new-instance v4, Landroidx/compose/ui/e$a;

    invoke-direct {v4, p2, p0}, Landroidx/compose/ui/e$a;-><init>(LD0/X;Landroidx/compose/ui/e;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

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

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ZIndexModifier(zIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/e;->P:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
