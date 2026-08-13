.class public final LA/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/S;


# instance fields
.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:LV/w0;

.field private final e:LV/w0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LA/a;->b:I

    iput-object p2, p0, LA/a;->c:Ljava/lang/String;

    sget-object p1, Landroidx/core/graphics/f;->e:Landroidx/core/graphics/f;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LA/a;->d:LV/w0;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, v0, p2}, LV/v1;->i(Ljava/lang/Object;LV/u1;ILjava/lang/Object;)LV/w0;

    move-result-object p1

    iput-object p1, p0, LA/a;->e:LV/w0;

    return-void
.end method

.method private final g(Z)V
    .locals 1

    iget-object v0, p0, LA/a;->e:LV/w0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(LY0/e;LY0/v;)I
    .locals 0

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object p1

    iget p1, p1, Landroidx/core/graphics/f;->c:I

    return p1
.end method

.method public b(LY0/e;)I
    .locals 0

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object p1

    iget p1, p1, Landroidx/core/graphics/f;->d:I

    return p1
.end method

.method public c(LY0/e;)I
    .locals 0

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object p1

    iget p1, p1, Landroidx/core/graphics/f;->b:I

    return p1
.end method

.method public d(LY0/e;LY0/v;)I
    .locals 0

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object p1

    iget p1, p1, Landroidx/core/graphics/f;->a:I

    return p1
.end method

.method public final e()Landroidx/core/graphics/f;
    .locals 1

    iget-object v0, p0, LA/a;->d:LV/w0;

    invoke-interface {v0}, LV/G1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/graphics/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LA/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LA/a;->b:I

    check-cast p1, LA/a;

    iget p1, p1, LA/a;->b:I

    if-ne v1, p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public final f(Landroidx/core/graphics/f;)V
    .locals 1

    iget-object v0, p0, LA/a;->d:LV/w0;

    invoke-interface {v0, p1}, LV/w0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Landroidx/core/view/y0;I)V
    .locals 1

    .prologue
    if-eqz p2, :cond_0

    iget v0, p0, LA/a;->b:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_1

    :cond_0
    iget p2, p0, LA/a;->b:I

    invoke-virtual {p1, p2}, Landroidx/core/view/y0;->f(I)Landroidx/core/graphics/f;

    move-result-object p2

    invoke-virtual {p0, p2}, LA/a;->f(Landroidx/core/graphics/f;)V

    iget p2, p0, LA/a;->b:I

    invoke-virtual {p1, p2}, Landroidx/core/view/y0;->p(I)Z

    move-result p1

    invoke-direct {p0, p1}, LA/a;->g(Z)V

    :cond_1
    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, LA/a;->b:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LA/a;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object v1

    iget v1, v1, Landroidx/core/graphics/f;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object v2

    iget v2, v2, Landroidx/core/graphics/f;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object v2

    iget v2, v2, Landroidx/core/graphics/f;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LA/a;->e()Landroidx/core/graphics/f;

    move-result-object v1

    iget v1, v1, Landroidx/core/graphics/f;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
