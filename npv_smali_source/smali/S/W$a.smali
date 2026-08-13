.class public final LS/W$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS0/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/W;-><init>(LT/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:LS/W;


# direct methods
.method constructor <init>(LS/W;)V
    .locals 0

    iput-object p1, p0, LS/W$a;->b:LS/W;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 1

    .prologue
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->c(LS/W;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->d(LS/W;)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt p1, v0, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->b(LS/W;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-gt p1, v0, :cond_2

    add-int/lit8 p1, p1, -0x2

    goto :goto_0

    :cond_2
    iget-object p1, p0, LS/W$a;->b:LS/W;

    invoke-static {p1}, LS/W;->b(LS/W;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public b(I)I
    .locals 1

    .prologue
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->c(LS/W;)I

    move-result v0

    if-ge p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->d(LS/W;)I

    move-result v0

    if-ge p1, v0, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, LS/W$a;->b:LS/W;

    invoke-static {v0}, LS/W;->b(LS/W;)I

    move-result v0

    if-gt p1, v0, :cond_2

    :goto_0
    add-int/lit8 p1, p1, 0x2

    goto :goto_1

    :cond_2
    iget-object p1, p0, LS/W$a;->b:LS/W;

    invoke-static {p1}, LS/W;->b(LS/W;)I

    move-result p1

    goto :goto_0

    :goto_1
    return p1
.end method
