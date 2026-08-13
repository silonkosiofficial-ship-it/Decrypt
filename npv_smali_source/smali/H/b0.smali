.class final LH/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/L;


# instance fields
.field private final b:LS0/L;

.field private final c:I

.field private final d:I


# direct methods
.method public constructor <init>(LS0/L;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH/b0;->b:LS0/L;

    iput p2, p0, LH/b0;->c:I

    iput p3, p0, LH/b0;->d:I

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LH/b0;->b:LS0/L;

    invoke-interface {v0, p1}, LS0/L;->a(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, LH/b0;->d:I

    if-gt p1, v1, :cond_0

    iget v1, p0, LH/b0;->c:I

    invoke-static {v0, v1, p1}, LH/c0;->b(III)V

    :cond_0
    return v0
.end method

.method public b(I)I
    .locals 2

    .prologue
    iget-object v0, p0, LH/b0;->b:LS0/L;

    invoke-interface {v0, p1}, LS0/L;->b(I)I

    move-result v0

    if-ltz p1, :cond_0

    iget v1, p0, LH/b0;->c:I

    if-gt p1, v1, :cond_0

    iget v1, p0, LH/b0;->d:I

    invoke-static {v0, v1, p1}, LH/c0;->a(III)V

    :cond_0
    return v0
.end method
