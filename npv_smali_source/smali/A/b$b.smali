.class public final LA/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/b$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA/b;
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
.method public synthetic a()F
    .locals 1

    invoke-static {p0}, LA/d;->a(LA/b$m;)F

    move-result v0

    return v0
.end method

.method public b(LY0/e;I[I[I)V
    .locals 1

    sget-object p1, LA/b;->a:LA/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, p4, v0}, LA/b;->j(I[I[IZ)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Arrangement#Bottom"

    return-object v0
.end method
