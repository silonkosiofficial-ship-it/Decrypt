.class final LH/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/A;


# instance fields
.field private final b:LH/Q;

.field private final c:I

.field private final d:LS0/e0;

.field private final e:Lx7/a;


# direct methods
.method public constructor <init>(LH/Q;ILS0/e0;Lx7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/n;->b:LH/Q;

    iput p2, p0, LH/n;->c:I

    iput-object p3, p0, LH/n;->d:LS0/e0;

    iput-object p4, p0, LH/n;->e:Lx7/a;

    return-void
.end method


# virtual methods
.method public synthetic C(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->d(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic F(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->b(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LH/n;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LH/n;

    iget-object v1, p0, LH/n;->b:LH/Q;

    iget-object v3, p1, LH/n;->b:LH/Q;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LH/n;->c:I

    iget v3, p1, LH/n;->c:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LH/n;->d:LS0/e0;

    iget-object v3, p1, LH/n;->d:LS0/e0;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LH/n;->e:Lx7/a;

    iget-object p1, p1, LH/n;->e:Lx7/a;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 10

    .prologue
    invoke-static {p3, p4}, LY0/b;->k(J)I

    move-result v0

    invoke-interface {p2, v0}, LD0/n;->T(I)I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result v1

    if-ge v0, v1, :cond_0

    move-wide v0, p3

    goto :goto_0

    :cond_0
    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    :goto_0
    invoke-interface {p2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object p2

    invoke-virtual {p2}, LD0/X;->I0()I

    move-result v0

    invoke-static {p3, p4}, LY0/b;->l(J)I

    move-result p3

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p2}, LD0/X;->w0()I

    move-result v3

    new-instance v5, LH/n$a;

    invoke-direct {v5, p1, p0, p2, v2}, LH/n$a;-><init>(LD0/M;LH/n;LD0/X;I)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LH/n;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LH/n;->b:LH/Q;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LH/n;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/n;->d:LS0/e0;

    invoke-virtual {v1}, LS0/e0;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LH/n;->e:Lx7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final j()LH/Q;
    .locals 1

    iget-object v0, p0, LH/n;->b:LH/Q;

    return-object v0
.end method

.method public synthetic k(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->a(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final l()Lx7/a;
    .locals 1

    iget-object v0, p0, LH/n;->e:Lx7/a;

    return-object v0
.end method

.method public final m()LS0/e0;
    .locals 1

    iget-object v0, p0, LH/n;->d:LS0/e0;

    return-object v0
.end method

.method public synthetic t(LD0/o;LD0/n;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/z;->c(LD0/A;LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HorizontalScrollLayoutModifier(scrollerPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/n;->b:LH/Q;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cursorOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LH/n;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", transformedText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/n;->d:LS0/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textLayoutResultProvider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LH/n;->e:Lx7/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
