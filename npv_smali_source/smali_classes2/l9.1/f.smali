.class public final Ll9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/e;


# instance fields
.field private final a:Lx7/l;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lx7/l;II)V
    .locals 1

    const-string v0, "number"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/f;->a:Lx7/l;

    iput p2, p0, Ll9/f;->b:I

    iput p3, p0, Ll9/f;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Appendable;Z)V
    .locals 2

    .prologue
    const/4 p3, 0x0

    const-string v0, "builder"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll9/f;->a:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-static {}, Lj9/e;->b()[I

    move-result-object v0

    iget v1, p0, Ll9/f;->b:I

    aget v0, v0, v1

    iget v1, p0, Ll9/f;->c:I

    sub-int v1, p1, v1

    if-ltz v1, :cond_0

    if-ge v1, v0, :cond_0

    invoke-static {}, Lj9/e;->b()[I

    move-result-object v0

    iget v1, p0, Ll9/f;->b:I

    aget v0, v0, v1

    rem-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Ll9/f;->b:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v1, "0"

    invoke-static {v1, v0}, LS8/r;->N(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/CharSequence;

    aput-object v0, v1, p3

    const/4 p3, 0x1

    aput-object p1, v1, p3

    invoke-static {p2, v1}, LS8/r;->a(Ljava/lang/Appendable;[Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    const-string p3, "+"

    invoke-interface {p2, p3}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    return-void
.end method
