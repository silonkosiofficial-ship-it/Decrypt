.class final LY/d$a;
.super Lj7/d;
.source "SourceFile"

# interfaces
.implements LY/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final D:LY/d;

.field private final E:I

.field private final F:I

.field private G:I


# direct methods
.method public constructor <init>(LY/d;II)V
    .locals 0

    invoke-direct {p0}, Lj7/d;-><init>()V

    iput-object p1, p0, LY/d$a;->D:LY/d;

    iput p2, p0, LY/d$a;->E:I

    iput p3, p0, LY/d$a;->F:I

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-static {p2, p3, p1}, Lc0/d;->c(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LY/d$a;->G:I

    return-void
.end method


# virtual methods
.method public e()I
    .locals 1

    iget v0, p0, LY/d$a;->G:I

    return v0
.end method

.method public g(II)LY/d;
    .locals 3

    iget v0, p0, LY/d$a;->G:I

    invoke-static {p1, p2, v0}, Lc0/d;->c(III)V

    new-instance v0, LY/d$a;

    iget-object v1, p0, LY/d$a;->D:LY/d;

    iget v2, p0, LY/d$a;->E:I

    add-int/2addr p1, v2

    add-int/2addr v2, p2

    invoke-direct {v0, v1, p1, v2}, LY/d$a;-><init>(LY/d;II)V

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, LY/d$a;->G:I

    invoke-static {p1, v0}, Lc0/d;->a(II)V

    iget-object v0, p0, LY/d$a;->D:LY/d;

    iget v1, p0, LY/d$a;->E:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, LY/d$a;->g(II)LY/d;

    move-result-object p1

    return-object p1
.end method
