.class public final Lu/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu/E;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu/h0;->a:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu/x0;)Lu/B0;
    .locals 0

    invoke-virtual {p0, p1}, Lu/h0;->a(Lu/x0;)Lu/F0;

    move-result-object p1

    return-object p1
.end method

.method public a(Lu/x0;)Lu/F0;
    .locals 1

    new-instance p1, Lu/N0;

    iget v0, p0, Lu/h0;->a:I

    invoke-direct {p1, v0}, Lu/N0;-><init>(I)V

    return-object p1
.end method

.method public bridge synthetic a(Lu/x0;)Lu/H0;
    .locals 0

    invoke-virtual {p0, p1}, Lu/h0;->a(Lu/x0;)Lu/F0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    instance-of v0, p1, Lu/h0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lu/h0;

    iget p1, p1, Lu/h0;->a:I

    iget v0, p0, Lu/h0;->a:I

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lu/h0;->a:I

    return v0
.end method
