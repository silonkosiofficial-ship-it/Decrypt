.class public final LA/b$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:F


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/i;->q(F)F

    move-result v0

    iput v0, p0, LA/b$h;->a:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, LA/b$h;->a:F

    return v0
.end method

.method public b(LY0/e;I[I[I)V
    .locals 1

    sget-object p1, LA/b;->a:LA/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, p4, v0}, LA/b;->l(I[I[IZ)V

    return-void
.end method

.method public c(LY0/e;I[ILY0/v;[I)V
    .locals 0

    .prologue
    sget-object p1, LY0/v;->C:LY0/v;

    if-ne p4, p1, :cond_0

    sget-object p1, LA/b;->a:LA/b;

    const/4 p4, 0x0

    :goto_0
    invoke-virtual {p1, p2, p3, p5, p4}, LA/b;->l(I[I[IZ)V

    goto :goto_1

    :cond_0
    sget-object p1, LA/b;->a:LA/b;

    const/4 p4, 0x1

    goto :goto_0

    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Arrangement#SpaceBetween"

    return-object v0
.end method
