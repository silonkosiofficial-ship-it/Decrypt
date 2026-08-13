.class public final Lx/f$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(FFF)F
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lx/e;->a(Lx/f;FFF)F

    move-result p1

    return p1
.end method

.method public synthetic b()Lu/j;
    .locals 1

    invoke-static {p0}, Lx/e;->b(Lx/f;)Lu/j;

    move-result-object v0

    return-object v0
.end method
